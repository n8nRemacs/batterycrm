package com.avito.android.beduin.v2.onboarding.impl.deeplinks;

import Y41.p;
import Y61.l;
import com.avito.android.remote.InterfaceC34389t0;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.V2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: BeduinV2OnboardingDeepLinkHandlerInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.beduin.v2.onboarding.impl.deeplinks.BeduinV2OnboardingDeepLinkHandlerInteractor$setOnboardingCloseStatus$1", f = "BeduinV2OnboardingDeepLinkHandlerInteractor.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class g extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f104712q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f104713r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f104714s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f104715t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, String str, String str2, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f104713r = hVar;
        this.f104714s = str;
        this.f104715t = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        return new g(this.f104713r, this.f104714s, this.f104715t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String message;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f104712q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC34389t0 interfaceC34389t0 = this.f104713r.f104716a;
            this.f104712q = 1;
            obj = interfaceC34389t0.a(this.f104714s, this.f104715t, this);
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
        if (typedResult instanceof TypedResult.Error) {
            V2 v22 = V2.f318762a;
            Throwable cause = ((TypedResult.Error) typedResult).getCause();
            if (cause == null || (message = cause.getMessage()) == null) {
                message = "";
            }
            v22.d("OnboardingPresenter close error", message);
        }
        return G0.f406611a;
    }
}
