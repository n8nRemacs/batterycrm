package com.avito.android.travel_search.mvi;

import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilters;
import com.avito.android.remote.model.search.Result;
import com.avito.android.serp.i;
import com.avito.android.travel_search.TravelSearchOpenParams;
import com.avito.android.travel_search.mvi.entity.TravelSearchInternalAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import vF0.InterfaceC49207b;
import vF0.d;

/* compiled from: TravelSearchReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LvF0/g;", VoiceInfo.STATE, "invoke", "(LvF0/g;)LvF0/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class n extends N implements Y41.l<vF0.g, vF0.g> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TravelSearchInternalAction f303193l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f303194m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(TravelSearchInternalAction travelSearchInternalAction, o oVar) {
        super(1);
        this.f303193l = travelSearchInternalAction;
        this.f303194m = oVar;
    }

    @Override // Y41.l
    public final vF0.g invoke(vF0.g gVar) {
        List<Filter> filters;
        Result result;
        Result result2;
        vF0.g gVar2 = gVar;
        TravelSearchInternalAction travelSearchInternalAction = this.f303193l;
        if (travelSearchInternalAction instanceof TravelSearchInternalAction.InitState) {
            TravelSearchOpenParams travelSearchOpenParams = ((TravelSearchInternalAction.InitState) travelSearchInternalAction).f303166b;
            return vF0.g.a(gVar2, travelSearchOpenParams.f302764b, travelSearchOpenParams.f302765c, null, false, null, null, null, null, null, null, null, 4092);
        }
        if (travelSearchInternalAction instanceof TravelSearchInternalAction.ContentLoaded) {
            o oVar = this.f303194m;
            List listA = i.a.a(oVar.f303197d, oVar.f303196c.a(((TravelSearchInternalAction.ContentLoaded) travelSearchInternalAction).f303150b.a()), SerpDisplayType.Rich, null, null, false, null, 124);
            return vF0.g.a(gVar2, null, null, listA, listA.isEmpty(), InterfaceC49207b.d.f440576b, null, null, null, null, null, null, 4067);
        }
        if (travelSearchInternalAction instanceof TravelSearchInternalAction.ContentError) {
            return vF0.g.a(gVar2, null, null, null, false, new InterfaceC49207b.C12754b(((TravelSearchInternalAction.ContentError) travelSearchInternalAction).f303146b), null, null, null, null, null, null, 4079);
        }
        if (travelSearchInternalAction instanceof TravelSearchInternalAction.ContentLoading) {
            return vF0.g.a(gVar2, null, null, null, false, InterfaceC49207b.c.f440575b, null, null, null, null, null, null, 4079);
        }
        if (!(travelSearchInternalAction instanceof TravelSearchInternalAction.FiltersLoaded)) {
            return travelSearchInternalAction instanceof TravelSearchInternalAction.FiltersError ? vF0.g.a(gVar2, null, null, null, false, null, null, null, new d.b(((TravelSearchInternalAction.FiltersError) travelSearchInternalAction).f303154b), null, null, null, 3775) : travelSearchInternalAction instanceof TravelSearchInternalAction.FiltersLoading ? vF0.g.a(gVar2, null, null, null, false, null, null, null, d.c.f440589b, null, null, null, 3839) : travelSearchInternalAction instanceof TravelSearchInternalAction.UpdateSearchParams ? vF0.g.a(gVar2, ((TravelSearchInternalAction.UpdateSearchParams) travelSearchInternalAction).f303169b, null, null, false, null, null, null, null, null, null, null, 4094) : gVar2;
        }
        TravelSearchInternalAction.FiltersLoaded filtersLoaded = (TravelSearchInternalAction.FiltersLoaded) travelSearchInternalAction;
        InlineFilters inlineFilters = filtersLoaded.f303158b;
        if (inlineFilters == null || (result2 = inlineFilters.getResult()) == null || (filters = result2.getFilters()) == null) {
            filters = C42784z0.f406748b;
        }
        List<Filter> list = filters;
        InlineFilters inlineFilters2 = filtersLoaded.f303158b;
        return vF0.g.a(gVar2, null, null, null, false, null, null, list, d.C12756d.f440590b, null, (inlineFilters2 == null || (result = inlineFilters2.getResult()) == null) ? null : result.getHeader(), null, 2623);
    }
}
