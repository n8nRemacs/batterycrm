package com.avito.android.cpx_promo.common.deeplink;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: CpxPromoLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/common/deeplink/CpxPromoLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class CpxPromoLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<CpxPromoLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f126805b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f126806c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f126807d;

    /* compiled from: CpxPromoLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CpxPromoLink> {
        @Override // android.os.Parcelable.Creator
        public final CpxPromoLink createFromParcel(Parcel parcel) {
            return new CpxPromoLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CpxPromoLink[] newArray(int i12) {
            return new CpxPromoLink[i12];
        }
    }

    public CpxPromoLink(@k String str, @k String str2, @k String str3) {
        this.f126805b = str;
        this.f126806c = str2;
        this.f126807d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f126805b);
        parcel.writeString(this.f126806c);
        parcel.writeString(this.f126807d);
    }
}
