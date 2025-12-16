package com.avito.android.mortgage_invite.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: MortgageApplicationClientFormLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/deeplink/MortgageApplicationClientFormLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_mortgage-invite_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class MortgageApplicationClientFormLink extends DeepLink {

    @k
    public static final Parcelable.Creator<MortgageApplicationClientFormLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f205801b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f205802c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f205803d;

    /* compiled from: MortgageApplicationClientFormLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageApplicationClientFormLink> {
        @Override // android.os.Parcelable.Creator
        public final MortgageApplicationClientFormLink createFromParcel(Parcel parcel) {
            return new MortgageApplicationClientFormLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageApplicationClientFormLink[] newArray(int i12) {
            return new MortgageApplicationClientFormLink[i12];
        }
    }

    public MortgageApplicationClientFormLink(@k String str, @k String str2, @k String str3) {
        this.f205801b = str;
        this.f205802c = str2;
        this.f205803d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MortgageApplicationClientFormLink)) {
            return false;
        }
        MortgageApplicationClientFormLink mortgageApplicationClientFormLink = (MortgageApplicationClientFormLink) obj;
        return L.f(this.f205801b, mortgageApplicationClientFormLink.f205801b) && L.f(this.f205802c, mortgageApplicationClientFormLink.f205802c) && L.f(this.f205803d, mortgageApplicationClientFormLink.f205803d);
    }

    public final int hashCode() {
        return this.f205803d.hashCode() + H.d(this.f205801b.hashCode() * 31, 31, this.f205802c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageApplicationClientFormLink(applicationId=");
        sb2.append(this.f205801b);
        sb2.append(", flowType=");
        sb2.append(this.f205802c);
        sb2.append(", clientType=");
        return C22026a.c(sb2, this.f205803d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f205801b);
        parcel.writeString(this.f205802c);
        parcel.writeString(this.f205803d);
    }
}
