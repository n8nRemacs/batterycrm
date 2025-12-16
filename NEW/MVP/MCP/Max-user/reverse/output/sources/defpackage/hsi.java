package defpackage;

/* loaded from: classes.dex */
public abstract class hsi {
    public static void a(Object obj, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void d(r29 r29Var) {
        r29Var.getClass();
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void f(Object obj, boolean z) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void g(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void h(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    public static final void p(esg esgVar) {
        esgVar.d(117, new bf8(2));
        esgVar.b(1, new a28(6));
        esgVar.d(611, new bf8(3));
        esgVar.d(612, new bf8(4));
    }

    public abstract void j(int i);

    public abstract boolean k();

    public abstract void l(boolean z);

    public abstract void m(boolean z);

    public abstract void n();

    public abstract void o(int i);
}
