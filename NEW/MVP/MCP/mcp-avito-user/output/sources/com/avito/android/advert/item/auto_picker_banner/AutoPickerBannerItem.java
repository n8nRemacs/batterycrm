package com.avito.android.advert.item.auto_picker_banner;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.AdvertDetailsAutoPickerBanner;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoPickerBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/auto_picker_banner/AutoPickerBannerItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AutoPickerBannerItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AutoPickerBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f72970b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f72971c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AdvertDetailsAutoPickerBanner f72972d;

    /* renamed from: e, reason: collision with root package name */
    public final int f72973e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f72974f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f72975g;

    /* compiled from: AutoPickerBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoPickerBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final AutoPickerBannerItem createFromParcel(Parcel parcel) {
            return new AutoPickerBannerItem(parcel.readLong(), parcel.readString(), (AdvertDetailsAutoPickerBanner) parcel.readParcelable(AutoPickerBannerItem.class.getClassLoader()), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AutoPickerBannerItem[] newArray(int i12) {
            return new AutoPickerBannerItem[i12];
        }
    }

    public AutoPickerBannerItem(long j12, @Y61.k String str, @Y61.k AdvertDetailsAutoPickerBanner advertDetailsAutoPickerBanner, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f72970b = j12;
        this.f72971c = str;
        this.f72972d = advertDetailsAutoPickerBanner;
        this.f72973e = i12;
        this.f72974f = serpDisplayType;
        this.f72975g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AutoPickerBannerItem(this.f72970b, this.f72971c, this.f72972d, i12, this.f72974f, this.f72975g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f72974f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoPickerBannerItem)) {
            return false;
        }
        AutoPickerBannerItem autoPickerBannerItem = (AutoPickerBannerItem) obj;
        return this.f72970b == autoPickerBannerItem.f72970b && L.f(this.f72971c, autoPickerBannerItem.f72971c) && L.f(this.f72972d, autoPickerBannerItem.f72972d) && this.f72973e == autoPickerBannerItem.f72973e && this.f72974f == autoPickerBannerItem.f72974f && this.f72975g == autoPickerBannerItem.f72975g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF77564b() {
        return this.f72970b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF77567e() {
        return this.f72973e;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF236767b() {
        return this.f72971c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF77569g() {
        return this.f72975g;
    }

    public final int hashCode() {
        return this.f72975g.hashCode() + com.avito.android.actions_sheet.a.h(this.f72974f, r.e(this.f72973e, (this.f72972d.hashCode() + H.d(Long.hashCode(this.f72970b) * 31, 31, this.f72971c)) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoPickerBannerItem(id=");
        sb2.append(this.f72970b);
        sb2.append(", stringId=");
        sb2.append(this.f72971c);
        sb2.append(", autoPicker=");
        sb2.append(this.f72972d);
        sb2.append(", spanCount=");
        sb2.append(this.f72973e);
        sb2.append(", displayType=");
        sb2.append(this.f72974f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f72975g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f72970b);
        parcel.writeString(this.f72971c);
        parcel.writeParcelable(this.f72972d, i12);
        parcel.writeInt(this.f72973e);
        parcel.writeString(this.f72974f.name());
        parcel.writeString(this.f72975g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AutoPickerBannerItem(long j12, String str, AdvertDetailsAutoPickerBanner advertDetailsAutoPickerBanner, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 160;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, advertDetailsAutoPickerBanner, i12, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
