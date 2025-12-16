package com.avito.android.user_adverts_filters.main.mvi_delegate;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import qJ0.InterfaceC47306b;
import qJ0.InterfaceC47308d;

/* compiled from: FiltersDelegateActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LqJ0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts_filters.main.mvi_delegate.FiltersDelegateActor$process$1", f = "FiltersDelegateActor.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class t extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC47306b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f316181q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C35708a f316182r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<InterfaceC47308d> f316183s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(C35708a c35708a, Y41.a<? extends InterfaceC47308d> aVar, Continuation<? super t> continuation) {
        super(2, continuation);
        this.f316182r = c35708a;
        this.f316183s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new t(this.f316182r, this.f316183s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC47306b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((t) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f316181q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC47308d interfaceC47308dInvoke = this.f316183s.invoke();
            this.f316181q = 1;
            if (C35708a.d(this.f316182r, interfaceC47308dInvoke, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
