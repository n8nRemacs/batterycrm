package com.avito.android.comfortable_deal.contract_sign;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ContentDrawTracking.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "com/avito/android/analytics/screens/compose/d", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class s extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.d, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.screens.mvi.r f120897l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.screens.compose.a f120898m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.avito.android.analytics.screens.mvi.r rVar, com.avito.android.analytics.screens.compose.a aVar) {
        super(1);
        this.f120897l = rVar;
        this.f120898m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
        dVar.y1();
        com.avito.android.analytics.screens.compose.a aVar = this.f120898m;
        com.avito.android.analytics.screens.mvi.r rVar = this.f120897l;
        if (rVar != null) {
            aVar.n(rVar.f90666a, rVar.f90667b, null);
        }
        aVar.f();
        return G0.f406611a;
    }
}
