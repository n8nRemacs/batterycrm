package com.avito.android.advert_details_items.services_discount_and_gifts;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.advert_service_discount_and_buyer_gift.AdvertServicesDiscountAndBuyerGift;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsServicesDiscountAndBuyerGiftItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/services_discount_and_gifts/AdvertDetailsServicesDiscountAndBuyerGiftItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsServicesDiscountAndBuyerGiftItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsServicesDiscountAndBuyerGiftItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f85650b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f85651c;

    /* renamed from: d, reason: collision with root package name */
    public final int f85652d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f85653e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f85654f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AdvertServicesDiscountAndBuyerGift.Gift f85655g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AdvertServicesDiscountAndBuyerGift.Discount f85656h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Long f85657i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Long f85658j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f85659k;

    /* compiled from: AdvertDetailsServicesDiscountAndBuyerGiftItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsServicesDiscountAndBuyerGiftItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsServicesDiscountAndBuyerGiftItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsServicesDiscountAndBuyerGiftItem(parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), (AdvertServicesDiscountAndBuyerGift.Gift) parcel.readParcelable(AdvertDetailsServicesDiscountAndBuyerGiftItem.class.getClassLoader()), (AdvertServicesDiscountAndBuyerGift.Discount) parcel.readParcelable(AdvertDetailsServicesDiscountAndBuyerGiftItem.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsServicesDiscountAndBuyerGiftItem[] newArray(int i12) {
            return new AdvertDetailsServicesDiscountAndBuyerGiftItem[i12];
        }
    }

    public AdvertDetailsServicesDiscountAndBuyerGiftItem(long j12, @Y61.k String str, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType, @l AdvertServicesDiscountAndBuyerGift.Gift gift, @l AdvertServicesDiscountAndBuyerGift.Discount discount, @l Long l12, @l Long l13, @l String str2) {
        this.f85650b = j12;
        this.f85651c = str;
        this.f85652d = i12;
        this.f85653e = serpDisplayType;
        this.f85654f = serpViewType;
        this.f85655g = gift;
        this.f85656h = discount;
        this.f85657i = l12;
        this.f85658j = l13;
        this.f85659k = str2;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsServicesDiscountAndBuyerGiftItem(this.f85650b, this.f85651c, i12, this.f85653e, this.f85654f, this.f85655g, this.f85656h, this.f85657i, this.f85658j, this.f85659k);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f85653e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsServicesDiscountAndBuyerGiftItem)) {
            return false;
        }
        AdvertDetailsServicesDiscountAndBuyerGiftItem advertDetailsServicesDiscountAndBuyerGiftItem = (AdvertDetailsServicesDiscountAndBuyerGiftItem) obj;
        return this.f85650b == advertDetailsServicesDiscountAndBuyerGiftItem.f85650b && L.f(this.f85651c, advertDetailsServicesDiscountAndBuyerGiftItem.f85651c) && this.f85652d == advertDetailsServicesDiscountAndBuyerGiftItem.f85652d && this.f85653e == advertDetailsServicesDiscountAndBuyerGiftItem.f85653e && this.f85654f == advertDetailsServicesDiscountAndBuyerGiftItem.f85654f && L.f(this.f85655g, advertDetailsServicesDiscountAndBuyerGiftItem.f85655g) && L.f(this.f85656h, advertDetailsServicesDiscountAndBuyerGiftItem.f85656h) && L.f(this.f85657i, advertDetailsServicesDiscountAndBuyerGiftItem.f85657i) && L.f(this.f85658j, advertDetailsServicesDiscountAndBuyerGiftItem.f85658j) && L.f(this.f85659k, advertDetailsServicesDiscountAndBuyerGiftItem.f85659k);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF270893b() {
        return this.f85650b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF73155b() {
        return this.f85652d;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF72570b() {
        return this.f85651c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF278856o() {
        return this.f85654f;
    }

    public final int hashCode() {
        int iJ2 = com.avito.android.actions_sheet.a.j(this.f85654f, com.avito.android.actions_sheet.a.h(this.f85653e, r.e(this.f85652d, H.d(Long.hashCode(this.f85650b) * 31, 31, this.f85651c), 31), 31), 31);
        AdvertServicesDiscountAndBuyerGift.Gift gift = this.f85655g;
        int iHashCode = (iJ2 + (gift == null ? 0 : gift.hashCode())) * 31;
        AdvertServicesDiscountAndBuyerGift.Discount discount = this.f85656h;
        int iHashCode2 = (iHashCode + (discount == null ? 0 : discount.hashCode())) * 31;
        Long l12 = this.f85657i;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f85658j;
        int iHashCode4 = (iHashCode3 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str = this.f85659k;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsServicesDiscountAndBuyerGiftItem(id=");
        sb2.append(this.f85650b);
        sb2.append(", stringId=");
        sb2.append(this.f85651c);
        sb2.append(", spanCount=");
        sb2.append(this.f85652d);
        sb2.append(", displayType=");
        sb2.append(this.f85653e);
        sb2.append(", viewType=");
        sb2.append(this.f85654f);
        sb2.append(", buyersGift=");
        sb2.append(this.f85655g);
        sb2.append(", servicesDiscount=");
        sb2.append(this.f85656h);
        sb2.append(", userId=");
        sb2.append(this.f85657i);
        sb2.append(", itemId=");
        sb2.append(this.f85658j);
        sb2.append(", stringParam=");
        return C22026a.c(sb2, this.f85659k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f85650b);
        parcel.writeString(this.f85651c);
        parcel.writeInt(this.f85652d);
        parcel.writeString(this.f85653e.name());
        parcel.writeString(this.f85654f.name());
        parcel.writeParcelable(this.f85655g, i12);
        parcel.writeParcelable(this.f85656h, i12);
        Long l12 = this.f85657i;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Long l13 = this.f85658j;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l13);
        }
        parcel.writeString(this.f85659k);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsServicesDiscountAndBuyerGiftItem(long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, AdvertServicesDiscountAndBuyerGift.Gift gift, AdvertServicesDiscountAndBuyerGift.Discount discount, Long l12, Long l13, String str2, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 63;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType, gift, discount, l12, l13, str2);
    }
}
