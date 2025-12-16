package defpackage;

import android.os.Looper;

/* loaded from: classes.dex */
public interface k55 {
    public static final h55 a = new h55();

    z45 a(d55 d55Var, hf6 hf6Var);

    default i55 b(d55 d55Var, hf6 hf6Var) {
        return i55.p;
    }

    void c(Looper looper, n4c n4cVar);

    int d(hf6 hf6Var);

    default void prepare() {
    }

    default void release() {
    }
}
