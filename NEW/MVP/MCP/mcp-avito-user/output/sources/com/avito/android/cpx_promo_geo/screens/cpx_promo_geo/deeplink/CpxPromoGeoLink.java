package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: CpxPromoGeoLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/deeplink/CpxPromoGeoLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class CpxPromoGeoLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<CpxPromoGeoLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f127793b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f127794c;

    /* compiled from: CpxPromoGeoLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CpxPromoGeoLink> {
        @Override // android.os.Parcelable.Creator
        public final CpxPromoGeoLink createFromParcel(Parcel parcel) {
            return new CpxPromoGeoLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CpxPromoGeoLink[] newArray(int i12) {
            return new CpxPromoGeoLink[i12];
        }
    }

    public CpxPromoGeoLink(@k String str, @k String str2) {
        this.f127793b = str;
        this.f127794c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f127793b);
        parcel.writeString(this.f127794c);
    }
}
