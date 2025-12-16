package com.avito.android.trx_promo_goods.screens.date_picker.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.trx_promo_goods.screens.date_picker.deeplink.TrxPromoGoodsConfigureDatePickerLinkContent;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoGoodsDatePickerInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/mvi/entity/TrxPromoGoodsDatePickerInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseWithSelectedDate", "Content", "Error", "HandleDeeplink", "WheelSelectionChange", "Lcom/avito/android/trx_promo_goods/screens/date_picker/mvi/entity/TrxPromoGoodsDatePickerInternalAction$CloseWithSelectedDate;", "Lcom/avito/android/trx_promo_goods/screens/date_picker/mvi/entity/TrxPromoGoodsDatePickerInternalAction$Content;", "Lcom/avito/android/trx_promo_goods/screens/date_picker/mvi/entity/TrxPromoGoodsDatePickerInternalAction$Error;", "Lcom/avito/android/trx_promo_goods/screens/date_picker/mvi/entity/TrxPromoGoodsDatePickerInternalAction$HandleDeeplink;", "Lcom/avito/android/trx_promo_goods/screens/date_picker/mvi/entity/TrxPromoGoodsDatePickerInternalAction$WheelSelectionChange;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TrxPromoGoodsDatePickerInternalAction extends n {

    /* compiled from: TrxPromoGoodsDatePickerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/mvi/entity/TrxPromoGoodsDatePickerInternalAction$CloseWithSelectedDate;", "Lcom/avito/android/trx_promo_goods/screens/date_picker/mvi/entity/TrxPromoGoodsDatePickerInternalAction;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseWithSelectedDate implements TrxPromoGoodsDatePickerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LocalDate f303720b;

        public CloseWithSelectedDate(@k LocalDate localDate) {
            this.f303720b = localDate;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseWithSelectedDate) && L.f(this.f303720b, ((CloseWithSelectedDate) obj).f303720b);
        }

        public final int hashCode() {
            return this.f303720b.hashCode();
        }

        @k
        public final String toString() {
            return c.t(new StringBuilder("CloseWithSelectedDate(selectedDate="), this.f303720b, ')');
        }
    }

    /* compiled from: TrxPromoGoodsDatePickerInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/mvi/entity/TrxPromoGoodsDatePickerInternalAction$Content;", "Lcom/avito/android/trx_promo_goods/screens/date_picker/mvi/entity/TrxPromoGoodsDatePickerInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements TrxPromoGoodsDatePickerInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final TrxPromoGoodsConfigureDatePickerLinkContent f303721b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f303722c;

        public Content(@k TrxPromoGoodsConfigureDatePickerLinkContent trxPromoGoodsConfigureDatePickerLinkContent, @l String str) {
            this.f303721b = trxPromoGoodsConfigureDatePickerLinkContent;
            this.f303722c = str;
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
            return L.f(this.f303721b, content.f303721b) && L.f(this.f303722c, content.f303722c);
        }

        public final int hashCode() {
            int iHashCode = this.f303721b.hashCode() * 31;
            String str = this.f303722c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(data=");
            sb2.append(this.f303721b);
            sb2.append(", startDate=");
            return C22026a.c(sb2, this.f303722c, ')');
        }
    }

    /* compiled from: TrxPromoGoodsDatePickerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/mvi/entity/TrxPromoGoodsDatePickerInternalAction$Error;", "Lcom/avito/android/trx_promo_goods/screens/date_picker/mvi/entity/TrxPromoGoodsDatePickerInternalAction;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements TrxPromoGoodsDatePickerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f303723b;

        public Error(@k PrintableText printableText) {
            this.f303723b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.f303723b, ((Error) obj).f303723b);
        }

        public final int hashCode() {
            return this.f303723b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("Error(message="), this.f303723b, ')');
        }
    }

    /* compiled from: TrxPromoGoodsDatePickerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/mvi/entity/TrxPromoGoodsDatePickerInternalAction$HandleDeeplink;", "Lcom/avito/android/trx_promo_goods/screens/date_picker/mvi/entity/TrxPromoGoodsDatePickerInternalAction;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements TrxPromoGoodsDatePickerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f303724b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f303724b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f303724b, ((HandleDeeplink) obj).f303724b);
        }

        public final int hashCode() {
            return this.f303724b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f303724b, ')');
        }
    }

    /* compiled from: TrxPromoGoodsDatePickerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/mvi/entity/TrxPromoGoodsDatePickerInternalAction$WheelSelectionChange;", "Lcom/avito/android/trx_promo_goods/screens/date_picker/mvi/entity/TrxPromoGoodsDatePickerInternalAction;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WheelSelectionChange implements TrxPromoGoodsDatePickerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final com.avito.android.lib.design.picker.k<?> f303725b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final com.avito.android.lib.design.picker.k<?> f303726c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final com.avito.android.lib.design.picker.k<?> f303727d;

        public WheelSelectionChange(@l com.avito.android.lib.design.picker.k<?> kVar, @l com.avito.android.lib.design.picker.k<?> kVar2, @l com.avito.android.lib.design.picker.k<?> kVar3) {
            this.f303725b = kVar;
            this.f303726c = kVar2;
            this.f303727d = kVar3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WheelSelectionChange)) {
                return false;
            }
            WheelSelectionChange wheelSelectionChange = (WheelSelectionChange) obj;
            return L.f(this.f303725b, wheelSelectionChange.f303725b) && L.f(this.f303726c, wheelSelectionChange.f303726c) && L.f(this.f303727d, wheelSelectionChange.f303727d);
        }

        public final int hashCode() {
            com.avito.android.lib.design.picker.k<?> kVar = this.f303725b;
            int iHashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
            com.avito.android.lib.design.picker.k<?> kVar2 = this.f303726c;
            int iHashCode2 = (iHashCode + (kVar2 == null ? 0 : kVar2.hashCode())) * 31;
            com.avito.android.lib.design.picker.k<?> kVar3 = this.f303727d;
            return iHashCode2 + (kVar3 != null ? kVar3.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "WheelSelectionChange(dayWheelValue=" + this.f303725b + ", monthWheelValue=" + this.f303726c + ", yearWheelValue=" + this.f303727d + ')';
        }
    }
}
