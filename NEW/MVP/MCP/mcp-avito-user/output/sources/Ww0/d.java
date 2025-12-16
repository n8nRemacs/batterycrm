package wW0;

/* compiled from: NoOpMemoryTrimmableRegistry.java */
/* loaded from: classes5.dex */
public class d implements c {

    /* renamed from: b, reason: collision with root package name */
    public static d f441519b;

    public static synchronized d a() {
        try {
            if (f441519b == null) {
                f441519b = new d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f441519b;
    }

    @Override // wW0.c
    public final void b(b bVar) {
    }
}
