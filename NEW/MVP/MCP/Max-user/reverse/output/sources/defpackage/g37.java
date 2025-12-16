package defpackage;

import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public interface g37 {
    public static final e37 a = e37.a;

    default boolean a() {
        return true;
    }

    default void b() {
    }

    default Comparator c() {
        a.getClass();
        return e37.b;
    }

    default d93 d(long j) {
        return k4j.e(j, j());
    }

    default Comparator e() {
        a.getClass();
        return e37.c;
    }

    default d93 f(long j) {
        return k4j.f(j, j());
    }

    long g();

    long h();

    default long i() {
        return -1L;
    }

    List j();
}
