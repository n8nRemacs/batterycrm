package com.avito.android.tariff.deeplink;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: TariffCpxInfoRefreshLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/deeplink/TariffCpxInfoRefreshLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TariffCpxInfoRefreshLink extends DeepLink {

    @k
    public static final Parcelable.Creator<TariffCpxInfoRefreshLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f297385b;

    /* compiled from: TariffCpxInfoRefreshLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCpxInfoRefreshLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCpxInfoRefreshLink createFromParcel(Parcel parcel) {
            return new TariffCpxInfoRefreshLink(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCpxInfoRefreshLink[] newArray(int i12) {
            return new TariffCpxInfoRefreshLink[i12];
        }
    }

    /* compiled from: TariffCpxInfoRefreshLink.kt */
    @P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/deeplink/TariffCpxInfoRefreshLink$b;", "LJu/c$b;", "<init>", "()V", "a", "Lcom/avito/android/tariff/deeplink/TariffCpxInfoRefreshLink$b$a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: TariffCpxInfoRefreshLink.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/deeplink/TariffCpxInfoRefreshLink$b$a;", "Lcom/avito/android/tariff/deeplink/TariffCpxInfoRefreshLink$b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Integer f297386b;

            public a(@l Integer num) {
                super(null);
                this.f297386b = num;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f297386b, ((a) obj).f297386b);
            }

            public final int hashCode() {
                Integer num = this.f297386b;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            @k
            public final String toString() {
                return s.j(new StringBuilder("Success(timeout="), this.f297386b, ')');
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public TariffCpxInfoRefreshLink(@l Integer num) {
        this.f297385b = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Integer num = this.f297385b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}
