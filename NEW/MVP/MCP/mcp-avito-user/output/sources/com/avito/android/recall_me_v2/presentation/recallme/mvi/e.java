package com.avito.android.recall_me_v2.presentation.recallme.mvi;

import com.avito.android.error.z;
import com.avito.android.recall_me_v2.presentation.recallme.mvi.entity.RecallMeInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RecallMeActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.recall_me_v2.presentation.recallme.mvi.RecallMeActor$onAcceptButtonClick$2", f = "RecallMeActor.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class e extends SuspendLambda implements Y41.q<InterfaceC43172j<? super RecallMeInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f252139q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f252140r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f252141s;

    public e() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super RecallMeInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        e eVar = new e(3, continuation);
        eVar.f252140r = interfaceC43172j;
        eVar.f252141s = th2;
        return eVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f252139q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f252140r;
            RecallMeInternalAction.OnError onError = new RecallMeInternalAction.OnError(z.l(this.f252141s));
            this.f252140r = null;
            this.f252139q = 1;
            if (interfaceC43172j.emit(onError, this) == coroutine_suspended) {
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
