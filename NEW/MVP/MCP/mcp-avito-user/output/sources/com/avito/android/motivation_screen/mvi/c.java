package com.avito.android.motivation_screen.mvi;

import com.avito.android.motivation_screen.models.MotivationInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import v20.AbstractC49150a;

/* compiled from: MotivationActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/motivation_screen/models/MotivationInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.motivation_screen.mvi.MotivationActor$process$1", f = "MotivationActor.kt", i = {1}, l = {23, AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MotivationInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f206346q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f206347r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC49150a f206348s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f206349t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AbstractC49150a abstractC49150a, d dVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f206348s = abstractC49150a;
        this.f206349t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f206348s, this.f206349t, continuation);
        cVar.f206347r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MotivationInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f206346q
            r2 = 0
            com.avito.android.motivation_screen.mvi.d r3 = r8.f206349t
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L29
            if (r1 == r6) goto L25
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L15
            goto L25
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            java.lang.Object r1 = r8.f206347r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L53
        L25:
            kotlin.C42729a0.b(r9)
            goto L74
        L29:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f206347r
            r1 = r9
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            v20.a r9 = r8.f206348s
            boolean r7 = r9 instanceof v20.AbstractC49150a.b
            if (r7 == 0) goto L42
            com.avito.android.motivation_screen.models.MotivationInternalAction$a r9 = com.avito.android.motivation_screen.models.MotivationInternalAction.a.f206333a
            r8.f206346q = r6
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L74
            return r0
        L42:
            boolean r6 = r9 instanceof v20.AbstractC49150a.c
            if (r6 == 0) goto L66
            com.avito.android.motivation_screen.models.MotivationInternalAction$c r9 = com.avito.android.motivation_screen.models.MotivationInternalAction.c.f206335a
            r8.f206347r = r1
            r8.f206346q = r5
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L53
            return r0
        L53:
            com.avito.android.motivation_screen.mvi.o r9 = r3.f206351b
            com.avito.android.motivation_screen.domain.a r9 = r9.f206367a
            kotlinx.coroutines.flow.i r9 = r9.a()
            r8.f206347r = r2
            r8.f206346q = r4
            java.lang.Object r9 = kotlinx.coroutines.flow.C43175k.u(r8, r9, r1)
            if (r9 != r0) goto L74
            return r0
        L66:
            boolean r0 = r9 instanceof v20.AbstractC49150a.C12742a
            if (r0 == 0) goto L74
            com.avito.android.deeplink_handler.handler.composite.a r0 = r3.f206350a
            v20.a$a r9 = (v20.AbstractC49150a.C12742a) r9
            com.avito.android.deep_linking.links.DeepLink r9 = r9.f440400a
            r1 = 6
            com.avito.android.deeplink_handler.handler.b.a.a(r0, r9, r2, r2, r1)
        L74:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.motivation_screen.mvi.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
