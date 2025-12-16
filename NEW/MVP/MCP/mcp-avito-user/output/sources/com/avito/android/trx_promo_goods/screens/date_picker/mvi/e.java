package com.avito.android.trx_promo_goods.screens.date_picker.mvi;

import com.avito.android.trx_promo_goods.screens.date_picker.mvi.entity.TrxPromoGoodsDatePickerInternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TrxPromoGoodsDatePickerActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LOF0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/trx_promo_goods/screens/date_picker/mvi/entity/TrxPromoGoodsDatePickerInternalAction;", "invoke", "(LOF0/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements Y41.l<OF0.a, InterfaceC43160i<? extends TrxPromoGoodsDatePickerInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f303718l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<OF0.c> f303719m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Y41.a<OF0.c> aVar) {
        super(1);
        this.f303718l = fVar;
        this.f303719m = aVar;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends TrxPromoGoodsDatePickerInternalAction> invoke(OF0.a aVar) {
        OF0.c cVarInvoke = this.f303719m.invoke();
        this.f303718l.getClass();
        return f.c(aVar, cVarInvoke);
    }
}
