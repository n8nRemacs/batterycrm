package com.avito.android.safety.password_change.mvi;

import com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PasswordChangeActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safety.password_change.mvi.PasswordChangeActor$savePasswordAtCredman$1", f = "PasswordChangeActor.kt", i = {0, 1, 2}, l = {151, 152, 154, 156}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes3.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PasswordChangeInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f257297q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f257298r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f257299s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f257300t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f257301u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ PasswordChangeInternalAction.FinishContent f257302v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, String str2, PasswordChangeInternalAction.FinishContent finishContent, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f257299s = dVar;
        this.f257300t = str;
        this.f257301u = str2;
        this.f257302v = finishContent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f257299s, this.f257300t, this.f257301u, this.f257302v, continuation);
        cVar.f257298r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PasswordChangeInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f257297q
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L39
            if (r1 == r5) goto L31
            if (r1 == r4) goto L29
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            kotlin.C42729a0.b(r7)
            goto L8e
        L19:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L21:
            java.lang.Object r1 = r6.f257298r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L77
        L29:
            java.lang.Object r1 = r6.f257298r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L64
        L31:
            java.lang.Object r1 = r6.f257298r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L51
        L39:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f257298r
            r1 = r7
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction$CredentialsSaveStarted r7 = new com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction$CredentialsSaveStarted
            r7.<init>()
            r6.f257298r = r1
            r6.f257297q = r5
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L51
            return r0
        L51:
            com.avito.android.safety.password_change.mvi.d r7 = r6.f257299s
            com.avito.android.credman.o r7 = r7.f257306d
            r6.f257298r = r1
            r6.f257297q = r4
            java.lang.String r4 = r6.f257300t
            java.lang.String r5 = r6.f257301u
            java.lang.Object r7 = r7.a(r4, r5, r6)
            if (r7 != r0) goto L64
            return r0
        L64:
            com.avito.android.credman.o$a r7 = (com.avito.android.credman.o.a) r7
            boolean r7 = r7 instanceof com.avito.android.credman.o.a.b
            if (r7 == 0) goto L77
            com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction$DisableAutofill r7 = com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction.DisableAutofill.f257318b
            r6.f257298r = r1
            r6.f257297q = r3
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L77
            return r0
        L77:
            com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction$Finish r7 = new com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction$Finish
            com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction$FinishContent r3 = r6.f257302v
            java.lang.String r4 = r3.f257321b
            java.lang.String r3 = r3.f257322c
            r7.<init>(r4, r3)
            r3 = 0
            r6.f257298r = r3
            r6.f257297q = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L8e
            return r0
        L8e:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safety.password_change.mvi.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
