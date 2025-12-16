package com.avito.android.advert.item.safedeal.trust_factors.list_item;

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

/* compiled from: TrustFactorsListItemItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/list_item/TrustFactorsListItemItem;", "Lcom/avito/android/advert/item/safedeal/trust_factors/TrustFactorsItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TrustFactorsListItemItem implements TrustFactorsItem {

    @k
    public static final Parcelable.Creator<TrustFactorsListItemItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f79191b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TrustFactorsComponent.ListItem f79192c;

    /* renamed from: d, reason: collision with root package name */
    public final int f79193d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final SafeDeal.TooltipData f79194e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f79195f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f79196g;

    /* compiled from: TrustFactorsListItemItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrustFactorsListItemItem> {
        @Override // android.os.Parcelable.Creator
        public final TrustFactorsListItemItem createFromParcel(Parcel parcel) {
            return new TrustFactorsListItemItem(parcel.readString(), (TrustFactorsComponent.ListItem) parcel.readParcelable(TrustFactorsListItemItem.class.getClassLoader()), parcel.readInt(), (SafeDeal.TooltipData) parcel.readParcelable(TrustFactorsListItemItem.class.getClassLoader()), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final TrustFactorsListItemItem[] newArray(int i12) {
            return new TrustFactorsListItemItem[i12];
        }
    }

    public TrustFactorsListItemItem(@k String str, @k TrustFactorsComponent.ListItem listItem, int i12, @l SafeDeal.TooltipData tooltipData, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f79191b = str;
        this.f79192c = listItem;
        this.f79193d = i12;
        this.f79194e = tooltipData;
        this.f79195f = serpDisplayType;
        this.f79196g = serpViewType;
    }

    public static TrustFactorsListItemItem b(TrustFactorsListItemItem trustFactorsListItemItem, int i12, SafeDeal.TooltipData tooltipData, int i13) {
        String str = trustFactorsListItemItem.f79191b;
        TrustFactorsComponent.ListItem listItem = trustFactorsListItemItem.f79192c;
        if ((i13 & 4) != 0) {
            i12 = trustFactorsListItemItem.f79193d;
        }
        int i14 = i12;
        if ((i13 & 8) != 0) {
            tooltipData = trustFactorsListItemItem.f79194e;
        }
        SerpDisplayType serpDisplayType = trustFactorsListItemItem.f79195f;
        SerpViewType serpViewType = trustFactorsListItemItem.f79196g;
        trustFactorsListItemItem.getClass();
        return new TrustFactorsListItemItem(str, listItem, i14, tooltipData, serpDisplayType, serpViewType);
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
        this.f79195f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustFactorsListItemItem)) {
            return false;
        }
        TrustFactorsListItemItem trustFactorsListItemItem = (TrustFactorsListItemItem) obj;
        return L.f(this.f79191b, trustFactorsListItemItem.f79191b) && L.f(this.f79192c, trustFactorsListItemItem.f79192c) && this.f79193d == trustFactorsListItemItem.f79193d && L.f(this.f79194e, trustFactorsListItemItem.f79194e) && this.f79195f == trustFactorsListItemItem.f79195f && this.f79196g == trustFactorsListItemItem.f79196g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74201e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79070f() {
        return this.f79193d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79066b() {
        return this.f79191b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79072h() {
        return this.f79196g;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f79193d, (this.f79192c.hashCode() + (this.f79191b.hashCode() * 31)) * 31, 31);
        SafeDeal.TooltipData tooltipData = this.f79194e;
        return this.f79196g.hashCode() + com.avito.android.actions_sheet.a.h(this.f79195f, (iE2 + (tooltipData == null ? 0 : tooltipData.hashCode())) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrustFactorsListItemItem(stringId=");
        sb2.append(this.f79191b);
        sb2.append(", data=");
        sb2.append(this.f79192c);
        sb2.append(", spanCount=");
        sb2.append(this.f79193d);
        sb2.append(", tooltip=");
        sb2.append(this.f79194e);
        sb2.append(", displayType=");
        sb2.append(this.f79195f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f79196g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f79191b);
        parcel.writeParcelable(this.f79192c, i12);
        parcel.writeInt(this.f79193d);
        parcel.writeParcelable(this.f79194e, i12);
        parcel.writeString(this.f79195f.name());
        parcel.writeString(this.f79196g.name());
    }

    public /* synthetic */ TrustFactorsListItemItem(String str, TrustFactorsComponent.ListItem listItem, int i12, SafeDeal.TooltipData tooltipData, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        this(str, listItem, i12, (i13 & 8) != 0 ? null : tooltipData, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
