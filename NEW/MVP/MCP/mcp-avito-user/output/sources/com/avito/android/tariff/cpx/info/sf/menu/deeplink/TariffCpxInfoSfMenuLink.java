package com.avito.android.tariff.cpx.info.sf.menu.deeplink;

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

/* compiled from: TariffCpxInfoSfMenuLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/info/sf/menu/deeplink/TariffCpxInfoSfMenuLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TariffCpxInfoSfMenuLink extends DeepLink {

    @k
    public static final Parcelable.Creator<TariffCpxInfoSfMenuLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TariffCpxInfoSfMenuLinkBody f296774b;

    /* compiled from: TariffCpxInfoSfMenuLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCpxInfoSfMenuLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCpxInfoSfMenuLink createFromParcel(Parcel parcel) {
            return new TariffCpxInfoSfMenuLink(TariffCpxInfoSfMenuLinkBody.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCpxInfoSfMenuLink[] newArray(int i12) {
            return new TariffCpxInfoSfMenuLink[i12];
        }
    }

    /* compiled from: TariffCpxInfoSfMenuLink.kt */
    @P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/info/sf/menu/deeplink/TariffCpxInfoSfMenuLink$b;", "", "<init>", "()V", "a", "Lcom/avito/android/tariff/cpx/info/sf/menu/deeplink/TariffCpxInfoSfMenuLink$b$a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: TariffCpxInfoSfMenuLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpx/info/sf/menu/deeplink/TariffCpxInfoSfMenuLink$b$a;", "Lcom/avito/android/tariff/cpx/info/sf/menu/deeplink/TariffCpxInfoSfMenuLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b implements InterfaceC14249c.a {
            static {
                new a();
            }

            public a() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public TariffCpxInfoSfMenuLink(@k TariffCpxInfoSfMenuLinkBody tariffCpxInfoSfMenuLinkBody) {
        this.f296774b = tariffCpxInfoSfMenuLinkBody;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f296774b.writeToParcel(parcel, i12);
    }
}
