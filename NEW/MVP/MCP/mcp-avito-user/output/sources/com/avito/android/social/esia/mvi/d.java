package com.avito.android.social.esia.mvi;

import Y41.p;
import Yw0.InterfaceC18342b;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EsiaAuthInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LYw0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.social.esia.mvi.EsiaAuthInteractor$getEsiaAuthUrl$1", f = "EsiaAuthInteractor.kt", i = {0, 1}, l = {18, 20, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC18342b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f284396q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f284397r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f284398s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f284398s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f284398s, continuation);
        dVar.f284397r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC18342b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.f284396q
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L32
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            goto L1d
        L15:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1d:
            kotlin.C42729a0.b(r15)
            goto L9f
        L22:
            java.lang.Object r1 = r14.f284397r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r15)
            goto L5e
        L2a:
            java.lang.Object r1 = r14.f284397r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r15)
            goto L47
        L32:
            kotlin.C42729a0.b(r15)
            java.lang.Object r15 = r14.f284397r
            kotlinx.coroutines.flow.j r15 = (kotlinx.coroutines.flow.InterfaceC43172j) r15
            Yw0.b$c r1 = Yw0.InterfaceC18342b.c.f19745a
            r14.f284397r = r15
            r14.f284396q = r5
            java.lang.Object r1 = r15.emit(r1, r14)
            if (r1 != r0) goto L46
            return r0
        L46:
            r1 = r15
        L47:
            com.avito.android.social.esia.mvi.c r15 = r14.f284398s
            com.avito.android.remote.profile.generated.api.ProfileApi r5 = r15.f284394a
            r14.f284397r = r1
            r14.f284396q = r4
            r11 = 0
            r12 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 11
            r13 = r14
            java.lang.Object r15 = r5.socialRedirectV2(r6, r7, r8, r9, r11, r12, r13)
            if (r15 != r0) goto L5e
            return r0
        L5e:
            com.avito.android.remote.model.TypedResult r15 = (com.avito.android.remote.model.TypedResult) r15
            boolean r4 = r15 instanceof com.avito.android.remote.model.TypedResult.Success
            r5 = 0
            if (r4 == 0) goto L81
            com.avito.android.remote.model.TypedResult$Success r15 = (com.avito.android.remote.model.TypedResult.Success) r15
            java.lang.Object r15 = r15.getResult()
            bl0.a r15 = (bl0.C25675a) r15
            Yw0.b$b r2 = new Yw0.b$b
            java.lang.String r15 = r15.getRedirectUrl()
            r2.<init>(r15)
            r14.f284397r = r5
            r14.f284396q = r3
            java.lang.Object r15 = r1.emit(r2, r14)
            if (r15 != r0) goto L9f
            return r0
        L81:
            boolean r3 = r15 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r3 == 0) goto La2
            com.avito.android.remote.model.TypedResult$Error r15 = (com.avito.android.remote.model.TypedResult.Error) r15
            com.avito.android.remote.error.ApiError r3 = r15.getError()
            java.lang.Throwable r15 = r15.getCause()
            com.avito.android.util.C35936s.a(r3, r15)
            Yw0.b$a r15 = Yw0.InterfaceC18342b.a.f19743a
            r14.f284397r = r5
            r14.f284396q = r2
            java.lang.Object r15 = r1.emit(r15, r14)
            if (r15 != r0) goto L9f
            return r0
        L9f:
            kotlin.G0 r15 = kotlin.G0.f406611a
            return r15
        La2:
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.social.esia.mvi.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
