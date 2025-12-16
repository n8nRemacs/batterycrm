package com.avito.android.tariff.cpx.info.limits.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: TariffCpxInfoLimitsLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/info/limits/deeplink/TariffCpxInfoLimitsLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TariffCpxInfoLimitsLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<TariffCpxInfoLimitsLink> CREATOR = new a();

    /* compiled from: TariffCpxInfoLimitsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCpxInfoLimitsLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCpxInfoLimitsLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new TariffCpxInfoLimitsLink();
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCpxInfoLimitsLink[] newArray(int i12) {
            return new TariffCpxInfoLimitsLink[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
