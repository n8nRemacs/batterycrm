package com.avito.android.cpt;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: TariffCptLevelsLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpt/TariffCptLevelsLinkV3;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_tariff-cpt_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class TariffCptLevelsLinkV3 extends DeepLink {

    @k
    public static final Parcelable.Creator<TariffCptLevelsLinkV3> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f126195b;

    /* compiled from: TariffCptLevelsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCptLevelsLinkV3> {
        @Override // android.os.Parcelable.Creator
        public final TariffCptLevelsLinkV3 createFromParcel(Parcel parcel) {
            return new TariffCptLevelsLinkV3(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCptLevelsLinkV3[] newArray(int i12) {
            return new TariffCptLevelsLinkV3[i12];
        }
    }

    /* compiled from: TariffCptLevelsLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/cpt/TariffCptLevelsLinkV3$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/cpt/TariffCptLevelsLinkV3$b$a;", "Lcom/avito/android/cpt/TariffCptLevelsLinkV3$b$b;", "_avito_tariff-cpt_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: TariffCptLevelsLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cpt/TariffCptLevelsLinkV3$b$a;", "Lcom/avito/android/cpt/TariffCptLevelsLinkV3$b;", "LJu/c$b;", "<init>", "()V", "_avito_tariff-cpt_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f126196b = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: TariffCptLevelsLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cpt/TariffCptLevelsLinkV3$b$b;", "Lcom/avito/android/cpt/TariffCptLevelsLinkV3$b;", "LJu/c$a;", "<init>", "()V", "_avito_tariff-cpt_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.cpt.TariffCptLevelsLinkV3$b$b, reason: collision with other inner class name */
        public static final class C3750b extends b implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C3750b f126197b = new C3750b();

            public C3750b() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public TariffCptLevelsLinkV3(@k String str) {
        this.f126195b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TariffCptLevelsLinkV3) && L.f(this.f126195b, ((TariffCptLevelsLinkV3) obj).f126195b);
    }

    public final int hashCode() {
        return this.f126195b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("TariffCptLevelsLinkV3(remoteContext="), this.f126195b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f126195b);
    }
}
