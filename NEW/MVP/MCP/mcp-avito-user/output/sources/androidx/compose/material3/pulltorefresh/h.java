package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.I3;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.graphics.m1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PullToRefresh.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class h extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Float> f37093l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I3<Float> f37094m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f37095n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Path f37096o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Y41.a<Float> aVar, I3<Float> i32, long j12, Path path) {
        super(1);
        this.f37093l = aVar;
        this.f37094m = i32;
        this.f37095n = j12;
        this.f37096o = path;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        float fFloatValue = this.f37093l.invoke().floatValue();
        float f12 = r.f37101a;
        float fMax = (Math.max(Math.min(1.0f, fFloatValue) - 0.4f, 0.0f) * 5) / 3;
        float f13 = kotlin.ranges.s.f(Math.abs(fFloatValue) - 1.0f, 0.0f, 2.0f);
        float fPow = (((0.4f * fMax) - 0.25f) + (f13 - (((float) Math.pow(f13, 2)) / 4))) * 0.5f;
        float f14 = 360;
        float f15 = fPow * f14;
        float f16 = ((0.8f * fMax) + fPow) * f14;
        float fMin = Math.min(1.0f, fMax);
        float fFloatValue2 = this.f37094m.getF42167b().floatValue();
        long jV1 = gVar2.v1();
        a.b f39478c = gVar2.getF39478c();
        long jE2 = f39478c.e();
        f39478c.a().k();
        f39478c.f39485a.d(jV1, fPow);
        float fM02 = gVar2.M0(r.f37102b);
        float f17 = r.f37101a;
        float fM03 = (gVar2.M0(f17) / 2.0f) + fM02;
        long jB2 = l0.o.b(gVar2.i());
        int i12 = (int) (jB2 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i12) - fM03;
        int i13 = (int) (jB2 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i13) - fM03;
        float fIntBitsToFloat3 = Float.intBitsToFloat(i12) + fM03;
        float fIntBitsToFloat4 = Float.intBitsToFloat(i13) + fM03;
        l0.j jVar = new l0.j(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4);
        long jI2 = jVar.i();
        long jG2 = jVar.g();
        float fM04 = gVar2.M0(f17);
        m1.f39698b.getClass();
        androidx.compose.ui.graphics.drawscope.o oVar = new androidx.compose.ui.graphics.drawscope.o(fM04, 0.0f, 0, 0, null, 26, null);
        long j12 = this.f37095n;
        androidx.compose.ui.graphics.drawscope.g.t1(gVar2, j12, f15, f16 - f15, jI2, jG2, fFloatValue2, oVar, 768);
        Path path = this.f37096o;
        path.reset();
        path.i(0.0f, 0.0f);
        float f18 = r.f37105e;
        path.r((gVar2.M0(f18) * fMin) / 2, gVar2.M0(r.f37106f) * fMin);
        path.r(gVar2.M0(f18) * fMin, 0.0f);
        path.e(l0.h.a((l0.g.g(jVar.f()) + (Math.min(fIntBitsToFloat3 - fIntBitsToFloat, fIntBitsToFloat4 - fIntBitsToFloat2) / 2.0f)) - ((gVar2.M0(f18) * fMin) / 2.0f), l0.g.h(jVar.f()) - gVar2.M0(f17)));
        float fM05 = f16 - gVar2.M0(f17);
        long jV12 = gVar2.v1();
        a.b f39478c2 = gVar2.getF39478c();
        long jE3 = f39478c2.e();
        f39478c2.a().k();
        f39478c2.f39485a.d(jV12, fM05);
        androidx.compose.ui.graphics.drawscope.g.n0(gVar2, path, j12, fFloatValue2, new androidx.compose.ui.graphics.drawscope.o(gVar2.M0(f17), 0.0f, 0, 0, null, 30, null), 48);
        f39478c2.a().i();
        f39478c2.j(jE3);
        f39478c.a().i();
        f39478c.j(jE2);
        return G0.f406611a;
    }
}
