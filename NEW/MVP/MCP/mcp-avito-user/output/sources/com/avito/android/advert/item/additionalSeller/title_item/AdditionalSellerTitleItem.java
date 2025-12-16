package com.avito.android.advert.item.additionalSeller.title_item;

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
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdditionalSellerTitleItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/additionalSeller/title_item/AdditionalSellerTitleItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdditionalSellerTitleItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdditionalSellerTitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f72615b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f72616c;

    /* renamed from: d, reason: collision with root package name */
    public final int f72617d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public SerpDisplayType f72618e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f72619f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final AttributedText f72620g;

    /* compiled from: AdditionalSellerTitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdditionalSellerTitleItem> {
        @Override // android.os.Parcelable.Creator
        public final AdditionalSellerTitleItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            return new AdditionalSellerTitleItem(parcel.readInt(), j12, SerpDisplayType.valueOf(parcel.readString()), (AttributedText) parcel.readParcelable(AdditionalSellerTitleItem.class.getClassLoader()), SerpViewType.valueOf(parcel.readString()), string);
        }

        @Override // android.os.Parcelable.Creator
        public final AdditionalSellerTitleItem[] newArray(int i12) {
            return new AdditionalSellerTitleItem[i12];
        }
    }

    public AdditionalSellerTitleItem(int i12, long j12, @k SerpDisplayType serpDisplayType, @k AttributedText attributedText, @k SerpViewType serpViewType, @k String str) {
        this.f72615b = j12;
        this.f72616c = str;
        this.f72617d = i12;
        this.f72618e = serpDisplayType;
        this.f72619f = serpViewType;
        this.f72620g = attributedText;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f72618e;
        SerpViewType serpViewType = this.f72619f;
        return new AdditionalSellerTitleItem(i12, this.f72615b, serpDisplayType, this.f72620g, serpViewType, this.f72616c);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f72618e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionalSellerTitleItem)) {
            return false;
        }
        AdditionalSellerTitleItem additionalSellerTitleItem = (AdditionalSellerTitleItem) obj;
        return this.f72615b == additionalSellerTitleItem.f72615b && L.f(this.f72616c, additionalSellerTitleItem.f72616c) && this.f72617d == additionalSellerTitleItem.f72617d && this.f72618e == additionalSellerTitleItem.f72618e && this.f72619f == additionalSellerTitleItem.f72619f && L.f(this.f72620g, additionalSellerTitleItem.f72620g);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF162200b() {
        return this.f72615b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF162538b() {
        return this.f72617d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF8979d() {
        return this.f72616c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF162547k() {
        return this.f72619f;
    }

    public final int hashCode() {
        return this.f72620g.hashCode() + com.avito.android.actions_sheet.a.j(this.f72619f, com.avito.android.actions_sheet.a.h(this.f72618e, r.e(this.f72617d, H.d(Long.hashCode(this.f72615b) * 31, 31, this.f72616c), 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdditionalSellerTitleItem(id=");
        sb2.append(this.f72615b);
        sb2.append(", stringId=");
        sb2.append(this.f72616c);
        sb2.append(", spanCount=");
        sb2.append(this.f72617d);
        sb2.append(", displayType=");
        sb2.append(this.f72618e);
        sb2.append(", viewType=");
        sb2.append(this.f72619f);
        sb2.append(", title=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f72620g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f72615b);
        parcel.writeString(this.f72616c);
        parcel.writeInt(this.f72617d);
        parcel.writeString(this.f72618e.name());
        parcel.writeString(this.f72619f.name());
        parcel.writeParcelable(this.f72620g, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdditionalSellerTitleItem(long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, AttributedText attributedText, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 96;
        } else {
            j13 = j12;
        }
        this(i12, j13, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, attributedText, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 2) != 0 ? String.valueOf(j13) : str);
    }
}
