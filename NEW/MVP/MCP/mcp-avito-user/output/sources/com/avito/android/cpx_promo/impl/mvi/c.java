package com.avito.android.cpx_promo.impl.mvi;

import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction;
import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoState;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CpxPromoActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction;", "invoke", "(Lcom/avito/android/cpx_promo/impl/mvi/entity/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class c extends N implements Y41.l<com.avito.android.cpx_promo.impl.mvi.entity.a, InterfaceC43160i<? extends CpxPromoInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f127062l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<CpxPromoState> f127063m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, Y41.a<CpxPromoState> aVar) {
        super(1);
        this.f127062l = kVar;
        this.f127063m = aVar;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends CpxPromoInternalAction> invoke(com.avito.android.cpx_promo.impl.mvi.entity.a aVar) {
        CpxPromoState cpxPromoStateInvoke = this.f127063m.invoke();
        return this.f127062l.b(aVar, cpxPromoStateInvoke);
    }
}
