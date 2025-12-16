package com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi;

import Y41.q;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.entity.ReAgentSetProfileNameInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ReAgentSetProfileNameActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.ReAgentSetProfileNameActor$createProfile$2", f = "ReAgentSetProfileNameActor.kt", i = {0, 0}, l = {93, 94}, m = "invokeSuspend", n = {"$this$catch", "it"}, s = {"L$0", "L$1"})
/* loaded from: classes15.dex */
final class b extends SuspendLambda implements q<InterfaceC43172j<? super ReAgentSetProfileNameInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f211452q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f211453r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f211454s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f211455t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, Continuation<? super b> continuation) {
        super(3, continuation);
        this.f211455t = eVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super ReAgentSetProfileNameInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        b bVar = new b(this.f211455t, continuation);
        bVar.f211453r = interfaceC43172j;
        bVar.f211454s = th2;
        return bVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Throwable th2;
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f211452q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j2 = this.f211453r;
            th2 = this.f211454s;
            this.f211455t.c(false);
            ReAgentSetProfileNameInternalAction.FinishLoading finishLoading = ReAgentSetProfileNameInternalAction.FinishLoading.f211474b;
            this.f211453r = interfaceC43172j2;
            this.f211454s = th2;
            this.f211452q = 1;
            if (interfaceC43172j2.emit(finishLoading, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC43172j = interfaceC43172j2;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            th2 = this.f211454s;
            interfaceC43172j = this.f211453r;
            C42729a0.b(obj);
        }
        ReAgentSetProfileNameInternalAction.CreateProfileError createProfileError = new ReAgentSetProfileNameInternalAction.CreateProfileError(th2);
        this.f211453r = null;
        this.f211454s = null;
        this.f211452q = 2;
        if (interfaceC43172j.emit(createProfileError, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
