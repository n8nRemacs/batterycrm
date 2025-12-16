package com.avito.android.advert.item.safedeal.trust_factors.expandable_list_item;

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

/* compiled from: TrustFactorsExpandableListItemItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/expandable_list_item/TrustFactorsExpandableListItemItem;", "Lcom/avito/android/advert/item/safedeal/trust_factors/TrustFactorsItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TrustFactorsExpandableListItemItem implements TrustFactorsItem {

    @k
    public static final Parcelable.Creator<TrustFactorsExpandableListItemItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f79127b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TrustFactorsComponent.ExpandableListItem f79128c;

    /* renamed from: d, reason: collision with root package name */
    public final int f79129d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final SafeDeal.TooltipData f79130e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f79131f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f79132g;

    /* compiled from: TrustFactorsExpandableListItemItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrustFactorsExpandableListItemItem> {
        @Override // android.os.Parcelable.Creator
        public final TrustFactorsExpandableListItemItem createFromParcel(Parcel parcel) {
            return new TrustFactorsExpandableListItemItem(parcel.readString(), (TrustFactorsComponent.ExpandableListItem) parcel.readParcelable(TrustFactorsExpandableListItemItem.class.getClassLoader()), parcel.readInt(), (SafeDeal.TooltipData) parcel.readParcelable(TrustFactorsExpandableListItemItem.class.getClassLoader()), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final TrustFactorsExpandableListItemItem[] newArray(int i12) {
            return new TrustFactorsExpandableListItemItem[i12];
        }
    }

    public TrustFactorsExpandableListItemItem(@k String str, @k TrustFactorsComponent.ExpandableListItem expandableListItem, int i12, @l SafeDeal.TooltipData tooltipData, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f79127b = str;
        this.f79128c = expandableListItem;
        this.f79129d = i12;
        this.f79130e = tooltipData;
        this.f79131f = serpDisplayType;
        this.f79132g = serpViewType;
    }

    public static TrustFactorsExpandableListItemItem b(TrustFactorsExpandableListItemItem trustFactorsExpandableListItemItem, int i12, SafeDeal.TooltipData tooltipData, int i13) {
        String str = trustFactorsExpandableListItemItem.f79127b;
        TrustFactorsComponent.ExpandableListItem expandableListItem = trustFactorsExpandableListItemItem.f79128c;
        if ((i13 & 4) != 0) {
            i12 = trustFactorsExpandableListItemItem.f79129d;
        }
        int i14 = i12;
        if ((i13 & 8) != 0) {
            tooltipData = trustFactorsExpandableListItemItem.f79130e;
        }
        SerpDisplayType serpDisplayType = trustFactorsExpandableListItemItem.f79131f;
        SerpViewType serpViewType = trustFactorsExpandableListItemItem.f79132g;
        trustFactorsExpandableListItemItem.getClass();
        return new TrustFactorsExpandableListItemItem(str, expandableListItem, i14, tooltipData, serpDisplayType, serpViewType);
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
        this.f79131f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustFactorsExpandableListItemItem)) {
            return false;
        }
        TrustFactorsExpandableListItemItem trustFactorsExpandableListItemItem = (TrustFactorsExpandableListItemItem) obj;
        return L.f(this.f79127b, trustFactorsExpandableListItemItem.f79127b) && L.f(this.f79128c, trustFactorsExpandableListItemItem.f79128c) && this.f79129d == trustFactorsExpandableListItemItem.f79129d && L.f(this.f79130e, trustFactorsExpandableListItemItem.f79130e) && this.f79131f == trustFactorsExpandableListItemItem.f79131f && this.f79132g == trustFactorsExpandableListItemItem.f79132g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74201e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79070f() {
        return this.f79129d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79066b() {
        return this.f79127b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79072h() {
        return this.f79132g;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f79129d, (this.f79128c.hashCode() + (this.f79127b.hashCode() * 31)) * 31, 31);
        SafeDeal.TooltipData tooltipData = this.f79130e;
        return this.f79132g.hashCode() + com.avito.android.actions_sheet.a.h(this.f79131f, (iE2 + (tooltipData == null ? 0 : tooltipData.hashCode())) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrustFactorsExpandableListItemItem(stringId=");
        sb2.append(this.f79127b);
        sb2.append(", data=");
        sb2.append(this.f79128c);
        sb2.append(", spanCount=");
        sb2.append(this.f79129d);
        sb2.append(", tooltip=");
        sb2.append(this.f79130e);
        sb2.append(", displayType=");
        sb2.append(this.f79131f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f79132g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f79127b);
        parcel.writeParcelable(this.f79128c, i12);
        parcel.writeInt(this.f79129d);
        parcel.writeParcelable(this.f79130e, i12);
        parcel.writeString(this.f79131f.name());
        parcel.writeString(this.f79132g.name());
    }

    public /* synthetic */ TrustFactorsExpandableListItemItem(String str, TrustFactorsComponent.ExpandableListItem expandableListItem, int i12, SafeDeal.TooltipData tooltipData, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        this(str, expandableListItem, i12, (i13 & 8) != 0 ? null : tooltipData, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
