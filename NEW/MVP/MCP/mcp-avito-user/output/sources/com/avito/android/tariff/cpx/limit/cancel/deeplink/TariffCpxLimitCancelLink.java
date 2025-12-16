package com.avito.android.tariff.cpx.limit.cancel.deeplink;

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

/* compiled from: TariffCpxLimitCancelLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/cancel/deeplink/TariffCpxLimitCancelLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "b", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TariffCpxLimitCancelLink extends DeepLink {

    @k
    public static final Parcelable.Creator<TariffCpxLimitCancelLink> CREATOR = new a();

    /* compiled from: TariffCpxLimitCancelLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCpxLimitCancelLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCpxLimitCancelLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new TariffCpxLimitCancelLink();
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCpxLimitCancelLink[] newArray(int i12) {
            return new TariffCpxLimitCancelLink[i12];
        }
    }

    /* compiled from: TariffCpxLimitCancelLink.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/cancel/deeplink/TariffCpxLimitCancelLink$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/tariff/cpx/limit/cancel/deeplink/TariffCpxLimitCancelLink$b$a;", "Lcom/avito/android/tariff/cpx/limit/cancel/deeplink/TariffCpxLimitCancelLink$b$b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: TariffCpxLimitCancelLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/cancel/deeplink/TariffCpxLimitCancelLink$b$a;", "Lcom/avito/android/tariff/cpx/limit/cancel/deeplink/TariffCpxLimitCancelLink$b;", "LJu/c$b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiError f297186b;

            public a(@k ApiError apiError) {
                super(null);
                this.f297186b = apiError;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f297186b, ((a) obj).f297186b);
            }

            public final int hashCode() {
                return this.f297186b.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.n(new StringBuilder("Failure(error="), this.f297186b, ')');
            }
        }

        /* compiled from: TariffCpxLimitCancelLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/cancel/deeplink/TariffCpxLimitCancelLink$b$b;", "Lcom/avito/android/tariff/cpx/limit/cancel/deeplink/TariffCpxLimitCancelLink$b;", "LJu/c$b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.tariff.cpx.limit.cancel.deeplink.TariffCpxLimitCancelLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C9061b extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final DeepLink f297187b;

            public C9061b(@k DeepLink deepLink) {
                super(null);
                this.f297187b = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9061b) && L.f(this.f297187b, ((C9061b) obj).f297187b);
            }

            public final int hashCode() {
                return this.f297187b.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("Success(deeplink="), this.f297187b, ')');
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
