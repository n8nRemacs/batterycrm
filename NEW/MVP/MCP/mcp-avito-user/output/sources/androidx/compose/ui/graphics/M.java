package androidx.compose.ui.graphics;

import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: Canvas.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/M;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface M {

    /* compiled from: Canvas.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    static void n(M m12, Path path) {
        S.f39317b.getClass();
        m12.h(path, S.f39318c);
    }

    static void o(M m12, l0.j jVar) {
        S.f39317b.getClass();
        m12.r(jVar, S.f39318c);
    }

    void a(@Y61.k InterfaceC22280q0 interfaceC22280q0, long j12, long j13, long j14, long j15, @Y61.k F0 f02);

    void b(float f12, float f13, float f14, float f15, float f16, float f17, @Y61.k F0 f02);

    void c(float f12, float f13, float f14, float f15, int i12);

    void d(@Y61.k InterfaceC22280q0 interfaceC22280q0, @Y61.k F0 f02);

    void e(@Y61.k l0.j jVar, @Y61.k F0 f02);

    void f();

    void g(float f12, float f13);

    void h(@Y61.k Path path, int i12);

    void i();

    void j(long j12, long j13, @Y61.k F0 f02);

    void k();

    void l(@Y61.k float[] fArr);

    void m(float f12, float f13);

    void p(float f12, long j12, @Y61.k F0 f02);

    void q(float f12, float f13, float f14, float f15, @Y61.k F0 f02);

    default void r(@Y61.k l0.j jVar, int i12) {
        c(jVar.f413390a, jVar.f413391b, jVar.f413392c, jVar.f413393d, i12);
    }

    void s();

    void t(@Y61.k ArrayList arrayList, @Y61.k F0 f02);

    void u(float f12);

    void v(@Y61.k Path path, @Y61.k F0 f02);

    void w(float f12, float f13, float f14, float f15, float f16, float f17, @Y61.k F0 f02);
}
