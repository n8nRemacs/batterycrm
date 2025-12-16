package com.avito.android.hotel_available_rooms.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.hotel_available_rooms.domain.models.HotelAvailableRoomsData;
import com.avito.android.hotel_available_rooms.domain.models.HotelDateFilter;
import com.avito.android.hotel_available_rooms.domain.models.HotelFilters;
import com.avito.android.hotel_available_rooms.domain.models.HotelGuestFilter;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HotelAvailableRoomsInternalAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AddExpandBookingItems", "CloseScreen", "ContentError", "ContentLoaded", "ContentLoading", "Init", "OpenDeeplink", "ShowFullscreenGallery", "UpdateDateFilter", "UpdateGalleryPosition", "UpdateGuestFilter", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction$AddExpandBookingItems;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction$CloseScreen;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction$ContentError;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction$ContentLoaded;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction$ContentLoading;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction$Init;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction$OpenDeeplink;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction$ShowFullscreenGallery;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction$UpdateDateFilter;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction$UpdateGalleryPosition;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction$UpdateGuestFilter;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface HotelAvailableRoomsInternalAction extends n {

    /* compiled from: HotelAvailableRoomsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction$AddExpandBookingItems;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddExpandBookingItems implements HotelAvailableRoomsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f163100b;

        public AddExpandBookingItems(@k String str) {
            this.f163100b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddExpandBookingItems) && L.f(this.f163100b, ((AddExpandBookingItems) obj).f163100b);
        }

        public final int hashCode() {
            return this.f163100b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("AddExpandBookingItems(roomId="), this.f163100b, ')');
        }
    }

    /* compiled from: HotelAvailableRoomsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction$CloseScreen;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction;", "<init>", "()V", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements HotelAvailableRoomsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f163101b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -114475183;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: HotelAvailableRoomsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction$ContentError;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentError implements HotelAvailableRoomsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f163102b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f163103c;

        public ContentError(@k ApiError apiError) {
            this.f163102b = apiError;
            this.f163103c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF302190d() {
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
            return (obj instanceof ContentError) && L.f(this.f163102b, ((ContentError) obj).f163102b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF302187c() {
            return this.f163103c;
        }

        public final int hashCode() {
            return this.f163102b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ContentError(error="), this.f163102b, ')');
        }
    }

    /* compiled from: HotelAvailableRoomsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction$ContentLoaded;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements HotelAvailableRoomsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final HotelAvailableRoomsData f163104b;

        public ContentLoaded(@k HotelAvailableRoomsData hotelAvailableRoomsData) {
            this.f163104b = hotelAvailableRoomsData;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF302190d() {
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
            return (obj instanceof ContentLoaded) && L.f(this.f163104b, ((ContentLoaded) obj).f163104b);
        }

        public final int hashCode() {
            return this.f163104b.hashCode();
        }

        @k
        public final String toString() {
            return "ContentLoaded(data=" + this.f163104b + ')';
        }
    }

    /* compiled from: HotelAvailableRoomsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction$ContentLoading;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContentLoading extends TrackableLoadingStarted implements HotelAvailableRoomsInternalAction {
    }

    /* compiled from: HotelAvailableRoomsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction$Init;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements HotelAvailableRoomsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f163105b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final HotelFilters f163106c;

        public Init(@k String str, @k HotelFilters hotelFilters) {
            this.f163105b = str;
            this.f163106c = hotelFilters;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Init)) {
                return false;
            }
            Init init = (Init) obj;
            return L.f(this.f163105b, init.f163105b) && L.f(this.f163106c, init.f163106c);
        }

        public final int hashCode() {
            return this.f163106c.hashCode() + (this.f163105b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Init(itemId=" + this.f163105b + ", filters=" + this.f163106c + ')';
        }
    }

    /* compiled from: HotelAvailableRoomsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction$ShowFullscreenGallery;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowFullscreenGallery implements HotelAvailableRoomsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<Image> f163109b;

        /* renamed from: c, reason: collision with root package name */
        public final int f163110c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f163111d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f163112e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f163113f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final TreeClickStreamParent f163114g;

        public ShowFullscreenGallery(@k List<Image> list, int i12, @k String str, @l String str2, @l String str3, @l TreeClickStreamParent treeClickStreamParent) {
            this.f163109b = list;
            this.f163110c = i12;
            this.f163111d = str;
            this.f163112e = str2;
            this.f163113f = str3;
            this.f163114g = treeClickStreamParent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowFullscreenGallery)) {
                return false;
            }
            ShowFullscreenGallery showFullscreenGallery = (ShowFullscreenGallery) obj;
            return L.f(this.f163109b, showFullscreenGallery.f163109b) && this.f163110c == showFullscreenGallery.f163110c && L.f(this.f163111d, showFullscreenGallery.f163111d) && L.f(this.f163112e, showFullscreenGallery.f163112e) && L.f(this.f163113f, showFullscreenGallery.f163113f) && L.f(this.f163114g, showFullscreenGallery.f163114g);
        }

        public final int hashCode() {
            int iD2 = H.d(r.e(this.f163110c, this.f163109b.hashCode() * 31, 31), 31, this.f163111d);
            String str = this.f163112e;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f163113f;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            TreeClickStreamParent treeClickStreamParent = this.f163114g;
            return iHashCode2 + (treeClickStreamParent != null ? treeClickStreamParent.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ShowFullscreenGallery(images=" + this.f163109b + ", position=" + this.f163110c + ", roomId=" + this.f163111d + ", categoryId=" + this.f163112e + ", itemId=" + this.f163113f + ", treeParent=" + this.f163114g + ')';
        }
    }

    /* compiled from: HotelAvailableRoomsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction$UpdateDateFilter;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateDateFilter implements HotelAvailableRoomsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final HotelDateFilter f163115b;

        public UpdateDateFilter(@k HotelDateFilter hotelDateFilter) {
            this.f163115b = hotelDateFilter;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateDateFilter) && L.f(this.f163115b, ((UpdateDateFilter) obj).f163115b);
        }

        public final int hashCode() {
            return this.f163115b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateDateFilter(dateFilter=" + this.f163115b + ')';
        }
    }

    /* compiled from: HotelAvailableRoomsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction$UpdateGalleryPosition;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateGalleryPosition implements HotelAvailableRoomsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f163116b;

        /* renamed from: c, reason: collision with root package name */
        public final int f163117c;

        public UpdateGalleryPosition(@k String str, int i12) {
            this.f163116b = str;
            this.f163117c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateGalleryPosition)) {
                return false;
            }
            UpdateGalleryPosition updateGalleryPosition = (UpdateGalleryPosition) obj;
            return L.f(this.f163116b, updateGalleryPosition.f163116b) && this.f163117c == updateGalleryPosition.f163117c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f163117c) + (this.f163116b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateGalleryPosition(roomId=");
            sb2.append(this.f163116b);
            sb2.append(", position=");
            return r.t(sb2, this.f163117c, ')');
        }
    }

    /* compiled from: HotelAvailableRoomsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction$UpdateGuestFilter;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateGuestFilter implements HotelAvailableRoomsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final HotelGuestFilter f163118b;

        public UpdateGuestFilter(@k HotelGuestFilter hotelGuestFilter) {
            this.f163118b = hotelGuestFilter;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateGuestFilter) && L.f(this.f163118b, ((UpdateGuestFilter) obj).f163118b);
        }

        public final int hashCode() {
            return this.f163118b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateGuestFilter(guestFilter=" + this.f163118b + ')';
        }
    }

    /* compiled from: HotelAvailableRoomsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction$OpenDeeplink;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements HotelAvailableRoomsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f163107b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f163108c;

        public OpenDeeplink(@k DeepLink deepLink, @k String str) {
            this.f163107b = deepLink;
            this.f163108c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenDeeplink)) {
                return false;
            }
            OpenDeeplink openDeeplink = (OpenDeeplink) obj;
            return L.f(this.f163107b, openDeeplink.f163107b) && L.f(this.f163108c, openDeeplink.f163108c);
        }

        public final int hashCode() {
            return this.f163108c.hashCode() + (this.f163107b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeeplink(deeplink=");
            sb2.append(this.f163107b);
            sb2.append(", requestKey=");
            return C22026a.c(sb2, this.f163108c, ')');
        }

        public /* synthetic */ OpenDeeplink(DeepLink deepLink, String str, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? "hotel_available_rooms_request_key" : str);
        }
    }
}
