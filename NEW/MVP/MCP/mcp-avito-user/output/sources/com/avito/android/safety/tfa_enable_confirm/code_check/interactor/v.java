package com.avito.android.safety.tfa_enable_confirm.code_check.interactor;

import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TfaEnableCodeCheckPreRequestInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LTo/d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safety.tfa_enable_confirm.code_check.interactor.TfaEnableCodeCheckPreRequestInteractorImpl$request$1", f = "TfaEnableCodeCheckPreRequestInteractor.kt", i = {0}, l = {56, 58}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class v extends SuspendLambda implements Y41.p<InterfaceC43172j<? super To.d>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f258191q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f258192r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f258193s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y f258194t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ArrayList arrayList, y yVar, Continuation continuation) {
        super(2, continuation);
        this.f258193s = arrayList;
        this.f258194t = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        v vVar = new v(this.f258193s, this.f258194t, continuation);
        vVar.f258192r = obj;
        return vVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super To.d> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((v) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[RETURN] */
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
            int r1 = r6.f258191q
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.C42729a0.b(r7)
            goto L6e
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.f258192r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L58
        L22:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f258192r
            r1 = r7
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            java.util.ArrayList r7 = r6.f258193s
            com.avito.android.safety.tfa_enable_confirm.code_check.interactor.y r4 = r6.f258194t
            if (r7 == 0) goto L5b
            boolean r5 = r7.isEmpty()
            if (r5 == 0) goto L37
            goto L5b
        L37:
            int r5 = r7.size()
            if (r5 <= r3) goto L45
            To.d$d r7 = new To.d$d
            com.avito.android.code_check_public.a$a$d r3 = r4.f258204b
            r7.<init>(r3)
            goto L62
        L45:
            java.lang.Object r7 = kotlin.collections.C42745f0.E(r7)
            com.avito.android.code_check_public.model.Phone r7 = (com.avito.android.code_check_public.model.Phone) r7
            java.lang.String r7 = r7.f119296b
            r6.f258192r = r1
            r6.f258191q = r3
            java.lang.Object r7 = com.avito.android.safety.tfa_enable_confirm.code_check.interactor.y.c(r4, r7, r6)
            if (r7 != r0) goto L58
            return r0
        L58:
            To.d r7 = (To.d) r7
            goto L62
        L5b:
            To.d$d r7 = new To.d$d
            com.avito.android.code_check_public.a$a$d r3 = r4.f258206d
            r7.<init>(r3)
        L62:
            r3 = 0
            r6.f258192r = r3
            r6.f258191q = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L6e
            return r0
        L6e:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safety.tfa_enable_confirm.code_check.interactor.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
