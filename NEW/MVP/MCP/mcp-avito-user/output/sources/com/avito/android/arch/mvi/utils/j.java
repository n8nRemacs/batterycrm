package com.avito.android.arch.mvi.utils;

import com.avito.android.arch.mvi.utils.m;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FlowExt.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/arch/mvi/utils/m;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.arch.mvi.utils.FlowExtKt$materialize$2", f = "FlowExt.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class j extends SuspendLambda implements Y41.q<InterfaceC43172j<? super m<Object>>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f92095q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f92096r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f92097s;

    public j() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super m<Object>> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        j jVar = new j(3, continuation);
        jVar.f92096r = interfaceC43172j;
        jVar.f92097s = th2;
        return jVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f92095q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f92096r;
            m.a aVar = new m.a(this.f92097s);
            this.f92096r = null;
            this.f92095q = 1;
            if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
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
