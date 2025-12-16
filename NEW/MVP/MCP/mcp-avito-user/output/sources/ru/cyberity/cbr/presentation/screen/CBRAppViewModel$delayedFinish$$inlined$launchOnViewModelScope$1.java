package ru.cyberity.cbr.presentation.screen;

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
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import ru.cyberity.cbr.core.common.a0;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.log.c;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V", "ru/cyberity/cbr/core/presentation/base/CBRViewModel$launchOnViewModelScope$1"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel$delayedFinish$$inlined$launchOnViewModelScope$1", f = "CBRAppViewModel.kt", i = {0, 1}, l = {436, 437}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
/* loaded from: classes9.dex */
public final class CBRAppViewModel$delayedFinish$$inlined$launchOnViewModelScope$1 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
    final /* synthetic */ long $delayMs$inlined;
    final /* synthetic */ String $idDocSetType;
    final /* synthetic */ a0 $reason$inlined;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CBRAppViewModel this$0;
    final /* synthetic */ CBRViewModel this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CBRAppViewModel$delayedFinish$$inlined$launchOnViewModelScope$1(CBRViewModel cBRViewModel, String str, Continuation continuation, CBRAppViewModel cBRAppViewModel, long j12, a0 a0Var) {
        super(2, continuation);
        this.this$0$inline_fun = cBRViewModel;
        this.$idDocSetType = str;
        this.this$0 = cBRAppViewModel;
        this.$delayMs$inlined = j12;
        this.$reason$inlined = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        CBRAppViewModel$delayedFinish$$inlined$launchOnViewModelScope$1 cBRAppViewModel$delayedFinish$$inlined$launchOnViewModelScope$1 = new CBRAppViewModel$delayedFinish$$inlined$launchOnViewModelScope$1(this.this$0$inline_fun, this.$idDocSetType, continuation, this.this$0, this.$delayMs$inlined, this.$reason$inlined);
        cBRAppViewModel$delayedFinish$$inlined$launchOnViewModelScope$1.L$0 = obj;
        return cBRAppViewModel$delayedFinish$$inlined$launchOnViewModelScope$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object obj2 = "Delayed finish for ";
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        try {
        } catch (Exception e12) {
            CBRViewModel.throwError$default(this.this$0$inline_fun, e12, this.$idDocSetType, null, 4, null);
        }
        if (i12 == 0) {
            C42729a0.b(obj);
            T t12 = (T) this.L$0;
            try {
                Logger.i$default(ru.cyberity.log.a.f436064a, c.a(this.this$0), "Delayed finish for " + this.$delayMs$inlined + " ms requested with reason " + this.$reason$inlined, null, 4, null);
                N0 n02 = this.this$0.waitForLevelChangeJob;
                if (n02 != null) {
                    this.L$0 = t12;
                    this.label = 1;
                    if (n02.A(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                obj2 = t12;
            } catch (CancellationException unused) {
                obj2 = t12;
                Logger.d$default(ru.cyberity.log.a.f436064a, c.a(obj2), "CancellationException happened", null, 4, null);
                return G0.f406611a;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = (T) this.L$0;
                C42729a0.b(obj);
                CBRViewModel.finish$default(this.this$0, this.$reason$inlined, null, null, 6, null);
                return G0.f406611a;
            }
            obj2 = (T) this.L$0;
            C42729a0.b(obj);
        }
        long j12 = this.$delayMs$inlined;
        this.L$0 = obj2;
        this.label = 2;
        if (C43131e0.b(j12, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        CBRViewModel.finish$default(this.this$0, this.$reason$inlined, null, null, 6, null);
        return G0.f406611a;
    }

    @Override // Y41.p
    @l
    public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
        return ((CBRAppViewModel$delayedFinish$$inlined$launchOnViewModelScope$1) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }
}
