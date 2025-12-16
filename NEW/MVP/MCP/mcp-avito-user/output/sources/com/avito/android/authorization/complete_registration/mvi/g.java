package com.avito.android.authorization.complete_registration.mvi;

import Wd.InterfaceC15745b;
import Y41.p;
import com.avito.android.authorization.complete_registration.mvi.entity.CompleteRegistrationInternalAction;
import com.avito.android.remote.model.AuthResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CompleteRegistrationInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.authorization.complete_registration.mvi.CompleteRegistrationInteractorImpl$completeRegistration$2", f = "CompleteRegistrationInteractor.kt", i = {0, 1, 2}, l = {165, 166, 167, 168}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes11.dex */
final class g extends SuspendLambda implements p<InterfaceC43172j<? super CompleteRegistrationInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f93483q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f93484r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f93485s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15745b.C1278b f93486t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AuthResult f93487u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f93488v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f93489w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, InterfaceC15745b.C1278b c1278b, AuthResult authResult, String str, String str2, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f93485s = hVar;
        this.f93486t = c1278b;
        this.f93487u = authResult;
        this.f93488v = str;
        this.f93489w = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f93485s, this.f93486t, this.f93487u, this.f93488v, this.f93489w, continuation);
        gVar.f93484r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CompleteRegistrationInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f93483q
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            com.avito.android.authorization.complete_registration.mvi.h r7 = r0.f93485s
            if (r2 == 0) goto L3d
            if (r2 == r6) goto L35
            if (r2 == r5) goto L2d
            if (r2 == r4) goto L25
            if (r2 != r3) goto L1d
            kotlin.C42729a0.b(r20)
            goto Lae
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L25:
            java.lang.Object r2 = r0.f93484r
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            kotlin.C42729a0.b(r20)
            goto La0
        L2d:
            java.lang.Object r2 = r0.f93484r
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            kotlin.C42729a0.b(r20)
            goto L8f
        L35:
            java.lang.Object r2 = r0.f93484r
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            kotlin.C42729a0.b(r20)
            goto L82
        L3d:
            kotlin.C42729a0.b(r20)
            java.lang.Object r2 = r0.f93484r
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            Yd.a r8 = r7.f93493d
            Wd.b$a$a r9 = Wd.InterfaceC15745b.a.f17990c
            com.avito.android.remote.model.AuthResult r10 = r0.f93487u
            com.avito.android.remote.model.Profile r11 = r10.getProfile()
            java.lang.String r11 = r11.getUserHashId()
            r9.getClass()
            Wd.b$b r9 = r0.f93486t
            Wd.b$a r9 = Wd.InterfaceC15745b.a.C1277a.a(r9, r11)
            r8.a(r9)
            com.avito.android.remote.model.Session r12 = r10.getSession()
            com.avito.android.remote.model.Profile r13 = r10.getProfile()
            com.avito.android.account.analytics.event.SaveSuggestEvent$Source r18 = com.avito.android.account.analytics.event.SaveSuggestEvent.Source.f68108d
            r16 = 0
            java.lang.String r8 = r0.f93488v
            com.avito.android.account.a r11 = r7.f93491b
            r14 = 0
            java.lang.String r15 = "registration_complete"
            r17 = r8
            io.reactivex.rxjava3.internal.operators.completable.K r8 = r11.d(r12, r13, r14, r15, r16, r17, r18)
            r0.f93484r = r2
            r0.f93483q = r6
            java.lang.Object r6 = kotlinx.coroutines.rx3.C43292o.a(r8, r0)
            if (r6 != r1) goto L82
            return r1
        L82:
            com.avito.android.authorization.complete_registration.mvi.entity.CompleteRegistrationInternalAction$ShowCredman r6 = com.avito.android.authorization.complete_registration.mvi.entity.CompleteRegistrationInternalAction.ShowCredman.f93473b
            r0.f93484r = r2
            r0.f93483q = r5
            java.lang.Object r5 = r2.emit(r6, r0)
            if (r5 != r1) goto L8f
            return r1
        L8f:
            com.avito.android.credman.o r5 = r7.f93495f
            r0.f93484r = r2
            r0.f93483q = r4
            java.lang.String r4 = r0.f93488v
            java.lang.String r6 = r0.f93489w
            java.lang.Object r4 = r5.a(r4, r6, r0)
            if (r4 != r1) goto La0
            return r1
        La0:
            com.avito.android.authorization.complete_registration.mvi.entity.CompleteRegistrationInternalAction$Completed r4 = com.avito.android.authorization.complete_registration.mvi.entity.CompleteRegistrationInternalAction.Completed.f93465b
            r5 = 0
            r0.f93484r = r5
            r0.f93483q = r3
            java.lang.Object r2 = r2.emit(r4, r0)
            if (r2 != r1) goto Lae
            return r1
        Lae:
            kotlin.G0 r1 = kotlin.G0.f406611a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.authorization.complete_registration.mvi.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
