package com.avito.android.mortgage_calculator.internal.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage_calculator.internal.items.DisclaimerDescription;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalculatorInternalAction.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u00012\u00020\u0002:\r\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\r\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/a;", "CloseOfferDescription", "HandleDeeplink", "InitialLoadingCompleted", "InitialLoadingFailed", "InitialLoadingStarted", "LoadOffers", "OffersLoadingCompleted", "OffersLoadingFailed", "OffersLoadingStarted", "OpenDisclaimer", "OpenOfferDescription", "UpdateOfferDescriptionTab", "UpdatePrivateState", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$CloseOfferDescription;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$HandleDeeplink;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$InitialLoadingCompleted;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$InitialLoadingFailed;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$InitialLoadingStarted;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$LoadOffers;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$OffersLoadingCompleted;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$OffersLoadingFailed;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$OffersLoadingStarted;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$OpenDisclaimer;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$OpenOfferDescription;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$UpdateOfferDescriptionTab;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$UpdatePrivateState;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface CalculatorInternalAction extends n, a {

    /* compiled from: CalculatorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$CloseOfferDescription;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseOfferDescription implements CalculatorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseOfferDescription f204550b = new CloseOfferDescription();

        private CloseOfferDescription() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseOfferDescription);
        }

        public final int hashCode() {
            return -548107777;
        }

        @k
        public final String toString() {
            return "CloseOfferDescription";
        }
    }

    /* compiled from: CalculatorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$HandleDeeplink;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements CalculatorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f204551b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f204551b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f204551b, ((HandleDeeplink) obj).f204551b);
        }

        public final int hashCode() {
            return this.f204551b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f204551b, ')');
        }
    }

    /* compiled from: CalculatorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$InitialLoadingCompleted;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "LD10/c;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitialLoadingCompleted implements CalculatorInternalAction, TrackableContent, D10.c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C10.a f204552b;

        public InitialLoadingCompleted(@k C10.a aVar) {
            this.f204552b = aVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF115373d() {
            return "calculator_initial_loading";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "calculator_initial_loading";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitialLoadingCompleted) && L.f(this.f204552b, ((InitialLoadingCompleted) obj).f204552b);
        }

        public final int hashCode() {
            return this.f204552b.hashCode();
        }

        @k
        public final String toString() {
            return "InitialLoadingCompleted(model=" + this.f204552b + ')';
        }
    }

    /* compiled from: CalculatorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$InitialLoadingFailed;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "LD10/b;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitialLoadingFailed implements CalculatorInternalAction, TrackableError, D10.b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f204553b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f204554c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f204555d = "calculator_initial_loading";

        public InitialLoadingFailed(@k ApiError apiError) {
            this.f204553b = apiError;
            this.f204554c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF115373d() {
            return this.f204555d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f204555d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitialLoadingFailed) && L.f(this.f204553b, ((InitialLoadingFailed) obj).f204553b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF127884c() {
            return this.f204554c;
        }

        public final int hashCode() {
            return this.f204553b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("InitialLoadingFailed(error="), this.f204553b, ')');
        }
    }

    /* compiled from: CalculatorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$InitialLoadingStarted;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InitialLoadingStarted extends TrackableLoadingStarted implements CalculatorInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f204556d = "calculator_initial_loading";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF115373d() {
            return this.f204556d;
        }
    }

    /* compiled from: CalculatorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$LoadOffers;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadOffers implements CalculatorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final D10.a f204557b;

        public LoadOffers(@k D10.a aVar) {
            this.f204557b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadOffers) && L.f(this.f204557b, ((LoadOffers) obj).f204557b);
        }

        public final int hashCode() {
            return this.f204557b.hashCode();
        }

        @k
        public final String toString() {
            return "LoadOffers(privateState=" + this.f204557b + ')';
        }
    }

    /* compiled from: CalculatorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$OffersLoadingCompleted;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "LD10/c;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OffersLoadingCompleted implements CalculatorInternalAction, TrackableContent, D10.c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C10.b f204558b;

        public OffersLoadingCompleted(@k C10.b bVar) {
            this.f204558b = bVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF115373d() {
            return "calculator_offers_loading";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "calculator_offers_loading";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OffersLoadingCompleted) && L.f(this.f204558b, ((OffersLoadingCompleted) obj).f204558b);
        }

        public final int hashCode() {
            return this.f204558b.hashCode();
        }

        @k
        public final String toString() {
            return "OffersLoadingCompleted(model=" + this.f204558b + ')';
        }
    }

    /* compiled from: CalculatorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$OffersLoadingFailed;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "LD10/c;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OffersLoadingFailed implements CalculatorInternalAction, TrackableError, D10.c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f204559b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f204560c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f204561d = "calculator_offers_loading";

        public OffersLoadingFailed(@k ApiError apiError) {
            this.f204559b = apiError;
            this.f204560c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF115373d() {
            return this.f204561d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f204561d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OffersLoadingFailed) && L.f(this.f204559b, ((OffersLoadingFailed) obj).f204559b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF127884c() {
            return this.f204560c;
        }

        public final int hashCode() {
            return this.f204559b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("OffersLoadingFailed(error="), this.f204559b, ')');
        }
    }

    /* compiled from: CalculatorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$OffersLoadingStarted;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "LD10/c;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OffersLoadingStarted extends TrackableLoadingStarted implements CalculatorInternalAction, D10.c {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f204562d = "calculator_offers_loading";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF115373d() {
            return this.f204562d;
        }
    }

    /* compiled from: CalculatorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$OpenDisclaimer;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDisclaimer implements CalculatorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DisclaimerDescription f204563b;

        public OpenDisclaimer(@k DisclaimerDescription disclaimerDescription) {
            this.f204563b = disclaimerDescription;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDisclaimer) && L.f(this.f204563b, ((OpenDisclaimer) obj).f204563b);
        }

        public final int hashCode() {
            return this.f204563b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenDisclaimer(disclaimer=" + this.f204563b + ')';
        }
    }

    /* compiled from: CalculatorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$OpenOfferDescription;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenOfferDescription implements CalculatorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f204564b;

        public OpenOfferDescription(@k String str) {
            this.f204564b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenOfferDescription) && L.f(this.f204564b, ((OpenOfferDescription) obj).f204564b);
        }

        public final int hashCode() {
            return this.f204564b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenOfferDescription(offerType="), this.f204564b, ')');
        }
    }

    /* compiled from: CalculatorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$UpdateOfferDescriptionTab;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateOfferDescriptionTab implements CalculatorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f204565b;

        public UpdateOfferDescriptionTab(int i12) {
            this.f204565b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateOfferDescriptionTab) && this.f204565b == ((UpdateOfferDescriptionTab) obj).f204565b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f204565b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("UpdateOfferDescriptionTab(tabIdx="), this.f204565b, ')');
        }
    }

    /* compiled from: CalculatorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction$UpdatePrivateState;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdatePrivateState implements CalculatorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final D10.a f204566b;

        public UpdatePrivateState(@k D10.a aVar) {
            this.f204566b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatePrivateState) && L.f(this.f204566b, ((UpdatePrivateState) obj).f204566b);
        }

        public final int hashCode() {
            return this.f204566b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdatePrivateState(state=" + this.f204566b + ')';
        }
    }
}
