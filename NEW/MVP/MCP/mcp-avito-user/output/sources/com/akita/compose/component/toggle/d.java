package com.akita.compose.component.toggle;

import androidx.compose.animation.core.C20288i1;
import androidx.compose.runtime.I3;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.graphics.m1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import l0.C43522a;
import l0.g;
import l0.n;

/* compiled from: CheckToggle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f63334l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f63335m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Path f63336n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I3<T> f63337o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ I3<T> f63338p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ I3<T> f63339q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C20288i1.d f63340r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C20288i1.d f63341s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C20288i1.d f63342t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(float f12, float f13, Path path, I3 i32, I3 i33, I3 i34, C20288i1.d dVar, C20288i1.d dVar2, C20288i1.d dVar3) {
        super(1);
        this.f63334l = f12;
        this.f63335m = f13;
        this.f63336n = path;
        this.f63337o = i32;
        this.f63338p = i33;
        this.f63339q = i34;
        this.f63340r = dVar;
        this.f63341s = dVar2;
        this.f63342t = dVar3;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        float f12 = j.f63366a;
        long j12 = this.f63337o.getF42167b().f39331a;
        long j13 = this.f63338p.getF42167b().f39331a;
        float fM02 = gVar2.M0(this.f63334l);
        float fFloor = (float) Math.floor(gVar2.M0(this.f63335m));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar2.i() >> 32));
        int i12 = 2;
        if (T.d(j12, j13)) {
            long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
            n.a aVar = l0.n.f413402b;
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fM02);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fM02) & 4294967295L;
            C43522a.C11768a c11768a = C43522a.f413378b;
            androidx.compose.ui.graphics.drawscope.g.d1(gVar2, j12, 0L, jFloatToRawIntBits, jFloatToRawIntBits3 | (jFloatToRawIntBits2 << 32), androidx.compose.ui.graphics.drawscope.n.f39497a, 0.0f, 226);
        } else {
            float f13 = fFloor / 2.0f;
            androidx.compose.ui.graphics.drawscope.o oVar = new androidx.compose.ui.graphics.drawscope.o(fFloor, 0.0f, 0, 0, null, 30, null);
            g.a aVar2 = l0.g.f413384b;
            float f14 = fIntBitsToFloat - (2 * fFloor);
            long jFloatToRawIntBits4 = (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L);
            n.a aVar3 = l0.n.f413402b;
            float fMax = Math.max(0.0f, fM02 - fFloor);
            long jFloatToRawIntBits5 = (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax) & 4294967295L);
            C43522a.C11768a c11768a2 = C43522a.f413378b;
            i12 = 2;
            androidx.compose.ui.graphics.drawscope.g.d1(gVar2, j12, (Float.floatToRawIntBits(fFloor) << 32) | (Float.floatToRawIntBits(fFloor) & 4294967295L), jFloatToRawIntBits4, jFloatToRawIntBits5, androidx.compose.ui.graphics.drawscope.n.f39497a, 0.0f, 224);
            if (fFloor > 0.0f) {
                androidx.compose.ui.graphics.drawscope.g.d1(gVar2, j13, (Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), (Float.floatToRawIntBits(r24) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat - fFloor) << 32), (Float.floatToRawIntBits(r0) & 4294967295L) | (Float.floatToRawIntBits(fM02 - f13) << 32), oVar, 0.0f, 224);
            }
        }
        long j14 = this.f63339q.getF42167b().f39331a;
        float fFloatValue = ((Number) this.f63340r.getF42167b()).floatValue();
        float fFloatValue2 = ((Number) this.f63341s.getF42167b()).floatValue();
        float fFloatValue3 = ((Number) this.f63342t.getF42167b()).floatValue();
        float fM03 = gVar2.M0(j.f63366a);
        float fM04 = gVar2.M0(j.f63367b);
        m1.f39698b.getClass();
        androidx.compose.ui.graphics.drawscope.o oVar2 = new androidx.compose.ui.graphics.drawscope.o(fM03, 0.0f, m1.f39699c, 0, null, 26, null);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (gVar2.i() >> 32)) - fM04;
        float fB2 = E0.e.b(0.4f, 0.5f, fFloatValue2);
        float fB3 = E0.e.b(0.7f, 0.5f, fFloatValue2);
        float fB4 = E0.e.b(0.5f, 0.5f, fFloatValue2);
        float fB5 = E0.e.b(0.3f, 0.5f, fFloatValue2);
        Path path = this.f63336n;
        path.reset();
        path.i(0.2f * fIntBitsToFloat2, fB4 * fIntBitsToFloat2);
        path.r(fB2 * fIntBitsToFloat2, fB3 * fIntBitsToFloat2);
        path.r(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fB5);
        float f15 = fM04 / i12;
        gVar2.getF39478c().f39485a.f(f15, f15);
        try {
            long jV1 = gVar2.v1();
            a.b f39478c = gVar2.getF39478c();
            long jE2 = f39478c.e();
            f39478c.a().k();
            try {
                f39478c.f39485a.e(fFloatValue, fFloatValue, jV1);
                androidx.compose.ui.graphics.drawscope.g.n0(gVar2, path, j14, fFloatValue3, oVar2, 48);
                float f16 = -f15;
                gVar2.getF39478c().f39485a.f(f16, f16);
                return G0.f406611a;
            } finally {
                f39478c.a().i();
                f39478c.j(jE2);
            }
        } catch (Throwable th2) {
            float f17 = -f15;
            gVar2.getF39478c().f39485a.f(f17, f17);
            throw th2;
        }
    }
}
