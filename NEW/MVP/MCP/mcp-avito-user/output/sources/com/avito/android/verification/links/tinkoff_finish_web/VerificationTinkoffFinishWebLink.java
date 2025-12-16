package com.avito.android.verification.links.tinkoff_finish_web;

import Y61.k;
import Y61.l;
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

/* compiled from: VerificationTinkoffFinishWebLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/tinkoff_finish_web/VerificationTinkoffFinishWebLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final /* data */ class VerificationTinkoffFinishWebLink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<VerificationTinkoffFinishWebLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Uri f324600b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f324601c;

    /* compiled from: VerificationTinkoffFinishWebLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationTinkoffFinishWebLink> {
        @Override // android.os.Parcelable.Creator
        public final VerificationTinkoffFinishWebLink createFromParcel(Parcel parcel) {
            Uri uri = (Uri) parcel.readParcelable(VerificationTinkoffFinishWebLink.class.getClassLoader());
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new VerificationTinkoffFinishWebLink(uri, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationTinkoffFinishWebLink[] newArray(int i12) {
            return new VerificationTinkoffFinishWebLink[i12];
        }
    }

    public VerificationTinkoffFinishWebLink(@k Uri uri, @k Map<String, String> map) {
        this.f324600b = uri;
        this.f324601c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationTinkoffFinishWebLink)) {
            return false;
        }
        VerificationTinkoffFinishWebLink verificationTinkoffFinishWebLink = (VerificationTinkoffFinishWebLink) obj;
        return L.f(this.f324600b, verificationTinkoffFinishWebLink.f324600b) && L.f(this.f324601c, verificationTinkoffFinishWebLink.f324601c);
    }

    public final int hashCode() {
        return this.f324601c.hashCode() + (this.f324600b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationTinkoffFinishWebLink(rawUri=");
        sb2.append(this.f324600b);
        sb2.append(", queryMap=");
        return H.n(sb2, this.f324601c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f324600b, i12);
        Iterator itO = com.avito.android.bxcontent.mvi.entity.f.o(this.f324601c, parcel);
        while (itO.hasNext()) {
            Map.Entry entry = (Map.Entry) itO.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
