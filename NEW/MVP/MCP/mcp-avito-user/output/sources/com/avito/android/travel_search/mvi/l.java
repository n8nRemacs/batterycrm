package com.avito.android.travel_search.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.travel_search.mvi.entity.TravelSearchInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import vF0.f;

/* compiled from: TravelSearchOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/travel_search/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction;", "LvF0/f;", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements t<TravelSearchInternalAction, vF0.f> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final vF0.f b(TravelSearchInternalAction travelSearchInternalAction) {
        TravelSearchInternalAction travelSearchInternalAction2 = travelSearchInternalAction;
        if (travelSearchInternalAction2 instanceof TravelSearchInternalAction.InitInlineFilters) {
            return new f.c(((TravelSearchInternalAction.InitInlineFilters) travelSearchInternalAction2).f303165b);
        }
        if (travelSearchInternalAction2 instanceof TravelSearchInternalAction.OpenInlineFilter) {
            TravelSearchInternalAction.OpenInlineFilter openInlineFilter = (TravelSearchInternalAction.OpenInlineFilter) travelSearchInternalAction2;
            return new f.d(openInlineFilter.f303168c, openInlineFilter.f303167b);
        }
        if (travelSearchInternalAction2 instanceof TravelSearchInternalAction.HandleDeeplink) {
            TravelSearchInternalAction.HandleDeeplink handleDeeplink = (TravelSearchInternalAction.HandleDeeplink) travelSearchInternalAction2;
            return new f.b(handleDeeplink.f303163c, handleDeeplink.f303162b, handleDeeplink.f303164d);
        }
        if (travelSearchInternalAction2 instanceof TravelSearchInternalAction.CloseScreen) {
            return f.a.f440598a;
        }
        return null;
    }
}
