package com.avito.android.oauth.presentation.mvi;

import com.avito.android.oauth.presentation.mvi.entity.OAuthInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import l40.InterfaceC43542a;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: OAuthActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.oauth.presentation.mvi.OAuthActor$process$19", f = "OAuthActor.kt", i = {0, 1}, l = {124, 125, WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes15.dex */
final class k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super OAuthInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f208342q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f208343r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C32904a f208344s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43542a f208345t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C32904a c32904a, InterfaceC43542a interfaceC43542a, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f208344s = c32904a;
        this.f208345t = interfaceC43542a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        k kVar = new k(this.f208344s, this.f208345t, continuation);
        kVar.f208343r = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super OAuthInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[RETURN] */
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
            int r1 = r5.f208342q
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.C42729a0.b(r6)
            goto L70
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            java.lang.Object r1 = r5.f208343r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r6)
            goto L5e
        L25:
            java.lang.Object r1 = r5.f208343r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r6)
            goto L45
        L2d:
            kotlin.C42729a0.b(r6)
            java.lang.Object r6 = r5.f208343r
            kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
            com.avito.android.oauth.presentation.mvi.entity.OAuthInternalAction$SetRetryButtonLoading r1 = new com.avito.android.oauth.presentation.mvi.entity.OAuthInternalAction$SetRetryButtonLoading
            r1.<init>(r4)
            r5.f208343r = r6
            r5.f208342q = r4
            java.lang.Object r1 = r6.emit(r1, r5)
            if (r1 != r0) goto L44
            return r0
        L44:
            r1 = r6
        L45:
            com.avito.android.oauth.presentation.mvi.a r6 = r5.f208344s
            com.avito.android.oauth.presentation.mvi.A r6 = r6.f208280c
            l40.a r4 = r5.f208345t
            l40.a$o r4 = (l40.InterfaceC43542a.o) r4
            l40.c$c r4 = r4.f413463a
            kotlinx.coroutines.flow.i r6 = r6.d(r4)
            r5.f208343r = r1
            r5.f208342q = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.C43175k.u(r5, r6, r1)
            if (r6 != r0) goto L5e
            return r0
        L5e:
            com.avito.android.oauth.presentation.mvi.entity.OAuthInternalAction$SetRetryButtonLoading r6 = new com.avito.android.oauth.presentation.mvi.entity.OAuthInternalAction$SetRetryButtonLoading
            r3 = 0
            r6.<init>(r3)
            r3 = 0
            r5.f208343r = r3
            r5.f208342q = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L70
            return r0
        L70:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.oauth.presentation.mvi.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
