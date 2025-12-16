package com.avito.android.realty_agency.inline_filters.location_suggest.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.realty_agency.inline_filters.location_suggest.mvi.entity.LocationSuggestInternalAction;
import javax.inject.Inject;
import ji0.InterfaceC42387b;
import kotlin.Metadata;

/* compiled from: LocationSuggestOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/n;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction;", "Lji0/b;", "<init>", "()V", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n implements t<LocationSuggestInternalAction, InterfaceC42387b> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC42387b b(LocationSuggestInternalAction locationSuggestInternalAction) {
        LocationSuggestInternalAction locationSuggestInternalAction2 = locationSuggestInternalAction;
        if (locationSuggestInternalAction2 instanceof LocationSuggestInternalAction.ShowToast) {
            return new InterfaceC42387b.C11576b(((LocationSuggestInternalAction.ShowToast) locationSuggestInternalAction2).f251699b);
        }
        if (locationSuggestInternalAction2 instanceof LocationSuggestInternalAction.CloseScreenWithSelectedLocation) {
            return new InterfaceC42387b.a(((LocationSuggestInternalAction.CloseScreenWithSelectedLocation) locationSuggestInternalAction2).f251693b);
        }
        return null;
    }
}
