package com.avito.android.user_adverts_filters.main.mvi_delegate;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import qJ0.InterfaceC47305a;
import qJ0.InterfaceC47306b;
import qJ0.InterfaceC47308d;

/* compiled from: FiltersDelegateActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LqJ0/a;", "action", "Lkotlinx/coroutines/flow/i;", "LqJ0/b;", "<anonymous>", "(LqJ0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts_filters.main.mvi_delegate.FiltersDelegateActor$processDelegateActions$1", f = "FiltersDelegateActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class u extends SuspendLambda implements Y41.p<InterfaceC47305a, Continuation<? super InterfaceC43160i<? extends InterfaceC47306b>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f316184q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C35708a f316185r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<InterfaceC47308d> f316186s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(C35708a c35708a, Y41.a<? extends InterfaceC47308d> aVar, Continuation<? super u> continuation) {
        super(2, continuation);
        this.f316185r = c35708a;
        this.f316186s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        u uVar = new u(this.f316185r, this.f316186s, continuation);
        uVar.f316184q = obj;
        return uVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC47305a interfaceC47305a, Continuation<? super InterfaceC43160i<? extends InterfaceC47306b>> continuation) {
        return ((u) create(interfaceC47305a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f316185r.b((InterfaceC47305a) this.f316184q, this.f316186s.invoke());
    }
}
