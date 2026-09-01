package za.co.banelegumata.logintelligence.log_intelligence_tool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.banelegumata.logintelligence.log_intelligence_tool.model.AuditLogEntity;

@Repository
public interface AuditLogRepository extends JpaRepository<AuditLogEntity,Long> {
}
