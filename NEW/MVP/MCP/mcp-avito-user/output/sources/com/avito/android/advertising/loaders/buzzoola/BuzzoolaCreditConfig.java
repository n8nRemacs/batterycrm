package com.avito.android.advertising.loaders.buzzoola;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.advertising.BuzzoolaPromoType;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BuzzoolaBanner.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaCreditConfig;", "Landroid/os/Parcelable;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BuzzoolaCreditConfig implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BuzzoolaCreditConfig> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f88281b;

    /* renamed from: c, reason: collision with root package name */
    public final int f88282c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f88283d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f88284e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f88285f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f88286g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final BuzzoolaPromoType f88287h;

    /* compiled from: BuzzoolaBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BuzzoolaCreditConfig> {
        @Override // android.os.Parcelable.Creator
        public final BuzzoolaCreditConfig createFromParcel(Parcel parcel) {
            return new BuzzoolaCreditConfig(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BuzzoolaPromoType) parcel.readParcelable(BuzzoolaCreditConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BuzzoolaCreditConfig[] newArray(int i12) {
            return new BuzzoolaCreditConfig[i12];
        }
    }

    public BuzzoolaCreditConfig(@Y61.k String str, int i12, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.k BuzzoolaPromoType buzzoolaPromoType) {
        this.f88281b = str;
        this.f88282c = i12;
        this.f88283d = str2;
        this.f88284e = str3;
        this.f88285f = str4;
        this.f88286g = str5;
        this.f88287h = buzzoolaPromoType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuzzoolaCreditConfig)) {
            return false;
        }
        BuzzoolaCreditConfig buzzoolaCreditConfig = (BuzzoolaCreditConfig) obj;
        return L.f(this.f88281b, buzzoolaCreditConfig.f88281b) && this.f88282c == buzzoolaCreditConfig.f88282c && L.f(this.f88283d, buzzoolaCreditConfig.f88283d) && L.f(this.f88284e, buzzoolaCreditConfig.f88284e) && L.f(this.f88285f, buzzoolaCreditConfig.f88285f) && L.f(this.f88286g, buzzoolaCreditConfig.f88286g) && this.f88287h == buzzoolaCreditConfig.f88287h;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f88282c, this.f88281b.hashCode() * 31, 31);
        String str = this.f88283d;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f88284e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f88285f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f88286g;
        return this.f88287h.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "BuzzoolaCreditConfig(linkUrl=" + this.f88281b + ", creativeId=" + this.f88282c + ", percent=" + this.f88283d + ", initialFee=" + this.f88284e + ", creditTerm=" + this.f88285f + ", domain=" + this.f88286g + ", promoType=" + this.f88287h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f88281b);
        parcel.writeInt(this.f88282c);
        parcel.writeString(this.f88283d);
        parcel.writeString(this.f88284e);
        parcel.writeString(this.f88285f);
        parcel.writeString(this.f88286g);
        parcel.writeParcelable(this.f88287h, i12);
    }
}
