package com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi;

import Y41.p;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenAction;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenInternalAction;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: IacFinishedFallbackScreenActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.IacFinishedFallbackScreenActor$onCreated$1", f = "IacFinishedFallbackScreenActor.kt", i = {0, 1}, l = {45, 50, 52}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes14.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super IacFinishedFallbackScreenInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f166579q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f166580r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ IacFinishedFallbackScreenState f166581s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f166582t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ IacFinishedFallbackScreenAction f166583u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(IacFinishedFallbackScreenState iacFinishedFallbackScreenState, a aVar, IacFinishedFallbackScreenAction iacFinishedFallbackScreenAction, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f166581s = iacFinishedFallbackScreenState;
        this.f166582t = aVar;
        this.f166583u = iacFinishedFallbackScreenAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f166581s, this.f166582t, this.f166583u, continuation);
        bVar.f166580r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super IacFinishedFallbackScreenInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0088 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f166579q
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenState r6 = r9.f166581s
            if (r1 == 0) goto L30
            if (r1 == r5) goto L28
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            kotlin.C42729a0.b(r10)
            goto L89
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            java.lang.Object r1 = r9.f166580r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L7c
        L28:
            java.lang.Object r1 = r9.f166580r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L5f
        L30:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f166580r
            r1 = r10
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            com.avito.android.iac_dialer_finished.public_module.screens.finished_fallback_screen.IacFinishedFallbackScreenArgument r10 = r6.getArgument()
            com.avito.android.iac_dialer_finished.public_module.screens.finished_fallback_screen.AutomaticGsmClickSource r10 = r10.getAutomaticGsmClickSource()
            if (r10 == 0) goto L5f
            int r10 = com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.a.f166574e
            com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.a r10 = r9.f166582t
            r10.getClass()
            com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.d r7 = new com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.d
            com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenAction r8 = r9.f166583u
            r7.<init>(r6, r10, r8, r2)
            kotlinx.coroutines.flow.i r10 = kotlinx.coroutines.flow.C43175k.G(r7)
            r9.f166580r = r1
            r9.f166579q = r5
            java.lang.Object r10 = kotlinx.coroutines.flow.C43175k.u(r9, r10, r1)
            if (r10 != r0) goto L5f
            return r0
        L5f:
            com.avito.android.iac_dialer_finished.public_module.screens.finished_fallback_screen.IacFinishedFallbackScreenArgument r10 = r6.getArgument()
            java.lang.Long r10 = r10.getClosingActionTimeoutSec()
            if (r10 == 0) goto L89
            long r5 = r10.longValue()
            r10 = 1000(0x3e8, float:1.401E-42)
            long r7 = (long) r10
            long r5 = r5 * r7
            r9.f166580r = r1
            r9.f166579q = r4
            java.lang.Object r10 = kotlinx.coroutines.C43131e0.b(r5, r9)
            if (r10 != r0) goto L7c
            return r0
        L7c:
            com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenInternalAction$OnNeedToEmitClosingAction r10 = com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenInternalAction.OnNeedToEmitClosingAction.INSTANCE
            r9.f166580r = r2
            r9.f166579q = r3
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L89
            return r0
        L89:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
