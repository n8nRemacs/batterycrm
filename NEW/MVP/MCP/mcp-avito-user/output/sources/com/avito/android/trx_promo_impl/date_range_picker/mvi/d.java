package com.avito.android.trx_promo_impl.date_range_picker.mvi;

import com.avito.android.trx_promo_impl.date_range_picker.mvi.entity.TrxPromoDateRangePickerInternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TrxPromoDateRangePickerActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LSF0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction;", "invoke", "(LSF0/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class d extends N implements Y41.l<SF0.a, InterfaceC43160i<? extends TrxPromoDateRangePickerInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f304032l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<SF0.c> f304033m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Y41.a<SF0.c> aVar) {
        super(1);
        this.f304032l = eVar;
        this.f304033m = aVar;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends TrxPromoDateRangePickerInternalAction> invoke(SF0.a aVar) {
        SF0.c cVarInvoke = this.f304033m.invoke();
        return this.f304032l.b(aVar, cVarInvoke);
    }
}
