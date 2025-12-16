package com.avito.android.tariff_cpt.configure.levels.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: TariffCptConfigureLevelsLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/deeplink/TariffCptConfigureLevelsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final /* data */ class TariffCptConfigureLevelsLink extends DeepLink {

    @k
    public static final Parcelable.Creator<TariffCptConfigureLevelsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f297821b;

    /* compiled from: TariffCptConfigureLevelsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCptConfigureLevelsLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCptConfigureLevelsLink createFromParcel(Parcel parcel) {
            return new TariffCptConfigureLevelsLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCptConfigureLevelsLink[] newArray(int i12) {
            return new TariffCptConfigureLevelsLink[i12];
        }
    }

    public TariffCptConfigureLevelsLink(@k String str) {
        this.f297821b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TariffCptConfigureLevelsLink) && L.f(this.f297821b, ((TariffCptConfigureLevelsLink) obj).f297821b);
    }

    public final int hashCode() {
        return this.f297821b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("TariffCptConfigureLevelsLink(remoteContext="), this.f297821b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f297821b);
    }
}
