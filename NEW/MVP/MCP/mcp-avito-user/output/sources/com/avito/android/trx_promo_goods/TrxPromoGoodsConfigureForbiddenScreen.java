package com.avito.android.trx_promo_goods;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: TrxPromoGoodsPerfScreens.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_goods/TrxPromoGoodsConfigureForbiddenScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
/* loaded from: classes4.dex */
public final class TrxPromoGoodsConfigureForbiddenScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final TrxPromoGoodsConfigureForbiddenScreen f303316d = new TrxPromoGoodsConfigureForbiddenScreen();

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f303317e = "trxPromoGoodsConfigureForbidden";

    @k
    public static final Parcelable.Creator<TrxPromoGoodsConfigureForbiddenScreen> CREATOR = new a();

    /* compiled from: TrxPromoGoodsPerfScreens.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrxPromoGoodsConfigureForbiddenScreen> {
        @Override // android.os.Parcelable.Creator
        public final TrxPromoGoodsConfigureForbiddenScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return TrxPromoGoodsConfigureForbiddenScreen.f303316d;
        }

        @Override // android.os.Parcelable.Creator
        public final TrxPromoGoodsConfigureForbiddenScreen[] newArray(int i12) {
            return new TrxPromoGoodsConfigureForbiddenScreen[i12];
        }
    }

    public TrxPromoGoodsConfigureForbiddenScreen() {
        super("TrxPromoGoodsConfigureForbidden", false, 2, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
