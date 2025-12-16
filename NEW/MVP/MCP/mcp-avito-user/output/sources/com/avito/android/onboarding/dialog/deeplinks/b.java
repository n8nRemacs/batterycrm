package com.avito.android.onboarding.dialog.deeplinks;

import Y41.p;
import Y61.k;
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

/* compiled from: OnboardingDeepLinkHandlerInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.onboarding.dialog.deeplinks.OnboardingDeepLinkHandlerInteractor$setOnboardingCloseStatus$1", f = "OnboardingDeepLinkHandlerInteractor.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f208764q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f208765r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f208766s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f208767t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, String str2, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f208765r = cVar;
        this.f208766s = str;
        this.f208767t = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f208765r, this.f208766s, this.f208767t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        String message;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f208764q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC34389t0 interfaceC34389t0 = this.f208765r.f208768a;
            this.f208764q = 1;
            obj = interfaceC34389t0.a(this.f208766s, this.f208767t, this);
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
