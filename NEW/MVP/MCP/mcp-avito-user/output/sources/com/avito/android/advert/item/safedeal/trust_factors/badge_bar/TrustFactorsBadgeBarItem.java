package com.avito.android.advert.item.safedeal.trust_factors.badge_bar;

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

/* compiled from: TrustFactorsBadgeBarItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/badge_bar/TrustFactorsBadgeBarItem;", "Lcom/avito/android/advert/item/safedeal/trust_factors/TrustFactorsItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TrustFactorsBadgeBarItem implements TrustFactorsItem {

    @k
    public static final Parcelable.Creator<TrustFactorsBadgeBarItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f79028b;

    /* renamed from: c, reason: collision with root package name */
    public final int f79029c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TrustFactorsComponent.BadgeBar f79030d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final SafeDeal.TooltipData f79031e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f79032f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f79033g;

    /* compiled from: TrustFactorsBadgeBarItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrustFactorsBadgeBarItem> {
        @Override // android.os.Parcelable.Creator
        public final TrustFactorsBadgeBarItem createFromParcel(Parcel parcel) {
            return new TrustFactorsBadgeBarItem(parcel.readString(), parcel.readInt(), (TrustFactorsComponent.BadgeBar) parcel.readParcelable(TrustFactorsBadgeBarItem.class.getClassLoader()), (SafeDeal.TooltipData) parcel.readParcelable(TrustFactorsBadgeBarItem.class.getClassLoader()), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final TrustFactorsBadgeBarItem[] newArray(int i12) {
            return new TrustFactorsBadgeBarItem[i12];
        }
    }

    public TrustFactorsBadgeBarItem(@k String str, int i12, @k TrustFactorsComponent.BadgeBar badgeBar, @l SafeDeal.TooltipData tooltipData, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f79028b = str;
        this.f79029c = i12;
        this.f79030d = badgeBar;
        this.f79031e = tooltipData;
        this.f79032f = serpDisplayType;
        this.f79033g = serpViewType;
    }

    public static TrustFactorsBadgeBarItem b(TrustFactorsBadgeBarItem trustFactorsBadgeBarItem, int i12, SafeDeal.TooltipData tooltipData, int i13) {
        String str = trustFactorsBadgeBarItem.f79028b;
        if ((i13 & 2) != 0) {
            i12 = trustFactorsBadgeBarItem.f79029c;
        }
        int i14 = i12;
        TrustFactorsComponent.BadgeBar badgeBar = trustFactorsBadgeBarItem.f79030d;
        if ((i13 & 8) != 0) {
            tooltipData = trustFactorsBadgeBarItem.f79031e;
        }
        SerpDisplayType serpDisplayType = trustFactorsBadgeBarItem.f79032f;
        SerpViewType serpViewType = trustFactorsBadgeBarItem.f79033g;
        trustFactorsBadgeBarItem.getClass();
        return new TrustFactorsBadgeBarItem(str, i14, badgeBar, tooltipData, serpDisplayType, serpViewType);
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
        this.f79032f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustFactorsBadgeBarItem)) {
            return false;
        }
        TrustFactorsBadgeBarItem trustFactorsBadgeBarItem = (TrustFactorsBadgeBarItem) obj;
        return L.f(this.f79028b, trustFactorsBadgeBarItem.f79028b) && this.f79029c == trustFactorsBadgeBarItem.f79029c && L.f(this.f79030d, trustFactorsBadgeBarItem.f79030d) && L.f(this.f79031e, trustFactorsBadgeBarItem.f79031e) && this.f79032f == trustFactorsBadgeBarItem.f79032f && this.f79033g == trustFactorsBadgeBarItem.f79033g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74201e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79070f() {
        return this.f79029c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79066b() {
        return this.f79028b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79072h() {
        return this.f79033g;
    }

    public final int hashCode() {
        int iHashCode = (this.f79030d.hashCode() + r.e(this.f79029c, this.f79028b.hashCode() * 31, 31)) * 31;
        SafeDeal.TooltipData tooltipData = this.f79031e;
        return this.f79033g.hashCode() + com.avito.android.actions_sheet.a.h(this.f79032f, (iHashCode + (tooltipData == null ? 0 : tooltipData.hashCode())) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrustFactorsBadgeBarItem(stringId=");
        sb2.append(this.f79028b);
        sb2.append(", spanCount=");
        sb2.append(this.f79029c);
        sb2.append(", data=");
        sb2.append(this.f79030d);
        sb2.append(", tooltip=");
        sb2.append(this.f79031e);
        sb2.append(", displayType=");
        sb2.append(this.f79032f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f79033g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f79028b);
        parcel.writeInt(this.f79029c);
        parcel.writeParcelable(this.f79030d, i12);
        parcel.writeParcelable(this.f79031e, i12);
        parcel.writeString(this.f79032f.name());
        parcel.writeString(this.f79033g.name());
    }

    public /* synthetic */ TrustFactorsBadgeBarItem(String str, int i12, TrustFactorsComponent.BadgeBar badgeBar, SafeDeal.TooltipData tooltipData, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        this(str, i12, badgeBar, (i13 & 8) != 0 ? null : tooltipData, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
