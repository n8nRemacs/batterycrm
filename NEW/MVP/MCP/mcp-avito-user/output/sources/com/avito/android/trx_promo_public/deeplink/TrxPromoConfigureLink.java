package com.avito.android.trx_promo_public.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: TrxPromoConfigureLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_trx-promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TrxPromoConfigureLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<TrxPromoConfigureLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f304507b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f304508c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f304509d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f304510e;

    /* compiled from: TrxPromoConfigureLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrxPromoConfigureLink> {
        @Override // android.os.Parcelable.Creator
        public final TrxPromoConfigureLink createFromParcel(Parcel parcel) {
            return new TrxPromoConfigureLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final TrxPromoConfigureLink[] newArray(int i12) {
            return new TrxPromoConfigureLink[i12];
        }
    }

    public TrxPromoConfigureLink(@k String str, @k String str2, @k String str3, boolean z12) {
        this.f304507b = str;
        this.f304508c = str2;
        this.f304509d = str3;
        this.f304510e = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f304507b);
        parcel.writeString(this.f304508c);
        parcel.writeString(this.f304509d);
        parcel.writeInt(this.f304510e ? 1 : 0);
    }
}
