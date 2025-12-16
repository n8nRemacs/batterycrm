package com.avito.android.advert.item.disclaimer;

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
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsDisclaimerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/disclaimer/AdvertDetailsDisclaimerItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsDisclaimerItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsDisclaimerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f75203b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f75204c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DisclaimerData f75205d;

    /* renamed from: e, reason: collision with root package name */
    public final int f75206e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f75207f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f75208g;

    /* compiled from: AdvertDetailsDisclaimerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsDisclaimerItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsDisclaimerItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsDisclaimerItem(parcel.readLong(), parcel.readString(), DisclaimerData.CREATOR.createFromParcel(parcel), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsDisclaimerItem[] newArray(int i12) {
            return new AdvertDetailsDisclaimerItem[i12];
        }
    }

    public AdvertDetailsDisclaimerItem(long j12, @k String str, @k DisclaimerData disclaimerData, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f75203b = j12;
        this.f75204c = str;
        this.f75205d = disclaimerData;
        this.f75206e = i12;
        this.f75207f = serpDisplayType;
        this.f75208g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsDisclaimerItem(this.f75203b, this.f75204c, this.f75205d, i12, this.f75207f, this.f75208g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f75207f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsDisclaimerItem)) {
            return false;
        }
        AdvertDetailsDisclaimerItem advertDetailsDisclaimerItem = (AdvertDetailsDisclaimerItem) obj;
        return this.f75203b == advertDetailsDisclaimerItem.f75203b && L.f(this.f75204c, advertDetailsDisclaimerItem.f75204c) && L.f(this.f75205d, advertDetailsDisclaimerItem.f75205d) && this.f75206e == advertDetailsDisclaimerItem.f75206e && this.f75207f == advertDetailsDisclaimerItem.f75207f && this.f75208g == advertDetailsDisclaimerItem.f75208g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF85216b() {
        return this.f75203b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF272456g() {
        return this.f75206e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF272451b() {
        return this.f75204c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF272455f() {
        return this.f75208g;
    }

    public final int hashCode() {
        return this.f75208g.hashCode() + com.avito.android.actions_sheet.a.h(this.f75207f, r.e(this.f75206e, (this.f75205d.hashCode() + H.d(Long.hashCode(this.f75203b) * 31, 31, this.f75204c)) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsDisclaimerItem(id=");
        sb2.append(this.f75203b);
        sb2.append(", stringId=");
        sb2.append(this.f75204c);
        sb2.append(", disclaimerData=");
        sb2.append(this.f75205d);
        sb2.append(", spanCount=");
        sb2.append(this.f75206e);
        sb2.append(", displayType=");
        sb2.append(this.f75207f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f75208g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f75203b);
        parcel.writeString(this.f75204c);
        this.f75205d.writeToParcel(parcel, i12);
        parcel.writeInt(this.f75206e);
        parcel.writeString(this.f75207f.name());
        parcel.writeString(this.f75208g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsDisclaimerItem(long j12, String str, DisclaimerData disclaimerData, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 5;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, disclaimerData, i12, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
