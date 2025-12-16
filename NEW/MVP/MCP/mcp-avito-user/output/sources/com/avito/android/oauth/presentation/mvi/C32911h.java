package com.avito.android.oauth.presentation.mvi;

import com.avito.android.oauth.presentation.mvi.entity.OAuthInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: OAuthActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.oauth.presentation.mvi.OAuthActor$process$16", f = "OAuthActor.kt", i = {0, 1}, l = {106, 107, 108}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* renamed from: com.avito.android.oauth.presentation.mvi.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32911h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super OAuthInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f208333q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f208334r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C32904a f208335s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32911h(C32904a c32904a, Continuation<? super C32911h> continuation) {
        super(2, continuation);
        this.f208335s = c32904a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32911h c32911h = new C32911h(this.f208335s, continuation);
        c32911h.f208334r = obj;
        return c32911h;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super OAuthInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C32911h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0069 A[RETURN] */
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
            int r1 = r5.f208333q
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.C42729a0.b(r6)
            goto L6a
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            java.lang.Object r1 = r5.f208334r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r6)
            goto L58
        L25:
            java.lang.Object r1 = r5.f208334r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r6)
            goto L45
        L2d:
            kotlin.C42729a0.b(r6)
            java.lang.Object r6 = r5.f208334r
            kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
            com.avito.android.oauth.presentation.mvi.entity.OAuthInternalAction$SetRetryButtonLoading r1 = new com.avito.android.oauth.presentation.mvi.entity.OAuthInternalAction$SetRetryButtonLoading
            r1.<init>(r4)
            r5.f208334r = r6
            r5.f208333q = r4
            java.lang.Object r1 = r6.emit(r1, r5)
            if (r1 != r0) goto L44
            return r0
        L44:
            r1 = r6
        L45:
            com.avito.android.oauth.presentation.mvi.a r6 = r5.f208335s
            com.avito.android.oauth.presentation.mvi.A r6 = r6.f208280c
            kotlinx.coroutines.flow.i r6 = r6.b()
            r5.f208334r = r1
            r5.f208333q = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.C43175k.u(r5, r6, r1)
            if (r6 != r0) goto L58
            return r0
        L58:
            com.avito.android.oauth.presentation.mvi.entity.OAuthInternalAction$SetRetryButtonLoading r6 = new com.avito.android.oauth.presentation.mvi.entity.OAuthInternalAction$SetRetryButtonLoading
            r3 = 0
            r6.<init>(r3)
            r3 = 0
            r5.f208334r = r3
            r5.f208333q = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L6a
            return r0
        L6a:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.oauth.presentation.mvi.C32911h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
