package com.avito.android.advert_core.equipments.redesign;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.AdvertEquipments;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EquipmentsItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/equipments/redesign/EquipmentsItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class EquipmentsItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<EquipmentsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f83467b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f83468c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AdvertEquipments f83469d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Page f83470e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f83471f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Boolean f83472g;

    /* renamed from: h, reason: collision with root package name */
    public final int f83473h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f83474i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f83475j;

    /* compiled from: EquipmentsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EquipmentsItem> {
        @Override // android.os.Parcelable.Creator
        public final EquipmentsItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            AdvertEquipments advertEquipments = (AdvertEquipments) parcel.readParcelable(EquipmentsItem.class.getClassLoader());
            Page pageValueOf = Page.valueOf(parcel.readString());
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new EquipmentsItem(j12, string, advertEquipments, pageValueOf, string2, boolValueOf, parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final EquipmentsItem[] newArray(int i12) {
            return new EquipmentsItem[i12];
        }
    }

    public EquipmentsItem(long j12, @Y61.k String str, @Y61.k AdvertEquipments advertEquipments, @Y61.k Page page, @Y61.k String str2, @Y61.l Boolean bool, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f83467b = j12;
        this.f83468c = str;
        this.f83469d = advertEquipments;
        this.f83470e = page;
        this.f83471f = str2;
        this.f83472g = bool;
        this.f83473h = i12;
        this.f83474i = serpDisplayType;
        this.f83475j = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new EquipmentsItem(this.f83467b, this.f83468c, this.f83469d, this.f83470e, this.f83471f, this.f83472g, i12, this.f83474i, this.f83475j);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f83474i = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EquipmentsItem)) {
            return false;
        }
        EquipmentsItem equipmentsItem = (EquipmentsItem) obj;
        return this.f83467b == equipmentsItem.f83467b && L.f(this.f83468c, equipmentsItem.f83468c) && L.f(this.f83469d, equipmentsItem.f83469d) && this.f83470e == equipmentsItem.f83470e && L.f(this.f83471f, equipmentsItem.f83471f) && L.f(this.f83472g, equipmentsItem.f83472g) && this.f83473h == equipmentsItem.f83473h && this.f83474i == equipmentsItem.f83474i && this.f83475j == equipmentsItem.f83475j;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF74281b() {
        return this.f83467b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF74285f() {
        return this.f83473h;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF74460b() {
        return this.f83468c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF74284e() {
        return this.f83475j;
    }

    public final int hashCode() {
        int iD2 = H.d((this.f83470e.hashCode() + ((this.f83469d.hashCode() + H.d(Long.hashCode(this.f83467b) * 31, 31, this.f83468c)) * 31)) * 31, 31, this.f83471f);
        Boolean bool = this.f83472g;
        return this.f83475j.hashCode() + com.avito.android.actions_sheet.a.h(this.f83474i, r.e(this.f83473h, (iD2 + (bool == null ? 0 : bool.hashCode())) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EquipmentsItem(id=");
        sb2.append(this.f83467b);
        sb2.append(", stringId=");
        sb2.append(this.f83468c);
        sb2.append(", equipments=");
        sb2.append(this.f83469d);
        sb2.append(", page=");
        sb2.append(this.f83470e);
        sb2.append(", advertId=");
        sb2.append(this.f83471f);
        sb2.append(", closedAdvert=");
        sb2.append(this.f83472g);
        sb2.append(", spanCount=");
        sb2.append(this.f83473h);
        sb2.append(", displayType=");
        sb2.append(this.f83474i);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f83475j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f83467b);
        parcel.writeString(this.f83468c);
        parcel.writeParcelable(this.f83469d, i12);
        parcel.writeString(this.f83470e.name());
        parcel.writeString(this.f83471f);
        Boolean bool = this.f83472g;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeInt(this.f83473h);
        parcel.writeString(this.f83474i.name());
        parcel.writeString(this.f83475j.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EquipmentsItem(long j12, String str, AdvertEquipments advertEquipments, Page page, String str2, Boolean bool, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 104;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, advertEquipments, page, str2, (i13 & 32) != 0 ? null : bool, i12, (i13 & 128) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 256) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
