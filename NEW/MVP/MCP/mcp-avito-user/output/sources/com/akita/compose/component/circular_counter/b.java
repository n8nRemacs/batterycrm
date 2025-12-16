package com.akita.compose.component.circular_counter;

import Y41.l;
import androidx.compose.ui.graphics.drawscope.g;
import androidx.compose.ui.graphics.drawscope.o;
import androidx.compose.ui.graphics.m1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.n;

/* compiled from: CircularCounter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class b extends N implements l<g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f61011l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f61012m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f61013n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f61014o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, long j12, long j13, float f12) {
        super(1);
        this.f61011l = dVar;
        this.f61012m = j12;
        this.f61013n = j13;
        this.f61014o = f12;
    }

    @Override // Y41.l
    public final G0 invoke(g gVar) {
        g gVar2 = gVar;
        d dVar = this.f61011l;
        float fM02 = gVar2.M0(dVar.f61022c);
        m1.f39698b.getClass();
        o oVar = new o(fM02, 0.0f, m1.f39700d, 0, null, 26, null);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar2.i() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (gVar2.i() & 4294967295L));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
        n.a aVar = n.f413402b;
        g.t1(gVar2, this.f61012m, 0.0f, 360.0f, 0L, jFloatToRawIntBits, 0.0f, oVar, 848);
        o oVar2 = new o(gVar2.M0(dVar.f61022c), 0.0f, m1.f39699c, 0, null, 26, null);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (gVar2.i() >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (gVar2.i() & 4294967295L));
        g.t1(gVar2, this.f61013n, 270.0f, this.f61014o, 0L, (Float.floatToRawIntBits(fIntBitsToFloat3) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L), 0.0f, oVar2, 848);
        return G0.f406611a;
    }
}
