package com.avito.android.btob_business_trip.screens.selectItemScreen.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.btob_business_trip.models.SelectItemsInfo;
import com.avito.android.btob_business_trip.models.SuccessScreenInfo;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.remote.error.ApiError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: B2bBusinessTripSelectInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "DeeplinkLaunch", "Error", "Exit", "Init", "LoadInfoForSuccessScreen", "Loading", "NavigateBack", "NavigateToSuccessScreen", "OnCheckedChanged", "Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction$DeeplinkLaunch;", "Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction$Error;", "Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction$Exit;", "Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction$Init;", "Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction$LoadInfoForSuccessScreen;", "Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction$Loading;", "Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction$NavigateBack;", "Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction$NavigateToSuccessScreen;", "Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction$OnCheckedChanged;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface B2bBusinessTripSelectInternalAction extends n {

    /* compiled from: B2bBusinessTripSelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction$DeeplinkLaunch;", "Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeeplinkLaunch implements B2bBusinessTripSelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final WebViewLink.AnyDomain f108210b;

        public DeeplinkLaunch(@k WebViewLink.AnyDomain anyDomain) {
            this.f108210b = anyDomain;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeeplinkLaunch) && this.f108210b.equals(((DeeplinkLaunch) obj).f108210b);
        }

        public final int hashCode() {
            return this.f108210b.hashCode();
        }

        @k
        public final String toString() {
            return "DeeplinkLaunch(deepLink=" + this.f108210b + ')';
        }
    }

    /* compiled from: B2bBusinessTripSelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction$Error;", "Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements B2bBusinessTripSelectInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f108211b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ApiError f108212c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f108213d;

        public Error(@k ApiError apiError, @k String str) {
            this.f108211b = str;
            this.f108212c = apiError;
            this.f108213d = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF202133d() {
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
            return L.f(this.f108211b, error.f108211b) && L.f(this.f108212c, error.f108212c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF280044c() {
            return this.f108213d;
        }

        public final int hashCode() {
            return this.f108212c.hashCode() + (this.f108211b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(message=");
            sb2.append(this.f108211b);
            sb2.append(", error=");
            return c.n(sb2, this.f108212c, ')');
        }
    }

    /* compiled from: B2bBusinessTripSelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction$Exit;", "Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction;", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Exit implements B2bBusinessTripSelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Exit f108214b = new Exit();

        private Exit() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return 1575697648;
        }

        @k
        public final String toString() {
            return "Exit";
        }
    }

    /* compiled from: B2bBusinessTripSelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction$Init;", "Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements B2bBusinessTripSelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SelectItemsInfo f108215b;

        public Init(@k SelectItemsInfo selectItemsInfo) {
            this.f108215b = selectItemsInfo;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Init) && L.f(this.f108215b, ((Init) obj).f108215b);
        }

        public final int hashCode() {
            return this.f108215b.hashCode();
        }

        @k
        public final String toString() {
            return "Init(selectItemsInfo=" + this.f108215b + ')';
        }
    }

    /* compiled from: B2bBusinessTripSelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction$LoadInfoForSuccessScreen;", "Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadInfoForSuccessScreen implements B2bBusinessTripSelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SuccessScreenInfo f108216b;

        public LoadInfoForSuccessScreen(@k SuccessScreenInfo successScreenInfo) {
            this.f108216b = successScreenInfo;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadInfoForSuccessScreen) && L.f(this.f108216b, ((LoadInfoForSuccessScreen) obj).f108216b);
        }

        public final int hashCode() {
            return this.f108216b.hashCode();
        }

        @k
        public final String toString() {
            return "LoadInfoForSuccessScreen(screenInfo=" + this.f108216b + ')';
        }
    }

    /* compiled from: B2bBusinessTripSelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction$Loading;", "Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction;", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading implements B2bBusinessTripSelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f108217b = new Loading();

        private Loading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -731778006;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: B2bBusinessTripSelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction$NavigateBack;", "Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction;", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateBack implements B2bBusinessTripSelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NavigateBack f108218b = new NavigateBack();

        private NavigateBack() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NavigateBack);
        }

        public final int hashCode() {
            return -586518582;
        }

        @k
        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: B2bBusinessTripSelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction$NavigateToSuccessScreen;", "Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction;", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateToSuccessScreen implements B2bBusinessTripSelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NavigateToSuccessScreen f108219b = new NavigateToSuccessScreen();

        private NavigateToSuccessScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NavigateToSuccessScreen);
        }

        public final int hashCode() {
            return 781932753;
        }

        @k
        public final String toString() {
            return "NavigateToSuccessScreen";
        }
    }

    /* compiled from: B2bBusinessTripSelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction$OnCheckedChanged;", "Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnCheckedChanged implements B2bBusinessTripSelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<Long> f108220b;

        public OnCheckedChanged(@k List<Long> list) {
            this.f108220b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCheckedChanged) && L.f(this.f108220b, ((OnCheckedChanged) obj).f108220b);
        }

        public final int hashCode() {
            return this.f108220b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("OnCheckedChanged(newList="), this.f108220b, ')');
        }
    }
}
