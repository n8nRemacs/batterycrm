package com.avito.android.verification.links.tinkoff_documents;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: VerificationTinkoffDocumentsLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/tinkoff_documents/VerificationTinkoffDocumentsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final /* data */ class VerificationTinkoffDocumentsLink extends DeepLink {

    @k
    public static final Parcelable.Creator<VerificationTinkoffDocumentsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashMap f324527b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f324528c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Uri f324529d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f324530e;

    /* compiled from: VerificationTinkoffDocumentsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationTinkoffDocumentsLink> {
        @Override // android.os.Parcelable.Creator
        public final VerificationTinkoffDocumentsLink createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new VerificationTinkoffDocumentsLink(linkedHashMap, parcel.readString(), (Uri) parcel.readParcelable(VerificationTinkoffDocumentsLink.class.getClassLoader()), (DeepLink) parcel.readParcelable(VerificationTinkoffDocumentsLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationTinkoffDocumentsLink[] newArray(int i12) {
            return new VerificationTinkoffDocumentsLink[i12];
        }
    }

    public VerificationTinkoffDocumentsLink(@k LinkedHashMap linkedHashMap, @k String str, @k Uri uri, @l DeepLink deepLink) {
        this.f324527b = linkedHashMap;
        this.f324528c = str;
        this.f324529d = uri;
        this.f324530e = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationTinkoffDocumentsLink)) {
            return false;
        }
        VerificationTinkoffDocumentsLink verificationTinkoffDocumentsLink = (VerificationTinkoffDocumentsLink) obj;
        return L.f(this.f324527b, verificationTinkoffDocumentsLink.f324527b) && L.f(this.f324528c, verificationTinkoffDocumentsLink.f324528c) && L.f(this.f324529d, verificationTinkoffDocumentsLink.f324529d) && L.f(this.f324530e, verificationTinkoffDocumentsLink.f324530e);
    }

    public final int hashCode() {
        int iE2 = m.e(this.f324529d, H.d(this.f324527b.hashCode() * 31, 31, this.f324528c), 31);
        DeepLink deepLink = this.f324530e;
        return iE2 + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationTinkoffDocumentsLink(queryMap=");
        sb2.append(this.f324527b);
        sb2.append(", clientId=");
        sb2.append(this.f324528c);
        sb2.append(", onFinish=");
        sb2.append(this.f324529d);
        sb2.append(", fallbackDeeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f324530e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        LinkedHashMap linkedHashMap = this.f324527b;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeString(this.f324528c);
        parcel.writeParcelable(this.f324529d, i12);
        parcel.writeParcelable(this.f324530e, i12);
    }
}
