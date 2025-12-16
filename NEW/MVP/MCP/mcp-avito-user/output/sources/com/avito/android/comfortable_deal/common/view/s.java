package com.avito.android.comfortable_deal.common.view;

import androidx.compose.ui.unit.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.g;

/* compiled from: ExpandedStepsList.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class s extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f120756l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f120757m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f120758n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(long j12, boolean z12, boolean z13) {
        super(1);
        this.f120756l = j12;
        this.f120757m = z12;
        this.f120758n = z13;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        float f12 = u.f120766a / 2;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(gVar2.M0(f12)) << 32) | (Float.floatToRawIntBits(this.f120757m ? gVar2.M0(f12) : 0.0f) & 4294967295L);
        g.a aVar2 = l0.g.f413384b;
        androidx.compose.ui.graphics.drawscope.g.G0(gVar2, this.f120756l, jFloatToRawIntBits, (Float.floatToRawIntBits(gVar2.M0(f12)) << 32) | (Float.floatToRawIntBits(this.f120758n ? gVar2.M0(f12) : Float.intBitsToFloat((int) (gVar2.i() & 4294967295L))) & 4294967295L), gVar2.M0(3), 0, null, 0, 496);
        androidx.compose.ui.graphics.drawscope.g.U(gVar2, this.f120756l, gVar2.M0(f12 - 1), (Float.floatToRawIntBits(gVar2.M0(f12)) << 32) | (Float.floatToRawIntBits(gVar2.M0(f12)) & 4294967295L), 0.0f, null, 0, 120);
        return G0.f406611a;
    }
}
