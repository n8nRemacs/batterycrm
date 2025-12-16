package com.avito.android.str_seller_orders.orders_seller.domain;

import com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersInternalAction;
import com.avito.android.util.R0;
import ez0.InterfaceC40183a;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import sz0.C48443d;

/* compiled from: StrSellerOrdersInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/domain/t;", "Lcom/avito/android/str_seller_orders/orders_seller/domain/s;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40183a f289349a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f289350b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final w f289351c;

    /* compiled from: StrSellerOrdersInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders.orders_seller.domain.StrSellerOrdersInteractorImpl$loadData$1", f = "StrSellerOrdersInteractor.kt", i = {0, 1}, l = {35, 42, 51, 52}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f289352q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f289353r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C48443d f289354s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f289355t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ t f289356u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Map<String, String> f289357v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C48443d c48443d, boolean z12, t tVar, Map<String, String> map, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f289354s = c48443d;
            this.f289355t = z12;
            this.f289356u = tVar;
            this.f289357v = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f289354s, this.f289355t, this.f289356u, this.f289357v, continuation);
            aVar.f289353r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders.orders_seller.domain.t.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public t(@Y61.k InterfaceC40183a interfaceC40183a, @Y61.k R0 r02, @Y61.k w wVar) {
        this.f289349a = interfaceC40183a;
        this.f289350b = r02;
        this.f289351c = wVar;
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.domain.s
    @Y61.k
    public final InterfaceC43160i<StrSellerOrdersInternalAction> a(@Y61.l C48443d c48443d, @Y61.k Map<String, String> map, boolean z12) {
        return C43175k.I(this.f289350b.a(), C43175k.G(new a(c48443d, z12, this, map, null)));
    }
}
