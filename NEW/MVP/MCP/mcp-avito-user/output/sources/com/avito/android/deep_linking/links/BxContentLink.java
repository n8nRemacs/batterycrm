package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.remote.model.search.map.Area;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: BxContentLink.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/BxContentLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/deep_linking/links/s;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class BxContentLink extends DeepLink implements s {

    @Y61.k
    public static final Parcelable.Creator<BxContentLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SearchParams f133064b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133065c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Area f133066d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Area f133067e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f133068f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Float f133069g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f133070h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f133071i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f133072j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final PresentationType f133073k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f133074l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final SerpSpaceType f133075m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f133076n;

    /* compiled from: BxContentLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BxContentLink> {
        @Override // android.os.Parcelable.Creator
        public final BxContentLink createFromParcel(Parcel parcel) {
            return new BxContentLink(SearchParams.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Area.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Area.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString(), parcel.readString(), parcel.readString(), PresentationType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0 ? SerpSpaceType.valueOf(parcel.readString()) : null, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BxContentLink[] newArray(int i12) {
            return new BxContentLink[i12];
        }
    }

    public /* synthetic */ BxContentLink(SearchParams searchParams, String str, Area area, Area area2, String str2, Float f12, String str3, String str4, String str5, PresentationType presentationType, String str6, SerpSpaceType serpSpaceType, boolean z12, int i12, C42822w c42822w) {
        this(searchParams, str, area, area2, str2, f12, str3, (i12 & 128) != 0 ? null : str4, (i12 & 256) != 0 ? null : str5, presentationType, (i12 & 1024) != 0 ? null : str6, (i12 & 2048) != 0 ? null : serpSpaceType, (i12 & 4096) != 0 ? false : z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BxContentLink)) {
            return false;
        }
        BxContentLink bxContentLink = (BxContentLink) obj;
        return kotlin.jvm.internal.L.f(this.f133064b, bxContentLink.f133064b) && kotlin.jvm.internal.L.f(this.f133065c, bxContentLink.f133065c) && kotlin.jvm.internal.L.f(this.f133066d, bxContentLink.f133066d) && kotlin.jvm.internal.L.f(this.f133067e, bxContentLink.f133067e) && kotlin.jvm.internal.L.f(this.f133068f, bxContentLink.f133068f) && kotlin.jvm.internal.L.f(this.f133069g, bxContentLink.f133069g) && kotlin.jvm.internal.L.f(this.f133070h, bxContentLink.f133070h) && kotlin.jvm.internal.L.f(this.f133071i, bxContentLink.f133071i) && kotlin.jvm.internal.L.f(this.f133072j, bxContentLink.f133072j) && this.f133073k == bxContentLink.f133073k && kotlin.jvm.internal.L.f(this.f133074l, bxContentLink.f133074l) && this.f133075m == bxContentLink.f133075m && this.f133076n == bxContentLink.f133076n;
    }

    @Override // com.avito.android.deep_linking.links.s
    @Y61.l
    public final String getLocationId() {
        return this.f133064b.getLocationId();
    }

    public final int hashCode() {
        int iHashCode = this.f133064b.hashCode() * 31;
        String str = this.f133065c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Area area = this.f133066d;
        int iHashCode3 = (iHashCode2 + (area == null ? 0 : area.hashCode())) * 31;
        Area area2 = this.f133067e;
        int iHashCode4 = (iHashCode3 + (area2 == null ? 0 : area2.hashCode())) * 31;
        String str2 = this.f133068f;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f12 = this.f133069g;
        int iHashCode6 = (iHashCode5 + (f12 == null ? 0 : f12.hashCode())) * 31;
        String str3 = this.f133070h;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f133071i;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f133072j;
        int iHashCode9 = (this.f133073k.hashCode() + ((iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        String str6 = this.f133074l;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        SerpSpaceType serpSpaceType = this.f133075m;
        return Boolean.hashCode(this.f133076n) + ((iHashCode10 + (serpSpaceType != null ? serpSpaceType.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BxContentLink(searchParams=");
        sb2.append(this.f133064b);
        sb2.append(", context=");
        sb2.append(this.f133065c);
        sb2.append(", searchArea=");
        sb2.append(this.f133066d);
        sb2.append(", mapArea=");
        sb2.append(this.f133067e);
        sb2.append(", mapSerpState=");
        sb2.append(this.f133068f);
        sb2.append(", mapZoomLevel=");
        sb2.append(this.f133069g);
        sb2.append(", fromPage=");
        sb2.append(this.f133070h);
        sb2.append(", expanded=");
        sb2.append(this.f133071i);
        sb2.append(", sellerId=");
        sb2.append(this.f133072j);
        sb2.append(", presentationType=");
        sb2.append(this.f133073k);
        sb2.append(", onboardingId=");
        sb2.append(this.f133074l);
        sb2.append(", serpSpaceType=");
        sb2.append(this.f133075m);
        sb2.append(", autoOpenSuggest=");
        return androidx.appcompat.app.r.x(sb2, this.f133076n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f133064b.writeToParcel(parcel, i12);
        parcel.writeString(this.f133065c);
        Area area = this.f133066d;
        if (area == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            area.writeToParcel(parcel, i12);
        }
        Area area2 = this.f133067e;
        if (area2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            area2.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f133068f);
        Float f12 = this.f133069g;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        parcel.writeString(this.f133070h);
        parcel.writeString(this.f133071i);
        parcel.writeString(this.f133072j);
        parcel.writeString(this.f133073k.name());
        parcel.writeString(this.f133074l);
        SerpSpaceType serpSpaceType = this.f133075m;
        if (serpSpaceType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(serpSpaceType.name());
        }
        parcel.writeInt(this.f133076n ? 1 : 0);
    }

    public BxContentLink(@Y61.k SearchParams searchParams, @Y61.l String str, @Y61.l Area area, @Y61.l Area area2, @Y61.l String str2, @Y61.l Float f12, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.k PresentationType presentationType, @Y61.l String str6, @Y61.l SerpSpaceType serpSpaceType, boolean z12) {
        this.f133064b = searchParams;
        this.f133065c = str;
        this.f133066d = area;
        this.f133067e = area2;
        this.f133068f = str2;
        this.f133069g = f12;
        this.f133070h = str3;
        this.f133071i = str4;
        this.f133072j = str5;
        this.f133073k = presentationType;
        this.f133074l = str6;
        this.f133075m = serpSpaceType;
        this.f133076n = z12;
    }
}
