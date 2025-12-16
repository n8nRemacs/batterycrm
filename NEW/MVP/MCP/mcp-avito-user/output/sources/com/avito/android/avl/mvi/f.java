package com.avito.android.avl.mvi;

import Mg.InterfaceC14486a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import zg.e;

/* compiled from: AvlPlayerActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lzg/f;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.avl.mvi.AvlPlayerActor$process$10", f = "AvlPlayerActor.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super zg.f>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f98218q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f98219r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ zg.e f98220s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n nVar, Continuation continuation, zg.e eVar) {
        super(2, continuation);
        this.f98219r = nVar;
        this.f98220s = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new f(this.f98219r, continuation, this.f98220s);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super zg.f> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f98218q;
        if (i12 == 0) {
            C42729a0.b(obj);
            n nVar = this.f98219r;
            InterfaceC14486a interfaceC14486a = nVar.f98239b;
            String str = ((e.b) this.f98220s).f444134a;
            this.f98218q = 1;
            if (interfaceC14486a.e(nVar.f98240c, str, this) == coroutine_suspended) {
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
