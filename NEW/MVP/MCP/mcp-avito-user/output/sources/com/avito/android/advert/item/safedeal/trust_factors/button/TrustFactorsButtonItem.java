package com.avito.android.advert.item.safedeal.trust_factors.button;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.safedeal.trust_factors.TrustFactorsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.advert_core.blocks.BottomOffsetProviderItem;
import com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TrustFactorsButtonItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/button/TrustFactorsButtonItem;", "Lcom/avito/android/advert/item/safedeal/trust_factors/TrustFactorsItem;", "Lcom/avito/android/advert_core/blocks/BottomOffsetProviderItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TrustFactorsButtonItem implements TrustFactorsItem, BottomOffsetProviderItem {

    @k
    public static final Parcelable.Creator<TrustFactorsButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f79045b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TrustFactorsComponent.Button f79046c;

    /* renamed from: d, reason: collision with root package name */
    public final int f79047d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final SafeDeal.TooltipData f79048e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f79049f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f79050g;

    /* compiled from: TrustFactorsButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrustFactorsButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final TrustFactorsButtonItem createFromParcel(Parcel parcel) {
            return new TrustFactorsButtonItem(parcel.readString(), (TrustFactorsComponent.Button) parcel.readParcelable(TrustFactorsButtonItem.class.getClassLoader()), parcel.readInt(), (SafeDeal.TooltipData) parcel.readParcelable(TrustFactorsButtonItem.class.getClassLoader()), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final TrustFactorsButtonItem[] newArray(int i12) {
            return new TrustFactorsButtonItem[i12];
        }
    }

    public TrustFactorsButtonItem(@k String str, @k TrustFactorsComponent.Button button, int i12, @l SafeDeal.TooltipData tooltipData, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f79045b = str;
        this.f79046c = button;
        this.f79047d = i12;
        this.f79048e = tooltipData;
        this.f79049f = serpDisplayType;
        this.f79050g = serpViewType;
    }

    public static TrustFactorsButtonItem b(TrustFactorsButtonItem trustFactorsButtonItem, int i12, SafeDeal.TooltipData tooltipData, int i13) {
        String str = trustFactorsButtonItem.f79045b;
        TrustFactorsComponent.Button button = trustFactorsButtonItem.f79046c;
        if ((i13 & 4) != 0) {
            i12 = trustFactorsButtonItem.f79047d;
        }
        int i14 = i12;
        if ((i13 & 8) != 0) {
            tooltipData = trustFactorsButtonItem.f79048e;
        }
        SerpDisplayType serpDisplayType = trustFactorsButtonItem.f79049f;
        SerpViewType serpViewType = trustFactorsButtonItem.f79050g;
        trustFactorsButtonItem.getClass();
        return new TrustFactorsButtonItem(str, button, i14, tooltipData, serpDisplayType, serpViewType);
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return b(this, i12, null, 59);
    }

    @Override // com.avito.android.advert.item.safedeal.trust_factors.TrustFactorsItem
    @k
    public final TrustFactorsItem S3(@l SafeDeal.TooltipData tooltipData) {
        return b(this, 0, tooltipData, 55);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f79049f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustFactorsButtonItem)) {
            return false;
        }
        TrustFactorsButtonItem trustFactorsButtonItem = (TrustFactorsButtonItem) obj;
        return L.f(this.f79045b, trustFactorsButtonItem.f79045b) && L.f(this.f79046c, trustFactorsButtonItem.f79046c) && this.f79047d == trustFactorsButtonItem.f79047d && L.f(this.f79048e, trustFactorsButtonItem.f79048e) && this.f79049f == trustFactorsButtonItem.f79049f && this.f79050g == trustFactorsButtonItem.f79050g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74201e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79070f() {
        return this.f79047d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF302126x() {
        return this.f79045b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79072h() {
        return this.f79050g;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f79047d, (this.f79046c.hashCode() + (this.f79045b.hashCode() * 31)) * 31, 31);
        SafeDeal.TooltipData tooltipData = this.f79048e;
        return this.f79050g.hashCode() + com.avito.android.actions_sheet.a.h(this.f79049f, (iE2 + (tooltipData == null ? 0 : tooltipData.hashCode())) * 31, 31);
    }

    @Override // com.avito.android.advert_core.blocks.BottomOffsetProviderItem
    public final int r2() {
        return L.f(this.f79046c.f84257b.getIsFloating(), Boolean.TRUE) ? 64 : 0;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrustFactorsButtonItem(stringId=");
        sb2.append(this.f79045b);
        sb2.append(", data=");
        sb2.append(this.f79046c);
        sb2.append(", spanCount=");
        sb2.append(this.f79047d);
        sb2.append(", tooltip=");
        sb2.append(this.f79048e);
        sb2.append(", displayType=");
        sb2.append(this.f79049f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f79050g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f79045b);
        parcel.writeParcelable(this.f79046c, i12);
        parcel.writeInt(this.f79047d);
        parcel.writeParcelable(this.f79048e, i12);
        parcel.writeString(this.f79049f.name());
        parcel.writeString(this.f79050g.name());
    }

    public /* synthetic */ TrustFactorsButtonItem(String str, TrustFactorsComponent.Button button, int i12, SafeDeal.TooltipData tooltipData, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        this(str, button, i12, (i13 & 8) != 0 ? null : tooltipData, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
