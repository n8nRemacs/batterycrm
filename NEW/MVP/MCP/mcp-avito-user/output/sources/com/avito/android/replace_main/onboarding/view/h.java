package com.avito.android.replace_main.onboarding.view;

import Cm0.C13324a;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.T;

/* compiled from: ReplaceMainOnboardingContent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.replace_main.onboarding.view.ReplaceMainOnboardingContentKt$ReplaceMainOnboardingContent$2$1$1", f = "ReplaceMainOnboardingContent.kt", i = {}, l = {79, 91}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class h extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f254535q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f254536r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ N f254537s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C13324a f254538t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ N f254539u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ N f254540v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(p pVar, Y41.l<? super ApiError, G0> lVar, C13324a c13324a, Y41.a<G0> aVar, Y41.a<G0> aVar2, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f254536r = pVar;
        this.f254537s = (N) lVar;
        this.f254538t = c13324a;
        this.f254539u = (N) aVar;
        this.f254540v = (N) aVar2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r5v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        ?? r42 = this.f254539u;
        ?? r52 = this.f254540v;
        return new h(this.f254536r, this.f254537s, this.f254538t, r42, r52, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r6v15, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r6v17, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f254535q;
        p pVar = this.f254536r;
        if (i12 == 0) {
            C42729a0.b(obj);
            U20.e eVar = pVar.f254567b.get();
            BottomNavigationSpace bottomNavigationSpace = BottomNavigationSpace.f107066c;
            this.f254535q = 1;
            obj = eVar.c(bottomNavigationSpace, true, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                this.f254539u.invoke();
                this.f254540v.invoke();
                return G0.f406611a;
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Error) {
            this.f254537s.invoke(((TypedResult.Error) typedResult).getError());
        } else if (typedResult instanceof TypedResult.Success) {
            InterfaceC43076a0<G0> interfaceC43076a0F = pVar.f254568c.get().f(this.f254538t.f2656c.f2664b);
            this.f254535q = 2;
            if (interfaceC43076a0F.F(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f254539u.invoke();
        }
        this.f254540v.invoke();
        return G0.f406611a;
    }
}
