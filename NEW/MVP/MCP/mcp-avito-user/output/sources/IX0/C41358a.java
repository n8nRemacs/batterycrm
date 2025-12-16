package iX0;

/* compiled from: NativeLoader.java */
/* renamed from: iX0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C41358a {

    /* renamed from: a, reason: collision with root package name */
    public static InterfaceC41359b f398547a;

    public static synchronized void a(InterfaceC41359b interfaceC41359b) {
        if (f398547a != null) {
            throw new IllegalStateException("Cannot re-initialize NativeLoader.");
        }
        f398547a = interfaceC41359b;
    }

    public static synchronized void b(InterfaceC41359b interfaceC41359b) {
        synchronized (C41358a.class) {
        }
        if (!(f398547a != null)) {
            a(interfaceC41359b);
        }
    }

    public static boolean c(String str) {
        InterfaceC41359b interfaceC41359b;
        synchronized (C41358a.class) {
            interfaceC41359b = f398547a;
            if (interfaceC41359b == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return interfaceC41359b.a(str);
    }
}
