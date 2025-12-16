package com.avito.android.trx_promo_goods.screens.configure.mvi;

import JF0.e;
import Ju.InterfaceC14249c;
import MF0.a;
import MF0.e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.paid_services.PaidServicesResultRepository;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.trx_promo_goods.screens.configure.deeplink.TrxPromoGoodsConfigureApplyLink;
import com.avito.android.trx_promo_goods.screens.configure.deeplink.TrxPromoGoodsConfigureCancelLink;
import com.avito.android.trx_promo_goods.screens.configure.mvi.entity.TrxPromoGoodsConfigureInternalAction;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: TrxPromoGoodsConfigureActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/mvi/f;", "Lcom/avito/android/arch/mvi/a;", "LMF0/a;", "Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction;", "LMF0/d;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements com.avito.android.arch.mvi.a<MF0.a, TrxPromoGoodsConfigureInternalAction, MF0.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.trx_promo_goods.screens.configure.domain.a f303593a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f303594b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PaidServicesResultRepository f303595c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LF0.a f303596d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Set<InterfaceC14249c> f303597e = C42756l.l0(new InterfaceC14249c[]{TrxPromoGoodsConfigureApplyLink.b.C9282b.f303376b, TrxPromoGoodsConfigureCancelLink.b.C9283b.f303379b, TrxPromoGoodsConfigureCancelLink.b.c.f303380b});

    @Inject
    public f(@Y61.k com.avito.android.trx_promo_goods.screens.configure.domain.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k PaidServicesResultRepository paidServicesResultRepository, @Y61.k LF0.a aVar3) {
        this.f303593a = aVar;
        this.f303594b = aVar2;
        this.f303595c = paidServicesResultRepository;
        this.f303596d = aVar3;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(new b(new C43197r1(new e(this, null), new a(y.a(this.f303594b.V9()))), aVar), com.avito.android.arch.mvi.utils.h.e(c43197r1, c.f303577l, new d(this, aVar), 1000L));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<TrxPromoGoodsConfigureInternalAction> b(@Y61.k MF0.a aVar, @Y61.k MF0.d dVar) {
        ButtonAction buttonAction;
        ButtonAction buttonAction2;
        if (aVar instanceof a.c) {
            return this.f303593a.a();
        }
        if (aVar instanceof a.C0668a) {
            return new C43210w(dVar.f10512b ? TrxPromoGoodsConfigureInternalAction.FinishFlow.f303584b : TrxPromoGoodsConfigureInternalAction.Close.f303582b);
        }
        if (aVar instanceof a.d) {
            return d(((a.d) aVar).f10499a, dVar);
        }
        deeplink = null;
        DeepLink deeplink = null;
        deeplink = null;
        DeepLink deeplink2 = null;
        if (aVar instanceof a.e) {
            ButtonAction button = dVar.f10522l.getF10535d().getButton();
            return d(button != null ? button.getDeeplink() : null, dVar);
        }
        if (aVar instanceof a.f) {
            MF0.e eVar = dVar.f10522l;
            e.b bVar = eVar instanceof e.b ? (e.b) eVar : null;
            if (bVar != null && (buttonAction2 = bVar.f10528f) != null) {
                deeplink = buttonAction2.getDeeplink();
            }
            return d(deeplink, dVar);
        }
        if (!(aVar instanceof a.g)) {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            Float fValueOf = Float.valueOf(((a.b) aVar).f10497a);
            MF0.b bVar2 = dVar.f10518h;
            return new C43210w(new TrxPromoGoodsConfigureInternalAction.InputChange(fValueOf, bVar2 != null ? bVar2.f10504b : null));
        }
        MF0.e eVar2 = dVar.f10522l;
        e.b bVar3 = eVar2 instanceof e.b ? (e.b) eVar2 : null;
        if (bVar3 != null && (buttonAction = bVar3.f10529g) != null) {
            deeplink2 = buttonAction.getDeeplink();
        }
        return d(deeplink2, dVar);
    }

    public final InterfaceC43160i<TrxPromoGoodsConfigureInternalAction> d(DeepLink deepLink, MF0.d dVar) {
        if (deepLink == null) {
            return C43175k.w();
        }
        e.b bVar = dVar.f10515e;
        LF0.a aVar = this.f303596d;
        return new C43210w(new TrxPromoGoodsConfigureInternalAction.HandleDeeplink(deepLink, bVar != null ? Integer.valueOf(aVar.e(bVar, dVar.f10519i)) : null, aVar.b(dVar.f10520j)));
    }
}
