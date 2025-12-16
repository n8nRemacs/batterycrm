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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/common/deeplink/CpxPromoV2Link;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class CpxPromoV2Link extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<CpxPromoV2Link> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f126808b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f126809c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f126810d;

    /* compiled from: CpxPromoLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CpxPromoV2Link> {
        @Override // android.os.Parcelable.Creator
        public final CpxPromoV2Link createFromParcel(Parcel parcel) {
            return new CpxPromoV2Link(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CpxPromoV2Link[] newArray(int i12) {
            return new CpxPromoV2Link[i12];
        }
    }

    public CpxPromoV2Link(@k String str, @k String str2, @k String str3) {
        this.f126808b = str;
        this.f126809c = str2;
        this.f126810d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f126808b);
        parcel.writeString(this.f126809c);
        parcel.writeString(this.f126810d);
    }
}
