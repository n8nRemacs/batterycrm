package com.avito.android.tariff_lf_constructor.configure.setting.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.tariff_lf_constructor.configure.deeplink.ConstructorTariffLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: TariffConfigureSettingLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/setting/deeplink/TariffConfigureSettingLink;", "Lcom/avito/android/tariff_lf_constructor/configure/deeplink/ConstructorTariffLink;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TariffConfigureSettingLink extends ConstructorTariffLink {

    @k
    public static final Parcelable.Creator<TariffConfigureSettingLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f300042b;

    /* compiled from: TariffConfigureSettingLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffConfigureSettingLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffConfigureSettingLink createFromParcel(Parcel parcel) {
            return new TariffConfigureSettingLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TariffConfigureSettingLink[] newArray(int i12) {
            return new TariffConfigureSettingLink[i12];
        }
    }

    public TariffConfigureSettingLink(@l String str) {
        this.f300042b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f300042b);
    }
}
