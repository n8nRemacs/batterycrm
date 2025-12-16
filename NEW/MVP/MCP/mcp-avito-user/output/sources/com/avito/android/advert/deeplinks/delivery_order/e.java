package com.avito.android.advert.deeplinks.delivery_order;

import Y41.p;
import com.avito.android.advert.deeplinks.delivery_order.a;
import com.avito.android.deep_linking.links.DeliveryOrderCreateLink;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.delivery.DeliveryOrderCreateResponse;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: DeliveryOrderCreateDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.deeplinks.delivery_order.DeliveryOrderCreateDeepLinkHandler$handleWithAuth$1", f = "DeliveryOrderCreateDeepLinkHandler.kt", i = {}, l = {54, 57, 58}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f68989q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.advert.deeplinks.delivery_order.a f68990r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DeliveryOrderCreateLink f68991s;

    /* compiled from: DeliveryOrderCreateDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.deeplinks.delivery_order.DeliveryOrderCreateDeepLinkHandler$handleWithAuth$1$1", f = "DeliveryOrderCreateDeepLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.advert.deeplinks.delivery_order.a f68992q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.advert.deeplinks.delivery_order.a aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f68992q = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f68992q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.advert.deeplinks.delivery_order.a aVar = this.f68992q;
            aVar.f68976h.g(aVar.d(), true);
            return G0.f406611a;
        }
    }

    /* compiled from: DeliveryOrderCreateDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.deeplinks.delivery_order.DeliveryOrderCreateDeepLinkHandler$handleWithAuth$1$2", f = "DeliveryOrderCreateDeepLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ TypedResult<DeliveryOrderCreateResponse> f68993q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.advert.deeplinks.delivery_order.a f68994r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TypedResult<DeliveryOrderCreateResponse> typedResult, com.avito.android.advert.deeplinks.delivery_order.a aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f68993q = typedResult;
            this.f68994r = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f68993q, this.f68994r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            TypedResult<DeliveryOrderCreateResponse> typedResult = this.f68993q;
            boolean z12 = typedResult instanceof TypedResult.Success;
            com.avito.android.advert.deeplinks.delivery_order.a aVar = this.f68994r;
            if (z12) {
                DeliveryOrderCreateResponse deliveryOrderCreateResponse = (DeliveryOrderCreateResponse) ((TypedResult.Success) typedResult).getResult();
                aVar.i(a.AbstractC2162a.C2163a.f68983b, aVar.f68979k, deliveryOrderCreateResponse.getDeeplink());
            } else if (typedResult instanceof TypedResult.Error) {
                TypedResult.Error error = (TypedResult.Error) typedResult;
                com.avito.android.advert.deeplinks.delivery_order.a.k(aVar, error.getError(), error.getCause());
            }
            aVar.f68976h.g(aVar.d(), false);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.avito.android.advert.deeplinks.delivery_order.a aVar, DeliveryOrderCreateLink deliveryOrderCreateLink, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f68990r = aVar;
        this.f68991s = deliveryOrderCreateLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new e(this.f68990r, this.f68991s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f68989q
            com.avito.android.advert.deeplinks.delivery_order.a r2 = r8.f68990r
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            com.avito.android.util.R0 r7 = r2.f68980l
            if (r1 == 0) goto L2a
            if (r1 == r6) goto L26
            if (r1 == r5) goto L22
            if (r1 != r4) goto L1a
            kotlin.C42729a0.b(r9)
            goto L62
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            kotlin.C42729a0.b(r9)
            goto L4e
        L26:
            kotlin.C42729a0.b(r9)
            goto L3f
        L2a:
            kotlin.C42729a0.b(r9)
            kotlinx.coroutines.d1 r9 = r7.b()
            com.avito.android.advert.deeplinks.delivery_order.e$a r1 = new com.avito.android.advert.deeplinks.delivery_order.e$a
            r1.<init>(r2, r3)
            r8.f68989q = r6
            java.lang.Object r9 = kotlinx.coroutines.C43259k.g(r9, r1, r8)
            if (r9 != r0) goto L3f
            return r0
        L3f:
            com.avito.android.deep_linking.links.DeliveryOrderCreateLink r9 = r8.f68991s
            java.util.Map<java.lang.String, java.lang.String> r9 = r9.f133187b
            r8.f68989q = r5
            com.avito.android.advert.deeplinks.delivery_order.l r1 = r2.f68974f
            java.lang.Object r9 = r1.a(r9, r8)
            if (r9 != r0) goto L4e
            return r0
        L4e:
            com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
            kotlinx.coroutines.d1 r1 = r7.b()
            com.avito.android.advert.deeplinks.delivery_order.e$b r5 = new com.avito.android.advert.deeplinks.delivery_order.e$b
            r5.<init>(r9, r2, r3)
            r8.f68989q = r4
            java.lang.Object r9 = kotlinx.coroutines.C43259k.g(r1, r5, r8)
            if (r9 != r0) goto L62
            return r0
        L62:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.deeplinks.delivery_order.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
