package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BxContentInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$getLocation$4", f = "BxContentInteractor.kt", i = {}, l = {326}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class Y extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BxContentInternalAction>, Throwable, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f111498q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f111499r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f111500s;

    public Y() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
        Y y12 = new Y(3, continuation);
        y12.f111499r = interfaceC43172j;
        y12.f111500s = th2;
        return y12.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f111498q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f111499r;
            BxContentInternalAction.Error.Location location = new BxContentInternalAction.Error.Location(this.f111500s, null, 1, 2, null);
            this.f111499r = null;
            this.f111498q = 1;
            if (interfaceC43172j.emit(location, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
