package com.avito.android.advertising.loaders.buzzoola;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BuzzoolaBanner.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaDirectConfig;", "Landroid/os/Parcelable;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BuzzoolaDirectConfig implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BuzzoolaDirectConfig> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f88288b;

    /* renamed from: c, reason: collision with root package name */
    public final int f88289c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f88290d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f88291e;

    /* compiled from: BuzzoolaBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BuzzoolaDirectConfig> {
        @Override // android.os.Parcelable.Creator
        public final BuzzoolaDirectConfig createFromParcel(Parcel parcel) {
            return new BuzzoolaDirectConfig(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BuzzoolaDirectConfig[] newArray(int i12) {
            return new BuzzoolaDirectConfig[i12];
        }
    }

    public BuzzoolaDirectConfig(@Y61.k String str, int i12, @Y61.l String str2, @Y61.l String str3) {
        this.f88288b = str;
        this.f88289c = i12;
        this.f88290d = str2;
        this.f88291e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuzzoolaDirectConfig)) {
            return false;
        }
        BuzzoolaDirectConfig buzzoolaDirectConfig = (BuzzoolaDirectConfig) obj;
        return L.f(this.f88288b, buzzoolaDirectConfig.f88288b) && this.f88289c == buzzoolaDirectConfig.f88289c && L.f(this.f88290d, buzzoolaDirectConfig.f88290d) && L.f(this.f88291e, buzzoolaDirectConfig.f88291e);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f88289c, this.f88288b.hashCode() * 31, 31);
        String str = this.f88290d;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f88291e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuzzoolaDirectConfig(linkUrl=");
        sb2.append(this.f88288b);
        sb2.append(", creativeId=");
        sb2.append(this.f88289c);
        sb2.append(", domain=");
        sb2.append(this.f88290d);
        sb2.append(", infoLink=");
        return C22026a.c(sb2, this.f88291e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f88288b);
        parcel.writeInt(this.f88289c);
        parcel.writeString(this.f88290d);
        parcel.writeString(this.f88291e);
    }
}
