package com.avito.android.order.feature.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.order.OrderScreenSegment;
import com.avito.android.order.feature.mvi.entity.OrderInternalAction;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GetOrderDetailsUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/order/feature/domain/a;", "", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.order.feature.data.a f209576a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.order.feature.a f209577b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RK0.a f209578c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f209579d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final OrderScreenSegment f209580e;

    /* compiled from: GetOrderDetailsUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.order.feature.domain.GetOrderDetailsUseCase$invoke$1", f = "GetOrderDetailsUseCase.kt", i = {0, 1}, l = {23, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, 30, 35}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.order.feature.domain.a$a, reason: collision with other inner class name */
    public static final class C6246a extends SuspendLambda implements p<InterfaceC43172j<? super OrderInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f209581q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f209582r;

        public C6246a(Continuation<? super C6246a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C6246a c6246a = a.this.new C6246a(continuation);
            c6246a.f209582r = obj;
            return c6246a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super OrderInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C6246a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f209581q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                com.avito.android.order.feature.domain.a r6 = com.avito.android.order.feature.domain.a.this
                if (r1 == 0) goto L34
                if (r1 == r5) goto L2c
                if (r1 == r4) goto L24
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                goto L1f
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                kotlin.C42729a0.b(r9)
                goto Lb0
            L24:
                java.lang.Object r1 = r8.f209582r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L63
            L2c:
                java.lang.Object r1 = r8.f209582r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L4c
            L34:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f209582r
                kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
                com.avito.android.order.feature.mvi.entity.OrderInternalAction$LoadingStarted r1 = new com.avito.android.order.feature.mvi.entity.OrderInternalAction$LoadingStarted
                r1.<init>()
                r8.f209582r = r9
                r8.f209581q = r5
                java.lang.Object r1 = r9.emit(r1, r8)
                if (r1 != r0) goto L4b
                return r0
            L4b:
                r1 = r9
            L4c:
                com.avito.android.order.feature.data.a r9 = r6.f209576a
                RK0.a r5 = r6.f209578c
                java.lang.String r5 = r5.a()
                r8.f209582r = r1
                r8.f209581q = r4
                java.lang.String r4 = r6.f209579d
                com.avito.android.order.OrderScreenSegment r7 = r6.f209580e
                java.lang.Object r9 = r9.c(r4, r5, r7, r8)
                if (r9 != r0) goto L63
                return r0
            L63:
                com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
                boolean r4 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
                r5 = 0
                if (r4 == 0) goto L80
                com.avito.android.order.feature.mvi.entity.OrderInternalAction$LoadingFailed r2 = new com.avito.android.order.feature.mvi.entity.OrderInternalAction$LoadingFailed
                com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
                com.avito.android.remote.error.ApiError r9 = r9.getError()
                r2.<init>(r9)
                r8.f209582r = r5
                r8.f209581q = r3
                java.lang.Object r9 = r1.emit(r2, r8)
                if (r9 != r0) goto Lb0
                return r0
            L80:
                boolean r3 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r3 == 0) goto Lb0
                com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
                java.lang.Object r9 = r9.getResult()
                O40.a r9 = (O40.a) r9
                java.lang.String r3 = r9.getMainFormId()
                com.avito.android.order.feature.a r4 = r6.f209577b
                java.util.List r6 = r9.a()
                lj.a r4 = r4.f209508a
                java.util.List r4 = com.avito.android.beduin_shared.model.utils.m.a(r4, r3, r6)
                com.avito.android.order.feature.mvi.entity.OrderInternalAction$ContentLoaded r6 = new com.avito.android.order.feature.mvi.entity.OrderInternalAction$ContentLoaded
                java.lang.String r9 = r9.getTitle()
                r6.<init>(r9, r3, r4)
                r8.f209582r = r5
                r8.f209581q = r2
                java.lang.Object r9 = r1.emit(r6, r8)
                if (r9 != r0) goto Lb0
                return r0
            Lb0:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.order.feature.domain.a.C6246a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k com.avito.android.order.feature.data.a aVar, @k com.avito.android.order.feature.a aVar2, @k RK0.a aVar3, @com.avito.android.order.feature.di.module.b @k String str, @k OrderScreenSegment orderScreenSegment) {
        this.f209576a = aVar;
        this.f209577b = aVar2;
        this.f209578c = aVar3;
        this.f209579d = str;
        this.f209580e = orderScreenSegment;
    }

    @k
    public final InterfaceC43160i<OrderInternalAction> a() {
        return C43175k.G(new C6246a(null));
    }
}
