package com.avito.android.tariff.cpr.configure.deeplink;

import Ju.InterfaceC14249c;
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
import y50.InterfaceC50065a;

/* compiled from: TariffCprConfigureSaveLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/deeplink/TariffCprConfigureSaveLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TariffCprConfigureSaveLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<TariffCprConfigureSaveLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f295497b;

    /* compiled from: TariffCprConfigureSaveLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCprConfigureSaveLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCprConfigureSaveLink createFromParcel(Parcel parcel) {
            return new TariffCprConfigureSaveLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCprConfigureSaveLink[] newArray(int i12) {
            return new TariffCprConfigureSaveLink[i12];
        }
    }

    /* compiled from: TariffCprConfigureSaveLink.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/deeplink/TariffCprConfigureSaveLink$b;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/tariff/cpr/configure/deeplink/TariffCprConfigureSaveLink$b$a;", "Lcom/avito/android/tariff/cpr/configure/deeplink/TariffCprConfigureSaveLink$b$b;", "Lcom/avito/android/tariff/cpr/configure/deeplink/TariffCprConfigureSaveLink$b$c;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: TariffCprConfigureSaveLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/deeplink/TariffCprConfigureSaveLink$b$a;", "Lcom/avito/android/tariff/cpr/configure/deeplink/TariffCprConfigureSaveLink$b;", "LJu/c$b;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final ApiError f295498b;

            public a(@Y61.k ApiError apiError) {
                super(null);
                this.f295498b = apiError;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f295498b, ((a) obj).f295498b);
            }

            public final int hashCode() {
                return this.f295498b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return AK.c.n(new StringBuilder("Failure(error="), this.f295498b, ')');
            }
        }

        /* compiled from: TariffCprConfigureSaveLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/deeplink/TariffCprConfigureSaveLink$b$b;", "Lcom/avito/android/tariff/cpr/configure/deeplink/TariffCprConfigureSaveLink$b;", "Ly50/a;", "LJu/c$a;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.tariff.cpr.configure.deeplink.TariffCprConfigureSaveLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C8988b extends b implements InterfaceC50065a, InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final DeepLink f295499b;

            public C8988b(@Y61.k DeepLink deepLink) {
                super(null);
                this.f295499b = deepLink;
            }

            @Override // y50.InterfaceC50065a
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final DeepLink getF297391b() {
                return this.f295499b;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C8988b) && L.f(this.f295499b, ((C8988b) obj).f295499b);
            }

            public final int hashCode() {
                return this.f295499b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("PaymentRequired(successFinishFlowUri="), this.f295499b, ')');
            }
        }

        /* compiled from: TariffCprConfigureSaveLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/deeplink/TariffCprConfigureSaveLink$b$c;", "Lcom/avito/android/tariff/cpr/configure/deeplink/TariffCprConfigureSaveLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends b implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final c f295500b = new c();

            public c() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public TariffCprConfigureSaveLink(@Y61.k String str) {
        this.f295497b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f295497b);
    }
}
