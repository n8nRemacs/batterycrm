package com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi;

import com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi.entity.IacFinishedMicRequestScreenInternalAction;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi.entity.IacFinishedMicRequestScreenState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: IacFinishedMicRequestScreenActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi.IacFinishedMicRequestScreenActor$onScreenStarted$1", f = "IacFinishedMicRequestScreenActor.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super IacFinishedMicRequestScreenInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f166779q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f166780r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ IacFinishedMicRequestScreenState f166781s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f166782t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, IacFinishedMicRequestScreenState iacFinishedMicRequestScreenState, Continuation continuation) {
        super(2, continuation);
        this.f166781s = iacFinishedMicRequestScreenState;
        this.f166782t = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f166782t, this.f166781s, continuation);
        fVar.f166780r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super IacFinishedMicRequestScreenInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f166779q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f166780r;
            IacFinishedMicRequestScreenState iacFinishedMicRequestScreenState = this.f166781s;
            if ((iacFinishedMicRequestScreenState instanceof IacFinishedMicRequestScreenState.Requesting) && ((IacFinishedMicRequestScreenState.Requesting) iacFinishedMicRequestScreenState).getNeedCheckUpdatesAfterSettings()) {
                IacFinishedMicRequestScreenInternalAction.InitScreen initScreen = new IacFinishedMicRequestScreenInternalAction.InitScreen(this.f166782t.f166783a.b("android.permission.RECORD_AUDIO"));
                this.f166779q = 1;
                if (interfaceC43172j.emit(initScreen, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
