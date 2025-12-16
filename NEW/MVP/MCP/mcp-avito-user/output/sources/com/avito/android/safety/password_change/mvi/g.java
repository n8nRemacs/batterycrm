package com.avito.android.safety.password_change.mvi;

import com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PasswordChangeBootstrap.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safety.password_change.mvi.PasswordChangeBootstrap$getCredmanLoaderFlow$1", f = "PasswordChangeBootstrap.kt", i = {0, 2}, l = {57, 59, 63, 64}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PasswordChangeInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f257354q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f257355r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f257356s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f257356s = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f257356s, continuation);
        gVar.f257355r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PasswordChangeInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008e A[RETURN] */
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
            int r1 = r8.f257354q
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L32
            if (r1 == r6) goto L2a
            if (r1 == r5) goto L26
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            goto L26
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            java.lang.Object r1 = r8.f257355r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L7d
        L26:
            kotlin.C42729a0.b(r9)
            goto L8f
        L2a:
            java.lang.Object r1 = r8.f257355r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L4b
        L32:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f257355r
            kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
            com.avito.android.safety.password_change.mvi.k r1 = r8.f257356s
            com.avito.android.credman.f r1 = r1.f257371f
            r8.f257355r = r9
            r8.f257354q = r6
            java.lang.Object r1 = r1.a(r8)
            if (r1 != r0) goto L48
            return r0
        L48:
            r7 = r1
            r1 = r9
            r9 = r7
        L4b:
            com.avito.android.credman.f$a r9 = (com.avito.android.credman.f.a) r9
            boolean r6 = r9 instanceof com.avito.android.credman.f.a.C3825a
            if (r6 == 0) goto L63
            com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction$FocusInput r9 = new com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction$FocusInput
            com.avito.android.safety.password_change.mvi.entity.InputType r3 = com.avito.android.safety.password_change.mvi.entity.InputType.f257311b
            r9.<init>(r3)
            r8.f257355r = r2
            r8.f257354q = r5
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L8f
            return r0
        L63:
            boolean r5 = r9 instanceof com.avito.android.credman.f.a.b
            if (r5 == 0) goto L8f
            com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction$CredentialsLoaded r5 = new com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction$CredentialsLoaded
            com.avito.android.credman.f$a$b r9 = (com.avito.android.credman.f.a.b) r9
            java.lang.String r6 = r9.f129088a
            java.lang.String r9 = r9.f129089b
            r5.<init>(r6, r9)
            r8.f257355r = r1
            r8.f257354q = r4
            java.lang.Object r9 = r1.emit(r5, r8)
            if (r9 != r0) goto L7d
            return r0
        L7d:
            com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction$FocusInput r9 = new com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction$FocusInput
            com.avito.android.safety.password_change.mvi.entity.InputType r4 = com.avito.android.safety.password_change.mvi.entity.InputType.f257312c
            r9.<init>(r4)
            r8.f257355r = r2
            r8.f257354q = r3
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L8f
            return r0
        L8f:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safety.password_change.mvi.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
