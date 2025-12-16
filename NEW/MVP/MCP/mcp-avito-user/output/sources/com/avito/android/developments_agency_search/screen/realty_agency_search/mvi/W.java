package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import Lw.c;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: RealtyAgencySearchReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LLw/c;", "invoke", "()LLw/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class W extends kotlin.jvm.internal.N implements Y41.a<Lw.c> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Lw.c f138777l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RealtyAgencySearchInternalAction.LotsLoading f138778m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Lw.c cVar, RealtyAgencySearchInternalAction.LotsLoading lotsLoading) {
        super(0);
        this.f138777l = cVar;
        this.f138778m = lotsLoading;
    }

    @Override // Y41.a
    public final Lw.c invoke() {
        Lw.c cVar = this.f138777l;
        return Lw.c.a(cVar, null, null, null, c.g.a(cVar.f10241e, Tab.f138451d, null, null, 14), null, null, c.e.a(cVar.f10244h, new P2.a(com.avito.android.error.z.n(((RealtyAgencySearchInternalAction.LotsLoading.LoadingError) this.f138778m).f138846b)), null, 6), false, null, null, 951);
    }
}
