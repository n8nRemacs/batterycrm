package com.avito.android.tariff.cpx.configure.advance.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: TariffCpxConfigureAdvanceSaveDeepLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/deeplink/TariffCpxConfigureAdvanceSaveDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TariffCpxConfigureAdvanceSaveDeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<TariffCpxConfigureAdvanceSaveDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f295562b;

    /* compiled from: TariffCpxConfigureAdvanceSaveDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCpxConfigureAdvanceSaveDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCpxConfigureAdvanceSaveDeepLink createFromParcel(Parcel parcel) {
            return new TariffCpxConfigureAdvanceSaveDeepLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCpxConfigureAdvanceSaveDeepLink[] newArray(int i12) {
            return new TariffCpxConfigureAdvanceSaveDeepLink[i12];
        }
    }

    /* compiled from: TariffCpxConfigureAdvanceSaveDeepLink.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/deeplink/TariffCpxConfigureAdvanceSaveDeepLink$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/tariff/cpx/configure/advance/deeplink/TariffCpxConfigureAdvanceSaveDeepLink$b$a;", "Lcom/avito/android/tariff/cpx/configure/advance/deeplink/TariffCpxConfigureAdvanceSaveDeepLink$b$b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: TariffCpxConfigureAdvanceSaveDeepLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/deeplink/TariffCpxConfigureAdvanceSaveDeepLink$b$a;", "Lcom/avito/android/tariff/cpx/configure/advance/deeplink/TariffCpxConfigureAdvanceSaveDeepLink$b;", "LJu/c$b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiError f295563b;

            public a(@k ApiError apiError) {
                super(null);
                this.f295563b = apiError;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f295563b, ((a) obj).f295563b);
            }

            public final int hashCode() {
                return this.f295563b.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.n(new StringBuilder("Failure(error="), this.f295563b, ')');
            }
        }

        /* compiled from: TariffCpxConfigureAdvanceSaveDeepLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/deeplink/TariffCpxConfigureAdvanceSaveDeepLink$b$b;", "Lcom/avito/android/tariff/cpx/configure/advance/deeplink/TariffCpxConfigureAdvanceSaveDeepLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.tariff.cpx.configure.advance.deeplink.TariffCpxConfigureAdvanceSaveDeepLink$b$b, reason: collision with other inner class name */
        public static final class C8991b extends b implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C8991b f295564b = new C8991b();

            public C8991b() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public TariffCpxConfigureAdvanceSaveDeepLink(@k String str) {
        this.f295562b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f295562b);
    }
}
