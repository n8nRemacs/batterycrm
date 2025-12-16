package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import Lw.c;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction;
import com.avito.android.util.P2;
import dx.C39813a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: RealtyAgencySearchReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LLw/c;", "invoke", "()LLw/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class T extends kotlin.jvm.internal.N implements Y41.a<Lw.c> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Lw.c f138771l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RealtyAgencySearchInternalAction.DevelopmentsLoading f138772m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(Lw.c cVar, RealtyAgencySearchInternalAction.DevelopmentsLoading developmentsLoading) {
        super(0);
        this.f138771l = cVar;
        this.f138772m = developmentsLoading;
    }

    @Override // Y41.a
    public final Lw.c invoke() {
        Lw.c cVar = this.f138771l;
        c.g gVar = cVar.f10241e;
        Tab tab = Tab.f138450c;
        RealtyAgencySearchInternalAction.DevelopmentsLoading.Loaded loaded = (RealtyAgencySearchInternalAction.DevelopmentsLoading.Loaded) this.f138772m;
        Long lValueOf = Long.valueOf(loaded.f138837b.getDevelopmentsCount());
        C39813a c39813a = loaded.f138837b;
        c.g gVarA = c.g.a(gVar, tab, lValueOf, Long.valueOf(c39813a.getLotsCount()), 2);
        P2.b bVar = new P2.b(c39813a);
        c.C0649c c0649c = cVar.f10243g;
        ArrayList arrayListI0 = C42745f0.i0(c39813a, c0649c.f10254b);
        c0649c.getClass();
        return Lw.c.a(cVar, null, null, null, gVarA, null, new c.C0649c(bVar, arrayListI0), null, false, null, null, 983);
    }
}
