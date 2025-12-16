package com.avito.android.position_in_search.stats.screen.position_in_search.mvi;

import c90.InterfaceC26960a;
import com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity.PositionInSearchInternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PositionInSearchActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc90/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction;", "invoke", "(Lc90/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c extends N implements Y41.l<InterfaceC26960a, InterfaceC43160i<? extends PositionInSearchInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f221489l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<c90.c> f221490m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, Y41.a<c90.c> aVar2) {
        super(1);
        this.f221489l = aVar;
        this.f221490m = aVar2;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends PositionInSearchInternalAction> invoke(InterfaceC26960a interfaceC26960a) {
        c90.c cVarInvoke = this.f221490m.invoke();
        return this.f221489l.b(interfaceC26960a, cVarInvoke);
    }
}
