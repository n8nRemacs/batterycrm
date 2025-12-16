package com.avito.android.verification.links.vtb_finish;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: VerificationVTBFinishLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/vtb_finish/VerificationVTBFinishLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final /* data */ class VerificationVTBFinishLink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<VerificationVTBFinishLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Uri f324742b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f324743c;

    /* compiled from: VerificationVTBFinishLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationVTBFinishLink> {
        @Override // android.os.Parcelable.Creator
        public final VerificationVTBFinishLink createFromParcel(Parcel parcel) {
            Uri uri = (Uri) parcel.readParcelable(VerificationVTBFinishLink.class.getClassLoader());
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new VerificationVTBFinishLink(uri, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationVTBFinishLink[] newArray(int i12) {
            return new VerificationVTBFinishLink[i12];
        }
    }

    public VerificationVTBFinishLink(@k Uri uri, @k Map<String, String> map) {
        this.f324742b = uri;
        this.f324743c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationVTBFinishLink)) {
            return false;
        }
        VerificationVTBFinishLink verificationVTBFinishLink = (VerificationVTBFinishLink) obj;
        return L.f(this.f324742b, verificationVTBFinishLink.f324742b) && L.f(this.f324743c, verificationVTBFinishLink.f324743c);
    }

    public final int hashCode() {
        return this.f324743c.hashCode() + (this.f324742b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationVTBFinishLink(url=");
        sb2.append(this.f324742b);
        sb2.append(", queryMap=");
        return H.n(sb2, this.f324743c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f324742b, i12);
        Iterator itO = f.o(this.f324743c, parcel);
        while (itO.hasNext()) {
            Map.Entry entry = (Map.Entry) itO.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
