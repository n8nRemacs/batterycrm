package com.avito.android.trx_promo_goods.screens.status.mvi;

import PF0.a;
import com.avito.android.arch.mvi.a;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.trx_promo_goods.screens.status.mvi.entity.TrxPromoGoodsStatusInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TrxPromoGoodsStatusActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/status/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LPF0/a;", "Lcom/avito/android/trx_promo_goods/screens/status/mvi/entity/TrxPromoGoodsStatusInternalAction;", "LPF0/c;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.android.arch.mvi.a<PF0.a, TrxPromoGoodsStatusInternalAction, PF0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.trx_promo_goods.screens.status.domain.a f303836a;

    @Inject
    public a(@Y61.k com.avito.android.trx_promo_goods.screens.status.domain.a aVar) {
        this.f303836a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<TrxPromoGoodsStatusInternalAction> b(PF0.a aVar, PF0.c cVar) {
        PF0.a aVar2 = aVar;
        PF0.c cVar2 = cVar;
        if (aVar2 instanceof a.C0836a) {
            return new C43210w(cVar2.f12922b ? TrxPromoGoodsStatusInternalAction.FinishFlow.f303849b : TrxPromoGoodsStatusInternalAction.Close.f303845b);
        }
        if (aVar2 instanceof a.d) {
            return this.f303836a.a();
        }
        if (aVar2 instanceof a.c) {
            ButtonAction buttonAction = cVar2.f12928h;
            return new C43210w(new TrxPromoGoodsStatusInternalAction.HandleDeeplink(buttonAction != null ? buttonAction.getDeeplink() : null));
        }
        if (aVar2 instanceof a.b) {
            return new C43210w(new TrxPromoGoodsStatusInternalAction.HandleDeeplink(((a.b) aVar2).f12914a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
