package com.avito.android.tariff_select.mvi;

import com.avito.android.tariff_select.mvi.entity.TariffSelectInternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TariffSelectActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LZD0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/tariff_select/mvi/entity/TariffSelectInternalAction;", "invoke", "(LZD0/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class b extends N implements Y41.l<ZD0.a, InterfaceC43160i<? extends TariffSelectInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f301227l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<ZD0.c> f301228m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Y41.a<ZD0.c> aVar) {
        super(1);
        this.f301227l = cVar;
        this.f301228m = aVar;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends TariffSelectInternalAction> invoke(ZD0.a aVar) {
        ZD0.c cVarInvoke = this.f301228m.invoke();
        return this.f301227l.b(aVar, cVarInvoke);
    }
}
