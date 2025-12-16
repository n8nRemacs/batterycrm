package com.avito.android.trx_promo_public.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import com.avito.android.trx_promo_public.data.TrxPromoStatus;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: TrxPromoConfigureForbiddenLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureForbiddenLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_trx-promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TrxPromoConfigureForbiddenLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<TrxPromoConfigureForbiddenLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f304503b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f304504c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f304505d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TrxPromoStatus f304506e;

    /* compiled from: TrxPromoConfigureForbiddenLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrxPromoConfigureForbiddenLink> {
        @Override // android.os.Parcelable.Creator
        public final TrxPromoConfigureForbiddenLink createFromParcel(Parcel parcel) {
            return new TrxPromoConfigureForbiddenLink(parcel.readString(), parcel.readString(), parcel.readInt() != 0, TrxPromoStatus.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final TrxPromoConfigureForbiddenLink[] newArray(int i12) {
            return new TrxPromoConfigureForbiddenLink[i12];
        }
    }

    public TrxPromoConfigureForbiddenLink(@k String str, @k String str2, boolean z12, @k TrxPromoStatus trxPromoStatus) {
        this.f304503b = str;
        this.f304504c = str2;
        this.f304505d = z12;
        this.f304506e = trxPromoStatus;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f304503b);
        parcel.writeString(this.f304504c);
        parcel.writeInt(this.f304505d ? 1 : 0);
        this.f304506e.writeToParcel(parcel, i12);
    }
}
