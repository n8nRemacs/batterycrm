package com.avito.android.tariff.cpr.configure.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: TariffCprConfigureAdvanceManualLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/deeplink/TariffCprConfigureAdvanceManualLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TariffCprConfigureAdvanceManualLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<TariffCprConfigureAdvanceManualLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f295496b;

    /* compiled from: TariffCprConfigureAdvanceManualLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCprConfigureAdvanceManualLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCprConfigureAdvanceManualLink createFromParcel(Parcel parcel) {
            return new TariffCprConfigureAdvanceManualLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCprConfigureAdvanceManualLink[] newArray(int i12) {
            return new TariffCprConfigureAdvanceManualLink[i12];
        }
    }

    public TariffCprConfigureAdvanceManualLink(@Y61.k String str) {
        this.f295496b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f295496b);
    }
}
