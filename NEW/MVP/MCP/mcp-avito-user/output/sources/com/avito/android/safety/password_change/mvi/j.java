package com.avito.android.safety.password_change.mvi;

import com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PasswordChangeBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safety.password_change.mvi.PasswordChangeBootstrap$validateUserIdForSessionsFlow$1", f = "PasswordChangeBootstrap.kt", i = {0}, l = {40, 40}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class j extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PasswordChangeInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f257363q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f257364r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f257365s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f257365s = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        j jVar = new j(this.f257365s, continuation);
        jVar.f257364r = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PasswordChangeInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f257363q
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.C42729a0.b(r8)
            goto L65
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            java.lang.Object r1 = r7.f257364r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L55
        L22:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f257364r
            r1 = r8
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            com.avito.android.safety.password_change.mvi.k r8 = r7.f257365s
            boolean r4 = r8.f257370e
            if (r4 != 0) goto L65
            com.avito.android.safety.password_change.PasswordChangeParams r4 = r8.f257366a
            boolean r5 = com.avito.android.safety.password_change.t.a(r4)
            if (r5 == 0) goto L65
            java.lang.String r5 = r4.f257233c
            if (r5 == 0) goto L46
            qo0.a r6 = new qo0.a
            r6.<init>(r5)
            com.avito.android.analytics.a r5 = r8.f257367b
            r5.c(r6)
        L46:
            java.lang.String r4 = r4.f257237g
            r7.f257364r = r1
            r7.f257363q = r3
            com.avito.android.safety.password_change.mvi.p r8 = r8.f257368c
            com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction r8 = r8.b(r4)
            if (r8 != r0) goto L55
            return r0
        L55:
            com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction r8 = (com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction) r8
            if (r8 == 0) goto L65
            r3 = 0
            r7.f257364r = r3
            r7.f257363q = r2
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L65
            return r0
        L65:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safety.password_change.mvi.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
