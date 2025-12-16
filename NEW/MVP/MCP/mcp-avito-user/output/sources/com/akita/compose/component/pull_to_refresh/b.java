package com.akita.compose.component.pull_to_refresh;

import androidx.compose.ui.graphics.drawscope.o;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.g;
import l0.n;

/* compiled from: PullToRefresh.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class b extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f62412l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f62413m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f62414n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j jVar, o oVar, long j12) {
        super(1);
        this.f62412l = jVar;
        this.f62413m = oVar;
        this.f62414n = j12;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        float f12 = 360;
        float fA2 = (this.f62412l.a() * f12) % f12;
        o oVar = this.f62413m;
        float f13 = oVar.f39499a;
        float f14 = f13 / 2;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar2.i() >> 32)) - f13;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L);
        g.a aVar = l0.g.f413384b;
        n.a aVar2 = l0.n.f413402b;
        androidx.compose.ui.graphics.drawscope.g.t1(gVar2, this.f62414n, fA2, 270.0f, jFloatToRawIntBits, (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), 0.0f, oVar, 832);
        return G0.f406611a;
    }
}
