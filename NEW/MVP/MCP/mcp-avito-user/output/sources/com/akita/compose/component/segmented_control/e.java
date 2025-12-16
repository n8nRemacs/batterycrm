package com.akita.compose.component.segmented_control;

import androidx.compose.animation.core.G1;
import androidx.compose.runtime.I3;
import androidx.compose.ui.graphics.k1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.C43522a;
import l0.g;
import l0.n;

/* compiled from: SegmentedControlIndicator.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f62548l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f62549m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I3<Float> f62550n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I3<Float> f62551o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(float f12, long j12, I3 i32, I3 i33) {
        super(1);
        this.f62548l = j12;
        this.f62549m = f12;
        this.f62550n = i32;
        this.f62551o = i33;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        k1 k1Var = new k1(this.f62548l, null);
        G1 g12 = g.f62557a;
        g.a aVar = l0.g.f413384b;
        float fFloatValue = this.f62551o.getF42167b().floatValue();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar2.i() & 4294967295L));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(fFloatValue) << 32);
        n.a aVar2 = l0.n.f413402b;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(gVar2.M0(this.f62549m));
        C43522a.C11768a c11768a = C43522a.f413378b;
        androidx.compose.ui.graphics.drawscope.g.Z0(gVar2, k1Var, (Float.floatToRawIntBits(this.f62550n.getF42167b().floatValue()) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), jFloatToRawIntBits, (4294967295L & Float.floatToRawIntBits(r8)) | (jFloatToRawIntBits2 << 32), null, 240);
        return G0.f406611a;
    }
}
