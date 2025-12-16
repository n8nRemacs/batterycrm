package com.avito.android.cart_sheet_after_adding.mvi.entity;

import Y61.k;
import Y61.l;
import an.C19912a;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import cn.C27223b;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import vn.C49355b;

/* compiled from: CartSheetAfterAddingInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "ContentLoaded", "DiscountOnDeliveryStatusLoaded", "DiscountOnDeliveryStatusLoadingFailed", "DiscountOnDeliveryStatusLoadingStarted", "ForOneTimeProducer", "ForReducer", "OpenAdvertDetails", "OpenCart", "SetAnalyticsData", "ShowToastError", "UpdateDiscountOnDelivery", "UpdateScreenTitle", "UpdateStocks", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$DiscountOnDeliveryStatusLoaded;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$DiscountOnDeliveryStatusLoadingStarted;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$ForOneTimeProducer;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$ForReducer;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CartSheetAfterAddingInternalAction extends n {

    /* compiled from: CartSheetAfterAddingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$CloseScreen;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$ForOneTimeProducer;", "<init>", "()V", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements ForOneTimeProducer {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f115368b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -40054674;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: CartSheetAfterAddingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$ContentLoaded;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$ForReducer;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$ForOneTimeProducer;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements ForReducer, ForOneTimeProducer {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C27223b f115369b;

        public ContentLoaded(@k C27223b c27223b) {
            this.f115369b = c27223b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContentLoaded) && L.f(this.f115369b, ((ContentLoaded) obj).f115369b);
        }

        public final int hashCode() {
            return this.f115369b.hashCode();
        }

        @k
        public final String toString() {
            return "ContentLoaded(content=" + this.f115369b + ')';
        }
    }

    /* compiled from: CartSheetAfterAddingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$DiscountOnDeliveryStatusLoaded;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction;", "<init>", "()V", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DiscountOnDeliveryStatusLoaded implements TrackableContent, CartSheetAfterAddingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final DiscountOnDeliveryStatusLoaded f115370b = new DiscountOnDeliveryStatusLoaded();

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final String f115371c = "discount-on-delivery-status";

        private DiscountOnDeliveryStatusLoaded() {
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF261547d() {
            return f115371c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return f115371c;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof DiscountOnDeliveryStatusLoaded);
        }

        public final int hashCode() {
            return -2020889695;
        }

        @k
        public final String toString() {
            return "DiscountOnDeliveryStatusLoaded";
        }
    }

    /* compiled from: CartSheetAfterAddingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$DiscountOnDeliveryStatusLoadingFailed;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$ForOneTimeProducer;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DiscountOnDeliveryStatusLoadingFailed implements TrackableError, ForOneTimeProducer {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final J.a f115372b;

        public DiscountOnDeliveryStatusLoadingFailed(@k J.a aVar) {
            this.f115372b = aVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF261547d() {
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
            return (obj instanceof DiscountOnDeliveryStatusLoadingFailed) && L.f(this.f115372b, ((DiscountOnDeliveryStatusLoadingFailed) obj).f115372b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF321272c() {
            return this.f115372b;
        }

        public final int hashCode() {
            return this.f115372b.f90384a.hashCode();
        }

        @k
        public final String toString() {
            return "DiscountOnDeliveryStatusLoadingFailed(failure=" + this.f115372b + ')';
        }
    }

    /* compiled from: CartSheetAfterAddingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$DiscountOnDeliveryStatusLoadingStarted;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction;", "<init>", "()V", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DiscountOnDeliveryStatusLoadingStarted extends TrackableLoadingStarted implements CartSheetAfterAddingInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f115373d = "discount-on-delivery-status";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF261547d() {
            return this.f115373d;
        }
    }

    /* compiled from: CartSheetAfterAddingInternalAction.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$ForOneTimeProducer;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$CloseScreen;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$ContentLoaded;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$DiscountOnDeliveryStatusLoadingFailed;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$OpenAdvertDetails;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$OpenCart;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$SetAnalyticsData;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$ShowToastError;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$UpdateScreenTitle;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ForOneTimeProducer extends CartSheetAfterAddingInternalAction {
    }

    /* compiled from: CartSheetAfterAddingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$ForReducer;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$ContentLoaded;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$SetAnalyticsData;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$UpdateDiscountOnDelivery;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$UpdateStocks;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ForReducer extends CartSheetAfterAddingInternalAction {
    }

    /* compiled from: CartSheetAfterAddingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$OpenAdvertDetails;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$ForOneTimeProducer;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenAdvertDetails implements ForOneTimeProducer {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f115374b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f115375c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final C19912a f115376d;

        public OpenAdvertDetails(String str, String str2, C19912a c19912a, int i12, C42822w c42822w) {
            str2 = (i12 & 2) != 0 ? null : str2;
            c19912a = (i12 & 4) != 0 ? null : c19912a;
            this.f115374b = str;
            this.f115375c = str2;
            this.f115376d = c19912a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenAdvertDetails)) {
                return false;
            }
            OpenAdvertDetails openAdvertDetails = (OpenAdvertDetails) obj;
            return L.f(this.f115374b, openAdvertDetails.f115374b) && L.f(this.f115375c, openAdvertDetails.f115375c) && L.f(this.f115376d, openAdvertDetails.f115376d);
        }

        public final int hashCode() {
            int iHashCode = this.f115374b.hashCode() * 31;
            String str = this.f115375c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            C19912a c19912a = this.f115376d;
            return iHashCode2 + (c19912a != null ? c19912a.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "OpenAdvertDetails(itemId=" + this.f115374b + ", searchContext=" + this.f115375c + ", args=" + this.f115376d + ')';
        }
    }

    /* compiled from: CartSheetAfterAddingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$OpenCart;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$ForOneTimeProducer;", "<init>", "()V", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenCart implements ForOneTimeProducer {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenCart f115377b = new OpenCart();

        private OpenCart() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenCart);
        }

        public final int hashCode() {
            return 955996384;
        }

        @k
        public final String toString() {
            return "OpenCart";
        }
    }

    /* compiled from: CartSheetAfterAddingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$SetAnalyticsData;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$ForReducer;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$ForOneTimeProducer;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetAnalyticsData implements ForReducer, ForOneTimeProducer {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Map<String, Object> f115378b;

        public SetAnalyticsData(@l Map<String, ? extends Object> map) {
            this.f115378b = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetAnalyticsData) && L.f(this.f115378b, ((SetAnalyticsData) obj).f115378b);
        }

        public final int hashCode() {
            Map<String, Object> map = this.f115378b;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        @k
        public final String toString() {
            return r.w(new StringBuilder("SetAnalyticsData(data="), this.f115378b, ')');
        }
    }

    /* compiled from: CartSheetAfterAddingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$ShowToastError;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$ForOneTimeProducer;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToastError implements ForOneTimeProducer {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowToastError)) {
                return false;
            }
            ((ShowToastError) obj).getClass();
            return L.f(null, null) && L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ShowToastError(message=null, cause=null)";
        }
    }

    /* compiled from: CartSheetAfterAddingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$UpdateDiscountOnDelivery;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$ForReducer;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateDiscountOnDelivery implements ForReducer {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final C49355b f115379b;

        public UpdateDiscountOnDelivery(@l C49355b c49355b) {
            this.f115379b = c49355b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateDiscountOnDelivery) && L.f(this.f115379b, ((UpdateDiscountOnDelivery) obj).f115379b);
        }

        public final int hashCode() {
            C49355b c49355b = this.f115379b;
            if (c49355b == null) {
                return 0;
            }
            return c49355b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateDiscountOnDelivery(discountOnDelivery=" + this.f115379b + ')';
        }
    }

    /* compiled from: CartSheetAfterAddingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$UpdateScreenTitle;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$ForOneTimeProducer;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateScreenTitle implements ForOneTimeProducer {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f115380b;

        public UpdateScreenTitle(@k String str) {
            this.f115380b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateScreenTitle) && L.f(this.f115380b, ((UpdateScreenTitle) obj).f115380b);
        }

        public final int hashCode() {
            return this.f115380b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateScreenTitle(title="), this.f115380b, ')');
        }
    }

    /* compiled from: CartSheetAfterAddingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$UpdateStocks;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction$ForReducer;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateStocks implements ForReducer {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<String, Stepper> f115381b;

        public UpdateStocks(@k Map<String, Stepper> map) {
            this.f115381b = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateStocks) && L.f(this.f115381b, ((UpdateStocks) obj).f115381b);
        }

        public final int hashCode() {
            return this.f115381b.hashCode();
        }

        @k
        public final String toString() {
            return r.w(new StringBuilder("UpdateStocks(stocks="), this.f115381b, ')');
        }
    }
}
