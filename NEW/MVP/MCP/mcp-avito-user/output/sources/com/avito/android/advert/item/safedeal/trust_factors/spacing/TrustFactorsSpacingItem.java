package com.avito.android.advert.item.safedeal.trust_factors.spacing;

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

/* compiled from: TrustFactorsSpacingItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/spacing/TrustFactorsSpacingItem;", "Lcom/avito/android/advert/item/safedeal/trust_factors/TrustFactorsItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TrustFactorsSpacingItem implements TrustFactorsItem {

    @k
    public static final Parcelable.Creator<TrustFactorsSpacingItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f79216b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TrustFactorsComponent.Spacing f79217c;

    /* renamed from: d, reason: collision with root package name */
    public final int f79218d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final SafeDeal.TooltipData f79219e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f79220f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f79221g;

    /* compiled from: TrustFactorsSpacingItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrustFactorsSpacingItem> {
        @Override // android.os.Parcelable.Creator
        public final TrustFactorsSpacingItem createFromParcel(Parcel parcel) {
            return new TrustFactorsSpacingItem(parcel.readString(), (TrustFactorsComponent.Spacing) parcel.readParcelable(TrustFactorsSpacingItem.class.getClassLoader()), parcel.readInt(), (SafeDeal.TooltipData) parcel.readParcelable(TrustFactorsSpacingItem.class.getClassLoader()), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final TrustFactorsSpacingItem[] newArray(int i12) {
            return new TrustFactorsSpacingItem[i12];
        }
    }

    public TrustFactorsSpacingItem(@k String str, @k TrustFactorsComponent.Spacing spacing, int i12, @l SafeDeal.TooltipData tooltipData, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f79216b = str;
        this.f79217c = spacing;
        this.f79218d = i12;
        this.f79219e = tooltipData;
        this.f79220f = serpDisplayType;
        this.f79221g = serpViewType;
    }

    public static TrustFactorsSpacingItem b(TrustFactorsSpacingItem trustFactorsSpacingItem, int i12, SafeDeal.TooltipData tooltipData, int i13) {
        String str = trustFactorsSpacingItem.f79216b;
        TrustFactorsComponent.Spacing spacing = trustFactorsSpacingItem.f79217c;
        if ((i13 & 4) != 0) {
            i12 = trustFactorsSpacingItem.f79218d;
        }
        int i14 = i12;
        if ((i13 & 8) != 0) {
            tooltipData = trustFactorsSpacingItem.f79219e;
        }
        SerpDisplayType serpDisplayType = trustFactorsSpacingItem.f79220f;
        SerpViewType serpViewType = trustFactorsSpacingItem.f79221g;
        trustFactorsSpacingItem.getClass();
        return new TrustFactorsSpacingItem(str, spacing, i14, tooltipData, serpDisplayType, serpViewType);
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
        this.f79220f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustFactorsSpacingItem)) {
            return false;
        }
        TrustFactorsSpacingItem trustFactorsSpacingItem = (TrustFactorsSpacingItem) obj;
        return L.f(this.f79216b, trustFactorsSpacingItem.f79216b) && L.f(this.f79217c, trustFactorsSpacingItem.f79217c) && this.f79218d == trustFactorsSpacingItem.f79218d && L.f(this.f79219e, trustFactorsSpacingItem.f79219e) && this.f79220f == trustFactorsSpacingItem.f79220f && this.f79221g == trustFactorsSpacingItem.f79221g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74201e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79070f() {
        return this.f79218d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79066b() {
        return this.f79216b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79072h() {
        return this.f79221g;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f79218d, (this.f79217c.hashCode() + (this.f79216b.hashCode() * 31)) * 31, 31);
        SafeDeal.TooltipData tooltipData = this.f79219e;
        return this.f79221g.hashCode() + com.avito.android.actions_sheet.a.h(this.f79220f, (iE2 + (tooltipData == null ? 0 : tooltipData.hashCode())) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrustFactorsSpacingItem(stringId=");
        sb2.append(this.f79216b);
        sb2.append(", data=");
        sb2.append(this.f79217c);
        sb2.append(", spanCount=");
        sb2.append(this.f79218d);
        sb2.append(", tooltip=");
        sb2.append(this.f79219e);
        sb2.append(", displayType=");
        sb2.append(this.f79220f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f79221g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f79216b);
        parcel.writeParcelable(this.f79217c, i12);
        parcel.writeInt(this.f79218d);
        parcel.writeParcelable(this.f79219e, i12);
        parcel.writeString(this.f79220f.name());
        parcel.writeString(this.f79221g.name());
    }

    public /* synthetic */ TrustFactorsSpacingItem(String str, TrustFactorsComponent.Spacing spacing, int i12, SafeDeal.TooltipData tooltipData, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        this(str, spacing, i12, (i13 & 8) != 0 ? null : tooltipData, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
