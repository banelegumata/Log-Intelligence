package za.co.banelegumata.logintelligence.log_intelligence_tool.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import za.co.banelegumata.logintelligence.log_intelligence_tool.audit.AuditAction;
import za.co.banelegumata.logintelligence.log_intelligence_tool.model.AuditLogEntity;
import za.co.banelegumata.logintelligence.log_intelligence_tool.repository.AuditLogRepository;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AuditService {
    private final AuditLogRepository auditLogRepository;

    public void logAudit(
            AuditAction action,
            String username,
            String details,
            String status,
            String serverName){
        AuditLogEntity auditLog = new AuditLogEntity();
        auditLog.setAction(action.name());
        auditLog.setUsername(username);
        auditLog.setStatus(status);
        auditLog.setDetails(details);
        auditLog.setServerName(serverName);
        auditLog.setCreatedDate(LocalDateTime.now());

        auditLogRepository.save(auditLog);

        }
    }
