package com.avito.android.tariff.cpx.level.feature.domain;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.tariff.deeplink.TariffCpxLevelFeatureBody;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxLevelFeatureParams.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/level/feature/domain/TariffCpxLevelFeatureContent;", "Lcom/avito/android/util/OpenParams;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TariffCpxLevelFeatureContent implements OpenParams {

    @k
    public static final Parcelable.Creator<TariffCpxLevelFeatureContent> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TariffCpxLevelFeatureBody f296972b;

    /* compiled from: TariffCpxLevelFeatureParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCpxLevelFeatureContent> {
        @Override // android.os.Parcelable.Creator
        public final TariffCpxLevelFeatureContent createFromParcel(Parcel parcel) {
            return new TariffCpxLevelFeatureContent(TariffCpxLevelFeatureBody.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCpxLevelFeatureContent[] newArray(int i12) {
            return new TariffCpxLevelFeatureContent[i12];
        }
    }

    public TariffCpxLevelFeatureContent(@k TariffCpxLevelFeatureBody tariffCpxLevelFeatureBody) {
        this.f296972b = tariffCpxLevelFeatureBody;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TariffCpxLevelFeatureContent) && L.f(this.f296972b, ((TariffCpxLevelFeatureContent) obj).f296972b);
    }

    public final int hashCode() {
        return this.f296972b.hashCode();
    }

    @k
    public final String toString() {
        return "TariffCpxLevelFeatureContent(body=" + this.f296972b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f296972b.writeToParcel(parcel, i12);
    }
}
