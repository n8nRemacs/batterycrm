package com.avito.android.advertising.loaders.buzzoola;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.advertising.BuzzoolaPromoType;
import com.avito.android.remote.model.advertising.PremiumBannerType;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BuzzoolaBanner.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaPremiumConfig;", "Landroid/os/Parcelable;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BuzzoolaPremiumConfig implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BuzzoolaPremiumConfig> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f88304b;

    /* renamed from: c, reason: collision with root package name */
    public final int f88305c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final PremiumBannerType f88306d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f88307e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f88308f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final BuzzoolaPromoType f88309g;

    /* compiled from: BuzzoolaBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BuzzoolaPremiumConfig> {
        @Override // android.os.Parcelable.Creator
        public final BuzzoolaPremiumConfig createFromParcel(Parcel parcel) {
            return new BuzzoolaPremiumConfig(parcel.readString(), parcel.readInt(), (PremiumBannerType) parcel.readParcelable(BuzzoolaPremiumConfig.class.getClassLoader()), parcel.readString(), parcel.readString(), (BuzzoolaPromoType) parcel.readParcelable(BuzzoolaPremiumConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BuzzoolaPremiumConfig[] newArray(int i12) {
            return new BuzzoolaPremiumConfig[i12];
        }
    }

    public BuzzoolaPremiumConfig(@Y61.k String str, int i12, @Y61.k PremiumBannerType premiumBannerType, @Y61.l String str2, @Y61.l String str3, @Y61.k BuzzoolaPromoType buzzoolaPromoType) {
        this.f88304b = str;
        this.f88305c = i12;
        this.f88306d = premiumBannerType;
        this.f88307e = str2;
        this.f88308f = str3;
        this.f88309g = buzzoolaPromoType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuzzoolaPremiumConfig)) {
            return false;
        }
        BuzzoolaPremiumConfig buzzoolaPremiumConfig = (BuzzoolaPremiumConfig) obj;
        return L.f(this.f88304b, buzzoolaPremiumConfig.f88304b) && this.f88305c == buzzoolaPremiumConfig.f88305c && this.f88306d == buzzoolaPremiumConfig.f88306d && L.f(this.f88307e, buzzoolaPremiumConfig.f88307e) && L.f(this.f88308f, buzzoolaPremiumConfig.f88308f) && this.f88309g == buzzoolaPremiumConfig.f88309g;
    }

    public final int hashCode() {
        int iHashCode = (this.f88306d.hashCode() + r.e(this.f88305c, this.f88304b.hashCode() * 31, 31)) * 31;
        String str = this.f88307e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f88308f;
        return this.f88309g.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "BuzzoolaPremiumConfig(linkUrl=" + this.f88304b + ", creativeId=" + this.f88305c + ", bannerType=" + this.f88306d + ", brandSlug=" + this.f88307e + ", domain=" + this.f88308f + ", promoType=" + this.f88309g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f88304b);
        parcel.writeInt(this.f88305c);
        parcel.writeParcelable(this.f88306d, i12);
        parcel.writeString(this.f88307e);
        parcel.writeString(this.f88308f);
        parcel.writeParcelable(this.f88309g, i12);
    }
}
