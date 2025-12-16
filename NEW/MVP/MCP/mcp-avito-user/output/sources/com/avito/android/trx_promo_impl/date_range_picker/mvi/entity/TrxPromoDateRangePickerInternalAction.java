package com.avito.android.trx_promo_impl.date_range_picker.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureDateRangePickerLinkContent;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoDateRangePickerInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChangeTab", "CloseWithSelectedDates", "Content", "Error", "HandleDeeplink", "SetSelectedDateFrom", "SetSelectedDateTo", "Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction$ChangeTab;", "Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction$CloseWithSelectedDates;", "Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction$Content;", "Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction$Error;", "Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction$HandleDeeplink;", "Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction$SetSelectedDateFrom;", "Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction$SetSelectedDateTo;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TrxPromoDateRangePickerInternalAction extends n {

    /* compiled from: TrxPromoDateRangePickerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction$ChangeTab;", "Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeTab implements TrxPromoDateRangePickerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f304036b;

        public ChangeTab(int i12) {
            this.f304036b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeTab) && this.f304036b == ((ChangeTab) obj).f304036b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f304036b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ChangeTab(tabId="), this.f304036b, ')');
        }
    }

    /* compiled from: TrxPromoDateRangePickerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction$CloseWithSelectedDates;", "Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseWithSelectedDates implements TrxPromoDateRangePickerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LocalDate f304037b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final LocalDate f304038c;

        public CloseWithSelectedDates(@k LocalDate localDate, @k LocalDate localDate2) {
            this.f304037b = localDate;
            this.f304038c = localDate2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CloseWithSelectedDates)) {
                return false;
            }
            CloseWithSelectedDates closeWithSelectedDates = (CloseWithSelectedDates) obj;
            return L.f(this.f304037b, closeWithSelectedDates.f304037b) && L.f(this.f304038c, closeWithSelectedDates.f304038c);
        }

        public final int hashCode() {
            return this.f304038c.hashCode() + (this.f304037b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CloseWithSelectedDates(dateFrom=");
            sb2.append(this.f304037b);
            sb2.append(", dateTo=");
            return c.t(sb2, this.f304038c, ')');
        }
    }

    /* compiled from: TrxPromoDateRangePickerInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction$Content;", "Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements TrxPromoDateRangePickerInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final TrxPromoConfigureDateRangePickerLinkContent f304039b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f304040c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f304041d;

        public Content(@k TrxPromoConfigureDateRangePickerLinkContent trxPromoConfigureDateRangePickerLinkContent, @l String str, @l String str2) {
            this.f304039b = trxPromoConfigureDateRangePickerLinkContent;
            this.f304040c = str;
            this.f304041d = str2;
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
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f304039b, content.f304039b) && L.f(this.f304040c, content.f304040c) && L.f(this.f304041d, content.f304041d);
        }

        public final int hashCode() {
            int iHashCode = this.f304039b.hashCode() * 31;
            String str = this.f304040c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f304041d;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(data=");
            sb2.append(this.f304039b);
            sb2.append(", dateFrom=");
            sb2.append(this.f304040c);
            sb2.append(", dateTo=");
            return C22026a.c(sb2, this.f304041d, ')');
        }
    }

    /* compiled from: TrxPromoDateRangePickerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction$Error;", "Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements TrxPromoDateRangePickerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f304042b;

        public Error(@k PrintableText printableText) {
            this.f304042b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.f304042b, ((Error) obj).f304042b);
        }

        public final int hashCode() {
            return this.f304042b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("Error(message="), this.f304042b, ')');
        }
    }

    /* compiled from: TrxPromoDateRangePickerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction$HandleDeeplink;", "Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements TrxPromoDateRangePickerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f304043b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f304043b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f304043b, ((HandleDeeplink) obj).f304043b);
        }

        public final int hashCode() {
            return this.f304043b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f304043b, ')');
        }
    }

    /* compiled from: TrxPromoDateRangePickerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction$SetSelectedDateFrom;", "Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetSelectedDateFrom implements TrxPromoDateRangePickerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LocalDate f304044b;

        public SetSelectedDateFrom(@k LocalDate localDate) {
            this.f304044b = localDate;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetSelectedDateFrom) && L.f(this.f304044b, ((SetSelectedDateFrom) obj).f304044b);
        }

        public final int hashCode() {
            return this.f304044b.hashCode();
        }

        @k
        public final String toString() {
            return c.t(new StringBuilder("SetSelectedDateFrom(date="), this.f304044b, ')');
        }
    }

    /* compiled from: TrxPromoDateRangePickerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction$SetSelectedDateTo;", "Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetSelectedDateTo implements TrxPromoDateRangePickerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LocalDate f304045b;

        public SetSelectedDateTo(@k LocalDate localDate) {
            this.f304045b = localDate;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetSelectedDateTo) && L.f(this.f304045b, ((SetSelectedDateTo) obj).f304045b);
        }

        public final int hashCode() {
            return this.f304045b.hashCode();
        }

        @k
        public final String toString() {
            return c.t(new StringBuilder("SetSelectedDateTo(date="), this.f304045b, ')');
        }
    }
}
