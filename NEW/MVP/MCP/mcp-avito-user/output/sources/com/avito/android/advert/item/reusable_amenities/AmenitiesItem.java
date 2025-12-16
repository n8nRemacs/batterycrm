package com.avito.android.advert.item.reusable_amenities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_amenities.Amenities;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AmenitiesItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/reusable_amenities/AmenitiesItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AmenitiesItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AmenitiesItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f78592b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f78593c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f78594d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f78595e;

    /* renamed from: f, reason: collision with root package name */
    public final int f78596f;

    /* renamed from: g, reason: collision with root package name */
    public final int f78597g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final AttributedText f78598h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final AttributedText f78599i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final List<Amenities.Amenity> f78600j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final AttributedText f78601k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Map<String, Object> f78602l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final String f78603m;

    /* compiled from: AmenitiesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AmenitiesItem> {
        @Override // android.os.Parcelable.Creator
        public final AmenitiesItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            LinkedHashMap linkedHashMap;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            SerpViewType serpViewTypeValueOf = SerpViewType.valueOf(parcel.readString());
            SerpDisplayType serpDisplayTypeValueOf = SerpDisplayType.valueOf(parcel.readString());
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AmenitiesItem.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(AmenitiesItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iL2 = 0;
                while (iL2 != i14) {
                    iL2 = com.avito.android.actions_sheet.a.l(AmenitiesItem.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            AttributedText attributedText3 = (AttributedText) parcel.readParcelable(AmenitiesItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i15 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i15);
                int iC2 = 0;
                while (iC2 != i15) {
                    iC2 = org.webrtc.h.c(AmenitiesItem.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                    linkedHashMap2 = linkedHashMap2;
                    i15 = i15;
                }
                linkedHashMap = linkedHashMap2;
            }
            return new AmenitiesItem(j12, string, serpViewTypeValueOf, serpDisplayTypeValueOf, i12, i13, attributedText, attributedText2, arrayList, attributedText3, linkedHashMap, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AmenitiesItem[] newArray(int i12) {
            return new AmenitiesItem[i12];
        }
    }

    public AmenitiesItem(long j12, @Y61.k String str, @Y61.k SerpViewType serpViewType, @Y61.k SerpDisplayType serpDisplayType, int i12, int i13, @Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.l List<Amenities.Amenity> list, @Y61.l AttributedText attributedText3, @Y61.l Map<String, ? extends Object> map, @Y61.k String str2) {
        this.f78592b = j12;
        this.f78593c = str;
        this.f78594d = serpViewType;
        this.f78595e = serpDisplayType;
        this.f78596f = i12;
        this.f78597g = i13;
        this.f78598h = attributedText;
        this.f78599i = attributedText2;
        this.f78600j = list;
        this.f78601k = attributedText3;
        this.f78602l = map;
        this.f78603m = str2;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AmenitiesItem(this.f78592b, this.f78593c, this.f78594d, this.f78595e, i12, this.f78597g, this.f78598h, this.f78599i, this.f78600j, this.f78601k, this.f78602l, this.f78603m);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f78595e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AmenitiesItem)) {
            return false;
        }
        AmenitiesItem amenitiesItem = (AmenitiesItem) obj;
        return this.f78592b == amenitiesItem.f78592b && L.f(this.f78593c, amenitiesItem.f78593c) && this.f78594d == amenitiesItem.f78594d && this.f78595e == amenitiesItem.f78595e && this.f78596f == amenitiesItem.f78596f && this.f78597g == amenitiesItem.f78597g && L.f(this.f78598h, amenitiesItem.f78598h) && L.f(this.f78599i, amenitiesItem.f78599i) && L.f(this.f78600j, amenitiesItem.f78600j) && L.f(this.f78601k, amenitiesItem.f78601k) && L.f(this.f78602l, amenitiesItem.f78602l) && L.f(this.f78603m, amenitiesItem.f78603m);
    }

    @Override // TV0.a
    public final long getId() {
        return this.f78592b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF152612c() {
        return this.f78596f;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281502b() {
        return this.f78593c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF270104h() {
        return this.f78594d;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f78597g, r.e(this.f78596f, com.avito.android.actions_sheet.a.h(this.f78595e, com.avito.android.actions_sheet.a.j(this.f78594d, H.d(Long.hashCode(this.f78592b) * 31, 31, this.f78593c), 31), 31), 31), 31);
        AttributedText attributedText = this.f78598h;
        int iHashCode = (iE2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f78599i;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        List<Amenities.Amenity> list = this.f78600j;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        AttributedText attributedText3 = this.f78601k;
        int iHashCode4 = (iHashCode3 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31;
        Map<String, Object> map = this.f78602l;
        return this.f78603m.hashCode() + ((iHashCode4 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AmenitiesItem(id=");
        sb2.append(this.f78592b);
        sb2.append(", stringId=");
        sb2.append(this.f78593c);
        sb2.append(", viewType=");
        sb2.append(this.f78594d);
        sb2.append(", displayType=");
        sb2.append(this.f78595e);
        sb2.append(", spanCount=");
        sb2.append(this.f78596f);
        sb2.append(", limit=");
        sb2.append(this.f78597g);
        sb2.append(", expandButtonText=");
        sb2.append(this.f78598h);
        sb2.append(", closePopupButtonText=");
        sb2.append(this.f78599i);
        sb2.append(", amenities=");
        sb2.append(this.f78600j);
        sb2.append(", title=");
        sb2.append(this.f78601k);
        sb2.append(", analytics=");
        sb2.append(this.f78602l);
        sb2.append(", fromBlockName=");
        return C22026a.c(sb2, this.f78603m, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f78592b);
        parcel.writeString(this.f78593c);
        parcel.writeString(this.f78594d.name());
        parcel.writeString(this.f78595e.name());
        parcel.writeInt(this.f78596f);
        parcel.writeInt(this.f78597g);
        parcel.writeParcelable(this.f78598h, i12);
        parcel.writeParcelable(this.f78599i, i12);
        List<Amenities.Amenity> list = this.f78600j;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeParcelable(this.f78601k, i12);
        Map<String, Object> map = this.f78602l;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
            }
        }
        parcel.writeString(this.f78603m);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AmenitiesItem(long j12, String str, SerpViewType serpViewType, SerpDisplayType serpDisplayType, int i12, int i13, AttributedText attributedText, AttributedText attributedText2, List list, AttributedText attributedText3, Map map, String str2, int i14, C42822w c42822w) {
        long j13;
        if ((i14 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = JfifUtil.MARKER_EOI;
        } else {
            j13 = j12;
        }
        this(j13, (i14 & 2) != 0 ? String.valueOf(j13) : str, (i14 & 4) != 0 ? SerpViewType.f268585e : serpViewType, (i14 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, i12, i13, attributedText, attributedText2, list, attributedText3, map, str2);
    }
}
