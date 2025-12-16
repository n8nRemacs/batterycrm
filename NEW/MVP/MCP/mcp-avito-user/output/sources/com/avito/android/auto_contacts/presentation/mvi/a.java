package com.avito.android.auto_contacts.presentation.mvi;

import Y41.p;
import com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesInternalAction;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AutoContactsPackagesActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.auto_contacts.presentation.mvi.AutoContactsPackagesActor$process$1", f = "AutoContactsPackagesActor.kt", i = {0}, l = {23, AvailableCode.ERROR_ON_ACTIVITY_RESULT, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes11.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super AutoContactsPackagesInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f94934q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f94935r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f94936s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f94936s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f94936s, continuation);
        aVar.f94935r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AutoContactsPackagesInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094 A[RETURN] */
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
            int r1 = r6.f94934q
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2e
            if (r1 == r4) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.C42729a0.b(r7)
            goto L95
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            java.lang.Object r1 = r6.f94935r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L55
        L26:
            java.lang.Object r1 = r6.f94935r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L46
        L2e:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f94935r
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesInternalAction$ContentLoadingStarted r1 = new com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesInternalAction$ContentLoadingStarted
            r1.<init>()
            r6.f94935r = r7
            r6.f94934q = r4
            java.lang.Object r1 = r7.emit(r1, r6)
            if (r1 != r0) goto L45
            return r0
        L45:
            r1 = r7
        L46:
            com.avito.android.auto_contacts.presentation.mvi.b r7 = r6.f94936s
            com.avito.android.auto_contacts.domain.b r7 = r7.f94937a
            r6.f94935r = r1
            r6.f94934q = r3
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r0) goto L55
            return r0
        L55:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r3 == 0) goto L69
            com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesInternalAction$ContentLoaded r3 = new com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesInternalAction$ContentLoaded
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r7 = r7.getResult()
            com.avito.android.auto_contacts.domain.models.AutoContactsPackagesState r7 = (com.avito.android.auto_contacts.domain.models.AutoContactsPackagesState) r7
            r3.<init>(r7)
            goto L89
        L69:
            boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r3 == 0) goto L98
            com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesInternalAction$ErrorOccurred r3 = new com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesInternalAction$ErrorOccurred
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            com.avito.android.remote.error.ApiError r4 = r7.getError()
            java.lang.String r4 = r4.getF244063c()
            com.avito.android.analytics.screens.J$a$a r5 = com.avito.android.analytics.screens.J.a.f90383b
            com.avito.android.remote.error.ApiError r7 = r7.getError()
            r5.getClass()
            com.avito.android.analytics.screens.J$a r7 = com.avito.android.analytics.screens.J.a.C2676a.b(r7)
            r3.<init>(r7, r4)
        L89:
            r7 = 0
            r6.f94935r = r7
            r6.f94934q = r2
            java.lang.Object r7 = r1.emit(r3, r6)
            if (r7 != r0) goto L95
            return r0
        L95:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L98:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.auto_contacts.presentation.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
