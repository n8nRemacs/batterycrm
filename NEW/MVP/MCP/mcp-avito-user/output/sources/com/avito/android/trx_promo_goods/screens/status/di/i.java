package com.avito.android.trx_promo_goods.screens.status.di;

import Y61.k;
import android.os.Parcelable;
import com.avito.android.trx_promo_goods.screens.status.domain.TrxPromoGoodsStatus;
import kotlin.Metadata;

/* compiled from: TrxPromoStatusModule.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/status/di/i;", "", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.h
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final i f303817a = new i();

    /* compiled from: TrxPromoStatusModule.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[TrxPromoGoodsStatus.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<TrxPromoGoodsStatus> creator = TrxPromoGoodsStatus.CREATOR;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
