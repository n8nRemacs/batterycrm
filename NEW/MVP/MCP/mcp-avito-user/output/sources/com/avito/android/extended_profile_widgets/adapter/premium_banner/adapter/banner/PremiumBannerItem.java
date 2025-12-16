package com.avito.android.extended_profile_widgets.adapter.premium_banner.adapter.banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.extended_profile_widgets.adapter.PremiumBannerItemClickAction;
import com.avito.android.remote.model.TnsGalleryImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PremiumBannerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/premium_banner/adapter/banner/PremiumBannerItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PremiumBannerItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<PremiumBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154576b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TnsGalleryImage f154577c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PremiumBannerItemClickAction f154578d;

    /* compiled from: PremiumBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PremiumBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final PremiumBannerItem createFromParcel(Parcel parcel) {
            return new PremiumBannerItem(parcel.readString(), (TnsGalleryImage) parcel.readParcelable(PremiumBannerItem.class.getClassLoader()), PremiumBannerItemClickAction.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PremiumBannerItem[] newArray(int i12) {
            return new PremiumBannerItem[i12];
        }
    }

    public PremiumBannerItem(@k String str, @k TnsGalleryImage tnsGalleryImage, @k PremiumBannerItemClickAction premiumBannerItemClickAction) {
        this.f154576b = str;
        this.f154577c = tnsGalleryImage;
        this.f154578d = premiumBannerItemClickAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBannerItem)) {
            return false;
        }
        PremiumBannerItem premiumBannerItem = (PremiumBannerItem) obj;
        return L.f(this.f154576b, premiumBannerItem.f154576b) && L.f(this.f154577c, premiumBannerItem.f154577c) && L.f(this.f154578d, premiumBannerItem.f154578d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269899b() {
        return getF154199b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154199b() {
        return this.f154576b;
    }

    public final int hashCode() {
        return this.f154578d.hashCode() + ((this.f154577c.hashCode() + (this.f154576b.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        return "PremiumBannerItem(stringId=" + this.f154576b + ", tnsImage=" + this.f154577c + ", clickAction=" + this.f154578d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154576b);
        parcel.writeParcelable(this.f154577c, i12);
        this.f154578d.writeToParcel(parcel, i12);
    }
}
