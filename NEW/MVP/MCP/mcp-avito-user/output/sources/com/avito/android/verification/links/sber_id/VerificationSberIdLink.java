package com.avito.android.verification.links.sber_id;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: VerificationSberIdLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/sber_id/VerificationSberIdLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final /* data */ class VerificationSberIdLink extends DeepLink {

    @k
    public static final Parcelable.Creator<VerificationSberIdLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashMap f324480b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f324481c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f324482d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f324483e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f324484f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f324485g;

    /* compiled from: VerificationSberIdLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationSberIdLink> {
        @Override // android.os.Parcelable.Creator
        public final VerificationSberIdLink createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (true) {
                String string = parcel.readString();
                if (iA2 == i12) {
                    return new VerificationSberIdLink(linkedHashMap, string, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }
                iA2 = C0.a(parcel, linkedHashMap, string, iA2, 1);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationSberIdLink[] newArray(int i12) {
            return new VerificationSberIdLink[i12];
        }
    }

    public VerificationSberIdLink(@k LinkedHashMap linkedHashMap, @k String str, @k String str2, @k String str3, @k String str4, @k String str5) {
        this.f324480b = linkedHashMap;
        this.f324481c = str;
        this.f324482d = str2;
        this.f324483e = str3;
        this.f324484f = str4;
        this.f324485g = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationSberIdLink)) {
            return false;
        }
        VerificationSberIdLink verificationSberIdLink = (VerificationSberIdLink) obj;
        return L.f(this.f324480b, verificationSberIdLink.f324480b) && L.f(this.f324481c, verificationSberIdLink.f324481c) && L.f(this.f324482d, verificationSberIdLink.f324482d) && L.f(this.f324483e, verificationSberIdLink.f324483e) && L.f(this.f324484f, verificationSberIdLink.f324484f) && L.f(this.f324485g, verificationSberIdLink.f324485g);
    }

    public final int hashCode() {
        return this.f324485g.hashCode() + H.d(H.d(H.d(H.d(this.f324480b.hashCode() * 31, 31, this.f324481c), 31, this.f324482d), 31, this.f324483e), 31, this.f324484f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationSberIdLink(queryMap=");
        sb2.append(this.f324480b);
        sb2.append(", clientId=");
        sb2.append(this.f324481c);
        sb2.append(", nonce=");
        sb2.append(this.f324482d);
        sb2.append(", state=");
        sb2.append(this.f324483e);
        sb2.append(", scope=");
        sb2.append(this.f324484f);
        sb2.append(", callbackUri=");
        return C22026a.c(sb2, this.f324485g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        LinkedHashMap linkedHashMap = this.f324480b;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeString(this.f324481c);
        parcel.writeString(this.f324482d);
        parcel.writeString(this.f324483e);
        parcel.writeString(this.f324484f);
        parcel.writeString(this.f324485g);
    }
}
