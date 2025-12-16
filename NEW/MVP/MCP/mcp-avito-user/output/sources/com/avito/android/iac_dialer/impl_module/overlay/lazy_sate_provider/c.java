package com.avito.android.iac_dialer.impl_module.overlay.lazy_sate_provider;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.iac_dialer.impl_module.overlay.lazy_sate_provider.dialer_mediator.IacOverlayState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: IacOverlayLazyStateProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/overlay/lazy_sate_provider/dialer_mediator/IacOverlayState;", "newState", "Lkotlinx/coroutines/flow/i;", "<anonymous>", "(Lcom/avito/android/iac_dialer/impl_module/overlay/lazy_sate_provider/dialer_mediator/IacOverlayState;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.overlay.lazy_sate_provider.IacOverlayLazyStateProviderImpl$makeDelayBeforeVisibleState$1", f = "IacOverlayLazyStateProvider.kt", i = {0}, l = {66}, m = "invokeSuspend", n = {"newState"}, s = {"L$0"})
/* loaded from: classes14.dex */
final class c extends SuspendLambda implements p<IacOverlayState, Continuation<? super InterfaceC43160i<? extends IacOverlayState>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f166144q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f166145r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l0.h<IacOverlayState> f166146s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l0.h<IacOverlayState> hVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f166146s = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        c cVar = new c(this.f166146s, continuation);
        cVar.f166145r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(IacOverlayState iacOverlayState, Continuation<? super InterfaceC43160i<? extends IacOverlayState>> continuation) {
        return ((c) create(iacOverlayState, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IacOverlayState iacOverlayState;
        T t12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f166144q;
        l0.h<IacOverlayState> hVar = this.f166146s;
        if (i12 == 0) {
            C42729a0.b(obj);
            IacOverlayState iacOverlayState2 = (IacOverlayState) this.f166145r;
            t12 = iacOverlayState2;
            if (hVar.f406842b instanceof IacOverlayState.Hidden) {
                boolean z12 = iacOverlayState2 instanceof IacOverlayState.Hidden;
                t12 = iacOverlayState2;
                if (!z12) {
                    com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacOverlayLazyStateProvider", "Start delay before showing first IacOverlayState.Visible", null);
                    this.f166145r = iacOverlayState2;
                    this.f166144q = 1;
                    if (C43131e0.b(1000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    iacOverlayState = iacOverlayState2;
                }
            }
            hVar.f406842b = t12;
            return new C43210w(t12);
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        iacOverlayState = (IacOverlayState) this.f166145r;
        C42729a0.b(obj);
        t12 = iacOverlayState;
        hVar.f406842b = t12;
        return new C43210w(t12);
    }
}
