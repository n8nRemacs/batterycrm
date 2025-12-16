package com.avito.android.tariff_cpt.level_feature.domain;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.tariff_cpt.level_feature.deeplink.TariffCptLevelFeatureLink;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCptLevelFeatureContent.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/level_feature/domain/TariffCptLevelFeatureContent;", "Lcom/avito/android/util/OpenParams;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TariffCptLevelFeatureContent implements OpenParams {

    @k
    public static final Parcelable.Creator<TariffCptLevelFeatureContent> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TariffCptLevelFeatureLink.Body f298470b;

    /* compiled from: TariffCptLevelFeatureContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCptLevelFeatureContent> {
        @Override // android.os.Parcelable.Creator
        public final TariffCptLevelFeatureContent createFromParcel(Parcel parcel) {
            return new TariffCptLevelFeatureContent(TariffCptLevelFeatureLink.Body.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCptLevelFeatureContent[] newArray(int i12) {
            return new TariffCptLevelFeatureContent[i12];
        }
    }

    public TariffCptLevelFeatureContent(@k TariffCptLevelFeatureLink.Body body) {
        this.f298470b = body;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TariffCptLevelFeatureContent) && L.f(this.f298470b, ((TariffCptLevelFeatureContent) obj).f298470b);
    }

    public final int hashCode() {
        return this.f298470b.hashCode();
    }

    @k
    public final String toString() {
        return "TariffCptLevelFeatureContent(body=" + this.f298470b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f298470b.writeToParcel(parcel, i12);
    }
}
