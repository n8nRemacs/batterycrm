package com.avito.android.advert.item.additionalSeller;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.additionalSeller.analytics.ButtonItemAnalyticsInfo;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.AdditionalSellerButtons;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdditionalSellerButtonItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/additionalSeller/AdditionalSellerButtonItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdditionalSellerButtonItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdditionalSellerButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f72531b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f72532c;

    /* renamed from: d, reason: collision with root package name */
    public final int f72533d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f72534e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f72535f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final AdditionalSellerButtons f72536g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f72537h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f72538i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f72539j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final ButtonItemAnalyticsInfo f72540k;

    /* compiled from: AdditionalSellerButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdditionalSellerButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final AdditionalSellerButtonItem createFromParcel(Parcel parcel) {
            return new AdditionalSellerButtonItem(parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), (AdditionalSellerButtons) parcel.readParcelable(AdditionalSellerButtonItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : ButtonItemAnalyticsInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AdditionalSellerButtonItem[] newArray(int i12) {
            return new AdditionalSellerButtonItem[i12];
        }
    }

    public AdditionalSellerButtonItem(long j12, @Y61.k String str, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType, @Y61.l AdditionalSellerButtons additionalSellerButtons, boolean z12, boolean z13, boolean z14, @Y61.l ButtonItemAnalyticsInfo buttonItemAnalyticsInfo) {
        this.f72531b = j12;
        this.f72532c = str;
        this.f72533d = i12;
        this.f72534e = serpDisplayType;
        this.f72535f = serpViewType;
        this.f72536g = additionalSellerButtons;
        this.f72537h = z12;
        this.f72538i = z13;
        this.f72539j = z14;
        this.f72540k = buttonItemAnalyticsInfo;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        return new AdditionalSellerButtonItem(this.f72531b, this.f72532c, i12, this.f72534e, this.f72535f, this.f72536g, this.f72537h, this.f72538i, this.f72539j, this.f72540k);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f72534e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionalSellerButtonItem)) {
            return false;
        }
        AdditionalSellerButtonItem additionalSellerButtonItem = (AdditionalSellerButtonItem) obj;
        return this.f72531b == additionalSellerButtonItem.f72531b && L.f(this.f72532c, additionalSellerButtonItem.f72532c) && this.f72533d == additionalSellerButtonItem.f72533d && this.f72534e == additionalSellerButtonItem.f72534e && this.f72535f == additionalSellerButtonItem.f72535f && L.f(this.f72536g, additionalSellerButtonItem.f72536g) && this.f72537h == additionalSellerButtonItem.f72537h && this.f72538i == additionalSellerButtonItem.f72538i && this.f72539j == additionalSellerButtonItem.f72539j && L.f(this.f72540k, additionalSellerButtonItem.f72540k);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF182863b() {
        return this.f72531b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF268606k() {
        return this.f72533d;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154485b() {
        return this.f72532c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF268605j() {
        return this.f72535f;
    }

    public final int hashCode() {
        int iJ2 = com.avito.android.actions_sheet.a.j(this.f72535f, com.avito.android.actions_sheet.a.h(this.f72534e, androidx.appcompat.app.r.e(this.f72533d, H.d(Long.hashCode(this.f72531b) * 31, 31, this.f72532c), 31), 31), 31);
        AdditionalSellerButtons additionalSellerButtons = this.f72536g;
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iJ2 + (additionalSellerButtons == null ? 0 : additionalSellerButtons.hashCode())) * 31, 31, this.f72537h), 31, this.f72538i), 31, this.f72539j);
        ButtonItemAnalyticsInfo buttonItemAnalyticsInfo = this.f72540k;
        return i12 + (buttonItemAnalyticsInfo != null ? buttonItemAnalyticsInfo.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "AdditionalSellerButtonItem(id=" + this.f72531b + ", stringId=" + this.f72532c + ", spanCount=" + this.f72533d + ", displayType=" + this.f72534e + ", viewType=" + this.f72535f + ", buttons=" + this.f72536g + ", isRedesign=" + this.f72537h + ", theme23Update=" + this.f72538i + ", newDevelopment=" + this.f72539j + ", analyticsInfo=" + this.f72540k + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f72531b);
        parcel.writeString(this.f72532c);
        parcel.writeInt(this.f72533d);
        parcel.writeString(this.f72534e.name());
        parcel.writeString(this.f72535f.name());
        parcel.writeParcelable(this.f72536g, i12);
        parcel.writeInt(this.f72537h ? 1 : 0);
        parcel.writeInt(this.f72538i ? 1 : 0);
        parcel.writeInt(this.f72539j ? 1 : 0);
        ButtonItemAnalyticsInfo buttonItemAnalyticsInfo = this.f72540k;
        if (buttonItemAnalyticsInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonItemAnalyticsInfo.writeToParcel(parcel, i12);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdditionalSellerButtonItem(long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, AdditionalSellerButtons additionalSellerButtons, boolean z12, boolean z13, boolean z14, ButtonItemAnalyticsInfo buttonItemAnalyticsInfo, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 97;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType, additionalSellerButtons, (i13 & 64) != 0 ? false : z12, (i13 & 128) != 0 ? false : z13, (i13 & 256) != 0 ? false : z14, (i13 & 512) != 0 ? null : buttonItemAnalyticsInfo);
    }
}
