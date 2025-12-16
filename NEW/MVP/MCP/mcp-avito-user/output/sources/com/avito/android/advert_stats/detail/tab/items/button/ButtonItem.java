package com.avito.android.advert_stats.detail.tab.items.button;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity.StatsItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ButtonItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/button/ButtonItem;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItem;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ButtonItem implements StatsItem {

    @k
    public static final Parcelable.Creator<ButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f86244b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f86245c;

    /* compiled from: ButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final ButtonItem createFromParcel(Parcel parcel) {
            return new ButtonItem(parcel.readString(), (AttributedText) parcel.readParcelable(ButtonItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonItem[] newArray(int i12) {
            return new ButtonItem[i12];
        }
    }

    public ButtonItem(@k String str, @k AttributedText attributedText) {
        this.f86244b = str;
        this.f86245c = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonItem)) {
            return false;
        }
        ButtonItem buttonItem = (ButtonItem) obj;
        return L.f(this.f86244b, buttonItem.f86244b) && L.f(this.f86245c, buttonItem.f86245c);
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
        return this.f86244b;
    }

    public final int hashCode() {
        return this.f86245c.hashCode() + (this.f86244b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ButtonItem(stringId=");
        sb2.append(this.f86244b);
        sb2.append(", attrText=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f86245c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f86244b);
        parcel.writeParcelable(this.f86245c, i12);
    }
}
