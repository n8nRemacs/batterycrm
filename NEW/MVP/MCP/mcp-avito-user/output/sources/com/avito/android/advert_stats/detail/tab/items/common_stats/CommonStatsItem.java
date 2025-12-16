package com.avito.android.advert_stats.detail.tab.items.common_stats;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity.StatsItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommonStatsItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/common_stats/CommonStatsItem;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItem;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CommonStatsItem implements StatsItem {

    @k
    public static final Parcelable.Creator<CommonStatsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f86357b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f86358c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f86359d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final UniversalImage f86360e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f86361f;

    /* compiled from: CommonStatsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CommonStatsItem> {
        @Override // android.os.Parcelable.Creator
        public final CommonStatsItem createFromParcel(Parcel parcel) {
            return new CommonStatsItem(parcel.readString(), (AttributedText) parcel.readParcelable(CommonStatsItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(CommonStatsItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(CommonStatsItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(CommonStatsItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CommonStatsItem[] newArray(int i12) {
            return new CommonStatsItem[i12];
        }
    }

    public CommonStatsItem(@k String str, @l AttributedText attributedText, @l DeepLink deepLink, @l UniversalImage universalImage, @l DeepLink deepLink2) {
        this.f86357b = str;
        this.f86358c = attributedText;
        this.f86359d = deepLink;
        this.f86360e = universalImage;
        this.f86361f = deepLink2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonStatsItem)) {
            return false;
        }
        CommonStatsItem commonStatsItem = (CommonStatsItem) obj;
        return L.f(this.f86357b, commonStatsItem.f86357b) && L.f(this.f86358c, commonStatsItem.f86358c) && L.f(this.f86359d, commonStatsItem.f86359d) && L.f(this.f86360e, commonStatsItem.f86360e) && L.f(this.f86361f, commonStatsItem.f86361f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF85356c() {
        return this.f86357b;
    }

    public final int hashCode() {
        int iHashCode = this.f86357b.hashCode() * 31;
        AttributedText attributedText = this.f86358c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        DeepLink deepLink = this.f86359d;
        int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        UniversalImage universalImage = this.f86360e;
        int iHashCode4 = (iHashCode3 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        DeepLink deepLink2 = this.f86361f;
        return iHashCode4 + (deepLink2 != null ? deepLink2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommonStatsItem(stringId=");
        sb2.append(this.f86357b);
        sb2.append(", text=");
        sb2.append(this.f86358c);
        sb2.append(", deepLink=");
        sb2.append(this.f86359d);
        sb2.append(", icon=");
        sb2.append(this.f86360e);
        sb2.append(", hintDeepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f86361f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f86357b);
        parcel.writeParcelable(this.f86358c, i12);
        parcel.writeParcelable(this.f86359d, i12);
        parcel.writeParcelable(this.f86360e, i12);
        parcel.writeParcelable(this.f86361f, i12);
    }
}
