package com.avito.android.advert_details_items.buyer_bonuses;

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
import com.avito.android.remote.model.buyer_bonuses.BuyerBonuses;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import pb.InterfaceC47047c;

/* compiled from: BuyerBonusesItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/buyer_bonuses/BuyerBonusesItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lpb/c;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class BuyerBonusesItem implements BlockItem, InterfaceC47047c, l1 {

    @k
    public static final Parcelable.Creator<BuyerBonusesItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f84469b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f84470c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final BuyerBonuses f84471d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f84472e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f84473f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f84474g;

    /* renamed from: h, reason: collision with root package name */
    public final int f84475h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final SerpDisplayType f84476i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final SerpViewType f84477j;

    /* compiled from: BuyerBonusesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BuyerBonusesItem> {
        @Override // android.os.Parcelable.Creator
        public final BuyerBonusesItem createFromParcel(Parcel parcel) {
            return new BuyerBonusesItem(parcel.readLong(), parcel.readString(), (BuyerBonuses) parcel.readParcelable(BuyerBonusesItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final BuyerBonusesItem[] newArray(int i12) {
            return new BuyerBonusesItem[i12];
        }
    }

    public BuyerBonusesItem(long j12, @k String str, @k BuyerBonuses buyerBonuses, @l String str2, @l String str3, boolean z12, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f84469b = j12;
        this.f84470c = str;
        this.f84471d = buyerBonuses;
        this.f84472e = str2;
        this.f84473f = str3;
        this.f84474g = z12;
        this.f84475h = i12;
        this.f84476i = serpDisplayType;
        this.f84477j = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new BuyerBonusesItem(this.f84469b, this.f84470c, this.f84471d, this.f84472e, this.f84473f, this.f84474g, i12, this.f84476i, this.f84477j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuyerBonusesItem)) {
            return false;
        }
        BuyerBonusesItem buyerBonusesItem = (BuyerBonusesItem) obj;
        return this.f84469b == buyerBonusesItem.f84469b && L.f(this.f84470c, buyerBonusesItem.f84470c) && L.f(this.f84471d, buyerBonusesItem.f84471d) && L.f(this.f84472e, buyerBonusesItem.f84472e) && L.f(this.f84473f, buyerBonusesItem.f84473f) && this.f84474g == buyerBonusesItem.f84474g && this.f84475h == buyerBonusesItem.f84475h && this.f84476i == buyerBonusesItem.f84476i && this.f84477j == buyerBonusesItem.f84477j;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF79816g() {
        return this.f84469b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79818i() {
        return this.f84475h;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79817h() {
        return this.f84470c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79820k() {
        return this.f84477j;
    }

    public final int hashCode() {
        int iHashCode = (this.f84471d.hashCode() + H.d(Long.hashCode(this.f84469b) * 31, 31, this.f84470c)) * 31;
        String str = this.f84472e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f84473f;
        return this.f84477j.hashCode() + com.avito.android.actions_sheet.a.h(this.f84476i, r.e(this.f84475h, r.i((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f84474g), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuyerBonusesItem(id=");
        sb2.append(this.f84469b);
        sb2.append(", stringId=");
        sb2.append(this.f84470c);
        sb2.append(", buyerBonuses=");
        sb2.append(this.f84471d);
        sb2.append(", price=");
        sb2.append(this.f84472e);
        sb2.append(", normalizedPrice=");
        sb2.append(this.f84473f);
        sb2.append(", showLastMinuteOfferDiscountIcon=");
        sb2.append(this.f84474g);
        sb2.append(", spanCount=");
        sb2.append(this.f84475h);
        sb2.append(", displayType=");
        sb2.append(this.f84476i);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f84477j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f84469b);
        parcel.writeString(this.f84470c);
        parcel.writeParcelable(this.f84471d, i12);
        parcel.writeString(this.f84472e);
        parcel.writeString(this.f84473f);
        parcel.writeInt(this.f84474g ? 1 : 0);
        parcel.writeInt(this.f84475h);
        parcel.writeString(this.f84476i.name());
        parcel.writeString(this.f84477j.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BuyerBonusesItem(long j12, String str, BuyerBonuses buyerBonuses, String str2, String str3, boolean z12, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 147;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, buyerBonuses, str2, str3, z12, i12, (i13 & 128) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 256) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
