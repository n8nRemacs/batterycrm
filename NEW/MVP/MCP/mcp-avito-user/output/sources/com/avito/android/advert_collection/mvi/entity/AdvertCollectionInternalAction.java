package com.avito.android.advert_collection.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.advert_collection.adapter.title.CollectionTitleItem;
import com.avito.android.advert_collection_shared.tracker.FavoritesCollectionsCreateScreen;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorites.adapter.FavoriteListItem;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.FavoriteItemsWidgets;
import com.avito.android.select.Arguments;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertCollectionInternalAction.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u001c\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u0082\u0001\u001c\u001e\u001f !\"#$%&'()*+,-./0123456789¨\u0006:"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AdvertLoading", "ApiErrorReceived", "CloseScreen", "CollectionDeleteError", "CollectionDeleted", "CollectionLinkLoaded", "HideSwipeToRefreshView", "LoadAdvertError", "LoadAdvertItems", "LoadCollectionLinkError", "LoadNextPageAdvertItems", "LoadNextPageError", "LoadWidgets", "LoadWidgetsError", "LocationNotFound", "OpenDeeplink", "OpenDeleteCollectionDialog", "OpenSelectBottomSheet", "OrderSelected", "PublishOnboardingClick", "RequestLocation", "RetryLoadNextPage", "SaveAnalyticsInfo", "ShowSimilarAdverts", "ShowSwipeToRefreshView", "UpdateCollectionInfo", "UpdateLikeState", "WidgetsLoading", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$AdvertLoading;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$ApiErrorReceived;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$CloseScreen;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$CollectionDeleteError;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$CollectionDeleted;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$CollectionLinkLoaded;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$HideSwipeToRefreshView;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$LoadAdvertError;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$LoadAdvertItems;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$LoadCollectionLinkError;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$LoadNextPageAdvertItems;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$LoadNextPageError;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$LoadWidgets;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$LoadWidgetsError;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$LocationNotFound;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$OpenDeeplink;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$OpenDeleteCollectionDialog;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$OpenSelectBottomSheet;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$OrderSelected;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$PublishOnboardingClick;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$RequestLocation;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$RetryLoadNextPage;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$SaveAnalyticsInfo;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$ShowSimilarAdverts;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$ShowSwipeToRefreshView;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$UpdateCollectionInfo;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$UpdateLikeState;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$WidgetsLoading;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface AdvertCollectionInternalAction extends n {

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$AdvertLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdvertLoading extends TrackableLoadingStarted implements AdvertCollectionInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f81569d;

        public AdvertLoading() {
            this(null, 1, null);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF201222d() {
            return this.f81569d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AdvertLoading) && L.f(this.f81569d, ((AdvertLoading) obj).f81569d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f81569d.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("AdvertLoading(contentType="), this.f81569d, ')');
        }

        public AdvertLoading(String str, int i12, C42822w c42822w) {
            if ((i12 & 1) != 0) {
                FavoritesCollectionsCreateScreen.f82318d.getClass();
                str = FavoritesCollectionsCreateScreen.f82319e;
            }
            this.f81569d = str;
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$ApiErrorReceived;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApiErrorReceived implements AdvertCollectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f81570b;

        public ApiErrorReceived(@k String str) {
            this.f81570b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApiErrorReceived) && L.f(this.f81570b, ((ApiErrorReceived) obj).f81570b);
        }

        public final int hashCode() {
            return this.f81570b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ApiErrorReceived(message="), this.f81570b, ')');
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$CloseScreen;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements AdvertCollectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f81571b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return 97387752;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$CollectionDeleteError;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CollectionDeleteError implements AdvertCollectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CollectionDeleteError f81572b = new CollectionDeleteError();

        private CollectionDeleteError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CollectionDeleteError);
        }

        public final int hashCode() {
            return -413327101;
        }

        @k
        public final String toString() {
            return "CollectionDeleteError";
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$CollectionDeleted;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CollectionDeleted implements AdvertCollectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CollectionDeleted f81573b = new CollectionDeleted();

        private CollectionDeleted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CollectionDeleted);
        }

        public final int hashCode() {
            return 620037375;
        }

        @k
        public final String toString() {
            return "CollectionDeleted";
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$CollectionLinkLoaded;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CollectionLinkLoaded implements AdvertCollectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f81574b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f81575c;

        public CollectionLinkLoaded(@k String str, @k String str2) {
            this.f81574b = str;
            this.f81575c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CollectionLinkLoaded)) {
                return false;
            }
            CollectionLinkLoaded collectionLinkLoaded = (CollectionLinkLoaded) obj;
            return L.f(this.f81574b, collectionLinkLoaded.f81574b) && L.f(this.f81575c, collectionLinkLoaded.f81575c);
        }

        public final int hashCode() {
            return this.f81575c.hashCode() + (this.f81574b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CollectionLinkLoaded(link=");
            sb2.append(this.f81574b);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f81575c, ')');
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$HideSwipeToRefreshView;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HideSwipeToRefreshView implements AdvertCollectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HideSwipeToRefreshView f81576b = new HideSwipeToRefreshView();

        private HideSwipeToRefreshView() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof HideSwipeToRefreshView);
        }

        public final int hashCode() {
            return 1369406345;
        }

        @k
        public final String toString() {
            return "HideSwipeToRefreshView";
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$LoadAdvertError;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadAdvertError implements AdvertCollectionInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f81577b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f81578c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f81579d;

        public LoadAdvertError(@k ApiError apiError) {
            this.f81577b = apiError;
            this.f81578c = new J.a(apiError);
            FavoritesCollectionsCreateScreen.f82318d.getClass();
            this.f81579d = FavoritesCollectionsCreateScreen.f82319e;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF201222d() {
            return this.f81579d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF185111s() {
            return this.f81579d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadAdvertError) && L.f(this.f81577b, ((LoadAdvertError) obj).f81577b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF285751c() {
            return this.f81578c;
        }

        public final int hashCode() {
            return this.f81577b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadAdvertError(error="), this.f81577b, ')');
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$LoadAdvertItems;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadAdvertItems implements AdvertCollectionInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<FavoriteListItem> f81580b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f81581c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f81582d;

        /* JADX WARN: Multi-variable type inference failed */
        public LoadAdvertItems(@k List<? extends FavoriteListItem> list, @l String str) {
            this.f81580b = list;
            this.f81581c = str;
            FavoritesCollectionsCreateScreen.f82318d.getClass();
            this.f81582d = FavoritesCollectionsCreateScreen.f82319e;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF201222d() {
            return this.f81582d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF185111s() {
            return this.f81582d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadAdvertItems)) {
                return false;
            }
            LoadAdvertItems loadAdvertItems = (LoadAdvertItems) obj;
            return L.f(this.f81580b, loadAdvertItems.f81580b) && L.f(this.f81581c, loadAdvertItems.f81581c);
        }

        public final int hashCode() {
            int iHashCode = this.f81580b.hashCode() * 31;
            String str = this.f81581c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadAdvertItems(items=");
            sb2.append(this.f81580b);
            sb2.append(", nextPageUri=");
            return C22026a.c(sb2, this.f81581c, ')');
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$LoadCollectionLinkError;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadCollectionLinkError implements AdvertCollectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LoadCollectionLinkError f81583b = new LoadCollectionLinkError();

        private LoadCollectionLinkError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof LoadCollectionLinkError);
        }

        public final int hashCode() {
            return 857447630;
        }

        @k
        public final String toString() {
            return "LoadCollectionLinkError";
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$LoadNextPageAdvertItems;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadNextPageAdvertItems implements AdvertCollectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<FavoriteListItem> f81584b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f81585c;

        /* JADX WARN: Multi-variable type inference failed */
        public LoadNextPageAdvertItems(@k List<? extends FavoriteListItem> list, @l String str) {
            this.f81584b = list;
            this.f81585c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadNextPageAdvertItems)) {
                return false;
            }
            LoadNextPageAdvertItems loadNextPageAdvertItems = (LoadNextPageAdvertItems) obj;
            return L.f(this.f81584b, loadNextPageAdvertItems.f81584b) && L.f(this.f81585c, loadNextPageAdvertItems.f81585c);
        }

        public final int hashCode() {
            int iHashCode = this.f81584b.hashCode() * 31;
            String str = this.f81585c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadNextPageAdvertItems(items=");
            sb2.append(this.f81584b);
            sb2.append(", nextPageUri=");
            return C22026a.c(sb2, this.f81585c, ')');
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$LoadNextPageError;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadNextPageError implements AdvertCollectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f81586b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Uri f81587c;

        public LoadNextPageError(@k PrintableText printableText, @k Uri uri) {
            this.f81586b = printableText;
            this.f81587c = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadNextPageError)) {
                return false;
            }
            LoadNextPageError loadNextPageError = (LoadNextPageError) obj;
            return L.f(this.f81586b, loadNextPageError.f81586b) && L.f(this.f81587c, loadNextPageError.f81587c);
        }

        public final int hashCode() {
            return this.f81587c.hashCode() + (this.f81586b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadNextPageError(message=");
            sb2.append(this.f81586b);
            sb2.append(", failedUri=");
            return a.t(sb2, this.f81587c, ')');
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$LoadWidgets;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadWidgets implements AdvertCollectionInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final FavoriteItemsWidgets f81588b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f81589c;

        public LoadWidgets(@k FavoriteItemsWidgets favoriteItemsWidgets) {
            this.f81588b = favoriteItemsWidgets;
            FavoritesCollectionsCreateScreen.f82318d.getClass();
            this.f81589c = FavoritesCollectionsCreateScreen.f82320f;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF201222d() {
            return this.f81589c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF185111s() {
            return this.f81589c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadWidgets) && L.f(this.f81588b, ((LoadWidgets) obj).f81588b);
        }

        public final int hashCode() {
            return this.f81588b.hashCode();
        }

        @k
        public final String toString() {
            return "LoadWidgets(widgets=" + this.f81588b + ')';
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$LoadWidgetsError;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadWidgetsError implements AdvertCollectionInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f81590b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f81591c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f81592d;

        public LoadWidgetsError(@k ApiError apiError) {
            this.f81590b = apiError;
            this.f81591c = new J.a(apiError);
            FavoritesCollectionsCreateScreen.f82318d.getClass();
            this.f81592d = FavoritesCollectionsCreateScreen.f82320f;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF201222d() {
            return this.f81592d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF185111s() {
            return this.f81592d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadWidgetsError) && L.f(this.f81590b, ((LoadWidgetsError) obj).f81590b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF285751c() {
            return this.f81591c;
        }

        public final int hashCode() {
            return this.f81590b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadWidgetsError(error="), this.f81590b, ')');
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$LocationNotFound;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LocationNotFound implements AdvertCollectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LocationNotFound f81593b = new LocationNotFound();

        private LocationNotFound() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof LocationNotFound);
        }

        public final int hashCode() {
            return -1781624480;
        }

        @k
        public final String toString() {
            return "LocationNotFound";
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$OpenDeeplink;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements AdvertCollectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f81594b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Bundle f81595c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f81596d;

        public OpenDeeplink(@l Bundle bundle, @k DeepLink deepLink, @l String str) {
            this.f81594b = deepLink;
            this.f81595c = bundle;
            this.f81596d = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenDeeplink)) {
                return false;
            }
            OpenDeeplink openDeeplink = (OpenDeeplink) obj;
            return L.f(this.f81594b, openDeeplink.f81594b) && L.f(this.f81595c, openDeeplink.f81595c) && L.f(this.f81596d, openDeeplink.f81596d);
        }

        public final int hashCode() {
            int iHashCode = this.f81594b.hashCode() * 31;
            Bundle bundle = this.f81595c;
            int iHashCode2 = (iHashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
            String str = this.f81596d;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeeplink(deepLink=");
            sb2.append(this.f81594b);
            sb2.append(", args=");
            sb2.append(this.f81595c);
            sb2.append(", requestKey=");
            return C22026a.c(sb2, this.f81596d, ')');
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$OpenDeleteCollectionDialog;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeleteCollectionDialog implements AdvertCollectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenDeleteCollectionDialog f81597b = new OpenDeleteCollectionDialog();

        private OpenDeleteCollectionDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenDeleteCollectionDialog);
        }

        public final int hashCode() {
            return -1861766313;
        }

        @k
        public final String toString() {
            return "OpenDeleteCollectionDialog";
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$OpenSelectBottomSheet;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenSelectBottomSheet implements AdvertCollectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Arguments f81598b;

        public OpenSelectBottomSheet(@k Arguments arguments) {
            this.f81598b = arguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenSelectBottomSheet) && L.f(this.f81598b, ((OpenSelectBottomSheet) obj).f81598b);
        }

        public final int hashCode() {
            return this.f81598b.hashCode();
        }

        @k
        public final String toString() {
            return c.p(new StringBuilder("OpenSelectBottomSheet(arg="), this.f81598b, ')');
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$OrderSelected;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OrderSelected implements AdvertCollectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f81599b;

        public OrderSelected(@l String str) {
            this.f81599b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OrderSelected) && L.f(this.f81599b, ((OrderSelected) obj).f81599b);
        }

        public final int hashCode() {
            String str = this.f81599b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OrderSelected(orderId="), this.f81599b, ')');
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$PublishOnboardingClick;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PublishOnboardingClick implements AdvertCollectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final PublishOnboardingClick f81600b = new PublishOnboardingClick();

        private PublishOnboardingClick() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof PublishOnboardingClick);
        }

        public final int hashCode() {
            return 732428346;
        }

        @k
        public final String toString() {
            return "PublishOnboardingClick";
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$RequestLocation;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RequestLocation implements AdvertCollectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RequestLocation f81601b = new RequestLocation();

        private RequestLocation() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof RequestLocation);
        }

        public final int hashCode() {
            return -1165624888;
        }

        @k
        public final String toString() {
            return "RequestLocation";
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$RetryLoadNextPage;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RetryLoadNextPage implements AdvertCollectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f81602b;

        public RetryLoadNextPage(@k String str) {
            this.f81602b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RetryLoadNextPage) && L.f(this.f81602b, ((RetryLoadNextPage) obj).f81602b);
        }

        public final int hashCode() {
            return this.f81602b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RetryLoadNextPage(page="), this.f81602b, ')');
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$SaveAnalyticsInfo;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SaveAnalyticsInfo implements AdvertCollectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f81603b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f81604c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f81605d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f81606e;

        public SaveAnalyticsInfo(@l String str, @k String str2, boolean z12, @k String str3) {
            this.f81603b = str;
            this.f81604c = str2;
            this.f81605d = z12;
            this.f81606e = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SaveAnalyticsInfo)) {
                return false;
            }
            SaveAnalyticsInfo saveAnalyticsInfo = (SaveAnalyticsInfo) obj;
            return L.f(this.f81603b, saveAnalyticsInfo.f81603b) && L.f(this.f81604c, saveAnalyticsInfo.f81604c) && this.f81605d == saveAnalyticsInfo.f81605d && L.f(this.f81606e, saveAnalyticsInfo.f81606e);
        }

        public final int hashCode() {
            String str = this.f81603b;
            return this.f81606e.hashCode() + r.i(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f81604c), 31, this.f81605d);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SaveAnalyticsInfo(userId=");
            sb2.append(this.f81603b);
            sb2.append(", deviceId=");
            sb2.append(this.f81604c);
            sb2.append(", isOwner=");
            sb2.append(this.f81605d);
            sb2.append(", collectionId=");
            return C22026a.c(sb2, this.f81606e, ')');
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$ShowSimilarAdverts;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSimilarAdverts implements AdvertCollectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f81607b;

        public ShowSimilarAdverts(@k String str) {
            this.f81607b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowSimilarAdverts) && L.f(this.f81607b, ((ShowSimilarAdverts) obj).f81607b);
        }

        public final int hashCode() {
            return this.f81607b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowSimilarAdverts(itemId="), this.f81607b, ')');
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$ShowSwipeToRefreshView;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSwipeToRefreshView implements AdvertCollectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowSwipeToRefreshView f81608b = new ShowSwipeToRefreshView();

        private ShowSwipeToRefreshView() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowSwipeToRefreshView);
        }

        public final int hashCode() {
            return 1991549060;
        }

        @k
        public final String toString() {
            return "ShowSwipeToRefreshView";
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$UpdateCollectionInfo;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateCollectionInfo implements AdvertCollectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CollectionTitleItem f81609b;

        public UpdateCollectionInfo(@k CollectionTitleItem collectionTitleItem) {
            this.f81609b = collectionTitleItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateCollectionInfo) && L.f(this.f81609b, ((UpdateCollectionInfo) obj).f81609b);
        }

        public final int hashCode() {
            return this.f81609b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateCollectionInfo(newValue=" + this.f81609b + ')';
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$UpdateLikeState;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateLikeState implements AdvertCollectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f81610b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f81611c;

        public UpdateLikeState(boolean z12, @k String str) {
            this.f81610b = z12;
            this.f81611c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateLikeState)) {
                return false;
            }
            UpdateLikeState updateLikeState = (UpdateLikeState) obj;
            return this.f81610b == updateLikeState.f81610b && L.f(this.f81611c, updateLikeState.f81611c);
        }

        public final int hashCode() {
            return this.f81611c.hashCode() + (Boolean.hashCode(this.f81610b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateLikeState(isLiked=");
            sb2.append(this.f81610b);
            sb2.append(", likesCount=");
            return C22026a.c(sb2, this.f81611c, ')');
        }
    }

    /* compiled from: AdvertCollectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction$WidgetsLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WidgetsLoading extends TrackableLoadingStarted implements AdvertCollectionInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f81612d;

        public WidgetsLoading() {
            this(null, 1, null);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF201222d() {
            return this.f81612d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WidgetsLoading) && L.f(this.f81612d, ((WidgetsLoading) obj).f81612d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f81612d.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("WidgetsLoading(contentType="), this.f81612d, ')');
        }

        public WidgetsLoading(String str, int i12, C42822w c42822w) {
            if ((i12 & 1) != 0) {
                FavoritesCollectionsCreateScreen.f82318d.getClass();
                str = FavoritesCollectionsCreateScreen.f82320f;
            }
            this.f81612d = str;
        }
    }
}
