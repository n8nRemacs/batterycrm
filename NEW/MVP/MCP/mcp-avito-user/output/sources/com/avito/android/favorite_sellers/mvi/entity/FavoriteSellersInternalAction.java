package com.avito.android.favorite_sellers.mvi.entity;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.favorite_sellers.FavoriteSellersItem;
import com.avito.android.favorite_sellers.SubscribableItem;
import com.avito.android.favorite_sellers.adapter.error.ErrorItem;
import com.avito.android.favorite_sellers.adapter.seller.SellerItem;
import com.avito.android.remote.model.UserDialog;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FavoriteSellersInternalAction.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u001a\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u0082\u0001\u001a\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./012345¨\u00066"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChangeNotificationProgress", "ChangeNotificationSuccess", "ChangeScreenVisibility", "DataLoaded", "DataLoading", "DataRefreshing", "DelayedResubscribe", "ItemsUpdate", "LoadingError", "NextPageLoadRetry", "NextPageLoaded", "NextPageLoadingError", "OnMarkedSellersAsRead", "OnUndoSnackbarDismissed", "OpenSubscriptionSettings", "ShowCommonErrorToastBar", "ShowEmptyMessage", "ShowErrorDialog", "ShowNotificationsDialog", "ShowSnackbarWithUndo", "SubscriptionProgress", "SubscriptionSettingsDismissed", "SubscriptionSuccess", "UnsubscriptionProgress", "UnsubscriptionSuccess", "UpdateIsSellersViewed", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$ChangeNotificationProgress;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$ChangeNotificationSuccess;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$ChangeScreenVisibility;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$DataLoaded;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$DataLoading;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$DataRefreshing;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$DelayedResubscribe;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$ItemsUpdate;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$LoadingError;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$NextPageLoadRetry;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$NextPageLoaded;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$NextPageLoadingError;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$OnMarkedSellersAsRead;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$OnUndoSnackbarDismissed;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$OpenSubscriptionSettings;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$ShowCommonErrorToastBar;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$ShowEmptyMessage;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$ShowErrorDialog;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$ShowNotificationsDialog;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$ShowSnackbarWithUndo;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$SubscriptionProgress;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$SubscriptionSettingsDismissed;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$SubscriptionSuccess;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$UnsubscriptionProgress;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$UnsubscriptionSuccess;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$UpdateIsSellersViewed;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface FavoriteSellersInternalAction extends n {

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$ChangeNotificationProgress;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeNotificationProgress implements FavoriteSellersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SubscribableItem f155999b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f156000c;

        public ChangeNotificationProgress(@k SubscribableItem subscribableItem, boolean z12) {
            this.f155999b = subscribableItem;
            this.f156000c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeNotificationProgress)) {
                return false;
            }
            ChangeNotificationProgress changeNotificationProgress = (ChangeNotificationProgress) obj;
            return L.f(this.f155999b, changeNotificationProgress.f155999b) && this.f156000c == changeNotificationProgress.f156000c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f156000c) + (this.f155999b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeNotificationProgress(item=");
            sb2.append(this.f155999b);
            sb2.append(", isInProgress=");
            return r.x(sb2, this.f156000c, ')');
        }
    }

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$ChangeNotificationSuccess;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeNotificationSuccess implements FavoriteSellersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SubscribableItem f156001b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f156002c;

        public ChangeNotificationSuccess(@k SubscribableItem subscribableItem, boolean z12) {
            this.f156001b = subscribableItem;
            this.f156002c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeNotificationSuccess)) {
                return false;
            }
            ChangeNotificationSuccess changeNotificationSuccess = (ChangeNotificationSuccess) obj;
            return L.f(this.f156001b, changeNotificationSuccess.f156001b) && this.f156002c == changeNotificationSuccess.f156002c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f156002c) + (this.f156001b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeNotificationSuccess(item=");
            sb2.append(this.f156001b);
            sb2.append(", isNotificationsActivated=");
            return r.x(sb2, this.f156002c, ')');
        }
    }

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$ChangeScreenVisibility;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeScreenVisibility implements FavoriteSellersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f156003b;

        public ChangeScreenVisibility(boolean z12) {
            this.f156003b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeScreenVisibility) && this.f156003b == ((ChangeScreenVisibility) obj).f156003b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f156003b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ChangeScreenVisibility(isVisible="), this.f156003b, ')');
        }
    }

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$DataLoaded;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DataLoaded implements FavoriteSellersInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<FavoriteSellersItem> f156004b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f156005c;

        /* JADX WARN: Multi-variable type inference failed */
        public DataLoaded(@k List<? extends FavoriteSellersItem> list, @l String str) {
            this.f156004b = list;
            this.f156005c = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF146467d() {
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
            if (!(obj instanceof DataLoaded)) {
                return false;
            }
            DataLoaded dataLoaded = (DataLoaded) obj;
            return L.f(this.f156004b, dataLoaded.f156004b) && L.f(this.f156005c, dataLoaded.f156005c);
        }

        public final int hashCode() {
            int iHashCode = this.f156004b.hashCode() * 31;
            String str = this.f156005c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DataLoaded(items=");
            sb2.append(this.f156004b);
            sb2.append(", userId=");
            return C22026a.c(sb2, this.f156005c, ')');
        }
    }

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$DataLoading;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DataLoading extends TrackableLoadingStarted implements FavoriteSellersInternalAction {
    }

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$DataRefreshing;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "()V", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DataRefreshing implements FavoriteSellersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final DataRefreshing f156006b = new DataRefreshing();

        private DataRefreshing() {
        }
    }

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$DelayedResubscribe;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DelayedResubscribe implements FavoriteSellersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SubscribableItem f156007b;

        public DelayedResubscribe(@k SubscribableItem subscribableItem) {
            this.f156007b = subscribableItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DelayedResubscribe) && L.f(this.f156007b, ((DelayedResubscribe) obj).f156007b);
        }

        public final int hashCode() {
            return this.f156007b.hashCode();
        }

        @k
        public final String toString() {
            return "DelayedResubscribe(itemToResubscribe=" + this.f156007b + ')';
        }
    }

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$ItemsUpdate;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ItemsUpdate implements FavoriteSellersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f156008b;

        public ItemsUpdate(@k ArrayList arrayList) {
            this.f156008b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ItemsUpdate) && this.f156008b.equals(((ItemsUpdate) obj).f156008b);
        }

        public final int hashCode() {
            return this.f156008b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("ItemsUpdate(items="), this.f156008b, ')');
        }
    }

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$LoadingError;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingError implements FavoriteSellersInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f156009b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f156010c;

        public LoadingError(@k Throwable th2) {
            this.f156009b = th2;
            this.f156010c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF146467d() {
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
            return (obj instanceof LoadingError) && L.f(this.f156009b, ((LoadingError) obj).f156009b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF137091c() {
            return this.f156010c;
        }

        public final int hashCode() {
            return this.f156009b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("LoadingError(throwable="), this.f156009b, ')');
        }
    }

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$NextPageLoadRetry;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NextPageLoadRetry implements FavoriteSellersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Uri f156011b;

        public NextPageLoadRetry(@k Uri uri) {
            this.f156011b = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NextPageLoadRetry) && L.f(this.f156011b, ((NextPageLoadRetry) obj).f156011b);
        }

        public final int hashCode() {
            return this.f156011b.hashCode();
        }

        @k
        public final String toString() {
            return a.t(new StringBuilder("NextPageLoadRetry(nextPageUri="), this.f156011b, ')');
        }
    }

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$NextPageLoaded;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NextPageLoaded implements FavoriteSellersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<FavoriteSellersItem> f156012b;

        /* JADX WARN: Multi-variable type inference failed */
        public NextPageLoaded(@k List<? extends FavoriteSellersItem> list) {
            this.f156012b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NextPageLoaded) && L.f(this.f156012b, ((NextPageLoaded) obj).f156012b);
        }

        public final int hashCode() {
            return this.f156012b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("NextPageLoaded(itemsToAppend="), this.f156012b, ')');
        }
    }

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$NextPageLoadingError;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NextPageLoadingError implements FavoriteSellersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ErrorItem f156013b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f156014c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Throwable f156015d;

        public NextPageLoadingError(@k ErrorItem errorItem, @k String str, @k Throwable th2) {
            this.f156013b = errorItem;
            this.f156014c = str;
            this.f156015d = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NextPageLoadingError)) {
                return false;
            }
            NextPageLoadingError nextPageLoadingError = (NextPageLoadingError) obj;
            return L.f(this.f156013b, nextPageLoadingError.f156013b) && L.f(this.f156014c, nextPageLoadingError.f156014c) && L.f(this.f156015d, nextPageLoadingError.f156015d);
        }

        public final int hashCode() {
            return this.f156015d.hashCode() + H.d(this.f156013b.hashCode() * 31, 31, this.f156014c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NextPageLoadingError(errorItem=");
            sb2.append(this.f156013b);
            sb2.append(", errorMessage=");
            sb2.append(this.f156014c);
            sb2.append(", throwable=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f156015d, ')');
        }
    }

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$OnMarkedSellersAsRead;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnMarkedSellersAsRead implements FavoriteSellersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f156016b;

        public OnMarkedSellersAsRead(int i12) {
            this.f156016b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnMarkedSellersAsRead) && this.f156016b == ((OnMarkedSellersAsRead) obj).f156016b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f156016b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OnMarkedSellersAsRead(indexMarkedAsRead="), this.f156016b, ')');
        }
    }

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$OnUndoSnackbarDismissed;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "()V", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OnUndoSnackbarDismissed implements FavoriteSellersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnUndoSnackbarDismissed f156017b = new OnUndoSnackbarDismissed();

        private OnUndoSnackbarDismissed() {
        }
    }

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$OpenSubscriptionSettings;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenSubscriptionSettings implements FavoriteSellersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SellerItem f156018b;

        public OpenSubscriptionSettings(@k SellerItem sellerItem) {
            this.f156018b = sellerItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenSubscriptionSettings) && L.f(this.f156018b, ((OpenSubscriptionSettings) obj).f156018b);
        }

        public final int hashCode() {
            return this.f156018b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenSubscriptionSettings(item=" + this.f156018b + ')';
        }
    }

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$ShowCommonErrorToastBar;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowCommonErrorToastBar implements FavoriteSellersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f156019b;

        public ShowCommonErrorToastBar(@k Throwable th2) {
            this.f156019b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowCommonErrorToastBar) && L.f(this.f156019b, ((ShowCommonErrorToastBar) obj).f156019b);
        }

        public final int hashCode() {
            return this.f156019b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ShowCommonErrorToastBar(throwable="), this.f156019b, ')');
        }
    }

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$ShowEmptyMessage;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowEmptyMessage implements FavoriteSellersInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f156020b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f156021c;

        public ShowEmptyMessage(@k Throwable th2) {
            this.f156020b = th2;
            this.f156021c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF146467d() {
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
            return (obj instanceof ShowEmptyMessage) && L.f(this.f156020b, ((ShowEmptyMessage) obj).f156020b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF137091c() {
            return this.f156021c;
        }

        public final int hashCode() {
            return this.f156020b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ShowEmptyMessage(throwable="), this.f156020b, ')');
        }
    }

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$ShowErrorDialog;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorDialog implements FavoriteSellersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UserDialog f156022b;

        public ShowErrorDialog(@k UserDialog userDialog) {
            this.f156022b = userDialog;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowErrorDialog) && L.f(this.f156022b, ((ShowErrorDialog) obj).f156022b);
        }

        public final int hashCode() {
            return this.f156022b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowErrorDialog(dialog=" + this.f156022b + ')';
        }
    }

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$ShowNotificationsDialog;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "()V", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowNotificationsDialog implements FavoriteSellersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowNotificationsDialog f156023b = new ShowNotificationsDialog();

        private ShowNotificationsDialog() {
        }
    }

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$ShowSnackbarWithUndo;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSnackbarWithUndo implements FavoriteSellersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f156024b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final SubscribableItem f156025c;

        public ShowSnackbarWithUndo(@k String str, @k SubscribableItem subscribableItem) {
            this.f156024b = str;
            this.f156025c = subscribableItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowSnackbarWithUndo)) {
                return false;
            }
            ShowSnackbarWithUndo showSnackbarWithUndo = (ShowSnackbarWithUndo) obj;
            return L.f(this.f156024b, showSnackbarWithUndo.f156024b) && L.f(this.f156025c, showSnackbarWithUndo.f156025c);
        }

        public final int hashCode() {
            return this.f156025c.hashCode() + (this.f156024b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowSnackbarWithUndo(message=" + this.f156024b + ", item=" + this.f156025c + ')';
        }
    }

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$SubscriptionProgress;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubscriptionProgress implements FavoriteSellersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f156026b;

        public SubscriptionProgress(boolean z12) {
            this.f156026b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubscriptionProgress) && this.f156026b == ((SubscriptionProgress) obj).f156026b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f156026b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SubscriptionProgress(isInProgress="), this.f156026b, ')');
        }
    }

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$SubscriptionSettingsDismissed;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "()V", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SubscriptionSettingsDismissed implements FavoriteSellersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SubscriptionSettingsDismissed f156027b = new SubscriptionSettingsDismissed();

        private SubscriptionSettingsDismissed() {
        }
    }

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$SubscriptionSuccess;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubscriptionSuccess implements FavoriteSellersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f156028b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f156029c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Boolean f156030d;

        public SubscriptionSuccess(@k String str, boolean z12, @l Boolean bool) {
            this.f156028b = str;
            this.f156029c = z12;
            this.f156030d = bool;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubscriptionSuccess)) {
                return false;
            }
            SubscriptionSuccess subscriptionSuccess = (SubscriptionSuccess) obj;
            return L.f(this.f156028b, subscriptionSuccess.f156028b) && this.f156029c == subscriptionSuccess.f156029c && L.f(this.f156030d, subscriptionSuccess.f156030d);
        }

        public final int hashCode() {
            int i12 = r.i(this.f156028b.hashCode() * 31, 31, this.f156029c);
            Boolean bool = this.f156030d;
            return i12 + (bool == null ? 0 : bool.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SubscriptionSuccess(userKey=");
            sb2.append(this.f156028b);
            sb2.append(", isSubscribed=");
            sb2.append(this.f156029c);
            sb2.append(", isNotificationsActivated=");
            return C0.g(sb2, this.f156030d, ')');
        }
    }

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$UnsubscriptionProgress;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UnsubscriptionProgress implements FavoriteSellersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SubscribableItem f156031b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f156032c;

        public UnsubscriptionProgress(@k SubscribableItem subscribableItem, boolean z12) {
            this.f156031b = subscribableItem;
            this.f156032c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnsubscriptionProgress)) {
                return false;
            }
            UnsubscriptionProgress unsubscriptionProgress = (UnsubscriptionProgress) obj;
            return L.f(this.f156031b, unsubscriptionProgress.f156031b) && this.f156032c == unsubscriptionProgress.f156032c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f156032c) + (this.f156031b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UnsubscriptionProgress(item=");
            sb2.append(this.f156031b);
            sb2.append(", isInProgress=");
            return r.x(sb2, this.f156032c, ')');
        }
    }

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$UnsubscriptionSuccess;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UnsubscriptionSuccess implements FavoriteSellersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SubscribableItem f156033b;

        public UnsubscriptionSuccess(@k SubscribableItem subscribableItem) {
            this.f156033b = subscribableItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnsubscriptionSuccess) && L.f(this.f156033b, ((UnsubscriptionSuccess) obj).f156033b);
        }

        public final int hashCode() {
            return this.f156033b.hashCode();
        }

        @k
        public final String toString() {
            return "UnsubscriptionSuccess(item=" + this.f156033b + ')';
        }
    }

    /* compiled from: FavoriteSellersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction$UpdateIsSellersViewed;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateIsSellersViewed implements FavoriteSellersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f156034b;

        public UpdateIsSellersViewed(boolean z12) {
            this.f156034b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateIsSellersViewed) && this.f156034b == ((UpdateIsSellersViewed) obj).f156034b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f156034b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdateIsSellersViewed(isViewed="), this.f156034b, ')');
        }
    }
}
