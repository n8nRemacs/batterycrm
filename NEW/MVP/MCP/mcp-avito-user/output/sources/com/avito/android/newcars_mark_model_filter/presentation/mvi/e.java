package com.avito.android.newcars_mark_model_filter.presentation.mvi;

import com.avito.android.newcars_mark_model_filter.presentation.mvi.entity.NewCarsBrandModelFilterInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: NewCarsBrandModelFilterActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.newcars_mark_model_filter.presentation.mvi.NewCarsBrandModelFilterActor$process$5", f = "NewCarsBrandModelFilterActor.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class e extends SuspendLambda implements Y41.q<InterfaceC43172j<? super NewCarsBrandModelFilterInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f207326q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f207327r;

    public e() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super NewCarsBrandModelFilterInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        e eVar = new e(3, continuation);
        eVar.f207327r = interfaceC43172j;
        return eVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f207326q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f207327r;
            NewCarsBrandModelFilterInternalAction.HideLoader hideLoader = NewCarsBrandModelFilterInternalAction.HideLoader.f207331b;
            this.f207326q = 1;
            if (interfaceC43172j.emit(hideLoader, this) == coroutine_suspended) {
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
