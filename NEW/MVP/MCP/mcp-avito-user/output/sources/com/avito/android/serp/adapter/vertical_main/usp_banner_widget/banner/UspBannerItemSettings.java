package com.avito.android.serp.adapter.vertical_main.usp_banner_widget.banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UspBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/banner/UspBannerItemSettings;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UspBannerItemSettings implements Parcelable {

    @k
    public static final Parcelable.Creator<UspBannerItemSettings> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final UniversalColor f273327b;

    /* compiled from: UspBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UspBannerItemSettings> {
        @Override // android.os.Parcelable.Creator
        public final UspBannerItemSettings createFromParcel(Parcel parcel) {
            return new UspBannerItemSettings((UniversalColor) parcel.readParcelable(UspBannerItemSettings.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final UspBannerItemSettings[] newArray(int i12) {
            return new UspBannerItemSettings[i12];
        }
    }

    public UspBannerItemSettings(@l UniversalColor universalColor) {
        this.f273327b = universalColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UspBannerItemSettings) && L.f(this.f273327b, ((UspBannerItemSettings) obj).f273327b);
    }

    public final int hashCode() {
        UniversalColor universalColor = this.f273327b;
        if (universalColor == null) {
            return 0;
        }
        return universalColor.hashCode();
    }

    @k
    public final String toString() {
        return com.avito.android.advert.item.delivery_suggests.l.r(new StringBuilder("UspBannerItemSettings(backgroundColor="), this.f273327b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f273327b, i12);
    }
}
