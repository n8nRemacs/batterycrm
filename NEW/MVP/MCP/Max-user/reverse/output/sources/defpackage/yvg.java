package defpackage;

/* loaded from: classes2.dex */
public enum yvg {
    CONNECTION_STATE_INVALID_SET("cs_i_set"),
    CONNECTION_WRONG_STATE_INIT("cs_w_i"),
    CONNECTION_WRONG_STATE_CONNECTED("cs_w_c"),
    CONNECTION_WRONG_STATE_WAITING_FOR_CONNECT("cs_w_wfc"),
    CONNECTION_WRONG_STATE_IN_READY_FOR_READ("cs_w_irfr"),
    CONNECTION_WRONG_STATE_IN_READY_FOR_WRITE("cs_w_irfw"),
    CONNECTION_UPLOAD_STATUS_IS_NULL("c_us_n"),
    CONNECTION_UPLOAD_STATUS_IS_NOT_NULL("c_us_nn"),
    CONNECTION_UPLOAD_CHUNK_IS_NULL("c_uc_n"),
    TLS_WRONG_HANDSHAKE_STATUS_1("t_whs_1"),
    TLS_WRONG_HANDSHAKE_STATUS_2("t_whs_2"),
    TLS_WRONG_HANDSHAKE_STATUS_3("t_whs_3"),
    TLS_WRONG_HANDSHAKE_STATUS_4("t_whs_4"),
    TLS_WRONG_HANDSHAKE_STATUS_5("t_whs_5"),
    TLS_WRONG_HANDSHAKE_STATUS_6("t_whs_6");

    public final String a;

    yvg(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
