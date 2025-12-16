package ru.cyberity.cbr.core.presentation.base;

import Y41.p;
import Y61.k;
import Y61.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import ru.cyberity.cbr.core.data.source.dynamic.c;

/* compiled from: CBRViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "T", "Lkotlinx/coroutines/T;", "Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lru/cyberity/cbr/core/data/source/dynamic/c$c;"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "ru.cyberity.cbr.core.presentation.base.CBRViewModel$prepare$1$2$stringsRequest$1", f = "CBRViewModel.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class CBRViewModel$prepare$1$2$stringsRequest$1 extends SuspendLambda implements p<T, Continuation<? super c.C12476c>, Object> {
    int label;
    final /* synthetic */ CBRViewModel<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CBRViewModel$prepare$1$2$stringsRequest$1(CBRViewModel<T> cBRViewModel, Continuation<? super CBRViewModel$prepare$1$2$stringsRequest$1> continuation) {
        super(2, continuation);
        this.this$0 = cBRViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new CBRViewModel$prepare$1$2$stringsRequest$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        if (i12 == 0) {
            C42729a0.b(obj);
            c cVar = ((CBRViewModel) this.this$0).dataRepository;
            this.label = 1;
            obj = cVar.e(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }

    @Override // Y41.p
    @l
    public final Object invoke(@k T t12, @l Continuation<? super c.C12476c> continuation) {
        return ((CBRViewModel$prepare$1$2$stringsRequest$1) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }
}
