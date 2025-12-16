package com.avito.android.map;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.map_core.view.draw_button.DrawingState;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.remote.model.search.map.Area;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MapArguments.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/MapArguments;", "Landroid/os/Parcelable;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MapArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<MapArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final SearchParams f184810b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f184811c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Area f184812d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f184813e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final DrawingState f184814f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final SerpSpaceType f184815g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Float f184816h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final TreeClickStreamParent f184817i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final PresentationType f184818j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f184819k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final String f184820l;

    /* compiled from: MapArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MapArguments> {
        @Override // android.os.Parcelable.Creator
        public final MapArguments createFromParcel(Parcel parcel) {
            return new MapArguments((SearchParams) parcel.readParcelable(MapArguments.class.getClassLoader()), parcel.readString(), (Area) parcel.readParcelable(MapArguments.class.getClassLoader()), parcel.readString(), DrawingState.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : SerpSpaceType.valueOf(parcel.readString()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null, (TreeClickStreamParent) parcel.readParcelable(MapArguments.class.getClassLoader()), PresentationType.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MapArguments[] newArray(int i12) {
            return new MapArguments[i12];
        }
    }

    public MapArguments(@l SearchParams searchParams, @l String str, @l Area area, @l String str2, @k DrawingState drawingState, @l SerpSpaceType serpSpaceType, @l Float f12, @l TreeClickStreamParent treeClickStreamParent, @k PresentationType presentationType, @l String str3, @k String str4) {
        this.f184810b = searchParams;
        this.f184811c = str;
        this.f184812d = area;
        this.f184813e = str2;
        this.f184814f = drawingState;
        this.f184815g = serpSpaceType;
        this.f184816h = f12;
        this.f184817i = treeClickStreamParent;
        this.f184818j = presentationType;
        this.f184819k = str3;
        this.f184820l = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapArguments)) {
            return false;
        }
        MapArguments mapArguments = (MapArguments) obj;
        return L.f(this.f184810b, mapArguments.f184810b) && L.f(this.f184811c, mapArguments.f184811c) && L.f(this.f184812d, mapArguments.f184812d) && L.f(this.f184813e, mapArguments.f184813e) && this.f184814f == mapArguments.f184814f && this.f184815g == mapArguments.f184815g && L.f(this.f184816h, mapArguments.f184816h) && L.f(this.f184817i, mapArguments.f184817i) && this.f184818j == mapArguments.f184818j && L.f(this.f184819k, mapArguments.f184819k) && L.f(this.f184820l, mapArguments.f184820l);
    }

    public final int hashCode() {
        SearchParams searchParams = this.f184810b;
        int iHashCode = (searchParams == null ? 0 : searchParams.hashCode()) * 31;
        String str = this.f184811c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Area area = this.f184812d;
        int iHashCode3 = (iHashCode2 + (area == null ? 0 : area.hashCode())) * 31;
        String str2 = this.f184813e;
        int iHashCode4 = (this.f184814f.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        SerpSpaceType serpSpaceType = this.f184815g;
        int iHashCode5 = (iHashCode4 + (serpSpaceType == null ? 0 : serpSpaceType.hashCode())) * 31;
        Float f12 = this.f184816h;
        int iHashCode6 = (iHashCode5 + (f12 == null ? 0 : f12.hashCode())) * 31;
        TreeClickStreamParent treeClickStreamParent = this.f184817i;
        int iHashCode7 = (this.f184818j.hashCode() + ((iHashCode6 + (treeClickStreamParent == null ? 0 : treeClickStreamParent.hashCode())) * 31)) * 31;
        String str3 = this.f184819k;
        return this.f184820l.hashCode() + ((iHashCode7 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MapArguments(searchParams=");
        sb2.append(this.f184810b);
        sb2.append(", context=");
        sb2.append(this.f184811c);
        sb2.append(", area=");
        sb2.append(this.f184812d);
        sb2.append(", mapSerpState=");
        sb2.append(this.f184813e);
        sb2.append(", drawingState=");
        sb2.append(this.f184814f);
        sb2.append(", serpSpaceType=");
        sb2.append(this.f184815g);
        sb2.append(", mapZoomLevel=");
        sb2.append(this.f184816h);
        sb2.append(", treeParent=");
        sb2.append(this.f184817i);
        sb2.append(", presentationType=");
        sb2.append(this.f184818j);
        sb2.append(", fromPage=");
        sb2.append(this.f184819k);
        sb2.append(", analyticsScreenName=");
        return C22026a.c(sb2, this.f184820l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f184810b, i12);
        parcel.writeString(this.f184811c);
        parcel.writeParcelable(this.f184812d, i12);
        parcel.writeString(this.f184813e);
        parcel.writeString(this.f184814f.name());
        SerpSpaceType serpSpaceType = this.f184815g;
        if (serpSpaceType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(serpSpaceType.name());
        }
        Float f12 = this.f184816h;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        parcel.writeParcelable(this.f184817i, i12);
        parcel.writeString(this.f184818j.name());
        parcel.writeString(this.f184819k);
        parcel.writeString(this.f184820l);
    }

    public /* synthetic */ MapArguments(SearchParams searchParams, String str, Area area, String str2, DrawingState drawingState, SerpSpaceType serpSpaceType, Float f12, TreeClickStreamParent treeClickStreamParent, PresentationType presentationType, String str3, String str4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : searchParams, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : area, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? DrawingState.f185715b : drawingState, (i12 & 32) != 0 ? null : serpSpaceType, (i12 & 64) != 0 ? null : f12, (i12 & 128) != 0 ? null : treeClickStreamParent, presentationType, (i12 & 512) != 0 ? null : str3, (i12 & 1024) != 0 ? "" : str4);
    }
}
