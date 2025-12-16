package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.C20283h;
import androidx.compose.animation.core.C20310q;
import androidx.compose.animation.core.G1;
import androidx.compose.animation.core.Q;
import androidx.compose.foundation.C20835r0;
import androidx.compose.foundation.H;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.I3;
import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.C22315w;
import androidx.compose.ui.graphics.J0;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PullRefreshIndicator.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "showElevation", "", "targetAlpha", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final float f33945a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.foundation.shape.n f33946b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f33947c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f33948d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f33949e;

    /* renamed from: f, reason: collision with root package name */
    public static final float f33950f;

    /* renamed from: g, reason: collision with root package name */
    public static final float f33951g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final G1<Float> f33952h;

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f33945a = 40;
        f33946b = androidx.compose.foundation.shape.o.f30153a;
        f33947c = (float) 7.5d;
        f33948d = (float) 2.5d;
        f33949e = 10;
        f33950f = 5;
        f33951g = 6;
        f33952h = C20310q.e(300, 0, Q.f26124d, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.material.InterfaceC21154e4
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r22, @Y61.k androidx.compose.material.pullrefresh.t r23, @Y61.l androidx.compose.ui.v r24, long r25, long r27, @Y61.l androidx.compose.runtime.A r29, int r30) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.pullrefresh.j.a(boolean, androidx.compose.material.pullrefresh.t, androidx.compose.ui.v, long, long, androidx.compose.runtime.A, int):void");
    }

    public static final void b(t tVar, long j12, androidx.compose.ui.v vVar, A a12, int i12) {
        int i13;
        int i14;
        B bE2 = a12.E(-486016981);
        if ((i12 & 6) == 0) {
            i13 = (bE2.u(tVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.n(j12) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.B(vVar) ? 256 : 128;
        }
        if (bE2.p(i13 & 1, (i13 & 147) != 146)) {
            Object objT = bE2.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            Object obj = objT;
            if (objT == c1651a) {
                C22277p c22277pA = C22315w.a();
                J0.f39288b.getClass();
                c22277pA.l(J0.f39289c);
                bE2.H(c22277pA);
                obj = c22277pA;
            }
            Path path = (Path) obj;
            boolean zB2 = bE2.B(tVar);
            Object objT2 = bE2.t();
            if (zB2 || objT2 == c1651a) {
                objT2 = C22126m3.d(new f(tVar));
                bE2.H(objT2);
            }
            I3 i3B = C20283h.b(((Number) ((I3) objT2).getF42167b()).floatValue(), f33952h, null, bE2, 48, 28);
            androidx.compose.ui.v vVarB = androidx.compose.ui.semantics.r.b(vVar, false, c.f33926l);
            boolean zU2 = bE2.u(tVar) | bE2.B(i3B) | ((i13 & 112) == 32) | bE2.u(path);
            Object objT3 = bE2.t();
            if (zU2 || objT3 == c1651a) {
                i14 = 0;
                objT3 = new d(tVar, i3B, j12, path);
                bE2.H(objT3);
            } else {
                i14 = 0;
            }
            C20835r0.a(i14, (Y41.l) objT3, bE2, vVarB);
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(tVar, j12, vVar, i12);
        }
    }

    public static final void c(androidx.compose.ui.graphics.drawscope.g gVar, Path path, l0.j jVar, long j12, float f12, a aVar) {
        path.reset();
        path.i(0.0f, 0.0f);
        float f13 = f33949e;
        float fM02 = gVar.M0(f13);
        float f14 = aVar.f33922b;
        path.r(fM02 * f14, 0.0f);
        path.r((gVar.M0(f13) * f14) / 2, gVar.M0(f33950f) * f14);
        path.e(l0.h.a((l0.g.g(jVar.f()) + (Math.min(jVar.f413392c - jVar.f413390a, jVar.f413393d - jVar.f413391b) / 2.0f)) - ((gVar.M0(f13) * f14) / 2.0f), (gVar.M0(f33948d) / 2.0f) + l0.g.h(jVar.f())));
        path.close();
        float f15 = aVar.f33921a;
        long jV1 = gVar.v1();
        a.b f39478c = gVar.getF39478c();
        long jE2 = f39478c.e();
        f39478c.a().k();
        try {
            f39478c.f39485a.d(jV1, f15);
            androidx.compose.ui.graphics.drawscope.g.n0(gVar, path, j12, f12, null, 56);
        } finally {
            H.C(f39478c, jE2);
        }
    }
}
