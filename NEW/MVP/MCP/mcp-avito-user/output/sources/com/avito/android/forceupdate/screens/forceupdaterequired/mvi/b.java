package com.avito.android.forceupdate.screens.forceupdaterequired.mvi;

import Y41.p;
import com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ForceUpdateRequiredActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.forceupdate.screens.forceupdaterequired.mvi.ForceUpdateRequiredActor$process$2", f = "ForceUpdateRequiredActor.kt", i = {0, 1}, l = {42, 43, 44}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes13.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super ForceUpdateRequiredInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f158494q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f158495r;

    public b() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(2, continuation);
        bVar.f158495r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ForceUpdateRequiredInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f158494q
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.C42729a0.b(r6)
            goto L5d
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            java.lang.Object r1 = r5.f158495r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r6)
            goto L4f
        L25:
            java.lang.Object r1 = r5.f158495r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r6)
            goto L42
        L2d:
            kotlin.C42729a0.b(r6)
            java.lang.Object r6 = r5.f158495r
            kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
            com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredInternalAction$OpenMavInWebView r1 = com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredInternalAction.OpenMavInWebView.f158506b
            r5.f158495r = r6
            r5.f158494q = r4
            java.lang.Object r1 = r6.emit(r1, r5)
            if (r1 != r0) goto L41
            return r0
        L41:
            r1 = r6
        L42:
            com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredInternalAction$TrackClosedWithGoingToMav r6 = com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredInternalAction.TrackClosedWithGoingToMav.f158509b
            r5.f158495r = r1
            r5.f158494q = r3
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L4f
            return r0
        L4f:
            com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredInternalAction$TrackWebViewGoToMavManually r6 = com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredInternalAction.TrackWebViewGoToMavManually.f158513b
            r3 = 0
            r5.f158495r = r3
            r5.f158494q = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L5d
            return r0
        L5d:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.forceupdate.screens.forceupdaterequired.mvi.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
