package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import Lw.c;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction;
import com.avito.android.util.P2;
import ex.C40174a;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: RealtyAgencySearchReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LLw/c;", "invoke", "()LLw/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class V extends kotlin.jvm.internal.N implements Y41.a<Lw.c> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Lw.c f138775l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RealtyAgencySearchInternalAction.LotsLoading f138776m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(Lw.c cVar, RealtyAgencySearchInternalAction.LotsLoading lotsLoading) {
        super(0);
        this.f138775l = cVar;
        this.f138776m = lotsLoading;
    }

    @Override // Y41.a
    public final Lw.c invoke() {
        Lw.c cVar = this.f138775l;
        c.g gVar = cVar.f10241e;
        Tab tab = Tab.f138451d;
        RealtyAgencySearchInternalAction.LotsLoading.Loaded loaded = (RealtyAgencySearchInternalAction.LotsLoading.Loaded) this.f138776m;
        Long lValueOf = Long.valueOf(loaded.f138844b.getDevelopmentsCount());
        C40174a c40174a = loaded.f138844b;
        c.g gVarA = c.g.a(gVar, tab, lValueOf, Long.valueOf(c40174a.getLotsCount()), 2);
        P2.b bVar = new P2.b(c40174a);
        c.e eVar = cVar.f10244h;
        return Lw.c.a(cVar, null, null, null, gVarA, null, null, c.e.a(eVar, bVar, C42745f0.i0(c40174a, eVar.f10262b), 4), false, null, null, 951);
    }
}
