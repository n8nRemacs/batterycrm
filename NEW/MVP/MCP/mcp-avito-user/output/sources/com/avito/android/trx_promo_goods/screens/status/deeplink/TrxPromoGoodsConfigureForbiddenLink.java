package com.avito.android.trx_promo_goods.screens.status.deeplink;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: TrxPromoGoodsConfigureForbiddenLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/status/deeplink/TrxPromoGoodsConfigureForbiddenLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TrxPromoGoodsConfigureForbiddenLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<TrxPromoGoodsConfigureForbiddenLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f303774b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f303775c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f303776d;

    /* compiled from: TrxPromoGoodsConfigureForbiddenLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrxPromoGoodsConfigureForbiddenLink> {
        @Override // android.os.Parcelable.Creator
        public final TrxPromoGoodsConfigureForbiddenLink createFromParcel(Parcel parcel) {
            return new TrxPromoGoodsConfigureForbiddenLink(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final TrxPromoGoodsConfigureForbiddenLink[] newArray(int i12) {
            return new TrxPromoGoodsConfigureForbiddenLink[i12];
        }
    }

    public TrxPromoGoodsConfigureForbiddenLink(@k String str, @k String str2, boolean z12) {
        this.f303774b = str;
        this.f303775c = str2;
        this.f303776d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f303774b);
        parcel.writeString(this.f303775c);
        parcel.writeInt(this.f303776d ? 1 : 0);
    }
}
