package com.avito.android.tariff.cpx.limit.sheet.domain;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.tariff.cpx.limit.sheet.deeplink.TariffCpxLimitBody;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxLimitParams.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/domain/TariffCpxLimitContent;", "Lcom/avito/android/util/OpenParams;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TariffCpxLimitContent implements OpenParams {

    @k
    public static final Parcelable.Creator<TariffCpxLimitContent> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TariffCpxLimitBody f297293b;

    /* compiled from: TariffCpxLimitParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCpxLimitContent> {
        @Override // android.os.Parcelable.Creator
        public final TariffCpxLimitContent createFromParcel(Parcel parcel) {
            return new TariffCpxLimitContent(TariffCpxLimitBody.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCpxLimitContent[] newArray(int i12) {
            return new TariffCpxLimitContent[i12];
        }
    }

    public TariffCpxLimitContent(@k TariffCpxLimitBody tariffCpxLimitBody) {
        this.f297293b = tariffCpxLimitBody;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TariffCpxLimitContent) && L.f(this.f297293b, ((TariffCpxLimitContent) obj).f297293b);
    }

    public final int hashCode() {
        return this.f297293b.hashCode();
    }

    @k
    public final String toString() {
        return "TariffCpxLimitContent(body=" + this.f297293b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f297293b.writeToParcel(parcel, i12);
    }
}
