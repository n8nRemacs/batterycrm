package com.avito.android.user_advert.advert.delegate.multi_urgency.use_case;

import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MultiUrgencyTypeChangeUseCase.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_advert/advert/delegate/multi_urgency/e;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.MultiUrgencyTypeChangeUseCaseImpl$changeType$1", f = "MultiUrgencyTypeChangeUseCase.kt", i = {0, 1}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "invokeSuspend", n = {"$this$flow", "remoteResult"}, s = {"L$0", "L$0"})
/* loaded from: classes4.dex */
final class m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super com.avito.android.user_advert.advert.delegate.multi_urgency.e>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f308735q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f308736r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f308737s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_advert.advert.items.multi_urgency.c f308738t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_advert.advert.items.multi_urgency.c f308739u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, com.avito.android.user_advert.advert.items.multi_urgency.c cVar, com.avito.android.user_advert.advert.items.multi_urgency.c cVar2, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f308737s = oVar;
        this.f308738t = cVar;
        this.f308739u = cVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        m mVar = new m(this.f308737s, this.f308738t, this.f308739u, continuation);
        mVar.f308736r = obj;
        return mVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super com.avito.android.user_advert.advert.delegate.multi_urgency.e> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((m) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) throws java.lang.NumberFormatException {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f308735q
            com.avito.android.user_advert.advert.items.multi_urgency.c r2 = r6.f308738t
            com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.o r3 = r6.f308737s
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L22
            if (r1 != r4) goto L1a
            java.lang.Object r0 = r6.f308736r
            com.avito.android.remote.model.TypedResult r0 = (com.avito.android.remote.model.TypedResult) r0
            kotlin.C42729a0.b(r7)
            goto L54
        L1a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L22:
            java.lang.Object r1 = r6.f308736r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L3f
        L2a:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f308736r
            r1 = r7
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.c r7 = r3.f308744b
            r6.f308736r = r1
            r6.f308735q = r5
            java.lang.Object r7 = r7.a(r2, r6)
            if (r7 != r0) goto L3f
            return r0
        L3f:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.s r5 = new com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.s
            r5.<init>(r1)
            r6.f308736r = r7
            r6.f308735q = r4
            com.avito.android.user_advert.advert.items.multi_urgency.c r1 = r6.f308739u
            java.lang.Object r1 = r5.a(r7, r1, r6)
            if (r1 != r0) goto L53
            return r0
        L53:
            r0 = r7
        L54:
            boolean r7 = r0 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r7 == 0) goto L5e
            nH0.a r7 = r3.f308745c
            r7.a(r2)
        L5e:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
