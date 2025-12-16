package com.avito.android.mortgage.landing.mvi;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.landing.mvi.entity.LandingInternalAction;
import com.avito.android.mortgage.landing.mvi.entity.LandingState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: LandingActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.landing.mvi.LandingActor$process$3", f = "LandingActor.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super LandingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f200105q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f200106r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LandingState f200107s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LandingState landingState, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f200107s = landingState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f200107s, continuation);
        dVar.f200106r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super LandingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        DeepLink deepLink;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f200105q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f200106r;
            LandingState landingState = this.f200107s;
            String str = landingState.f200231g;
            if (str != null && (deepLink = landingState.f200232h) != null) {
                LandingInternalAction.OpenApplicationClicked openApplicationClicked = new LandingInternalAction.OpenApplicationClicked(str, deepLink);
                this.f200105q = 1;
                if (interfaceC43172j.emit(openApplicationClicked, this) == coroutine_suspended) {
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
