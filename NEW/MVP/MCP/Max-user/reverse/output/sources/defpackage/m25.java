package defpackage;

import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public enum m25 implements lqb {
    CANT_CREATE_OUTPUT_FILE(HttpStatus.SC_SWITCHING_PROTOCOLS),
    MAX_INVALIDATE_COUNT(HttpStatus.SC_PROCESSING),
    URL_EXPIRED_FOR_NON_AUDIO(103),
    MESSAGE_DELETED(104),
    TMP_FAIL_AUDIO(105),
    USER_CANCELLED(106),
    INTERRUPTED_UNKNOWN(107),
    NOT_ENOUGH_SPACE(108),
    BAD_RESPONSE(109),
    ERROR_CREATING_REQUEST(HttpStatus.SC_MULTIPLE_CHOICES),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_FAIL_RESPONSE(HttpStatus.SC_MOVED_PERMANENTLY);

    public final int a;

    m25(int i) {
        this.a = i;
    }

    @Override // defpackage.lqb
    public final int a() {
        return this.a;
    }
}
