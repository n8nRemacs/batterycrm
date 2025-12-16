package com.avito.android.advert.item.scroll_up;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
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

/* compiled from: AdvertDetailsScrollUpItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/scroll_up/AdvertDetailsScrollUpItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsScrollUpItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsScrollUpItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f79323b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f79324c;

    /* renamed from: d, reason: collision with root package name */
    public final int f79325d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public SerpDisplayType f79326e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f79327f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f79328g;

    /* compiled from: AdvertDetailsScrollUpItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsScrollUpItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsScrollUpItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsScrollUpItem(parcel.readInt(), parcel.readLong(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsScrollUpItem[] newArray(int i12) {
            return new AdvertDetailsScrollUpItem[i12];
        }
    }

    public AdvertDetailsScrollUpItem(int i12, long j12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @k String str, @k String str2) {
        this.f79323b = j12;
        this.f79324c = str;
        this.f79325d = i12;
        this.f79326e = serpDisplayType;
        this.f79327f = serpViewType;
        this.f79328g = str2;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        return new AdvertDetailsScrollUpItem(i12, this.f79323b, this.f79326e, this.f79327f, this.f79324c, this.f79328g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f79326e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsScrollUpItem)) {
            return false;
        }
        AdvertDetailsScrollUpItem advertDetailsScrollUpItem = (AdvertDetailsScrollUpItem) obj;
        return this.f79323b == advertDetailsScrollUpItem.f79323b && L.f(this.f79324c, advertDetailsScrollUpItem.f79324c) && this.f79325d == advertDetailsScrollUpItem.f79325d && this.f79326e == advertDetailsScrollUpItem.f79326e && this.f79327f == advertDetailsScrollUpItem.f79327f && L.f(this.f79328g, advertDetailsScrollUpItem.f79328g);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF79667f() {
        return this.f79323b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79663b() {
        return this.f79325d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79668g() {
        return this.f79324c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79669h() {
        return this.f79327f;
    }

    public final int hashCode() {
        return this.f79328g.hashCode() + com.avito.android.actions_sheet.a.j(this.f79327f, com.avito.android.actions_sheet.a.h(this.f79326e, r.e(this.f79325d, H.d(Long.hashCode(this.f79323b) * 31, 31, this.f79324c), 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsScrollUpItem(id=");
        sb2.append(this.f79323b);
        sb2.append(", stringId=");
        sb2.append(this.f79324c);
        sb2.append(", spanCount=");
        sb2.append(this.f79325d);
        sb2.append(", displayType=");
        sb2.append(this.f79326e);
        sb2.append(", viewType=");
        sb2.append(this.f79327f);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f79328g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f79323b);
        parcel.writeString(this.f79324c);
        parcel.writeInt(this.f79325d);
        parcel.writeString(this.f79326e.name());
        parcel.writeString(this.f79327f.name());
        parcel.writeString(this.f79328g);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsScrollUpItem(long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, String str2, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 213;
        } else {
            j13 = j12;
        }
        this(i12, j13, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 2) != 0 ? String.valueOf(j13) : str, str2);
    }
}
