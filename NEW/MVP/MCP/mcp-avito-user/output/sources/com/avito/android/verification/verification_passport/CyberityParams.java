package com.avito.android.verification.verification_passport;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CyberityParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_passport/CyberityParams;", "Landroid/os/Parcelable;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CyberityParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CyberityParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f325673b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f325674c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f325675d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f325676e;

    /* compiled from: CyberityParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CyberityParams> {
        @Override // android.os.Parcelable.Creator
        public final CyberityParams createFromParcel(Parcel parcel) {
            return new CyberityParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CyberityParams[] newArray(int i12) {
            return new CyberityParams[i12];
        }
    }

    public CyberityParams(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.k String str4) {
        this.f325673b = str;
        this.f325674c = str2;
        this.f325675d = str3;
        this.f325676e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CyberityParams)) {
            return false;
        }
        CyberityParams cyberityParams = (CyberityParams) obj;
        return L.f(this.f325673b, cyberityParams.f325673b) && L.f(this.f325674c, cyberityParams.f325674c) && L.f(this.f325675d, cyberityParams.f325675d) && L.f(this.f325676e, cyberityParams.f325676e);
    }

    public final int hashCode() {
        int iHashCode = this.f325673b.hashCode() * 31;
        String str = this.f325674c;
        return this.f325676e.hashCode() + H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f325675d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CyberityParams(token=");
        sb2.append(this.f325673b);
        sb2.append(", baseUrl=");
        sb2.append(this.f325674c);
        sb2.append(", flow=");
        sb2.append(this.f325675d);
        sb2.append(", type=");
        return C22026a.c(sb2, this.f325676e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f325673b);
        parcel.writeString(this.f325674c);
        parcel.writeString(this.f325675d);
        parcel.writeString(this.f325676e);
    }
}
