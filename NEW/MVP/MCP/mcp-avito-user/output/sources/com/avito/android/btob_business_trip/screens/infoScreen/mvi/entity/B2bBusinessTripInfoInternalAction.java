package com.avito.android.btob_business_trip.screens.infoScreen.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.btob_business_trip.models.OnboardingInfo;
import com.avito.android.btob_business_trip.models.SelectItemsInfo;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: B2bBusinessTripInfoInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/infoScreen/mvi/entity/B2bBusinessTripInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Error", "Loading", "NavigateBack", "NavigateToSelectItems", "ShowContent", "Lcom/avito/android/btob_business_trip/screens/infoScreen/mvi/entity/B2bBusinessTripInfoInternalAction$Error;", "Lcom/avito/android/btob_business_trip/screens/infoScreen/mvi/entity/B2bBusinessTripInfoInternalAction$Loading;", "Lcom/avito/android/btob_business_trip/screens/infoScreen/mvi/entity/B2bBusinessTripInfoInternalAction$NavigateBack;", "Lcom/avito/android/btob_business_trip/screens/infoScreen/mvi/entity/B2bBusinessTripInfoInternalAction$NavigateToSelectItems;", "Lcom/avito/android/btob_business_trip/screens/infoScreen/mvi/entity/B2bBusinessTripInfoInternalAction$ShowContent;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface B2bBusinessTripInfoInternalAction extends n {

    /* compiled from: B2bBusinessTripInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/infoScreen/mvi/entity/B2bBusinessTripInfoInternalAction$Error;", "Lcom/avito/android/btob_business_trip/screens/infoScreen/mvi/entity/B2bBusinessTripInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements B2bBusinessTripInfoInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f108001b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ApiError f108002c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f108003d;

        public Error(@k ApiError apiError, @k String str) {
            this.f108001b = str;
            this.f108002c = apiError;
            this.f108003d = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF314045d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return L.f(this.f108001b, error.f108001b) && L.f(this.f108002c, error.f108002c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF94954d() {
            return this.f108003d;
        }

        public final int hashCode() {
            return this.f108002c.hashCode() + (this.f108001b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(message=");
            sb2.append(this.f108001b);
            sb2.append(", error=");
            return c.n(sb2, this.f108002c, ')');
        }
    }

    /* compiled from: B2bBusinessTripInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/infoScreen/mvi/entity/B2bBusinessTripInfoInternalAction$Loading;", "Lcom/avito/android/btob_business_trip/screens/infoScreen/mvi/entity/B2bBusinessTripInfoInternalAction;", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading implements B2bBusinessTripInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f108004b = new Loading();

        private Loading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -310241347;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: B2bBusinessTripInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/infoScreen/mvi/entity/B2bBusinessTripInfoInternalAction$NavigateBack;", "Lcom/avito/android/btob_business_trip/screens/infoScreen/mvi/entity/B2bBusinessTripInfoInternalAction;", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateBack implements B2bBusinessTripInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NavigateBack f108005b = new NavigateBack();

        private NavigateBack() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NavigateBack);
        }

        public final int hashCode() {
            return 744525847;
        }

        @k
        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: B2bBusinessTripInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/infoScreen/mvi/entity/B2bBusinessTripInfoInternalAction$NavigateToSelectItems;", "Lcom/avito/android/btob_business_trip/screens/infoScreen/mvi/entity/B2bBusinessTripInfoInternalAction;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateToSelectItems implements B2bBusinessTripInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SelectItemsInfo f108006b;

        public NavigateToSelectItems(@k SelectItemsInfo selectItemsInfo) {
            this.f108006b = selectItemsInfo;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateToSelectItems) && L.f(this.f108006b, ((NavigateToSelectItems) obj).f108006b);
        }

        public final int hashCode() {
            return this.f108006b.hashCode();
        }

        @k
        public final String toString() {
            return "NavigateToSelectItems(selectInfo=" + this.f108006b + ')';
        }
    }

    /* compiled from: B2bBusinessTripInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/infoScreen/mvi/entity/B2bBusinessTripInfoInternalAction$ShowContent;", "Lcom/avito/android/btob_business_trip/screens/infoScreen/mvi/entity/B2bBusinessTripInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements B2bBusinessTripInfoInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final OnboardingInfo f108007b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final SelectItemsInfo f108008c;

        public ShowContent(@k OnboardingInfo onboardingInfo, @k SelectItemsInfo selectItemsInfo) {
            this.f108007b = onboardingInfo;
            this.f108008c = selectItemsInfo;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF314045d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowContent)) {
                return false;
            }
            ShowContent showContent = (ShowContent) obj;
            return L.f(this.f108007b, showContent.f108007b) && L.f(this.f108008c, showContent.f108008c);
        }

        public final int hashCode() {
            return this.f108008c.hashCode() + (this.f108007b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowContent(onboarding=" + this.f108007b + ", selectItems=" + this.f108008c + ')';
        }
    }
}
