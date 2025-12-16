package ru.cyberity.cbr.presentation.screen;

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
import ru.cyberity.cbr.core.data.model.g;
import ru.cyberity.cbr.core.data.source.dynamic.c;

/* compiled from: CBRAppViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/c$a;", "it", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel$setDefaultSDKState$1$data$1", f = "CBRAppViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class CBRAppViewModel$setDefaultSDKState$1$data$1 extends SuspendLambda implements p<c.a, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public CBRAppViewModel$setDefaultSDKState$1$data$1(Continuation<? super CBRAppViewModel$setDefaultSDKState$1$data$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        CBRAppViewModel$setDefaultSDKState$1$data$1 cBRAppViewModel$setDefaultSDKState$1$data$1 = new CBRAppViewModel$setDefaultSDKState$1$data$1(continuation);
        cBRAppViewModel$setDefaultSDKState$1$data$1.L$0 = obj;
        return cBRAppViewModel$setDefaultSDKState$1$data$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        ru.cyberity.cbr.core.data.source.dynamic.a<g> aVarG;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        c.a aVar = (c.a) this.L$0;
        return Boxing.boxBoolean((((aVar == null || (aVarG = aVar.g()) == null) ? null : aVarG.d()) == null || aVar.j().d() == null) ? false : true);
    }

    @Override // Y41.p
    @l
    public final Object invoke(@l c.a aVar, @l Continuation<? super Boolean> continuation) {
        return ((CBRAppViewModel$setDefaultSDKState$1$data$1) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }
}
