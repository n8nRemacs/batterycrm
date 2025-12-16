package com.avito.android.tariff_lf.package_info.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: TariffPackageInfoLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/package_info/deeplink/TariffPackageInfoLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TariffPackageInfoLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<TariffPackageInfoLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f299178b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f299179c;

    /* compiled from: TariffPackageInfoLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffPackageInfoLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffPackageInfoLink createFromParcel(Parcel parcel) {
            return new TariffPackageInfoLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TariffPackageInfoLink[] newArray(int i12) {
            return new TariffPackageInfoLink[i12];
        }
    }

    public TariffPackageInfoLink(@k String str, @k String str2) {
        this.f299178b = str;
        this.f299179c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f299178b);
        parcel.writeString(this.f299179c);
    }
}
