package com.avito.android.trx_promo_goods.screens.status.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.trx_promo_goods.TrxPromoGoodsConfigureForbiddenScreen;
import com.avito.android.trx_promo_goods.TrxPromoGoodsConfigureSuccessScreen;
import com.avito.android.trx_promo_goods.screens.status.domain.TrxPromoGoodsStatus;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;

/* compiled from: TrxPromoStatusModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f303818a;

    /* renamed from: b, reason: collision with root package name */
    public final l f303819b;

    public j(l lVar, l lVar2) {
        this.f303818a = lVar;
        this.f303819b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Q q12;
        r rVar = (r) this.f303818a.f393949a;
        TrxPromoGoodsStatus trxPromoGoodsStatus = (TrxPromoGoodsStatus) this.f303819b.f393949a;
        i.f303817a.getClass();
        int iOrdinal = trxPromoGoodsStatus.ordinal();
        if (iOrdinal == 0) {
            TrxPromoGoodsConfigureSuccessScreen trxPromoGoodsConfigureSuccessScreen = TrxPromoGoodsConfigureSuccessScreen.f303320d;
            trxPromoGoodsConfigureSuccessScreen.getClass();
            q12 = new Q(trxPromoGoodsConfigureSuccessScreen, TrxPromoGoodsConfigureSuccessScreen.f303321e);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            TrxPromoGoodsConfigureForbiddenScreen trxPromoGoodsConfigureForbiddenScreen = TrxPromoGoodsConfigureForbiddenScreen.f303316d;
            trxPromoGoodsConfigureForbiddenScreen.getClass();
            q12 = new Q(trxPromoGoodsConfigureForbiddenScreen, TrxPromoGoodsConfigureForbiddenScreen.f303317e);
        }
        return new C28478k((Screen) q12.f406619b, rVar, (String) q12.f406620c);
    }
}
