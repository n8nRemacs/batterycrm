package com.avito.android.trx_promo_impl.mvi;

import Ju.InterfaceC14249c;
import ZF0.a;
import ZF0.e;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.paid_services.PaidServicesResultRepository;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.trx_promo_impl.analytics.TrxPromoBackPressEvent;
import com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction;
import com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureApplyLink;
import com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureCancelLink;
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

/* compiled from: TrxPromoActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/trx_promo_impl/mvi/f;", "Lcom/avito/android/arch/mvi/a;", "LZF0/a;", "Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction;", "LZF0/d;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements com.avito.android.arch.mvi.a<ZF0.a, TrxPromoInternalAction, ZF0.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.trx_promo_impl.domain.a f304346a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f304347b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f304348c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final PaidServicesResultRepository f304349d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Set<InterfaceC14249c> f304350e = C42756l.l0(new InterfaceC14249c[]{TrxPromoConfigureApplyLink.b.C9349b.f304491b, TrxPromoConfigureCancelLink.b.C9350b.f304494b, TrxPromoConfigureCancelLink.b.c.f304495b});

    @Inject
    public f(@Y61.k com.avito.android.trx_promo_impl.domain.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k PaidServicesResultRepository paidServicesResultRepository) {
        this.f304346a = aVar;
        this.f304347b = aVar2;
        this.f304348c = interfaceC28373a;
        this.f304349d = paidServicesResultRepository;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(new b(new C43197r1(new e(this, null), new a(y.a(this.f304347b.V9()))), aVar), com.avito.android.arch.mvi.utils.h.e(c43197r1, c.f304327l, new d(this, aVar), 1000L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<TrxPromoInternalAction> b(@Y61.k ZF0.a aVar, @Y61.k ZF0.d dVar) {
        ButtonAction button;
        DeepLink deeplink;
        C43210w c43210w;
        if (aVar instanceof a.c) {
            return this.f304346a.invoke();
        }
        if (aVar instanceof a.C1432a) {
            this.f304348c.c(new TrxPromoBackPressEvent(TrxPromoBackPressEvent.FromPage.f303899c));
            c43210w = new C43210w(dVar.f20042b ? TrxPromoInternalAction.FinishFlow.f304336b : TrxPromoInternalAction.Close.f304332b);
        } else {
            if (aVar instanceof a.e) {
                return new C43210w(new TrxPromoInternalAction.HandleDeeplink(((a.e) aVar).f20025a, Integer.valueOf(dVar.f20050j), dVar.f20051k, dVar.f20052l));
            }
            boolean z12 = aVar instanceof a.g;
            ZF0.e eVar = dVar.f20049i;
            if (!z12) {
                boolean z13 = aVar instanceof a.d;
                ZF0.b bVar = dVar.f20047g;
                if (z13) {
                    Integer num = bVar != null ? bVar.f20030a : null;
                    com.avito.android.trx_promo_impl.b.f303905a.getClass();
                    return new C43210w(new TrxPromoInternalAction.InputChange(num, com.avito.android.trx_promo_impl.b.f303906b, ((a.d) aVar).f20024a));
                }
                if (aVar instanceof a.b) {
                    return new C43210w(new TrxPromoInternalAction.InputChange(Integer.valueOf(((a.b) aVar).f20022a), bVar != null ? bVar.f20031b : null, bVar != null ? bVar.f20032c : null));
                }
                if (!(aVar instanceof a.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                RF0.k f20056d = eVar.getF20056d();
                if (f20056d == null || (button = f20056d.getButton()) == null || (deeplink = button.getDeeplink()) == null) {
                    return C43175k.w();
                }
                c43210w = new C43210w(new TrxPromoInternalAction.HandleDeeplink(deeplink, null, null, null, 14, null));
            } else {
                if (!(eVar instanceof e.b)) {
                    return C43175k.w();
                }
                c43210w = new C43210w(new TrxPromoInternalAction.OpenDatePicker(((e.b) eVar).f20060h));
            }
        }
        return c43210w;
    }
}
