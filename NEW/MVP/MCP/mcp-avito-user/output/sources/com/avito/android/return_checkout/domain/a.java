package com.avito.android.return_checkout.domain;

import Y41.p;
import Y61.k;
import com.avito.android.return_checkout.l;
import com.avito.android.return_checkout.model.DeliveryReturnCheckoutData;
import com.avito.android.return_checkout.mvi.entity.DeliveryReturnCheckoutInternalAction;
import com.avito.android.util.R0;
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

/* compiled from: DeliveryReturnCheckoutUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/return_checkout/domain/a;", "", "_avito_return-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f255293a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.return_checkout.a f255294b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeliveryReturnCheckoutData f255295c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final R0 f255296d;

    /* compiled from: DeliveryReturnCheckoutUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.return_checkout.domain.DeliveryReturnCheckoutUseCase$invoke$1", f = "DeliveryReturnCheckoutUseCase.kt", i = {0, 1}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 51}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.return_checkout.domain.a$a, reason: collision with other inner class name */
    public static final class C7642a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f255297q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f255298r;

        public C7642a(Continuation<? super C7642a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            C7642a c7642a = a.this.new C7642a(continuation);
            c7642a.f255298r = obj;
            return c7642a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C7642a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 232
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.return_checkout.domain.a.C7642a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k l lVar, @k com.avito.android.return_checkout.a aVar, @k DeliveryReturnCheckoutData deliveryReturnCheckoutData, @k R0 r02) {
        this.f255293a = lVar;
        this.f255294b = aVar;
        this.f255295c = deliveryReturnCheckoutData;
        this.f255296d = r02;
    }

    @k
    public final InterfaceC43160i<DeliveryReturnCheckoutInternalAction> a() {
        return C43175k.I(this.f255296d.a(), C43175k.G(new C7642a(null)));
    }
}
