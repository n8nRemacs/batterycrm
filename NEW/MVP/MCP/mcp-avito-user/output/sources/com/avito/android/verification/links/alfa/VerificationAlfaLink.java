package com.avito.android.verification.links.alfa;

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

/* compiled from: VerificationAlfaLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/alfa/VerificationAlfaLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final /* data */ class VerificationAlfaLink extends DeepLink {

    @k
    public static final Parcelable.Creator<VerificationAlfaLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashMap f324145b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Uri f324146c;

    /* compiled from: VerificationAlfaLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationAlfaLink> {
        @Override // android.os.Parcelable.Creator
        public final VerificationAlfaLink createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new VerificationAlfaLink((Uri) parcel.readParcelable(VerificationAlfaLink.class.getClassLoader()), linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationAlfaLink[] newArray(int i12) {
            return new VerificationAlfaLink[i12];
        }
    }

    public VerificationAlfaLink(@k Uri uri, @k LinkedHashMap linkedHashMap) {
        this.f324145b = linkedHashMap;
        this.f324146c = uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationAlfaLink)) {
            return false;
        }
        VerificationAlfaLink verificationAlfaLink = (VerificationAlfaLink) obj;
        return L.f(this.f324145b, verificationAlfaLink.f324145b) && L.f(this.f324146c, verificationAlfaLink.f324146c);
    }

    public final int hashCode() {
        return this.f324146c.hashCode() + (this.f324145b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationAlfaLink(queryMap=");
        sb2.append(this.f324145b);
        sb2.append(", authUrl=");
        return com.avito.android.actions_sheet.a.t(sb2, this.f324146c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        LinkedHashMap linkedHashMap = this.f324145b;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeParcelable(this.f324146c, i12);
    }
}
