package com.avito.android.extended_profile;

import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSubscriptionInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile.ExtendedProfileSubscriptionInteractorImpl$changeSubscribeNotification$1", f = "ExtendedProfileSubscriptionInteractor.kt", i = {1, 2}, l = {172, 176, 178, 190}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes13.dex */
final class h0 extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f150002q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f150003r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f0 f150004s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f150005t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f150006u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f150007v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(f0 f0Var, String str, boolean z12, boolean z13, Continuation<? super h0> continuation) {
        super(2, continuation);
        this.f150004s = f0Var;
        this.f150005t = str;
        this.f150006u = z12;
        this.f150007v = z13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h0 h0Var = new h0(this.f150004s, this.f150005t, this.f150006u, this.f150007v, continuation);
        h0Var.f150003r = obj;
        return h0Var;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((h0) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0077 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) throws com.avito.android.util.ApiException {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f150002q
            boolean r2 = r9.f150006u
            java.lang.String r3 = r9.f150005t
            r4 = 4
            r5 = 3
            r6 = 2
            com.avito.android.extended_profile.f0 r7 = r9.f150004s
            r8 = 1
            if (r1 == 0) goto L3b
            if (r1 == r8) goto L37
            if (r1 == r6) goto L2f
            if (r1 == r5) goto L27
            if (r1 != r4) goto L1f
            kotlin.C42729a0.b(r10)
            goto Laa
        L1f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L27:
            java.lang.Object r1 = r9.f150003r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L78
        L2f:
            java.lang.Object r1 = r9.f150003r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L69
        L37:
            kotlin.C42729a0.b(r10)
            goto L55
        L3b:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f150003r
            kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
            I30.d r1 = r7.f149979i
            boolean r1 = r1.b()
            if (r1 != 0) goto L58
            com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction$ShowEnableNotificationDialog r1 = com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction.ShowEnableNotificationDialog.f150217b
            r9.f150002q = r8
            java.lang.Object r10 = r10.emit(r1, r9)
            if (r10 != r0) goto L55
            return r0
        L55:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        L58:
            com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction$SubscriptionNotificationChangeProgress r1 = new com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction$SubscriptionNotificationChangeProgress
            r1.<init>(r8)
            r9.f150003r = r10
            r9.f150002q = r6
            java.lang.Object r1 = r10.emit(r1, r9)
            if (r1 != r0) goto L68
            return r0
        L68:
            r1 = r10
        L69:
            com.avito.android.remote.Q r10 = r7.f149971a
            r9.f150003r = r1
            r9.f150002q = r5
            java.lang.String r5 = "extended_profile"
            java.lang.Object r10 = r10.a(r5, r3, r2, r9)
            if (r10 != r0) goto L78
            return r0
        L78:
            com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
            boolean r5 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto Lad
            com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
            java.lang.Object r10 = r10.getResult()
            kotlin.G0 r10 = (kotlin.G0) r10
            com.avito.android.r0 r10 = r7.f149974d
            boolean r5 = r9.f150007v
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
            r10.j(r6, r7, r3)
            com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction$OnSubscribeNotificationChanged r10 = new com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction$OnSubscribeNotificationChanged
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
            r10.<init>(r5, r2)
            r2 = 0
            r9.f150003r = r2
            r9.f150002q = r4
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto Laa
            return r0
        Laa:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        Lad:
            boolean r0 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto Lc0
            com.avito.android.remote.model.TypedResult$Error r10 = (com.avito.android.remote.model.TypedResult.Error) r10
            com.avito.android.remote.error.ApiError r0 = r10.getError()
            java.lang.Throwable r10 = r10.getCause()
            com.avito.android.util.ApiException r10 = com.avito.android.util.C35936s.a(r0, r10)
            throw r10
        Lc0:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
