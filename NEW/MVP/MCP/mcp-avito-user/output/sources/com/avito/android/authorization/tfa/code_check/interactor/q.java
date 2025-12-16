package com.avito.android.authorization.tfa.code_check.interactor;

import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TfaCodeCheckPreRequestInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LTo/d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.authorization.tfa.code_check.interactor.TfaCodeCheckPreRequestInteractorImpl$request$1", f = "TfaCodeCheckPreRequestInteractor.kt", i = {0, 1, 2}, l = {62, 68, 74, 76}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes11.dex */
final class q extends SuspendLambda implements Y41.p<InterfaceC43172j<? super To.d>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f94688q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f94689r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f94690s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f94691t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ t f94692u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ArrayList arrayList, String str, t tVar, Continuation continuation) {
        super(2, continuation);
        this.f94690s = arrayList;
        this.f94691t = str;
        this.f94692u = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        q qVar = new q(this.f94690s, this.f94691t, this.f94692u, continuation);
        qVar.f94689r = obj;
        return qVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super To.d> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((q) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
    
        if (r10 == null) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0 A[RETURN] */
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
            int r1 = r9.f94688q
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L39
            if (r1 == r5) goto L31
            if (r1 == r4) goto L29
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            kotlin.C42729a0.b(r10)
            goto Lb1
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            java.lang.Object r1 = r9.f94689r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L8f
        L29:
            java.lang.Object r1 = r9.f94689r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L6f
        L31:
            java.lang.Object r1 = r9.f94689r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto La1
        L39:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f94689r
            r1 = r10
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            java.util.ArrayList r10 = r9.f94690s
            java.lang.String r6 = r9.f94691t
            com.avito.android.authorization.tfa.code_check.interactor.t r7 = r9.f94692u
            if (r10 == 0) goto L92
            boolean r8 = r10.isEmpty()
            if (r8 == 0) goto L50
            goto L92
        L50:
            int r8 = r10.size()
            if (r8 <= r5) goto L7a
            if (r6 == 0) goto L72
            com.avito.android.code_check_public.model.Phone r3 = com.avito.android.code_check_public.model.Phone.a(r6)
            boolean r10 = r10.contains(r3)
            if (r10 == 0) goto L72
            com.avito.android.code_check_public.a$a$d r10 = r7.f94706d
            r9.f94689r = r1
            r9.f94688q = r4
            java.lang.Object r10 = r7.c(r6, r10, r9)
            if (r10 != r0) goto L6f
            return r0
        L6f:
            To.d r10 = (To.d) r10
            goto La5
        L72:
            To.d$d r10 = new To.d$d
            com.avito.android.code_check_public.a$a$d r3 = r7.f94704b
            r10.<init>(r3)
            goto La5
        L7a:
            java.lang.Object r10 = kotlin.collections.C42745f0.E(r10)
            com.avito.android.code_check_public.model.Phone r10 = (com.avito.android.code_check_public.model.Phone) r10
            java.lang.String r10 = r10.f119296b
            com.avito.android.code_check_public.a$a$d r4 = r7.f94705c
            r9.f94689r = r1
            r9.f94688q = r3
            java.lang.Object r10 = r7.c(r10, r4, r9)
            if (r10 != r0) goto L8f
            return r0
        L8f:
            To.d r10 = (To.d) r10
            goto La5
        L92:
            if (r6 == 0) goto Lb4
            com.avito.android.code_check_public.a$a$d r10 = r7.f94705c
            r9.f94689r = r1
            r9.f94688q = r5
            java.lang.Object r10 = r7.c(r6, r10, r9)
            if (r10 != r0) goto La1
            return r0
        La1:
            To.d r10 = (To.d) r10
            if (r10 == 0) goto Lb4
        La5:
            r3 = 0
            r9.f94689r = r3
            r9.f94688q = r2
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto Lb1
            return r0
        Lb1:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        Lb4:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "at least one phone is required for tfa code check phone pre request"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.authorization.tfa.code_check.interactor.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
