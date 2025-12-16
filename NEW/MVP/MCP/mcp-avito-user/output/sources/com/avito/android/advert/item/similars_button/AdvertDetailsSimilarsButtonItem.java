package com.avito.android.advert.item.similars_button;

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
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsSimilarsButtonItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/similars_button/AdvertDetailsSimilarsButtonItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsSimilarsButtonItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsSimilarsButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f80339b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f80340c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f80341d;

    /* renamed from: e, reason: collision with root package name */
    public final long f80342e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f80343f;

    /* renamed from: g, reason: collision with root package name */
    public final int f80344g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public SerpDisplayType f80345h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final SerpViewType f80346i;

    /* compiled from: AdvertDetailsSimilarsButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsSimilarsButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsSimilarsButtonItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsSimilarsButtonItem(parcel.readString(), (DeepLink) parcel.readParcelable(AdvertDetailsSimilarsButtonItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsSimilarsButtonItem[] newArray(int i12) {
            return new AdvertDetailsSimilarsButtonItem[i12];
        }
    }

    public AdvertDetailsSimilarsButtonItem(@k String str, @l DeepLink deepLink, boolean z12, long j12, @k String str2, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f80339b = str;
        this.f80340c = deepLink;
        this.f80341d = z12;
        this.f80342e = j12;
        this.f80343f = str2;
        this.f80344g = i12;
        this.f80345h = serpDisplayType;
        this.f80346i = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsSimilarsButtonItem(this.f80339b, this.f80340c, this.f80341d, this.f80342e, this.f80343f, i12, this.f80345h, this.f80346i);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f80345h = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsSimilarsButtonItem)) {
            return false;
        }
        AdvertDetailsSimilarsButtonItem advertDetailsSimilarsButtonItem = (AdvertDetailsSimilarsButtonItem) obj;
        return L.f(this.f80339b, advertDetailsSimilarsButtonItem.f80339b) && L.f(this.f80340c, advertDetailsSimilarsButtonItem.f80340c) && this.f80341d == advertDetailsSimilarsButtonItem.f80341d && this.f80342e == advertDetailsSimilarsButtonItem.f80342e && L.f(this.f80343f, advertDetailsSimilarsButtonItem.f80343f) && this.f80344g == advertDetailsSimilarsButtonItem.f80344g && this.f80345h == advertDetailsSimilarsButtonItem.f80345h && this.f80346i == advertDetailsSimilarsButtonItem.f80346i;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF428153b() {
        return this.f80342e;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF85018q() {
        return this.f80344g;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281482b() {
        return this.f80343f;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF85020s() {
        return this.f80346i;
    }

    public final int hashCode() {
        int iHashCode = this.f80339b.hashCode() * 31;
        DeepLink deepLink = this.f80340c;
        return this.f80346i.hashCode() + com.avito.android.actions_sheet.a.h(this.f80345h, r.e(this.f80344g, H.d(r.g(r.i((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f80341d), 31, this.f80342e), 31, this.f80343f), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsSimilarsButtonItem(text=");
        sb2.append(this.f80339b);
        sb2.append(", deepLink=");
        sb2.append(this.f80340c);
        sb2.append(", withBigTopOffset=");
        sb2.append(this.f80341d);
        sb2.append(", id=");
        sb2.append(this.f80342e);
        sb2.append(", stringId=");
        sb2.append(this.f80343f);
        sb2.append(", spanCount=");
        sb2.append(this.f80344g);
        sb2.append(", displayType=");
        sb2.append(this.f80345h);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f80346i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f80339b);
        parcel.writeParcelable(this.f80340c, i12);
        parcel.writeInt(this.f80341d ? 1 : 0);
        parcel.writeLong(this.f80342e);
        parcel.writeString(this.f80343f);
        parcel.writeInt(this.f80344g);
        parcel.writeString(this.f80345h.name());
        parcel.writeString(this.f80346i.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsSimilarsButtonItem(String str, DeepLink deepLink, boolean z12, long j12, String str2, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        boolean z13 = (i13 & 4) != 0 ? false : z12;
        if ((i13 & 8) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 68;
        } else {
            j13 = j12;
        }
        this(str, deepLink, z13, j13, (i13 & 16) != 0 ? String.valueOf(j13) : str2, i12, (i13 & 64) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 128) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
