package com.avito.android.orderBeduinV2.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.order.OrderScreenSegment;
import com.avito.android.orderBeduinV2.mvi.entity.OrderInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/orderBeduinV2/mvi/domain/a;", "", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.order.feature.data.a f209856a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RK0.a f209857b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f209858c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final OrderScreenSegment f209859d;

    /* compiled from: GetOrderDetailsUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.orderBeduinV2.mvi.domain.GetOrderDetailsUseCase$invoke$1", f = "GetOrderDetailsUseCase.kt", i = {0, 1}, l = {21, 22, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 30}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.orderBeduinV2.mvi.domain.a$a, reason: collision with other inner class name */
    public static final class C6262a extends SuspendLambda implements p<InterfaceC43172j<? super OrderInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f209860q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f209861r;

        public C6262a(Continuation<? super C6262a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C6262a c6262a = a.this.new C6262a(continuation);
            c6262a.f209861r = obj;
            return c6262a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super OrderInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C6262a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
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
                int r1 = r7.f209860q
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
                goto La8
            L22:
                java.lang.Object r1 = r7.f209861r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L63
            L2a:
                java.lang.Object r1 = r7.f209861r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L4a
            L32:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f209861r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.orderBeduinV2.mvi.entity.OrderInternalAction$LoadingStarted r1 = new com.avito.android.orderBeduinV2.mvi.entity.OrderInternalAction$LoadingStarted
                r1.<init>()
                r7.f209861r = r8
                r7.f209860q = r5
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r8
            L4a:
                com.avito.android.orderBeduinV2.mvi.domain.a r8 = com.avito.android.orderBeduinV2.mvi.domain.a.this
                com.avito.android.order.feature.data.a r5 = r8.f209856a
                RK0.a r6 = r8.f209857b
                java.lang.String r6 = r6.a()
                r7.f209861r = r1
                r7.f209860q = r4
                java.lang.String r4 = r8.f209858c
                com.avito.android.order.OrderScreenSegment r8 = r8.f209859d
                java.lang.Object r8 = r5.b(r4, r6, r8, r7)
                if (r8 != r0) goto L63
                return r0
            L63:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r4 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
                r5 = 0
                if (r4 == 0) goto L80
                com.avito.android.orderBeduinV2.mvi.entity.OrderInternalAction$LoadingFailed r2 = new com.avito.android.orderBeduinV2.mvi.entity.OrderInternalAction$LoadingFailed
                com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
                com.avito.android.remote.error.ApiError r8 = r8.getError()
                r2.<init>(r8)
                r7.f209861r = r5
                r7.f209860q = r3
                java.lang.Object r8 = r1.emit(r2, r7)
                if (r8 != r0) goto La8
                return r0
            L80:
                boolean r3 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r3 == 0) goto La8
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                O40.b r8 = (O40.b) r8
                com.avito.android.orderBeduinV2.mvi.entity.OrderInternalAction$ContentLoaded r3 = new com.avito.android.orderBeduinV2.mvi.entity.OrderInternalAction$ContentLoaded
                com.google.gson.k r4 = r8.getContent()
                java.lang.String r4 = r4.toString()
                com.avito.android.remote.model.UniversalColor r8 = r8.getStatusBarColor()
                r3.<init>(r4, r8)
                r7.f209861r = r5
                r7.f209860q = r2
                java.lang.Object r8 = r1.emit(r3, r7)
                if (r8 != r0) goto La8
                return r0
            La8:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.orderBeduinV2.mvi.domain.a.C6262a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k com.avito.android.order.feature.data.a aVar, @k RK0.a aVar2, @com.avito.android.order.feature.di.module.b @k String str, @k OrderScreenSegment orderScreenSegment) {
        this.f209856a = aVar;
        this.f209857b = aVar2;
        this.f209858c = str;
        this.f209859d = orderScreenSegment;
    }

    @k
    public final InterfaceC43160i<OrderInternalAction> a() {
        return C43175k.G(new C6262a(null));
    }
}
