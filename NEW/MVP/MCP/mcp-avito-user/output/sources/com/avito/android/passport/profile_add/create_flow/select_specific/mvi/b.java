package com.avito.android.passport.profile_add.create_flow.select_specific.mvi;

import Y41.q;
import com.avito.android.passport.profile_add.create_flow.select_specific.mvi.entity.SelectSpecificInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectSpecificActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/passport/profile_add/create_flow/select_specific/mvi/entity/SelectSpecificInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.create_flow.select_specific.mvi.SelectSpecificActor$startMergeFlow$2", f = "SelectSpecificActor.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class b extends SuspendLambda implements q<InterfaceC43172j<? super SelectSpecificInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f211722q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f211723r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f211724s;

    public b() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super SelectSpecificInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        b bVar = new b(3, continuation);
        bVar.f211723r = interfaceC43172j;
        bVar.f211724s = th2;
        return bVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f211722q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f211723r;
            SelectSpecificInternalAction.ActionError actionError = new SelectSpecificInternalAction.ActionError(this.f211724s);
            this.f211723r = null;
            this.f211722q = 1;
            if (interfaceC43172j.emit(actionError, this) == coroutine_suspended) {
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
