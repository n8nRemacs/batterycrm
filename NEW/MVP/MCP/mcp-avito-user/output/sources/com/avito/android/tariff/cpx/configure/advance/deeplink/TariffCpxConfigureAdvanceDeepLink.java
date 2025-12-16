package com.avito.android.tariff.cpx.configure.advance.deeplink;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: TariffCpxConfigureAdvanceDeepLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/deeplink/TariffCpxConfigureAdvanceDeepLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TariffCpxConfigureAdvanceDeepLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<TariffCpxConfigureAdvanceDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f295560b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f295561c;

    /* compiled from: TariffCpxConfigureAdvanceDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCpxConfigureAdvanceDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCpxConfigureAdvanceDeepLink createFromParcel(Parcel parcel) {
            return new TariffCpxConfigureAdvanceDeepLink(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCpxConfigureAdvanceDeepLink[] newArray(int i12) {
            return new TariffCpxConfigureAdvanceDeepLink[i12];
        }
    }

    public TariffCpxConfigureAdvanceDeepLink(@k String str, boolean z12) {
        this.f295560b = str;
        this.f295561c = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f295560b);
        parcel.writeInt(this.f295561c ? 1 : 0);
    }
}
