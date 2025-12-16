package com.avito.android.advert.item.amenities;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.hotel.model.Amenities;
import com.avito.android.printable_text.PrintableText;
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

/* compiled from: AdvertDetailsAmenitiesItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/amenities/AdvertDetailsAmenitiesItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsAmenitiesItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsAmenitiesItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f72731b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f72732c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SerpViewType f72733d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public SerpDisplayType f72734e;

    /* renamed from: f, reason: collision with root package name */
    public final int f72735f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f72736g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final List<Amenities.AmenityGroup> f72737h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final PrintableText f72738i;

    /* renamed from: j, reason: collision with root package name */
    public final int f72739j;

    /* compiled from: AdvertDetailsAmenitiesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsAmenitiesItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAmenitiesItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            SerpViewType serpViewTypeValueOf = SerpViewType.valueOf(parcel.readString());
            SerpDisplayType serpDisplayTypeValueOf = SerpDisplayType.valueOf(parcel.readString());
            int i12 = parcel.readInt();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(AdvertDetailsAmenitiesItem.class, parcel, arrayList, iL2, 1);
                }
            }
            return new AdvertDetailsAmenitiesItem(j12, string, serpViewTypeValueOf, serpDisplayTypeValueOf, i12, string2, arrayList, (PrintableText) parcel.readParcelable(AdvertDetailsAmenitiesItem.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAmenitiesItem[] newArray(int i12) {
            return new AdvertDetailsAmenitiesItem[i12];
        }
    }

    public AdvertDetailsAmenitiesItem(long j12, @k String str, @k SerpViewType serpViewType, @k SerpDisplayType serpDisplayType, int i12, @l String str2, @l List<Amenities.AmenityGroup> list, @k PrintableText printableText, int i13) {
        this.f72731b = j12;
        this.f72732c = str;
        this.f72733d = serpViewType;
        this.f72734e = serpDisplayType;
        this.f72735f = i12;
        this.f72736g = str2;
        this.f72737h = list;
        this.f72738i = printableText;
        this.f72739j = i13;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsAmenitiesItem(this.f72731b, this.f72732c, this.f72733d, this.f72734e, i12, this.f72736g, this.f72737h, this.f72738i, this.f72739j);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f72734e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsAmenitiesItem)) {
            return false;
        }
        AdvertDetailsAmenitiesItem advertDetailsAmenitiesItem = (AdvertDetailsAmenitiesItem) obj;
        return this.f72731b == advertDetailsAmenitiesItem.f72731b && L.f(this.f72732c, advertDetailsAmenitiesItem.f72732c) && this.f72733d == advertDetailsAmenitiesItem.f72733d && this.f72734e == advertDetailsAmenitiesItem.f72734e && this.f72735f == advertDetailsAmenitiesItem.f72735f && L.f(this.f72736g, advertDetailsAmenitiesItem.f72736g) && L.f(this.f72737h, advertDetailsAmenitiesItem.f72737h) && L.f(this.f72738i, advertDetailsAmenitiesItem.f72738i) && this.f72739j == advertDetailsAmenitiesItem.f72739j;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF85532b() {
        return this.f72731b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF85534d() {
        return this.f72735f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154734b() {
        return this.f72732c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF85540j() {
        return this.f72733d;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f72735f, com.avito.android.actions_sheet.a.h(this.f72734e, com.avito.android.actions_sheet.a.j(this.f72733d, H.d(Long.hashCode(this.f72731b) * 31, 31, this.f72732c), 31), 31), 31);
        String str = this.f72736g;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        List<Amenities.AmenityGroup> list = this.f72737h;
        return Integer.hashCode(this.f72739j) + com.avito.android.actions_sheet.a.f(this.f72738i, (iHashCode + (list != null ? list.hashCode() : 0)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsAmenitiesItem(id=");
        sb2.append(this.f72731b);
        sb2.append(", stringId=");
        sb2.append(this.f72732c);
        sb2.append(", viewType=");
        sb2.append(this.f72733d);
        sb2.append(", displayType=");
        sb2.append(this.f72734e);
        sb2.append(", spanCount=");
        sb2.append(this.f72735f);
        sb2.append(", title=");
        sb2.append(this.f72736g);
        sb2.append(", amenityGroups=");
        sb2.append(this.f72737h);
        sb2.append(", expandTitle=");
        sb2.append(this.f72738i);
        sb2.append(", limit=");
        return r.t(sb2, this.f72739j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f72731b);
        parcel.writeString(this.f72732c);
        parcel.writeString(this.f72733d.name());
        parcel.writeString(this.f72734e.name());
        parcel.writeInt(this.f72735f);
        parcel.writeString(this.f72736g);
        List<Amenities.AmenityGroup> list = this.f72737h;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeParcelable(this.f72738i, i12);
        parcel.writeInt(this.f72739j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsAmenitiesItem(long j12, String str, SerpViewType serpViewType, SerpDisplayType serpDisplayType, int i12, String str2, List list, PrintableText printableText, int i13, int i14, C42822w c42822w) {
        long j13;
        if ((i14 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 172;
        } else {
            j13 = j12;
        }
        this(j13, (i14 & 2) != 0 ? String.valueOf(j13) : str, (i14 & 4) != 0 ? SerpViewType.f268585e : serpViewType, (i14 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, i12, str2, list, printableText, i13);
    }
}
