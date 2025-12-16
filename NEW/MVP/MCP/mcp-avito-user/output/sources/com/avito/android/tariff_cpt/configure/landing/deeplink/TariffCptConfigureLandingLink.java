package com.avito.android.tariff_cpt.configure.landing.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: TariffCptConfigureLandingLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/landing/deeplink/TariffCptConfigureLandingLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final /* data */ class TariffCptConfigureLandingLink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<TariffCptConfigureLandingLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f297737b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f297738c;

    /* compiled from: TariffCptConfigureLandingLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCptConfigureLandingLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCptConfigureLandingLink createFromParcel(Parcel parcel) {
            return new TariffCptConfigureLandingLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCptConfigureLandingLink[] newArray(int i12) {
            return new TariffCptConfigureLandingLink[i12];
        }
    }

    public TariffCptConfigureLandingLink(@l String str, @l String str2) {
        this.f297737b = str;
        this.f297738c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TariffCptConfigureLandingLink)) {
            return false;
        }
        TariffCptConfigureLandingLink tariffCptConfigureLandingLink = (TariffCptConfigureLandingLink) obj;
        return L.f(this.f297737b, tariffCptConfigureLandingLink.f297737b) && L.f(this.f297738c, tariffCptConfigureLandingLink.f297738c);
    }

    public final int hashCode() {
        String str = this.f297737b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f297738c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCptConfigureLandingLink(from=");
        sb2.append(this.f297737b);
        sb2.append(", remoteContext=");
        return C22026a.c(sb2, this.f297738c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f297737b);
        parcel.writeString(this.f297738c);
    }
}
