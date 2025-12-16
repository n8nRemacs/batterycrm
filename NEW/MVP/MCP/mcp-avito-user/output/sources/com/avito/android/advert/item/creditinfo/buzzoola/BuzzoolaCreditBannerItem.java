package com.avito.android.advert.item.creditinfo.buzzoola;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BuzzoolaCreditBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/creditinfo/buzzoola/BuzzoolaCreditBannerItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class BuzzoolaCreditBannerItem implements BlockItem, Q, l1, b.InterfaceC10495b {

    @Y61.k
    public static final Parcelable.Creator<BuzzoolaCreditBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f74914b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f74915c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f74916d;

    /* renamed from: e, reason: collision with root package name */
    public final int f74917e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f74918f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f74919g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert.item.creditinfo.buzzoola.a f74920h;

    /* renamed from: i, reason: collision with root package name */
    public final long f74921i;

    /* compiled from: BuzzoolaCreditBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BuzzoolaCreditBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final BuzzoolaCreditBannerItem createFromParcel(Parcel parcel) {
            return new BuzzoolaCreditBannerItem(parcel.readLong(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), null, 64, null);
        }

        @Override // android.os.Parcelable.Creator
        public final BuzzoolaCreditBannerItem[] newArray(int i12) {
            return new BuzzoolaCreditBannerItem[i12];
        }
    }

    public BuzzoolaCreditBannerItem(long j12, @Y61.k String str, boolean z12, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType, @Y61.l com.avito.android.advert.item.creditinfo.buzzoola.a aVar) {
        this.f74914b = j12;
        this.f74915c = str;
        this.f74916d = z12;
        this.f74917e = i12;
        this.f74918f = serpDisplayType;
        this.f74919g = serpViewType;
        this.f74920h = aVar;
        this.f74921i = j12;
    }

    public static BuzzoolaCreditBannerItem b(BuzzoolaCreditBannerItem buzzoolaCreditBannerItem, int i12, com.avito.android.advert.item.creditinfo.buzzoola.a aVar, int i13) {
        long j12 = buzzoolaCreditBannerItem.f74914b;
        String str = buzzoolaCreditBannerItem.f74915c;
        boolean z12 = buzzoolaCreditBannerItem.f74916d;
        if ((i13 & 8) != 0) {
            i12 = buzzoolaCreditBannerItem.f74917e;
        }
        int i14 = i12;
        SerpDisplayType serpDisplayType = buzzoolaCreditBannerItem.f74918f;
        SerpViewType serpViewType = buzzoolaCreditBannerItem.f74919g;
        if ((i13 & 64) != 0) {
            aVar = buzzoolaCreditBannerItem.f74920h;
        }
        buzzoolaCreditBannerItem.getClass();
        return new BuzzoolaCreditBannerItem(j12, str, z12, i14, serpDisplayType, serpViewType, aVar);
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return b(this, i12, null, 119);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f74918f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuzzoolaCreditBannerItem)) {
            return false;
        }
        BuzzoolaCreditBannerItem buzzoolaCreditBannerItem = (BuzzoolaCreditBannerItem) obj;
        return this.f74914b == buzzoolaCreditBannerItem.f74914b && L.f(this.f74915c, buzzoolaCreditBannerItem.f74915c) && this.f74916d == buzzoolaCreditBannerItem.f74916d && this.f74917e == buzzoolaCreditBannerItem.f74917e && this.f74918f == buzzoolaCreditBannerItem.f74918f && this.f74919g == buzzoolaCreditBannerItem.f74919g && L.f(this.f74920h, buzzoolaCreditBannerItem.f74920h);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75315b() {
        return this.f74914b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF231634s() {
        return this.f74917e;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF231617b() {
        return this.f74915c;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF231637v() {
        return this.f74921i;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF231633r() {
        return this.f74919g;
    }

    public final int hashCode() {
        int iJ2 = com.avito.android.actions_sheet.a.j(this.f74919g, com.avito.android.actions_sheet.a.h(this.f74918f, androidx.appcompat.app.r.e(this.f74917e, androidx.appcompat.app.r.i(H.d(Long.hashCode(this.f74914b) * 31, 31, this.f74915c), 31, this.f74916d), 31), 31), 31);
        com.avito.android.advert.item.creditinfo.buzzoola.a aVar = this.f74920h;
        return iJ2 + (aVar == null ? 0 : aVar.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "BuzzoolaCreditBannerItem(id=" + this.f74914b + ", stringId=" + this.f74915c + ", showDivider=" + this.f74916d + ", spanCount=" + this.f74917e + ", displayType=" + this.f74918f + ", viewType=" + this.f74919g + ", creditBanner=" + this.f74920h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f74914b);
        parcel.writeString(this.f74915c);
        parcel.writeInt(this.f74916d ? 1 : 0);
        parcel.writeInt(this.f74917e);
        parcel.writeString(this.f74918f.name());
        parcel.writeString(this.f74919g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BuzzoolaCreditBannerItem(long j12, String str, boolean z12, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, com.avito.android.advert.item.creditinfo.buzzoola.a aVar, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 18;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, (i13 & 4) != 0 ? true : z12, i12, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 64) != 0 ? null : aVar);
    }
}
