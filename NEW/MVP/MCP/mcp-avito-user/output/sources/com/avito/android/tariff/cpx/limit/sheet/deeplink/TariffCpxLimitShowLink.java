package com.avito.android.tariff.cpx.limit.sheet.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: TariffCpxLimitShowLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/deeplink/TariffCpxLimitShowLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TariffCpxLimitShowLink extends DeepLink {

    @k
    public static final Parcelable.Creator<TariffCpxLimitShowLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TariffCpxLimitBody f297263b;

    /* compiled from: TariffCpxLimitShowLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCpxLimitShowLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCpxLimitShowLink createFromParcel(Parcel parcel) {
            return new TariffCpxLimitShowLink(TariffCpxLimitBody.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCpxLimitShowLink[] newArray(int i12) {
            return new TariffCpxLimitShowLink[i12];
        }
    }

    /* compiled from: TariffCpxLimitShowLink.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/deeplink/TariffCpxLimitShowLink$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/tariff/cpx/limit/sheet/deeplink/TariffCpxLimitShowLink$b$a;", "Lcom/avito/android/tariff/cpx/limit/sheet/deeplink/TariffCpxLimitShowLink$b$b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: TariffCpxLimitShowLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/deeplink/TariffCpxLimitShowLink$b$a;", "Lcom/avito/android/tariff/cpx/limit/sheet/deeplink/TariffCpxLimitShowLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f297264b = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: TariffCpxLimitShowLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/deeplink/TariffCpxLimitShowLink$b$b;", "Lcom/avito/android/tariff/cpx/limit/sheet/deeplink/TariffCpxLimitShowLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.tariff.cpx.limit.sheet.deeplink.TariffCpxLimitShowLink$b$b, reason: collision with other inner class name */
        public static final class C9066b extends b implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C9066b f297265b = new C9066b();

            public C9066b() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public TariffCpxLimitShowLink(@k TariffCpxLimitBody tariffCpxLimitBody) {
        this.f297263b = tariffCpxLimitBody;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f297263b.writeToParcel(parcel, i12);
    }
}
