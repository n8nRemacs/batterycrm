package com.avito.android.advert_details_items.price_history;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PriceHistoryItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/price_history/PriceHistoryItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PriceHistoryItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<PriceHistoryItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public SerpDisplayType f85376b;

    /* renamed from: c, reason: collision with root package name */
    public final long f85377c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f85378d;

    /* renamed from: e, reason: collision with root package name */
    public final int f85379e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f85380f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f85381g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final DeepLink f85382h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f85383i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final AttributedText f85384j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f85385k;

    /* compiled from: PriceHistoryItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PriceHistoryItem> {
        @Override // android.os.Parcelable.Creator
        public final PriceHistoryItem createFromParcel(Parcel parcel) {
            return new PriceHistoryItem(SerpDisplayType.valueOf(parcel.readString()), parcel.readLong(), parcel.readString(), parcel.readInt(), SerpViewType.valueOf(parcel.readString()), parcel.readString(), (DeepLink) parcel.readParcelable(PriceHistoryItem.class.getClassLoader()), parcel.readInt() != 0, (AttributedText) parcel.readParcelable(PriceHistoryItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PriceHistoryItem[] newArray(int i12) {
            return new PriceHistoryItem[i12];
        }
    }

    public PriceHistoryItem(@k SerpDisplayType serpDisplayType, long j12, @k String str, int i12, @k SerpViewType serpViewType, @l String str2, @k DeepLink deepLink, boolean z12, @k AttributedText attributedText, boolean z13) {
        this.f85376b = serpDisplayType;
        this.f85377c = j12;
        this.f85378d = str;
        this.f85379e = i12;
        this.f85380f = serpViewType;
        this.f85381g = str2;
        this.f85382h = deepLink;
        this.f85383i = z12;
        this.f85384j = attributedText;
        this.f85385k = z13;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new PriceHistoryItem(this.f85376b, this.f85377c, this.f85378d, i12, this.f85380f, this.f85381g, this.f85382h, this.f85383i, this.f85384j, this.f85385k);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f85376b = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceHistoryItem)) {
            return false;
        }
        PriceHistoryItem priceHistoryItem = (PriceHistoryItem) obj;
        return this.f85376b == priceHistoryItem.f85376b && this.f85377c == priceHistoryItem.f85377c && L.f(this.f85378d, priceHistoryItem.f85378d) && this.f85379e == priceHistoryItem.f85379e && this.f85380f == priceHistoryItem.f85380f && L.f(this.f85381g, priceHistoryItem.f85381g) && L.f(this.f85382h, priceHistoryItem.f85382h) && this.f85383i == priceHistoryItem.f85383i && L.f(this.f85384j, priceHistoryItem.f85384j) && this.f85385k == priceHistoryItem.f85385k;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75467p() {
        return this.f85377c;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75469r() {
        return this.f85379e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75468q() {
        return this.f85378d;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75471t() {
        return this.f85380f;
    }

    public final int hashCode() {
        int iJ2 = com.avito.android.actions_sheet.a.j(this.f85380f, r.e(this.f85379e, H.d(r.g(this.f85376b.hashCode() * 31, 31, this.f85377c), 31, this.f85378d), 31), 31);
        String str = this.f85381g;
        return Boolean.hashCode(this.f85385k) + com.avito.android.actions_sheet.a.b(r.i(com.avito.android.actions_sheet.a.e(this.f85382h, (iJ2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f85383i), 31, this.f85384j);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PriceHistoryItem(displayType=");
        sb2.append(this.f85376b);
        sb2.append(", id=");
        sb2.append(this.f85377c);
        sb2.append(", stringId=");
        sb2.append(this.f85378d);
        sb2.append(", spanCount=");
        sb2.append(this.f85379e);
        sb2.append(", viewType=");
        sb2.append(this.f85380f);
        sb2.append(", context=");
        sb2.append(this.f85381g);
        sb2.append(", deepLink=");
        sb2.append(this.f85382h);
        sb2.append(", isFavorite=");
        sb2.append(this.f85383i);
        sb2.append(", title=");
        sb2.append(this.f85384j);
        sb2.append(", closedAdvert=");
        return r.x(sb2, this.f85385k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f85376b.name());
        parcel.writeLong(this.f85377c);
        parcel.writeString(this.f85378d);
        parcel.writeInt(this.f85379e);
        parcel.writeString(this.f85380f.name());
        parcel.writeString(this.f85381g);
        parcel.writeParcelable(this.f85382h, i12);
        parcel.writeInt(this.f85383i ? 1 : 0);
        parcel.writeParcelable(this.f85384j, i12);
        parcel.writeInt(this.f85385k ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PriceHistoryItem(SerpDisplayType serpDisplayType, long j12, String str, int i12, SerpViewType serpViewType, String str2, DeepLink deepLink, boolean z12, AttributedText attributedText, boolean z13, int i13, C42822w c42822w) {
        long j13;
        SerpDisplayType serpDisplayType2 = (i13 & 1) != 0 ? SerpDisplayType.Grid : serpDisplayType;
        if ((i13 & 2) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 206;
        } else {
            j13 = j12;
        }
        this(serpDisplayType2, j13, (i13 & 4) != 0 ? String.valueOf(j13) : str, i12, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType, str2, deepLink, z12, attributedText, z13);
    }
}
