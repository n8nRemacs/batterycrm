package ru.cyberity.cbr.core.presentation.base;

import Y41.q;
import Y61.k;
import Y61.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;

/* compiled from: CBRViewModel.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "T", "Lkotlinx/coroutines/flow/j;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "ru.cyberity.cbr.core.presentation.base.CBRViewModel$events$2", f = "CBRViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class CBRViewModel$events$2 extends SuspendLambda implements q<InterfaceC43172j<? super CBRViewModel.CBRViewModelEvent>, Throwable, Continuation<? super G0>, Object> {
    int label;
    final /* synthetic */ CBRViewModel<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CBRViewModel$events$2(CBRViewModel<T> cBRViewModel, Continuation<? super CBRViewModel$events$2> continuation) {
        super(3, continuation);
        this.this$0 = cBRViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        ((CBRViewModel) this.this$0).isAttachedToFragment = Boxing.boxBoolean(false);
        return G0.f406611a;
    }

    @Override // Y41.q
    @l
    public final Object invoke(@k InterfaceC43172j<? super CBRViewModel.CBRViewModelEvent> interfaceC43172j, @l Throwable th2, @l Continuation<? super G0> continuation) {
        return new CBRViewModel$events$2(this.this$0, continuation).invokeSuspend(G0.f406611a);
    }
}
