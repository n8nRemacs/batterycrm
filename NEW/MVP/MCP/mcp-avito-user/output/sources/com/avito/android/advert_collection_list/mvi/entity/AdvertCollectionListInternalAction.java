package com.avito.android.advert_collection_list.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.builders.b;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertCollectionListInternalAction.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CollectionCreated", "CollectionDeleted", "CollectionLinkLoaded", "CollectionListLoaded", "CollectionListLoadingError", "CollectionListStartLoading", "CollectionUpdated", "HideSwipeToRefreshView", "OpenAuthorizationBottomSheet", "OpenDeeplink", "OpenDeleteCollectionDialog", "OpenSelectBottomSheet", "SaveCollectionIdToAnalytics", "SendCollectionListViewEvent", "ShowError", "ShowSwipeToRefreshView", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$CollectionCreated;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$CollectionDeleted;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$CollectionLinkLoaded;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$CollectionListLoaded;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$CollectionListLoadingError;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$CollectionListStartLoading;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$CollectionUpdated;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$HideSwipeToRefreshView;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$OpenAuthorizationBottomSheet;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$OpenDeeplink;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$OpenDeleteCollectionDialog;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$OpenSelectBottomSheet;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$SaveCollectionIdToAnalytics;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$SendCollectionListViewEvent;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$ShowError;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$ShowSwipeToRefreshView;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface AdvertCollectionListInternalAction extends n {

    /* compiled from: AdvertCollectionListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$CollectionCreated;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CollectionCreated implements AdvertCollectionListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f82193b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f82194c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final DeepLink f82195d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f82196e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Image f82197f;

        public CollectionCreated(@k DeepLink deepLink, @l Image image, @k String str, @k String str2, @k String str3) {
            this.f82193b = str;
            this.f82194c = str2;
            this.f82195d = deepLink;
            this.f82196e = str3;
            this.f82197f = image;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CollectionCreated)) {
                return false;
            }
            CollectionCreated collectionCreated = (CollectionCreated) obj;
            return L.f(this.f82193b, collectionCreated.f82193b) && L.f(this.f82194c, collectionCreated.f82194c) && L.f(this.f82195d, collectionCreated.f82195d) && L.f(this.f82196e, collectionCreated.f82196e) && L.f(this.f82197f, collectionCreated.f82197f);
        }

        public final int hashCode() {
            int iD2 = H.d(a.e(this.f82195d, H.d(this.f82193b.hashCode() * 31, 31, this.f82194c), 31), 31, this.f82196e);
            Image image = this.f82197f;
            return iD2 + (image == null ? 0 : image.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CollectionCreated(collectionId=");
            sb2.append(this.f82193b);
            sb2.append(", name=");
            sb2.append(this.f82194c);
            sb2.append(", deepLink=");
            sb2.append(this.f82195d);
            sb2.append(", description=");
            sb2.append(this.f82196e);
            sb2.append(", image=");
            return c.o(sb2, this.f82197f, ')');
        }
    }

    /* compiled from: AdvertCollectionListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$CollectionDeleted;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CollectionDeleted implements AdvertCollectionListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f82198b;

        public CollectionDeleted(@k String str) {
            this.f82198b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CollectionDeleted) && L.f(this.f82198b, ((CollectionDeleted) obj).f82198b);
        }

        public final int hashCode() {
            return this.f82198b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CollectionDeleted(collectionId="), this.f82198b, ')');
        }
    }

    /* compiled from: AdvertCollectionListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$CollectionLinkLoaded;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CollectionLinkLoaded implements AdvertCollectionListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f82199b;

        public CollectionLinkLoaded(@k String str) {
            this.f82199b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CollectionLinkLoaded) && L.f(this.f82199b, ((CollectionLinkLoaded) obj).f82199b);
        }

        public final int hashCode() {
            return this.f82199b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CollectionLinkLoaded(link="), this.f82199b, ')');
        }
    }

    /* compiled from: AdvertCollectionListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$CollectionListLoaded;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CollectionListLoaded implements AdvertCollectionListInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f82200b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DeepLink f82201c;

        public CollectionListLoaded(@k ArrayList arrayList, @l DeepLink deepLink) {
            this.f82200b = arrayList;
            this.f82201c = deepLink;
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
            if (!(obj instanceof CollectionListLoaded)) {
                return false;
            }
            CollectionListLoaded collectionListLoaded = (CollectionListLoaded) obj;
            return this.f82200b.equals(collectionListLoaded.f82200b) && L.f(this.f82201c, collectionListLoaded.f82201c);
        }

        public final int hashCode() {
            int iHashCode = this.f82200b.hashCode() * 31;
            DeepLink deepLink = this.f82201c;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CollectionListLoaded(items=");
            sb2.append(this.f82200b);
            sb2.append(", newCreationFlowDeeplink=");
            return a.v(sb2, this.f82201c, ')');
        }
    }

    /* compiled from: AdvertCollectionListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$CollectionListLoadingError;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CollectionListLoadingError implements AdvertCollectionListInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f82202b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f82203c;

        public CollectionListLoadingError(@k ApiError apiError) {
            this.f82202b = apiError;
            this.f82203c = new J.a(apiError);
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
            return (obj instanceof CollectionListLoadingError) && L.f(this.f82202b, ((CollectionListLoadingError) obj).f82202b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF321136c() {
            return this.f82203c;
        }

        public final int hashCode() {
            return this.f82202b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("CollectionListLoadingError(error="), this.f82202b, ')');
        }
    }

    /* compiled from: AdvertCollectionListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$CollectionListStartLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "()V", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CollectionListStartLoading extends TrackableLoadingStarted implements AdvertCollectionListInternalAction {
    }

    /* compiled from: AdvertCollectionListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$CollectionUpdated;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CollectionUpdated implements AdvertCollectionListInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CollectionUpdated)) {
                return false;
            }
            ((CollectionUpdated) obj).getClass();
            return L.f(null, null) && L.f(null, null) && L.f(null, null) && L.f(null, null) && L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "CollectionUpdated(collectionId=null, name=null, deepLink=null, description=null, image=null)";
        }
    }

    /* compiled from: AdvertCollectionListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$HideSwipeToRefreshView;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "<init>", "()V", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HideSwipeToRefreshView implements AdvertCollectionListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HideSwipeToRefreshView f82204b = new HideSwipeToRefreshView();

        private HideSwipeToRefreshView() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof HideSwipeToRefreshView);
        }

        public final int hashCode() {
            return 256146218;
        }

        @k
        public final String toString() {
            return "HideSwipeToRefreshView";
        }
    }

    /* compiled from: AdvertCollectionListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$OpenAuthorizationBottomSheet;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenAuthorizationBottomSheet implements AdvertCollectionListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f82205b;

        public OpenAuthorizationBottomSheet(@k DeepLink deepLink) {
            this.f82205b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenAuthorizationBottomSheet) && L.f(this.f82205b, ((OpenAuthorizationBottomSheet) obj).f82205b);
        }

        public final int hashCode() {
            return this.f82205b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenAuthorizationBottomSheet(then="), this.f82205b, ')');
        }
    }

    /* compiled from: AdvertCollectionListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$OpenDeeplink;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements AdvertCollectionListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f82206b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f82207c;

        public OpenDeeplink(@k DeepLink deepLink, @l String str) {
            this.f82206b = deepLink;
            this.f82207c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenDeeplink)) {
                return false;
            }
            OpenDeeplink openDeeplink = (OpenDeeplink) obj;
            return L.f(this.f82206b, openDeeplink.f82206b) && L.f(this.f82207c, openDeeplink.f82207c);
        }

        public final int hashCode() {
            int iHashCode = this.f82206b.hashCode() * 31;
            String str = this.f82207c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeeplink(deepLink=");
            sb2.append(this.f82206b);
            sb2.append(", requestKey=");
            return C22026a.c(sb2, this.f82207c, ')');
        }

        public /* synthetic */ OpenDeeplink(DeepLink deepLink, String str, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: AdvertCollectionListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$OpenDeleteCollectionDialog;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeleteCollectionDialog implements AdvertCollectionListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f82208b;

        public OpenDeleteCollectionDialog(@k String str) {
            this.f82208b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeleteCollectionDialog) && L.f(this.f82208b, ((OpenDeleteCollectionDialog) obj).f82208b);
        }

        public final int hashCode() {
            return this.f82208b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenDeleteCollectionDialog(collectionId="), this.f82208b, ')');
        }
    }

    /* compiled from: AdvertCollectionListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$OpenSelectBottomSheet;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenSelectBottomSheet implements AdvertCollectionListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f82209b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final b f82210c;

        public OpenSelectBottomSheet(@k String str, @k b bVar) {
            this.f82209b = str;
            this.f82210c = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenSelectBottomSheet)) {
                return false;
            }
            OpenSelectBottomSheet openSelectBottomSheet = (OpenSelectBottomSheet) obj;
            return L.f(this.f82209b, openSelectBottomSheet.f82209b) && L.f(this.f82210c, openSelectBottomSheet.f82210c);
        }

        public final int hashCode() {
            return this.f82210c.hashCode() + (this.f82209b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "OpenSelectBottomSheet(collectionId=" + this.f82209b + ", actions=" + this.f82210c + ')';
        }
    }

    /* compiled from: AdvertCollectionListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$SaveCollectionIdToAnalytics;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SaveCollectionIdToAnalytics implements AdvertCollectionListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f82211b;

        public SaveCollectionIdToAnalytics(@k String str) {
            this.f82211b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SaveCollectionIdToAnalytics) && L.f(this.f82211b, ((SaveCollectionIdToAnalytics) obj).f82211b);
        }

        public final int hashCode() {
            return this.f82211b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SaveCollectionIdToAnalytics(collectionId="), this.f82211b, ')');
        }
    }

    /* compiled from: AdvertCollectionListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$SendCollectionListViewEvent;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SendCollectionListViewEvent implements AdvertCollectionListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f82212b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f82213c;

        /* renamed from: d, reason: collision with root package name */
        public final int f82214d;

        public SendCollectionListViewEvent(@l String str, @k String str2, int i12) {
            this.f82212b = str;
            this.f82213c = str2;
            this.f82214d = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SendCollectionListViewEvent)) {
                return false;
            }
            SendCollectionListViewEvent sendCollectionListViewEvent = (SendCollectionListViewEvent) obj;
            return L.f(this.f82212b, sendCollectionListViewEvent.f82212b) && L.f(this.f82213c, sendCollectionListViewEvent.f82213c) && this.f82214d == sendCollectionListViewEvent.f82214d;
        }

        public final int hashCode() {
            String str = this.f82212b;
            return Integer.hashCode(this.f82214d) + H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f82213c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SendCollectionListViewEvent(userId=");
            sb2.append(this.f82212b);
            sb2.append(", deviceId=");
            sb2.append(this.f82213c);
            sb2.append(", collectionCount=");
            return r.t(sb2, this.f82214d, ')');
        }
    }

    /* compiled from: AdvertCollectionListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$ShowError;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements AdvertCollectionListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f82215b;

        public ShowError(@k String str) {
            this.f82215b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowError) && L.f(this.f82215b, ((ShowError) obj).f82215b);
        }

        public final int hashCode() {
            return this.f82215b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowError(text="), this.f82215b, ')');
        }
    }

    /* compiled from: AdvertCollectionListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction$ShowSwipeToRefreshView;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "<init>", "()V", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSwipeToRefreshView implements AdvertCollectionListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowSwipeToRefreshView f82216b = new ShowSwipeToRefreshView();

        private ShowSwipeToRefreshView() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowSwipeToRefreshView);
        }

        public final int hashCode() {
            return 878288933;
        }

        @k
        public final String toString() {
            return "ShowSwipeToRefreshView";
        }
    }
}
