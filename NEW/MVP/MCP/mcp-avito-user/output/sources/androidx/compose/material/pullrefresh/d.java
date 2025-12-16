package androidx.compose.material.pullrefresh;

import androidx.compose.foundation.H;
import androidx.compose.runtime.I3;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.graphics.m1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PullRefreshIndicator.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class d extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f33927l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I3<Float> f33928m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f33929n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Path f33930o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t tVar, I3<Float> i32, long j12, Path path) {
        super(1);
        this.f33927l = tVar;
        this.f33928m = i32;
        this.f33929n = j12;
        this.f33930o = path;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) throws Throwable {
        long j12;
        a.b bVar;
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        t tVar = this.f33927l;
        float fFloatValue = ((Number) tVar.f33970c.getF42167b()).floatValue() / tVar.a();
        float f12 = j.f33945a;
        float fMax = (Math.max(Math.min(1.0f, fFloatValue) - 0.4f, 0.0f) * 5) / 3;
        float fAbs = Math.abs(fFloatValue) - 1.0f;
        float f13 = fAbs >= 0.0f ? fAbs : 0.0f;
        if (f13 > 2.0f) {
            f13 = 2.0f;
        }
        float fPow = (((0.4f * fMax) - 0.25f) + (f13 - (((float) Math.pow(f13, 2)) / 4))) * 0.5f;
        float f14 = 360;
        float f15 = fPow * f14;
        float f16 = ((0.8f * fMax) + fPow) * f14;
        a aVar = new a(fPow, f15, f16, Math.min(1.0f, fMax));
        float fFloatValue2 = this.f33928m.getF42167b().floatValue();
        long j13 = this.f33929n;
        Path path = this.f33930o;
        long jV1 = gVar2.v1();
        a.b f39478c = gVar2.getF39478c();
        long jE2 = f39478c.e();
        f39478c.a().k();
        try {
            f39478c.f39485a.d(jV1, fPow);
            float fM02 = gVar2.M0(j.f33947c);
            float f17 = j.f33948d;
            float fM03 = (gVar2.M0(f17) / 2.0f) + fM02;
            try {
                l0.j jVar = new l0.j(l0.g.g(l0.o.b(gVar2.i())) - fM03, l0.g.h(l0.o.b(gVar2.i())) - fM03, l0.g.g(l0.o.b(gVar2.i())) + fM03, l0.g.h(l0.o.b(gVar2.i())) + fM03);
                float f18 = f16 - f15;
                long jI2 = jVar.i();
                long jG2 = jVar.g();
                float fM04 = gVar2.M0(f17);
                m1.f39698b.getClass();
                bVar = f39478c;
                try {
                    androidx.compose.ui.graphics.drawscope.g.t1(gVar2, j13, f15, f18, jI2, jG2, fFloatValue2, new androidx.compose.ui.graphics.drawscope.o(fM04, 0.0f, m1.f39700d, 0, null, 26, null), 768);
                    j.c(gVar2, path, jVar, j13, fFloatValue2, aVar);
                    H.C(bVar, jE2);
                    return G0.f406611a;
                } catch (Throwable th2) {
                    th = th2;
                    j12 = jE2;
                    H.C(bVar, j12);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bVar = f39478c;
                j12 = jE2;
            }
        } catch (Throwable th4) {
            th = th4;
            j12 = jE2;
            bVar = f39478c;
        }
    }
}
