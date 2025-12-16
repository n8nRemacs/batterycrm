package com.avito.android.trx_promo_goods.screens.status.deeplink;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: TrxPromoGoodsConfigureSuccessLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/status/deeplink/TrxPromoGoodsConfigureSuccessLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TrxPromoGoodsConfigureSuccessLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<TrxPromoGoodsConfigureSuccessLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f303777b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f303778c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f303779d;

    /* compiled from: TrxPromoGoodsConfigureSuccessLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrxPromoGoodsConfigureSuccessLink> {
        @Override // android.os.Parcelable.Creator
        public final TrxPromoGoodsConfigureSuccessLink createFromParcel(Parcel parcel) {
            return new TrxPromoGoodsConfigureSuccessLink(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final TrxPromoGoodsConfigureSuccessLink[] newArray(int i12) {
            return new TrxPromoGoodsConfigureSuccessLink[i12];
        }
    }

    public TrxPromoGoodsConfigureSuccessLink(@k String str, @k String str2, boolean z12) {
        this.f303777b = str;
        this.f303778c = str2;
        this.f303779d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f303777b);
        parcel.writeString(this.f303778c);
        parcel.writeInt(this.f303779d ? 1 : 0);
    }
}
