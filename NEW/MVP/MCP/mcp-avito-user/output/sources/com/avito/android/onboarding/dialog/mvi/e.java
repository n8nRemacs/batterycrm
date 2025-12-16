package com.avito.android.onboarding.dialog.mvi;

import C40.a;
import com.avito.android.onboarding.dialog.mvi.entity.OnboardingDialogInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: OnboardingDialogActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/onboarding/dialog/mvi/entity/OnboardingDialogInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.onboarding.dialog.mvi.OnboardingDialogActor$process$5", f = "OnboardingDialogActor.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super OnboardingDialogInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f208885q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f208886r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f208887s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C40.a f208888t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C40.a aVar, h hVar, Continuation continuation) {
        super(2, continuation);
        this.f208887s = hVar;
        this.f208888t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f208888t, this.f208887s, continuation);
        eVar.f208886r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super OnboardingDialogInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f208885q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f208886r;
            A40.a aVar = this.f208887s.f208927a;
            a.e eVar = (a.e) this.f208888t;
            aVar.b(eVar.f1914b, null, false);
            OnboardingDialogInternalAction.GoToUri goToUri = new OnboardingDialogInternalAction.GoToUri(eVar.f1913a);
            this.f208885q = 1;
            if (interfaceC43172j.emit(goToUri, this) == coroutine_suspended) {
                return coroutine_suspended;
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
