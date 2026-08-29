package za.co.banelegumata.logintelligence.log_intelligence_tool.audit;

public enum AuditAction {
    LOGIN,
    LOGOUT,

    SEARCH_TRACE,
    SEARCH_UCN,
    SEARCH_MSISDN,

    SSH_CONNECT,
    SSH_DISCONNECT,

    EXPORT_CSV,

    INVESTIGATION_CREATED
}
