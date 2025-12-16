package ru.cyberity.cbr.core.presentation.base;

import Y41.p;
import Y61.k;
import Y61.l;
import java.util.concurrent.CancellationException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.log.c;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "ru.cyberity.cbr.core.presentation.base.CBRViewModel$launchOnViewModelScope$1", f = "CBRViewModel.kt", i = {0}, l = {366}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes9.dex */
public final class CBRViewModel$launchOnViewModelScope$1 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
    final /* synthetic */ p<T, Continuation<? super G0>, Object> $block;
    final /* synthetic */ String $idDocSetType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CBRViewModel<CBRViewModel.CBRViewModelState> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CBRViewModel$launchOnViewModelScope$1(p<? super T, ? super Continuation<? super G0>, ? extends Object> pVar, CBRViewModel<CBRViewModel.CBRViewModelState> cBRViewModel, String str, Continuation<? super CBRViewModel$launchOnViewModelScope$1> continuation) {
        super(2, continuation);
        this.$block = pVar;
        this.this$0 = cBRViewModel;
        this.$idDocSetType = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        CBRViewModel$launchOnViewModelScope$1 cBRViewModel$launchOnViewModelScope$1 = new CBRViewModel$launchOnViewModelScope$1(this.$block, this.this$0, this.$idDocSetType, continuation);
        cBRViewModel$launchOnViewModelScope$1.L$0 = obj;
        return cBRViewModel$launchOnViewModelScope$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        T t12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                T t13 = (T) this.L$0;
                try {
                    p<T, Continuation<? super G0>, Object> pVar = this.$block;
                    this.L$0 = t13;
                    this.label = 1;
                    if (pVar.invoke(t13, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (CancellationException unused) {
                    t12 = t13;
                    Logger.d$default(ru.cyberity.log.a.f436064a, c.a(t12), "CancellationException happened", null, 4, null);
                    return G0.f406611a;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t12 = (T) this.L$0;
                try {
                    C42729a0.b(obj);
                } catch (CancellationException unused2) {
                    Logger.d$default(ru.cyberity.log.a.f436064a, c.a(t12), "CancellationException happened", null, 4, null);
                    return G0.f406611a;
                }
            }
        } catch (Exception e12) {
            CBRViewModel.throwError$default(this.this$0, e12, this.$idDocSetType, null, 4, null);
        }
        return G0.f406611a;
    }

    @Override // Y41.p
    @l
    public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
        return ((CBRViewModel$launchOnViewModelScope$1) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }
}
