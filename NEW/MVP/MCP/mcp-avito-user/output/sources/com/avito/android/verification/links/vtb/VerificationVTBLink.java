package com.avito.android.verification.links.vtb;

import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: VerificationVTBLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/vtb/VerificationVTBLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final /* data */ class VerificationVTBLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<VerificationVTBLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Uri f324680b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Map<String, String> f324681c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f324682d;

    /* compiled from: VerificationVTBLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationVTBLink> {
        @Override // android.os.Parcelable.Creator
        public final VerificationVTBLink createFromParcel(Parcel parcel) {
            Uri uri = (Uri) parcel.readParcelable(VerificationVTBLink.class.getClassLoader());
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new VerificationVTBLink(uri, linkedHashMap, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationVTBLink[] newArray(int i12) {
            return new VerificationVTBLink[i12];
        }
    }

    public /* synthetic */ VerificationVTBLink(Uri uri, Map map, boolean z12, int i12, C42822w c42822w) {
        this(uri, map, (i12 & 4) != 0 ? true : z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationVTBLink)) {
            return false;
        }
        VerificationVTBLink verificationVTBLink = (VerificationVTBLink) obj;
        return L.f(this.f324680b, verificationVTBLink.f324680b) && L.f(this.f324681c, verificationVTBLink.f324681c) && this.f324682d == verificationVTBLink.f324682d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f324682d) + AK.c.c(this.f324680b.hashCode() * 31, 31, this.f324681c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationVTBLink(url=");
        sb2.append(this.f324680b);
        sb2.append(", queryMap=");
        sb2.append(this.f324681c);
        sb2.append(", isApp2AppEnabled=");
        return r.x(sb2, this.f324682d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f324680b, i12);
        Iterator itI = C0.i(parcel, this.f324681c);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeInt(this.f324682d ? 1 : 0);
    }

    public VerificationVTBLink(@Y61.k Uri uri, @Y61.k Map<String, String> map, boolean z12) {
        this.f324680b = uri;
        this.f324681c = map;
        this.f324682d = z12;
    }
}
