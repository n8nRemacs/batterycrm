package com.avito.android.safedeal_checkout.delivery_universal_checkout.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import Yn0.InterfaceC18304a;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.model.DeliveryUniversalCheckoutData;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.entity.DeliveryUniversalCheckoutInternalAction;
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

/* compiled from: DeliveryUniversalCheckoutUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/domain/a;", "", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC18304a f257047a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.safedeal_checkout.delivery_universal_checkout.a f257048b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeliveryUniversalCheckoutData f257049c;

    /* compiled from: DeliveryUniversalCheckoutUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.safedeal_checkout.delivery_universal_checkout.domain.DeliveryUniversalCheckoutUseCase$invoke$1", f = "DeliveryUniversalCheckoutUseCase.kt", i = {0, 1, 2, 3}, l = {AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, AvailableCode.HMS_IS_SPOOF, 30, 36, 50}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
    /* renamed from: com.avito.android.safedeal_checkout.delivery_universal_checkout.domain.a$a, reason: collision with other inner class name */
    public static final class C7713a extends SuspendLambda implements p<InterfaceC43172j<? super DeliveryUniversalCheckoutInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f257050q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f257051r;

        public C7713a(Continuation<? super C7713a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C7713a c7713a = a.this.new C7713a(continuation);
            c7713a.f257051r = obj;
            return c7713a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DeliveryUniversalCheckoutInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C7713a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 360
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safedeal_checkout.delivery_universal_checkout.domain.a.C7713a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k InterfaceC18304a interfaceC18304a, @k com.avito.android.safedeal_checkout.delivery_universal_checkout.a aVar, @k DeliveryUniversalCheckoutData deliveryUniversalCheckoutData) {
        this.f257047a = interfaceC18304a;
        this.f257048b = aVar;
        this.f257049c = deliveryUniversalCheckoutData;
    }

    @k
    public final InterfaceC43160i<DeliveryUniversalCheckoutInternalAction> a() {
        return C43175k.G(new C7713a(null));
    }
}
