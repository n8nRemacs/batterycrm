package com.avito.android.gig_apply.mvi;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import pH.AbstractC46954b;

/* compiled from: GigApplyActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LpH/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.gig_apply.mvi.GigApplyActor$process$1", f = "GigApplyActor.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.gig_apply.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30720a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AbstractC46954b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f159714q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f159715r;

    public C30720a() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30720a c30720a = new C30720a(2, continuation);
        c30720a.f159715r = obj;
        return c30720a;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AbstractC46954b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C30720a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f159714q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f159715r;
            AbstractC46954b.e eVar = AbstractC46954b.e.f428310a;
            this.f159714q = 1;
            if (interfaceC43172j.emit(eVar, this) == coroutine_suspended) {
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
