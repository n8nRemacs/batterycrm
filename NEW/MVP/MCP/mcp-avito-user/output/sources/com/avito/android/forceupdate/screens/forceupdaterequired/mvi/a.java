package com.avito.android.forceupdate.screens.forceupdaterequired.mvi;

import Y41.p;
import com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredInternalAction;
import com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ForceUpdateRequiredActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.forceupdate.screens.forceupdaterequired.mvi.ForceUpdateRequiredActor$process$1", f = "ForceUpdateRequiredActor.kt", i = {0, 3}, l = {30, 31, 33, 36, 37}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super ForceUpdateRequiredInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f158490q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f158491r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ForceUpdateRequiredState f158492s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f158493t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ForceUpdateRequiredState forceUpdateRequiredState, e eVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f158492s = forceUpdateRequiredState;
        this.f158493t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f158492s, this.f158493t, continuation);
        aVar.f158491r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ForceUpdateRequiredInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8 A[RETURN] */
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
            int r1 = r9.f158490q
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L37
            if (r1 == r7) goto L2f
            if (r1 == r6) goto L2a
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            goto L2a
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            java.lang.Object r1 = r9.f158491r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L9c
        L2a:
            kotlin.C42729a0.b(r10)
            goto La9
        L2f:
            java.lang.Object r1 = r9.f158491r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L74
        L37:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f158491r
            r1 = r10
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredState r10 = r9.f158492s
            com.avito.android.forceupdate.domain.dto.UpdateSource r10 = r10.f158516b
            boolean r8 = r10 instanceof com.avito.android.forceupdate.domain.dto.UpdateSource.SelfUpdate
            if (r8 == 0) goto L8c
            com.avito.android.forceupdate.screens.forceupdaterequired.mvi.e r10 = r9.f158493t
            com.avito.android.util.C r3 = r10.f158503c
            int r3 = r3.getF125487g()
            r4 = 29
            if (r3 >= r4) goto L61
            com.avito.android.permissions.t$a r3 = com.avito.android.permissions.t.f215141z
            r3.getClass()
            java.lang.String r3 = com.avito.android.permissions.t.a.f215143b
            com.avito.android.permissions.u r4 = r10.f158501a
            boolean r3 = r4.b(r3)
            goto L62
        L61:
            r3 = r7
        L62:
            if (r3 == 0) goto L81
            com.avito.android.forceupdate.screens.forceupdaterequired.mvi.e.c(r10)
            com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredInternalAction$DownloadStarted r10 = com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredInternalAction.DownloadStarted.f158504b
            r9.f158491r = r1
            r9.f158490q = r7
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L74
            return r0
        L74:
            com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredInternalAction$TrackClosedWithUpdate r10 = com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredInternalAction.TrackClosedWithUpdate.f158511b
            r9.f158491r = r2
            r9.f158490q = r6
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto La9
            return r0
        L81:
            com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredInternalAction$RequestPermission r10 = com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredInternalAction.RequestPermission.f158507b
            r9.f158490q = r5
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto La9
            return r0
        L8c:
            com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredInternalAction$OpenMarket r5 = new com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredInternalAction$OpenMarket
            r5.<init>(r10)
            r9.f158491r = r1
            r9.f158490q = r4
            java.lang.Object r10 = r1.emit(r5, r9)
            if (r10 != r0) goto L9c
            return r0
        L9c:
            com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredInternalAction$TrackClosedWithUpdate r10 = com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredInternalAction.TrackClosedWithUpdate.f158511b
            r9.f158491r = r2
            r9.f158490q = r3
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto La9
            return r0
        La9:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.forceupdate.screens.forceupdaterequired.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
