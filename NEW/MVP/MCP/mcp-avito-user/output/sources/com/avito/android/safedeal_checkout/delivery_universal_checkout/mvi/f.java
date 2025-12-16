package com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.entity.DeliveryUniversalCheckoutInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: Emitters.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.DeliveryUniversalCheckoutBootstrap$executeRequestStateFlow$$inlined$transform$1", f = "DeliveryUniversalCheckoutBootstrap.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DeliveryUniversalCheckoutInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f257134q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f257135r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f257136s;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<DeliveryUniversalCheckoutInternalAction> f257137b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.DeliveryUniversalCheckoutBootstrap$executeRequestStateFlow$$inlined$transform$1$1", f = "DeliveryUniversalCheckoutBootstrap.kt", i = {0}, l = {221, 227}, m = "emit", n = {"$this$executeRequestStateFlow_u24lambda_u240"}, s = {"L$0"})
        /* renamed from: com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.f$a$a, reason: collision with other inner class name */
        public static final class C7717a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f257138q;

            /* renamed from: r, reason: collision with root package name */
            public int f257139r;

            /* renamed from: t, reason: collision with root package name */
            public InterfaceC43172j f257141t;

            public C7717a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f257138q = obj;
                this.f257139r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f257137b = interfaceC43172j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0079 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.f.a.C7717a
                if (r0 == 0) goto L13
                r0 = r8
                com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.f$a$a r0 = (com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.f.a.C7717a) r0
                int r1 = r0.f257139r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f257139r = r1
                goto L18
            L13:
                com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.f$a$a r0 = new com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.f$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f257138q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f257139r
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L3b
                if (r2 == r5) goto L35
                if (r2 != r4) goto L2d
                kotlin.C42729a0.b(r8)
                goto L7a
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                kotlinx.coroutines.flow.j r7 = r0.f257141t
                kotlin.C42729a0.b(r8)
                goto L5d
            L3b:
                kotlin.C42729a0.b(r8)
                Ui.f r7 = (Ui.f) r7
                com.avito.android.util.P2<com.avito.android.beduin_shared.model.action.BeduinActionsResponse> r7 = r7.f16555b
                boolean r8 = r7 instanceof com.avito.android.util.P2.a
                kotlinx.coroutines.flow.j<com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.entity.DeliveryUniversalCheckoutInternalAction> r2 = r6.f257137b
                if (r8 == 0) goto L5f
                com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.entity.DeliveryUniversalCheckoutInternalAction$ExecuteRequestFailed r8 = new com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.entity.DeliveryUniversalCheckoutInternalAction$ExecuteRequestFailed
                com.avito.android.util.P2$a r7 = (com.avito.android.util.P2.a) r7
                com.avito.android.remote.error.ApiError r7 = r7.f318719a
                r8.<init>(r7)
                r0.f257141t = r2
                r0.f257139r = r5
                java.lang.Object r7 = r2.emit(r8, r0)
                if (r7 != r1) goto L5c
                return r1
            L5c:
                r7 = r2
            L5d:
                r2 = r7
                goto L69
            L5f:
                boolean r8 = r7 instanceof com.avito.android.util.P2.b
                if (r8 == 0) goto L64
                goto L69
            L64:
                boolean r7 = r7 instanceof com.avito.android.util.P2.c
                if (r7 == 0) goto L7d
                r3 = r5
            L69:
                com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.entity.DeliveryUniversalCheckoutInternalAction$ExecuteRequestStateChanged r7 = new com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.entity.DeliveryUniversalCheckoutInternalAction$ExecuteRequestStateChanged
                r7.<init>(r3)
                r8 = 0
                r0.f257141t = r8
                r0.f257139r = r4
                java.lang.Object r7 = r2.emit(r7, r0)
                if (r7 != r1) goto L7a
                return r1
            L7a:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            L7d:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InterfaceC43160i interfaceC43160i, Continuation continuation) {
        super(2, continuation);
        this.f257136s = interfaceC43160i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f257136s, continuation);
        fVar.f257135r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DeliveryUniversalCheckoutInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f257134q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f257135r);
            this.f257134q = 1;
            if (((AbstractC43168f) this.f257136s).collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
