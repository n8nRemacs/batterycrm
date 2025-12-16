package com.avito.android.screens.bbip_private_v2.ui.compose;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ContentDrawTracking.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "com/avito/android/analytics/screens/compose/d", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class B extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.d, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.screens.mvi.r f261130l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.screens.compose.a f261131m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(com.avito.android.analytics.screens.mvi.r rVar, com.avito.android.analytics.screens.compose.a aVar) {
        super(1);
        this.f261130l = rVar;
        this.f261131m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
        dVar.y1();
        com.avito.android.analytics.screens.compose.a aVar = this.f261131m;
        com.avito.android.analytics.screens.mvi.r rVar = this.f261130l;
        if (rVar != null) {
            aVar.n(rVar.f90666a, rVar.f90667b, null);
        }
        aVar.f();
        return G0.f406611a;
    }
}
