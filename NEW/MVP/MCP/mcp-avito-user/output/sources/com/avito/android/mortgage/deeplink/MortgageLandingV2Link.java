package com.avito.android.mortgage.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: MortgageLandingLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/deeplink/MortgageLandingV2Link;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_mortgage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class MortgageLandingV2Link extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<MortgageLandingV2Link> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f198741b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f198742c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f198743d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f198744e;

    /* compiled from: MortgageLandingLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageLandingV2Link> {
        @Override // android.os.Parcelable.Creator
        public final MortgageLandingV2Link createFromParcel(Parcel parcel) {
            return new MortgageLandingV2Link(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageLandingV2Link[] newArray(int i12) {
            return new MortgageLandingV2Link[i12];
        }
    }

    public MortgageLandingV2Link(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4) {
        this.f198741b = str;
        this.f198742c = str2;
        this.f198743d = str3;
        this.f198744e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MortgageLandingV2Link)) {
            return false;
        }
        MortgageLandingV2Link mortgageLandingV2Link = (MortgageLandingV2Link) obj;
        return kotlin.jvm.internal.L.f(this.f198741b, mortgageLandingV2Link.f198741b) && kotlin.jvm.internal.L.f(this.f198742c, mortgageLandingV2Link.f198742c) && kotlin.jvm.internal.L.f(this.f198743d, mortgageLandingV2Link.f198743d) && kotlin.jvm.internal.L.f(this.f198744e, mortgageLandingV2Link.f198744e);
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(this.f198741b.hashCode() * 31, 31, this.f198742c);
        String str = this.f198743d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f198744e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageLandingV2Link(applicationId=");
        sb2.append(this.f198741b);
        sb2.append(", flowType=");
        sb2.append(this.f198742c);
        sb2.append(", sourceType=");
        sb2.append(this.f198743d);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f198744e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f198741b);
        parcel.writeString(this.f198742c);
        parcel.writeString(this.f198743d);
        parcel.writeString(this.f198744e);
    }
}
