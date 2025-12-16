package com.avito.android.advert.item.auto_credits;

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
import com.avito.android.remote.model.credit_broker.AdvertDetailsAutoLoansData;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsAutoLoansItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/auto_credits/AdvertDetailsAutoLoansItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsAutoLoansItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsAutoLoansItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f72881b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f72882c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AdvertDetailsAutoLoansData f72883d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f72884e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f72885f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f72886g;

    /* renamed from: h, reason: collision with root package name */
    public final int f72887h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public SerpDisplayType f72888i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final SerpViewType f72889j;

    /* compiled from: AdvertDetailsAutoLoansItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsAutoLoansItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAutoLoansItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsAutoLoansItem(parcel.readLong(), parcel.readString(), (AdvertDetailsAutoLoansData) parcel.readParcelable(AdvertDetailsAutoLoansItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAutoLoansItem[] newArray(int i12) {
            return new AdvertDetailsAutoLoansItem[i12];
        }
    }

    public AdvertDetailsAutoLoansItem(long j12, @k String str, @k AdvertDetailsAutoLoansData advertDetailsAutoLoansData, boolean z12, boolean z13, boolean z14, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f72881b = j12;
        this.f72882c = str;
        this.f72883d = advertDetailsAutoLoansData;
        this.f72884e = z12;
        this.f72885f = z13;
        this.f72886g = z14;
        this.f72887h = i12;
        this.f72888i = serpDisplayType;
        this.f72889j = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsAutoLoansItem(this.f72881b, this.f72882c, this.f72883d, this.f72884e, this.f72885f, this.f72886g, i12, this.f72888i, this.f72889j);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f72888i = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsAutoLoansItem)) {
            return false;
        }
        AdvertDetailsAutoLoansItem advertDetailsAutoLoansItem = (AdvertDetailsAutoLoansItem) obj;
        return this.f72881b == advertDetailsAutoLoansItem.f72881b && L.f(this.f72882c, advertDetailsAutoLoansItem.f72882c) && L.f(this.f72883d, advertDetailsAutoLoansItem.f72883d) && this.f72884e == advertDetailsAutoLoansItem.f72884e && this.f72885f == advertDetailsAutoLoansItem.f72885f && this.f72886g == advertDetailsAutoLoansItem.f72886g && this.f72887h == advertDetailsAutoLoansItem.f72887h && this.f72888i == advertDetailsAutoLoansItem.f72888i && this.f72889j == advertDetailsAutoLoansItem.f72889j;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF80368b() {
        return this.f72881b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF80370d() {
        return this.f72887h;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF173917b() {
        return this.f72882c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF80372f() {
        return this.f72889j;
    }

    public final int hashCode() {
        return this.f72889j.hashCode() + com.avito.android.actions_sheet.a.h(this.f72888i, r.e(this.f72887h, r.i(r.i(r.i((this.f72883d.hashCode() + H.d(Long.hashCode(this.f72881b) * 31, 31, this.f72882c)) * 31, 31, this.f72884e), 31, this.f72885f), 31, this.f72886g), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsAutoLoansItem(id=");
        sb2.append(this.f72881b);
        sb2.append(", stringId=");
        sb2.append(this.f72882c);
        sb2.append(", autoLoans=");
        sb2.append(this.f72883d);
        sb2.append(", isNewCalculator=");
        sb2.append(this.f72884e);
        sb2.append(", shouldScrollToCreditCalculator=");
        sb2.append(this.f72885f);
        sb2.append(", shouldCheckAuthentication=");
        sb2.append(this.f72886g);
        sb2.append(", spanCount=");
        sb2.append(this.f72887h);
        sb2.append(", displayType=");
        sb2.append(this.f72888i);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f72889j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f72881b);
        parcel.writeString(this.f72882c);
        parcel.writeParcelable(this.f72883d, i12);
        parcel.writeInt(this.f72884e ? 1 : 0);
        parcel.writeInt(this.f72885f ? 1 : 0);
        parcel.writeInt(this.f72886g ? 1 : 0);
        parcel.writeInt(this.f72887h);
        parcel.writeString(this.f72888i.name());
        parcel.writeString(this.f72889j.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsAutoLoansItem(long j12, String str, AdvertDetailsAutoLoansData advertDetailsAutoLoansData, boolean z12, boolean z13, boolean z14, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 47;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, advertDetailsAutoLoansData, z12, z13, z14, i12, (i13 & 128) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 256) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
