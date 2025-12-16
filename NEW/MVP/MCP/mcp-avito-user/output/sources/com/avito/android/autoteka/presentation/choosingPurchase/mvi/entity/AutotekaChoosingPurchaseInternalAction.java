package com.avito.android.autoteka.presentation.choosingPurchase.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.autoteka.items.choosingProduct.ChoosingTypePurchaseState;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.autotekateaser.AutotekaAnalytic;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaChoosingPurchaseInternalAction.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0082\u0001\u0013\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BuyAgainState", "BuyReportViaPackageLoading", "BuyReportViaStandalone", "ChoosingProductState", "CloseScreenWithSuccessResult", "Error", "Loading", "OpenAuthScreen", "OpenDeeplink", "OpenPayment", "OpenPreviewSearch", "OpenReport", "OpenReportGenerationFromBuyAgainState", "OpenStandalone", "PurchaseViaPackageOnSuccess", "PurchaseViaPackageState", "PurchaseViaStandaloneState", "SendSelectProductEvent", "UseReportPackageError", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$BuyAgainState;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$BuyReportViaPackageLoading;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$BuyReportViaStandalone;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$ChoosingProductState;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$CloseScreenWithSuccessResult;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$Error;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$Loading;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$OpenAuthScreen;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$OpenDeeplink;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$OpenPayment;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$OpenPreviewSearch;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$OpenReport;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$OpenReportGenerationFromBuyAgainState;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$OpenStandalone;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$PurchaseViaPackageOnSuccess;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$PurchaseViaPackageState;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$PurchaseViaStandaloneState;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$SendSelectProductEvent;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$UseReportPackageError;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AutotekaChoosingPurchaseInternalAction extends n {

    /* compiled from: AutotekaChoosingPurchaseInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$BuyAgainState;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BuyAgainState implements AutotekaChoosingPurchaseInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ChoosingTypePurchaseState.BuyAgainState f97153b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AutotekaAnalytic f97154c;

        public BuyAgainState(@k ChoosingTypePurchaseState.BuyAgainState buyAgainState, @k AutotekaAnalytic autotekaAnalytic) {
            this.f97153b = buyAgainState;
            this.f97154c = autotekaAnalytic;
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
            if (!(obj instanceof BuyAgainState)) {
                return false;
            }
            BuyAgainState buyAgainState = (BuyAgainState) obj;
            return L.f(this.f97153b, buyAgainState.f97153b) && L.f(this.f97154c, buyAgainState.f97154c);
        }

        public final int hashCode() {
            return this.f97154c.hashCode() + (this.f97153b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "BuyAgainState(buyAgainState=" + this.f97153b + ", autotekaAnalytic=" + this.f97154c + ')';
        }
    }

    /* compiled from: AutotekaChoosingPurchaseInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$BuyReportViaPackageLoading;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BuyReportViaPackageLoading implements AutotekaChoosingPurchaseInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final BuyReportViaPackageLoading f97155b = new BuyReportViaPackageLoading();

        private BuyReportViaPackageLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof BuyReportViaPackageLoading);
        }

        public final int hashCode() {
            return 245785199;
        }

        @k
        public final String toString() {
            return "BuyReportViaPackageLoading";
        }
    }

    /* compiled from: AutotekaChoosingPurchaseInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$BuyReportViaStandalone;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BuyReportViaStandalone implements AutotekaChoosingPurchaseInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f97156b;

        /* renamed from: c, reason: collision with root package name */
        public final int f97157c;

        public BuyReportViaStandalone(@k String str, int i12) {
            this.f97156b = str;
            this.f97157c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BuyReportViaStandalone)) {
                return false;
            }
            BuyReportViaStandalone buyReportViaStandalone = (BuyReportViaStandalone) obj;
            return L.f(this.f97156b, buyReportViaStandalone.f97156b) && this.f97157c == buyReportViaStandalone.f97157c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f97157c) + (this.f97156b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BuyReportViaStandalone(url=");
            sb2.append(this.f97156b);
            sb2.append(", searchType=");
            return r.t(sb2, this.f97157c, ')');
        }
    }

    /* compiled from: AutotekaChoosingPurchaseInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$ChoosingProductState;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChoosingProductState implements AutotekaChoosingPurchaseInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ChoosingTypePurchaseState.ChoosingProductState f97158b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AutotekaAnalytic f97159c;

        public ChoosingProductState(@k ChoosingTypePurchaseState.ChoosingProductState choosingProductState, @k AutotekaAnalytic autotekaAnalytic) {
            this.f97158b = choosingProductState;
            this.f97159c = autotekaAnalytic;
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
            if (!(obj instanceof ChoosingProductState)) {
                return false;
            }
            ChoosingProductState choosingProductState = (ChoosingProductState) obj;
            return L.f(this.f97158b, choosingProductState.f97158b) && L.f(this.f97159c, choosingProductState.f97159c);
        }

        public final int hashCode() {
            return this.f97159c.hashCode() + (this.f97158b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ChoosingProductState(choosingProductState=" + this.f97158b + ", autotekaAnalytic=" + this.f97159c + ')';
        }
    }

    /* compiled from: AutotekaChoosingPurchaseInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$CloseScreenWithSuccessResult;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreenWithSuccessResult implements AutotekaChoosingPurchaseInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreenWithSuccessResult f97160b = new CloseScreenWithSuccessResult();

        private CloseScreenWithSuccessResult() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreenWithSuccessResult);
        }

        public final int hashCode() {
            return 686109275;
        }

        @k
        public final String toString() {
            return "CloseScreenWithSuccessResult";
        }
    }

    /* compiled from: AutotekaChoosingPurchaseInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$Error;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements AutotekaChoosingPurchaseInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f97161b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f97162c;

        public Error(@k ApiError apiError) {
            this.f97161b = apiError;
            this.f97162c = new J.a(apiError);
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
            return (obj instanceof Error) && L.f(this.f97161b, ((Error) obj).f97161b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF317817d() {
            return this.f97162c;
        }

        public final int hashCode() {
            return this.f97161b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(apiError="), this.f97161b, ')');
        }
    }

    /* compiled from: AutotekaChoosingPurchaseInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading extends TrackableLoadingStarted implements AutotekaChoosingPurchaseInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final G0 f97163d;

        public Loading() {
            this(null, 1, null);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && L.f(this.f97163d, ((Loading) obj).f97163d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f97163d.hashCode();
        }

        @k
        public final String toString() {
            return c.v(new StringBuilder("Loading(stub="), this.f97163d, ')');
        }

        public Loading(G0 g02, int i12, C42822w c42822w) {
            this.f97163d = (i12 & 1) != 0 ? G0.f406611a : g02;
        }
    }

    /* compiled from: AutotekaChoosingPurchaseInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$OpenAuthScreen;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenAuthScreen implements AutotekaChoosingPurchaseInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenAuthScreen f97164b = new OpenAuthScreen();

        private OpenAuthScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenAuthScreen);
        }

        public final int hashCode() {
            return -2044370301;
        }

        @k
        public final String toString() {
            return "OpenAuthScreen";
        }
    }

    /* compiled from: AutotekaChoosingPurchaseInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$OpenDeeplink;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements AutotekaChoosingPurchaseInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f97165b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f97165b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f97165b, ((OpenDeeplink) obj).f97165b);
        }

        public final int hashCode() {
            return this.f97165b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f97165b, ')');
        }
    }

    /* compiled from: AutotekaChoosingPurchaseInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$OpenPayment;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenPayment implements AutotekaChoosingPurchaseInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f97166b;

        public OpenPayment(@k String str) {
            this.f97166b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenPayment) && L.f(this.f97166b, ((OpenPayment) obj).f97166b);
        }

        public final int hashCode() {
            return this.f97166b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenPayment(productId="), this.f97166b, ')');
        }
    }

    /* compiled from: AutotekaChoosingPurchaseInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$OpenPreviewSearch;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenPreviewSearch implements AutotekaChoosingPurchaseInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenPreviewSearch f97167b = new OpenPreviewSearch();

        private OpenPreviewSearch() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenPreviewSearch);
        }

        public final int hashCode() {
            return -1256148255;
        }

        @k
        public final String toString() {
            return "OpenPreviewSearch";
        }
    }

    /* compiled from: AutotekaChoosingPurchaseInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$OpenReport;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenReport implements AutotekaChoosingPurchaseInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f97168b;

        public OpenReport(@k String str) {
            this.f97168b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenReport) && L.f(this.f97168b, ((OpenReport) obj).f97168b);
        }

        public final int hashCode() {
            return this.f97168b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenReport(reportPublicId="), this.f97168b, ')');
        }
    }

    /* compiled from: AutotekaChoosingPurchaseInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$OpenReportGenerationFromBuyAgainState;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenReportGenerationFromBuyAgainState implements AutotekaChoosingPurchaseInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f97169b;

        public OpenReportGenerationFromBuyAgainState(@k String str) {
            this.f97169b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenReportGenerationFromBuyAgainState) && L.f(this.f97169b, ((OpenReportGenerationFromBuyAgainState) obj).f97169b);
        }

        public final int hashCode() {
            return this.f97169b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenReportGenerationFromBuyAgainState(usagePublicId="), this.f97169b, ')');
        }
    }

    /* compiled from: AutotekaChoosingPurchaseInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$OpenStandalone;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenStandalone implements AutotekaChoosingPurchaseInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f97170b;

        /* renamed from: c, reason: collision with root package name */
        public final int f97171c;

        public OpenStandalone(@k String str, int i12) {
            this.f97170b = str;
            this.f97171c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenStandalone)) {
                return false;
            }
            OpenStandalone openStandalone = (OpenStandalone) obj;
            return L.f(this.f97170b, openStandalone.f97170b) && this.f97171c == openStandalone.f97171c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f97171c) + (this.f97170b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenStandalone(url=");
            sb2.append(this.f97170b);
            sb2.append(", searchType=");
            return r.t(sb2, this.f97171c, ')');
        }
    }

    /* compiled from: AutotekaChoosingPurchaseInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$PurchaseViaPackageOnSuccess;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PurchaseViaPackageOnSuccess implements AutotekaChoosingPurchaseInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f97172b;

        public PurchaseViaPackageOnSuccess(@k String str) {
            this.f97172b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PurchaseViaPackageOnSuccess) && L.f(this.f97172b, ((PurchaseViaPackageOnSuccess) obj).f97172b);
        }

        public final int hashCode() {
            return this.f97172b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PurchaseViaPackageOnSuccess(usagePublicId="), this.f97172b, ')');
        }
    }

    /* compiled from: AutotekaChoosingPurchaseInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$PurchaseViaPackageState;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PurchaseViaPackageState implements AutotekaChoosingPurchaseInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ChoosingTypePurchaseState.PurchaseViaPackageState f97173b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AutotekaAnalytic f97174c;

        public PurchaseViaPackageState(@k ChoosingTypePurchaseState.PurchaseViaPackageState purchaseViaPackageState, @k AutotekaAnalytic autotekaAnalytic) {
            this.f97173b = purchaseViaPackageState;
            this.f97174c = autotekaAnalytic;
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
            if (!(obj instanceof PurchaseViaPackageState)) {
                return false;
            }
            PurchaseViaPackageState purchaseViaPackageState = (PurchaseViaPackageState) obj;
            return L.f(this.f97173b, purchaseViaPackageState.f97173b) && L.f(this.f97174c, purchaseViaPackageState.f97174c);
        }

        public final int hashCode() {
            return this.f97174c.hashCode() + (this.f97173b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "PurchaseViaPackageState(purchaseViaPackageState=" + this.f97173b + ", autotekaAnalytic=" + this.f97174c + ')';
        }
    }

    /* compiled from: AutotekaChoosingPurchaseInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$PurchaseViaStandaloneState;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PurchaseViaStandaloneState implements AutotekaChoosingPurchaseInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ChoosingTypePurchaseState.PurchaseViaStandaloneState f97175b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AutotekaAnalytic f97176c;

        public PurchaseViaStandaloneState(@k ChoosingTypePurchaseState.PurchaseViaStandaloneState purchaseViaStandaloneState, @k AutotekaAnalytic autotekaAnalytic) {
            this.f97175b = purchaseViaStandaloneState;
            this.f97176c = autotekaAnalytic;
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
            if (!(obj instanceof PurchaseViaStandaloneState)) {
                return false;
            }
            PurchaseViaStandaloneState purchaseViaStandaloneState = (PurchaseViaStandaloneState) obj;
            return L.f(this.f97175b, purchaseViaStandaloneState.f97175b) && L.f(this.f97176c, purchaseViaStandaloneState.f97176c);
        }

        public final int hashCode() {
            return this.f97176c.hashCode() + (this.f97175b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "PurchaseViaStandaloneState(purchaseViaStandaloneState=" + this.f97175b + ", autotekaAnalytic=" + this.f97176c + ')';
        }
    }

    /* compiled from: AutotekaChoosingPurchaseInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$SendSelectProductEvent;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SendSelectProductEvent implements AutotekaChoosingPurchaseInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Long f97177b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Long f97178c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Long f97179d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f97180e;

        public SendSelectProductEvent(@l String str, @l Long l12, @l Long l13, @l Long l14) {
            this.f97177b = l12;
            this.f97178c = l13;
            this.f97179d = l14;
            this.f97180e = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SendSelectProductEvent)) {
                return false;
            }
            SendSelectProductEvent sendSelectProductEvent = (SendSelectProductEvent) obj;
            return L.f(this.f97177b, sendSelectProductEvent.f97177b) && L.f(this.f97178c, sendSelectProductEvent.f97178c) && L.f(this.f97179d, sendSelectProductEvent.f97179d) && L.f(this.f97180e, sendSelectProductEvent.f97180e);
        }

        public final int hashCode() {
            Long l12 = this.f97177b;
            int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
            Long l13 = this.f97178c;
            int iHashCode2 = (iHashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
            Long l14 = this.f97179d;
            int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
            String str = this.f97180e;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SendSelectProductEvent(productId=");
            sb2.append(this.f97177b);
            sb2.append(", reportPrice=");
            sb2.append(this.f97178c);
            sb2.append(", fromBlock=");
            sb2.append(this.f97179d);
            sb2.append(", autotekaX=");
            return C22026a.c(sb2, this.f97180e, ')');
        }
    }

    /* compiled from: AutotekaChoosingPurchaseInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction$UseReportPackageError;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UseReportPackageError implements AutotekaChoosingPurchaseInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f97181b;

        public UseReportPackageError(@k ApiError apiError) {
            this.f97181b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UseReportPackageError) && L.f(this.f97181b, ((UseReportPackageError) obj).f97181b);
        }

        public final int hashCode() {
            return this.f97181b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("UseReportPackageError(apiError="), this.f97181b, ')');
        }
    }
}
