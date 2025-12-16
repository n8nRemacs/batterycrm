package com.avito.android.safedeal.delivery.order_cancellation.domain;

import Kn0.c;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.OrderCancellationReasons;
import com.avito.android.safedeal.delivery.order_cancellation.g;
import com.avito.android.safedeal.delivery.order_cancellation.mvi.entity.RdsOrderCancellationReasonsInternalAction;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GetReasonsUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/domain/a;", "", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f256285a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.safedeal.delivery.order_cancellation.data.a f256286b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g f256287c;

    /* compiled from: GetReasonsUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/entity/RdsOrderCancellationReasonsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.safedeal.delivery.order_cancellation.domain.GetReasonsUseCase$invoke$1", f = "GetReasonsUseCase.kt", i = {0, 1, 3, 3, 3}, l = {23, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_NO_ACTIVITY, 40, 45}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "result", "reasons"}, s = {"L$0", "L$0", "L$0", "L$1", "L$2"})
    /* renamed from: com.avito.android.safedeal.delivery.order_cancellation.domain.a$a, reason: collision with other inner class name */
    public static final class C7678a extends SuspendLambda implements p<InterfaceC43172j<? super RdsOrderCancellationReasonsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public OrderCancellationReasons f256288q;

        /* renamed from: r, reason: collision with root package name */
        public ArrayList f256289r;

        /* renamed from: s, reason: collision with root package name */
        public int f256290s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f256291t;

        public C7678a(Continuation<? super C7678a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C7678a c7678a = a.this.new C7678a(continuation);
            c7678a.f256291t = obj;
            return c7678a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RdsOrderCancellationReasonsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C7678a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00ff A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safedeal.delivery.order_cancellation.domain.a.C7678a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@c @k String str, @k com.avito.android.safedeal.delivery.order_cancellation.data.a aVar, @k g gVar) {
        this.f256285a = str;
        this.f256286b = aVar;
        this.f256287c = gVar;
    }

    @k
    public final InterfaceC43160i<RdsOrderCancellationReasonsInternalAction> a() {
        return C43175k.G(new C7678a(null));
    }
}
