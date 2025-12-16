package defpackage;

import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public enum u6j implements ami {
    NO_ERROR(0),
    /* JADX INFO: Fake field, exist only in values array */
    INCOMPATIBLE_INPUT(1),
    /* JADX INFO: Fake field, exist only in values array */
    INCOMPATIBLE_OUTPUT(2),
    /* JADX INFO: Fake field, exist only in values array */
    INCOMPATIBLE_TFLITE_VERSION(3),
    /* JADX INFO: Fake field, exist only in values array */
    MISSING_OP(4),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_TYPE_ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(7),
    /* JADX INFO: Fake field, exist only in values array */
    TFLITE_UNKNOWN_ERROR(8),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIAPIPE_ERROR(9),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_OUT_FETCHING_MODEL_METADATA(5),
    MODEL_NOT_DOWNLOADED(100),
    /* JADX INFO: Fake field, exist only in values array */
    URI_EXPIRED(HttpStatus.SC_SWITCHING_PROTOCOLS),
    /* JADX INFO: Fake field, exist only in values array */
    NO_NETWORK_CONNECTION(HttpStatus.SC_PROCESSING),
    /* JADX INFO: Fake field, exist only in values array */
    METERED_NETWORK(103),
    /* JADX INFO: Fake field, exist only in values array */
    DOWNLOAD_FAILED(104),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(105),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(106),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(107),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(108),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(109),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(110),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(111),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(112),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(113),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(114),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(115),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(116),
    OPTIONAL_MODULE_NOT_AVAILABLE(HttpStatus.SC_CREATED),
    OPTIONAL_MODULE_INIT_ERROR(HttpStatus.SC_ACCEPTED),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(HttpStatus.SC_NO_CONTENT),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(HttpStatus.SC_RESET_CONTENT),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(HttpStatus.SC_PARTIAL_CONTENT),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(HttpStatus.SC_MULTI_STATUS),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(HttpStatus.SC_MOVED_PERMANENTLY),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(HttpStatus.SC_MOVED_TEMPORARILY),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(HttpStatus.SC_SEE_OTHER),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(HttpStatus.SC_NOT_MODIFIED),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(HttpStatus.SC_USE_PROXY),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(HttpStatus.SC_BAD_REQUEST),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(HttpStatus.SC_UNAUTHORIZED),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(HttpStatus.SC_PAYMENT_REQUIRED),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(HttpStatus.SC_FORBIDDEN),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(HttpStatus.SC_NOT_FOUND),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(HttpStatus.SC_METHOD_NOT_ALLOWED),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(HttpStatus.SC_NOT_ACCEPTABLE),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(500),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(HttpStatus.SC_NOT_IMPLEMENTED),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(600),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(601),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(602),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(603),
    UNKNOWN_ERROR(9999);

    public final int a;

    u6j(int i) {
        this.a = i;
    }

    @Override // defpackage.ami
    public final int d() {
        return this.a;
    }
}
