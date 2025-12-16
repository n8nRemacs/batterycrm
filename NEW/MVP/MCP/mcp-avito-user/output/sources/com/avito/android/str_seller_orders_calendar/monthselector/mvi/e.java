package com.avito.android.str_seller_orders_calendar.monthselector.mvi;

import Mz0.C14551c;
import Mz0.InterfaceC14549a;
import Mz0.InterfaceC14550b;
import Y41.l;
import com.avito.android.arch.mvi.q;
import com.avito.android.str_seller_orders_calendar.monthselector.mvi.entity.MonthSelectorInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MonthSelectorFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LMz0/a;", "Lcom/avito/android/str_seller_orders_calendar/monthselector/mvi/entity/MonthSelectorInternalAction;", "LMz0/c;", "LMz0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements l<q<InterfaceC14549a, MonthSelectorInternalAction, C14551c, InterfaceC14550b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f290449l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f290450m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f290451n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h f290452o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, j jVar, h hVar) {
        super(1);
        this.f290449l = cVar;
        this.f290450m = aVar;
        this.f290451n = jVar;
        this.f290452o = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC14549a, MonthSelectorInternalAction, C14551c, InterfaceC14550b> qVar) {
        q<InterfaceC14549a, MonthSelectorInternalAction, C14551c, InterfaceC14550b> qVar2 = qVar;
        qVar2.f92008d = this.f290449l;
        qVar2.f92009e = this.f290450m;
        qVar2.f92011g = this.f290451n;
        qVar2.f92010f = this.f290452o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
