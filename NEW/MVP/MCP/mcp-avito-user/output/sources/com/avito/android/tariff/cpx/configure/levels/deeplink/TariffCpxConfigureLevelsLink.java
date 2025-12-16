package com.avito.android.tariff.cpx.configure.levels.deeplink;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: TariffCpxConfigureLevelsLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/deeplink/TariffCpxConfigureLevelsLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final /* data */ class TariffCpxConfigureLevelsLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<TariffCpxConfigureLevelsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f296081b;

    /* compiled from: TariffCpxConfigureLevelsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCpxConfigureLevelsLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCpxConfigureLevelsLink createFromParcel(Parcel parcel) {
            return new TariffCpxConfigureLevelsLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCpxConfigureLevelsLink[] newArray(int i12) {
            return new TariffCpxConfigureLevelsLink[i12];
        }
    }

    public TariffCpxConfigureLevelsLink(@k String str) {
        this.f296081b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TariffCpxConfigureLevelsLink) && L.f(this.f296081b, ((TariffCpxConfigureLevelsLink) obj).f296081b);
    }

    public final int hashCode() {
        return this.f296081b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("TariffCpxConfigureLevelsLink(remoteContext="), this.f296081b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f296081b);
    }
}
