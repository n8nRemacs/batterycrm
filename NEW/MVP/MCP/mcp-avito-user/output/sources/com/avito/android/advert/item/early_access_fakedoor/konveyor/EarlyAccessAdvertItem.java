package com.avito.android.advert.item.early_access_fakedoor.konveyor;

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
import com.avito.android.remote.model.early_access_advert.EarlyAccessAdvert;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessAdvertItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/early_access_fakedoor/konveyor/EarlyAccessAdvertItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class EarlyAccessAdvertItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<EarlyAccessAdvertItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f75294b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f75295c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SerpViewType f75296d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public SerpDisplayType f75297e;

    /* renamed from: f, reason: collision with root package name */
    public final int f75298f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final EarlyAccessAdvert f75299g;

    /* compiled from: EarlyAccessAdvertItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EarlyAccessAdvertItem> {
        @Override // android.os.Parcelable.Creator
        public final EarlyAccessAdvertItem createFromParcel(Parcel parcel) {
            return new EarlyAccessAdvertItem(parcel.readLong(), parcel.readString(), SerpViewType.valueOf(parcel.readString()), SerpDisplayType.valueOf(parcel.readString()), parcel.readInt(), (EarlyAccessAdvert) parcel.readParcelable(EarlyAccessAdvertItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final EarlyAccessAdvertItem[] newArray(int i12) {
            return new EarlyAccessAdvertItem[i12];
        }
    }

    public EarlyAccessAdvertItem(long j12, @k String str, @k SerpViewType serpViewType, @k SerpDisplayType serpDisplayType, int i12, @k EarlyAccessAdvert earlyAccessAdvert) {
        this.f75294b = j12;
        this.f75295c = str;
        this.f75296d = serpViewType;
        this.f75297e = serpDisplayType;
        this.f75298f = i12;
        this.f75299g = earlyAccessAdvert;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new EarlyAccessAdvertItem(this.f75294b, this.f75295c, this.f75296d, this.f75297e, i12, this.f75299g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f75297e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarlyAccessAdvertItem)) {
            return false;
        }
        EarlyAccessAdvertItem earlyAccessAdvertItem = (EarlyAccessAdvertItem) obj;
        return this.f75294b == earlyAccessAdvertItem.f75294b && L.f(this.f75295c, earlyAccessAdvertItem.f75295c) && this.f75296d == earlyAccessAdvertItem.f75296d && this.f75297e == earlyAccessAdvertItem.f75297e && this.f75298f == earlyAccessAdvertItem.f75298f && L.f(this.f75299g, earlyAccessAdvertItem.f75299g);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF78464b() {
        return this.f75294b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF78465c() {
        return this.f75298f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF78466d() {
        return this.f75295c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF78467e() {
        return this.f75296d;
    }

    public final int hashCode() {
        return this.f75299g.hashCode() + r.e(this.f75298f, com.avito.android.actions_sheet.a.h(this.f75297e, com.avito.android.actions_sheet.a.j(this.f75296d, H.d(Long.hashCode(this.f75294b) * 31, 31, this.f75295c), 31), 31), 31);
    }

    @k
    public final String toString() {
        return "EarlyAccessAdvertItem(id=" + this.f75294b + ", stringId=" + this.f75295c + ", viewType=" + this.f75296d + ", displayType=" + this.f75297e + ", spanCount=" + this.f75298f + ", earlyAccessAdvert=" + this.f75299g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f75294b);
        parcel.writeString(this.f75295c);
        parcel.writeString(this.f75296d.name());
        parcel.writeString(this.f75297e.name());
        parcel.writeInt(this.f75298f);
        parcel.writeParcelable(this.f75299g, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EarlyAccessAdvertItem(long j12, String str, SerpViewType serpViewType, SerpDisplayType serpDisplayType, int i12, EarlyAccessAdvert earlyAccessAdvert, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 167;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, (i13 & 4) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, i12, earlyAccessAdvert);
    }
}
