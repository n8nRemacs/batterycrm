package com.avito.android.tariff_select.deeplink;

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

/* compiled from: TariffSelectDeepLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_select/deeplink/TariffSelectDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final /* data */ class TariffSelectDeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<TariffSelectDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f301179b;

    /* compiled from: TariffSelectDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffSelectDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffSelectDeepLink createFromParcel(Parcel parcel) {
            return new TariffSelectDeepLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TariffSelectDeepLink[] newArray(int i12) {
            return new TariffSelectDeepLink[i12];
        }
    }

    public TariffSelectDeepLink(@l String str) {
        this.f301179b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TariffSelectDeepLink) && L.f(this.f301179b, ((TariffSelectDeepLink) obj).f301179b);
    }

    public final int hashCode() {
        String str = this.f301179b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("TariffSelectDeepLink(remoteContext="), this.f301179b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f301179b);
    }
}
