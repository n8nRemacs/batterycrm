package com.avito.android.advert_details_items.price_description_button;

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
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.facebook.imageutils.JfifUtil;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsPriceDescriptionButtonItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/price_description_button/AdvertDetailsPriceDescriptionButtonItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsPriceDescriptionButtonItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsPriceDescriptionButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f85286b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f85287c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f85288d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f85289e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f85290f;

    /* renamed from: g, reason: collision with root package name */
    public final int f85291g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public SerpDisplayType f85292h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final SerpViewType f85293i;

    /* compiled from: AdvertDetailsPriceDescriptionButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsPriceDescriptionButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsPriceDescriptionButtonItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsPriceDescriptionButtonItem(parcel.readLong(), parcel.readString(), (DeepLink) parcel.readParcelable(AdvertDetailsPriceDescriptionButtonItem.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsPriceDescriptionButtonItem[] newArray(int i12) {
            return new AdvertDetailsPriceDescriptionButtonItem[i12];
        }
    }

    public AdvertDetailsPriceDescriptionButtonItem(long j12, @k String str, @k DeepLink deepLink, @k String str2, @InterfaceC42150f @l Integer num, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f85286b = j12;
        this.f85287c = str;
        this.f85288d = deepLink;
        this.f85289e = str2;
        this.f85290f = num;
        this.f85291g = i12;
        this.f85292h = serpDisplayType;
        this.f85293i = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsPriceDescriptionButtonItem(this.f85286b, this.f85287c, this.f85288d, this.f85289e, this.f85290f, i12, this.f85292h, this.f85293i);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f85292h = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsPriceDescriptionButtonItem)) {
            return false;
        }
        AdvertDetailsPriceDescriptionButtonItem advertDetailsPriceDescriptionButtonItem = (AdvertDetailsPriceDescriptionButtonItem) obj;
        return this.f85286b == advertDetailsPriceDescriptionButtonItem.f85286b && L.f(this.f85287c, advertDetailsPriceDescriptionButtonItem.f85287c) && L.f(this.f85288d, advertDetailsPriceDescriptionButtonItem.f85288d) && L.f(this.f85289e, advertDetailsPriceDescriptionButtonItem.f85289e) && L.f(this.f85290f, advertDetailsPriceDescriptionButtonItem.f85290f) && this.f85291g == advertDetailsPriceDescriptionButtonItem.f85291g && this.f85292h == advertDetailsPriceDescriptionButtonItem.f85292h && this.f85293i == advertDetailsPriceDescriptionButtonItem.f85293i;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF74201e() {
        return this.f85286b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79070f() {
        return this.f85291g;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79066b() {
        return this.f85287c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79072h() {
        return this.f85293i;
    }

    public final int hashCode() {
        int iD2 = H.d(com.avito.android.actions_sheet.a.e(this.f85288d, H.d(Long.hashCode(this.f85286b) * 31, 31, this.f85287c), 31), 31, this.f85289e);
        Integer num = this.f85290f;
        return this.f85293i.hashCode() + com.avito.android.actions_sheet.a.h(this.f85292h, r.e(this.f85291g, (iD2 + (num == null ? 0 : num.hashCode())) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsPriceDescriptionButtonItem(id=");
        sb2.append(this.f85286b);
        sb2.append(", stringId=");
        sb2.append(this.f85287c);
        sb2.append(", uri=");
        sb2.append(this.f85288d);
        sb2.append(", text=");
        sb2.append(this.f85289e);
        sb2.append(", leftIconAttrRes=");
        sb2.append(this.f85290f);
        sb2.append(", spanCount=");
        sb2.append(this.f85291g);
        sb2.append(", displayType=");
        sb2.append(this.f85292h);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f85293i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f85286b);
        parcel.writeString(this.f85287c);
        parcel.writeParcelable(this.f85288d, i12);
        parcel.writeString(this.f85289e);
        Integer num = this.f85290f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeInt(this.f85291g);
        parcel.writeString(this.f85292h.name());
        parcel.writeString(this.f85293i.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsPriceDescriptionButtonItem(long j12, String str, DeepLink deepLink, String str2, Integer num, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = JfifUtil.MARKER_SOI;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, deepLink, str2, num, i12, (i13 & 64) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 128) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
