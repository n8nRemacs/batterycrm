package com.avito.android.mortgage.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: MortgageManagerUspLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/deeplink/MortgageManagerUspLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_mortgage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class MortgageManagerUspLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<MortgageManagerUspLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f198745b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f198746c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f198747d;

    /* compiled from: MortgageManagerUspLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageManagerUspLink> {
        @Override // android.os.Parcelable.Creator
        public final MortgageManagerUspLink createFromParcel(Parcel parcel) {
            return new MortgageManagerUspLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageManagerUspLink[] newArray(int i12) {
            return new MortgageManagerUspLink[i12];
        }
    }

    public MortgageManagerUspLink(@Y61.k String str, @Y61.l String str2, @Y61.k String str3) {
        this.f198745b = str;
        this.f198746c = str2;
        this.f198747d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MortgageManagerUspLink)) {
            return false;
        }
        MortgageManagerUspLink mortgageManagerUspLink = (MortgageManagerUspLink) obj;
        return kotlin.jvm.internal.L.f(this.f198745b, mortgageManagerUspLink.f198745b) && kotlin.jvm.internal.L.f(this.f198746c, mortgageManagerUspLink.f198746c) && kotlin.jvm.internal.L.f(this.f198747d, mortgageManagerUspLink.f198747d);
    }

    public final int hashCode() {
        int iHashCode = this.f198745b.hashCode() * 31;
        String str = this.f198746c;
        return this.f198747d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageManagerUspLink(flowType=");
        sb2.append(this.f198745b);
        sb2.append(", applicationId=");
        sb2.append(this.f198746c);
        sb2.append(", role=");
        return C22026a.c(sb2, this.f198747d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f198745b);
        parcel.writeString(this.f198746c);
        parcel.writeString(this.f198747d);
    }
}
