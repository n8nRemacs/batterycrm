package com.avito.android.mortgage.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: MortgageApplicationLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/deeplink/MortgageApplicationLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito_mortgage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class MortgageApplicationLink extends PublicDeeplink {

    @Y61.k
    public static final Parcelable.Creator<MortgageApplicationLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f198693b;

    /* compiled from: MortgageApplicationLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageApplicationLink> {
        @Override // android.os.Parcelable.Creator
        public final MortgageApplicationLink createFromParcel(Parcel parcel) {
            return new MortgageApplicationLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageApplicationLink[] newArray(int i12) {
            return new MortgageApplicationLink[i12];
        }
    }

    public MortgageApplicationLink(@Y61.l String str) {
        this.f198693b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MortgageApplicationLink) && kotlin.jvm.internal.L.f(this.f198693b, ((MortgageApplicationLink) obj).f198693b);
    }

    public final int hashCode() {
        String str = this.f198693b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("MortgageApplicationLink(applicationId="), this.f198693b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f198693b);
    }
}
