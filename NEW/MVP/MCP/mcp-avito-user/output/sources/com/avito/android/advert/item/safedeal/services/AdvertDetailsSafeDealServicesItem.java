package com.avito.android.advert.item.safedeal.services;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsSafeDealServicesItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/services/AdvertDetailsSafeDealServicesItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsSafeDealServicesItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsSafeDealServicesItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f79005b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f79006c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SafeDeal f79007d;

    /* renamed from: e, reason: collision with root package name */
    public final int f79008e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f79009f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f79010g;

    /* compiled from: AdvertDetailsSafeDealServicesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsSafeDealServicesItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsSafeDealServicesItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsSafeDealServicesItem(parcel.readLong(), parcel.readString(), (SafeDeal) parcel.readParcelable(AdvertDetailsSafeDealServicesItem.class.getClassLoader()), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsSafeDealServicesItem[] newArray(int i12) {
            return new AdvertDetailsSafeDealServicesItem[i12];
        }
    }

    public AdvertDetailsSafeDealServicesItem(long j12, @k String str, @k SafeDeal safeDeal, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f79005b = j12;
        this.f79006c = str;
        this.f79007d = safeDeal;
        this.f79008e = i12;
        this.f79009f = serpDisplayType;
        this.f79010g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsSafeDealServicesItem(this.f79005b, this.f79006c, this.f79007d, i12, this.f79009f, this.f79010g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f79009f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsSafeDealServicesItem)) {
            return false;
        }
        AdvertDetailsSafeDealServicesItem advertDetailsSafeDealServicesItem = (AdvertDetailsSafeDealServicesItem) obj;
        return this.f79005b == advertDetailsSafeDealServicesItem.f79005b && L.f(this.f79006c, advertDetailsSafeDealServicesItem.f79006c) && L.f(this.f79007d, advertDetailsSafeDealServicesItem.f79007d) && this.f79008e == advertDetailsSafeDealServicesItem.f79008e && this.f79009f == advertDetailsSafeDealServicesItem.f79009f && this.f79010g == advertDetailsSafeDealServicesItem.f79010g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75092b() {
        return this.f79005b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF264948c() {
        return this.f79008e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF288411b() {
        return this.f79006c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF264884g() {
        return this.f79010g;
    }

    public final int hashCode() {
        return this.f79010g.hashCode() + com.avito.android.actions_sheet.a.h(this.f79009f, r.e(this.f79008e, (this.f79007d.hashCode() + H.d(Long.hashCode(this.f79005b) * 31, 31, this.f79006c)) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsSafeDealServicesItem(id=");
        sb2.append(this.f79005b);
        sb2.append(", stringId=");
        sb2.append(this.f79006c);
        sb2.append(", safeDeal=");
        sb2.append(this.f79007d);
        sb2.append(", spanCount=");
        sb2.append(this.f79008e);
        sb2.append(", displayType=");
        sb2.append(this.f79009f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f79010g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f79005b);
        parcel.writeString(this.f79006c);
        parcel.writeParcelable(this.f79007d, i12);
        parcel.writeInt(this.f79008e);
        parcel.writeString(this.f79009f.name());
        parcel.writeString(this.f79010g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsSafeDealServicesItem(long j12, String str, SafeDeal safeDeal, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 32;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, safeDeal, i12, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
