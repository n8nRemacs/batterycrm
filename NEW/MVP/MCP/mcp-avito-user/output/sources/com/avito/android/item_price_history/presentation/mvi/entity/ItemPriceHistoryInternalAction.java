package com.avito.android.item_price_history.presentation.mvi.entity;

import AK.c;
import BO.a;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemPriceHistoryInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChangeIsFavoriteState", "PerformHapticFeedback", "ShowContent", "ShowError", "ShowErrorToast", "ShowFirstLoading", "ShowLoadingWithOffset", "ShowToast", "StopLoadingWithOffset", "Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction$ChangeIsFavoriteState;", "Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction$PerformHapticFeedback;", "Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction$ShowContent;", "Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction$ShowError;", "Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction$ShowErrorToast;", "Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction$ShowFirstLoading;", "Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction$ShowLoadingWithOffset;", "Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction$ShowToast;", "Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction$StopLoadingWithOffset;", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface ItemPriceHistoryInternalAction extends n {

    /* compiled from: ItemPriceHistoryInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction$ChangeIsFavoriteState;", "Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction;", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeIsFavoriteState implements ItemPriceHistoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final IsFavoriteState f173801b;

        public ChangeIsFavoriteState(@k IsFavoriteState isFavoriteState) {
            this.f173801b = isFavoriteState;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeIsFavoriteState) && this.f173801b == ((ChangeIsFavoriteState) obj).f173801b;
        }

        public final int hashCode() {
            return this.f173801b.hashCode();
        }

        @k
        public final String toString() {
            return "ChangeIsFavoriteState(isFavoriteState=" + this.f173801b + ')';
        }
    }

    /* compiled from: ItemPriceHistoryInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction$PerformHapticFeedback;", "Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction;", "<init>", "()V", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PerformHapticFeedback implements ItemPriceHistoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final PerformHapticFeedback f173802b = new PerformHapticFeedback();

        private PerformHapticFeedback() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof PerformHapticFeedback);
        }

        public final int hashCode() {
            return -127421958;
        }

        @k
        public final String toString() {
            return "PerformHapticFeedback";
        }
    }

    /* compiled from: ItemPriceHistoryInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction$ShowContent;", "Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements ItemPriceHistoryInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f173803b;

        public ShowContent(@k a aVar) {
            this.f173803b = aVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF316246d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowContent) && L.f(this.f173803b, ((ShowContent) obj).f173803b);
        }

        public final int hashCode() {
            return this.f173803b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowContent(data=" + this.f173803b + ')';
        }
    }

    /* compiled from: ItemPriceHistoryInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction$ShowError;", "Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements ItemPriceHistoryInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f173804b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f173805c;

        public ShowError(@k ApiException apiException) {
            this.f173804b = apiException;
            this.f173805c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF316246d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowError) && this.f173804b.equals(((ShowError) obj).f173804b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF316239c() {
            return this.f173805c;
        }

        public final int hashCode() {
            return this.f173804b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("ShowError(error="), this.f173804b, ')');
        }
    }

    /* compiled from: ItemPriceHistoryInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction$ShowErrorToast;", "Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction;", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorToast implements ItemPriceHistoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f173806b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Throwable f173807c;

        public ShowErrorToast(@k PrintableText printableText, @k Throwable th2) {
            this.f173806b = printableText;
            this.f173807c = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowErrorToast)) {
                return false;
            }
            ShowErrorToast showErrorToast = (ShowErrorToast) obj;
            return L.f(this.f173806b, showErrorToast.f173806b) && L.f(this.f173807c, showErrorToast.f173807c);
        }

        public final int hashCode() {
            return this.f173807c.hashCode() + (this.f173806b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowErrorToast(text=");
            sb2.append(this.f173806b);
            sb2.append(", error=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f173807c, ')');
        }
    }

    /* compiled from: ItemPriceHistoryInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction$ShowFirstLoading;", "Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowFirstLoading extends TrackableLoadingStarted implements ItemPriceHistoryInternalAction {
    }

    /* compiled from: ItemPriceHistoryInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction$ShowLoadingWithOffset;", "Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoadingWithOffset extends TrackableLoadingStarted implements ItemPriceHistoryInternalAction {
    }

    /* compiled from: ItemPriceHistoryInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction$ShowToast;", "Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction;", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToast implements ItemPriceHistoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f173808b;

        public ShowToast(@k PrintableText printableText) {
            this.f173808b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowToast) && L.f(this.f173808b, ((ShowToast) obj).f173808b);
        }

        public final int hashCode() {
            return this.f173808b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("ShowToast(text="), this.f173808b, ')');
        }
    }

    /* compiled from: ItemPriceHistoryInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction$StopLoadingWithOffset;", "Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction;", "<init>", "()V", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StopLoadingWithOffset implements ItemPriceHistoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final StopLoadingWithOffset f173809b = new StopLoadingWithOffset();

        private StopLoadingWithOffset() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof StopLoadingWithOffset);
        }

        public final int hashCode() {
            return 212915312;
        }

        @k
        public final String toString() {
            return "StopLoadingWithOffset";
        }
    }
}
