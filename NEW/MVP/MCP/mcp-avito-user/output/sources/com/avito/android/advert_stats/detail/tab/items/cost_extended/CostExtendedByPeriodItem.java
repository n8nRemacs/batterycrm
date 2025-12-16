package com.avito.android.advert_stats.detail.tab.items.cost_extended;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity.StatsItem;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CostExtendedByPeriodItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/cost_extended/CostExtendedByPeriodItem;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItem;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CostExtendedByPeriodItem implements StatsItem {

    @k
    public static final Parcelable.Creator<CostExtendedByPeriodItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f86405b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UniversalImage f86406c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f86407d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f86408e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Action f86409f;

    /* compiled from: CostExtendedByPeriodItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CostExtendedByPeriodItem> {
        @Override // android.os.Parcelable.Creator
        public final CostExtendedByPeriodItem createFromParcel(Parcel parcel) {
            return new CostExtendedByPeriodItem(parcel.readString(), (UniversalImage) parcel.readParcelable(CostExtendedByPeriodItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(CostExtendedByPeriodItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(CostExtendedByPeriodItem.class.getClassLoader()), (Action) parcel.readParcelable(CostExtendedByPeriodItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CostExtendedByPeriodItem[] newArray(int i12) {
            return new CostExtendedByPeriodItem[i12];
        }
    }

    public CostExtendedByPeriodItem(@k String str, @l UniversalImage universalImage, @l AttributedText attributedText, @l AttributedText attributedText2, @l Action action) {
        this.f86405b = str;
        this.f86406c = universalImage;
        this.f86407d = attributedText;
        this.f86408e = attributedText2;
        this.f86409f = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CostExtendedByPeriodItem)) {
            return false;
        }
        CostExtendedByPeriodItem costExtendedByPeriodItem = (CostExtendedByPeriodItem) obj;
        return L.f(this.f86405b, costExtendedByPeriodItem.f86405b) && L.f(this.f86406c, costExtendedByPeriodItem.f86406c) && L.f(this.f86407d, costExtendedByPeriodItem.f86407d) && L.f(this.f86408e, costExtendedByPeriodItem.f86408e) && L.f(this.f86409f, costExtendedByPeriodItem.f86409f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83798f() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF83797e() {
        return this.f86405b;
    }

    public final int hashCode() {
        int iHashCode = this.f86405b.hashCode() * 31;
        UniversalImage universalImage = this.f86406c;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        AttributedText attributedText = this.f86407d;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f86408e;
        int iHashCode4 = (iHashCode3 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        Action action = this.f86409f;
        return iHashCode4 + (action != null ? action.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CostExtendedByPeriodItem(stringId=" + this.f86405b + ", image=" + this.f86406c + ", text=" + this.f86407d + ", value=" + this.f86408e + ", substring=" + this.f86409f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f86405b);
        parcel.writeParcelable(this.f86406c, i12);
        parcel.writeParcelable(this.f86407d, i12);
        parcel.writeParcelable(this.f86408e, i12);
        parcel.writeParcelable(this.f86409f, i12);
    }
}
