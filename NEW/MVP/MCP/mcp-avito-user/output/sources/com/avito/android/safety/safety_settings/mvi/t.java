package com.avito.android.safety.safety_settings.mvi;

import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction;
import com.avito.android.safety.tfa_enable_confirm.code_check.TfaEnableConfirmDeeplinkResult;
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
@DebugMetadata(c = "com.avito.android.safety.safety_settings.mvi.SafetySettingsBootstrap$deeplinkHandlerFlow$1$1$1", f = "SafetySettingsBootstrap.kt", i = {0, 0}, l = {58, 60}, m = "invokeSuspend", n = {"$this$flow", "isEnabled"}, s = {"L$0", "Z$0"})
/* loaded from: classes3.dex */
final class t extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SafetySettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public boolean f257796q;

    /* renamed from: r, reason: collision with root package name */
    public int f257797r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f257798s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ TfaEnableConfirmDeeplinkResult f257799t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(TfaEnableConfirmDeeplinkResult tfaEnableConfirmDeeplinkResult, Continuation<? super t> continuation) {
        super(2, continuation);
        this.f257799t = tfaEnableConfirmDeeplinkResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        t tVar = new t(this.f257799t, continuation);
        tVar.f257798s = obj;
        return tVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SafetySettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((t) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        boolean z12;
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f257797r;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f257798s;
            z12 = this.f257799t.f258140b;
            SafetySettingsInternalAction.SwitchTfa switchTfaC = SafetySettingsInternalAction.SwitchTfa.c(z12);
            this.f257798s = interfaceC43172j2;
            this.f257796q = z12;
            this.f257797r = 1;
            if (interfaceC43172j2.emit(switchTfaC, this) == coroutine_suspended) {
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
            z12 = this.f257796q;
            interfaceC43172j = (InterfaceC43172j) this.f257798s;
            C42729a0.b(obj);
        }
        if (z12) {
            SafetySettingsInternalAction.SuccessEnableTfa successEnableTfa = SafetySettingsInternalAction.SuccessEnableTfa.f257722b;
            this.f257798s = null;
            this.f257797r = 2;
            if (interfaceC43172j.emit(successEnableTfa, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
