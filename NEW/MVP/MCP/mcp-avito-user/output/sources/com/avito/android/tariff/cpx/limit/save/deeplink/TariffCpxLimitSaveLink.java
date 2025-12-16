package com.avito.android.tariff.cpx.limit.save.deeplink;

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

/* compiled from: TariffCpxLimitSaveLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/save/deeplink/TariffCpxLimitSaveLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "b", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TariffCpxLimitSaveLink extends DeepLink {

    @k
    public static final Parcelable.Creator<TariffCpxLimitSaveLink> CREATOR = new a();

    /* compiled from: TariffCpxLimitSaveLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCpxLimitSaveLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCpxLimitSaveLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new TariffCpxLimitSaveLink();
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCpxLimitSaveLink[] newArray(int i12) {
            return new TariffCpxLimitSaveLink[i12];
        }
    }

    /* compiled from: TariffCpxLimitSaveLink.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/save/deeplink/TariffCpxLimitSaveLink$b;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/tariff/cpx/limit/save/deeplink/TariffCpxLimitSaveLink$b$a;", "Lcom/avito/android/tariff/cpx/limit/save/deeplink/TariffCpxLimitSaveLink$b$b;", "Lcom/avito/android/tariff/cpx/limit/save/deeplink/TariffCpxLimitSaveLink$b$c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: TariffCpxLimitSaveLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/save/deeplink/TariffCpxLimitSaveLink$b$a;", "Lcom/avito/android/tariff/cpx/limit/save/deeplink/TariffCpxLimitSaveLink$b;", "LJu/c$b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiError f297204b;

            public a(@k ApiError apiError) {
                super(null);
                this.f297204b = apiError;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f297204b, ((a) obj).f297204b);
            }

            public final int hashCode() {
                return this.f297204b.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.n(new StringBuilder("Failure(error="), this.f297204b, ')');
            }
        }

        /* compiled from: TariffCpxLimitSaveLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/save/deeplink/TariffCpxLimitSaveLink$b$b;", "Lcom/avito/android/tariff/cpx/limit/save/deeplink/TariffCpxLimitSaveLink$b;", "LJu/c$b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.tariff.cpx.limit.save.deeplink.TariffCpxLimitSaveLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C9062b extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final DeepLink f297205b;

            public C9062b(@k DeepLink deepLink) {
                super(null);
                this.f297205b = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9062b) && L.f(this.f297205b, ((C9062b) obj).f297205b);
            }

            public final int hashCode() {
                return this.f297205b.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("SuccessChange(deeplink="), this.f297205b, ')');
            }
        }

        /* compiled from: TariffCpxLimitSaveLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/save/deeplink/TariffCpxLimitSaveLink$b$c;", "Lcom/avito/android/tariff/cpx/limit/save/deeplink/TariffCpxLimitSaveLink$b;", "LJu/c$b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final DeepLink f297206b;

            public c(@k DeepLink deepLink) {
                super(null);
                this.f297206b = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f297206b, ((c) obj).f297206b);
            }

            public final int hashCode() {
                return this.f297206b.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("SuccessSave(deeplink="), this.f297206b, ')');
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
