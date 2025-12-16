package com.avito.android.replace_main.exit_onboarding;

import Am0.C13057a;
import Am0.C13058b;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import zm0.InterfaceC50590a;

/* compiled from: ReplaceMainExitOnboardingInteractorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/replace_main/exit_onboarding/ReplaceMainExitOnboarding;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.replace_main.exit_onboarding.ReplaceMainExitOnboardingInteractorImpl$getReplaceMainExitOnboarding$result$1", f = "ReplaceMainExitOnboardingInteractorImpl.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class e extends SuspendLambda implements p<T, Continuation<? super TypedResult<ReplaceMainExitOnboarding>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f254510q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f254511r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f254511r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new e(this.f254511r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<ReplaceMainExitOnboarding>> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f254510q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC50590a interfaceC50590a = this.f254511r.f254506d.get();
            this.f254510q = 1;
            obj = interfaceC50590a.b(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            C13058b onboarding = ((C13057a) ((TypedResult.Success) typedResult).getResult()).getOnboarding();
            return new TypedResult.Success(new ReplaceMainExitOnboarding(com.avito.android.printable_text.b.f(onboarding.getDescription()), com.avito.android.printable_text.b.f(onboarding.getButtonTitle()), onboarding.getOnceShowId()));
        }
        if (typedResult instanceof TypedResult.Error) {
            return typedResult;
        }
        throw new NoWhenBranchMatchedException();
    }
}
