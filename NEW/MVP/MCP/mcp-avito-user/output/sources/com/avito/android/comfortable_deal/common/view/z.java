package com.avito.android.comfortable_deal.common.view;

import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.C22315w;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Tooltip.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class z extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f120775l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(long j12) {
        super(1);
        this.f120775l = j12;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        C22277p c22277pA = C22315w.a();
        c22277pA.i(Float.intBitsToFloat((int) (gVar2.i() >> 32)) / 2, 0.0f);
        c22277pA.r(Float.intBitsToFloat((int) (gVar2.i() >> 32)), Float.intBitsToFloat((int) (gVar2.i() & 4294967295L)));
        c22277pA.r(0.0f, Float.intBitsToFloat((int) (gVar2.i() & 4294967295L)));
        c22277pA.close();
        androidx.compose.ui.graphics.drawscope.g.n0(gVar2, c22277pA, this.f120775l, 0.0f, null, 60);
        return G0.f406611a;
    }
}
