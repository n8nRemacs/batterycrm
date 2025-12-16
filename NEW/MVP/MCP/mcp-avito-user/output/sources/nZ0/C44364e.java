package nZ0;

/* compiled from: TrimmedThrowableData.java */
/* renamed from: nZ0.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C44364e {

    /* renamed from: a, reason: collision with root package name */
    public final String f415181a;

    /* renamed from: b, reason: collision with root package name */
    public final String f415182b;

    /* renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f415183c;

    /* renamed from: d, reason: collision with root package name */
    public final C44364e f415184d;

    public C44364e(Throwable th2, C44360a c44360a) {
        this.f415181a = th2.getLocalizedMessage();
        this.f415182b = th2.getClass().getName();
        this.f415183c = c44360a.a(th2.getStackTrace());
        Throwable cause = th2.getCause();
        this.f415184d = cause != null ? new C44364e(cause, c44360a) : null;
    }
}
