package com.avito.android.str_seller_orders.strsellerordersdialog.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.str_booking.network.models.common.ButtonAction;
import com.avito.android.str_seller_orders.strsellerordersdialog.shared.StrSellerOrdersDialogData;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersDialogInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/entity/StrSellerOrdersDialogInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "InitWithNewDialogData", "NotifyOrderButtonClick", "NotifyOrderClicked", "ShowErrorToast", "Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/entity/StrSellerOrdersDialogInternalAction$Close;", "Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/entity/StrSellerOrdersDialogInternalAction$InitWithNewDialogData;", "Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/entity/StrSellerOrdersDialogInternalAction$NotifyOrderButtonClick;", "Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/entity/StrSellerOrdersDialogInternalAction$NotifyOrderClicked;", "Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/entity/StrSellerOrdersDialogInternalAction$ShowErrorToast;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface StrSellerOrdersDialogInternalAction extends n {

    /* compiled from: StrSellerOrdersDialogInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/entity/StrSellerOrdersDialogInternalAction$Close;", "Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/entity/StrSellerOrdersDialogInternalAction;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements StrSellerOrdersDialogInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f290150b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 52518096;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: StrSellerOrdersDialogInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/entity/StrSellerOrdersDialogInternalAction$InitWithNewDialogData;", "Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/entity/StrSellerOrdersDialogInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitWithNewDialogData implements StrSellerOrdersDialogInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final StrSellerOrdersDialogData f290151b;

        public InitWithNewDialogData(@k StrSellerOrdersDialogData strSellerOrdersDialogData) {
            this.f290151b = strSellerOrdersDialogData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitWithNewDialogData) && L.f(this.f290151b, ((InitWithNewDialogData) obj).f290151b);
        }

        public final int hashCode() {
            return this.f290151b.hashCode();
        }

        @k
        public final String toString() {
            return "InitWithNewDialogData(dialogData=" + this.f290151b + ')';
        }
    }

    /* compiled from: StrSellerOrdersDialogInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/entity/StrSellerOrdersDialogInternalAction$NotifyOrderButtonClick;", "Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/entity/StrSellerOrdersDialogInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NotifyOrderButtonClick implements StrSellerOrdersDialogInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ButtonAction f290152b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final SuggestAnalyticsEvent f290153c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f290154d;

        public NotifyOrderButtonClick(@l SuggestAnalyticsEvent suggestAnalyticsEvent, @k ButtonAction buttonAction, @k String str) {
            this.f290152b = buttonAction;
            this.f290153c = suggestAnalyticsEvent;
            this.f290154d = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotifyOrderButtonClick)) {
                return false;
            }
            NotifyOrderButtonClick notifyOrderButtonClick = (NotifyOrderButtonClick) obj;
            return L.f(this.f290152b, notifyOrderButtonClick.f290152b) && L.f(this.f290153c, notifyOrderButtonClick.f290153c) && L.f(this.f290154d, notifyOrderButtonClick.f290154d);
        }

        public final int hashCode() {
            int iHashCode = this.f290152b.hashCode() * 31;
            SuggestAnalyticsEvent suggestAnalyticsEvent = this.f290153c;
            return this.f290154d.hashCode() + ((iHashCode + (suggestAnalyticsEvent == null ? 0 : suggestAnalyticsEvent.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NotifyOrderButtonClick(buttonAction=");
            sb2.append(this.f290152b);
            sb2.append(", clickstreamEvent=");
            sb2.append(this.f290153c);
            sb2.append(", bookingId=");
            return C22026a.c(sb2, this.f290154d, ')');
        }
    }

    /* compiled from: StrSellerOrdersDialogInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/entity/StrSellerOrdersDialogInternalAction$NotifyOrderClicked;", "Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/entity/StrSellerOrdersDialogInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NotifyOrderClicked implements StrSellerOrdersDialogInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f290155b;

        public NotifyOrderClicked(@k DeepLink deepLink) {
            this.f290155b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotifyOrderClicked) && L.f(this.f290155b, ((NotifyOrderClicked) obj).f290155b);
        }

        public final int hashCode() {
            return this.f290155b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("NotifyOrderClicked(deepLink="), this.f290155b, ')');
        }
    }

    /* compiled from: StrSellerOrdersDialogInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/entity/StrSellerOrdersDialogInternalAction$ShowErrorToast;", "Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/entity/StrSellerOrdersDialogInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorToast implements StrSellerOrdersDialogInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f290156b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Throwable f290157c;

        public ShowErrorToast(@k PrintableText printableText, @k Throwable th2) {
            this.f290156b = printableText;
            this.f290157c = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowErrorToast)) {
                return false;
            }
            ShowErrorToast showErrorToast = (ShowErrorToast) obj;
            return L.f(this.f290156b, showErrorToast.f290156b) && L.f(this.f290157c, showErrorToast.f290157c);
        }

        public final int hashCode() {
            return this.f290157c.hashCode() + (this.f290156b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowErrorToast(text=");
            sb2.append(this.f290156b);
            sb2.append(", throwable=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f290157c, ')');
        }
    }
}
