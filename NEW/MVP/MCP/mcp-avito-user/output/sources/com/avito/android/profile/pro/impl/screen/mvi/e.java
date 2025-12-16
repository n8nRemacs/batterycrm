package com.avito.android.profile.pro.impl.screen.mvi;

import Y41.q;
import java.io.Serializable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ProfileProActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LD90/a;", "Lkotlin/Q;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Q;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.mvi.ProfileProActor$processCallsCountChange$3", f = "ProfileProActor.kt", i = {0, 0, 0}, l = {333, 345}, m = "invokeSuspend", n = {"$this$transformLatest", "countCallTracking", "countHistory"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes16.dex */
final class e extends SuspendLambda implements q<InterfaceC43172j<? super D90.a>, Q<? extends Integer, ? extends Integer>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f223689q;

    /* renamed from: r, reason: collision with root package name */
    public int f223690r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f223691s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Serializable f223692t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a<D90.d> f223693u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Y41.a<D90.d> aVar, Continuation<? super e> continuation) {
        super(3, continuation);
        this.f223693u = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super D90.a> interfaceC43172j, Q<? extends Integer, ? extends Integer> q12, Continuation<? super G0> continuation) {
        e eVar = new e(this.f223693u, continuation);
        eVar.f223691s = interfaceC43172j;
        eVar.f223692t = q12;
        return eVar.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
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
            int r1 = r7.f223690r
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.C42729a0.b(r8)
            goto L7f
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            int r1 = r7.f223689q
            java.io.Serializable r3 = r7.f223692t
            java.lang.Integer r3 = (java.lang.Integer) r3
            kotlinx.coroutines.flow.j r4 = r7.f223691s
            kotlin.C42729a0.b(r8)
            goto L54
        L26:
            kotlin.C42729a0.b(r8)
            kotlinx.coroutines.flow.j r4 = r7.f223691s
            java.io.Serializable r8 = r7.f223692t
            kotlin.Q r8 = (kotlin.Q) r8
            A r1 = r8.f406619b
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            B r8 = r8.f406620c
            java.lang.Integer r8 = (java.lang.Integer) r8
            D90.a$c r5 = new D90.a$c
            int r6 = r8.intValue()
            r5.<init>(r1, r6)
            r7.f223691s = r4
            r7.f223692t = r8
            r7.f223689q = r1
            r7.f223690r = r3
            java.lang.Object r3 = r4.emit(r5, r7)
            if (r3 != r0) goto L53
            return r0
        L53:
            r3 = r8
        L54:
            Y41.a<D90.d> r8 = r7.f223693u
            java.lang.Object r8 = r8.invoke()
            D90.d r8 = (D90.d) r8
            boolean r5 = r8.f3062b
            if (r5 != 0) goto L7f
            int r5 = r8.f3069i
            if (r5 != r1) goto L6f
            if (r3 != 0) goto L67
            goto L6f
        L67:
            int r1 = r3.intValue()
            int r8 = r8.f3070j
            if (r8 == r1) goto L7f
        L6f:
            D90.a$x r8 = D90.a.x.f3006a
            r1 = 0
            r7.f223691s = r1
            r7.f223692t = r1
            r7.f223690r = r2
            java.lang.Object r8 = r4.emit(r8, r7)
            if (r8 != r0) goto L7f
            return r0
        L7f:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.pro.impl.screen.mvi.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
