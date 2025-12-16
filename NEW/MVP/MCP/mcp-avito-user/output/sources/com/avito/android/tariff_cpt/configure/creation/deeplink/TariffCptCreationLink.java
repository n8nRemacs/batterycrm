package com.avito.android.tariff_cpt.configure.creation.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: TariffCptCreationLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/creation/deeplink/TariffCptCreationLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "c", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TariffCptCreationLink extends DeepLink {

    @k
    public static final Parcelable.Creator<TariffCptCreationLink> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f297564b;

    /* compiled from: TariffCptCreationLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/creation/deeplink/TariffCptCreationLink$a;", "", "<init>", "()V", "", "KEY_SHOW_BUTTON_PROGRESS", "Ljava/lang/String;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TariffCptCreationLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<TariffCptCreationLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCptCreationLink createFromParcel(Parcel parcel) {
            return new TariffCptCreationLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCptCreationLink[] newArray(int i12) {
            return new TariffCptCreationLink[i12];
        }
    }

    /* compiled from: TariffCptCreationLink.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/creation/deeplink/TariffCptCreationLink$c;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/tariff_cpt/configure/creation/deeplink/TariffCptCreationLink$c$a;", "Lcom/avito/android/tariff_cpt/configure/creation/deeplink/TariffCptCreationLink$c$b;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c {

        /* compiled from: TariffCptCreationLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/creation/deeplink/TariffCptCreationLink$c$a;", "Lcom/avito/android/tariff_cpt/configure/creation/deeplink/TariffCptCreationLink$c;", "LJu/c$b;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends c implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f297565b;

            public a(@k String str) {
                super(null);
                this.f297565b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f297565b, ((a) obj).f297565b);
            }

            public final int hashCode() {
                return this.f297565b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Failure(message="), this.f297565b, ')');
            }
        }

        /* compiled from: TariffCptCreationLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/creation/deeplink/TariffCptCreationLink$c$b;", "Lcom/avito/android/tariff_cpt/configure/creation/deeplink/TariffCptCreationLink$c;", "LJu/c$a;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends c implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final b f297566b = new b();

            public b() {
                super(null);
            }
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public TariffCptCreationLink(@k String str) {
        this.f297564b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f297564b);
    }
}
