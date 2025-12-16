package com.avito.android.tariff_cpt.configure.migration.deeplink;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: TariffCptMigrationLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/migration/deeplink/TariffCptMigrationLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TariffCptMigrationLink extends DeepLink {

    @k
    public static final Parcelable.Creator<TariffCptMigrationLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f298016b;

    /* compiled from: TariffCptMigrationLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCptMigrationLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCptMigrationLink createFromParcel(Parcel parcel) {
            return new TariffCptMigrationLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCptMigrationLink[] newArray(int i12) {
            return new TariffCptMigrationLink[i12];
        }
    }

    public TariffCptMigrationLink(@l String str) {
        this.f298016b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f298016b);
    }
}
