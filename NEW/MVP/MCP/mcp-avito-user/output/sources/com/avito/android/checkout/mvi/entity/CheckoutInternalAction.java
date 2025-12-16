package com.avito.android.checkout.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.akita.compose.component.accordion.s;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.checkout.data.CheckoutResponse;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CheckoutInternalAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "Content", "Error", "FinishFlowWithDeepLink", "HandleDeeplink", "HandlePromoCodeDeeplink", "Loading", "PromoCodeInput", "PromoCodeLoadState", "ScreenLoadState", "ScrollToPosition", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction$CloseScreen;", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction$Content;", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction$Error;", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction$FinishFlowWithDeepLink;", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction$HandleDeeplink;", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction$HandlePromoCodeDeeplink;", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction$Loading;", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction$PromoCodeInput;", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction$PromoCodeLoadState;", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction$ScreenLoadState;", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction$ScrollToPosition;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CheckoutInternalAction extends n {

    /* compiled from: CheckoutInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction$CloseScreen;", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction;", "<init>", "()V", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements CheckoutInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f118357b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -779614417;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: CheckoutInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction$Content;", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements CheckoutInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CheckoutResponse f118358b;

        public Content(@k CheckoutResponse checkoutResponse) {
            this.f118358b = checkoutResponse;
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
            return (obj instanceof Content) && L.f(this.f118358b, ((Content) obj).f118358b);
        }

        public final int hashCode() {
            return this.f118358b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(response=" + this.f118358b + ')';
        }
    }

    /* compiled from: CheckoutInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction$Error;", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements CheckoutInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f118359b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f118360c;

        public Error(@k ApiException apiException) {
            this.f118359b = apiException;
            this.f118360c = new J.a(apiException);
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
            return (obj instanceof Error) && this.f118359b.equals(((Error) obj).f118359b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF108213d() {
            return this.f118360c;
        }

        public final int hashCode() {
            return this.f118359b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(throwable="), this.f118359b, ')');
        }
    }

    /* compiled from: CheckoutInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction$FinishFlowWithDeepLink;", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishFlowWithDeepLink implements CheckoutInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f118361b;

        public FinishFlowWithDeepLink(@k DeepLink deepLink) {
            this.f118361b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FinishFlowWithDeepLink) && L.f(this.f118361b, ((FinishFlowWithDeepLink) obj).f118361b);
        }

        public final int hashCode() {
            return this.f118361b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("FinishFlowWithDeepLink(deeplink="), this.f118361b, ')');
        }
    }

    /* compiled from: CheckoutInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction$HandleDeeplink;", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements CheckoutInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f118362b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f118363c;

        public /* synthetic */ HandleDeeplink(DeepLink deepLink, Integer num, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? null : num, deepLink);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleDeeplink)) {
                return false;
            }
            HandleDeeplink handleDeeplink = (HandleDeeplink) obj;
            return L.f(this.f118362b, handleDeeplink.f118362b) && L.f(this.f118363c, handleDeeplink.f118363c);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f118362b;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            Integer num = this.f118363c;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f118362b);
            sb2.append(", buttonId=");
            return s.j(sb2, this.f118363c, ')');
        }

        public HandleDeeplink(@l Integer num, @l DeepLink deepLink) {
            this.f118362b = deepLink;
            this.f118363c = num;
        }
    }

    /* compiled from: CheckoutInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction$HandlePromoCodeDeeplink;", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandlePromoCodeDeeplink implements CheckoutInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f118364b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f118365c;

        public HandlePromoCodeDeeplink(@k DeepLink deepLink, @l String str) {
            this.f118364b = deepLink;
            this.f118365c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandlePromoCodeDeeplink)) {
                return false;
            }
            HandlePromoCodeDeeplink handlePromoCodeDeeplink = (HandlePromoCodeDeeplink) obj;
            return L.f(this.f118364b, handlePromoCodeDeeplink.f118364b) && L.f(this.f118365c, handlePromoCodeDeeplink.f118365c);
        }

        public final int hashCode() {
            int iHashCode = this.f118364b.hashCode() * 31;
            String str = this.f118365c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandlePromoCodeDeeplink(deeplink=");
            sb2.append(this.f118364b);
            sb2.append(", promoCode=");
            return C22026a.c(sb2, this.f118365c, ')');
        }
    }

    /* compiled from: CheckoutInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction;", "()V", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements CheckoutInternalAction {
    }

    /* compiled from: CheckoutInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction$PromoCodeInput;", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PromoCodeInput implements CheckoutInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f118366b;

        public PromoCodeInput(@k String str) {
            this.f118366b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PromoCodeInput) && L.f(this.f118366b, ((PromoCodeInput) obj).f118366b);
        }

        public final int hashCode() {
            return this.f118366b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PromoCodeInput(text="), this.f118366b, ')');
        }
    }

    /* compiled from: CheckoutInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction$PromoCodeLoadState;", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PromoCodeLoadState implements CheckoutInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f118367b;

        public PromoCodeLoadState(boolean z12) {
            this.f118367b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PromoCodeLoadState) && this.f118367b == ((PromoCodeLoadState) obj).f118367b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f118367b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("PromoCodeLoadState(isLoading="), this.f118367b, ')');
        }
    }

    /* compiled from: CheckoutInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction$ScreenLoadState;", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScreenLoadState implements CheckoutInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f118368b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f118369c;

        public ScreenLoadState(boolean z12, @l Integer num) {
            this.f118368b = z12;
            this.f118369c = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScreenLoadState)) {
                return false;
            }
            ScreenLoadState screenLoadState = (ScreenLoadState) obj;
            return this.f118368b == screenLoadState.f118368b && L.f(this.f118369c, screenLoadState.f118369c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f118368b) * 31;
            Integer num = this.f118369c;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ScreenLoadState(isLoading=");
            sb2.append(this.f118368b);
            sb2.append(", buttonId=");
            return s.j(sb2, this.f118369c, ')');
        }
    }

    /* compiled from: CheckoutInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction$ScrollToPosition;", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScrollToPosition implements CheckoutInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f118370b;

        public ScrollToPosition(int i12) {
            this.f118370b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScrollToPosition) && this.f118370b == ((ScrollToPosition) obj).f118370b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f118370b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToPosition(position="), this.f118370b, ')');
        }
    }
}
