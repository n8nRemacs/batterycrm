package com.avito.android.mortgage.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.List;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: MortgageDocumentUploadLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/deeplink/MortgageDocumentUploadLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_mortgage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class MortgageDocumentUploadLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<MortgageDocumentUploadLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f198702b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f198703c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f198704d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f198705e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f198706f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final List<String> f198707g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f198708h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f198709i;

    /* compiled from: MortgageDocumentUploadLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageDocumentUploadLink> {
        @Override // android.os.Parcelable.Creator
        public final MortgageDocumentUploadLink createFromParcel(Parcel parcel) {
            return new MortgageDocumentUploadLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageDocumentUploadLink[] newArray(int i12) {
            return new MortgageDocumentUploadLink[i12];
        }
    }

    public MortgageDocumentUploadLink(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.k String str6, @Y61.l String str7, @Y61.k List list) {
        this.f198702b = str;
        this.f198703c = str2;
        this.f198704d = str3;
        this.f198705e = str4;
        this.f198706f = str5;
        this.f198707g = list;
        this.f198708h = str6;
        this.f198709i = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MortgageDocumentUploadLink)) {
            return false;
        }
        MortgageDocumentUploadLink mortgageDocumentUploadLink = (MortgageDocumentUploadLink) obj;
        return kotlin.jvm.internal.L.f(this.f198702b, mortgageDocumentUploadLink.f198702b) && kotlin.jvm.internal.L.f(this.f198703c, mortgageDocumentUploadLink.f198703c) && kotlin.jvm.internal.L.f(this.f198704d, mortgageDocumentUploadLink.f198704d) && kotlin.jvm.internal.L.f(this.f198705e, mortgageDocumentUploadLink.f198705e) && kotlin.jvm.internal.L.f(this.f198706f, mortgageDocumentUploadLink.f198706f) && kotlin.jvm.internal.L.f(this.f198707g, mortgageDocumentUploadLink.f198707g) && kotlin.jvm.internal.L.f(this.f198708h, mortgageDocumentUploadLink.f198708h) && kotlin.jvm.internal.L.f(this.f198709i, mortgageDocumentUploadLink.f198709i);
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(this.f198702b.hashCode() * 31, 31, this.f198703c), 31, this.f198704d);
        String str = this.f198705e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f198706f;
        int iD3 = androidx.compose.foundation.H.d(androidx.compose.foundation.H.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f198707g), 31, this.f198708h);
        String str3 = this.f198709i;
        return iD3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageDocumentUploadLink(packageId=");
        sb2.append(this.f198702b);
        sb2.append(", documentId=");
        sb2.append(this.f198703c);
        sb2.append(", clientProfileId=");
        sb2.append(this.f198704d);
        sb2.append(", applicationId=");
        sb2.append(this.f198705e);
        sb2.append(", applicantType=");
        sb2.append(this.f198706f);
        sb2.append(", documents=");
        sb2.append(this.f198707g);
        sb2.append(", name=");
        sb2.append(this.f198708h);
        sb2.append(", error=");
        return C22026a.c(sb2, this.f198709i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f198702b);
        parcel.writeString(this.f198703c);
        parcel.writeString(this.f198704d);
        parcel.writeString(this.f198705e);
        parcel.writeString(this.f198706f);
        parcel.writeStringList(this.f198707g);
        parcel.writeString(this.f198708h);
        parcel.writeString(this.f198709i);
    }
}
