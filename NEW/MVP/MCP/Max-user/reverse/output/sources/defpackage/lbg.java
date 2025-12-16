package defpackage;

/* loaded from: classes.dex */
public enum lbg {
    client_hello(1),
    server_hello(2),
    new_session_ticket(4),
    /* JADX INFO: Fake field, exist only in values array */
    end_of_early_data(5),
    encrypted_extensions(8),
    certificate(11),
    certificate_request(13),
    certificate_verify(15),
    finished(20),
    /* JADX INFO: Fake field, exist only in values array */
    key_update(24),
    /* JADX INFO: Fake field, exist only in values array */
    message_hash(254);

    public final byte a;

    lbg(int i) {
        this.a = (byte) i;
    }
}
