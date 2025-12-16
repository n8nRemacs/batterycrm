package com.avito.android.advert_core.feature_teasers.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advert_core.feature_teasers.common.AdvertDetailsFeatureTeaserItem;
import kotlin.Metadata;

/* compiled from: AdvertDetailsFeatureTeaserOption.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/feature_teasers/common/AdvertDetailsFeatureTeaserOption;", "Landroid/os/Parcelable;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertDetailsFeatureTeaserOption implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsFeatureTeaserOption> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f83611b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsFeatureTeaserItem.Icon f83612c;

    /* compiled from: AdvertDetailsFeatureTeaserOption.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsFeatureTeaserOption> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsFeatureTeaserOption createFromParcel(Parcel parcel) {
            return new AdvertDetailsFeatureTeaserOption(parcel.readString(), parcel.readInt() == 0 ? null : AdvertDetailsFeatureTeaserItem.Icon.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsFeatureTeaserOption[] newArray(int i12) {
            return new AdvertDetailsFeatureTeaserOption[i12];
        }
    }

    public AdvertDetailsFeatureTeaserOption(@Y61.k String str, @Y61.l AdvertDetailsFeatureTeaserItem.Icon icon) {
        this.f83611b = str;
        this.f83612c = icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f83611b);
        AdvertDetailsFeatureTeaserItem.Icon icon = this.f83612c;
        if (icon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(icon.name());
        }
    }
}
