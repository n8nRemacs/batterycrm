package com.avito.android.pagination.mvi;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43172j;
import r50.AbstractC47493a;

/* compiled from: RequestNewPortionHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lr50/f;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.pagination.mvi.RequestNewPortionHandler$tryFetchPortion$1", f = "RequestNewPortionHandler.kt", i = {0, 1, 3, 4}, l = {61, 62, 64, 70, 71, 73}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes15.dex */
final class q extends SuspendLambda implements Y41.p<InterfaceC43172j<? super r50.f>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f210594q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f210595r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC47493a f210596s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Boolean> f210597t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ s f210598u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Boolean> f210599v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(AbstractC47493a abstractC47493a, Y41.a<Boolean> aVar, s sVar, Y41.a<Boolean> aVar2, Continuation<? super q> continuation) {
        super(2, continuation);
        this.f210596s = abstractC47493a;
        this.f210597t = aVar;
        this.f210598u = sVar;
        this.f210599v = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        q qVar = new q(this.f210596s, this.f210597t, this.f210598u, this.f210599v, continuation);
        qVar.f210595r = obj;
        return qVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super r50.f> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((q) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Y41.a<Boolean> aVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f210594q;
        AbstractC47493a abstractC47493a = this.f210596s;
        s sVar = this.f210598u;
        switch (i12) {
            case 0:
                C42729a0.b(obj);
                if (L.f(abstractC47493a, AbstractC47493a.b.f429597a)) {
                    Y41.a<Boolean> aVar2 = this.f210597t;
                    if (aVar2 != null && aVar2.invoke().booleanValue()) {
                        sVar.getClass();
                        throw null;
                    }
                } else if (L.f(abstractC47493a, AbstractC47493a.C12353a.f429596a) && (aVar = this.f210599v) != null && aVar.invoke().booleanValue()) {
                    sVar.getClass();
                    throw null;
                }
                break;
            case 1:
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f210595r;
                C42729a0.b(obj);
                this.f210595r = interfaceC43172j;
                this.f210594q = 2;
                s.a(sVar, abstractC47493a, this);
                throw null;
            case 2:
                C42729a0.b(obj);
                sVar.getClass();
                throw null;
            case 3:
            case 6:
                C42729a0.b(obj);
                break;
            case 4:
                InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f210595r;
                C42729a0.b(obj);
                this.f210595r = interfaceC43172j2;
                this.f210594q = 5;
                s.a(sVar, abstractC47493a, this);
                throw null;
            case 5:
                C42729a0.b(obj);
                sVar.getClass();
                throw null;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return G0.f406611a;
    }
}
