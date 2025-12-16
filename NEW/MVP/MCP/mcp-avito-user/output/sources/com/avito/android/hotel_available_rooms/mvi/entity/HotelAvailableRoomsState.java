package com.avito.android.hotel_available_rooms.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.hotel_available_rooms.domain.models.HotelAvailableRoomsData;
import com.avito.android.hotel_available_rooms.domain.models.HotelFilters;
import com.avito.android.hotel_available_rooms.mvi.entity.a;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.P0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HotelAvailableRoomsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "LoadingState", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelAvailableRoomsState extends q {

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final a f163119l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final HotelAvailableRoomsState f163120m = new HotelAvailableRoomsState(null, true, null, new HotelFilters(null, null, 3, null), null, null, P0.c(), B0.f406639b, LoadingState.f163131b, new a.d(null, false));

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f163121b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f163122c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final HotelAvailableRoomsData f163123d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final HotelFilters f163124e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final TreeClickStreamParent f163125f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f163126g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Map<String, Integer> f163127h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Set<String> f163128i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final LoadingState f163129j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final com.avito.android.hotel_available_rooms.mvi.entity.a f163130k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HotelAvailableRoomsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsState$LoadingState;", "", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingState {

        /* renamed from: b, reason: collision with root package name */
        public static final LoadingState f163131b;

        /* renamed from: c, reason: collision with root package name */
        public static final LoadingState f163132c;

        /* renamed from: d, reason: collision with root package name */
        public static final LoadingState f163133d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ LoadingState[] f163134e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f163135f;

        static {
            LoadingState loadingState = new LoadingState("LOADING", 0);
            f163131b = loadingState;
            LoadingState loadingState2 = new LoadingState("LOADED", 1);
            f163132c = loadingState2;
            LoadingState loadingState3 = new LoadingState("ERROR", 2);
            f163133d = loadingState3;
            LoadingState[] loadingStateArr = {loadingState, loadingState2, loadingState3};
            f163134e = loadingStateArr;
            f163135f = c.a(loadingStateArr);
        }

        public LoadingState() {
            throw null;
        }

        public static LoadingState valueOf(String str) {
            return (LoadingState) Enum.valueOf(LoadingState.class, str);
        }

        public static LoadingState[] values() {
            return (LoadingState[]) f163134e.clone();
        }
    }

    /* compiled from: HotelAvailableRoomsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsState$a;", "", "<init>", "()V", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public HotelAvailableRoomsState(@l String str, boolean z12, @l HotelAvailableRoomsData hotelAvailableRoomsData, @k HotelFilters hotelFilters, @l TreeClickStreamParent treeClickStreamParent, @l String str2, @k Map<String, Integer> map, @k Set<String> set, @k LoadingState loadingState, @k com.avito.android.hotel_available_rooms.mvi.entity.a aVar) {
        this.f163121b = str;
        this.f163122c = z12;
        this.f163123d = hotelAvailableRoomsData;
        this.f163124e = hotelFilters;
        this.f163125f = treeClickStreamParent;
        this.f163126g = str2;
        this.f163127h = map;
        this.f163128i = set;
        this.f163129j = loadingState;
        this.f163130k = aVar;
    }

    public static HotelAvailableRoomsState a(HotelAvailableRoomsState hotelAvailableRoomsState, String str, boolean z12, HotelAvailableRoomsData hotelAvailableRoomsData, HotelFilters hotelFilters, TreeClickStreamParent treeClickStreamParent, String str2, Map map, Set set, LoadingState loadingState, com.avito.android.hotel_available_rooms.mvi.entity.a aVar, int i12) {
        String str3 = (i12 & 1) != 0 ? hotelAvailableRoomsState.f163121b : str;
        boolean z13 = (i12 & 2) != 0 ? hotelAvailableRoomsState.f163122c : z12;
        HotelAvailableRoomsData hotelAvailableRoomsData2 = (i12 & 4) != 0 ? hotelAvailableRoomsState.f163123d : hotelAvailableRoomsData;
        HotelFilters hotelFilters2 = (i12 & 8) != 0 ? hotelAvailableRoomsState.f163124e : hotelFilters;
        TreeClickStreamParent treeClickStreamParent2 = (i12 & 16) != 0 ? hotelAvailableRoomsState.f163125f : treeClickStreamParent;
        String str4 = (i12 & 32) != 0 ? hotelAvailableRoomsState.f163126g : str2;
        Map map2 = (i12 & 64) != 0 ? hotelAvailableRoomsState.f163127h : map;
        Set set2 = (i12 & 128) != 0 ? hotelAvailableRoomsState.f163128i : set;
        LoadingState loadingState2 = (i12 & 256) != 0 ? hotelAvailableRoomsState.f163129j : loadingState;
        com.avito.android.hotel_available_rooms.mvi.entity.a aVar2 = (i12 & 512) != 0 ? hotelAvailableRoomsState.f163130k : aVar;
        hotelAvailableRoomsState.getClass();
        return new HotelAvailableRoomsState(str3, z13, hotelAvailableRoomsData2, hotelFilters2, treeClickStreamParent2, str4, map2, set2, loadingState2, aVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelAvailableRoomsState)) {
            return false;
        }
        HotelAvailableRoomsState hotelAvailableRoomsState = (HotelAvailableRoomsState) obj;
        return L.f(this.f163121b, hotelAvailableRoomsState.f163121b) && this.f163122c == hotelAvailableRoomsState.f163122c && L.f(this.f163123d, hotelAvailableRoomsState.f163123d) && L.f(this.f163124e, hotelAvailableRoomsState.f163124e) && L.f(this.f163125f, hotelAvailableRoomsState.f163125f) && L.f(this.f163126g, hotelAvailableRoomsState.f163126g) && L.f(this.f163127h, hotelAvailableRoomsState.f163127h) && L.f(this.f163128i, hotelAvailableRoomsState.f163128i) && this.f163129j == hotelAvailableRoomsState.f163129j && L.f(this.f163130k, hotelAvailableRoomsState.f163130k);
    }

    public final int hashCode() {
        String str = this.f163121b;
        int i12 = r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f163122c);
        HotelAvailableRoomsData hotelAvailableRoomsData = this.f163123d;
        int iHashCode = (this.f163124e.hashCode() + ((i12 + (hotelAvailableRoomsData == null ? 0 : hotelAvailableRoomsData.hashCode())) * 31)) * 31;
        TreeClickStreamParent treeClickStreamParent = this.f163125f;
        int iHashCode2 = (iHashCode + (treeClickStreamParent == null ? 0 : treeClickStreamParent.hashCode())) * 31;
        String str2 = this.f163126g;
        return this.f163130k.hashCode() + ((this.f163129j.hashCode() + m.g(this.f163128i, AK.c.c((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f163127h), 31)) * 31);
    }

    @k
    public final String toString() {
        return "HotelAvailableRoomsState(itemId=" + this.f163121b + ", isInitial=" + this.f163122c + ", data=" + this.f163123d + ", filters=" + this.f163124e + ", treeParent=" + this.f163125f + ", openedGalleryRoomId=" + this.f163126g + ", galleryPositions=" + this.f163127h + ", bookingExpandedIds=" + this.f163128i + ", loadingState=" + this.f163129j + ", viewState=" + this.f163130k + ')';
    }
}
