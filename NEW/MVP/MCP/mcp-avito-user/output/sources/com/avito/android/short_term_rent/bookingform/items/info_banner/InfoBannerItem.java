package com.avito.android.short_term_rent.bookingform.items.info_banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InfoBannerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/info_banner/InfoBannerItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InfoBannerItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<InfoBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f281526b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f281527c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UniversalImage f281528d;

    /* compiled from: InfoBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InfoBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final InfoBannerItem createFromParcel(Parcel parcel) {
            return new InfoBannerItem(parcel.readString(), (AttributedText) parcel.readParcelable(InfoBannerItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(InfoBannerItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final InfoBannerItem[] newArray(int i12) {
            return new InfoBannerItem[i12];
        }
    }

    public InfoBannerItem(@k String str, @k AttributedText attributedText, @l UniversalImage universalImage) {
        this.f281526b = str;
        this.f281527c = attributedText;
        this.f281528d = universalImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoBannerItem)) {
            return false;
        }
        InfoBannerItem infoBannerItem = (InfoBannerItem) obj;
        return L.f(this.f281526b, infoBannerItem.f281526b) && L.f(this.f281527c, infoBannerItem.f281527c) && L.f(this.f281528d, infoBannerItem.f281528d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83624b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF83628f() {
        return this.f281526b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(this.f281526b.hashCode() * 31, 31, this.f281527c);
        UniversalImage universalImage = this.f281528d;
        return iB2 + (universalImage == null ? 0 : universalImage.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InfoBannerItem(stringId=");
        sb2.append(this.f281526b);
        sb2.append(", text=");
        sb2.append(this.f281527c);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f281528d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f281526b);
        parcel.writeParcelable(this.f281527c, i12);
        parcel.writeParcelable(this.f281528d, i12);
    }
}
