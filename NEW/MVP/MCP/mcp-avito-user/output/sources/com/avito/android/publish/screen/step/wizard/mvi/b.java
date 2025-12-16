package com.avito.android.publish.screen.step.wizard.mvi;

import Pe0.InterfaceC14778b;
import Y41.p;
import com.avito.android.publish.screen.step.wizard.mvi.entity.WizardState;
import com.avito.android.remote.model.WizardParameter;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WizardActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LPe0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.step.wizard.mvi.WizardActor$processBackClick$1", f = "WizardActor.kt", i = {}, l = {30, 33}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC14778b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f242516q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f242517r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f242518s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ WizardState f242519t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, WizardState wizardState, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f242518s = dVar;
        this.f242519t = wizardState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f242518s, this.f242519t, continuation);
        bVar.f242517r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC14778b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        WizardParameter parent;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f242516q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f242517r;
            WizardState wizardState = this.f242519t;
            WizardParameter wizardParameter = wizardState.f242533d;
            d dVar = this.f242518s;
            dVar.getClass();
            if (wizardParameter == null || wizardParameter.getParent() == null) {
                this.f242516q = 1;
                if (d.c(dVar, interfaceC43172j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                WizardParameter wizardParameter2 = wizardState.f242533d;
                if (wizardParameter2 == null || (parent = wizardParameter2.getParent()) == null) {
                    return G0.f406611a;
                }
                this.f242516q = 2;
                if (dVar.f242525a.a(parent, wizardState.f242533d, false, interfaceC43172j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
