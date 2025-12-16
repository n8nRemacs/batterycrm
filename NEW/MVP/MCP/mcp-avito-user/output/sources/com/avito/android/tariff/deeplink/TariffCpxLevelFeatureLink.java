package com.avito.android.tariff.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: TariffCpxLevelFeatureLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/deeplink/TariffCpxLevelFeatureLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final /* data */ class TariffCpxLevelFeatureLink extends DeepLink {

    @k
    public static final Parcelable.Creator<TariffCpxLevelFeatureLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TariffCpxLevelFeatureBody f297388b;

    /* compiled from: TariffCpxLevelFeatureLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCpxLevelFeatureLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCpxLevelFeatureLink createFromParcel(Parcel parcel) {
            return new TariffCpxLevelFeatureLink(TariffCpxLevelFeatureBody.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCpxLevelFeatureLink[] newArray(int i12) {
            return new TariffCpxLevelFeatureLink[i12];
        }
    }

    public TariffCpxLevelFeatureLink(@k TariffCpxLevelFeatureBody tariffCpxLevelFeatureBody) {
        this.f297388b = tariffCpxLevelFeatureBody;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TariffCpxLevelFeatureLink) && L.f(this.f297388b, ((TariffCpxLevelFeatureLink) obj).f297388b);
    }

    public final int hashCode() {
        return this.f297388b.hashCode();
    }

    @k
    public final String toString() {
        return "TariffCpxLevelFeatureLink(body=" + this.f297388b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f297388b.writeToParcel(parcel, i12);
    }
}
