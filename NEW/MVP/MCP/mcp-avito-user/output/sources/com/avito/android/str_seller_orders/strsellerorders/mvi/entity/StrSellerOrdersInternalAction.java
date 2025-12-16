package com.avito.android.str_seller_orders.strsellerorders.mvi.entity;

import AK.c;
import SK0.f;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.StrSellerOrdersListResponse;
import com.avito.android.str_booking.network.models.common.ButtonAction;
import com.avito.android.str_seller_orders.strsellerordersdialog.shared.StrSellerOrdersDialogData;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersInternalAction.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u0011\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BannerLoaded", "BannerLoading", "BannerLoadingError", "ChangeSelectedSection", "CloseDialog", "CloseScreen", "LoadingComplete", "LoadingError", "OpenDeeplink", "OpenSellerOrdersDialog", "OpenWebView", "PassNewDialogData", "RemovePendingApprovalOrderWithId", "ShowConfirmationBottomSheet", "ShowToast", "StartLoading", "UxInfoLoadingComplete", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$BannerLoaded;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$BannerLoading;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$BannerLoadingError;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$ChangeSelectedSection;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$CloseDialog;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$CloseScreen;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$LoadingComplete;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$LoadingError;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$OpenDeeplink;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$OpenSellerOrdersDialog;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$OpenWebView;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$PassNewDialogData;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$RemovePendingApprovalOrderWithId;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$ShowConfirmationBottomSheet;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$ShowToast;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$StartLoading;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$UxInfoLoadingComplete;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface StrSellerOrdersInternalAction extends n {

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$BannerLoaded;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BannerLoaded implements StrSellerOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final BF0.a f289861b;

        public BannerLoaded(@l BF0.a aVar) {
            this.f289861b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BannerLoaded) && L.f(this.f289861b, ((BannerLoaded) obj).f289861b);
        }

        public final int hashCode() {
            BF0.a aVar = this.f289861b;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        @k
        public final String toString() {
            return "BannerLoaded(banner=" + this.f289861b + ')';
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$BannerLoading;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BannerLoading implements StrSellerOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final BannerLoading f289862b = new BannerLoading();

        private BannerLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof BannerLoading);
        }

        public final int hashCode() {
            return -1266421208;
        }

        @k
        public final String toString() {
            return "BannerLoading";
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$BannerLoadingError;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BannerLoadingError implements StrSellerOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final BannerLoadingError f289863b = new BannerLoadingError();

        private BannerLoadingError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof BannerLoadingError);
        }

        public final int hashCode() {
            return -496564032;
        }

        @k
        public final String toString() {
            return "BannerLoadingError";
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$ChangeSelectedSection;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeSelectedSection implements StrSellerOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f289864b;

        public ChangeSelectedSection(@k String str) {
            this.f289864b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeSelectedSection) && L.f(this.f289864b, ((ChangeSelectedSection) obj).f289864b);
        }

        public final int hashCode() {
            return this.f289864b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ChangeSelectedSection(selectedSectionId="), this.f289864b, ')');
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$CloseDialog;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseDialog implements StrSellerOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseDialog f289865b = new CloseDialog();

        private CloseDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseDialog);
        }

        public final int hashCode() {
            return 109747480;
        }

        @k
        public final String toString() {
            return "CloseDialog";
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$CloseScreen;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements StrSellerOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f289866b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return 534143036;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$LoadingComplete;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingComplete implements StrSellerOrdersInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final StrSellerOrdersListResponse f289867b;

        public LoadingComplete(@k StrSellerOrdersListResponse strSellerOrdersListResponse) {
            this.f289867b = strSellerOrdersListResponse;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF198624d() {
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
            return (obj instanceof LoadingComplete) && L.f(this.f289867b, ((LoadingComplete) obj).f289867b);
        }

        public final int hashCode() {
            return this.f289867b.hashCode();
        }

        @k
        public final String toString() {
            return "LoadingComplete(response=" + this.f289867b + ')';
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$LoadingError;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingError implements StrSellerOrdersInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f289868b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f289869c;

        public LoadingError(@k ApiException apiException) {
            this.f289868b = apiException;
            this.f289869c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF198624d() {
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
            return (obj instanceof LoadingError) && this.f289868b.equals(((LoadingError) obj).f289868b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF257499c() {
            return this.f289869c;
        }

        public final int hashCode() {
            return this.f289868b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("LoadingError(error="), this.f289868b, ')');
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$OpenDeeplink;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements StrSellerOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f289870b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f289870b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f289870b, ((OpenDeeplink) obj).f289870b);
        }

        public final int hashCode() {
            return this.f289870b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f289870b, ')');
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$OpenSellerOrdersDialog;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenSellerOrdersDialog implements StrSellerOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final StrSellerOrdersDialogData f289871b;

        public OpenSellerOrdersDialog(@k StrSellerOrdersDialogData strSellerOrdersDialogData) {
            this.f289871b = strSellerOrdersDialogData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenSellerOrdersDialog) && L.f(this.f289871b, ((OpenSellerOrdersDialog) obj).f289871b);
        }

        public final int hashCode() {
            return this.f289871b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenSellerOrdersDialog(dialogData=" + this.f289871b + ')';
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$OpenWebView;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenWebView implements StrSellerOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f289872b;

        public OpenWebView(@k String str) {
            this.f289872b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenWebView) && L.f(this.f289872b, ((OpenWebView) obj).f289872b);
        }

        public final int hashCode() {
            return this.f289872b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenWebView(url="), this.f289872b, ')');
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$PassNewDialogData;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PassNewDialogData implements StrSellerOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final StrSellerOrdersDialogData f289873b;

        public PassNewDialogData(@k StrSellerOrdersDialogData strSellerOrdersDialogData) {
            this.f289873b = strSellerOrdersDialogData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PassNewDialogData) && L.f(this.f289873b, ((PassNewDialogData) obj).f289873b);
        }

        public final int hashCode() {
            return this.f289873b.hashCode();
        }

        @k
        public final String toString() {
            return "PassNewDialogData(dialogData=" + this.f289873b + ')';
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$RemovePendingApprovalOrderWithId;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RemovePendingApprovalOrderWithId implements StrSellerOrdersInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemovePendingApprovalOrderWithId)) {
                return false;
            }
            ((RemovePendingApprovalOrderWithId) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "RemovePendingApprovalOrderWithId(bookingId=null)";
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$ShowConfirmationBottomSheet;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowConfirmationBottomSheet implements StrSellerOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ButtonAction f289874b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f289875c;

        public ShowConfirmationBottomSheet(@k ButtonAction buttonAction, @k String str) {
            this.f289874b = buttonAction;
            this.f289875c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowConfirmationBottomSheet)) {
                return false;
            }
            ShowConfirmationBottomSheet showConfirmationBottomSheet = (ShowConfirmationBottomSheet) obj;
            return L.f(this.f289874b, showConfirmationBottomSheet.f289874b) && L.f(this.f289875c, showConfirmationBottomSheet.f289875c);
        }

        public final int hashCode() {
            return this.f289875c.hashCode() + (this.f289874b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowConfirmationBottomSheet(buttonAction=");
            sb2.append(this.f289874b);
            sb2.append(", bookingId=");
            return C22026a.c(sb2, this.f289875c, ')');
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$ShowToast;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToast implements StrSellerOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f289876b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Throwable f289877c;

        public ShowToast(@k PrintableText printableText, @k Throwable th2) {
            this.f289876b = printableText;
            this.f289877c = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowToast)) {
                return false;
            }
            ShowToast showToast = (ShowToast) obj;
            return L.f(this.f289876b, showToast.f289876b) && L.f(this.f289877c, showToast.f289877c);
        }

        public final int hashCode() {
            return this.f289877c.hashCode() + (this.f289876b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowToast(text=");
            sb2.append(this.f289876b);
            sb2.append(", throwable=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f289877c, ')');
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$StartLoading;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartLoading extends TrackableLoadingStarted implements StrSellerOrdersInternalAction {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f289878d;

        public StartLoading(boolean z12) {
            this.f289878d = z12;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartLoading) && this.f289878d == ((StartLoading) obj).f289878d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return Boolean.hashCode(this.f289878d);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("StartLoading(isInitial="), this.f289878d, ')');
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction$UxInfoLoadingComplete;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UxInfoLoadingComplete implements StrSellerOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final f f289879b;

        public UxInfoLoadingComplete(@l f fVar) {
            this.f289879b = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UxInfoLoadingComplete) && L.f(this.f289879b, ((UxInfoLoadingComplete) obj).f289879b);
        }

        public final int hashCode() {
            f fVar = this.f289879b;
            if (fVar == null) {
                return 0;
            }
            return fVar.f14906a.hashCode();
        }

        @k
        public final String toString() {
            return "UxInfoLoadingComplete(properties=" + this.f289879b + ')';
        }
    }
}
