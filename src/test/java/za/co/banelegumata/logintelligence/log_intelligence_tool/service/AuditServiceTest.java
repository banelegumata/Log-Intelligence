package za.co.banelegumata.logintelligence.log_intelligence_tool.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import za.co.banelegumata.logintelligence.log_intelligence_tool.audit.AuditAction;
import za.co.banelegumata.logintelligence.log_intelligence_tool.model.AuditLogEntity;
import za.co.banelegumata.logintelligence.log_intelligence_tool.repository.AuditLogRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class AuditServiceTest {

    @Mock
    private AuditLogRepository auditLogRepository;
    @InjectMocks
    private AuditService auditService;

    @Test

    void shouldSaveAuditLog() {
        auditService.logAudit(
                AuditAction.LOGIN,
                "Banele",
                "Application Startup Test",
                "Success",
                "Localhost");

        ArgumentCaptor<AuditLogEntity> capture = ArgumentCaptor.forClass(AuditLogEntity.class);

        verify(auditLogRepository).save(capture.capture());

        AuditLogEntity savedAuditLog = capture.getValue();

        assertEquals("LOGIN",savedAuditLog.getAction());
        assertEquals("Banele",savedAuditLog.getUsername());
        assertEquals("Application Startup Test", savedAuditLog.getDetails());
        assertEquals("Success",savedAuditLog.getStatus());
        assertEquals("Localhost",savedAuditLog.getServerName());
    }
}
