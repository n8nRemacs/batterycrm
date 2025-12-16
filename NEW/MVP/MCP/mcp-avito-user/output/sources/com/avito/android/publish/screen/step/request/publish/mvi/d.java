package com.avito.android.publish.screen.step.request.publish.mvi;

import Le0.InterfaceC14385b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PublishRequestActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LLe0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.step.request.publish.mvi.PublishRequestActor$processRetryClick$1", f = "PublishRequestActor.kt", i = {0}, l = {84, 85}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC14385b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f241900q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f241901r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f241902s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f241902s = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f241902s, continuation);
        dVar.f241901r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC14385b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f241900q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f241901r;
            InterfaceC14385b.C0622b c0622b = InterfaceC14385b.C0622b.f10053a;
            this.f241901r = interfaceC43172j;
            this.f241900q = 1;
            if (interfaceC43172j.emit(c0622b, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f241901r;
            C42729a0.b(obj);
        }
        this.f241901r = null;
        this.f241900q = 2;
        if (j.c(this.f241902s, interfaceC43172j, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
