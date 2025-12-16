package com.avito.android.success.mvi;

import com.avito.android.success.mvi.entity.SuccessInternalAction;
import eA0.C39981c;
import eA0.InterfaceC39979a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SuccessActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LeA0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/success/mvi/entity/SuccessInternalAction;", "invoke", "(LeA0/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class b extends N implements Y41.l<InterfaceC39979a, InterfaceC43160i<? extends SuccessInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f291669l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<C39981c> f291670m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Y41.a<C39981c> aVar) {
        super(1);
        this.f291669l = cVar;
        this.f291670m = aVar;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends SuccessInternalAction> invoke(InterfaceC39979a interfaceC39979a) {
        this.f291670m.invoke();
        return this.f291669l.c(interfaceC39979a);
    }
}
