package com.avito.android.mortgage_invite.client_form.mvi;

import Y41.p;
import com.avito.android.mortgage_invite.client_form.mvi.entity.ApplicationClientFormInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ApplicationClientFormActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_invite.client_form.mvi.ApplicationClientFormActor$process$1", f = "ApplicationClientFormActor.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super ApplicationClientFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f205213q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f205214r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ U10.c f205215s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(U10.c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f205215s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f205215s, continuation);
        aVar.f205214r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ApplicationClientFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
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
            int r1 = r7.f205213q
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.C42729a0.b(r8)
            goto L54
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f205214r
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
            U10.c r1 = r7.f205215s
            U10.d r1 = r1.f16110c
            boolean r3 = r1 instanceof U10.d.b
            r4 = 0
            if (r3 == 0) goto L34
            U10.d$b r1 = (U10.d.b) r1
            T10.e r1 = r1.f16118a
            T10.a r1 = r1.f15294e
            if (r1 == 0) goto L32
            com.avito.android.deep_linking.links.DeepLink r1 = r1.f15276d
            goto L42
        L32:
            r1 = r4
            goto L42
        L34:
            boolean r3 = r1 instanceof U10.d.c
            if (r3 == 0) goto L32
            U10.d$c r1 = (U10.d.c) r1
            T10.f r1 = r1.f16125a
            T10.a r1 = r1.f15301e
            if (r1 == 0) goto L32
            com.avito.android.deep_linking.links.DeepLink r1 = r1.f15276d
        L42:
            if (r1 == 0) goto L54
            com.avito.android.mortgage_invite.client_form.mvi.entity.ApplicationClientFormInternalAction$HandleDeeplink r3 = new com.avito.android.mortgage_invite.client_form.mvi.entity.ApplicationClientFormInternalAction$HandleDeeplink
            r5 = 0
            r6 = 2
            r3.<init>(r1, r5, r6, r4)
            r7.f205213q = r2
            java.lang.Object r8 = r8.emit(r3, r7)
            if (r8 != r0) goto L54
            return r0
        L54:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_invite.client_form.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
