package com.avito.android.service_transportation_info.advert_details.geo;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.service_transportation_info.model.TransportationGeo;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsServicesTransportationGeoItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_transportation_info/advert_details/geo/AdvertDetailsServicesTransportationGeoItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "_avito_service-transportation-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AdvertDetailsServicesTransportationGeoItem implements BlockItem {

    @k
    public static final Parcelable.Creator<AdvertDetailsServicesTransportationGeoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TransportationGeo f279734b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f279735c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f279736d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f279737e;

    /* renamed from: f, reason: collision with root package name */
    public final int f279738f;

    /* compiled from: AdvertDetailsServicesTransportationGeoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsServicesTransportationGeoItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsServicesTransportationGeoItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsServicesTransportationGeoItem((TransportationGeo) parcel.readParcelable(AdvertDetailsServicesTransportationGeoItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsServicesTransportationGeoItem[] newArray(int i12) {
            return new AdvertDetailsServicesTransportationGeoItem[i12];
        }
    }

    public AdvertDetailsServicesTransportationGeoItem(@k TransportationGeo transportationGeo, @k String str, @l String str2, @k String str3, int i12) {
        this.f279734b = transportationGeo;
        this.f279735c = str;
        this.f279736d = str2;
        this.f279737e = str3;
        this.f279738f = i12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsServicesTransportationGeoItem(this.f279734b, this.f279735c, this.f279736d, this.f279737e, i12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsServicesTransportationGeoItem)) {
            return false;
        }
        AdvertDetailsServicesTransportationGeoItem advertDetailsServicesTransportationGeoItem = (AdvertDetailsServicesTransportationGeoItem) obj;
        return L.f(this.f279734b, advertDetailsServicesTransportationGeoItem.f279734b) && L.f(this.f279735c, advertDetailsServicesTransportationGeoItem.f279735c) && L.f(this.f279736d, advertDetailsServicesTransportationGeoItem.f279736d) && L.f(this.f279737e, advertDetailsServicesTransportationGeoItem.f279737e) && this.f279738f == advertDetailsServicesTransportationGeoItem.f279738f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269930b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF279738f() {
        return this.f279738f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF279737e() {
        return this.f279737e;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f279734b.hashCode() * 31, 31, this.f279735c);
        String str = this.f279736d;
        return Integer.hashCode(this.f279738f) + H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f279737e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsServicesTransportationGeoItem(itemModel=");
        sb2.append(this.f279734b);
        sb2.append(", iid=");
        sb2.append(this.f279735c);
        sb2.append(", xHash=");
        sb2.append(this.f279736d);
        sb2.append(", stringId=");
        sb2.append(this.f279737e);
        sb2.append(", spanCount=");
        return r.t(sb2, this.f279738f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f279734b, i12);
        parcel.writeString(this.f279735c);
        parcel.writeString(this.f279736d);
        parcel.writeString(this.f279737e);
        parcel.writeInt(this.f279738f);
    }
}
