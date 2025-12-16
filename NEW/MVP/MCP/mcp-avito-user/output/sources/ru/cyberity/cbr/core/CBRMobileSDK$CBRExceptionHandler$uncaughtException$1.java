package ru.cyberity.cbr.core;

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
import kotlinx.coroutines.T;
import ru.cyberity.cbr.core.CBRMobileSDK;
import ru.cyberity.cbr.core.data.model.LogParams;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRMobileSDK.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "ru.cyberity.cbr.core.CBRMobileSDK$CBRExceptionHandler$uncaughtException$1", f = "CBRMobileSDK.kt", i = {}, l = {619}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class CBRMobileSDK$CBRExceptionHandler$uncaughtException$1 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
    final /* synthetic */ Throwable $e;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CBRMobileSDK.CBRExceptionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CBRMobileSDK$CBRExceptionHandler$uncaughtException$1(CBRMobileSDK.CBRExceptionHandler cBRExceptionHandler, Throwable th2, Continuation<? super CBRMobileSDK$CBRExceptionHandler$uncaughtException$1> continuation) {
        super(2, continuation);
        this.this$0 = cBRExceptionHandler;
        this.$e = th2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        CBRMobileSDK$CBRExceptionHandler$uncaughtException$1 cBRMobileSDK$CBRExceptionHandler$uncaughtException$1 = new CBRMobileSDK$CBRExceptionHandler$uncaughtException$1(this.this$0, this.$e, continuation);
        cBRMobileSDK$CBRExceptionHandler$uncaughtException$1.L$0 = obj;
        return cBRMobileSDK$CBRExceptionHandler$uncaughtException$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        if (i12 == 0) {
            C42729a0.b(obj);
            T t12 = (T) this.L$0;
            LogParams logParamsPrepareLogParams = this.this$0.prepareLogParams(this.$e);
            if (logParamsPrepareLogParams == null) {
                Logger.i$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(t12), "Ignoring host appliaction's exceptions", null, 4, null);
                return G0.f406611a;
            }
            ru.cyberity.log.cacher.c cVar = this.this$0.sink;
            this.label = 1;
            obj = cVar.send(logParamsPrepareLogParams, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        Boxing.boxBoolean(((Boolean) obj).booleanValue());
        return G0.f406611a;
    }

    @Override // Y41.p
    @l
    public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
        return ((CBRMobileSDK$CBRExceptionHandler$uncaughtException$1) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }
}
