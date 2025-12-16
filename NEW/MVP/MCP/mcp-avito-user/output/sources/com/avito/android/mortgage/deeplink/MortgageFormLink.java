package com.avito.android.mortgage.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.List;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: MortgageFormLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/deeplink/MortgageFormLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_mortgage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class MortgageFormLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<MortgageFormLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f198710b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f198711c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f198712d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f198713e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<String> f198714f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f198715g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f198716h;

    /* compiled from: MortgageFormLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageFormLink> {
        @Override // android.os.Parcelable.Creator
        public final MortgageFormLink createFromParcel(Parcel parcel) {
            return new MortgageFormLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageFormLink[] newArray(int i12) {
            return new MortgageFormLink[i12];
        }
    }

    public MortgageFormLink(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.k String str4, @Y61.k String str5, @Y61.k String str6, @Y61.k List list) {
        this.f198710b = str;
        this.f198711c = str2;
        this.f198712d = str3;
        this.f198713e = str4;
        this.f198714f = list;
        this.f198715g = str5;
        this.f198716h = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MortgageFormLink)) {
            return false;
        }
        MortgageFormLink mortgageFormLink = (MortgageFormLink) obj;
        return kotlin.jvm.internal.L.f(this.f198710b, mortgageFormLink.f198710b) && kotlin.jvm.internal.L.f(this.f198711c, mortgageFormLink.f198711c) && kotlin.jvm.internal.L.f(this.f198712d, mortgageFormLink.f198712d) && kotlin.jvm.internal.L.f(this.f198713e, mortgageFormLink.f198713e) && kotlin.jvm.internal.L.f(this.f198714f, mortgageFormLink.f198714f) && kotlin.jvm.internal.L.f(this.f198715g, mortgageFormLink.f198715g) && kotlin.jvm.internal.L.f(this.f198716h, mortgageFormLink.f198716h);
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(this.f198710b.hashCode() * 31, 31, this.f198711c);
        String str = this.f198712d;
        return this.f198716h.hashCode() + androidx.compose.foundation.H.d(androidx.compose.foundation.H.e(androidx.compose.foundation.H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f198713e), 31, this.f198714f), 31, this.f198715g);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageFormLink(applicationId=");
        sb2.append(this.f198710b);
        sb2.append(", applicantId=");
        sb2.append(this.f198711c);
        sb2.append(", applicantType=");
        sb2.append(this.f198712d);
        sb2.append(", screenTitle=");
        sb2.append(this.f198713e);
        sb2.append(", steps=");
        sb2.append(this.f198714f);
        sb2.append(", currentStep=");
        sb2.append(this.f198715g);
        sb2.append(", flowType=");
        return C22026a.c(sb2, this.f198716h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f198710b);
        parcel.writeString(this.f198711c);
        parcel.writeString(this.f198712d);
        parcel.writeString(this.f198713e);
        parcel.writeStringList(this.f198714f);
        parcel.writeString(this.f198715g);
        parcel.writeString(this.f198716h);
    }
}
