package defpackage;

/* loaded from: classes2.dex */
public final class rh8 extends Error {
    public final String a;

    public rh8(String str, boolean z) {
        super(str, null);
        this.a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }

    public rh8(String str) {
        this(ho7.i("SmsAttemptExceed (Phone: ", str, ")"), false);
    }

    public rh8(String str, Throwable th) {
        this(u45.k(str == null ? "Unspecified" : str, " | ", th != null ? th.getMessage() : null), false);
    }
}
