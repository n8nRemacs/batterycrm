package com.avito.android.advert_stats.detail.tab.items.titile;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity.StatsItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TitleItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/titile/TitleItem;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItem;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TitleItem implements StatsItem {

    @k
    public static final Parcelable.Creator<TitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f86450b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f86451c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f86452d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f86453e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f86454f;

    /* compiled from: TitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TitleItem> {
        @Override // android.os.Parcelable.Creator
        public final TitleItem createFromParcel(Parcel parcel) {
            return new TitleItem(parcel.readString(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(TitleItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(TitleItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TitleItem[] newArray(int i12) {
            return new TitleItem[i12];
        }
    }

    public TitleItem(@k String str, @l String str2, @l String str3, @l AttributedText attributedText, @l AttributedText attributedText2) {
        this.f86450b = str;
        this.f86451c = str2;
        this.f86452d = str3;
        this.f86453e = attributedText;
        this.f86454f = attributedText2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitleItem)) {
            return false;
        }
        TitleItem titleItem = (TitleItem) obj;
        return L.f(this.f86450b, titleItem.f86450b) && L.f(this.f86451c, titleItem.f86451c) && L.f(this.f86452d, titleItem.f86452d) && L.f(this.f86453e, titleItem.f86453e) && L.f(this.f86454f, titleItem.f86454f);
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
        return this.f86450b;
    }

    public final int hashCode() {
        int iHashCode = this.f86450b.hashCode() * 31;
        String str = this.f86451c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f86452d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AttributedText attributedText = this.f86453e;
        int iHashCode4 = (iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f86454f;
        return iHashCode4 + (attributedText2 != null ? attributedText2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TitleItem(stringId=");
        sb2.append(this.f86450b);
        sb2.append(", title=");
        sb2.append(this.f86451c);
        sb2.append(", price=");
        sb2.append(this.f86452d);
        sb2.append(", titleAttr=");
        sb2.append(this.f86453e);
        sb2.append(", priceAttr=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f86454f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f86450b);
        parcel.writeString(this.f86451c);
        parcel.writeString(this.f86452d);
        parcel.writeParcelable(this.f86453e, i12);
        parcel.writeParcelable(this.f86454f, i12);
    }

    public /* synthetic */ TitleItem(String str, String str2, String str3, AttributedText attributedText, AttributedText attributedText2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : attributedText, (i12 & 16) != 0 ? null : attributedText2);
    }
}
