package com.avito.android.authorization.auto_recovery;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.authorization.generated.api.ar_flow_v_2.ArFlowV2Response;
import com.avito.android.remote.model.TypedResult;
import com.huawei.hms.adapter.internal.AvailableCode;
import ie.InterfaceC41389a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: AutoRecoveryAvailabilityInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/authorization/generated/api/ar_flow_v_2/ArFlowV2Response;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.authorization.auto_recovery.AutoRecoveryAvailabilityInteractorImpl$getRecoveryFlow$1", f = "AutoRecoveryAvailabilityInteractor.kt", i = {}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super TypedResult<ArFlowV2Response>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f93069q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f93070r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f93070r = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f93070r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<ArFlowV2Response>> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f93069q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC41389a interfaceC41389a = this.f93070r.f93072a.get();
            this.f93069q = 1;
            obj = interfaceC41389a.d(this);
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
}
