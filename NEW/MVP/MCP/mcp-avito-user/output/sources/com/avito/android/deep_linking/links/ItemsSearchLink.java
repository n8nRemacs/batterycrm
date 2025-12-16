package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.remote.model.search.map.Area;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;
import q50.InterfaceC47204b;

/* compiled from: ItemsSearchLink.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/ItemsSearchLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "Lcom/avito/android/deep_linking/links/s;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class ItemsSearchLink extends PublicDeeplink implements s {

    @Y61.k
    public static final Parcelable.Creator<ItemsSearchLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SearchParams f133403b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133404c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Area f133405d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Area f133406e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f133407f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Float f133408g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f133409h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f133410i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f133411j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f133412k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final PresentationType f133413l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final String f133414m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f133415n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final SerpSpaceType f133416o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f133417p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final String f133418q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f133419r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final String f133420s;

    /* compiled from: ItemsSearchLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ItemsSearchLink> {
        @Override // android.os.Parcelable.Creator
        public final ItemsSearchLink createFromParcel(Parcel parcel) {
            return new ItemsSearchLink(SearchParams.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Area.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Area.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, PresentationType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? SerpSpaceType.valueOf(parcel.readString()) : null, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ItemsSearchLink[] newArray(int i12) {
            return new ItemsSearchLink[i12];
        }
    }

    public /* synthetic */ ItemsSearchLink(SearchParams searchParams, String str, Area area, Area area2, String str2, Float f12, String str3, String str4, String str5, boolean z12, PresentationType presentationType, String str6, boolean z13, SerpSpaceType serpSpaceType, boolean z14, String str7, boolean z15, String str8, int i12, C42822w c42822w) {
        this(searchParams, str, area, area2, str2, f12, str3, (i12 & 128) != 0 ? null : str4, (i12 & 256) != 0 ? null : str5, (i12 & 512) != 0 ? false : z12, presentationType, (i12 & 2048) != 0 ? null : str6, (i12 & 4096) != 0 ? false : z13, (i12 & 8192) != 0 ? null : serpSpaceType, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? true : z14, (32768 & i12) != 0 ? null : str7, (65536 & i12) != 0 ? false : z15, (i12 & 131072) != 0 ? null : str8);
    }

    public static ItemsSearchLink a(ItemsSearchLink itemsSearchLink, SearchParams searchParams, String str, String str2, String str3, int i12) {
        boolean z12;
        String str4;
        SearchParams searchParams2 = (i12 & 1) != 0 ? itemsSearchLink.f133403b : searchParams;
        String str5 = itemsSearchLink.f133404c;
        Area area = itemsSearchLink.f133405d;
        Area area2 = (i12 & 8) != 0 ? itemsSearchLink.f133406e : null;
        String str6 = (i12 & 16) != 0 ? itemsSearchLink.f133407f : str;
        Float f12 = (i12 & 32) != 0 ? itemsSearchLink.f133408g : null;
        String str7 = (i12 & 64) != 0 ? itemsSearchLink.f133409h : str2;
        String str8 = itemsSearchLink.f133410i;
        String str9 = itemsSearchLink.f133411j;
        boolean z13 = itemsSearchLink.f133412k;
        PresentationType presentationType = itemsSearchLink.f133413l;
        String str10 = itemsSearchLink.f133414m;
        boolean z14 = itemsSearchLink.f133415n;
        SerpSpaceType serpSpaceType = itemsSearchLink.f133416o;
        boolean z15 = itemsSearchLink.f133417p;
        String str11 = itemsSearchLink.f133418q;
        boolean z16 = itemsSearchLink.f133419r;
        if ((i12 & 131072) != 0) {
            z12 = z15;
            str4 = itemsSearchLink.f133420s;
        } else {
            z12 = z15;
            str4 = str3;
        }
        itemsSearchLink.getClass();
        return new ItemsSearchLink(searchParams2, str5, area, area2, str6, f12, str7, str8, str9, z13, presentationType, str10, z14, serpSpaceType, z12, str11, z16, str4);
    }

    @Y61.k
    /* renamed from: W, reason: from getter */
    public final SearchParams getF133403b() {
        return this.f133403b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemsSearchLink)) {
            return false;
        }
        ItemsSearchLink itemsSearchLink = (ItemsSearchLink) obj;
        return kotlin.jvm.internal.L.f(this.f133403b, itemsSearchLink.f133403b) && kotlin.jvm.internal.L.f(this.f133404c, itemsSearchLink.f133404c) && kotlin.jvm.internal.L.f(this.f133405d, itemsSearchLink.f133405d) && kotlin.jvm.internal.L.f(this.f133406e, itemsSearchLink.f133406e) && kotlin.jvm.internal.L.f(this.f133407f, itemsSearchLink.f133407f) && kotlin.jvm.internal.L.f(this.f133408g, itemsSearchLink.f133408g) && kotlin.jvm.internal.L.f(this.f133409h, itemsSearchLink.f133409h) && kotlin.jvm.internal.L.f(this.f133410i, itemsSearchLink.f133410i) && kotlin.jvm.internal.L.f(this.f133411j, itemsSearchLink.f133411j) && this.f133412k == itemsSearchLink.f133412k && this.f133413l == itemsSearchLink.f133413l && kotlin.jvm.internal.L.f(this.f133414m, itemsSearchLink.f133414m) && this.f133415n == itemsSearchLink.f133415n && this.f133416o == itemsSearchLink.f133416o && this.f133417p == itemsSearchLink.f133417p && kotlin.jvm.internal.L.f(this.f133418q, itemsSearchLink.f133418q) && this.f133419r == itemsSearchLink.f133419r && kotlin.jvm.internal.L.f(this.f133420s, itemsSearchLink.f133420s);
    }

    @Override // com.avito.android.deep_linking.links.s
    @Y61.l
    public final String getLocationId() {
        return this.f133403b.getLocationId();
    }

    public final int hashCode() {
        int iHashCode = this.f133403b.hashCode() * 31;
        String str = this.f133404c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Area area = this.f133405d;
        int iHashCode3 = (iHashCode2 + (area == null ? 0 : area.hashCode())) * 31;
        Area area2 = this.f133406e;
        int iHashCode4 = (iHashCode3 + (area2 == null ? 0 : area2.hashCode())) * 31;
        String str2 = this.f133407f;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f12 = this.f133408g;
        int iHashCode6 = (iHashCode5 + (f12 == null ? 0 : f12.hashCode())) * 31;
        String str3 = this.f133409h;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f133410i;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f133411j;
        int iHashCode9 = (this.f133413l.hashCode() + androidx.appcompat.app.r.i((iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f133412k)) * 31;
        String str6 = this.f133414m;
        int i12 = androidx.appcompat.app.r.i((iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.f133415n);
        SerpSpaceType serpSpaceType = this.f133416o;
        int i13 = androidx.appcompat.app.r.i((i12 + (serpSpaceType == null ? 0 : serpSpaceType.hashCode())) * 31, 31, this.f133417p);
        String str7 = this.f133418q;
        int i14 = androidx.appcompat.app.r.i((i13 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.f133419r);
        String str8 = this.f133420s;
        return i14 + (str8 != null ? str8.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemsSearchLink(searchParams=");
        sb2.append(this.f133403b);
        sb2.append(", context=");
        sb2.append(this.f133404c);
        sb2.append(", searchArea=");
        sb2.append(this.f133405d);
        sb2.append(", mapArea=");
        sb2.append(this.f133406e);
        sb2.append(", mapSerpState=");
        sb2.append(this.f133407f);
        sb2.append(", mapZoomLevel=");
        sb2.append(this.f133408g);
        sb2.append(", fromPage=");
        sb2.append(this.f133409h);
        sb2.append(", expanded=");
        sb2.append(this.f133410i);
        sb2.append(", sellerId=");
        sb2.append(this.f133411j);
        sb2.append(", showOver=");
        sb2.append(this.f133412k);
        sb2.append(", presentationType=");
        sb2.append(this.f133413l);
        sb2.append(", onboardingId=");
        sb2.append(this.f133414m);
        sb2.append(", replaceCurrent=");
        sb2.append(this.f133415n);
        sb2.append(", serpSpaceType=");
        sb2.append(this.f133416o);
        sb2.append(", showNavigation=");
        sb2.append(this.f133417p);
        sb2.append(", pageTitle=");
        sb2.append(this.f133418q);
        sb2.append(", autoOpenSuggest=");
        sb2.append(this.f133419r);
        sb2.append(", suggestLocationId=");
        return C22026a.c(sb2, this.f133420s, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f133403b.writeToParcel(parcel, i12);
        parcel.writeString(this.f133404c);
        Area area = this.f133405d;
        if (area == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            area.writeToParcel(parcel, i12);
        }
        Area area2 = this.f133406e;
        if (area2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            area2.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f133407f);
        Float f12 = this.f133408g;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        parcel.writeString(this.f133409h);
        parcel.writeString(this.f133410i);
        parcel.writeString(this.f133411j);
        parcel.writeInt(this.f133412k ? 1 : 0);
        parcel.writeString(this.f133413l.name());
        parcel.writeString(this.f133414m);
        parcel.writeInt(this.f133415n ? 1 : 0);
        SerpSpaceType serpSpaceType = this.f133416o;
        if (serpSpaceType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(serpSpaceType.name());
        }
        parcel.writeInt(this.f133417p ? 1 : 0);
        parcel.writeString(this.f133418q);
        parcel.writeInt(this.f133419r ? 1 : 0);
        parcel.writeString(this.f133420s);
    }

    public ItemsSearchLink(@Y61.k SearchParams searchParams, @Y61.l String str, @Y61.l Area area, @Y61.l Area area2, @Y61.l String str2, @Y61.l Float f12, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, boolean z12, @Y61.k PresentationType presentationType, @Y61.l String str6, boolean z13, @Y61.l SerpSpaceType serpSpaceType, boolean z14, @Y61.l String str7, boolean z15, @Y61.l String str8) {
        this.f133403b = searchParams;
        this.f133404c = str;
        this.f133405d = area;
        this.f133406e = area2;
        this.f133407f = str2;
        this.f133408g = f12;
        this.f133409h = str3;
        this.f133410i = str4;
        this.f133411j = str5;
        this.f133412k = z12;
        this.f133413l = presentationType;
        this.f133414m = str6;
        this.f133415n = z13;
        this.f133416o = serpSpaceType;
        this.f133417p = z14;
        this.f133418q = str7;
        this.f133419r = z15;
        this.f133420s = str8;
    }
}
