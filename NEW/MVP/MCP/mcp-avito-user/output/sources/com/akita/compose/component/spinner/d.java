package com.akita.compose.component.spinner;

import Y41.l;
import androidx.compose.animation.core.C20281g0;
import androidx.compose.animation.core.F;
import androidx.compose.ui.graphics.drawscope.o;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.g;
import l0.n;

/* compiled from: Spinner.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements l<androidx.compose.ui.graphics.drawscope.g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f62804l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f62805m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f62806n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C20281g0.a f62807o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C20281g0.a f62808p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C20281g0.a f62809q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C20281g0.a f62810r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(float f12, o oVar, long j12, C20281g0.a aVar, C20281g0.a aVar2, C20281g0.a aVar3, C20281g0.a aVar4) {
        super(1);
        this.f62804l = f12;
        this.f62805m = oVar;
        this.f62806n = j12;
        this.f62807o = aVar;
        this.f62808p = aVar2;
        this.f62809q = aVar3;
        this.f62810r = aVar4;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        F f12 = b.f62792a;
        float fIntValue = (((Number) this.f62807o.getF42167b()).intValue() * this.f62804l) % 360;
        o oVar = this.f62805m;
        float f13 = oVar.f39499a;
        float f14 = f13 / 2;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar2.i() >> 32)) - f13;
        float fFloatValue = ((Number) this.f62808p.getF42167b()).floatValue();
        C20281g0.a aVar = this.f62809q;
        float fMax = Math.max(Math.abs(fFloatValue - ((Number) aVar.getF42167b()).floatValue()), 0.1f);
        float fFloatValue2 = ((Number) this.f62810r.getF42167b()).floatValue() + (-90) + fIntValue + ((Number) aVar.getF42167b()).floatValue();
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L);
        g.a aVar2 = l0.g.f413384b;
        n.a aVar3 = n.f413402b;
        androidx.compose.ui.graphics.drawscope.g.t1(gVar2, this.f62806n, fFloatValue2, fMax, jFloatToRawIntBits, (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), 0.0f, oVar, 832);
        return G0.f406611a;
    }
}
