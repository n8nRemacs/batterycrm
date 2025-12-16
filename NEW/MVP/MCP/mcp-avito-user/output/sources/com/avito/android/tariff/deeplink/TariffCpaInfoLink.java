package com.avito.android.tariff.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: TariffCpaInfoLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/deeplink/TariffCpaInfoLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TariffCpaInfoLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<TariffCpaInfoLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f297373b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f297374c;

    /* compiled from: TariffCpaInfoLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCpaInfoLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCpaInfoLink createFromParcel(Parcel parcel) {
            return new TariffCpaInfoLink(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCpaInfoLink[] newArray(int i12) {
            return new TariffCpaInfoLink[i12];
        }
    }

    public TariffCpaInfoLink(boolean z12, boolean z13) {
        this.f297373b = z12;
        this.f297374c = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f297373b ? 1 : 0);
        parcel.writeInt(this.f297374c ? 1 : 0);
    }
}
