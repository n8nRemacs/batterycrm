package defpackage;

import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public enum jvg implements lqb {
    UNKNOWN_ATTACH(100),
    ATTACH_OR_MSG_DELETED(HttpStatus.SC_SWITCHING_PROTOCOLS),
    USER_CANCELLED(HttpStatus.SC_PROCESSING),
    ERROR_DURING_CONVERT(200),
    SOURCE_FILE_CHANGED(HttpStatus.SC_MULTIPLE_CHOICES),
    URI_PARAMS_NULL(HttpStatus.SC_MOVED_PERMANENTLY),
    URI_PARAMS_EMPTY(HttpStatus.SC_MOVED_TEMPORARILY),
    UPLOAD_URL_RETRIEVE(HttpStatus.SC_SEE_OTHER),
    CRITICAL_ERROR(HttpStatus.SC_NOT_MODIFIED),
    MESSAGE_DELETED(HttpStatus.SC_BAD_REQUEST);

    public final int a;

    jvg(int i) {
        this.a = i;
    }

    @Override // defpackage.lqb
    public final int a() {
        return this.a;
    }
}
