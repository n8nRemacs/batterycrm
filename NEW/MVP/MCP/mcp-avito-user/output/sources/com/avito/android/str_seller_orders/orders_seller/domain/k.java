package com.avito.android.str_seller_orders.orders_seller.domain;

import com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersInternalAction;
import com.avito.android.str_seller_orders_calendar.navigation.StrOrdersCalendarLink;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kv.C43501a;
import rz0.InterfaceC47945a;

/* compiled from: StrSellerOrdersDeepLinkHandleUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/domain/k;", "Lcom/avito/android/str_seller_orders/orders_seller/domain/j;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47945a f289336a;

    /* compiled from: StrSellerOrdersDeepLinkHandleUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders.orders_seller.domain.StrSellerOrdersDeepLinkHandleUseCaseImpl$invoke$1", f = "StrSellerOrdersDeepLinkHandleUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSellerOrdersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C43501a f289337q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ k f289338r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C43501a c43501a, k kVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f289337q = c43501a;
            this.f289338r = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f289337q, this.f289338r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrSellerOrdersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            if (this.f289337q.f413261b instanceof StrOrdersCalendarLink.b.C8772b) {
                this.f289338r.f289336a.a();
            }
            return G0.f406611a;
        }
    }

    @Inject
    public k(@Y61.k InterfaceC47945a interfaceC47945a) {
        this.f289336a = interfaceC47945a;
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.domain.j
    @Y61.k
    public final InterfaceC43160i<StrSellerOrdersInternalAction> a(@Y61.k C43501a c43501a) {
        return C43175k.G(new a(c43501a, this, null));
    }
}
