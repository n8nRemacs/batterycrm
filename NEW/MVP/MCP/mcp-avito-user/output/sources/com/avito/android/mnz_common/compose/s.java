package com.avito.android.mnz_common.compose;

import android.graphics.DashPathEffect;
import androidx.compose.ui.graphics.C22279q;
import androidx.compose.ui.graphics.I0;
import androidx.compose.ui.unit.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.g;

/* compiled from: MnzPriceDescriptionListItem.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class s extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f197947l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f197948m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f197949n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f197950o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(float f12, float f13, int i12, long j12) {
        super(1);
        this.f197947l = f12;
        this.f197948m = i12;
        this.f197949n = f13;
        this.f197950o = j12;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        I0.a aVar = I0.f39285a;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        float[] fArr = {gVar2.M0(1), gVar2.M0(2)};
        aVar.getClass();
        C22279q c22279q = new C22279q(new DashPathEffect(fArr, 0.0f));
        float f12 = this.f197947l - this.f197948m;
        g.a aVar3 = l0.g.f413384b;
        androidx.compose.ui.graphics.drawscope.g.G0(gVar2, this.f197950o, (Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (gVar2.i() >> 32))) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L), gVar2.M0(this.f197949n), 0, c22279q, 0, 464);
        return G0.f406611a;
    }
}
