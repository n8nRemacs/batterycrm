package ru.cyberity.cbr.core.presentation.base;

import Y41.p;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "T", "Lkotlinx/coroutines/flow/j;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "ru.cyberity.cbr.core.presentation.base.CBRViewModel$events$1", f = "CBRViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class CBRViewModel$events$1 extends SuspendLambda implements p<InterfaceC43172j<? super CBRViewModel.CBRViewModelEvent>, Continuation<? super G0>, Object> {
    int label;
    final /* synthetic */ CBRViewModel<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CBRViewModel$events$1(CBRViewModel<T> cBRViewModel, Continuation<? super CBRViewModel$events$1> continuation) {
        super(2, continuation);
        this.this$0 = cBRViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new CBRViewModel$events$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        ((CBRViewModel) this.this$0).isAttachedToFragment = Boxing.boxBoolean(true);
        return G0.f406611a;
    }

    @Override // Y41.p
    @l
    public final Object invoke(@k InterfaceC43172j<? super CBRViewModel.CBRViewModelEvent> interfaceC43172j, @l Continuation<? super G0> continuation) {
        return ((CBRViewModel$events$1) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }
}
