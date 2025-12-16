package com.avito.android.advert.item.safedeal.trust_factors.discount_voucher;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.safedeal.trust_factors.TrustFactorsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TrustFactorsVoucherItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/discount_voucher/TrustFactorsVoucherItem;", "Lcom/avito/android/advert/item/safedeal/trust_factors/TrustFactorsItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TrustFactorsVoucherItem implements TrustFactorsItem {

    @k
    public static final Parcelable.Creator<TrustFactorsVoucherItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f79104b;

    /* renamed from: c, reason: collision with root package name */
    public final int f79105c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TrustFactorsComponent.Voucher f79106d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final SafeDeal.TooltipData f79107e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f79108f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f79109g;

    /* compiled from: TrustFactorsVoucherItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrustFactorsVoucherItem> {
        @Override // android.os.Parcelable.Creator
        public final TrustFactorsVoucherItem createFromParcel(Parcel parcel) {
            return new TrustFactorsVoucherItem(parcel.readString(), parcel.readInt(), (TrustFactorsComponent.Voucher) parcel.readParcelable(TrustFactorsVoucherItem.class.getClassLoader()), (SafeDeal.TooltipData) parcel.readParcelable(TrustFactorsVoucherItem.class.getClassLoader()), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final TrustFactorsVoucherItem[] newArray(int i12) {
            return new TrustFactorsVoucherItem[i12];
        }
    }

    public TrustFactorsVoucherItem(@k String str, int i12, @k TrustFactorsComponent.Voucher voucher, @l SafeDeal.TooltipData tooltipData, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f79104b = str;
        this.f79105c = i12;
        this.f79106d = voucher;
        this.f79107e = tooltipData;
        this.f79108f = serpDisplayType;
        this.f79109g = serpViewType;
    }

    public static TrustFactorsVoucherItem b(TrustFactorsVoucherItem trustFactorsVoucherItem, int i12, SafeDeal.TooltipData tooltipData, int i13) {
        String str = trustFactorsVoucherItem.f79104b;
        if ((i13 & 2) != 0) {
            i12 = trustFactorsVoucherItem.f79105c;
        }
        int i14 = i12;
        TrustFactorsComponent.Voucher voucher = trustFactorsVoucherItem.f79106d;
        if ((i13 & 8) != 0) {
            tooltipData = trustFactorsVoucherItem.f79107e;
        }
        SerpDisplayType serpDisplayType = trustFactorsVoucherItem.f79108f;
        SerpViewType serpViewType = trustFactorsVoucherItem.f79109g;
        trustFactorsVoucherItem.getClass();
        return new TrustFactorsVoucherItem(str, i14, voucher, tooltipData, serpDisplayType, serpViewType);
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return b(this, i12, null, 61);
    }

    @Override // com.avito.android.advert.item.safedeal.trust_factors.TrustFactorsItem
    @k
    public final TrustFactorsItem S3(@l SafeDeal.TooltipData tooltipData) {
        return b(this, 0, tooltipData, 55);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f79108f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustFactorsVoucherItem)) {
            return false;
        }
        TrustFactorsVoucherItem trustFactorsVoucherItem = (TrustFactorsVoucherItem) obj;
        return L.f(this.f79104b, trustFactorsVoucherItem.f79104b) && this.f79105c == trustFactorsVoucherItem.f79105c && L.f(this.f79106d, trustFactorsVoucherItem.f79106d) && L.f(this.f79107e, trustFactorsVoucherItem.f79107e) && this.f79108f == trustFactorsVoucherItem.f79108f && this.f79109g == trustFactorsVoucherItem.f79109g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74201e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79070f() {
        return this.f79105c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79066b() {
        return this.f79104b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79072h() {
        return this.f79109g;
    }

    public final int hashCode() {
        int iHashCode = (this.f79106d.hashCode() + r.e(this.f79105c, this.f79104b.hashCode() * 31, 31)) * 31;
        SafeDeal.TooltipData tooltipData = this.f79107e;
        return this.f79109g.hashCode() + com.avito.android.actions_sheet.a.h(this.f79108f, (iHashCode + (tooltipData == null ? 0 : tooltipData.hashCode())) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrustFactorsVoucherItem(stringId=");
        sb2.append(this.f79104b);
        sb2.append(", spanCount=");
        sb2.append(this.f79105c);
        sb2.append(", data=");
        sb2.append(this.f79106d);
        sb2.append(", tooltip=");
        sb2.append(this.f79107e);
        sb2.append(", displayType=");
        sb2.append(this.f79108f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f79109g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f79104b);
        parcel.writeInt(this.f79105c);
        parcel.writeParcelable(this.f79106d, i12);
        parcel.writeParcelable(this.f79107e, i12);
        parcel.writeString(this.f79108f.name());
        parcel.writeString(this.f79109g.name());
    }

    public /* synthetic */ TrustFactorsVoucherItem(String str, int i12, TrustFactorsComponent.Voucher voucher, SafeDeal.TooltipData tooltipData, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        this(str, i12, voucher, (i13 & 8) != 0 ? null : tooltipData, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
