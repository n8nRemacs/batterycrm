package com.avito.android.mortgage_invite.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: MortgageApplicationContactInfoLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/deeplink/MortgageApplicationContactInfoLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_mortgage-invite_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class MortgageApplicationContactInfoLink extends DeepLink {

    @k
    public static final Parcelable.Creator<MortgageApplicationContactInfoLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f205804b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f205805c;

    /* compiled from: MortgageApplicationContactInfoLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageApplicationContactInfoLink> {
        @Override // android.os.Parcelable.Creator
        public final MortgageApplicationContactInfoLink createFromParcel(Parcel parcel) {
            return new MortgageApplicationContactInfoLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageApplicationContactInfoLink[] newArray(int i12) {
            return new MortgageApplicationContactInfoLink[i12];
        }
    }

    public MortgageApplicationContactInfoLink(@l String str, @l String str2) {
        this.f205804b = str;
        this.f205805c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MortgageApplicationContactInfoLink)) {
            return false;
        }
        MortgageApplicationContactInfoLink mortgageApplicationContactInfoLink = (MortgageApplicationContactInfoLink) obj;
        return L.f(this.f205804b, mortgageApplicationContactInfoLink.f205804b) && L.f(this.f205805c, mortgageApplicationContactInfoLink.f205805c);
    }

    public final int hashCode() {
        String str = this.f205804b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f205805c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageApplicationContactInfoLink(sourceType=");
        sb2.append(this.f205804b);
        sb2.append(", utmSource=");
        return C22026a.c(sb2, this.f205805c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f205804b);
        parcel.writeString(this.f205805c);
    }
}
