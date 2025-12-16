package com.avito.android.user_adverts.tab_actions.host.mvi;

import com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAdvertsActionsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_actions.host.mvi.UserAdvertsActionsActor$awaitCptMassActivation$1", f = "UserAdvertsActionsActor.kt", i = {0}, l = {365, 366, 366}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.user_adverts.tab_actions.host.mvi.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35644d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserAdvertsActionsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f314412q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f314413r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsActionsInternalAction.ResultActionHandling.Multiple.Redirect f314414s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C35643c f314415t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35644d(UserAdvertsActionsInternalAction.ResultActionHandling.Multiple.Redirect redirect, C35643c c35643c, Continuation continuation) {
        super(2, continuation);
        this.f314414s = redirect;
        this.f314415t = c35643c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35644d c35644d = new C35644d(this.f314414s, this.f314415t, continuation);
        c35644d.f314413r = obj;
        return c35644d;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserAdvertsActionsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C35644d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[RETURN] */
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
            int r1 = r5.f314412q
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.C42729a0.b(r6)
            goto L5b
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            java.lang.Object r1 = r5.f314413r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r6)
            goto L4f
        L25:
            java.lang.Object r1 = r5.f314413r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r6)
            goto L42
        L2d:
            kotlin.C42729a0.b(r6)
            java.lang.Object r6 = r5.f314413r
            kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
            r5.f314413r = r6
            r5.f314412q = r4
            com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsInternalAction$ResultActionHandling$Multiple$Redirect r1 = r5.f314414s
            java.lang.Object r1 = r6.emit(r1, r5)
            if (r1 != r0) goto L41
            return r0
        L41:
            r1 = r6
        L42:
            r5.f314413r = r1
            r5.f314412q = r3
            com.avito.android.user_adverts.tab_actions.host.mvi.c r6 = r5.f314415t
            java.lang.Object r6 = kotlinx.coroutines.flow.C43175k.y(r6, r5)
            if (r6 != r0) goto L4f
            return r0
        L4f:
            r3 = 0
            r5.f314413r = r3
            r5.f314412q = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L5b
            return r0
        L5b:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_actions.host.mvi.C35644d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
