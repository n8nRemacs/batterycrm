package com.avito.android.tariff_lf_constructor.configure.category.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.tariff_lf_constructor.configure.deeplink.ConstructorTariffBottomSheetLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: TariffConfigureCategoryLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/category/deeplink/TariffConfigureCategoryLink;", "Lcom/avito/android/tariff_lf_constructor/configure/deeplink/ConstructorTariffBottomSheetLink;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TariffConfigureCategoryLink extends ConstructorTariffBottomSheetLink {

    @k
    public static final Parcelable.Creator<TariffConfigureCategoryLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f299356b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f299357c;

    /* compiled from: TariffConfigureCategoryLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffConfigureCategoryLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffConfigureCategoryLink createFromParcel(Parcel parcel) {
            return new TariffConfigureCategoryLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TariffConfigureCategoryLink[] newArray(int i12) {
            return new TariffConfigureCategoryLink[i12];
        }
    }

    public TariffConfigureCategoryLink(@k String str, @k String str2) {
        this.f299356b = str;
        this.f299357c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f299356b);
        parcel.writeString(this.f299357c);
    }
}
