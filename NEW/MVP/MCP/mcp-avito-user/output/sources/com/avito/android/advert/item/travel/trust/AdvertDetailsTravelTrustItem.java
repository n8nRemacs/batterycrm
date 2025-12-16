package com.avito.android.advert.item.travel.trust;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.analytics.provider.clickstream.ParcelableClickStreamEvent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsTravelTrustItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/travel/trust/AdvertDetailsTravelTrustItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsTravelTrustItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsTravelTrustItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f80596b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f80597c;

    /* renamed from: d, reason: collision with root package name */
    public final int f80598d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public SerpDisplayType f80599e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f80600f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final AttributedText f80601g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final ParcelableClickStreamEvent f80602h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final DeepLink f80603i;

    /* compiled from: AdvertDetailsTravelTrustItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsTravelTrustItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsTravelTrustItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsTravelTrustItem(parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), (AttributedText) parcel.readParcelable(AdvertDetailsTravelTrustItem.class.getClassLoader()), (ParcelableClickStreamEvent) parcel.readParcelable(AdvertDetailsTravelTrustItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(AdvertDetailsTravelTrustItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsTravelTrustItem[] newArray(int i12) {
            return new AdvertDetailsTravelTrustItem[i12];
        }
    }

    public AdvertDetailsTravelTrustItem(long j12, @k String str, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @k AttributedText attributedText, @l ParcelableClickStreamEvent parcelableClickStreamEvent, @l DeepLink deepLink) {
        this.f80596b = j12;
        this.f80597c = str;
        this.f80598d = i12;
        this.f80599e = serpDisplayType;
        this.f80600f = serpViewType;
        this.f80601g = attributedText;
        this.f80602h = parcelableClickStreamEvent;
        this.f80603i = deepLink;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsTravelTrustItem(this.f80596b, this.f80597c, i12, this.f80599e, this.f80600f, this.f80601g, this.f80602h, this.f80603i);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f80599e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsTravelTrustItem)) {
            return false;
        }
        AdvertDetailsTravelTrustItem advertDetailsTravelTrustItem = (AdvertDetailsTravelTrustItem) obj;
        return this.f80596b == advertDetailsTravelTrustItem.f80596b && L.f(this.f80597c, advertDetailsTravelTrustItem.f80597c) && this.f80598d == advertDetailsTravelTrustItem.f80598d && this.f80599e == advertDetailsTravelTrustItem.f80599e && this.f80600f == advertDetailsTravelTrustItem.f80600f && L.f(this.f80601g, advertDetailsTravelTrustItem.f80601g) && L.f(this.f80602h, advertDetailsTravelTrustItem.f80602h) && L.f(this.f80603i, advertDetailsTravelTrustItem.f80603i);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF82706b() {
        return this.f80596b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF271560b() {
        return this.f80598d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF174226f() {
        return this.f80597c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF271564f() {
        return this.f80600f;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.j(this.f80600f, com.avito.android.actions_sheet.a.h(this.f80599e, r.e(this.f80598d, H.d(Long.hashCode(this.f80596b) * 31, 31, this.f80597c), 31), 31), 31), 31, this.f80601g);
        ParcelableClickStreamEvent parcelableClickStreamEvent = this.f80602h;
        int iHashCode = (iB2 + (parcelableClickStreamEvent == null ? 0 : parcelableClickStreamEvent.hashCode())) * 31;
        DeepLink deepLink = this.f80603i;
        return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsTravelTrustItem(id=");
        sb2.append(this.f80596b);
        sb2.append(", stringId=");
        sb2.append(this.f80597c);
        sb2.append(", spanCount=");
        sb2.append(this.f80598d);
        sb2.append(", displayType=");
        sb2.append(this.f80599e);
        sb2.append(", viewType=");
        sb2.append(this.f80600f);
        sb2.append(", title=");
        sb2.append(this.f80601g);
        sb2.append(", onShowEvent=");
        sb2.append(this.f80602h);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f80603i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f80596b);
        parcel.writeString(this.f80597c);
        parcel.writeInt(this.f80598d);
        parcel.writeString(this.f80599e.name());
        parcel.writeString(this.f80600f.name());
        parcel.writeParcelable(this.f80601g, i12);
        parcel.writeParcelable(this.f80602h, i12);
        parcel.writeParcelable(this.f80603i, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsTravelTrustItem(long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, AttributedText attributedText, ParcelableClickStreamEvent parcelableClickStreamEvent, DeepLink deepLink, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 212;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType, attributedText, parcelableClickStreamEvent, deepLink);
    }
}
