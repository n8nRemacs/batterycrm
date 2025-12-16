package com.avito.android.comfortable_deal.phone_call.mvi;

import Y41.p;
import Zp.C19585c;
import com.avito.android.comfortable_deal.phone_call.mvi.entity.PhoneCallInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PhoneCallActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/phone_call/mvi/entity/PhoneCallInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.phone_call.mvi.PhoneCallActor$process$2", f = "PhoneCallActor.kt", i = {0, 1}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 30, 31}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes12.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super PhoneCallInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f122486q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f122487r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f122488s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C19585c f122489t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, C19585c c19585c, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f122488s = cVar;
        this.f122489t = c19585c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f122488s, this.f122489t, continuation);
        bVar.f122487r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PhoneCallInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
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
            int r1 = r7.f122486q
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
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            kotlin.C42729a0.b(r8)
            goto Lac
        L22:
            java.lang.Object r1 = r7.f122487r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L5f
        L2a:
            java.lang.Object r1 = r7.f122487r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L4a
        L32:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f122487r
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
            com.avito.android.comfortable_deal.phone_call.mvi.entity.PhoneCallInternalAction$ShowLoading r1 = new com.avito.android.comfortable_deal.phone_call.mvi.entity.PhoneCallInternalAction$ShowLoading
            r1.<init>()
            r7.f122487r = r8
            r7.f122486q = r5
            java.lang.Object r1 = r8.emit(r1, r7)
            if (r1 != r0) goto L49
            return r0
        L49:
            r1 = r8
        L4a:
            com.avito.android.comfortable_deal.phone_call.mvi.c r8 = r7.f122488s
            com.avito.android.comfortable_deal.repository.a r8 = r8.f122491a
            Zp.c r5 = r7.f122489t
            java.lang.String r6 = r5.f20496b
            r7.f122487r = r1
            r7.f122486q = r4
            java.lang.String r4 = r5.f20497c
            java.lang.Object r8 = r8.u(r6, r4, r7)
            if (r8 != r0) goto L5f
            return r0
        L5f:
            com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
            boolean r4 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
            r5 = 0
            if (r4 == 0) goto L86
            com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
            java.lang.Object r8 = r8.getResult()
            com.avito.android.comfortable_deal.api.model.TeamMemberPhone r8 = (com.avito.android.comfortable_deal.api.model.TeamMemberPhone) r8
            com.avito.android.comfortable_deal.phone_call.mvi.entity.PhoneCallInternalAction$ShowContent r2 = new com.avito.android.comfortable_deal.phone_call.mvi.entity.PhoneCallInternalAction$ShowContent
            java.lang.String r4 = r8.getNumber()
            boolean r8 = r8.getIsVirtual()
            r2.<init>(r4, r8)
            r7.f122487r = r5
            r7.f122486q = r3
            java.lang.Object r8 = r1.emit(r2, r7)
            if (r8 != r0) goto Lac
            return r0
        L86:
            boolean r3 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r3 == 0) goto Laf
            com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
            com.avito.android.remote.error.ApiError r3 = r8.getError()
            java.lang.Throwable r8 = r8.getCause()
            com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r3, r8)
            com.avito.android.comfortable_deal.phone_call.mvi.entity.PhoneCallInternalAction$ShowError r3 = new com.avito.android.comfortable_deal.phone_call.mvi.entity.PhoneCallInternalAction$ShowError
            com.avito.android.remote.error.ApiError r8 = com.avito.android.error.z.n(r8)
            r3.<init>(r8)
            r7.f122487r = r5
            r7.f122486q = r2
            java.lang.Object r8 = r1.emit(r3, r7)
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
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.phone_call.mvi.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
