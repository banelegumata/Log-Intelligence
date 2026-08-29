package za.co.banelegumata.logintelligence.log_intelligence_tool.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "audit_logs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuditLogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String action;

    private String details;

    private String severName;

    private String status;

    private LocalDateTime createdDate;

    @PrePersist
    public void prePersist(){
        this.createdDate = LocalDateTime.now();
    }
}
