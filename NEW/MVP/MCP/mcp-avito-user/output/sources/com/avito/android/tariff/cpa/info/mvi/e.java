package com.avito.android.tariff.cpa.info.mvi;

import bB0.C25490c;
import bB0.InterfaceC25488a;
import com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CpaInfoActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LbB0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "invoke", "(LbB0/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements Y41.l<InterfaceC25488a, InterfaceC43160i<? extends CpaInfoInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f294741l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<C25490c> f294742m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, Y41.a<C25490c> aVar) {
        super(1);
        this.f294741l = cVar;
        this.f294742m = aVar;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends CpaInfoInternalAction> invoke(InterfaceC25488a interfaceC25488a) {
        C25490c c25490cInvoke = this.f294742m.invoke();
        return this.f294741l.b(interfaceC25488a, c25490cInvoke);
    }
}
