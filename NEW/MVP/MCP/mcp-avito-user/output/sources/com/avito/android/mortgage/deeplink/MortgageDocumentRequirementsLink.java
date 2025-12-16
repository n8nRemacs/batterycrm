package com.avito.android.mortgage.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.List;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: MortgageDocumentRequirementsLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/deeplink/MortgageDocumentRequirementsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_mortgage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class MortgageDocumentRequirementsLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<MortgageDocumentRequirementsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f198699b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<String> f198700c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f198701d;

    /* compiled from: MortgageDocumentRequirementsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageDocumentRequirementsLink> {
        @Override // android.os.Parcelable.Creator
        public final MortgageDocumentRequirementsLink createFromParcel(Parcel parcel) {
            return new MortgageDocumentRequirementsLink(parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageDocumentRequirementsLink[] newArray(int i12) {
            return new MortgageDocumentRequirementsLink[i12];
        }
    }

    public MortgageDocumentRequirementsLink(@Y61.k String str, @Y61.k List<String> list, @Y61.l String str2) {
        this.f198699b = str;
        this.f198700c = list;
        this.f198701d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MortgageDocumentRequirementsLink)) {
            return false;
        }
        MortgageDocumentRequirementsLink mortgageDocumentRequirementsLink = (MortgageDocumentRequirementsLink) obj;
        return kotlin.jvm.internal.L.f(this.f198699b, mortgageDocumentRequirementsLink.f198699b) && kotlin.jvm.internal.L.f(this.f198700c, mortgageDocumentRequirementsLink.f198700c) && kotlin.jvm.internal.L.f(this.f198701d, mortgageDocumentRequirementsLink.f198701d);
    }

    public final int hashCode() {
        int iE2 = androidx.compose.foundation.H.e(this.f198699b.hashCode() * 31, 31, this.f198700c);
        String str = this.f198701d;
        return iE2 + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageDocumentRequirementsLink(packageType=");
        sb2.append(this.f198699b);
        sb2.append(", visibleTypes=");
        sb2.append(this.f198700c);
        sb2.append(", applicationId=");
        return C22026a.c(sb2, this.f198701d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f198699b);
        parcel.writeStringList(this.f198700c);
        parcel.writeString(this.f198701d);
    }
}
