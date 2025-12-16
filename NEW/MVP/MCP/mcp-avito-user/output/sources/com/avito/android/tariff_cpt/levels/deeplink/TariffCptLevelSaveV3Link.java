package com.avito.android.tariff_cpt.levels.deeplink;

import Ju.InterfaceC14249c;
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
import y50.InterfaceC50065a;

/* compiled from: TariffCptLevelSaveLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/levels/deeplink/TariffCptLevelSaveV3Link;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final /* data */ class TariffCptLevelSaveV3Link extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<TariffCptLevelSaveV3Link> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f298541b;

    /* compiled from: TariffCptLevelSaveLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCptLevelSaveV3Link> {
        @Override // android.os.Parcelable.Creator
        public final TariffCptLevelSaveV3Link createFromParcel(Parcel parcel) {
            return new TariffCptLevelSaveV3Link(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCptLevelSaveV3Link[] newArray(int i12) {
            return new TariffCptLevelSaveV3Link[i12];
        }
    }

    /* compiled from: TariffCptLevelSaveLink.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/tariff_cpt/levels/deeplink/TariffCptLevelSaveV3Link$b;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/tariff_cpt/levels/deeplink/TariffCptLevelSaveV3Link$b$a;", "Lcom/avito/android/tariff_cpt/levels/deeplink/TariffCptLevelSaveV3Link$b$b;", "Lcom/avito/android/tariff_cpt/levels/deeplink/TariffCptLevelSaveV3Link$b$c;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: TariffCptLevelSaveLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/levels/deeplink/TariffCptLevelSaveV3Link$b$a;", "Lcom/avito/android/tariff_cpt/levels/deeplink/TariffCptLevelSaveV3Link$b;", "LJu/c$b;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f298542b;

            public a(@Y61.k String str) {
                super(null);
                this.f298542b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f298542b, ((a) obj).f298542b);
            }

            public final int hashCode() {
                return this.f298542b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Failure(message="), this.f298542b, ')');
            }
        }

        /* compiled from: TariffCptLevelSaveLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/levels/deeplink/TariffCptLevelSaveV3Link$b$b;", "Lcom/avito/android/tariff_cpt/levels/deeplink/TariffCptLevelSaveV3Link$b;", "Ly50/a;", "LJu/c$a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.tariff_cpt.levels.deeplink.TariffCptLevelSaveV3Link$b$b, reason: collision with other inner class name */
        public static final /* data */ class C9126b extends b implements InterfaceC50065a, InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final DeepLink f298543b;

            public C9126b(@Y61.k DeepLink deepLink) {
                super(null);
                this.f298543b = deepLink;
            }

            @Override // y50.InterfaceC50065a
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final DeepLink getF298543b() {
                return this.f298543b;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9126b) && L.f(this.f298543b, ((C9126b) obj).f298543b);
            }

            public final int hashCode() {
                return this.f298543b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("PaymentRequired(successFinishFlowUri="), this.f298543b, ')');
            }
        }

        /* compiled from: TariffCptLevelSaveLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/levels/deeplink/TariffCptLevelSaveV3Link$b$c;", "Lcom/avito/android/tariff_cpt/levels/deeplink/TariffCptLevelSaveV3Link$b;", "LJu/c$b;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final DeepLink f298544b;

            public c(@Y61.k DeepLink deepLink) {
                super(null);
                this.f298544b = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f298544b, ((c) obj).f298544b);
            }

            public final int hashCode() {
                return this.f298544b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("Success(deeplink="), this.f298544b, ')');
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public TariffCptLevelSaveV3Link(@Y61.k String str) {
        this.f298541b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TariffCptLevelSaveV3Link) && L.f(this.f298541b, ((TariffCptLevelSaveV3Link) obj).f298541b);
    }

    public final int hashCode() {
        return this.f298541b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("TariffCptLevelSaveV3Link(remoteContext="), this.f298541b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f298541b);
    }
}
