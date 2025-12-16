package com.avito.android.advert.item.equipmentsTile;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.advert_core.equipments.redesign.Page;
import com.avito.android.remote.model.AdvertEquipments;
import com.avito.android.remote.model.AllComplectationsButton;
import com.avito.android.remote.model.OptionsTile;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsEquipmentsTileItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/equipmentsTile/AdvertDetailsEquipmentsTileItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsEquipmentsTileItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsEquipmentsTileItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f75315b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f75316c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f75317d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f75318e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<OptionsTile> f75319f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final List<AdvertEquipments.EquipmentOption> f75320g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final AllComplectationsButton f75321h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f75322i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Page f75323j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final String f75324k;

    /* renamed from: l, reason: collision with root package name */
    public final int f75325l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f75326m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f75327n;

    /* compiled from: AdvertDetailsEquipmentsTileItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsEquipmentsTileItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsEquipmentsTileItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            int iL3 = 0;
            while (iL3 != i12) {
                iL3 = com.avito.android.actions_sheet.a.l(AdvertDetailsEquipmentsTileItem.class, parcel, arrayList, iL3, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iL2 != i13) {
                iL2 = com.avito.android.actions_sheet.a.l(AdvertDetailsEquipmentsTileItem.class, parcel, arrayList2, iL2, 1);
            }
            return new AdvertDetailsEquipmentsTileItem(j12, string, string2, string3, arrayList, arrayList2, (AllComplectationsButton) parcel.readParcelable(AdvertDetailsEquipmentsTileItem.class.getClassLoader()), parcel.readString(), Page.valueOf(parcel.readString()), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsEquipmentsTileItem[] newArray(int i12) {
            return new AdvertDetailsEquipmentsTileItem[i12];
        }
    }

    public AdvertDetailsEquipmentsTileItem(long j12, @Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.k List<OptionsTile> list, @Y61.k List<AdvertEquipments.EquipmentOption> list2, @Y61.l AllComplectationsButton allComplectationsButton, @Y61.l String str4, @Y61.k Page page, @Y61.k String str5, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f75315b = j12;
        this.f75316c = str;
        this.f75317d = str2;
        this.f75318e = str3;
        this.f75319f = list;
        this.f75320g = list2;
        this.f75321h = allComplectationsButton;
        this.f75322i = str4;
        this.f75323j = page;
        this.f75324k = str5;
        this.f75325l = i12;
        this.f75326m = serpDisplayType;
        this.f75327n = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f75326m;
        return new AdvertDetailsEquipmentsTileItem(this.f75315b, this.f75316c, this.f75317d, this.f75318e, this.f75319f, this.f75320g, this.f75321h, this.f75322i, this.f75323j, this.f75324k, i12, serpDisplayType, this.f75327n);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f75326m = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsEquipmentsTileItem)) {
            return false;
        }
        AdvertDetailsEquipmentsTileItem advertDetailsEquipmentsTileItem = (AdvertDetailsEquipmentsTileItem) obj;
        return this.f75315b == advertDetailsEquipmentsTileItem.f75315b && L.f(this.f75316c, advertDetailsEquipmentsTileItem.f75316c) && L.f(this.f75317d, advertDetailsEquipmentsTileItem.f75317d) && L.f(this.f75318e, advertDetailsEquipmentsTileItem.f75318e) && L.f(this.f75319f, advertDetailsEquipmentsTileItem.f75319f) && L.f(this.f75320g, advertDetailsEquipmentsTileItem.f75320g) && L.f(this.f75321h, advertDetailsEquipmentsTileItem.f75321h) && L.f(this.f75322i, advertDetailsEquipmentsTileItem.f75322i) && this.f75323j == advertDetailsEquipmentsTileItem.f75323j && L.f(this.f75324k, advertDetailsEquipmentsTileItem.f75324k) && this.f75325l == advertDetailsEquipmentsTileItem.f75325l && this.f75326m == advertDetailsEquipmentsTileItem.f75326m && this.f75327n == advertDetailsEquipmentsTileItem.f75327n;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF74241b() {
        return this.f75315b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF74245f() {
        return this.f75325l;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF74242c() {
        return this.f75316c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF74247h() {
        return this.f75327n;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(Long.hashCode(this.f75315b) * 31, 31, this.f75316c), 31, this.f75317d);
        String str = this.f75318e;
        int iE2 = H.e(H.e((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f75319f), 31, this.f75320g);
        AllComplectationsButton allComplectationsButton = this.f75321h;
        int iHashCode = (iE2 + (allComplectationsButton == null ? 0 : allComplectationsButton.hashCode())) * 31;
        String str2 = this.f75322i;
        return this.f75327n.hashCode() + com.avito.android.actions_sheet.a.h(this.f75326m, r.e(this.f75325l, H.d((this.f75323j.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.f75324k), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsEquipmentsTileItem(id=");
        sb2.append(this.f75315b);
        sb2.append(", stringId=");
        sb2.append(this.f75316c);
        sb2.append(", title=");
        sb2.append(this.f75317d);
        sb2.append(", subTitle=");
        sb2.append(this.f75318e);
        sb2.append(", optionsTiles=");
        sb2.append(this.f75319f);
        sb2.append(", options=");
        sb2.append(this.f75320g);
        sb2.append(", allComplectationsButton=");
        sb2.append(this.f75321h);
        sb2.append(", buttonTitle=");
        sb2.append(this.f75322i);
        sb2.append(", page=");
        sb2.append(this.f75323j);
        sb2.append(", advertId=");
        sb2.append(this.f75324k);
        sb2.append(", spanCount=");
        sb2.append(this.f75325l);
        sb2.append(", displayType=");
        sb2.append(this.f75326m);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f75327n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f75315b);
        parcel.writeString(this.f75316c);
        parcel.writeString(this.f75317d);
        parcel.writeString(this.f75318e);
        Iterator itJ = C0.j(this.f75319f, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        Iterator itJ2 = C0.j(this.f75320g, parcel);
        while (itJ2.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ2.next(), i12);
        }
        parcel.writeParcelable(this.f75321h, i12);
        parcel.writeString(this.f75322i);
        parcel.writeString(this.f75323j.name());
        parcel.writeString(this.f75324k);
        parcel.writeInt(this.f75325l);
        parcel.writeString(this.f75326m.name());
        parcel.writeString(this.f75327n.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsEquipmentsTileItem(long j12, String str, String str2, String str3, List list, List list2, AllComplectationsButton allComplectationsButton, String str4, Page page, String str5, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 190;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, str2, str3, list, list2, allComplectationsButton, str4, page, str5, i12, (i13 & 2048) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 4096) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
