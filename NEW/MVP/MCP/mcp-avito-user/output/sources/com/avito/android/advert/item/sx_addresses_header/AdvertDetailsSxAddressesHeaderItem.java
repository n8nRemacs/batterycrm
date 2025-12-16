package com.avito.android.advert.item.sx_addresses_header;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import j.InterfaceC42150f;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsSxAddressesHeaderItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/sx_addresses_header/AdvertDetailsSxAddressesHeaderItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsSxAddressesHeaderItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsSxAddressesHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f80494b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f80495c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f80496d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f80497e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f80498f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Integer f80499g;

    /* renamed from: h, reason: collision with root package name */
    public final int f80500h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public SerpDisplayType f80501i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final SerpViewType f80502j;

    /* compiled from: AdvertDetailsSxAddressesHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsSxAddressesHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsSxAddressesHeaderItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsSxAddressesHeaderItem(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsSxAddressesHeaderItem[] newArray(int i12) {
            return new AdvertDetailsSxAddressesHeaderItem[i12];
        }
    }

    public AdvertDetailsSxAddressesHeaderItem(long j12, @k String str, @k String str2, @l Integer num, @InterfaceC42150f @l Integer num2, @f0 @l Integer num3, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f80494b = j12;
        this.f80495c = str;
        this.f80496d = str2;
        this.f80497e = num;
        this.f80498f = num2;
        this.f80499g = num3;
        this.f80500h = i12;
        this.f80501i = serpDisplayType;
        this.f80502j = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsSxAddressesHeaderItem(this.f80494b, this.f80495c, this.f80496d, this.f80497e, this.f80498f, this.f80499g, i12, this.f80501i, this.f80502j);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f80501i = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsSxAddressesHeaderItem)) {
            return false;
        }
        AdvertDetailsSxAddressesHeaderItem advertDetailsSxAddressesHeaderItem = (AdvertDetailsSxAddressesHeaderItem) obj;
        return this.f80494b == advertDetailsSxAddressesHeaderItem.f80494b && L.f(this.f80495c, advertDetailsSxAddressesHeaderItem.f80495c) && L.f(this.f80496d, advertDetailsSxAddressesHeaderItem.f80496d) && L.f(this.f80497e, advertDetailsSxAddressesHeaderItem.f80497e) && L.f(this.f80498f, advertDetailsSxAddressesHeaderItem.f80498f) && L.f(this.f80499g, advertDetailsSxAddressesHeaderItem.f80499g) && this.f80500h == advertDetailsSxAddressesHeaderItem.f80500h && this.f80501i == advertDetailsSxAddressesHeaderItem.f80501i && this.f80502j == advertDetailsSxAddressesHeaderItem.f80502j;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75367b() {
        return this.f80494b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75369d() {
        return this.f80500h;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75368c() {
        return this.f80495c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75370e() {
        return this.f80502j;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(Long.hashCode(this.f80494b) * 31, 31, this.f80495c), 31, this.f80496d);
        Integer num = this.f80497e;
        int iHashCode = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f80498f;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f80499g;
        return this.f80502j.hashCode() + com.avito.android.actions_sheet.a.h(this.f80501i, r.e(this.f80500h, (iHashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsSxAddressesHeaderItem(id=");
        sb2.append(this.f80494b);
        sb2.append(", stringId=");
        sb2.append(this.f80495c);
        sb2.append(", title=");
        sb2.append(this.f80496d);
        sb2.append(", marginTopDp=");
        sb2.append(this.f80497e);
        sb2.append(", styleAttrId=");
        sb2.append(this.f80498f);
        sb2.append(", styleAttrIdRes=");
        sb2.append(this.f80499g);
        sb2.append(", spanCount=");
        sb2.append(this.f80500h);
        sb2.append(", displayType=");
        sb2.append(this.f80501i);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f80502j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f80494b);
        parcel.writeString(this.f80495c);
        parcel.writeString(this.f80496d);
        Integer num = this.f80497e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f80498f;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Integer num3 = this.f80499g;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        parcel.writeInt(this.f80500h);
        parcel.writeString(this.f80501i.name());
        parcel.writeString(this.f80502j.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsSxAddressesHeaderItem(long j12, String str, String str2, Integer num, Integer num2, Integer num3, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 102;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, str2, (i13 & 8) != 0 ? null : num, (i13 & 16) != 0 ? null : num2, (i13 & 32) != 0 ? null : num3, i12, (i13 & 128) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 256) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
