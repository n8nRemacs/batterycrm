package com.avito.android.service_orders.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.service_orders.list.blueprints.ServiceOrdersBannerItem;
import com.avito.android.service_orders.list.blueprints.ServiceOrdersListSnippetItem;
import com.avito.android.service_orders.list.blueprints.f;
import com.avito.android.service_orders.mvi.entity.ServiceOrdersListState;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceOrdersListInternalAction.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u001e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f\u0082\u0001\u001e !\"#$%&'()*+,-./0123456789:;<=¨\u0006>"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AppendOrdersList", "CancelScreen", "ClickCalendarBtn", "ClickCloseReminderBanner", "ClickEmptyButton", "ClickSettingsReminderBanner", "ClickSnippetActionBtn", "ClickSnippetBody", "ClickSnippetMoreActionsBtn", "CopyPhoneToClipboard", "LoadCompleted", "LoadInProgress", "NoMoreAppend", "OnActionFailure", "OnActionSuccess", "OnDeeplinkClicked", "OnGetPhoneRequestCompleted", "OnResume", "OnShowPhone", "OpenDeepLink", "PhoneNumberSuccess", "ShowEmptyStub", "ShowErrorFullScreen", "ShowErrorToast", "ShowLoading", "ShowOrdersList", "ShowSwipeToRefreshOnEmptyScreen", "ShowSwipeToRefreshOnList", "ShowToast", "ShowUxFeedbackOrderCancellation", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$AppendOrdersList;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$CancelScreen;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ClickCalendarBtn;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ClickCloseReminderBanner;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ClickEmptyButton;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ClickSettingsReminderBanner;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ClickSnippetActionBtn;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ClickSnippetBody;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ClickSnippetMoreActionsBtn;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$CopyPhoneToClipboard;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$LoadCompleted;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$LoadInProgress;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$NoMoreAppend;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$OnActionFailure;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$OnActionSuccess;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$OnDeeplinkClicked;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$OnGetPhoneRequestCompleted;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$OnResume;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$OnShowPhone;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$OpenDeepLink;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$PhoneNumberSuccess;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ShowEmptyStub;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ShowErrorFullScreen;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ShowErrorToast;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ShowLoading;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ShowOrdersList;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ShowSwipeToRefreshOnEmptyScreen;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ShowSwipeToRefreshOnList;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ShowToast;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ShowUxFeedbackOrderCancellation;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ServiceOrdersListInternalAction extends n {

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$AppendOrdersList;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AppendOrdersList implements ServiceOrdersListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f279523b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f279524c;

        public AppendOrdersList(@k ArrayList arrayList, @l String str) {
            this.f279523b = arrayList;
            this.f279524c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppendOrdersList)) {
                return false;
            }
            AppendOrdersList appendOrdersList = (AppendOrdersList) obj;
            return L.f(this.f279523b, appendOrdersList.f279523b) && L.f(this.f279524c, appendOrdersList.f279524c);
        }

        public final int hashCode() {
            int iHashCode = this.f279523b.hashCode() * 31;
            String str = this.f279524c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AppendOrdersList(items=");
            sb2.append(this.f279523b);
            sb2.append(", page=");
            return C22026a.c(sb2, this.f279524c, ')');
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$CancelScreen;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CancelScreen implements ServiceOrdersListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CancelScreen f279525b = new CancelScreen();

        private CancelScreen() {
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ClickCalendarBtn;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClickCalendarBtn implements ServiceOrdersListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f279526b;

        public ClickCalendarBtn(@k DeepLink deepLink) {
            this.f279526b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClickCalendarBtn) && L.f(this.f279526b, ((ClickCalendarBtn) obj).f279526b);
        }

        public final int hashCode() {
            return this.f279526b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ClickCalendarBtn(deepLink="), this.f279526b, ')');
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ClickCloseReminderBanner;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClickCloseReminderBanner implements ServiceOrdersListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ServiceOrdersBannerItem f279527b;

        public ClickCloseReminderBanner(@k ServiceOrdersBannerItem serviceOrdersBannerItem) {
            this.f279527b = serviceOrdersBannerItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClickCloseReminderBanner) && L.f(this.f279527b, ((ClickCloseReminderBanner) obj).f279527b);
        }

        public final int hashCode() {
            return this.f279527b.hashCode();
        }

        @k
        public final String toString() {
            return "ClickCloseReminderBanner(item=" + this.f279527b + ')';
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ClickEmptyButton;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClickEmptyButton implements ServiceOrdersListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f279528b;

        public ClickEmptyButton(@k DeepLink deepLink) {
            this.f279528b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClickEmptyButton) && L.f(this.f279528b, ((ClickEmptyButton) obj).f279528b);
        }

        public final int hashCode() {
            return this.f279528b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ClickEmptyButton(deepLink="), this.f279528b, ')');
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ClickSettingsReminderBanner;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClickSettingsReminderBanner implements ServiceOrdersListInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClickSettingsReminderBanner)) {
                return false;
            }
            ((ClickSettingsReminderBanner) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ClickSettingsReminderBanner(deepLink=null)";
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ClickSnippetActionBtn;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClickSnippetActionBtn implements ServiceOrdersListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f279529b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f279530c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f279531d;

        public ClickSnippetActionBtn(@k DeepLink deepLink, @l String str, @l String str2) {
            this.f279529b = deepLink;
            this.f279530c = str;
            this.f279531d = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClickSnippetActionBtn)) {
                return false;
            }
            ClickSnippetActionBtn clickSnippetActionBtn = (ClickSnippetActionBtn) obj;
            return L.f(this.f279529b, clickSnippetActionBtn.f279529b) && L.f(this.f279530c, clickSnippetActionBtn.f279530c) && L.f(this.f279531d, clickSnippetActionBtn.f279531d);
        }

        public final int hashCode() {
            int iHashCode = this.f279529b.hashCode() * 31;
            String str = this.f279530c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f279531d;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClickSnippetActionBtn(deepLink=");
            sb2.append(this.f279529b);
            sb2.append(", actionTitle=");
            sb2.append(this.f279530c);
            sb2.append(", orderId=");
            return C22026a.c(sb2, this.f279531d, ')');
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ClickSnippetBody;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClickSnippetBody implements ServiceOrdersListInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClickSnippetBody)) {
                return false;
            }
            ((ClickSnippetBody) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ClickSnippetBody(orderId=null)";
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ClickSnippetMoreActionsBtn;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClickSnippetMoreActionsBtn implements ServiceOrdersListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f279532b;

        public ClickSnippetMoreActionsBtn(@l String str) {
            this.f279532b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClickSnippetMoreActionsBtn)) {
                return false;
            }
            ClickSnippetMoreActionsBtn clickSnippetMoreActionsBtn = (ClickSnippetMoreActionsBtn) obj;
            clickSnippetMoreActionsBtn.getClass();
            return L.f(null, null) && L.f(this.f279532b, clickSnippetMoreActionsBtn.f279532b);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ClickSnippetMoreActionsBtn(deepLink=null, orderId="), this.f279532b, ')');
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$CopyPhoneToClipboard;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CopyPhoneToClipboard implements ServiceOrdersListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f279533b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ServiceOrdersListSnippetItem.a f279534c;

        public CopyPhoneToClipboard(@l String str, @k ServiceOrdersListSnippetItem.a aVar) {
            this.f279533b = str;
            this.f279534c = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CopyPhoneToClipboard)) {
                return false;
            }
            CopyPhoneToClipboard copyPhoneToClipboard = (CopyPhoneToClipboard) obj;
            return L.f(this.f279533b, copyPhoneToClipboard.f279533b) && L.f(this.f279534c, copyPhoneToClipboard.f279534c);
        }

        public final int hashCode() {
            String str = this.f279533b;
            return this.f279534c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public final String toString() {
            return "CopyPhoneToClipboard(orderId=" + this.f279533b + ", contact=" + this.f279534c + ')';
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$LoadCompleted;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadCompleted implements ServiceOrdersListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LoadCompleted f279535b = new LoadCompleted();

        private LoadCompleted() {
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$LoadInProgress;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadInProgress extends TrackableLoadingStarted implements ServiceOrdersListInternalAction {
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$NoMoreAppend;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NoMoreAppend implements ServiceOrdersListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NoMoreAppend f279536b = new NoMoreAppend();

        private NoMoreAppend() {
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$OnActionFailure;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnActionFailure implements ServiceOrdersListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f279537b;

        public OnActionFailure(@l String str) {
            this.f279537b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnActionFailure) && L.f(this.f279537b, ((OnActionFailure) obj).f279537b);
        }

        public final int hashCode() {
            String str = this.f279537b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnActionFailure(message="), this.f279537b, ')');
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$OnActionSuccess;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnActionSuccess implements ServiceOrdersListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f279538b;

        public OnActionSuccess(@l String str) {
            this.f279538b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnActionSuccess) && L.f(this.f279538b, ((OnActionSuccess) obj).f279538b);
        }

        public final int hashCode() {
            String str = this.f279538b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnActionSuccess(message="), this.f279538b, ')');
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$OnDeeplinkClicked;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnDeeplinkClicked implements ServiceOrdersListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f279539b;

        public OnDeeplinkClicked(@k DeepLink deepLink) {
            this.f279539b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnDeeplinkClicked) && L.f(this.f279539b, ((OnDeeplinkClicked) obj).f279539b);
        }

        public final int hashCode() {
            return this.f279539b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnDeeplinkClicked(deepLink="), this.f279539b, ')');
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$OnGetPhoneRequestCompleted;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnGetPhoneRequestCompleted implements ServiceOrdersListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f279540b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f279541c;

        public OnGetPhoneRequestCompleted(@l String str, @l String str2) {
            this.f279540b = str;
            this.f279541c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnGetPhoneRequestCompleted)) {
                return false;
            }
            OnGetPhoneRequestCompleted onGetPhoneRequestCompleted = (OnGetPhoneRequestCompleted) obj;
            return L.f(this.f279540b, onGetPhoneRequestCompleted.f279540b) && L.f(this.f279541c, onGetPhoneRequestCompleted.f279541c);
        }

        public final int hashCode() {
            String str = this.f279540b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f279541c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnGetPhoneRequestCompleted(orderId=");
            sb2.append(this.f279540b);
            sb2.append(", name=");
            return C22026a.c(sb2, this.f279541c, ')');
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$OnResume;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OnResume implements ServiceOrdersListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnResume f279542b = new OnResume();

        private OnResume() {
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$OnShowPhone;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnShowPhone implements ServiceOrdersListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f279543b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f279544c;

        public OnShowPhone(@l String str, @l String str2) {
            this.f279543b = str;
            this.f279544c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnShowPhone)) {
                return false;
            }
            OnShowPhone onShowPhone = (OnShowPhone) obj;
            return L.f(this.f279543b, onShowPhone.f279543b) && L.f(this.f279544c, onShowPhone.f279544c);
        }

        public final int hashCode() {
            String str = this.f279543b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f279544c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnShowPhone(orderId=");
            sb2.append(this.f279543b);
            sb2.append(", name=");
            return C22026a.c(sb2, this.f279544c, ')');
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$OpenDeepLink;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeepLink implements ServiceOrdersListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f279545b;

        public OpenDeepLink(@k DeepLink deepLink) {
            this.f279545b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeepLink) && L.f(this.f279545b, ((OpenDeepLink) obj).f279545b);
        }

        public final int hashCode() {
            return this.f279545b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f279545b, ')');
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$PhoneNumberSuccess;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PhoneNumberSuccess implements ServiceOrdersListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f279546b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f279547c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f279548d;

        public PhoneNumberSuccess(@l String str, @l String str2, @l String str3) {
            this.f279546b = str;
            this.f279547c = str2;
            this.f279548d = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PhoneNumberSuccess)) {
                return false;
            }
            PhoneNumberSuccess phoneNumberSuccess = (PhoneNumberSuccess) obj;
            return L.f(this.f279546b, phoneNumberSuccess.f279546b) && L.f(this.f279547c, phoneNumberSuccess.f279547c) && L.f(this.f279548d, phoneNumberSuccess.f279548d);
        }

        public final int hashCode() {
            String str = this.f279546b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f279547c;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f279548d;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PhoneNumberSuccess(phone=");
            sb2.append(this.f279546b);
            sb2.append(", name=");
            sb2.append(this.f279547c);
            sb2.append(", orderId=");
            return C22026a.c(sb2, this.f279548d, ')');
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ShowEmptyStub;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowEmptyStub implements ServiceOrdersListInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ServiceOrdersListState.ServiceOrdersListToolbar f279549b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f279550c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f279551d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f279552e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final DeepLink f279553f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f279554g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final DeepLink f279555h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final f f279556i;

        public ShowEmptyStub(@l ServiceOrdersListState.ServiceOrdersListToolbar serviceOrdersListToolbar, @l String str, @l String str2, @l String str3, @l DeepLink deepLink, @l String str4, @l DeepLink deepLink2, @l f fVar) {
            this.f279549b = serviceOrdersListToolbar;
            this.f279550c = str;
            this.f279551d = str2;
            this.f279552e = str3;
            this.f279553f = deepLink;
            this.f279554g = str4;
            this.f279555h = deepLink2;
            this.f279556i = fVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF220626e() {
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
            if (!(obj instanceof ShowEmptyStub)) {
                return false;
            }
            ShowEmptyStub showEmptyStub = (ShowEmptyStub) obj;
            return L.f(this.f279549b, showEmptyStub.f279549b) && L.f(this.f279550c, showEmptyStub.f279550c) && L.f(this.f279551d, showEmptyStub.f279551d) && L.f(this.f279552e, showEmptyStub.f279552e) && L.f(this.f279553f, showEmptyStub.f279553f) && L.f(this.f279554g, showEmptyStub.f279554g) && L.f(this.f279555h, showEmptyStub.f279555h) && L.f(this.f279556i, showEmptyStub.f279556i);
        }

        public final int hashCode() {
            ServiceOrdersListState.ServiceOrdersListToolbar serviceOrdersListToolbar = this.f279549b;
            int iHashCode = (serviceOrdersListToolbar == null ? 0 : serviceOrdersListToolbar.hashCode()) * 31;
            String str = this.f279550c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f279551d;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f279552e;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            DeepLink deepLink = this.f279553f;
            int iHashCode5 = (iHashCode4 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            String str4 = this.f279554g;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            DeepLink deepLink2 = this.f279555h;
            int iHashCode7 = (iHashCode6 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
            f fVar = this.f279556i;
            return iHashCode7 + (fVar != null ? fVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ShowEmptyStub(toolbar=" + this.f279549b + ", title=" + this.f279550c + ", subtitle=" + this.f279551d + ", buttonTitle=" + this.f279552e + ", buttonUri=" + this.f279553f + ", calendarButtonTitle=" + this.f279554g + ", calendarButtonUri=" + this.f279555h + ", managementPanels=" + this.f279556i + ')';
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ShowErrorToast;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorToast implements ServiceOrdersListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.analytics.provider.clickstream.a f279563b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f279564c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Throwable f279565d;

        public ShowErrorToast(@k com.avito.android.analytics.provider.clickstream.a aVar, @k PrintableText printableText, @l Throwable th2) {
            this.f279563b = aVar;
            this.f279564c = printableText;
            this.f279565d = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowErrorToast)) {
                return false;
            }
            ShowErrorToast showErrorToast = (ShowErrorToast) obj;
            return this.f279563b.equals(showErrorToast.f279563b) && this.f279564c.equals(showErrorToast.f279564c) && L.f(this.f279565d, showErrorToast.f279565d);
        }

        public final int hashCode() {
            int iF2 = com.avito.android.actions_sheet.a.f(this.f279564c, this.f279563b.hashCode() * 31, 31);
            Throwable th2 = this.f279565d;
            return iF2 + (th2 == null ? 0 : th2.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowErrorToast(trackEvent=");
            sb2.append(this.f279563b);
            sb2.append(", message=");
            sb2.append(this.f279564c);
            sb2.append(", throwable=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f279565d, ')');
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ShowLoading;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoading implements ServiceOrdersListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowLoading f279566b = new ShowLoading();

        private ShowLoading() {
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ShowOrdersList;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowOrdersList implements ServiceOrdersListInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ServiceOrdersListState.ServiceOrdersListToolbar f279567b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f279568c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f279569d;

        public ShowOrdersList(@l ServiceOrdersListState.ServiceOrdersListToolbar serviceOrdersListToolbar, @k ArrayList arrayList, @l String str) {
            this.f279567b = serviceOrdersListToolbar;
            this.f279568c = arrayList;
            this.f279569d = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF220626e() {
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
            if (!(obj instanceof ShowOrdersList)) {
                return false;
            }
            ShowOrdersList showOrdersList = (ShowOrdersList) obj;
            return L.f(this.f279567b, showOrdersList.f279567b) && L.f(this.f279568c, showOrdersList.f279568c) && L.f(this.f279569d, showOrdersList.f279569d);
        }

        public final int hashCode() {
            ServiceOrdersListState.ServiceOrdersListToolbar serviceOrdersListToolbar = this.f279567b;
            int iG2 = e.g(this.f279568c, (serviceOrdersListToolbar == null ? 0 : serviceOrdersListToolbar.hashCode()) * 31, 31);
            String str = this.f279569d;
            return iG2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowOrdersList(toolbar=");
            sb2.append(this.f279567b);
            sb2.append(", items=");
            sb2.append(this.f279568c);
            sb2.append(", page=");
            return C22026a.c(sb2, this.f279569d, ')');
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ShowSwipeToRefreshOnEmptyScreen;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowSwipeToRefreshOnEmptyScreen implements ServiceOrdersListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowSwipeToRefreshOnEmptyScreen f279570b = new ShowSwipeToRefreshOnEmptyScreen();

        private ShowSwipeToRefreshOnEmptyScreen() {
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ShowSwipeToRefreshOnList;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowSwipeToRefreshOnList implements ServiceOrdersListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowSwipeToRefreshOnList f279571b = new ShowSwipeToRefreshOnList();

        private ShowSwipeToRefreshOnList() {
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ShowToast;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToast implements ServiceOrdersListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f279572b;

        public ShowToast(@k String str) {
            this.f279572b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowToast) && L.f(this.f279572b, ((ShowToast) obj).f279572b);
        }

        public final int hashCode() {
            return this.f279572b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToast(message="), this.f279572b, ')');
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ShowUxFeedbackOrderCancellation;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowUxFeedbackOrderCancellation implements ServiceOrdersListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowUxFeedbackOrderCancellation f279573b = new ShowUxFeedbackOrderCancellation();

        private ShowUxFeedbackOrderCancellation() {
        }
    }

    /* compiled from: ServiceOrdersListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction$ShowErrorFullScreen;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorFullScreen implements ServiceOrdersListInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ServiceOrdersListState.ServiceOrdersListToolbar f279557b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f279558c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Throwable f279559d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f279560e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f279561f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final J.a f279562g;

        public ShowErrorFullScreen(@l ServiceOrdersListState.ServiceOrdersListToolbar serviceOrdersListToolbar, @k String str, @k Throwable th2, @l String str2, boolean z12) {
            this.f279557b = serviceOrdersListToolbar;
            this.f279558c = str;
            this.f279559d = th2;
            this.f279560e = str2;
            this.f279561f = z12;
            this.f279562g = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF220626e() {
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
            if (!(obj instanceof ShowErrorFullScreen)) {
                return false;
            }
            ShowErrorFullScreen showErrorFullScreen = (ShowErrorFullScreen) obj;
            return L.f(this.f279557b, showErrorFullScreen.f279557b) && L.f(this.f279558c, showErrorFullScreen.f279558c) && L.f(this.f279559d, showErrorFullScreen.f279559d) && L.f(this.f279560e, showErrorFullScreen.f279560e) && this.f279561f == showErrorFullScreen.f279561f;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF212545c() {
            return this.f279562g;
        }

        public final int hashCode() {
            ServiceOrdersListState.ServiceOrdersListToolbar serviceOrdersListToolbar = this.f279557b;
            int iHashCode = (this.f279559d.hashCode() + H.d((serviceOrdersListToolbar == null ? 0 : serviceOrdersListToolbar.hashCode()) * 31, 31, this.f279558c)) * 31;
            String str = this.f279560e;
            return Boolean.hashCode(this.f279561f) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowErrorFullScreen(toolbar=");
            sb2.append(this.f279557b);
            sb2.append(", message=");
            sb2.append(this.f279558c);
            sb2.append(", throwable=");
            sb2.append(this.f279559d);
            sb2.append(", title=");
            sb2.append(this.f279560e);
            sb2.append(", hasReloadButton=");
            return r.x(sb2, this.f279561f, ')');
        }

        public /* synthetic */ ShowErrorFullScreen(ServiceOrdersListState.ServiceOrdersListToolbar serviceOrdersListToolbar, String str, Throwable th2, String str2, boolean z12, int i12, C42822w c42822w) {
            this(serviceOrdersListToolbar, str, th2, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? true : z12);
        }
    }
}
