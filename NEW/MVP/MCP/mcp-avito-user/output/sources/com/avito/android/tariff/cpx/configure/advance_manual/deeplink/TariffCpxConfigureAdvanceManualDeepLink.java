package com.avito.android.tariff.cpx.configure.advance_manual.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.tariff.remote.model.cpx.CpxConfigureAdvanceManualResult;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: TariffCpxConfigureAdvanceManualDeepLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance_manual/deeplink/TariffCpxConfigureAdvanceManualDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TariffCpxConfigureAdvanceManualDeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<TariffCpxConfigureAdvanceManualDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CpxConfigureAdvanceManualResult f295805b;

    /* compiled from: TariffCpxConfigureAdvanceManualDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCpxConfigureAdvanceManualDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCpxConfigureAdvanceManualDeepLink createFromParcel(Parcel parcel) {
            return new TariffCpxConfigureAdvanceManualDeepLink(CpxConfigureAdvanceManualResult.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCpxConfigureAdvanceManualDeepLink[] newArray(int i12) {
            return new TariffCpxConfigureAdvanceManualDeepLink[i12];
        }
    }

    public TariffCpxConfigureAdvanceManualDeepLink(@k CpxConfigureAdvanceManualResult cpxConfigureAdvanceManualResult) {
        this.f295805b = cpxConfigureAdvanceManualResult;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f295805b.writeToParcel(parcel, i12);
    }
}
