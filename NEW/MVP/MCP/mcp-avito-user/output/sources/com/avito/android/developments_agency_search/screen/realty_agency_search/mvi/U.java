package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import Lw.c;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: RealtyAgencySearchReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LLw/c;", "invoke", "()LLw/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class U extends kotlin.jvm.internal.N implements Y41.a<Lw.c> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Lw.c f138773l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RealtyAgencySearchInternalAction.DevelopmentsLoading f138774m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(Lw.c cVar, RealtyAgencySearchInternalAction.DevelopmentsLoading developmentsLoading) {
        super(0);
        this.f138773l = cVar;
        this.f138774m = developmentsLoading;
    }

    @Override // Y41.a
    public final Lw.c invoke() {
        Lw.c cVar = this.f138773l;
        return Lw.c.a(cVar, null, null, null, c.g.a(cVar.f10241e, Tab.f138450c, null, null, 14), null, new c.C0649c(new P2.a(com.avito.android.error.z.n(((RealtyAgencySearchInternalAction.DevelopmentsLoading.LoadingError) this.f138774m).f138839b)), cVar.f10243g.f10254b), null, false, null, null, 983);
    }
}
