package com.avito.android.advert.item.beduin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsBeduinItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/beduin/AdvertDetailsBeduinItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsBeduinItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsBeduinItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f73206b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f73207c;

    /* renamed from: d, reason: collision with root package name */
    public final int f73208d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f73209e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f73210f;

    /* compiled from: AdvertDetailsBeduinItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsBeduinItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsBeduinItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsBeduinItem(parcel.readString(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsBeduinItem[] newArray(int i12) {
            return new AdvertDetailsBeduinItem[i12];
        }
    }

    public AdvertDetailsBeduinItem(@Y61.k String str, @Y61.k String str2, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f73206b = str;
        this.f73207c = str2;
        this.f73208d = i12;
        this.f73209e = serpDisplayType;
        this.f73210f = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsBeduinItem(this.f73206b, this.f73207c, i12, this.f73209e, this.f73210f);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f73209e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsBeduinItem)) {
            return false;
        }
        AdvertDetailsBeduinItem advertDetailsBeduinItem = (AdvertDetailsBeduinItem) obj;
        return L.f(this.f73206b, advertDetailsBeduinItem.f73206b) && L.f(this.f73207c, advertDetailsBeduinItem.f73207c) && this.f73208d == advertDetailsBeduinItem.f73208d && this.f73209e == advertDetailsBeduinItem.f73209e && this.f73210f == advertDetailsBeduinItem.f73210f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80137b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF73103b() {
        return this.f73208d;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF206879g() {
        return this.f73206b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF80143h() {
        return this.f73210f;
    }

    public final int hashCode() {
        return this.f73210f.hashCode() + com.avito.android.actions_sheet.a.h(this.f73209e, r.e(this.f73208d, H.d(this.f73206b.hashCode() * 31, 31, this.f73207c), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsBeduinItem(formId=");
        sb2.append(this.f73206b);
        sb2.append(", beduinUrl=");
        sb2.append(this.f73207c);
        sb2.append(", spanCount=");
        sb2.append(this.f73208d);
        sb2.append(", displayType=");
        sb2.append(this.f73209e);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f73210f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f73206b);
        parcel.writeString(this.f73207c);
        parcel.writeInt(this.f73208d);
        parcel.writeString(this.f73209e.name());
        parcel.writeString(this.f73210f.name());
    }

    public /* synthetic */ AdvertDetailsBeduinItem(String str, String str2, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        this(str, str2, i12, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
