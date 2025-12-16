package com.avito.android.verification.links.tochka;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: VerificationTochkaLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/tochka/VerificationTochkaLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final /* data */ class VerificationTochkaLink extends DeepLink {

    @k
    public static final Parcelable.Creator<VerificationTochkaLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Uri f324641b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f324642c;

    /* compiled from: VerificationTochkaLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationTochkaLink> {
        @Override // android.os.Parcelable.Creator
        public final VerificationTochkaLink createFromParcel(Parcel parcel) {
            Uri uri = (Uri) parcel.readParcelable(VerificationTochkaLink.class.getClassLoader());
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new VerificationTochkaLink(uri, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationTochkaLink[] newArray(int i12) {
            return new VerificationTochkaLink[i12];
        }
    }

    public VerificationTochkaLink(@k Uri uri, @k LinkedHashMap linkedHashMap) {
        this.f324641b = uri;
        this.f324642c = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationTochkaLink)) {
            return false;
        }
        VerificationTochkaLink verificationTochkaLink = (VerificationTochkaLink) obj;
        return L.f(this.f324641b, verificationTochkaLink.f324641b) && L.f(this.f324642c, verificationTochkaLink.f324642c);
    }

    public final int hashCode() {
        return this.f324642c.hashCode() + (this.f324641b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationTochkaLink(url=");
        sb2.append(this.f324641b);
        sb2.append(", queryMap=");
        return org.webrtc.h.e(sb2, this.f324642c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f324641b, i12);
        LinkedHashMap linkedHashMap = this.f324642c;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
