package com.avito.android.trx_promo_impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: TrxPromoPerfScreens.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_impl/TrxPromoSuccessScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes4.dex */
public final class TrxPromoSuccessScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final TrxPromoSuccessScreen f303896d = new TrxPromoSuccessScreen();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final String f303897e = "trxPromoConfigureSuccess";

    @Y61.k
    public static final Parcelable.Creator<TrxPromoSuccessScreen> CREATOR = new a();

    /* compiled from: TrxPromoPerfScreens.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrxPromoSuccessScreen> {
        @Override // android.os.Parcelable.Creator
        public final TrxPromoSuccessScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return TrxPromoSuccessScreen.f303896d;
        }

        @Override // android.os.Parcelable.Creator
        public final TrxPromoSuccessScreen[] newArray(int i12) {
            return new TrxPromoSuccessScreen[i12];
        }
    }

    public TrxPromoSuccessScreen() {
        super("TrxPromoConfigureSuccess", false, 2, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
