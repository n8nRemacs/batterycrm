package com.avito.android.advert.item.safedeal.real_one_click_payment_block;

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

/* compiled from: AdvertDetailsSafeDealPaymentBlockItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/AdvertDetailsSafeDealPaymentBlockItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsSafeDealPaymentBlockItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsSafeDealPaymentBlockItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f78903b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f78904c;

    /* renamed from: d, reason: collision with root package name */
    public final int f78905d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public SerpDisplayType f78906e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f78907f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final PaymentBlockItemState f78908g;

    /* compiled from: AdvertDetailsSafeDealPaymentBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsSafeDealPaymentBlockItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsSafeDealPaymentBlockItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsSafeDealPaymentBlockItem(parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), (PaymentBlockItemState) parcel.readParcelable(AdvertDetailsSafeDealPaymentBlockItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsSafeDealPaymentBlockItem[] newArray(int i12) {
            return new AdvertDetailsSafeDealPaymentBlockItem[i12];
        }
    }

    public AdvertDetailsSafeDealPaymentBlockItem(long j12, @k String str, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @k PaymentBlockItemState paymentBlockItemState) {
        this.f78903b = j12;
        this.f78904c = str;
        this.f78905d = i12;
        this.f78906e = serpDisplayType;
        this.f78907f = serpViewType;
        this.f78908g = paymentBlockItemState;
    }

    public static AdvertDetailsSafeDealPaymentBlockItem b(AdvertDetailsSafeDealPaymentBlockItem advertDetailsSafeDealPaymentBlockItem, int i12, PaymentBlockItemState paymentBlockItemState, int i13) {
        long j12 = advertDetailsSafeDealPaymentBlockItem.f78903b;
        String str = advertDetailsSafeDealPaymentBlockItem.f78904c;
        if ((i13 & 4) != 0) {
            i12 = advertDetailsSafeDealPaymentBlockItem.f78905d;
        }
        int i14 = i12;
        SerpDisplayType serpDisplayType = advertDetailsSafeDealPaymentBlockItem.f78906e;
        SerpViewType serpViewType = advertDetailsSafeDealPaymentBlockItem.f78907f;
        if ((i13 & 32) != 0) {
            paymentBlockItemState = advertDetailsSafeDealPaymentBlockItem.f78908g;
        }
        advertDetailsSafeDealPaymentBlockItem.getClass();
        return new AdvertDetailsSafeDealPaymentBlockItem(j12, str, i14, serpDisplayType, serpViewType, paymentBlockItemState);
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return b(this, i12, null, 59);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f78906e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsSafeDealPaymentBlockItem)) {
            return false;
        }
        AdvertDetailsSafeDealPaymentBlockItem advertDetailsSafeDealPaymentBlockItem = (AdvertDetailsSafeDealPaymentBlockItem) obj;
        return this.f78903b == advertDetailsSafeDealPaymentBlockItem.f78903b && L.f(this.f78904c, advertDetailsSafeDealPaymentBlockItem.f78904c) && this.f78905d == advertDetailsSafeDealPaymentBlockItem.f78905d && this.f78906e == advertDetailsSafeDealPaymentBlockItem.f78906e && this.f78907f == advertDetailsSafeDealPaymentBlockItem.f78907f && L.f(this.f78908g, advertDetailsSafeDealPaymentBlockItem.f78908g);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF79389b() {
        return this.f78903b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF84291c() {
        return this.f78905d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF84290b() {
        return this.f78904c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF84298j() {
        return this.f78907f;
    }

    public final int hashCode() {
        return this.f78908g.hashCode() + com.avito.android.actions_sheet.a.j(this.f78907f, com.avito.android.actions_sheet.a.h(this.f78906e, r.e(this.f78905d, H.d(Long.hashCode(this.f78903b) * 31, 31, this.f78904c), 31), 31), 31);
    }

    @k
    public final String toString() {
        return "AdvertDetailsSafeDealPaymentBlockItem(id=" + this.f78903b + ", stringId=" + this.f78904c + ", spanCount=" + this.f78905d + ", displayType=" + this.f78906e + ", viewType=" + this.f78907f + ", state=" + this.f78908g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f78903b);
        parcel.writeString(this.f78904c);
        parcel.writeInt(this.f78905d);
        parcel.writeString(this.f78906e.name());
        parcel.writeString(this.f78907f.name());
        parcel.writeParcelable(this.f78908g, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsSafeDealPaymentBlockItem(long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, PaymentBlockItemState paymentBlockItemState, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 31;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType, paymentBlockItemState);
    }
}
