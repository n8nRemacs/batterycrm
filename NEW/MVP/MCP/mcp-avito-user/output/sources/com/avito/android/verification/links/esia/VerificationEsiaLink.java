package com.avito.android.verification.links.esia;

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

/* compiled from: VerificationEsiaLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/esia/VerificationEsiaLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final /* data */ class VerificationEsiaLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<VerificationEsiaLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f324218b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Uri f324219c;

    /* compiled from: VerificationEsiaLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationEsiaLink> {
        @Override // android.os.Parcelable.Creator
        public final VerificationEsiaLink createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new VerificationEsiaLink((Uri) parcel.readParcelable(VerificationEsiaLink.class.getClassLoader()), linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationEsiaLink[] newArray(int i12) {
            return new VerificationEsiaLink[i12];
        }
    }

    public VerificationEsiaLink(@Y61.k Uri uri, @Y61.k LinkedHashMap linkedHashMap) {
        this.f324218b = linkedHashMap;
        this.f324219c = uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationEsiaLink)) {
            return false;
        }
        VerificationEsiaLink verificationEsiaLink = (VerificationEsiaLink) obj;
        return L.f(this.f324218b, verificationEsiaLink.f324218b) && L.f(this.f324219c, verificationEsiaLink.f324219c);
    }

    public final int hashCode() {
        return this.f324219c.hashCode() + (this.f324218b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationEsiaLink(queryMap=");
        sb2.append(this.f324218b);
        sb2.append(", authUrl=");
        return com.avito.android.actions_sheet.a.t(sb2, this.f324219c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        LinkedHashMap linkedHashMap = this.f324218b;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeParcelable(this.f324219c, i12);
    }
}
