package com.avito.android.str_seller_orders.strsellerordersrange.mvi;

import com.avito.android.str_seller_orders.strsellerordersrange.mvi.entity.StrSellerOrdersRangeInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import dz0.InterfaceC39833a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrSellerOrdersRangeBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersrange/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/str_seller_orders/strsellerordersrange/mvi/entity/StrSellerOrdersRangeInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements com.avito.android.arch.mvi.b<StrSellerOrdersRangeInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_seller_orders.strsellerordersrange.domain.b f290291a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f290292b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f290293c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f290294d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f290295e;

    /* compiled from: StrSellerOrdersRangeBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders/strsellerordersrange/mvi/entity/StrSellerOrdersRangeInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerordersrange.mvi.StrSellerOrdersRangeBootstrap$produce$1", f = "StrSellerOrdersRangeBootstrap.kt", i = {}, l = {AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSellerOrdersRangeInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f290296q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f290297r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = f.this.new a(continuation);
            aVar.f290297r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrSellerOrdersRangeInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f290296q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.C42729a0.b(r7)
                goto L51
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f290297r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L43
            L22:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f290297r
                r1 = r7
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.str_seller_orders.strsellerordersrange.mvi.f r7 = com.avito.android.str_seller_orders.strsellerordersrange.mvi.f.this
                boolean r4 = r7.f290295e
                if (r4 != 0) goto L51
                r6.f290297r = r1
                r6.f290296q = r3
                com.avito.android.str_seller_orders.strsellerordersrange.domain.b r3 = r7.f290291a
                java.lang.String r4 = r7.f290292b
                java.lang.String r5 = r7.f290293c
                java.lang.String r7 = r7.f290294d
                kotlinx.coroutines.flow.i r7 = r3.a(r4, r5, r7)
                if (r7 != r0) goto L43
                return r0
            L43:
                kotlinx.coroutines.flow.i r7 = (kotlinx.coroutines.flow.InterfaceC43160i) r7
                r3 = 0
                r6.f290297r = r3
                r6.f290296q = r2
                java.lang.Object r7 = kotlinx.coroutines.flow.C43175k.u(r6, r7, r1)
                if (r7 != r0) goto L51
                return r0
            L51:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders.strsellerordersrange.mvi.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public f(@Y61.k com.avito.android.str_seller_orders.strsellerordersrange.domain.b bVar, @com.avito.android.str_seller_orders.strsellerordersrange.di.d @Y61.k String str, @com.avito.android.str_seller_orders.strsellerordersrange.di.b @Y61.k String str2, @com.avito.android.str_seller_orders.strsellerordersrange.di.c @Y61.k String str3, @InterfaceC39833a boolean z12) {
        this.f290291a = bVar;
        this.f290292b = str;
        this.f290293c = str2;
        this.f290294d = str3;
        this.f290295e = z12;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<StrSellerOrdersRangeInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
