package com.avito.android.trx_promo_goods.screens.status.domain;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TrxPromoGoodsStatus.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/status/domain/TrxPromoGoodsStatus;", "", "Landroid/os/Parcelable;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TrxPromoGoodsStatus implements Parcelable {

    @k
    public static final Parcelable.Creator<TrxPromoGoodsStatus> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final TrxPromoGoodsStatus f303820b;

    /* renamed from: c, reason: collision with root package name */
    public static final TrxPromoGoodsStatus f303821c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ TrxPromoGoodsStatus[] f303822d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f303823e;

    static {
        TrxPromoGoodsStatus trxPromoGoodsStatus = new TrxPromoGoodsStatus("SUCCESS", 0);
        f303820b = trxPromoGoodsStatus;
        TrxPromoGoodsStatus trxPromoGoodsStatus2 = new TrxPromoGoodsStatus("FORBIDDEN", 1);
        f303821c = trxPromoGoodsStatus2;
        TrxPromoGoodsStatus[] trxPromoGoodsStatusArr = {trxPromoGoodsStatus, trxPromoGoodsStatus2};
        f303822d = trxPromoGoodsStatusArr;
        f303823e = c.a(trxPromoGoodsStatusArr);
        CREATOR = new Parcelable.Creator<TrxPromoGoodsStatus>() { // from class: com.avito.android.trx_promo_goods.screens.status.domain.TrxPromoGoodsStatus.a
            @Override // android.os.Parcelable.Creator
            public final TrxPromoGoodsStatus createFromParcel(Parcel parcel) {
                return TrxPromoGoodsStatus.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TrxPromoGoodsStatus[] newArray(int i12) {
                return new TrxPromoGoodsStatus[i12];
            }
        };
    }

    public TrxPromoGoodsStatus() {
        throw null;
    }

    public static TrxPromoGoodsStatus valueOf(String str) {
        return (TrxPromoGoodsStatus) Enum.valueOf(TrxPromoGoodsStatus.class, str);
    }

    public static TrxPromoGoodsStatus[] values() {
        return (TrxPromoGoodsStatus[]) f303822d.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
