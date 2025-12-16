package com.avito.android.tariff.cpx.info.sf.menu.domain;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.tariff.cpx.info.sf.menu.deeplink.TariffCpxInfoSfMenuLinkBody;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoSfMenuContent.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/sf/menu/domain/TariffCpxInfoSfMenuContent;", "Lcom/avito/android/util/OpenParams;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TariffCpxInfoSfMenuContent implements OpenParams {

    @k
    public static final Parcelable.Creator<TariffCpxInfoSfMenuContent> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TariffCpxInfoSfMenuLinkBody f296784b;

    /* compiled from: TariffCpxInfoSfMenuContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCpxInfoSfMenuContent> {
        @Override // android.os.Parcelable.Creator
        public final TariffCpxInfoSfMenuContent createFromParcel(Parcel parcel) {
            return new TariffCpxInfoSfMenuContent(TariffCpxInfoSfMenuLinkBody.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCpxInfoSfMenuContent[] newArray(int i12) {
            return new TariffCpxInfoSfMenuContent[i12];
        }
    }

    public TariffCpxInfoSfMenuContent(@k TariffCpxInfoSfMenuLinkBody tariffCpxInfoSfMenuLinkBody) {
        this.f296784b = tariffCpxInfoSfMenuLinkBody;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TariffCpxInfoSfMenuContent) && L.f(this.f296784b, ((TariffCpxInfoSfMenuContent) obj).f296784b);
    }

    public final int hashCode() {
        return this.f296784b.hashCode();
    }

    @k
    public final String toString() {
        return "TariffCpxInfoSfMenuContent(body=" + this.f296784b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f296784b.writeToParcel(parcel, i12);
    }
}
