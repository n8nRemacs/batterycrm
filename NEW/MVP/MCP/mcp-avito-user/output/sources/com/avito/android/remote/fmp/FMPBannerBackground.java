package com.avito.android.remote.fmp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.UniversalColor;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FMPBannerBackground.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/fmp/FMPBannerBackground;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "solid", "", "gradient", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/UniversalColor;", "d", "()Lcom/avito/android/remote/model/UniversalColor;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FMPBannerBackground implements Parcelable {

    @k
    public static final Parcelable.Creator<FMPBannerBackground> CREATOR = new a();

    @c("gradient")
    @l
    private final String gradient;

    @c("solid")
    @l
    private final UniversalColor solid;

    /* compiled from: FMPBannerBackground.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FMPBannerBackground> {
        @Override // android.os.Parcelable.Creator
        public final FMPBannerBackground createFromParcel(Parcel parcel) {
            return new FMPBannerBackground((UniversalColor) parcel.readParcelable(FMPBannerBackground.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FMPBannerBackground[] newArray(int i12) {
            return new FMPBannerBackground[i12];
        }
    }

    public FMPBannerBackground(@l UniversalColor universalColor, @l String str) {
        this.solid = universalColor;
        this.gradient = str;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getGradient() {
        return this.gradient;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final UniversalColor getSolid() {
        return this.solid;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FMPBannerBackground)) {
            return false;
        }
        FMPBannerBackground fMPBannerBackground = (FMPBannerBackground) obj;
        return L.f(this.solid, fMPBannerBackground.solid) && L.f(this.gradient, fMPBannerBackground.gradient);
    }

    public final int hashCode() {
        UniversalColor universalColor = this.solid;
        int iHashCode = (universalColor == null ? 0 : universalColor.hashCode()) * 31;
        String str = this.gradient;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FMPBannerBackground(solid=");
        sb2.append(this.solid);
        sb2.append(", gradient=");
        return C22026a.c(sb2, this.gradient, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.solid, i12);
        parcel.writeString(this.gradient);
    }
}
