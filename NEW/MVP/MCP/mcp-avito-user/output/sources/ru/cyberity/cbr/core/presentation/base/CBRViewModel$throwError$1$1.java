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
import ru.cyberity.log.LoggerType;
import ru.cyberity.log.c;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "ru.cyberity.cbr.core.presentation.base.CBRViewModel$throwError$1$1", f = "CBRViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class CBRViewModel$throwError$1$1 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
    final /* synthetic */ Throwable $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CBRViewModel$throwError$1$1(Throwable th2, Continuation<? super CBRViewModel$throwError$1$1> continuation) {
        super(2, continuation);
        this.$it = th2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        CBRViewModel$throwError$1$1 cBRViewModel$throwError$1$1 = new CBRViewModel$throwError$1$1(this.$it, continuation);
        cBRViewModel$throwError$1$1.L$0 = obj;
        return cBRViewModel$throwError$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        T t12 = (T) this.L$0;
        Logger loggerA = ru.cyberity.log.a.f436064a.a(LoggerType.KIBANA);
        String strA = c.a(t12);
        String message = this.$it.getMessage();
        if (message == null) {
            message = "";
        }
        loggerA.e(strA, message, this.$it);
        return G0.f406611a;
    }

    @Override // Y41.p
    @l
    public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
        return ((CBRViewModel$throwError$1$1) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }
}
