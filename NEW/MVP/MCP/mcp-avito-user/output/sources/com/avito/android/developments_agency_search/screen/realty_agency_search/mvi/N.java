package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import Lw.c;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: RealtyAgencySearchReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LLw/c;", "invoke", "()LLw/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class N extends kotlin.jvm.internal.N implements Y41.a<Lw.c> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RealtyAgencySearchInternalAction f138761l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Lw.c f138762m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Lw.c cVar, RealtyAgencySearchInternalAction realtyAgencySearchInternalAction) {
        super(0);
        this.f138761l = realtyAgencySearchInternalAction;
        this.f138762m = cVar;
    }

    @Override // Y41.a
    public final Lw.c invoke() {
        c.C0649c c0649c;
        RealtyAgencySearchInternalAction.UpdateSelectedTab updateSelectedTab = (RealtyAgencySearchInternalAction.UpdateSelectedTab) this.f138761l;
        Tab tab = updateSelectedTab.f138893b;
        Tab tab2 = Tab.f138450c;
        Lw.c cVar = this.f138762m;
        if (tab == tab2) {
            c.C0649c c0649c2 = cVar.f10243g;
            P2.c cVar2 = P2.c.f318721a;
            C42784z0 c42784z0 = C42784z0.f406748b;
            c0649c2.getClass();
            c0649c = new c.C0649c(cVar2, c42784z0);
        } else {
            c0649c = cVar.f10243g;
        }
        c.C0649c c0649c3 = c0649c;
        Tab tab3 = Tab.f138451d;
        Tab tab4 = updateSelectedTab.f138893b;
        return Lw.c.a(this.f138762m, null, null, null, c.g.a(cVar.f10241e, tab4, null, null, 14), null, c0649c3, tab4 == tab3 ? c.e.a(cVar.f10244h, P2.c.f318721a, C42784z0.f406748b, 4) : cVar.f10244h, false, null, null, 919);
    }
}
