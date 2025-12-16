package com.avito.android.wallet.pin.impl.creation.mvi.components;

import com.avito.android.wallet.pin.impl.creation.mvi.entity.WalletPinCreationInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WalletPinCreationActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.creation.mvi.components.WalletPinCreationActor$process$1", f = "WalletPinCreationActor.kt", i = {0}, l = {53, 55, 54}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WalletPinCreationInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f328544q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f328545r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f328546s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f328546s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f328546s, continuation);
        eVar.f328545r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super WalletPinCreationInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6 A[RETURN] */
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
            int r1 = r6.f328544q
            com.avito.android.wallet.pin.impl.creation.mvi.components.a r2 = r6.f328546s
            r3 = 3
            r4 = 1
            r5 = 2
            if (r1 == 0) goto L30
            if (r1 == r4) goto L28
            if (r1 == r5) goto L20
            if (r1 != r3) goto L18
            kotlin.C42729a0.b(r7)
            goto La7
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L20:
            java.lang.Object r1 = r6.f328545r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L5f
        L28:
            java.lang.Object r1 = r6.f328545r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L48
        L30:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f328545r
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            com.avito.android.wallet.pin.impl.creation.mvi.entity.WalletPinCreationInternalAction$ShowContentLoading r1 = new com.avito.android.wallet.pin.impl.creation.mvi.entity.WalletPinCreationInternalAction$ShowContentLoading
            r1.<init>()
            r6.f328545r = r7
            r6.f328544q = r4
            java.lang.Object r1 = r7.emit(r1, r6)
            if (r1 != r0) goto L47
            return r0
        L47:
            r1 = r7
        L48:
            com.avito.android.wallet.pin.impl.creation.mvi.a r7 = r2.f328515a
            r6.f328545r = r1
            r6.f328544q = r5
            h31.e<gP0.a> r7 = r7.f328511a
            java.lang.Object r7 = r7.get()
            gP0.a r7 = (gP0.InterfaceC40610a) r7
            java.lang.String r4 = r2.f328516b
            java.lang.Object r7 = r7.a(r4, r6)
            if (r7 != r0) goto L5f
            return r0
        L5f:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            r5 = 0
            if (r4 == 0) goto L85
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r7 = r7.getResult()
            hP0.b r7 = (hP0.C40864b) r7
            com.avito.android.analytics.a r2 = r2.f328517c
            hP0.a r4 = r7.getEvents()
            if (r4 == 0) goto L7b
            dP0.a r4 = r4.getCreatePageLoad()
            goto L7c
        L7b:
            r4 = r5
        L7c:
            cP0.C27083a.a(r2, r4, r5)
            com.avito.android.wallet.pin.impl.creation.mvi.entity.WalletPinCreationInternalAction$ShowContent r2 = new com.avito.android.wallet.pin.impl.creation.mvi.entity.WalletPinCreationInternalAction$ShowContent
            r2.<init>(r7)
            goto L9c
        L85:
            boolean r2 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r2 == 0) goto Laa
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            com.avito.android.remote.error.ApiError r2 = r7.getError()
            java.lang.Throwable r7 = r7.getCause()
            com.avito.android.util.ApiException r7 = com.avito.android.util.C35936s.a(r2, r7)
            com.avito.android.wallet.pin.impl.creation.mvi.entity.WalletPinCreationInternalAction$ShowContentLoadingError r2 = new com.avito.android.wallet.pin.impl.creation.mvi.entity.WalletPinCreationInternalAction$ShowContentLoadingError
            r2.<init>(r7)
        L9c:
            r6.f328545r = r5
            r6.f328544q = r3
            java.lang.Object r7 = r1.emit(r2, r6)
            if (r7 != r0) goto La7
            return r0
        La7:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        Laa:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.pin.impl.creation.mvi.components.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
