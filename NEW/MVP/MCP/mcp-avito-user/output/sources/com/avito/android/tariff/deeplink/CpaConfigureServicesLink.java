package com.avito.android.tariff.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: CpaConfigureServicesLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/deeplink/CpaConfigureServicesLink;", "Lcom/avito/android/tariff/deeplink/TariffDetailsSheetLink;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class CpaConfigureServicesLink extends TariffDetailsSheetLink {

    @k
    public static final Parcelable.Creator<CpaConfigureServicesLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f297365b;

    /* compiled from: CpaConfigureServicesLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CpaConfigureServicesLink> {
        @Override // android.os.Parcelable.Creator
        public final CpaConfigureServicesLink createFromParcel(Parcel parcel) {
            return new CpaConfigureServicesLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CpaConfigureServicesLink[] newArray(int i12) {
            return new CpaConfigureServicesLink[i12];
        }
    }

    public CpaConfigureServicesLink(@k String str) {
        this.f297365b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f297365b);
    }
}
