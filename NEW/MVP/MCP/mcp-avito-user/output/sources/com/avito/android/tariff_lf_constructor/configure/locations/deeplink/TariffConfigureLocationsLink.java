package com.avito.android.tariff_lf_constructor.configure.locations.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.tariff_lf_constructor.configure.deeplink.ConstructorTariffBottomSheetLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: TariffConfigureLocationsLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/locations/deeplink/TariffConfigureLocationsLink;", "Lcom/avito/android/tariff_lf_constructor/configure/deeplink/ConstructorTariffBottomSheetLink;", "a", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TariffConfigureLocationsLink extends ConstructorTariffBottomSheetLink {

    @k
    public static final Parcelable.Creator<TariffConfigureLocationsLink> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f299877b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f299878c;

    /* compiled from: TariffConfigureLocationsLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/locations/deeplink/TariffConfigureLocationsLink$a;", "", "<init>", "()V", "", "UPDATED_CONFIGURE_CONTEXT_KEY", "Ljava/lang/String;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TariffConfigureLocationsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<TariffConfigureLocationsLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffConfigureLocationsLink createFromParcel(Parcel parcel) {
            return new TariffConfigureLocationsLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TariffConfigureLocationsLink[] newArray(int i12) {
            return new TariffConfigureLocationsLink[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public TariffConfigureLocationsLink(@k String str, @k String str2) {
        this.f299877b = str;
        this.f299878c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f299877b);
        parcel.writeString(this.f299878c);
    }
}
