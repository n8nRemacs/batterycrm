package com.avito.android.advert.item.parking;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.MultiAddressesInfo;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.android.user_address_public.api.AdditionalInfo;
import com.avito.android.user_address_public.api.MultiAddressesItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsParkingAddressItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/parking/AdvertDetailsParkingAddressItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsParkingAddressItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsParkingAddressItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f78132b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f78133c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f78134d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<MultiAddressesItem> f78135e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AdditionalInfo f78136f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ParkingAddressShowOnMapParams f78137g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final MultiAddressesInfo f78138h;

    /* renamed from: i, reason: collision with root package name */
    public final int f78139i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f78140j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f78141k;

    /* compiled from: AdvertDetailsParkingAddressItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsParkingAddressItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsParkingAddressItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(AdvertDetailsParkingAddressItem.class, parcel, arrayList, iL2, 1);
            }
            return new AdvertDetailsParkingAddressItem(j12, string, string2, arrayList, (AdditionalInfo) parcel.readParcelable(AdvertDetailsParkingAddressItem.class.getClassLoader()), ParkingAddressShowOnMapParams.CREATOR.createFromParcel(parcel), (MultiAddressesInfo) parcel.readParcelable(AdvertDetailsParkingAddressItem.class.getClassLoader()), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsParkingAddressItem[] newArray(int i12) {
            return new AdvertDetailsParkingAddressItem[i12];
        }
    }

    public AdvertDetailsParkingAddressItem(long j12, @Y61.k String str, @Y61.k String str2, @Y61.k List<MultiAddressesItem> list, @Y61.k AdditionalInfo additionalInfo, @Y61.k ParkingAddressShowOnMapParams parkingAddressShowOnMapParams, @Y61.k MultiAddressesInfo multiAddressesInfo, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f78132b = j12;
        this.f78133c = str;
        this.f78134d = str2;
        this.f78135e = list;
        this.f78136f = additionalInfo;
        this.f78137g = parkingAddressShowOnMapParams;
        this.f78138h = multiAddressesInfo;
        this.f78139i = i12;
        this.f78140j = serpDisplayType;
        this.f78141k = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f78140j;
        return new AdvertDetailsParkingAddressItem(this.f78132b, this.f78133c, this.f78134d, this.f78135e, this.f78136f, this.f78137g, this.f78138h, i12, serpDisplayType, this.f78141k);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f78140j = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsParkingAddressItem)) {
            return false;
        }
        AdvertDetailsParkingAddressItem advertDetailsParkingAddressItem = (AdvertDetailsParkingAddressItem) obj;
        return this.f78132b == advertDetailsParkingAddressItem.f78132b && L.f(this.f78133c, advertDetailsParkingAddressItem.f78133c) && L.f(this.f78134d, advertDetailsParkingAddressItem.f78134d) && L.f(this.f78135e, advertDetailsParkingAddressItem.f78135e) && L.f(this.f78136f, advertDetailsParkingAddressItem.f78136f) && L.f(this.f78137g, advertDetailsParkingAddressItem.f78137g) && L.f(this.f78138h, advertDetailsParkingAddressItem.f78138h) && this.f78139i == advertDetailsParkingAddressItem.f78139i && this.f78140j == advertDetailsParkingAddressItem.f78140j && this.f78141k == advertDetailsParkingAddressItem.f78141k;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF85764e() {
        return this.f78132b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75763b() {
        return this.f78139i;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF173942b() {
        return this.f78133c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF85768i() {
        return this.f78141k;
    }

    public final int hashCode() {
        return this.f78141k.hashCode() + com.avito.android.actions_sheet.a.h(this.f78140j, r.e(this.f78139i, (this.f78138h.hashCode() + ((this.f78137g.hashCode() + ((this.f78136f.hashCode() + H.e(H.d(H.d(Long.hashCode(this.f78132b) * 31, 31, this.f78133c), 31, this.f78134d), 31, this.f78135e)) * 31)) * 31)) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsParkingAddressItem(id=");
        sb2.append(this.f78132b);
        sb2.append(", stringId=");
        sb2.append(this.f78133c);
        sb2.append(", title=");
        sb2.append(this.f78134d);
        sb2.append(", addresses=");
        sb2.append(this.f78135e);
        sb2.append(", additionalInfo=");
        sb2.append(this.f78136f);
        sb2.append(", parkingAddressShowOnMapParams=");
        sb2.append(this.f78137g);
        sb2.append(", multiAddressesInfo=");
        sb2.append(this.f78138h);
        sb2.append(", spanCount=");
        sb2.append(this.f78139i);
        sb2.append(", displayType=");
        sb2.append(this.f78140j);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f78141k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f78132b);
        parcel.writeString(this.f78133c);
        parcel.writeString(this.f78134d);
        Iterator itJ = C0.j(this.f78135e, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.f78136f, i12);
        this.f78137g.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f78138h, i12);
        parcel.writeInt(this.f78139i);
        parcel.writeString(this.f78140j.name());
        parcel.writeString(this.f78141k.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsParkingAddressItem(long j12, String str, String str2, List list, AdditionalInfo additionalInfo, ParkingAddressShowOnMapParams parkingAddressShowOnMapParams, MultiAddressesInfo multiAddressesInfo, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 189;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, str2, list, additionalInfo, parkingAddressShowOnMapParams, multiAddressesInfo, i12, (i13 & 256) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 512) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
