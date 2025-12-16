package com.avito.android.str_seller_orders.orders_buyer.mvi;

import Y41.p;
import com.avito.android.str_seller_orders.orders_buyer.mvi.entity.StrOrdersBuyerInternalAction;
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
import pz0.C47173d;

/* compiled from: StrOrdersBuyerBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_buyer/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/str_seller_orders/orders_buyer/mvi/entity/StrOrdersBuyerInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements com.avito.android.arch.mvi.b<StrOrdersBuyerInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_seller_orders.orders_buyer.domain.a f289075a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f289076b;

    /* compiled from: StrOrdersBuyerBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders/orders_buyer/mvi/entity/StrOrdersBuyerInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders.orders_buyer.mvi.StrOrdersBuyerBootstrap$produce$1", f = "StrOrdersBuyerBootstrap.kt", i = {}, l = {20}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super StrOrdersBuyerInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f289077q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f289078r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = d.this.new a(continuation);
            aVar.f289078r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrOrdersBuyerInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f289077q;
            d dVar = d.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f289078r;
                if (!dVar.f289076b) {
                    C47173d.f428930d.getClass();
                    com.avito.android.str_seller_orders.orders_buyer.domain.c cVarA = dVar.f289075a.a(C47173d.f428931e, null);
                    this.f289077q = 1;
                    if (C43175k.u(this, cVarA, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return G0.f406611a;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            dVar.f289076b = true;
            return G0.f406611a;
        }
    }

    @Inject
    public d(@Y61.k com.avito.android.str_seller_orders.orders_buyer.domain.a aVar) {
        this.f289075a = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<StrOrdersBuyerInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
