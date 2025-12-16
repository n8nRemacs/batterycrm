package com.avito.android.advert.item.abuse;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsAbuseItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/abuse/AdvertDetailsAbuseItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsAbuseItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsAbuseItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f72512b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f72513c;

    /* renamed from: d, reason: collision with root package name */
    public final long f72514d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f72515e;

    /* renamed from: f, reason: collision with root package name */
    public final int f72516f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final AdvertDetailsStyle f72517g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public SerpDisplayType f72518h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final SerpViewType f72519i;

    /* compiled from: AdvertDetailsAbuseItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsAbuseItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAbuseItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsAbuseItem(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readLong(), parcel.readString(), parcel.readInt(), AdvertDetailsStyle.valueOf(parcel.readString()), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAbuseItem[] newArray(int i12) {
            return new AdvertDetailsAbuseItem[i12];
        }
    }

    public AdvertDetailsAbuseItem(boolean z12, boolean z13, long j12, @k String str, int i12, @k AdvertDetailsStyle advertDetailsStyle, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f72512b = z12;
        this.f72513c = z13;
        this.f72514d = j12;
        this.f72515e = str;
        this.f72516f = i12;
        this.f72517g = advertDetailsStyle;
        this.f72518h = serpDisplayType;
        this.f72519i = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f72518h;
        return new AdvertDetailsAbuseItem(this.f72512b, this.f72513c, this.f72514d, this.f72515e, i12, this.f72517g, serpDisplayType, this.f72519i);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f72518h = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsAbuseItem)) {
            return false;
        }
        AdvertDetailsAbuseItem advertDetailsAbuseItem = (AdvertDetailsAbuseItem) obj;
        return this.f72512b == advertDetailsAbuseItem.f72512b && this.f72513c == advertDetailsAbuseItem.f72513c && this.f72514d == advertDetailsAbuseItem.f72514d && L.f(this.f72515e, advertDetailsAbuseItem.f72515e) && this.f72516f == advertDetailsAbuseItem.f72516f && this.f72517g == advertDetailsAbuseItem.f72517g && this.f72518h == advertDetailsAbuseItem.f72518h && this.f72519i == advertDetailsAbuseItem.f72519i;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF85216b() {
        return this.f72514d;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF272456g() {
        return this.f72516f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF272451b() {
        return this.f72515e;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF272455f() {
        return this.f72519i;
    }

    public final int hashCode() {
        return this.f72519i.hashCode() + com.avito.android.actions_sheet.a.h(this.f72518h, (this.f72517g.hashCode() + r.e(this.f72516f, H.d(r.g(r.i(Boolean.hashCode(this.f72512b) * 31, 31, this.f72513c), 31, this.f72514d), 31, this.f72515e), 31)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsAbuseItem(isRestyle=");
        sb2.append(this.f72512b);
        sb2.append(", isGig=");
        sb2.append(this.f72513c);
        sb2.append(", id=");
        sb2.append(this.f72514d);
        sb2.append(", stringId=");
        sb2.append(this.f72515e);
        sb2.append(", spanCount=");
        sb2.append(this.f72516f);
        sb2.append(", advertDetailsStyle=");
        sb2.append(this.f72517g);
        sb2.append(", displayType=");
        sb2.append(this.f72518h);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f72519i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f72512b ? 1 : 0);
        parcel.writeInt(this.f72513c ? 1 : 0);
        parcel.writeLong(this.f72514d);
        parcel.writeString(this.f72515e);
        parcel.writeInt(this.f72516f);
        parcel.writeString(this.f72517g.name());
        parcel.writeString(this.f72518h.name());
        parcel.writeString(this.f72519i.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsAbuseItem(boolean z12, boolean z13, long j12, String str, int i12, AdvertDetailsStyle advertDetailsStyle, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        boolean z14 = (i13 & 1) != 0 ? false : z12;
        boolean z15 = (i13 & 2) != 0 ? false : z13;
        if ((i13 & 4) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 26;
        } else {
            j13 = j12;
        }
        this(z14, z15, j13, (i13 & 8) != 0 ? String.valueOf(j13) : str, i12, advertDetailsStyle, (i13 & 64) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 128) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
