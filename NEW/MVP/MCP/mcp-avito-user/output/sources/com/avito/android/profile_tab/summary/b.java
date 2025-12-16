package com.avito.android.profile_tab.summary;

import Dc0.InterfaceC13384a;
import Dc0.InterfaceC13386c;
import Y41.p;
import Y61.k;
import Y61.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.T;

/* compiled from: ProfileSummaryFeatureViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_tab.summary.ProfileSummaryFeatureViewModel$accept$1", f = "ProfileSummaryFeatureViewModel.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f230847q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13384a f230848r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f230849s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC13384a interfaceC13384a, c cVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f230848r = interfaceC13384a;
        this.f230849s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f230848r, this.f230849s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f230847q;
        if (i12 == 0) {
            C42729a0.b(obj);
            if (L.f(this.f230848r, InterfaceC13384a.C0173a.f3270a)) {
                com.avito.android.arch.mvi.c cVar = (com.avito.android.arch.mvi.c) this.f230849s.f230850E.getValue();
                InterfaceC13386c.a aVar = InterfaceC13386c.a.f3271a;
                this.f230847q = 1;
                if (cVar.ya(aVar, this) == coroutine_suspended) {
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
