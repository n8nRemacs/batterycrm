package com.avito.android.mortgage_invite.client_search.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ClientSearchLoadPageUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_invite.client_search.domain.ClientSearchLoadPageUseCase$invoke$1", f = "ClientSearchLoadPageUseCase.kt", i = {0, 1}, l = {21, 23, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes15.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f205373q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f205374r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f205375s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f205376t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f205377u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, String str, int i12, Continuation continuation) {
        super(2, continuation);
        this.f205375s = bVar;
        this.f205376t = str;
        this.f205377u = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f205375s, this.f205376t, this.f205377u, continuation);
        aVar.f205374r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
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
            int r1 = r9.f205373q
            com.avito.android.mortgage_invite.client_search.domain.b r2 = r9.f205375s
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L34
            if (r1 == r6) goto L2c
            if (r1 == r5) goto L24
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            goto L1f
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            kotlin.C42729a0.b(r10)
            goto Lb4
        L24:
            java.lang.Object r1 = r9.f205374r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L69
        L2c:
            java.lang.Object r1 = r9.f205374r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L4c
        L34:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f205374r
            kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
            com.avito.android.mortgage_invite.client_search.mvi.entity.ClientSearchInternalAction$PageLoadingStarted r1 = new com.avito.android.mortgage_invite.client_search.mvi.entity.ClientSearchInternalAction$PageLoadingStarted
            r1.<init>()
            r9.f205374r = r10
            r9.f205373q = r6
            java.lang.Object r1 = r10.emit(r1, r9)
            if (r1 != r0) goto L4b
            return r0
        L4b:
            r1 = r10
        L4c:
            e20.a r10 = r2.f205378a
            r6 = 20
            long r6 = (long) r6
            java.lang.Long r6 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r6)
            int r7 = r9.f205377u
            long r7 = (long) r7
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r7)
            r9.f205374r = r1
            r9.f205373q = r5
            java.lang.String r5 = r9.f205376t
            java.lang.Object r10 = r10.c(r5, r6, r7, r9)
            if (r10 != r0) goto L69
            return r0
        L69:
            com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
            boolean r5 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
            r6 = 0
            if (r5 == 0) goto L8e
            com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
            java.lang.Object r10 = r10.getResult()
            f20.a r10 = (f20.C40220a) r10
            com.avito.android.mortgage_invite.client_search.mvi.entity.ClientSearchInternalAction$PageLoadingCompleted r3 = new com.avito.android.mortgage_invite.client_search.mvi.entity.ClientSearchInternalAction$PageLoadingCompleted
            V10.a r2 = r2.f205379b
            java.util.ArrayList r10 = r2.a(r10)
            r3.<init>(r10)
            r9.f205374r = r6
            r9.f205373q = r4
            java.lang.Object r10 = r1.emit(r3, r9)
            if (r10 != r0) goto Lb4
            return r0
        L8e:
            boolean r2 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r2 == 0) goto Lb7
            com.avito.android.remote.model.TypedResult$Error r10 = (com.avito.android.remote.model.TypedResult.Error) r10
            com.avito.android.remote.error.ApiError r2 = r10.getError()
            java.lang.Throwable r10 = r10.getCause()
            com.avito.android.util.ApiException r10 = com.avito.android.util.C35936s.a(r2, r10)
            com.avito.android.mortgage_invite.client_search.mvi.entity.ClientSearchInternalAction$PageLoadingFailed r2 = new com.avito.android.mortgage_invite.client_search.mvi.entity.ClientSearchInternalAction$PageLoadingFailed
            com.avito.android.remote.error.ApiError r10 = com.avito.android.error.z.n(r10)
            r2.<init>(r10)
            r9.f205374r = r6
            r9.f205373q = r3
            java.lang.Object r10 = r1.emit(r2, r9)
            if (r10 != r0) goto Lb4
            return r0
        Lb4:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        Lb7:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_invite.client_search.domain.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
