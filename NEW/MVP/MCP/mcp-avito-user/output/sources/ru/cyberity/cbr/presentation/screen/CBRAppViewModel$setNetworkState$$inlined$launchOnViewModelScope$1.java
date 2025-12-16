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
import kotlinx.coroutines.T;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.log.c;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V", "ru/cyberity/cbr/core/presentation/base/CBRViewModel$launchOnViewModelScope$1"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel$setNetworkState$$inlined$launchOnViewModelScope$1", f = "CBRAppViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class CBRAppViewModel$setNetworkState$$inlined$launchOnViewModelScope$1 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
    final /* synthetic */ String $idDocSetType;
    final /* synthetic */ String $networkType$inlined;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CBRAppViewModel this$0;
    final /* synthetic */ CBRViewModel this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CBRAppViewModel$setNetworkState$$inlined$launchOnViewModelScope$1(CBRViewModel cBRViewModel, String str, Continuation continuation, CBRAppViewModel cBRAppViewModel, String str2) {
        super(2, continuation);
        this.this$0$inline_fun = cBRViewModel;
        this.$idDocSetType = str;
        this.this$0 = cBRAppViewModel;
        this.$networkType$inlined = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        CBRAppViewModel$setNetworkState$$inlined$launchOnViewModelScope$1 cBRAppViewModel$setNetworkState$$inlined$launchOnViewModelScope$1 = new CBRAppViewModel$setNetworkState$$inlined$launchOnViewModelScope$1(this.this$0$inline_fun, this.$idDocSetType, continuation, this.this$0, this.$networkType$inlined);
        cBRAppViewModel$setNetworkState$$inlined$launchOnViewModelScope$1.L$0 = obj;
        return cBRAppViewModel$setNetworkState$$inlined$launchOnViewModelScope$1;
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
        try {
            this.this$0.settingsRepository.b(this.$networkType$inlined);
        } catch (CancellationException unused) {
            Logger.d$default(ru.cyberity.log.a.f436064a, c.a(t12), "CancellationException happened", null, 4, null);
        } catch (Exception e12) {
            CBRViewModel.throwError$default(this.this$0$inline_fun, e12, this.$idDocSetType, null, 4, null);
        }
        return G0.f406611a;
    }

    @Override // Y41.p
    @l
    public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
        return ((CBRAppViewModel$setNetworkState$$inlined$launchOnViewModelScope$1) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }
}
