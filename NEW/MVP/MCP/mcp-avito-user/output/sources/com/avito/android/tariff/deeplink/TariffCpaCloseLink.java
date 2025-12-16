package com.avito.android.tariff.deeplink;

import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: TariffCpaCloseLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/deeplink/TariffCpaCloseLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "b", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TariffCpaCloseLink extends DeepLink {

    @k
    public static final Parcelable.Creator<TariffCpaCloseLink> CREATOR = new a();

    /* compiled from: TariffCpaCloseLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCpaCloseLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCpaCloseLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new TariffCpaCloseLink();
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCpaCloseLink[] newArray(int i12) {
            return new TariffCpaCloseLink[i12];
        }
    }

    /* compiled from: TariffCpaCloseLink.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/tariff/deeplink/TariffCpaCloseLink$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/tariff/deeplink/TariffCpaCloseLink$b$a;", "Lcom/avito/android/tariff/deeplink/TariffCpaCloseLink$b$b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: TariffCpaCloseLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/deeplink/TariffCpaCloseLink$b$a;", "Lcom/avito/android/tariff/deeplink/TariffCpaCloseLink$b;", "LJu/a$a;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b implements InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f297367b = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: TariffCpaCloseLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/deeplink/TariffCpaCloseLink$b$b;", "Lcom/avito/android/tariff/deeplink/TariffCpaCloseLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.tariff.deeplink.TariffCpaCloseLink$b$b, reason: collision with other inner class name */
        public static final class C9074b extends b implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C9074b f297368b = new C9074b();

            public C9074b() {
                super(null);
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
