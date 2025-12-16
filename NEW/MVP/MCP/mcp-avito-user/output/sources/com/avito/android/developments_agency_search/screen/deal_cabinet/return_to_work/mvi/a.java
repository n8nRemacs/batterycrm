package com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.mvi;

import Aw.C13093d;
import Aw.InterfaceC13091b;
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

/* compiled from: ReturnToWorkActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LAw/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.mvi.ReturnToWorkActor$process$1", f = "ReturnToWorkActor.kt", i = {0, 1}, l = {21, 22, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC13091b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f137206q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f137207r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C13093d f137208s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f137209t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C13093d c13093d, b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f137208s = c13093d;
        this.f137209t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f137208s, this.f137209t, continuation);
        aVar.f137207r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC13091b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
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
            int r1 = r7.f137206q
            Aw.d r2 = r7.f137208s
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
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            kotlin.C42729a0.b(r8)
            goto Lac
        L24:
            java.lang.Object r1 = r7.f137207r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L61
        L2c:
            java.lang.Object r1 = r7.f137207r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L50
        L34:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f137207r
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
            boolean r1 = r2.f703b
            if (r1 == 0) goto L42
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        L42:
            Aw.b$b r1 = Aw.InterfaceC13091b.C0029b.f697a
            r7.f137207r = r8
            r7.f137206q = r6
            java.lang.Object r1 = r8.emit(r1, r7)
            if (r1 != r0) goto L4f
            return r0
        L4f:
            r1 = r8
        L50:
            com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.mvi.b r8 = r7.f137209t
            com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.k r8 = r8.f137210a
            java.lang.String r2 = r2.f702a
            r7.f137207r = r1
            r7.f137206q = r5
            java.lang.Object r8 = r8.b(r2, r7)
            if (r8 != r0) goto L61
            return r0
        L61:
            com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
            boolean r2 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
            r5 = 0
            if (r2 == 0) goto L8e
            com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
            java.lang.Object r8 = r8.getResult()
            Rw.a r8 = (Rw.C15086a) r8
            java.lang.Boolean r8 = r8.getResult()
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
            boolean r8 = kotlin.jvm.internal.L.f(r8, r2)
            if (r8 == 0) goto L81
            Aw.b$c r8 = Aw.InterfaceC13091b.c.f698a
            goto L83
        L81:
            Aw.b$a r8 = Aw.InterfaceC13091b.a.f696a
        L83:
            r7.f137207r = r5
            r7.f137206q = r4
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto Lac
            return r0
        L8e:
            boolean r2 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r2 == 0) goto Laf
            com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
            com.avito.android.remote.error.ApiError r2 = r8.getError()
            java.lang.Throwable r8 = r8.getCause()
            com.avito.android.util.C35936s.a(r2, r8)
            Aw.b$a r8 = Aw.InterfaceC13091b.a.f696a
            r7.f137207r = r5
            r7.f137206q = r3
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto Lac
            return r0
        Lac:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        Laf:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
