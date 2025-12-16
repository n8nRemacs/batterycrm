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
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.n2;
import ru.cyberity.cbr.core.data.model.CBRSDKState;
import ru.cyberity.cbr.core.data.model.g;
import ru.cyberity.cbr.core.data.model.t;
import ru.cyberity.cbr.core.data.source.dynamic.c;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V", "ru/cyberity/cbr/core/presentation/base/CBRViewModel$launchOnViewModelScope$1"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel$setDefaultSDKState$$inlined$launchOnViewModelScope$1", f = "CBRAppViewModel.kt", i = {0}, l = {435}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes9.dex */
public final class CBRAppViewModel$setDefaultSDKState$$inlined$launchOnViewModelScope$1 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
    final /* synthetic */ String $idDocSetType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CBRAppViewModel this$0;
    final /* synthetic */ CBRViewModel this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CBRAppViewModel$setDefaultSDKState$$inlined$launchOnViewModelScope$1(CBRViewModel cBRViewModel, String str, Continuation continuation, CBRAppViewModel cBRAppViewModel) {
        super(2, continuation);
        this.this$0$inline_fun = cBRViewModel;
        this.$idDocSetType = str;
        this.this$0 = cBRAppViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        CBRAppViewModel$setDefaultSDKState$$inlined$launchOnViewModelScope$1 cBRAppViewModel$setDefaultSDKState$$inlined$launchOnViewModelScope$1 = new CBRAppViewModel$setDefaultSDKState$$inlined$launchOnViewModelScope$1(this.this$0$inline_fun, this.$idDocSetType, continuation, this.this$0);
        cBRAppViewModel$setDefaultSDKState$$inlined$launchOnViewModelScope$1.L$0 = obj;
        return cBRAppViewModel$setDefaultSDKState$$inlined$launchOnViewModelScope$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        T t12;
        T t13;
        CBRSDKState cBRSDKStateA;
        ru.cyberity.cbr.core.data.source.dynamic.a<t> aVarJ;
        ru.cyberity.cbr.core.data.source.dynamic.a<g> aVarG;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        t tVarD = null;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                t12 = (T) this.L$0;
                try {
                    n2<c.a> n2VarB = this.this$0.dataRepository.b();
                    CBRAppViewModel$setDefaultSDKState$1$data$1 cBRAppViewModel$setDefaultSDKState$1$data$1 = new CBRAppViewModel$setDefaultSDKState$1$data$1(null);
                    this.L$0 = t12;
                    this.label = 1;
                    Object objX = C43175k.x(n2VarB, cBRAppViewModel$setDefaultSDKState$1$data$1, this);
                    if (objX == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    t13 = t12;
                    obj = objX;
                } catch (CancellationException unused) {
                    Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(t12), "CancellationException happened", null, 4, null);
                    return G0.f406611a;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t13 = (T) this.L$0;
                try {
                    C42729a0.b(obj);
                } catch (CancellationException unused2) {
                    t12 = t13;
                    Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(t12), "CancellationException happened", null, 4, null);
                    return G0.f406611a;
                }
            }
            c.a aVar = (c.a) obj;
            g gVarD = (aVar == null || (aVarG = aVar.g()) == null) ? null : aVarG.d();
            if (aVar != null && (aVarJ = aVar.j()) != null) {
                tVarD = aVarJ.d();
            }
            if (gVarD != null && tVarD != null && (cBRSDKStateA = ru.cyberity.cbr.core.data.model.k.a(gVarD, tVarD.d())) != null) {
                this.this$0.commonRepository.a(cBRSDKStateA);
            }
        } catch (Exception e12) {
            CBRViewModel.throwError$default(this.this$0$inline_fun, e12, this.$idDocSetType, null, 4, null);
        }
        return G0.f406611a;
    }

    @Override // Y41.p
    @l
    public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
        return ((CBRAppViewModel$setDefaultSDKState$$inlined$launchOnViewModelScope$1) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }
}
