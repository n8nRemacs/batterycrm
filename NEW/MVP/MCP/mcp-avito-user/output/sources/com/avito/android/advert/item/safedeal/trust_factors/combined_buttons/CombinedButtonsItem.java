package com.avito.android.advert.item.safedeal.trust_factors.combined_buttons;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.safedeal.trust_factors.TrustFactorsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.advert_core.blocks.BottomOffsetProviderItem;
import com.avito.android.delivery_combined_buttons_public.CombinedButtonsData;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CombinedButtonsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/combined_buttons/CombinedButtonsItem;", "Lcom/avito/android/advert/item/safedeal/trust_factors/TrustFactorsItem;", "Lcom/avito/android/advert_core/blocks/BottomOffsetProviderItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CombinedButtonsItem implements TrustFactorsItem, BottomOffsetProviderItem {

    @k
    public static final Parcelable.Creator<CombinedButtonsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f79066b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CombinedButtonsData f79067c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final FreeDeliveryBlock f79068d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final SafeDeal.TooltipData f79069e;

    /* renamed from: f, reason: collision with root package name */
    public final int f79070f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public SerpDisplayType f79071g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SerpViewType f79072h;

    /* compiled from: CombinedButtonsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CombinedButtonsItem> {
        @Override // android.os.Parcelable.Creator
        public final CombinedButtonsItem createFromParcel(Parcel parcel) {
            return new CombinedButtonsItem(parcel.readString(), (CombinedButtonsData) parcel.readParcelable(CombinedButtonsItem.class.getClassLoader()), parcel.readInt() == 0 ? null : FreeDeliveryBlock.CREATOR.createFromParcel(parcel), (SafeDeal.TooltipData) parcel.readParcelable(CombinedButtonsItem.class.getClassLoader()), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final CombinedButtonsItem[] newArray(int i12) {
            return new CombinedButtonsItem[i12];
        }
    }

    public CombinedButtonsItem(@k String str, @k CombinedButtonsData combinedButtonsData, @l FreeDeliveryBlock freeDeliveryBlock, @l SafeDeal.TooltipData tooltipData, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f79066b = str;
        this.f79067c = combinedButtonsData;
        this.f79068d = freeDeliveryBlock;
        this.f79069e = tooltipData;
        this.f79070f = i12;
        this.f79071g = serpDisplayType;
        this.f79072h = serpViewType;
    }

    public static CombinedButtonsItem b(CombinedButtonsItem combinedButtonsItem, SafeDeal.TooltipData tooltipData, int i12, int i13) {
        String str = combinedButtonsItem.f79066b;
        CombinedButtonsData combinedButtonsData = combinedButtonsItem.f79067c;
        FreeDeliveryBlock freeDeliveryBlock = combinedButtonsItem.f79068d;
        if ((i13 & 8) != 0) {
            tooltipData = combinedButtonsItem.f79069e;
        }
        SafeDeal.TooltipData tooltipData2 = tooltipData;
        if ((i13 & 16) != 0) {
            i12 = combinedButtonsItem.f79070f;
        }
        SerpDisplayType serpDisplayType = combinedButtonsItem.f79071g;
        SerpViewType serpViewType = combinedButtonsItem.f79072h;
        combinedButtonsItem.getClass();
        return new CombinedButtonsItem(str, combinedButtonsData, freeDeliveryBlock, tooltipData2, i12, serpDisplayType, serpViewType);
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return b(this, null, i12, 111);
    }

    @Override // com.avito.android.advert.item.safedeal.trust_factors.TrustFactorsItem
    @k
    public final TrustFactorsItem S3(@l SafeDeal.TooltipData tooltipData) {
        return b(this, tooltipData, 0, 119);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f79071g = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombinedButtonsItem)) {
            return false;
        }
        CombinedButtonsItem combinedButtonsItem = (CombinedButtonsItem) obj;
        return L.f(this.f79066b, combinedButtonsItem.f79066b) && L.f(this.f79067c, combinedButtonsItem.f79067c) && L.f(this.f79068d, combinedButtonsItem.f79068d) && L.f(this.f79069e, combinedButtonsItem.f79069e) && this.f79070f == combinedButtonsItem.f79070f && this.f79071g == combinedButtonsItem.f79071g && this.f79072h == combinedButtonsItem.f79072h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74201e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75425n() {
        return this.f79070f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF74202f() {
        return this.f79066b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75427p() {
        return this.f79072h;
    }

    public final int hashCode() {
        int iHashCode = (this.f79067c.hashCode() + (this.f79066b.hashCode() * 31)) * 31;
        FreeDeliveryBlock freeDeliveryBlock = this.f79068d;
        int iHashCode2 = (iHashCode + (freeDeliveryBlock == null ? 0 : freeDeliveryBlock.hashCode())) * 31;
        SafeDeal.TooltipData tooltipData = this.f79069e;
        return this.f79072h.hashCode() + com.avito.android.actions_sheet.a.h(this.f79071g, r.e(this.f79070f, (iHashCode2 + (tooltipData != null ? tooltipData.hashCode() : 0)) * 31, 31), 31);
    }

    @Override // com.avito.android.advert_core.blocks.BottomOffsetProviderItem
    public final int r2() {
        return 64;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CombinedButtonsItem(stringId=");
        sb2.append(this.f79066b);
        sb2.append(", data=");
        sb2.append(this.f79067c);
        sb2.append(", freeDeliveryBlock=");
        sb2.append(this.f79068d);
        sb2.append(", tooltip=");
        sb2.append(this.f79069e);
        sb2.append(", spanCount=");
        sb2.append(this.f79070f);
        sb2.append(", displayType=");
        sb2.append(this.f79071g);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f79072h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f79066b);
        parcel.writeParcelable(this.f79067c, i12);
        FreeDeliveryBlock freeDeliveryBlock = this.f79068d;
        if (freeDeliveryBlock == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            freeDeliveryBlock.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f79069e, i12);
        parcel.writeInt(this.f79070f);
        parcel.writeString(this.f79071g.name());
        parcel.writeString(this.f79072h.name());
    }

    public /* synthetic */ CombinedButtonsItem(String str, CombinedButtonsData combinedButtonsData, FreeDeliveryBlock freeDeliveryBlock, SafeDeal.TooltipData tooltipData, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        this(str, combinedButtonsData, freeDeliveryBlock, (i13 & 8) != 0 ? null : tooltipData, i12, (i13 & 32) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 64) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
