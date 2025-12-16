package com.avito.android.advert.item.advertnumber;

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

/* compiled from: AdvertDetailsAdvertNumberItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/advertnumber/AdvertDetailsAdvertNumberItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsAdvertNumberItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsAdvertNumberItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f72713b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f72714c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f72715d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f72716e;

    /* renamed from: f, reason: collision with root package name */
    public final int f72717f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public SerpDisplayType f72718g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SerpViewType f72719h;

    /* compiled from: AdvertDetailsAdvertNumberItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsAdvertNumberItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAdvertNumberItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsAdvertNumberItem(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAdvertNumberItem[] newArray(int i12) {
            return new AdvertDetailsAdvertNumberItem[i12];
        }
    }

    public AdvertDetailsAdvertNumberItem(long j12, @k String str, @k String str2, @l String str3, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f72713b = j12;
        this.f72714c = str;
        this.f72715d = str2;
        this.f72716e = str3;
        this.f72717f = i12;
        this.f72718g = serpDisplayType;
        this.f72719h = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f72718g;
        return new AdvertDetailsAdvertNumberItem(this.f72713b, this.f72714c, this.f72715d, this.f72716e, i12, serpDisplayType, this.f72719h);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f72718g = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsAdvertNumberItem)) {
            return false;
        }
        AdvertDetailsAdvertNumberItem advertDetailsAdvertNumberItem = (AdvertDetailsAdvertNumberItem) obj;
        return this.f72713b == advertDetailsAdvertNumberItem.f72713b && L.f(this.f72714c, advertDetailsAdvertNumberItem.f72714c) && L.f(this.f72715d, advertDetailsAdvertNumberItem.f72715d) && L.f(this.f72716e, advertDetailsAdvertNumberItem.f72716e) && this.f72717f == advertDetailsAdvertNumberItem.f72717f && this.f72718g == advertDetailsAdvertNumberItem.f72718g && this.f72719h == advertDetailsAdvertNumberItem.f72719h;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75840b() {
        return this.f72713b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75844f() {
        return this.f72717f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF283243b() {
        return this.f72714c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75842d() {
        return this.f72719h;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(Long.hashCode(this.f72713b) * 31, 31, this.f72714c), 31, this.f72715d);
        String str = this.f72716e;
        return this.f72719h.hashCode() + com.avito.android.actions_sheet.a.h(this.f72718g, r.e(this.f72717f, (iD2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsAdvertNumberItem(id=");
        sb2.append(this.f72713b);
        sb2.append(", stringId=");
        sb2.append(this.f72714c);
        sb2.append(", advertNumber=");
        sb2.append(this.f72715d);
        sb2.append(", advertStats=");
        sb2.append(this.f72716e);
        sb2.append(", spanCount=");
        sb2.append(this.f72717f);
        sb2.append(", displayType=");
        sb2.append(this.f72718g);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f72719h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f72713b);
        parcel.writeString(this.f72714c);
        parcel.writeString(this.f72715d);
        parcel.writeString(this.f72716e);
        parcel.writeInt(this.f72717f);
        parcel.writeString(this.f72718g.name());
        parcel.writeString(this.f72719h.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsAdvertNumberItem(long j12, String str, String str2, String str3, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 25;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, str2, str3, i12, (i13 & 32) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 64) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
