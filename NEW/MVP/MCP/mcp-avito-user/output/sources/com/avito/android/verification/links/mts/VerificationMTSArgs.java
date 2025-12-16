package com.avito.android.verification.links.mts;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerificationMTSArgs.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/mts/VerificationMTSArgs;", "Landroid/os/Parcelable;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VerificationMTSArgs implements Parcelable {

    @k
    public static final Parcelable.Creator<VerificationMTSArgs> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f324279b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f324280c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f324281d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f324282e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f324283f;

    /* compiled from: VerificationMTSArgs.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationMTSArgs> {
        @Override // android.os.Parcelable.Creator
        public final VerificationMTSArgs createFromParcel(Parcel parcel) {
            return new VerificationMTSArgs(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationMTSArgs[] newArray(int i12) {
            return new VerificationMTSArgs[i12];
        }
    }

    public VerificationMTSArgs(@k String str, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f324279b = str;
        this.f324280c = z12;
        this.f324281d = z13;
        this.f324282e = z14;
        this.f324283f = z15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationMTSArgs)) {
            return false;
        }
        VerificationMTSArgs verificationMTSArgs = (VerificationMTSArgs) obj;
        return L.f(this.f324279b, verificationMTSArgs.f324279b) && this.f324280c == verificationMTSArgs.f324280c && this.f324281d == verificationMTSArgs.f324281d && this.f324282e == verificationMTSArgs.f324282e && this.f324283f == verificationMTSArgs.f324283f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f324283f) + r.i(r.i(r.i(this.f324279b.hashCode() * 31, 31, this.f324280c), 31, this.f324281d), 31, this.f324282e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationMTSArgs(idShort=");
        sb2.append(this.f324279b);
        sb2.append(", useInn=");
        sb2.append(this.f324280c);
        sb2.append(", onBoarding=");
        sb2.append(this.f324281d);
        sb2.append(", selfieOnboarding=");
        sb2.append(this.f324282e);
        sb2.append(", production=");
        return r.x(sb2, this.f324283f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f324279b);
        parcel.writeInt(this.f324280c ? 1 : 0);
        parcel.writeInt(this.f324281d ? 1 : 0);
        parcel.writeInt(this.f324282e ? 1 : 0);
        parcel.writeInt(this.f324283f ? 1 : 0);
    }

    public /* synthetic */ VerificationMTSArgs(String str, boolean z12, boolean z13, boolean z14, boolean z15, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? false : z14, (i12 & 16) != 0 ? true : z15);
    }
}
