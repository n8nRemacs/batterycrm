package com.avito.android.verification.links.tinkoff_finish;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: VerificationTinkoffFinishLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/tinkoff_finish/VerificationTinkoffFinishLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final /* data */ class VerificationTinkoffFinishLink extends PublicDeeplink {

    @Y61.k
    public static final Parcelable.Creator<VerificationTinkoffFinishLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Uri f324556b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f324557c;

    /* compiled from: VerificationTinkoffFinishLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationTinkoffFinishLink> {
        @Override // android.os.Parcelable.Creator
        public final VerificationTinkoffFinishLink createFromParcel(Parcel parcel) {
            Uri uri = (Uri) parcel.readParcelable(VerificationTinkoffFinishLink.class.getClassLoader());
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new VerificationTinkoffFinishLink(uri, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationTinkoffFinishLink[] newArray(int i12) {
            return new VerificationTinkoffFinishLink[i12];
        }
    }

    public VerificationTinkoffFinishLink(@Y61.k Uri uri, @Y61.k Map<String, String> map) {
        this.f324556b = uri;
        this.f324557c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationTinkoffFinishLink)) {
            return false;
        }
        VerificationTinkoffFinishLink verificationTinkoffFinishLink = (VerificationTinkoffFinishLink) obj;
        return L.f(this.f324556b, verificationTinkoffFinishLink.f324556b) && L.f(this.f324557c, verificationTinkoffFinishLink.f324557c);
    }

    public final int hashCode() {
        return this.f324557c.hashCode() + (this.f324556b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationTinkoffFinishLink(rawUri=");
        sb2.append(this.f324556b);
        sb2.append(", queryMap=");
        return H.n(sb2, this.f324557c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f324556b, i12);
        Iterator itO = com.avito.android.bxcontent.mvi.entity.f.o(this.f324557c, parcel);
        while (itO.hasNext()) {
            Map.Entry entry = (Map.Entry) itO.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
