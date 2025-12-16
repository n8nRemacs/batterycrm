package com.avito.android.advert_details_items.price_discount;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.advert_details_items.buyer_bonuses.BuyerBonusesItem;
import com.avito.android.advert_details_items.price_hint.PriceHintItem;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.remote.model.AdvertDiscounts;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import shark.AndroidResourceIdNames;

/* compiled from: PriceWithDiscountItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/price_discount/PriceWithDiscountItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PriceWithDiscountItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<PriceWithDiscountItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f85303b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f85304c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f85305d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f85306e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f85307f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AdvertDiscounts f85308g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AdvertDiscounts f85309h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f85310i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f85311j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final List<ContactBar.Button.Action> f85312k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final ContactBarData f85313l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final PriceHintItem f85314m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final BuyerBonusesItem f85315n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f85316o;

    /* renamed from: p, reason: collision with root package name */
    public final int f85317p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public SerpDisplayType f85318q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final SerpViewType f85319r;

    /* compiled from: PriceWithDiscountItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PriceWithDiscountItem> {
        @Override // android.os.Parcelable.Creator
        public final PriceWithDiscountItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            AdvertDiscounts advertDiscounts = (AdvertDiscounts) parcel.readParcelable(PriceWithDiscountItem.class.getClassLoader());
            AdvertDiscounts advertDiscounts2 = (AdvertDiscounts) parcel.readParcelable(PriceWithDiscountItem.class.getClassLoader());
            String string5 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(PriceWithDiscountItem.class, parcel, arrayList, iL2, 1);
            }
            return new PriceWithDiscountItem(j12, string, string2, string3, string4, advertDiscounts, advertDiscounts2, string5, z12, arrayList, (ContactBarData) parcel.readParcelable(PriceWithDiscountItem.class.getClassLoader()), parcel.readInt() == 0 ? null : PriceHintItem.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BuyerBonusesItem.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final PriceWithDiscountItem[] newArray(int i12) {
            return new PriceWithDiscountItem[i12];
        }
    }

    public PriceWithDiscountItem(long j12, @k String str, @k String str2, @l String str3, @l String str4, @l AdvertDiscounts advertDiscounts, @l AdvertDiscounts advertDiscounts2, @l String str5, boolean z12, @k List<ContactBar.Button.Action> list, @l ContactBarData contactBarData, @l PriceHintItem priceHintItem, @l BuyerBonusesItem buyerBonusesItem, boolean z13, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f85303b = j12;
        this.f85304c = str;
        this.f85305d = str2;
        this.f85306e = str3;
        this.f85307f = str4;
        this.f85308g = advertDiscounts;
        this.f85309h = advertDiscounts2;
        this.f85310i = str5;
        this.f85311j = z12;
        this.f85312k = list;
        this.f85313l = contactBarData;
        this.f85314m = priceHintItem;
        this.f85315n = buyerBonusesItem;
        this.f85316o = z13;
        this.f85317p = i12;
        this.f85318q = serpDisplayType;
        this.f85319r = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new PriceWithDiscountItem(this.f85303b, this.f85304c, this.f85305d, this.f85306e, this.f85307f, this.f85308g, this.f85309h, this.f85310i, this.f85311j, this.f85312k, this.f85313l, this.f85314m, this.f85315n, this.f85316o, i12, this.f85318q, this.f85319r);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f85318q = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceWithDiscountItem)) {
            return false;
        }
        PriceWithDiscountItem priceWithDiscountItem = (PriceWithDiscountItem) obj;
        return this.f85303b == priceWithDiscountItem.f85303b && L.f(this.f85304c, priceWithDiscountItem.f85304c) && L.f(this.f85305d, priceWithDiscountItem.f85305d) && L.f(this.f85306e, priceWithDiscountItem.f85306e) && L.f(this.f85307f, priceWithDiscountItem.f85307f) && L.f(this.f85308g, priceWithDiscountItem.f85308g) && L.f(this.f85309h, priceWithDiscountItem.f85309h) && L.f(this.f85310i, priceWithDiscountItem.f85310i) && this.f85311j == priceWithDiscountItem.f85311j && L.f(this.f85312k, priceWithDiscountItem.f85312k) && L.f(this.f85313l, priceWithDiscountItem.f85313l) && L.f(this.f85314m, priceWithDiscountItem.f85314m) && L.f(this.f85315n, priceWithDiscountItem.f85315n) && this.f85316o == priceWithDiscountItem.f85316o && this.f85317p == priceWithDiscountItem.f85317p && this.f85318q == priceWithDiscountItem.f85318q && this.f85319r == priceWithDiscountItem.f85319r;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF78300d() {
        return this.f85303b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF157700j() {
        return this.f85317p;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF262931b() {
        return this.f85304c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF157699i() {
        return this.f85319r;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(Long.hashCode(this.f85303b) * 31, 31, this.f85304c), 31, this.f85305d);
        String str = this.f85306e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f85307f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AdvertDiscounts advertDiscounts = this.f85308g;
        int iHashCode3 = (iHashCode2 + (advertDiscounts == null ? 0 : advertDiscounts.hashCode())) * 31;
        AdvertDiscounts advertDiscounts2 = this.f85309h;
        int iHashCode4 = (iHashCode3 + (advertDiscounts2 == null ? 0 : advertDiscounts2.hashCode())) * 31;
        String str3 = this.f85310i;
        int iE2 = H.e(r.i((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f85311j), 31, this.f85312k);
        ContactBarData contactBarData = this.f85313l;
        int iHashCode5 = (iE2 + (contactBarData == null ? 0 : contactBarData.hashCode())) * 31;
        PriceHintItem priceHintItem = this.f85314m;
        int iHashCode6 = (iHashCode5 + (priceHintItem == null ? 0 : priceHintItem.hashCode())) * 31;
        BuyerBonusesItem buyerBonusesItem = this.f85315n;
        return this.f85319r.hashCode() + com.avito.android.actions_sheet.a.h(this.f85318q, r.e(this.f85317p, r.i((iHashCode6 + (buyerBonusesItem != null ? buyerBonusesItem.hashCode() : 0)) * 31, 31, this.f85316o), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PriceWithDiscountItem(id=");
        sb2.append(this.f85303b);
        sb2.append(", stringId=");
        sb2.append(this.f85304c);
        sb2.append(", price=");
        sb2.append(this.f85305d);
        sb2.append(", priceWithoutDiscount=");
        sb2.append(this.f85306e);
        sb2.append(", normalizedPrice=");
        sb2.append(this.f85307f);
        sb2.append(", discounts=");
        sb2.append(this.f85308g);
        sb2.append(", newDiscounts=");
        sb2.append(this.f85309h);
        sb2.append(", discountPercent=");
        sb2.append(this.f85310i);
        sb2.append(", closedAdvert=");
        sb2.append(this.f85311j);
        sb2.append(", actions=");
        sb2.append(this.f85312k);
        sb2.append(", contactBarData=");
        sb2.append(this.f85313l);
        sb2.append(", priceHintItem=");
        sb2.append(this.f85314m);
        sb2.append(", buyerBonuses=");
        sb2.append(this.f85315n);
        sb2.append(", isRedesign=");
        sb2.append(this.f85316o);
        sb2.append(", spanCount=");
        sb2.append(this.f85317p);
        sb2.append(", displayType=");
        sb2.append(this.f85318q);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f85319r, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f85303b);
        parcel.writeString(this.f85304c);
        parcel.writeString(this.f85305d);
        parcel.writeString(this.f85306e);
        parcel.writeString(this.f85307f);
        parcel.writeParcelable(this.f85308g, i12);
        parcel.writeParcelable(this.f85309h, i12);
        parcel.writeString(this.f85310i);
        parcel.writeInt(this.f85311j ? 1 : 0);
        Iterator itJ = C0.j(this.f85312k, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.f85313l, i12);
        PriceHintItem priceHintItem = this.f85314m;
        if (priceHintItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceHintItem.writeToParcel(parcel, i12);
        }
        BuyerBonusesItem buyerBonusesItem = this.f85315n;
        if (buyerBonusesItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buyerBonusesItem.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f85316o ? 1 : 0);
        parcel.writeInt(this.f85317p);
        parcel.writeString(this.f85318q.name());
        parcel.writeString(this.f85319r.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PriceWithDiscountItem(long j12, String str, String str2, String str3, String str4, AdvertDiscounts advertDiscounts, AdvertDiscounts advertDiscounts2, String str5, boolean z12, List list, ContactBarData contactBarData, PriceHintItem priceHintItem, BuyerBonusesItem buyerBonusesItem, boolean z13, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 80;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, str2, str3, str4, advertDiscounts, advertDiscounts2, str5, z12, (i13 & 512) != 0 ? C42784z0.f406748b : list, (i13 & 1024) != 0 ? null : contactBarData, priceHintItem, buyerBonusesItem, (i13 & 8192) != 0 ? false : z13, i12, (32768 & i13) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
