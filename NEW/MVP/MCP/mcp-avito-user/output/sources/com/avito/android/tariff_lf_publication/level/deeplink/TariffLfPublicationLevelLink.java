package com.avito.android.tariff_lf_publication.level.deeplink;

import K51.d;
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

/* compiled from: TariffLfPublicationLevelLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_publication/level/deeplink/TariffLfPublicationLevelLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final /* data */ class TariffLfPublicationLevelLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<TariffLfPublicationLevelLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f300887b;

    /* compiled from: TariffLfPublicationLevelLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffLfPublicationLevelLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffLfPublicationLevelLink createFromParcel(Parcel parcel) {
            return new TariffLfPublicationLevelLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TariffLfPublicationLevelLink[] newArray(int i12) {
            return new TariffLfPublicationLevelLink[i12];
        }
    }

    public TariffLfPublicationLevelLink(@k String str) {
        this.f300887b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TariffLfPublicationLevelLink) && L.f(this.f300887b, ((TariffLfPublicationLevelLink) obj).f300887b);
    }

    public final int hashCode() {
        return this.f300887b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("TariffLfPublicationLevelLink(remoteContext="), this.f300887b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f300887b);
    }
}
