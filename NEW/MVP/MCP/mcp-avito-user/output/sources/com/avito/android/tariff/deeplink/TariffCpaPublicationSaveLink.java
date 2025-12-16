package com.avito.android.tariff.deeplink;

import Ju.InterfaceC14249c;
import K51.d;
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
import y50.InterfaceC50065a;

/* compiled from: TariffCpaPublicationSaveLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/deeplink/TariffCpaPublicationSaveLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TariffCpaPublicationSaveLink extends DeepLink {

    @k
    public static final Parcelable.Creator<TariffCpaPublicationSaveLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f297375b;

    /* compiled from: TariffCpaPublicationSaveLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCpaPublicationSaveLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCpaPublicationSaveLink createFromParcel(Parcel parcel) {
            return new TariffCpaPublicationSaveLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCpaPublicationSaveLink[] newArray(int i12) {
            return new TariffCpaPublicationSaveLink[i12];
        }
    }

    /* compiled from: TariffCpaPublicationSaveLink.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/tariff/deeplink/TariffCpaPublicationSaveLink$b;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/tariff/deeplink/TariffCpaPublicationSaveLink$b$a;", "Lcom/avito/android/tariff/deeplink/TariffCpaPublicationSaveLink$b$b;", "Lcom/avito/android/tariff/deeplink/TariffCpaPublicationSaveLink$b$c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: TariffCpaPublicationSaveLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/deeplink/TariffCpaPublicationSaveLink$b$a;", "Lcom/avito/android/tariff/deeplink/TariffCpaPublicationSaveLink$b;", "LJu/c$b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiError f297376b;

            public a(@k ApiError apiError) {
                super(null);
                this.f297376b = apiError;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f297376b, ((a) obj).f297376b);
            }

            public final int hashCode() {
                return this.f297376b.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.n(new StringBuilder("Failure(error="), this.f297376b, ')');
            }
        }

        /* compiled from: TariffCpaPublicationSaveLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/deeplink/TariffCpaPublicationSaveLink$b$b;", "Lcom/avito/android/tariff/deeplink/TariffCpaPublicationSaveLink$b;", "Ly50/a;", "LJu/c$a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.tariff.deeplink.TariffCpaPublicationSaveLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C9076b extends b implements InterfaceC50065a, InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final DeepLink f297377b;

            public C9076b(@k DeepLink deepLink) {
                super(null);
                this.f297377b = deepLink;
            }

            @Override // y50.InterfaceC50065a
            @k
            /* renamed from: a, reason: from getter */
            public final DeepLink getF297377b() {
                return this.f297377b;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9076b) && L.f(this.f297377b, ((C9076b) obj).f297377b);
            }

            public final int hashCode() {
                return this.f297377b.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("PaymentRequired(successFinishFlowUri="), this.f297377b, ')');
            }
        }

        /* compiled from: TariffCpaPublicationSaveLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/deeplink/TariffCpaPublicationSaveLink$b$c;", "Lcom/avito/android/tariff/deeplink/TariffCpaPublicationSaveLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends b implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final c f297378b = new c();

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

    public TariffCpaPublicationSaveLink(@k String str) {
        this.f297375b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f297375b);
    }
}
