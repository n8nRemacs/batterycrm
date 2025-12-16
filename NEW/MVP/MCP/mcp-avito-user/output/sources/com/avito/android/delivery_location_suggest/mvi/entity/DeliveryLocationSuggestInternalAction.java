package com.avito.android.delivery_location_suggest.mvi.entity;

import AK.c;
import Fv.C13838a;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import com.avito.conveyor_item.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryLocationSuggestInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/delivery_location_suggest/mvi/entity/DeliveryLocationSuggestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "QueryChanged", "SearchFailed", "SuggestSelected", "SuggestionsLoaded", "Lcom/avito/android/delivery_location_suggest/mvi/entity/DeliveryLocationSuggestInternalAction$QueryChanged;", "Lcom/avito/android/delivery_location_suggest/mvi/entity/DeliveryLocationSuggestInternalAction$SearchFailed;", "Lcom/avito/android/delivery_location_suggest/mvi/entity/DeliveryLocationSuggestInternalAction$SuggestSelected;", "Lcom/avito/android/delivery_location_suggest/mvi/entity/DeliveryLocationSuggestInternalAction$SuggestionsLoaded;", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface DeliveryLocationSuggestInternalAction extends n {

    /* compiled from: DeliveryLocationSuggestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_location_suggest/mvi/entity/DeliveryLocationSuggestInternalAction$QueryChanged;", "Lcom/avito/android/delivery_location_suggest/mvi/entity/DeliveryLocationSuggestInternalAction;", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class QueryChanged implements DeliveryLocationSuggestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f135168b;

        public QueryChanged(@k String str) {
            this.f135168b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QueryChanged) && L.f(this.f135168b, ((QueryChanged) obj).f135168b);
        }

        public final int hashCode() {
            return this.f135168b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("QueryChanged(query="), this.f135168b, ')');
        }
    }

    /* compiled from: DeliveryLocationSuggestInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_location_suggest/mvi/entity/DeliveryLocationSuggestInternalAction$SearchFailed;", "Lcom/avito/android/delivery_location_suggest/mvi/entity/DeliveryLocationSuggestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchFailed implements DeliveryLocationSuggestInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f135169b;

        public SearchFailed(@k ApiError apiError) {
            this.f135169b = apiError;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211747d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchFailed) && L.f(this.f135169b, ((SearchFailed) obj).f135169b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF118027c() {
            return new J.a(this.f135169b);
        }

        public final int hashCode() {
            return this.f135169b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("SearchFailed(error="), this.f135169b, ')');
        }
    }

    /* compiled from: DeliveryLocationSuggestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_location_suggest/mvi/entity/DeliveryLocationSuggestInternalAction$SuggestSelected;", "Lcom/avito/android/delivery_location_suggest/mvi/entity/DeliveryLocationSuggestInternalAction;", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SuggestSelected implements DeliveryLocationSuggestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C13838a f135170b;

        public SuggestSelected(@k C13838a c13838a) {
            this.f135170b = c13838a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuggestSelected) && L.f(this.f135170b, ((SuggestSelected) obj).f135170b);
        }

        public final int hashCode() {
            return this.f135170b.hashCode();
        }

        @k
        public final String toString() {
            return "SuggestSelected(selectedSuggest=" + this.f135170b + ')';
        }
    }

    /* compiled from: DeliveryLocationSuggestInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_location_suggest/mvi/entity/DeliveryLocationSuggestInternalAction$SuggestionsLoaded;", "Lcom/avito/android/delivery_location_suggest/mvi/entity/DeliveryLocationSuggestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SuggestionsLoaded implements DeliveryLocationSuggestInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<a> f135171b;

        /* JADX WARN: Multi-variable type inference failed */
        public SuggestionsLoaded(@k List<? extends a> list) {
            this.f135171b = list;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211747d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuggestionsLoaded) && L.f(this.f135171b, ((SuggestionsLoaded) obj).f135171b);
        }

        public final int hashCode() {
            return this.f135171b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("SuggestionsLoaded(items="), this.f135171b, ')');
        }
    }
}
