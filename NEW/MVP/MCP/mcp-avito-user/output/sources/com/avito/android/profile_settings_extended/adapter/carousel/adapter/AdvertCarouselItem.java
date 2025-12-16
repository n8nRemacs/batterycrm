package com.avito.android.profile_settings_extended.adapter.carousel.adapter;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.entity.ExtendedProfileSettingsAdvert;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertCarouselItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/carousel/adapter/AdvertCarouselItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AdvertCarouselItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<AdvertCarouselItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f229304b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ExtendedProfileSettingsAdvert f229305c;

    /* compiled from: AdvertCarouselItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertCarouselItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertCarouselItem createFromParcel(Parcel parcel) {
            return new AdvertCarouselItem(parcel.readString(), ExtendedProfileSettingsAdvert.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertCarouselItem[] newArray(int i12) {
            return new AdvertCarouselItem[i12];
        }
    }

    public AdvertCarouselItem(@k String str, @k ExtendedProfileSettingsAdvert extendedProfileSettingsAdvert) {
        this.f229304b = str;
        this.f229305c = extendedProfileSettingsAdvert;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertCarouselItem)) {
            return false;
        }
        AdvertCarouselItem advertCarouselItem = (AdvertCarouselItem) obj;
        return L.f(this.f229304b, advertCarouselItem.f229304b) && L.f(this.f229305c, advertCarouselItem.f229305c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222246b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223218b() {
        return this.f229304b;
    }

    public final int hashCode() {
        return this.f229305c.hashCode() + (this.f229304b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "AdvertCarouselItem(stringId=" + this.f229304b + ", advert=" + this.f229305c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f229304b);
        this.f229305c.writeToParcel(parcel, i12);
    }

    public /* synthetic */ AdvertCarouselItem(String str, ExtendedProfileSettingsAdvert extendedProfileSettingsAdvert, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "extended_settings_advert_carousel_item" : str, extendedProfileSettingsAdvert);
    }
}
