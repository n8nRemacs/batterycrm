package com.avito.android.autoteka.presentation.waitingForPayment.mvi;

import Uf.InterfaceC15514a;
import Vf.C15672a;
import Y41.p;
import com.avito.android.autoteka.items.waitingForPaymentResponseItem.WaitingForPaymentResponseItem;
import com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity.AutotekaWaitingForPaymentInternalAction;
import com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity.AutotekaWaitingForPaymentState;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AutotekaWaitingForPaymentActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.autoteka.presentation.waitingForPayment.mvi.AutotekaWaitingForPaymentActor$process$1", f = "AutotekaWaitingForPaymentActor.kt", i = {1}, l = {30, 32, 35, 33}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes11.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super AutotekaWaitingForPaymentInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public C15672a f97862q;

    /* renamed from: r, reason: collision with root package name */
    public int f97863r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f97864s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AutotekaWaitingForPaymentState f97865t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15514a f97866u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b f97867v;

    /* compiled from: AutotekaWaitingForPaymentActor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/autoteka/items/waitingForPaymentResponseItem/WaitingForPaymentResponseItem;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.autoteka.presentation.waitingForPayment.mvi.AutotekaWaitingForPaymentActor$process$1$1", f = "AutotekaWaitingForPaymentActor.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.autoteka.presentation.waitingForPayment.mvi.a$a, reason: collision with other inner class name */
    public static final class C2931a extends SuspendLambda implements Y41.l<Continuation<? super TypedResult<WaitingForPaymentResponseItem>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f97868q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ b f97869r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2931a(b bVar, Continuation<? super C2931a> continuation) {
            super(1, continuation);
            this.f97869r = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return new C2931a(this.f97869r, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super TypedResult<WaitingForPaymentResponseItem>> continuation) {
            return ((C2931a) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f97868q;
            if (i12 == 0) {
                C42729a0.b(obj);
                b bVar = this.f97869r;
                com.avito.android.autoteka.data.orderStatus.a aVar = bVar.f97870a;
                String externalId = bVar.f97871b.getExternalId();
                this.f97868q = 1;
                obj = aVar.a(externalId, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AutotekaWaitingForPaymentState autotekaWaitingForPaymentState, InterfaceC15514a interfaceC15514a, b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f97865t = autotekaWaitingForPaymentState;
        this.f97866u = interfaceC15514a;
        this.f97867v = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f97865t, this.f97866u, this.f97867v, continuation);
        aVar.f97864s = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AutotekaWaitingForPaymentInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
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
            int r1 = r9.f97863r
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L35
            if (r1 == r5) goto L31
            if (r1 == r4) goto L28
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            goto L31
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            Vf.a r1 = r9.f97862q
            java.lang.Object r3 = r9.f97864s
            kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
            kotlin.C42729a0.b(r10)
            goto L8b
        L28:
            java.lang.Object r1 = r9.f97864s
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            r10 = r1
            goto L6d
        L31:
            kotlin.C42729a0.b(r10)
            goto La1
        L35:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f97864s
            kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
            com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity.AutotekaWaitingForPaymentState r1 = r9.f97865t
            boolean r7 = r1 instanceof com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity.AutotekaWaitingForPaymentState.Error
            if (r7 == 0) goto La1
            com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity.AutotekaWaitingForPaymentState$Error r1 = (com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity.AutotekaWaitingForPaymentState.Error) r1
            com.avito.android.remote.error.ApiError r1 = r1.f97895f
            boolean r1 = r1 instanceof com.avito.android.remote.error.ApiError.Unauthorized
            if (r1 == 0) goto L5d
            Uf.a r1 = r9.f97866u
            Uf.a$c r1 = (Uf.InterfaceC15514a.c) r1
            boolean r1 = r1.f16537a
            if (r1 == 0) goto L5d
            com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity.AutotekaWaitingForPaymentInternalAction$OpenAuthScreen r1 = com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity.AutotekaWaitingForPaymentInternalAction.OpenAuthScreen.f97888b
            r9.f97863r = r5
            java.lang.Object r10 = r10.emit(r1, r9)
            if (r10 != r0) goto La1
            return r0
        L5d:
            com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity.AutotekaWaitingForPaymentInternalAction$Loading r1 = new com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity.AutotekaWaitingForPaymentInternalAction$Loading
            r1.<init>(r6, r5, r6)
            r9.f97864s = r10
            r9.f97863r = r4
            java.lang.Object r1 = r10.emit(r1, r9)
            if (r1 != r0) goto L6d
            return r0
        L6d:
            Vf.a r1 = new Vf.a
            r1.<init>()
            com.avito.android.util.coroutines.Delays[] r4 = com.avito.android.util.coroutines.Delays.f318856b
            com.avito.android.autoteka.presentation.waitingForPayment.mvi.a$a r4 = new com.avito.android.autoteka.presentation.waitingForPayment.mvi.a$a
            com.avito.android.autoteka.presentation.waitingForPayment.mvi.b r5 = r9.f97867v
            r4.<init>(r5, r6)
            r9.f97864s = r10
            r9.f97862q = r1
            r9.f97863r = r3
            java.lang.Object r3 = com.avito.android.autoteka.helpers.f.a(r4, r9)
            if (r3 != r0) goto L88
            return r0
        L88:
            r8 = r3
            r3 = r10
            r10 = r8
        L8b:
            com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
            r1.getClass()
            com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity.AutotekaWaitingForPaymentInternalAction r10 = Vf.C15672a.a(r10)
            r9.f97864s = r6
            r9.f97862q = r6
            r9.f97863r = r2
            java.lang.Object r10 = r3.emit(r10, r9)
            if (r10 != r0) goto La1
            return r0
        La1:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.autoteka.presentation.waitingForPayment.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
