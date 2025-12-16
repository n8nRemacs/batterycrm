package com.avito.android.mortgage.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: MortgageSignLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/deeplink/MortgageSignLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_mortgage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class MortgageSignLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<MortgageSignLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f198748b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f198749c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f198750d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f198751e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f198752f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f198753g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f198754h;

    /* compiled from: MortgageSignLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageSignLink> {
        @Override // android.os.Parcelable.Creator
        public final MortgageSignLink createFromParcel(Parcel parcel) {
            return new MortgageSignLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageSignLink[] newArray(int i12) {
            return new MortgageSignLink[i12];
        }
    }

    public MortgageSignLink(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7) {
        this.f198748b = str;
        this.f198749c = str2;
        this.f198750d = str3;
        this.f198751e = str4;
        this.f198752f = str5;
        this.f198753g = str6;
        this.f198754h = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MortgageSignLink)) {
            return false;
        }
        MortgageSignLink mortgageSignLink = (MortgageSignLink) obj;
        return kotlin.jvm.internal.L.f(this.f198748b, mortgageSignLink.f198748b) && kotlin.jvm.internal.L.f(this.f198749c, mortgageSignLink.f198749c) && kotlin.jvm.internal.L.f(this.f198750d, mortgageSignLink.f198750d) && kotlin.jvm.internal.L.f(this.f198751e, mortgageSignLink.f198751e) && kotlin.jvm.internal.L.f(this.f198752f, mortgageSignLink.f198752f) && kotlin.jvm.internal.L.f(this.f198753g, mortgageSignLink.f198753g) && kotlin.jvm.internal.L.f(this.f198754h, mortgageSignLink.f198754h);
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(this.f198748b.hashCode() * 31, 31, this.f198749c), 31, this.f198750d), 31, this.f198751e);
        String str = this.f198752f;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f198753g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f198754h;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageSignLink(name=");
        sb2.append(this.f198748b);
        sb2.append(", packageId=");
        sb2.append(this.f198749c);
        sb2.append(", documentId=");
        sb2.append(this.f198750d);
        sb2.append(", applicantId=");
        sb2.append(this.f198751e);
        sb2.append(", applicantType=");
        sb2.append(this.f198752f);
        sb2.append(", applicationId=");
        sb2.append(this.f198753g);
        sb2.append(", error=");
        return C22026a.c(sb2, this.f198754h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f198748b);
        parcel.writeString(this.f198749c);
        parcel.writeString(this.f198750d);
        parcel.writeString(this.f198751e);
        parcel.writeString(this.f198752f);
        parcel.writeString(this.f198753g);
        parcel.writeString(this.f198754h);
    }
}
