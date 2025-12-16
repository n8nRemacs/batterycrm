package com.avito.android.service_transportation_info.advert_details;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.service_transportation_info.model.TransportInfo;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsServicesTransportInfoItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_transportation_info/advert_details/AdvertDetailsServicesTransportInfoItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "_avito_service-transportation-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AdvertDetailsServicesTransportInfoItem implements BlockItem {

    @k
    public static final Parcelable.Creator<AdvertDetailsServicesTransportInfoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TransportInfo f279715b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f279716c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f279717d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f279718e;

    /* renamed from: f, reason: collision with root package name */
    public final int f279719f;

    /* compiled from: AdvertDetailsServicesTransportInfoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsServicesTransportInfoItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsServicesTransportInfoItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsServicesTransportInfoItem((TransportInfo) parcel.readParcelable(AdvertDetailsServicesTransportInfoItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsServicesTransportInfoItem[] newArray(int i12) {
            return new AdvertDetailsServicesTransportInfoItem[i12];
        }
    }

    public AdvertDetailsServicesTransportInfoItem(@k TransportInfo transportInfo, @k String str, @l String str2, @k String str3, int i12) {
        this.f279715b = transportInfo;
        this.f279716c = str;
        this.f279717d = str2;
        this.f279718e = str3;
        this.f279719f = i12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsServicesTransportInfoItem(this.f279715b, this.f279716c, this.f279717d, this.f279718e, i12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsServicesTransportInfoItem)) {
            return false;
        }
        AdvertDetailsServicesTransportInfoItem advertDetailsServicesTransportInfoItem = (AdvertDetailsServicesTransportInfoItem) obj;
        return L.f(this.f279715b, advertDetailsServicesTransportInfoItem.f279715b) && L.f(this.f279716c, advertDetailsServicesTransportInfoItem.f279716c) && L.f(this.f279717d, advertDetailsServicesTransportInfoItem.f279717d) && L.f(this.f279718e, advertDetailsServicesTransportInfoItem.f279718e) && this.f279719f == advertDetailsServicesTransportInfoItem.f279719f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269930b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF279738f() {
        return this.f279719f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF279737e() {
        return this.f279718e;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f279715b.hashCode() * 31, 31, this.f279716c);
        String str = this.f279717d;
        return Integer.hashCode(this.f279719f) + H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f279718e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsServicesTransportInfoItem(itemModel=");
        sb2.append(this.f279715b);
        sb2.append(", iid=");
        sb2.append(this.f279716c);
        sb2.append(", xHash=");
        sb2.append(this.f279717d);
        sb2.append(", stringId=");
        sb2.append(this.f279718e);
        sb2.append(", spanCount=");
        return r.t(sb2, this.f279719f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f279715b, i12);
        parcel.writeString(this.f279716c);
        parcel.writeString(this.f279717d);
        parcel.writeString(this.f279718e);
        parcel.writeInt(this.f279719f);
    }
}
