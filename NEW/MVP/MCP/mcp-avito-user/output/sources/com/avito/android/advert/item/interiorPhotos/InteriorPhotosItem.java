package com.avito.android.advert.item.interiorPhotos;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InteriorPhotosItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/interiorPhotos/InteriorPhotosItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InteriorPhotosItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<InteriorPhotosItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f76579b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f76580c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f76581d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f76582e;

    /* renamed from: f, reason: collision with root package name */
    public final int f76583f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final List<Image> f76584g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final AttributedText f76585h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Map<String, Object> f76586i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f76587j;

    /* compiled from: InteriorPhotosItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InteriorPhotosItem> {
        @Override // android.os.Parcelable.Creator
        public final InteriorPhotosItem createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            SerpViewType serpViewTypeValueOf = SerpViewType.valueOf(parcel.readString());
            SerpDisplayType serpDisplayTypeValueOf = SerpDisplayType.valueOf(parcel.readString());
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iL2 = 0;
            while (iL2 != i13) {
                iL2 = com.avito.android.actions_sheet.a.l(InteriorPhotosItem.class, parcel, arrayList, iL2, 1);
            }
            AttributedText attributedText = (AttributedText) parcel.readParcelable(InteriorPhotosItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                int iC2 = 0;
                while (iC2 != i14) {
                    iC2 = org.webrtc.h.c(InteriorPhotosItem.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                    linkedHashMap2 = linkedHashMap2;
                    i14 = i14;
                }
                linkedHashMap = linkedHashMap2;
            }
            return new InteriorPhotosItem(j12, string, serpViewTypeValueOf, serpDisplayTypeValueOf, i12, arrayList, attributedText, linkedHashMap, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InteriorPhotosItem[] newArray(int i12) {
            return new InteriorPhotosItem[i12];
        }
    }

    public InteriorPhotosItem(long j12, @Y61.k String str, @Y61.k SerpViewType serpViewType, @Y61.k SerpDisplayType serpDisplayType, int i12, @Y61.k List<Image> list, @Y61.l AttributedText attributedText, @Y61.l Map<String, ? extends Object> map, @Y61.k String str2) {
        this.f76579b = j12;
        this.f76580c = str;
        this.f76581d = serpViewType;
        this.f76582e = serpDisplayType;
        this.f76583f = i12;
        this.f76584g = list;
        this.f76585h = attributedText;
        this.f76586i = map;
        this.f76587j = str2;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new InteriorPhotosItem(this.f76579b, this.f76580c, this.f76581d, this.f76582e, i12, this.f76584g, this.f76585h, this.f76586i, this.f76587j);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f76582e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteriorPhotosItem)) {
            return false;
        }
        InteriorPhotosItem interiorPhotosItem = (InteriorPhotosItem) obj;
        return this.f76579b == interiorPhotosItem.f76579b && L.f(this.f76580c, interiorPhotosItem.f76580c) && this.f76581d == interiorPhotosItem.f76581d && this.f76582e == interiorPhotosItem.f76582e && this.f76583f == interiorPhotosItem.f76583f && L.f(this.f76584g, interiorPhotosItem.f76584g) && L.f(this.f76585h, interiorPhotosItem.f76585h) && L.f(this.f76586i, interiorPhotosItem.f76586i) && L.f(this.f76587j, interiorPhotosItem.f76587j);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF80342e() {
        return this.f76579b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF80344g() {
        return this.f76583f;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF276287b() {
        return this.f76580c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF80346i() {
        return this.f76581d;
    }

    public final int hashCode() {
        int iE2 = H.e(r.e(this.f76583f, com.avito.android.actions_sheet.a.h(this.f76582e, com.avito.android.actions_sheet.a.j(this.f76581d, H.d(Long.hashCode(this.f76579b) * 31, 31, this.f76580c), 31), 31), 31), 31, this.f76584g);
        AttributedText attributedText = this.f76585h;
        int iHashCode = (iE2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Map<String, Object> map = this.f76586i;
        return this.f76587j.hashCode() + ((iHashCode + (map != null ? map.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InteriorPhotosItem(id=");
        sb2.append(this.f76579b);
        sb2.append(", stringId=");
        sb2.append(this.f76580c);
        sb2.append(", viewType=");
        sb2.append(this.f76581d);
        sb2.append(", displayType=");
        sb2.append(this.f76582e);
        sb2.append(", spanCount=");
        sb2.append(this.f76583f);
        sb2.append(", images=");
        sb2.append(this.f76584g);
        sb2.append(", title=");
        sb2.append(this.f76585h);
        sb2.append(", analytics=");
        sb2.append(this.f76586i);
        sb2.append(", fromBlockName=");
        return C22026a.c(sb2, this.f76587j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f76579b);
        parcel.writeString(this.f76580c);
        parcel.writeString(this.f76581d.name());
        parcel.writeString(this.f76582e.name());
        parcel.writeInt(this.f76583f);
        Iterator itJ = C0.j(this.f76584g, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.f76585h, i12);
        Map<String, Object> map = this.f76586i;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
            }
        }
        parcel.writeString(this.f76587j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InteriorPhotosItem(long j12, String str, SerpViewType serpViewType, SerpDisplayType serpDisplayType, int i12, List list, AttributedText attributedText, Map map, String str2, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 219;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, (i13 & 4) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, i12, list, attributedText, map, str2);
    }
}
