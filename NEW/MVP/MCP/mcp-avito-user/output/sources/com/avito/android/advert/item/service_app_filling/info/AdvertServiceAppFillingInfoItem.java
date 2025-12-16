package com.avito.android.advert.item.service_app_filling.info;

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
import com.avito.android.remote.model.advert_service.AdvertServiceAppFilling;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertServiceAppFillingInfoItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/service_app_filling/info/AdvertServiceAppFillingInfoItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertServiceAppFillingInfoItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertServiceAppFillingInfoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f79796b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f79797c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public SerpDisplayType f79798d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SerpViewType f79799e;

    /* renamed from: f, reason: collision with root package name */
    public final int f79800f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final AdvertServiceAppFilling.AdvertServiceAppFillingDescription f79801g;

    /* compiled from: AdvertServiceAppFillingInfoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertServiceAppFillingInfoItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertServiceAppFillingInfoItem createFromParcel(Parcel parcel) {
            return new AdvertServiceAppFillingInfoItem(parcel.readLong(), parcel.readString(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), parcel.readInt(), (AdvertServiceAppFilling.AdvertServiceAppFillingDescription) parcel.readParcelable(AdvertServiceAppFillingInfoItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertServiceAppFillingInfoItem[] newArray(int i12) {
            return new AdvertServiceAppFillingInfoItem[i12];
        }
    }

    public AdvertServiceAppFillingInfoItem(long j12, @k String str, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, int i12, @k AdvertServiceAppFilling.AdvertServiceAppFillingDescription advertServiceAppFillingDescription) {
        this.f79796b = j12;
        this.f79797c = str;
        this.f79798d = serpDisplayType;
        this.f79799e = serpViewType;
        this.f79800f = i12;
        this.f79801g = advertServiceAppFillingDescription;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertServiceAppFillingInfoItem(this.f79796b, this.f79797c, this.f79798d, this.f79799e, i12, this.f79801g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f79798d = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertServiceAppFillingInfoItem)) {
            return false;
        }
        AdvertServiceAppFillingInfoItem advertServiceAppFillingInfoItem = (AdvertServiceAppFillingInfoItem) obj;
        return this.f79796b == advertServiceAppFillingInfoItem.f79796b && L.f(this.f79797c, advertServiceAppFillingInfoItem.f79797c) && this.f79798d == advertServiceAppFillingInfoItem.f79798d && this.f79799e == advertServiceAppFillingInfoItem.f79799e && this.f79800f == advertServiceAppFillingInfoItem.f79800f && L.f(this.f79801g, advertServiceAppFillingInfoItem.f79801g);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF77564b() {
        return this.f79796b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF77567e() {
        return this.f79800f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF236767b() {
        return this.f79797c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF77569g() {
        return this.f79799e;
    }

    public final int hashCode() {
        return this.f79801g.hashCode() + r.e(this.f79800f, com.avito.android.actions_sheet.a.j(this.f79799e, com.avito.android.actions_sheet.a.h(this.f79798d, H.d(Long.hashCode(this.f79796b) * 31, 31, this.f79797c), 31), 31), 31);
    }

    @k
    public final String toString() {
        return "AdvertServiceAppFillingInfoItem(id=" + this.f79796b + ", stringId=" + this.f79797c + ", displayType=" + this.f79798d + ", viewType=" + this.f79799e + ", spanCount=" + this.f79800f + ", description=" + this.f79801g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f79796b);
        parcel.writeString(this.f79797c);
        parcel.writeString(this.f79798d.name());
        parcel.writeString(this.f79799e.name());
        parcel.writeInt(this.f79800f);
        parcel.writeParcelable(this.f79801g, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertServiceAppFillingInfoItem(long j12, String str, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i12, AdvertServiceAppFilling.AdvertServiceAppFillingDescription advertServiceAppFillingDescription, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 106;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, (i13 & 4) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 8) != 0 ? SerpViewType.f268585e : serpViewType, i12, advertServiceAppFillingDescription);
    }
}
