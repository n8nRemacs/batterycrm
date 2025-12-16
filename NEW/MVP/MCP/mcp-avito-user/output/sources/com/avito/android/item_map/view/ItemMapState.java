package com.avito.android.item_map.view;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.LocationMap;
import com.avito.android.remote.model.MultiAddressesInfo;
import com.avito.android.remote.model.RouteButtons;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.remote.model.developments_catalog.AmenityButton;
import com.avito.android.remote.model.seller_addresses.SellerAddressesInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_address_public.api.MultiAddressesItem;
import com.avito.android.util.Kundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: ItemMapState.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/item_map/view/ItemMapState;", "Landroid/os/Parcelable;", "AmenityButtonsState", "BottomSheetState", "BottomSheetVisibility", "GeoZonesRequest", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ItemMapState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ItemMapState> CREATOR = new a();

    /* renamed from: A, reason: collision with root package name */
    public final boolean f173426A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public final String f173427B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public final Boolean f173428C;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f173429b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AvitoMapPoint f173430c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final MultiAddressesInfo f173431d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final MultiAddressesItem f173432e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f173433f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Location f173434g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f173435h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f173436i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final BottomSheetState f173437j;

    /* renamed from: k, reason: collision with root package name */
    public final float f173438k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final AvitoMapPoint f173439l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final AmenityButtonsState f173440m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f173441n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final RouteButtons f173442o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f173443p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final String f173444q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f173445r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f173446s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final TreeClickStreamParent f173447t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final Kundle f173448u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final List<List<AvitoMapPoint>> f173449v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final List<AvitoMapPoint> f173450w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final AttributedText f173451x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public final GeoZonesRequest f173452y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public final Float f173453z;

    /* compiled from: ItemMapState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/view/ItemMapState$AmenityButtonsState;", "Landroid/os/Parcelable;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AmenityButtonsState implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<AmenityButtonsState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final List<AmenityButton> f173454b;

        /* compiled from: ItemMapState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AmenityButtonsState> {
            @Override // android.os.Parcelable.Creator
            public final AmenityButtonsState createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(AmenityButtonsState.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new AmenityButtonsState(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AmenityButtonsState[] newArray(int i12) {
                return new AmenityButtonsState[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AmenityButtonsState() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AmenityButtonsState) && kotlin.jvm.internal.L.f(this.f173454b, ((AmenityButtonsState) obj).f173454b);
        }

        public final int hashCode() {
            List<AmenityButton> list = this.f173454b;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.foundation.H.p(new StringBuilder("AmenityButtonsState(amenityButtons="), this.f173454b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            List<AmenityButton> list = this.f173454b;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }

        public AmenityButtonsState(@Y61.l List<AmenityButton> list) {
            this.f173454b = list;
        }

        public /* synthetic */ AmenityButtonsState(List list, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : list);
        }
    }

    /* compiled from: ItemMapState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/view/ItemMapState$BottomSheetState;", "Landroid/os/Parcelable;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BottomSheetState implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<BottomSheetState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f173455b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final List<GeoReference> f173456c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final SellerAddressesInfo f173457d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final BottomSheetVisibility f173458e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final ContactBarData f173459f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final AdvertActions f173460g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final LocationMap.BottomButton f173461h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final String f173462i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f173463j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final AttributedText f173464k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f173465l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f173466m;

        /* compiled from: ItemMapState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BottomSheetState> {
            @Override // android.os.Parcelable.Creator
            public final BottomSheetState createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BottomSheetState.class, parcel, arrayList, iL2, 1);
                }
                return new BottomSheetState(string, arrayList, (SellerAddressesInfo) parcel.readParcelable(BottomSheetState.class.getClassLoader()), (BottomSheetVisibility) parcel.readParcelable(BottomSheetState.class.getClassLoader()), (ContactBarData) parcel.readParcelable(BottomSheetState.class.getClassLoader()), (AdvertActions) parcel.readParcelable(BottomSheetState.class.getClassLoader()), (LocationMap.BottomButton) parcel.readParcelable(BottomSheetState.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, (AttributedText) parcel.readParcelable(BottomSheetState.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final BottomSheetState[] newArray(int i12) {
                return new BottomSheetState[i12];
            }
        }

        public BottomSheetState() {
            this(null, null, null, null, null, null, null, null, false, null, false, false, 4095, null);
        }

        public static BottomSheetState a(BottomSheetState bottomSheetState, BottomSheetVisibility bottomSheetVisibility, AttributedText attributedText, boolean z12, int i12) {
            String str = bottomSheetState.f173455b;
            List<GeoReference> list = bottomSheetState.f173456c;
            SellerAddressesInfo sellerAddressesInfo = bottomSheetState.f173457d;
            BottomSheetVisibility bottomSheetVisibility2 = (i12 & 8) != 0 ? bottomSheetState.f173458e : bottomSheetVisibility;
            ContactBarData contactBarData = bottomSheetState.f173459f;
            AdvertActions advertActions = bottomSheetState.f173460g;
            LocationMap.BottomButton bottomButton = bottomSheetState.f173461h;
            String str2 = bottomSheetState.f173462i;
            boolean z13 = bottomSheetState.f173463j;
            AttributedText attributedText2 = (i12 & 512) != 0 ? bottomSheetState.f173464k : attributedText;
            boolean z14 = (i12 & 1024) != 0 ? bottomSheetState.f173465l : z12;
            boolean z15 = bottomSheetState.f173466m;
            bottomSheetState.getClass();
            return new BottomSheetState(str, list, sellerAddressesInfo, bottomSheetVisibility2, contactBarData, advertActions, bottomButton, str2, z13, attributedText2, z14, z15);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BottomSheetState)) {
                return false;
            }
            BottomSheetState bottomSheetState = (BottomSheetState) obj;
            return kotlin.jvm.internal.L.f(this.f173455b, bottomSheetState.f173455b) && kotlin.jvm.internal.L.f(this.f173456c, bottomSheetState.f173456c) && kotlin.jvm.internal.L.f(this.f173457d, bottomSheetState.f173457d) && kotlin.jvm.internal.L.f(this.f173458e, bottomSheetState.f173458e) && kotlin.jvm.internal.L.f(this.f173459f, bottomSheetState.f173459f) && kotlin.jvm.internal.L.f(this.f173460g, bottomSheetState.f173460g) && kotlin.jvm.internal.L.f(this.f173461h, bottomSheetState.f173461h) && kotlin.jvm.internal.L.f(this.f173462i, bottomSheetState.f173462i) && this.f173463j == bottomSheetState.f173463j && kotlin.jvm.internal.L.f(this.f173464k, bottomSheetState.f173464k) && this.f173465l == bottomSheetState.f173465l && this.f173466m == bottomSheetState.f173466m;
        }

        public final int hashCode() {
            int iE2 = androidx.compose.foundation.H.e(this.f173455b.hashCode() * 31, 31, this.f173456c);
            SellerAddressesInfo sellerAddressesInfo = this.f173457d;
            int iHashCode = (this.f173458e.hashCode() + ((iE2 + (sellerAddressesInfo == null ? 0 : sellerAddressesInfo.hashCode())) * 31)) * 31;
            ContactBarData contactBarData = this.f173459f;
            int iHashCode2 = (iHashCode + (contactBarData == null ? 0 : contactBarData.hashCode())) * 31;
            AdvertActions advertActions = this.f173460g;
            int iHashCode3 = (iHashCode2 + (advertActions == null ? 0 : advertActions.hashCode())) * 31;
            LocationMap.BottomButton bottomButton = this.f173461h;
            int iHashCode4 = (iHashCode3 + (bottomButton == null ? 0 : bottomButton.hashCode())) * 31;
            String str = this.f173462i;
            int i12 = androidx.appcompat.app.r.i((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f173463j);
            AttributedText attributedText = this.f173464k;
            return Boolean.hashCode(this.f173466m) + androidx.appcompat.app.r.i((i12 + (attributedText != null ? attributedText.hashCode() : 0)) * 31, 31, this.f173465l);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BottomSheetState(address=");
            sb2.append(this.f173455b);
            sb2.append(", geoReferences=");
            sb2.append(this.f173456c);
            sb2.append(", sellerAddressesInfo=");
            sb2.append(this.f173457d);
            sb2.append(", bottomSheetVisibility=");
            sb2.append(this.f173458e);
            sb2.append(", contactBarData=");
            sb2.append(this.f173459f);
            sb2.append(", advertActions=");
            sb2.append(this.f173460g);
            sb2.append(", customAdvertAction=");
            sb2.append(this.f173461h);
            sb2.append(", searchContext=");
            sb2.append(this.f173462i);
            sb2.append(", shouldShowImportantAddresses=");
            sb2.append(this.f173463j);
            sb2.append(", geoZonesDeparture=");
            sb2.append(this.f173464k);
            sb2.append(", isGeoZonesLoading=");
            sb2.append(this.f173465l);
            sb2.append(", copyAddressOnClick=");
            return androidx.appcompat.app.r.x(sb2, this.f173466m, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f173455b);
            Iterator itJ = C0.j(this.f173456c, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
            parcel.writeParcelable(this.f173457d, i12);
            parcel.writeParcelable(this.f173458e, i12);
            parcel.writeParcelable(this.f173459f, i12);
            parcel.writeParcelable(this.f173460g, i12);
            parcel.writeParcelable(this.f173461h, i12);
            parcel.writeString(this.f173462i);
            parcel.writeInt(this.f173463j ? 1 : 0);
            parcel.writeParcelable(this.f173464k, i12);
            parcel.writeInt(this.f173465l ? 1 : 0);
            parcel.writeInt(this.f173466m ? 1 : 0);
        }

        public BottomSheetState(@Y61.k String str, @Y61.k List<GeoReference> list, @Y61.l SellerAddressesInfo sellerAddressesInfo, @Y61.k BottomSheetVisibility bottomSheetVisibility, @Y61.l ContactBarData contactBarData, @Y61.l AdvertActions advertActions, @Y61.l LocationMap.BottomButton bottomButton, @Y61.l String str2, boolean z12, @Y61.l AttributedText attributedText, boolean z13, boolean z14) {
            this.f173455b = str;
            this.f173456c = list;
            this.f173457d = sellerAddressesInfo;
            this.f173458e = bottomSheetVisibility;
            this.f173459f = contactBarData;
            this.f173460g = advertActions;
            this.f173461h = bottomButton;
            this.f173462i = str2;
            this.f173463j = z12;
            this.f173464k = attributedText;
            this.f173465l = z13;
            this.f173466m = z14;
        }

        public BottomSheetState(String str, List list, SellerAddressesInfo sellerAddressesInfo, BottomSheetVisibility bottomSheetVisibility, ContactBarData contactBarData, AdvertActions advertActions, LocationMap.BottomButton bottomButton, String str2, boolean z12, AttributedText attributedText, boolean z13, boolean z14, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? C42784z0.f406748b : list, (i12 & 4) != 0 ? null : sellerAddressesInfo, (i12 & 8) != 0 ? BottomSheetVisibility.Expanded.f173468b : bottomSheetVisibility, (i12 & 16) != 0 ? null : contactBarData, (i12 & 32) != 0 ? null : advertActions, (i12 & 64) != 0 ? null : bottomButton, (i12 & 128) != 0 ? null : str2, (i12 & 256) != 0 ? false : z12, (i12 & 512) == 0 ? attributedText : null, (i12 & 1024) != 0 ? false : z13, (i12 & 2048) == 0 ? z14 : false);
        }
    }

    /* compiled from: ItemMapState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/item_map/view/ItemMapState$BottomSheetVisibility;", "Landroid/os/Parcelable;", "()V", "Collapsed", "Expanded", "HalfExpanded", "Lcom/avito/android/item_map/view/ItemMapState$BottomSheetVisibility$Collapsed;", "Lcom/avito/android/item_map/view/ItemMapState$BottomSheetVisibility$Expanded;", "Lcom/avito/android/item_map/view/ItemMapState$BottomSheetVisibility$HalfExpanded;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static abstract class BottomSheetVisibility implements Parcelable {

        /* compiled from: ItemMapState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/item_map/view/ItemMapState$BottomSheetVisibility$Collapsed;", "Lcom/avito/android/item_map/view/ItemMapState$BottomSheetVisibility;", "<init>", "()V", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Collapsed extends BottomSheetVisibility {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final Collapsed f173467b = new Collapsed();

            @Y61.k
            public static final Parcelable.Creator<Collapsed> CREATOR = new a();

            /* compiled from: ItemMapState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Collapsed> {
                @Override // android.os.Parcelable.Creator
                public final Collapsed createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Collapsed.f173467b;
                }

                @Override // android.os.Parcelable.Creator
                public final Collapsed[] newArray(int i12) {
                    return new Collapsed[i12];
                }
            }

            public Collapsed() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof Collapsed);
            }

            public final int hashCode() {
                return -1845268385;
            }

            @Y61.k
            public final String toString() {
                return "Collapsed";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: ItemMapState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/item_map/view/ItemMapState$BottomSheetVisibility$Expanded;", "Lcom/avito/android/item_map/view/ItemMapState$BottomSheetVisibility;", "<init>", "()V", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Expanded extends BottomSheetVisibility {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final Expanded f173468b = new Expanded();

            @Y61.k
            public static final Parcelable.Creator<Expanded> CREATOR = new a();

            /* compiled from: ItemMapState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Expanded> {
                @Override // android.os.Parcelable.Creator
                public final Expanded createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Expanded.f173468b;
                }

                @Override // android.os.Parcelable.Creator
                public final Expanded[] newArray(int i12) {
                    return new Expanded[i12];
                }
            }

            public Expanded() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof Expanded);
            }

            public final int hashCode() {
                return 1681501617;
            }

            @Y61.k
            public final String toString() {
                return "Expanded";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: ItemMapState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/item_map/view/ItemMapState$BottomSheetVisibility$HalfExpanded;", "Lcom/avito/android/item_map/view/ItemMapState$BottomSheetVisibility;", "<init>", "()V", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class HalfExpanded extends BottomSheetVisibility {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final HalfExpanded f173469b = new HalfExpanded();

            @Y61.k
            public static final Parcelable.Creator<HalfExpanded> CREATOR = new a();

            /* compiled from: ItemMapState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<HalfExpanded> {
                @Override // android.os.Parcelable.Creator
                public final HalfExpanded createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return HalfExpanded.f173469b;
                }

                @Override // android.os.Parcelable.Creator
                public final HalfExpanded[] newArray(int i12) {
                    return new HalfExpanded[i12];
                }
            }

            public HalfExpanded() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof HalfExpanded);
            }

            public final int hashCode() {
                return -1949453564;
            }

            @Y61.k
            public final String toString() {
                return "HalfExpanded";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ BottomSheetVisibility(C42822w c42822w) {
            this();
        }

        public BottomSheetVisibility() {
        }
    }

    /* compiled from: ItemMapState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/view/ItemMapState$GeoZonesRequest;", "Landroid/os/Parcelable;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GeoZonesRequest implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<GeoZonesRequest> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f173470b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final List<String> f173471c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final List<String> f173472d;

        /* compiled from: ItemMapState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GeoZonesRequest> {
            @Override // android.os.Parcelable.Creator
            public final GeoZonesRequest createFromParcel(Parcel parcel) {
                return new GeoZonesRequest(parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final GeoZonesRequest[] newArray(int i12) {
                return new GeoZonesRequest[i12];
            }
        }

        public GeoZonesRequest(@Y61.k String str, @Y61.l List<String> list, @Y61.l List<String> list2) {
            this.f173470b = str;
            this.f173471c = list;
            this.f173472d = list2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GeoZonesRequest)) {
                return false;
            }
            GeoZonesRequest geoZonesRequest = (GeoZonesRequest) obj;
            return kotlin.jvm.internal.L.f(this.f173470b, geoZonesRequest.f173470b) && kotlin.jvm.internal.L.f(this.f173471c, geoZonesRequest.f173471c) && kotlin.jvm.internal.L.f(this.f173472d, geoZonesRequest.f173472d);
        }

        public final int hashCode() {
            int iHashCode = this.f173470b.hashCode() * 31;
            List<String> list = this.f173471c;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.f173472d;
            return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GeoZonesRequest(locationId=");
            sb2.append(this.f173470b);
            sb2.append(", districtIds=");
            sb2.append(this.f173471c);
            sb2.append(", metroIds=");
            return androidx.compose.foundation.H.p(sb2, this.f173472d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f173470b);
            parcel.writeStringList(this.f173471c);
            parcel.writeStringList(this.f173472d);
        }
    }

    /* compiled from: ItemMapState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ItemMapState> {
        @Override // android.os.Parcelable.Creator
        public final ItemMapState createFromParcel(Parcel parcel) {
            float f12;
            AvitoMapPoint avitoMapPoint;
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean boolValueOf;
            String string = parcel.readString();
            AvitoMapPoint avitoMapPoint2 = (AvitoMapPoint) parcel.readParcelable(ItemMapState.class.getClassLoader());
            MultiAddressesInfo multiAddressesInfo = (MultiAddressesInfo) parcel.readParcelable(ItemMapState.class.getClassLoader());
            MultiAddressesItem multiAddressesItem = (MultiAddressesItem) parcel.readParcelable(ItemMapState.class.getClassLoader());
            boolean z12 = parcel.readInt() != 0;
            Location location = (Location) parcel.readParcelable(ItemMapState.class.getClassLoader());
            boolean z13 = parcel.readInt() != 0;
            String string2 = parcel.readString();
            BottomSheetState bottomSheetStateCreateFromParcel = parcel.readInt() == 0 ? null : BottomSheetState.CREATOR.createFromParcel(parcel);
            float f13 = parcel.readFloat();
            AvitoMapPoint avitoMapPoint3 = (AvitoMapPoint) parcel.readParcelable(ItemMapState.class.getClassLoader());
            AmenityButtonsState amenityButtonsStateCreateFromParcel = parcel.readInt() == 0 ? null : AmenityButtonsState.CREATOR.createFromParcel(parcel);
            boolean z14 = parcel.readInt() != 0;
            RouteButtons routeButtons = (RouteButtons) parcel.readParcelable(ItemMapState.class.getClassLoader());
            boolean z15 = parcel.readInt() != 0;
            String string3 = parcel.readString();
            boolean z16 = parcel.readInt() != 0;
            boolean z17 = parcel.readInt() != 0;
            TreeClickStreamParent treeClickStreamParent = (TreeClickStreamParent) parcel.readParcelable(ItemMapState.class.getClassLoader());
            Kundle kundle = (Kundle) parcel.readParcelable(ItemMapState.class.getClassLoader());
            if (parcel.readInt() == 0) {
                f12 = f13;
                avitoMapPoint = avitoMapPoint3;
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                int i13 = 0;
                while (i13 != i12) {
                    int i14 = i12;
                    int i15 = parcel.readInt();
                    AvitoMapPoint avitoMapPoint4 = avitoMapPoint3;
                    ArrayList arrayList4 = new ArrayList(i15);
                    float f14 = f13;
                    int iL2 = 0;
                    while (iL2 != i15) {
                        iL2 = com.avito.android.actions_sheet.a.l(ItemMapState.class, parcel, arrayList4, iL2, 1);
                        i15 = i15;
                    }
                    arrayList3.add(arrayList4);
                    i13++;
                    i12 = i14;
                    avitoMapPoint3 = avitoMapPoint4;
                    f13 = f14;
                }
                f12 = f13;
                avitoMapPoint = avitoMapPoint3;
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i16 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i16);
                int iL3 = 0;
                while (iL3 != i16) {
                    iL3 = com.avito.android.actions_sheet.a.l(ItemMapState.class, parcel, arrayList5, iL3, 1);
                }
                arrayList2 = arrayList5;
            }
            AttributedText attributedText = (AttributedText) parcel.readParcelable(ItemMapState.class.getClassLoader());
            GeoZonesRequest geoZonesRequestCreateFromParcel = parcel.readInt() == 0 ? null : GeoZonesRequest.CREATOR.createFromParcel(parcel);
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            boolean z18 = parcel.readInt() != 0;
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ItemMapState(string, avitoMapPoint2, multiAddressesInfo, multiAddressesItem, z12, location, z13, string2, bottomSheetStateCreateFromParcel, f12, avitoMapPoint, amenityButtonsStateCreateFromParcel, z14, routeButtons, z15, string3, z16, z17, treeClickStreamParent, kundle, arrayList, arrayList2, attributedText, geoZonesRequestCreateFromParcel, fValueOf, z18, string4, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ItemMapState[] newArray(int i12) {
            return new ItemMapState[i12];
        }
    }

    public ItemMapState() {
        this(null, null, null, null, false, null, false, null, null, 0.0f, null, null, false, null, false, null, false, false, null, null, null, null, null, null, null, false, null, null, 268435455, null);
    }

    public static ItemMapState a(ItemMapState itemMapState, Location location, boolean z12, BottomSheetState bottomSheetState, float f12, AvitoMapPoint avitoMapPoint, boolean z13, boolean z14, int i12) {
        String str;
        boolean z15;
        String str2 = itemMapState.f173429b;
        AvitoMapPoint avitoMapPoint2 = itemMapState.f173430c;
        MultiAddressesInfo multiAddressesInfo = itemMapState.f173431d;
        MultiAddressesItem multiAddressesItem = itemMapState.f173432e;
        boolean z16 = itemMapState.f173433f;
        Location location2 = (i12 & 32) != 0 ? itemMapState.f173434g : location;
        boolean z17 = (i12 & 64) != 0 ? itemMapState.f173435h : z12;
        String str3 = itemMapState.f173436i;
        BottomSheetState bottomSheetState2 = (i12 & 256) != 0 ? itemMapState.f173437j : bottomSheetState;
        float f13 = (i12 & 512) != 0 ? itemMapState.f173438k : f12;
        AvitoMapPoint avitoMapPoint3 = (i12 & 1024) != 0 ? itemMapState.f173439l : avitoMapPoint;
        AmenityButtonsState amenityButtonsState = itemMapState.f173440m;
        boolean z18 = itemMapState.f173441n;
        RouteButtons routeButtons = itemMapState.f173442o;
        boolean z19 = itemMapState.f173443p;
        String str4 = itemMapState.f173444q;
        if ((i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0) {
            str = str4;
            z15 = itemMapState.f173445r;
        } else {
            str = str4;
            z15 = z13;
        }
        boolean z22 = (i12 & 131072) != 0 ? itemMapState.f173446s : z14;
        TreeClickStreamParent treeClickStreamParent = itemMapState.f173447t;
        Kundle kundle = itemMapState.f173448u;
        List<List<AvitoMapPoint>> list = itemMapState.f173449v;
        List<AvitoMapPoint> list2 = itemMapState.f173450w;
        AttributedText attributedText = itemMapState.f173451x;
        GeoZonesRequest geoZonesRequest = itemMapState.f173452y;
        Float f14 = itemMapState.f173453z;
        boolean z23 = itemMapState.f173426A;
        String str5 = itemMapState.f173427B;
        Boolean bool = itemMapState.f173428C;
        itemMapState.getClass();
        return new ItemMapState(str2, avitoMapPoint2, multiAddressesInfo, multiAddressesItem, z16, location2, z17, str3, bottomSheetState2, f13, avitoMapPoint3, amenityButtonsState, z18, routeButtons, z19, str, z15, z22, treeClickStreamParent, kundle, list, list2, attributedText, geoZonesRequest, f14, z23, str5, bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemMapState)) {
            return false;
        }
        ItemMapState itemMapState = (ItemMapState) obj;
        return kotlin.jvm.internal.L.f(this.f173429b, itemMapState.f173429b) && kotlin.jvm.internal.L.f(this.f173430c, itemMapState.f173430c) && kotlin.jvm.internal.L.f(this.f173431d, itemMapState.f173431d) && kotlin.jvm.internal.L.f(this.f173432e, itemMapState.f173432e) && this.f173433f == itemMapState.f173433f && kotlin.jvm.internal.L.f(this.f173434g, itemMapState.f173434g) && this.f173435h == itemMapState.f173435h && kotlin.jvm.internal.L.f(this.f173436i, itemMapState.f173436i) && kotlin.jvm.internal.L.f(this.f173437j, itemMapState.f173437j) && Float.compare(this.f173438k, itemMapState.f173438k) == 0 && kotlin.jvm.internal.L.f(this.f173439l, itemMapState.f173439l) && kotlin.jvm.internal.L.f(this.f173440m, itemMapState.f173440m) && this.f173441n == itemMapState.f173441n && kotlin.jvm.internal.L.f(this.f173442o, itemMapState.f173442o) && this.f173443p == itemMapState.f173443p && kotlin.jvm.internal.L.f(this.f173444q, itemMapState.f173444q) && this.f173445r == itemMapState.f173445r && this.f173446s == itemMapState.f173446s && kotlin.jvm.internal.L.f(this.f173447t, itemMapState.f173447t) && kotlin.jvm.internal.L.f(this.f173448u, itemMapState.f173448u) && kotlin.jvm.internal.L.f(this.f173449v, itemMapState.f173449v) && kotlin.jvm.internal.L.f(this.f173450w, itemMapState.f173450w) && kotlin.jvm.internal.L.f(this.f173451x, itemMapState.f173451x) && kotlin.jvm.internal.L.f(this.f173452y, itemMapState.f173452y) && kotlin.jvm.internal.L.f(this.f173453z, itemMapState.f173453z) && this.f173426A == itemMapState.f173426A && kotlin.jvm.internal.L.f(this.f173427B, itemMapState.f173427B) && kotlin.jvm.internal.L.f(this.f173428C, itemMapState.f173428C);
    }

    public final int hashCode() {
        String str = this.f173429b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AvitoMapPoint avitoMapPoint = this.f173430c;
        int iHashCode2 = (iHashCode + (avitoMapPoint == null ? 0 : avitoMapPoint.hashCode())) * 31;
        MultiAddressesInfo multiAddressesInfo = this.f173431d;
        int iHashCode3 = (iHashCode2 + (multiAddressesInfo == null ? 0 : multiAddressesInfo.hashCode())) * 31;
        MultiAddressesItem multiAddressesItem = this.f173432e;
        int i12 = androidx.appcompat.app.r.i((iHashCode3 + (multiAddressesItem == null ? 0 : multiAddressesItem.hashCode())) * 31, 31, this.f173433f);
        Location location = this.f173434g;
        int i13 = androidx.appcompat.app.r.i((i12 + (location == null ? 0 : location.hashCode())) * 31, 31, this.f173435h);
        String str2 = this.f173436i;
        int iHashCode4 = (i13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BottomSheetState bottomSheetState = this.f173437j;
        int iD2 = androidx.appcompat.app.r.d(this.f173438k, (iHashCode4 + (bottomSheetState == null ? 0 : bottomSheetState.hashCode())) * 31, 31);
        AvitoMapPoint avitoMapPoint2 = this.f173439l;
        int iHashCode5 = (iD2 + (avitoMapPoint2 == null ? 0 : avitoMapPoint2.hashCode())) * 31;
        AmenityButtonsState amenityButtonsState = this.f173440m;
        int i14 = androidx.appcompat.app.r.i((iHashCode5 + (amenityButtonsState == null ? 0 : amenityButtonsState.hashCode())) * 31, 31, this.f173441n);
        RouteButtons routeButtons = this.f173442o;
        int i15 = androidx.appcompat.app.r.i((i14 + (routeButtons == null ? 0 : routeButtons.hashCode())) * 31, 31, this.f173443p);
        String str3 = this.f173444q;
        int i16 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((i15 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f173445r), 31, this.f173446s);
        TreeClickStreamParent treeClickStreamParent = this.f173447t;
        int iHashCode6 = (i16 + (treeClickStreamParent == null ? 0 : treeClickStreamParent.hashCode())) * 31;
        Kundle kundle = this.f173448u;
        int iHashCode7 = (iHashCode6 + (kundle == null ? 0 : kundle.hashCode())) * 31;
        List<List<AvitoMapPoint>> list = this.f173449v;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<AvitoMapPoint> list2 = this.f173450w;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        AttributedText attributedText = this.f173451x;
        int iHashCode10 = (iHashCode9 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        GeoZonesRequest geoZonesRequest = this.f173452y;
        int iHashCode11 = (iHashCode10 + (geoZonesRequest == null ? 0 : geoZonesRequest.hashCode())) * 31;
        Float f12 = this.f173453z;
        int i17 = androidx.appcompat.app.r.i((iHashCode11 + (f12 == null ? 0 : f12.hashCode())) * 31, 31, this.f173426A);
        String str4 = this.f173427B;
        int iHashCode12 = (i17 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f173428C;
        return iHashCode12 + (bool != null ? bool.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemMapState(itemId=");
        sb2.append(this.f173429b);
        sb2.append(", itemCoordinates=");
        sb2.append(this.f173430c);
        sb2.append(", multiAddresses=");
        sb2.append(this.f173431d);
        sb2.append(", selectedMultiAddress=");
        sb2.append(this.f173432e);
        sb2.append(", hasFindMeButton=");
        sb2.append(this.f173433f);
        sb2.append(", userLocation=");
        sb2.append(this.f173434g);
        sb2.append(", isApproximateLocation=");
        sb2.append(this.f173435h);
        sb2.append(", title=");
        sb2.append(this.f173436i);
        sb2.append(", bottomSheetState=");
        sb2.append(this.f173437j);
        sb2.append(", mapZoomLevel=");
        sb2.append(this.f173438k);
        sb2.append(", mapTargetPoint=");
        sb2.append(this.f173439l);
        sb2.append(", amenityButtonsState=");
        sb2.append(this.f173440m);
        sb2.append(", showMeOnMap=");
        sb2.append(this.f173441n);
        sb2.append(", routeButtons=");
        sb2.append(this.f173442o);
        sb2.append(", shouldTrackMapMovement=");
        sb2.append(this.f173443p);
        sb2.append(", fromPage=");
        sb2.append(this.f173444q);
        sb2.append(", isFindMeButtonClicks=");
        sb2.append(this.f173445r);
        sb2.append(", isRouteButtonClicks=");
        sb2.append(this.f173446s);
        sb2.append(", treeParent=");
        sb2.append(this.f173447t);
        sb2.append(", dealConfirmationState=");
        sb2.append(this.f173448u);
        sb2.append(", geoZonesPolygons=");
        sb2.append(this.f173449v);
        sb2.append(", geoZonesMetroMarkers=");
        sb2.append(this.f173450w);
        sb2.append(", geoZonesDeparture=");
        sb2.append(this.f173451x);
        sb2.append(", geoZonesRequest=");
        sb2.append(this.f173452y);
        sb2.append(", zoneRadius=");
        sb2.append(this.f173453z);
        sb2.append(", withDelivery=");
        sb2.append(this.f173426A);
        sb2.append(", microCategoryId=");
        sb2.append(this.f173427B);
        sb2.append(", showOpenInAnotherAppButton=");
        return C0.g(sb2, this.f173428C, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f173429b);
        parcel.writeParcelable(this.f173430c, i12);
        parcel.writeParcelable(this.f173431d, i12);
        parcel.writeParcelable(this.f173432e, i12);
        parcel.writeInt(this.f173433f ? 1 : 0);
        parcel.writeParcelable(this.f173434g, i12);
        parcel.writeInt(this.f173435h ? 1 : 0);
        parcel.writeString(this.f173436i);
        BottomSheetState bottomSheetState = this.f173437j;
        if (bottomSheetState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bottomSheetState.writeToParcel(parcel, i12);
        }
        parcel.writeFloat(this.f173438k);
        parcel.writeParcelable(this.f173439l, i12);
        AmenityButtonsState amenityButtonsState = this.f173440m;
        if (amenityButtonsState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amenityButtonsState.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f173441n ? 1 : 0);
        parcel.writeParcelable(this.f173442o, i12);
        parcel.writeInt(this.f173443p ? 1 : 0);
        parcel.writeString(this.f173444q);
        parcel.writeInt(this.f173445r ? 1 : 0);
        parcel.writeInt(this.f173446s ? 1 : 0);
        parcel.writeParcelable(this.f173447t, i12);
        parcel.writeParcelable(this.f173448u, i12);
        List<List<AvitoMapPoint>> list = this.f173449v;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                Iterator itJ = C0.j((List) itA.next(), parcel);
                while (itJ.hasNext()) {
                    parcel.writeParcelable((Parcelable) itJ.next(), i12);
                }
            }
        }
        List<AvitoMapPoint> list2 = this.f173450w;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
        parcel.writeParcelable(this.f173451x, i12);
        GeoZonesRequest geoZonesRequest = this.f173452y;
        if (geoZonesRequest == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            geoZonesRequest.writeToParcel(parcel, i12);
        }
        Float f12 = this.f173453z;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        parcel.writeInt(this.f173426A ? 1 : 0);
        parcel.writeString(this.f173427B);
        Boolean bool = this.f173428C;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ItemMapState(@Y61.l String str, @Y61.l AvitoMapPoint avitoMapPoint, @Y61.l MultiAddressesInfo multiAddressesInfo, @Y61.l MultiAddressesItem multiAddressesItem, boolean z12, @Y61.l Location location, boolean z13, @Y61.l String str2, @Y61.l BottomSheetState bottomSheetState, float f12, @Y61.l AvitoMapPoint avitoMapPoint2, @Y61.l AmenityButtonsState amenityButtonsState, boolean z14, @Y61.l RouteButtons routeButtons, boolean z15, @Y61.l String str3, boolean z16, boolean z17, @Y61.l TreeClickStreamParent treeClickStreamParent, @Y61.l Kundle kundle, @Y61.l List<? extends List<AvitoMapPoint>> list, @Y61.l List<AvitoMapPoint> list2, @Y61.l AttributedText attributedText, @Y61.l GeoZonesRequest geoZonesRequest, @Y61.l Float f13, boolean z18, @Y61.l String str4, @Y61.l Boolean bool) {
        this.f173429b = str;
        this.f173430c = avitoMapPoint;
        this.f173431d = multiAddressesInfo;
        this.f173432e = multiAddressesItem;
        this.f173433f = z12;
        this.f173434g = location;
        this.f173435h = z13;
        this.f173436i = str2;
        this.f173437j = bottomSheetState;
        this.f173438k = f12;
        this.f173439l = avitoMapPoint2;
        this.f173440m = amenityButtonsState;
        this.f173441n = z14;
        this.f173442o = routeButtons;
        this.f173443p = z15;
        this.f173444q = str3;
        this.f173445r = z16;
        this.f173446s = z17;
        this.f173447t = treeClickStreamParent;
        this.f173448u = kundle;
        this.f173449v = list;
        this.f173450w = list2;
        this.f173451x = attributedText;
        this.f173452y = geoZonesRequest;
        this.f173453z = f13;
        this.f173426A = z18;
        this.f173427B = str4;
        this.f173428C = bool;
    }

    public /* synthetic */ ItemMapState(String str, AvitoMapPoint avitoMapPoint, MultiAddressesInfo multiAddressesInfo, MultiAddressesItem multiAddressesItem, boolean z12, Location location, boolean z13, String str2, BottomSheetState bottomSheetState, float f12, AvitoMapPoint avitoMapPoint2, AmenityButtonsState amenityButtonsState, boolean z14, RouteButtons routeButtons, boolean z15, String str3, boolean z16, boolean z17, TreeClickStreamParent treeClickStreamParent, Kundle kundle, List list, List list2, AttributedText attributedText, GeoZonesRequest geoZonesRequest, Float f13, boolean z18, String str4, Boolean bool, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : avitoMapPoint, (i12 & 4) != 0 ? null : multiAddressesInfo, (i12 & 8) != 0 ? null : multiAddressesItem, (i12 & 16) != 0 ? true : z12, (i12 & 32) != 0 ? null : location, (i12 & 64) != 0 ? false : z13, (i12 & 128) != 0 ? null : str2, (i12 & 256) != 0 ? null : bottomSheetState, (i12 & 512) != 0 ? 15.0f : f12, (i12 & 1024) != 0 ? null : avitoMapPoint2, (i12 & 2048) != 0 ? null : amenityButtonsState, (i12 & 4096) == 0 ? z14 : true, (i12 & 8192) != 0 ? null : routeButtons, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z15, (i12 & 32768) != 0 ? null : str3, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? false : z16, (i12 & 131072) != 0 ? false : z17, (i12 & 262144) != 0 ? null : treeClickStreamParent, (i12 & 524288) != 0 ? null : kundle, (i12 & 1048576) != 0 ? null : list, (i12 & 2097152) != 0 ? null : list2, (i12 & 4194304) != 0 ? null : attributedText, (i12 & 8388608) != 0 ? null : geoZonesRequest, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : f13, (i12 & 33554432) != 0 ? false : z18, (i12 & 67108864) != 0 ? null : str4, (i12 & 134217728) != 0 ? null : bool);
    }
}
