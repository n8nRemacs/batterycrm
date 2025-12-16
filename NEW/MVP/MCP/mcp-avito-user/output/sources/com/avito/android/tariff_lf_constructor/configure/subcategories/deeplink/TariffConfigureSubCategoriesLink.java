package com.avito.android.tariff_lf_constructor.configure.subcategories.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.tariff_lf_constructor.configure.deeplink.ConstructorTariffBottomSheetLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: TariffConfigureSubCategoriesLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/subcategories/deeplink/TariffConfigureSubCategoriesLink;", "Lcom/avito/android/tariff_lf_constructor/configure/deeplink/ConstructorTariffBottomSheetLink;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TariffConfigureSubCategoriesLink extends ConstructorTariffBottomSheetLink {

    @k
    public static final Parcelable.Creator<TariffConfigureSubCategoriesLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f300438b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f300439c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f300440d;

    /* compiled from: TariffConfigureSubCategoriesLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffConfigureSubCategoriesLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffConfigureSubCategoriesLink createFromParcel(Parcel parcel) {
            return new TariffConfigureSubCategoriesLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TariffConfigureSubCategoriesLink[] newArray(int i12) {
            return new TariffConfigureSubCategoriesLink[i12];
        }
    }

    public TariffConfigureSubCategoriesLink(@k String str, @k String str2, @k String str3) {
        this.f300438b = str;
        this.f300439c = str2;
        this.f300440d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f300438b);
        parcel.writeString(this.f300439c);
        parcel.writeString(this.f300440d);
    }
}
