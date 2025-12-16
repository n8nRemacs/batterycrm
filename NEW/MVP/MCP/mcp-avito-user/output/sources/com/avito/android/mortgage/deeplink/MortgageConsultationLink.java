package com.avito.android.mortgage.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: MortgageConsultationLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/deeplink/MortgageConsultationLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_mortgage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class MortgageConsultationLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<MortgageConsultationLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f198695b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f198696c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f198697d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f198698e;

    /* compiled from: MortgageConsultationLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageConsultationLink> {
        @Override // android.os.Parcelable.Creator
        public final MortgageConsultationLink createFromParcel(Parcel parcel) {
            return new MortgageConsultationLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageConsultationLink[] newArray(int i12) {
            return new MortgageConsultationLink[i12];
        }
    }

    public MortgageConsultationLink(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
        this.f198695b = str;
        this.f198696c = str2;
        this.f198697d = str3;
        this.f198698e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MortgageConsultationLink)) {
            return false;
        }
        MortgageConsultationLink mortgageConsultationLink = (MortgageConsultationLink) obj;
        return kotlin.jvm.internal.L.f(this.f198695b, mortgageConsultationLink.f198695b) && kotlin.jvm.internal.L.f(this.f198696c, mortgageConsultationLink.f198696c) && kotlin.jvm.internal.L.f(this.f198697d, mortgageConsultationLink.f198697d) && kotlin.jvm.internal.L.f(this.f198698e, mortgageConsultationLink.f198698e);
    }

    public final int hashCode() {
        String str = this.f198695b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f198696c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f198697d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f198698e;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageConsultationLink(applicationId=");
        sb2.append(this.f198695b);
        sb2.append(", fullName=");
        sb2.append(this.f198696c);
        sb2.append(", fromPage=");
        sb2.append(this.f198697d);
        sb2.append(", role=");
        return C22026a.c(sb2, this.f198698e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f198695b);
        parcel.writeString(this.f198696c);
        parcel.writeString(this.f198697d);
        parcel.writeString(this.f198698e);
    }
}
