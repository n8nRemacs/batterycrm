package com.avito.android.advert.item.short_term_rent.str_buttons;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.short_term_rent.entity.ShortTermRentStrButtons;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsShortTermRentStrButtonsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/short_term_rent/str_buttons/AdvertDetailsShortTermRentStrButtonsItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsShortTermRentStrButtonsItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsShortTermRentStrButtonsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f80137b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f80138c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ShortTermRentStrButtons f80139d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f80140e;

    /* renamed from: f, reason: collision with root package name */
    public final int f80141f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f80142g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f80143h;

    /* compiled from: AdvertDetailsShortTermRentStrButtonsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsShortTermRentStrButtonsItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsShortTermRentStrButtonsItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsShortTermRentStrButtonsItem(parcel.readLong(), parcel.readString(), ShortTermRentStrButtons.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsShortTermRentStrButtonsItem[] newArray(int i12) {
            return new AdvertDetailsShortTermRentStrButtonsItem[i12];
        }
    }

    public AdvertDetailsShortTermRentStrButtonsItem(long j12, @Y61.k String str, @Y61.k ShortTermRentStrButtons shortTermRentStrButtons, boolean z12, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f80137b = j12;
        this.f80138c = str;
        this.f80139d = shortTermRentStrButtons;
        this.f80140e = z12;
        this.f80141f = i12;
        this.f80142g = serpDisplayType;
        this.f80143h = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsShortTermRentStrButtonsItem(this.f80137b, this.f80138c, this.f80139d, this.f80140e, i12, this.f80142g, this.f80143h);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f80142g = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsShortTermRentStrButtonsItem)) {
            return false;
        }
        AdvertDetailsShortTermRentStrButtonsItem advertDetailsShortTermRentStrButtonsItem = (AdvertDetailsShortTermRentStrButtonsItem) obj;
        return this.f80137b == advertDetailsShortTermRentStrButtonsItem.f80137b && L.f(this.f80138c, advertDetailsShortTermRentStrButtonsItem.f80138c) && L.f(this.f80139d, advertDetailsShortTermRentStrButtonsItem.f80139d) && this.f80140e == advertDetailsShortTermRentStrButtonsItem.f80140e && this.f80141f == advertDetailsShortTermRentStrButtonsItem.f80141f && this.f80142g == advertDetailsShortTermRentStrButtonsItem.f80142g && this.f80143h == advertDetailsShortTermRentStrButtonsItem.f80143h;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF117182c() {
        return this.f80137b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF78565d() {
        return this.f80141f;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF302049b() {
        return this.f80138c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF268800n0() {
        return this.f80143h;
    }

    public final int hashCode() {
        return this.f80143h.hashCode() + com.avito.android.actions_sheet.a.h(this.f80142g, r.e(this.f80141f, r.i((this.f80139d.hashCode() + H.d(Long.hashCode(this.f80137b) * 31, 31, this.f80138c)) * 31, 31, this.f80140e), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsShortTermRentStrButtonsItem(id=");
        sb2.append(this.f80137b);
        sb2.append(", stringId=");
        sb2.append(this.f80138c);
        sb2.append(", strButtons=");
        sb2.append(this.f80139d);
        sb2.append(", isRedesign=");
        sb2.append(this.f80140e);
        sb2.append(", spanCount=");
        sb2.append(this.f80141f);
        sb2.append(", displayType=");
        sb2.append(this.f80142g);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f80143h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f80137b);
        parcel.writeString(this.f80138c);
        this.f80139d.writeToParcel(parcel, i12);
        parcel.writeInt(this.f80140e ? 1 : 0);
        parcel.writeInt(this.f80141f);
        parcel.writeString(this.f80142g.name());
        parcel.writeString(this.f80143h.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsShortTermRentStrButtonsItem(long j12, String str, ShortTermRentStrButtons shortTermRentStrButtons, boolean z12, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 45;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, shortTermRentStrButtons, z12, i12, (i13 & 32) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 64) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
