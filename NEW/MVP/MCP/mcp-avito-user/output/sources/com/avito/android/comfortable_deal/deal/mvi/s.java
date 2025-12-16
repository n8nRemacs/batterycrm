package com.avito.android.comfortable_deal.deal.mvi;

import Ep.InterfaceC13517a;
import com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43172j;
import wp.InterfaceC49662a;

/* compiled from: DealActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.deal.mvi.DealActor$processAction$1", f = "DealActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class s extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13517a f121713q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C29453a f121714r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Ep.c f121715s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(InterfaceC13517a interfaceC13517a, Ep.c cVar, C29453a c29453a, Continuation continuation) {
        super(2, continuation);
        this.f121713q = interfaceC13517a;
        this.f121714r = c29453a;
        this.f121715s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29453a c29453a = this.f121714r;
        return new s(this.f121713q, this.f121715s, c29453a, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DealInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((s) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC13517a.d.C0258a c0258a = InterfaceC13517a.d.C0258a.f4272a;
        InterfaceC13517a interfaceC13517a = this.f121713q;
        boolean zF2 = L.f(interfaceC13517a, c0258a);
        Ep.c cVar = this.f121715s;
        C29453a c29453a = this.f121714r;
        if (zF2) {
            InterfaceC49662a interfaceC49662a = c29453a.f121584e;
            String str = cVar.f4325b;
            interfaceC49662a.j(str != null ? str : "", cVar.f4327d, cVar.f4326c);
        } else if (L.f(interfaceC13517a, InterfaceC13517a.d.b.f4273a)) {
            InterfaceC49662a interfaceC49662a2 = c29453a.f121584e;
            String str2 = cVar.f4325b;
            interfaceC49662a2.c(str2 != null ? str2 : "", cVar.f4327d, cVar.f4326c);
        }
        return G0.f406611a;
    }
}
