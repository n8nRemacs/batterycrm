package com.avito.android.verification.links.mts;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: VerificationMTSLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/mts/VerificationMTSLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final /* data */ class VerificationMTSLink extends DeepLink {

    @k
    public static final Parcelable.Creator<VerificationMTSLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f324284b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f324285c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f324286d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f324287e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f324288f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f324289g;

    /* compiled from: VerificationMTSLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationMTSLink> {
        @Override // android.os.Parcelable.Creator
        public final VerificationMTSLink createFromParcel(Parcel parcel) {
            return new VerificationMTSLink(parcel.readString(), parcel.readInt() != 0, (DeepLink) parcel.readParcelable(VerificationMTSLink.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationMTSLink[] newArray(int i12) {
            return new VerificationMTSLink[i12];
        }
    }

    public /* synthetic */ VerificationMTSLink(String str, boolean z12, DeepLink deepLink, String str2, String str3, boolean z13, int i12, C42822w c42822w) {
        this(str, z12, deepLink, str2, str3, (i12 & 32) != 0 ? false : z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationMTSLink)) {
            return false;
        }
        VerificationMTSLink verificationMTSLink = (VerificationMTSLink) obj;
        return L.f(this.f324284b, verificationMTSLink.f324284b) && this.f324285c == verificationMTSLink.f324285c && L.f(this.f324286d, verificationMTSLink.f324286d) && L.f(this.f324287e, verificationMTSLink.f324287e) && L.f(this.f324288f, verificationMTSLink.f324288f) && this.f324289g == verificationMTSLink.f324289g;
    }

    public final int hashCode() {
        int i12 = r.i(this.f324284b.hashCode() * 31, 31, this.f324285c);
        DeepLink deepLink = this.f324286d;
        int iHashCode = (i12 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str = this.f324287e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f324288f;
        return Boolean.hashCode(this.f324289g) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationMTSLink(idShort=");
        sb2.append(this.f324284b);
        sb2.append(", production=");
        sb2.append(this.f324285c);
        sb2.append(", onSuccess=");
        sb2.append(this.f324286d);
        sb2.append(", flow=");
        sb2.append(this.f324287e);
        sb2.append(", type=");
        sb2.append(this.f324288f);
        sb2.append(", selfieOnboarding=");
        return r.x(sb2, this.f324289g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f324284b);
        parcel.writeInt(this.f324285c ? 1 : 0);
        parcel.writeParcelable(this.f324286d, i12);
        parcel.writeString(this.f324287e);
        parcel.writeString(this.f324288f);
        parcel.writeInt(this.f324289g ? 1 : 0);
    }

    public VerificationMTSLink(@k String str, boolean z12, @l DeepLink deepLink, @l String str2, @l String str3, boolean z13) {
        this.f324284b = str;
        this.f324285c = z12;
        this.f324286d = deepLink;
        this.f324287e = str2;
        this.f324288f = str3;
        this.f324289g = z13;
    }
}
