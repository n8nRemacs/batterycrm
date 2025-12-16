package com.avito.android.btob_business_trip.screens.resultSuccessScreen.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.btob_business_trip.models.SuccessScreenInfo;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: B2bBusinessTripSuccessScreenInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/resultSuccessScreen/mvi/entity/B2bBusinessTripSuccessScreenInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Init", "LaunchDeeplink", "NavigateBack", "Lcom/avito/android/btob_business_trip/screens/resultSuccessScreen/mvi/entity/B2bBusinessTripSuccessScreenInternalAction$Init;", "Lcom/avito/android/btob_business_trip/screens/resultSuccessScreen/mvi/entity/B2bBusinessTripSuccessScreenInternalAction$LaunchDeeplink;", "Lcom/avito/android/btob_business_trip/screens/resultSuccessScreen/mvi/entity/B2bBusinessTripSuccessScreenInternalAction$NavigateBack;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface B2bBusinessTripSuccessScreenInternalAction extends n {

    /* compiled from: B2bBusinessTripSuccessScreenInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/resultSuccessScreen/mvi/entity/B2bBusinessTripSuccessScreenInternalAction$Init;", "Lcom/avito/android/btob_business_trip/screens/resultSuccessScreen/mvi/entity/B2bBusinessTripSuccessScreenInternalAction;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements B2bBusinessTripSuccessScreenInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SuccessScreenInfo f108106b;

        public Init(@k SuccessScreenInfo successScreenInfo) {
            this.f108106b = successScreenInfo;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Init) && L.f(this.f108106b, ((Init) obj).f108106b);
        }

        public final int hashCode() {
            return this.f108106b.hashCode();
        }

        @k
        public final String toString() {
            return "Init(successScreenInfo=" + this.f108106b + ')';
        }
    }

    /* compiled from: B2bBusinessTripSuccessScreenInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/resultSuccessScreen/mvi/entity/B2bBusinessTripSuccessScreenInternalAction$LaunchDeeplink;", "Lcom/avito/android/btob_business_trip/screens/resultSuccessScreen/mvi/entity/B2bBusinessTripSuccessScreenInternalAction;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LaunchDeeplink implements B2bBusinessTripSuccessScreenInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f108107b;

        public LaunchDeeplink(@k DeepLink deepLink) {
            this.f108107b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LaunchDeeplink) && L.f(this.f108107b, ((LaunchDeeplink) obj).f108107b);
        }

        public final int hashCode() {
            return this.f108107b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("LaunchDeeplink(deeplink="), this.f108107b, ')');
        }
    }

    /* compiled from: B2bBusinessTripSuccessScreenInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/resultSuccessScreen/mvi/entity/B2bBusinessTripSuccessScreenInternalAction$NavigateBack;", "Lcom/avito/android/btob_business_trip/screens/resultSuccessScreen/mvi/entity/B2bBusinessTripSuccessScreenInternalAction;", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateBack implements B2bBusinessTripSuccessScreenInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NavigateBack f108108b = new NavigateBack();

        private NavigateBack() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NavigateBack);
        }

        public final int hashCode() {
            return 747713018;
        }

        @k
        public final String toString() {
            return "NavigateBack";
        }
    }
}
