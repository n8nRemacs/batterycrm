package com.avito.android.safety.safety_settings.mvi;

import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafetySettingsBootstrap.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safety.safety_settings.mvi.SafetySettingsBootstrap$createOnFailureSessionDeleteFlow$1", f = "SafetySettingsBootstrap.kt", i = {0}, l = {91, 92}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class q extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SafetySettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f257787q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f257788r;

    public q() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        q qVar = new q(2, continuation);
        qVar.f257788r = obj;
        return qVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SafetySettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((q) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f257787q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f257788r;
            SafetySettingsInternalAction.ShowSessionDeleteError showSessionDeleteError = SafetySettingsInternalAction.ShowSessionDeleteError.f257717b;
            this.f257788r = interfaceC43172j;
            this.f257787q = 1;
            if (interfaceC43172j.emit(showSessionDeleteError, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f257788r;
            C42729a0.b(obj);
        }
        SafetySettingsInternalAction.CloseSessionBottomSheet closeSessionBottomSheetC = SafetySettingsInternalAction.CloseSessionBottomSheet.c(true);
        this.f257788r = null;
        this.f257787q = 2;
        if (interfaceC43172j.emit(closeSessionBottomSheetC, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
