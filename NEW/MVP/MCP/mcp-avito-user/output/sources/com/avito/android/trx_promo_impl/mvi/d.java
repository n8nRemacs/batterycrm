package com.avito.android.trx_promo_impl.mvi;

import com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TrxPromoActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LZF0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction;", "invoke", "(LZF0/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class d extends N implements Y41.l<ZF0.a, InterfaceC43160i<? extends TrxPromoInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f304328l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<ZF0.d> f304329m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Y41.a<ZF0.d> aVar) {
        super(1);
        this.f304328l = fVar;
        this.f304329m = aVar;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends TrxPromoInternalAction> invoke(ZF0.a aVar) {
        ZF0.d dVarInvoke = this.f304329m.invoke();
        return this.f304328l.b(aVar, dVarInvoke);
    }
}
