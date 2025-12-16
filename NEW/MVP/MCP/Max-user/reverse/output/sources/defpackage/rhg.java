package defpackage;

/* loaded from: classes.dex */
public interface rhg {
    void a(shg shgVar);

    void b();

    void c(shg shgVar);

    default void d(shg shgVar) {
        a(shgVar);
    }

    default void e(shg shgVar) {
        c(shgVar);
    }

    void f();

    void h(shg shgVar);
}
