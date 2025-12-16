package com.avito.android.tariff_cpt.info.deeplink;

import Ju.InterfaceC14249c;
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

/* compiled from: TariffCptInfoRefreshLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/info/deeplink/TariffCptInfoRefreshLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final /* data */ class TariffCptInfoRefreshLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<TariffCptInfoRefreshLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f298144b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f298145c;

    /* compiled from: TariffCptInfoRefreshLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCptInfoRefreshLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCptInfoRefreshLink createFromParcel(Parcel parcel) {
            return new TariffCptInfoRefreshLink(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCptInfoRefreshLink[] newArray(int i12) {
            return new TariffCptInfoRefreshLink[i12];
        }
    }

    /* compiled from: TariffCptInfoRefreshLink.kt */
    @P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_cpt/info/deeplink/TariffCptInfoRefreshLink$b;", "LJu/c$b;", "<init>", "()V", "a", "Lcom/avito/android/tariff_cpt/info/deeplink/TariffCptInfoRefreshLink$b$a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: TariffCptInfoRefreshLink.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/info/deeplink/TariffCptInfoRefreshLink$b$a;", "Lcom/avito/android/tariff_cpt/info/deeplink/TariffCptInfoRefreshLink$b;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f298146b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final Integer f298147c;

            public a(@Y61.k String str, @Y61.l Integer num) {
                super(null);
                this.f298146b = str;
                this.f298147c = num;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f298146b, aVar.f298146b) && L.f(this.f298147c, aVar.f298147c);
            }

            public final int hashCode() {
                int iHashCode = this.f298146b.hashCode() * 31;
                Integer num = this.f298147c;
                return iHashCode + (num == null ? 0 : num.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Success(remoteContext=");
                sb2.append(this.f298146b);
                sb2.append(", timeout=");
                return s.j(sb2, this.f298147c, ')');
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public TariffCptInfoRefreshLink(@Y61.k String str, @Y61.l Integer num) {
        this.f298144b = str;
        this.f298145c = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TariffCptInfoRefreshLink)) {
            return false;
        }
        TariffCptInfoRefreshLink tariffCptInfoRefreshLink = (TariffCptInfoRefreshLink) obj;
        return L.f(this.f298144b, tariffCptInfoRefreshLink.f298144b) && L.f(this.f298145c, tariffCptInfoRefreshLink.f298145c);
    }

    public final int hashCode() {
        int iHashCode = this.f298144b.hashCode() * 31;
        Integer num = this.f298145c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCptInfoRefreshLink(remoteContext=");
        sb2.append(this.f298144b);
        sb2.append(", timeout=");
        return s.j(sb2, this.f298145c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f298144b);
        Integer num = this.f298145c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}
