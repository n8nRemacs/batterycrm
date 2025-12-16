package com.avito.android.tariff.cpx.info.sf.terms.domain;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.tariff.deeplink.TariffCpxInfoSfTermsLinkBody;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoSfTermsContent.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/sf/terms/domain/TariffCpxInfoSfTermsContent;", "Lcom/avito/android/util/OpenParams;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TariffCpxInfoSfTermsContent implements OpenParams {

    @k
    public static final Parcelable.Creator<TariffCpxInfoSfTermsContent> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TariffCpxInfoSfTermsLinkBody f296858b;

    /* compiled from: TariffCpxInfoSfTermsContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCpxInfoSfTermsContent> {
        @Override // android.os.Parcelable.Creator
        public final TariffCpxInfoSfTermsContent createFromParcel(Parcel parcel) {
            return new TariffCpxInfoSfTermsContent(TariffCpxInfoSfTermsLinkBody.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCpxInfoSfTermsContent[] newArray(int i12) {
            return new TariffCpxInfoSfTermsContent[i12];
        }
    }

    public TariffCpxInfoSfTermsContent(@k TariffCpxInfoSfTermsLinkBody tariffCpxInfoSfTermsLinkBody) {
        this.f296858b = tariffCpxInfoSfTermsLinkBody;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TariffCpxInfoSfTermsContent) && L.f(this.f296858b, ((TariffCpxInfoSfTermsContent) obj).f296858b);
    }

    public final int hashCode() {
        return this.f296858b.hashCode();
    }

    @k
    public final String toString() {
        return "TariffCpxInfoSfTermsContent(body=" + this.f296858b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f296858b.writeToParcel(parcel, i12);
    }
}
