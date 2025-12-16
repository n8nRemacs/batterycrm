package com.avito.android.advert.item.additionalSeller;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.DevelopmentFeature;
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

/* compiled from: AdditionalSellerFeaturesItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/additionalSeller/AdditionalSellerFeaturesItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdditionalSellerFeaturesItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdditionalSellerFeaturesItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f72541b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f72542c;

    /* renamed from: d, reason: collision with root package name */
    public final int f72543d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f72544e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f72545f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f72546g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final List<DevelopmentFeature> f72547h;

    /* compiled from: AdditionalSellerFeaturesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdditionalSellerFeaturesItem> {
        @Override // android.os.Parcelable.Creator
        public final AdditionalSellerFeaturesItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            int i12 = parcel.readInt();
            SerpDisplayType serpDisplayTypeValueOf = SerpDisplayType.valueOf(parcel.readString());
            SerpViewType serpViewTypeValueOf = SerpViewType.valueOf(parcel.readString());
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(AdditionalSellerFeaturesItem.class, parcel, arrayList, iL2, 1);
                }
            }
            return new AdditionalSellerFeaturesItem(i12, j12, serpDisplayTypeValueOf, serpViewTypeValueOf, string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AdditionalSellerFeaturesItem[] newArray(int i12) {
            return new AdditionalSellerFeaturesItem[i12];
        }
    }

    public AdditionalSellerFeaturesItem(int i12, long j12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType, @Y61.k String str, @Y61.l String str2, @Y61.l List list) {
        this.f72541b = j12;
        this.f72542c = str;
        this.f72543d = i12;
        this.f72544e = serpDisplayType;
        this.f72545f = serpViewType;
        this.f72546g = str2;
        this.f72547h = list;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f72544e;
        String str = this.f72546g;
        List<DevelopmentFeature> list = this.f72547h;
        return new AdditionalSellerFeaturesItem(i12, this.f72541b, serpDisplayType, this.f72545f, this.f72542c, str, list);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f72544e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionalSellerFeaturesItem)) {
            return false;
        }
        AdditionalSellerFeaturesItem additionalSellerFeaturesItem = (AdditionalSellerFeaturesItem) obj;
        return this.f72541b == additionalSellerFeaturesItem.f72541b && L.f(this.f72542c, additionalSellerFeaturesItem.f72542c) && this.f72543d == additionalSellerFeaturesItem.f72543d && this.f72544e == additionalSellerFeaturesItem.f72544e && this.f72545f == additionalSellerFeaturesItem.f72545f && L.f(this.f72546g, additionalSellerFeaturesItem.f72546g) && L.f(this.f72547h, additionalSellerFeaturesItem.f72547h);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF72615b() {
        return this.f72541b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF72617d() {
        return this.f72543d;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF72937b() {
        return this.f72542c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF72619f() {
        return this.f72545f;
    }

    public final int hashCode() {
        int iJ2 = com.avito.android.actions_sheet.a.j(this.f72545f, com.avito.android.actions_sheet.a.h(this.f72544e, androidx.appcompat.app.r.e(this.f72543d, H.d(Long.hashCode(this.f72541b) * 31, 31, this.f72542c), 31), 31), 31);
        String str = this.f72546g;
        int iHashCode = (iJ2 + (str == null ? 0 : str.hashCode())) * 31;
        List<DevelopmentFeature> list = this.f72547h;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdditionalSellerFeaturesItem(id=");
        sb2.append(this.f72541b);
        sb2.append(", stringId=");
        sb2.append(this.f72542c);
        sb2.append(", spanCount=");
        sb2.append(this.f72543d);
        sb2.append(", displayType=");
        sb2.append(this.f72544e);
        sb2.append(", viewType=");
        sb2.append(this.f72545f);
        sb2.append(", title=");
        sb2.append(this.f72546g);
        sb2.append(", features=");
        return H.p(sb2, this.f72547h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f72541b);
        parcel.writeString(this.f72542c);
        parcel.writeInt(this.f72543d);
        parcel.writeString(this.f72544e.name());
        parcel.writeString(this.f72545f.name());
        parcel.writeString(this.f72546g);
        List<DevelopmentFeature> list = this.f72547h;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), i12);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdditionalSellerFeaturesItem(long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, String str2, List list, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 98;
        } else {
            j13 = j12;
        }
        this(i12, j13, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 2) != 0 ? String.valueOf(j13) : str, str2, list);
    }
}
