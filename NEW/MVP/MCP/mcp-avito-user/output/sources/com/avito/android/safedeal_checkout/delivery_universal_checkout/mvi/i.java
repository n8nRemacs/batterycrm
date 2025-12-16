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
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Emitters.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.DeliveryUniversalCheckoutBootstrap$returnCheckoutFlow$$inlined$transform$1", f = "DeliveryUniversalCheckoutBootstrap.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DeliveryUniversalCheckoutInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f257150q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f257151r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f257152s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f257153t;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<DeliveryUniversalCheckoutInternalAction> f257154b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f257155c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.DeliveryUniversalCheckoutBootstrap$returnCheckoutFlow$$inlined$transform$1$1", f = "DeliveryUniversalCheckoutBootstrap.kt", i = {}, l = {226}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.i$a$a, reason: collision with other inner class name */
        public static final class C7719a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f257156q;

            /* renamed from: r, reason: collision with root package name */
            public int f257157r;

            public C7719a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f257156q = obj;
                this.f257157r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, j jVar) {
            this.f257155c = jVar;
            this.f257154b = interfaceC43172j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.i.a.C7719a
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.i$a$a r0 = (com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.i.a.C7719a) r0
                int r1 = r0.f257157r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f257157r = r1
                goto L18
            L13:
                com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.i$a$a r0 = new com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.i$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f257156q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f257157r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r6)
                goto L70
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.C42729a0.b(r6)
                kv.a r5 = (kv.C43501a) r5
                com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.j r5 = r4.f257155c
                com.avito.android.safedeal_checkout.delivery_universal_checkout.model.DeliveryUniversalCheckoutData r6 = r5.f257159a
                boolean r2 = r6 instanceof com.avito.android.safedeal_checkout.delivery_universal_checkout.model.CheckoutData
                if (r2 == 0) goto L4b
                com.avito.android.safedeal_checkout.delivery_universal_checkout.model.CheckoutData r6 = (com.avito.android.safedeal_checkout.delivery_universal_checkout.model.CheckoutData) r6
                java.util.Map<java.lang.String, java.lang.String> r6 = r6.f257081b
                java.lang.String r2 = "itemId"
                java.lang.Object r6 = r6.get(r2)
                java.lang.String r6 = (java.lang.String) r6
                goto L5c
            L4b:
                boolean r2 = r6 instanceof com.avito.android.safedeal_checkout.delivery_universal_checkout.model.CheckoutCourierData
                if (r2 == 0) goto L54
                com.avito.android.safedeal_checkout.delivery_universal_checkout.model.CheckoutCourierData r6 = (com.avito.android.safedeal_checkout.delivery_universal_checkout.model.CheckoutCourierData) r6
                java.lang.String r6 = r6.f257071e
                goto L5c
            L54:
                boolean r2 = r6 instanceof com.avito.android.safedeal_checkout.delivery_universal_checkout.model.CheckoutPvzData
                if (r2 == 0) goto L73
                com.avito.android.safedeal_checkout.delivery_universal_checkout.model.CheckoutPvzData r6 = (com.avito.android.safedeal_checkout.delivery_universal_checkout.model.CheckoutPvzData) r6
                java.lang.String r6 = r6.f257085e
            L5c:
                if (r6 == 0) goto L63
                co0.b r5 = r5.f257164f
                r5.a(r6)
            L63:
                com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.entity.DeliveryUniversalCheckoutInternalAction$ReturnCheckoutAction r5 = com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.entity.DeliveryUniversalCheckoutInternalAction.ReturnCheckoutAction.f257133b
                r0.f257157r = r3
                kotlinx.coroutines.flow.j<com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.entity.DeliveryUniversalCheckoutInternalAction> r6 = r4.f257154b
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L70
                return r1
            L70:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            L73:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.i.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, Continuation continuation, j jVar) {
        super(2, continuation);
        this.f257152s = hVar;
        this.f257153t = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f257152s, continuation, this.f257153t);
        iVar.f257151r = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DeliveryUniversalCheckoutInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f257150q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f257151r, this.f257153t);
            this.f257150q = 1;
            if (this.f257152s.collect(aVar, this) == coroutine_suspended) {
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
