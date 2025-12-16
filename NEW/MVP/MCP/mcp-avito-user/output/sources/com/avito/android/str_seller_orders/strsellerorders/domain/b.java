package com.avito.android.str_seller_orders.strsellerorders.domain;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.remote.d1;
import com.avito.android.remote.model.StrOrdersListBody;
import com.avito.android.remote.model.StrSellerOrdersListResponse;
import com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction;
import com.avito.android.str_seller_orders.strsellerordersdialog.shared.StrSellerOrdersDialogData;
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

/* compiled from: StrSellerOrdersInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/domain/b;", "Lcom/avito/android/str_seller_orders/strsellerorders/domain/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.str_seller_orders.strsellerorders.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d1 f289779a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC40183a f289780b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f289781c;

    /* compiled from: StrSellerOrdersInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerorders.domain.StrSellerOrdersInteractorImpl$loadData$1", f = "StrSellerOrdersInteractor.kt", i = {0, 1}, l = {63, 65, 67, 70}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f289782q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f289783r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f289784s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b f289785t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ StrOrdersListBody f289786u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, b bVar, StrOrdersListBody strOrdersListBody, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f289784s = z12;
            this.f289785t = bVar;
            this.f289786u = strOrdersListBody;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f289784s, this.f289785t, this.f289786u, continuation);
            aVar.f289783r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
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
                int r1 = r8.f289782q
                r2 = 0
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L33
                if (r1 == r6) goto L2b
                if (r1 == r5) goto L23
                if (r1 == r4) goto L1e
                if (r1 != r3) goto L16
                goto L1e
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                kotlin.C42729a0.b(r9)
                goto La7
            L23:
                java.lang.Object r1 = r8.f289783r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L67
            L2b:
                java.lang.Object r1 = r8.f289783r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L4d
            L33:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f289783r
                kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
                com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction$StartLoading r1 = new com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction$StartLoading
                boolean r7 = r8.f289784s
                r1.<init>(r7)
                r8.f289783r = r9
                r8.f289782q = r6
                java.lang.Object r1 = r9.emit(r1, r8)
                if (r1 != r0) goto L4c
                return r0
            L4c:
                r1 = r9
            L4d:
                r8.f289783r = r1
                r8.f289782q = r5
                com.avito.android.str_seller_orders.strsellerorders.domain.b r9 = r8.f289785t
                com.avito.android.util.R0 r5 = r9.f289781c
                kotlinx.coroutines.scheduling.b r5 = r5.a()
                com.avito.android.str_seller_orders.strsellerorders.domain.c r6 = new com.avito.android.str_seller_orders.strsellerorders.domain.c
                com.avito.android.remote.model.StrOrdersListBody r7 = r8.f289786u
                r6.<init>(r7, r9, r2)
                java.lang.Object r9 = kotlinx.coroutines.C43259k.g(r5, r6, r8)
                if (r9 != r0) goto L67
                return r0
            L67:
                com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
                boolean r5 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r5 == 0) goto L85
                com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
                java.lang.Object r9 = r9.getResult()
                com.avito.android.remote.model.StrSellerOrdersListResponse r9 = (com.avito.android.remote.model.StrSellerOrdersListResponse) r9
                com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction$LoadingComplete r3 = new com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction$LoadingComplete
                r3.<init>(r9)
                r8.f289783r = r2
                r8.f289782q = r4
                java.lang.Object r9 = r1.emit(r3, r8)
                if (r9 != r0) goto La7
                return r0
            L85:
                boolean r4 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r4 == 0) goto Laa
                com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
                com.avito.android.remote.error.ApiError r4 = r9.getError()
                java.lang.Throwable r9 = r9.getCause()
                com.avito.android.util.ApiException r9 = com.avito.android.util.C35936s.a(r4, r9)
                com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction$LoadingError r4 = new com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction$LoadingError
                r4.<init>(r9)
                r8.f289783r = r2
                r8.f289782q = r3
                java.lang.Object r9 = r1.emit(r4, r8)
                if (r9 != r0) goto La7
                return r0
            La7:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            Laa:
                kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders.strsellerorders.domain.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: StrSellerOrdersInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerorders.domain.StrSellerOrdersInteractorImpl$makeGetRequest$1", f = "StrSellerOrdersInteractor.kt", i = {0, 1}, l = {140, 141, 142, 143}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.str_seller_orders.strsellerorders.domain.b$b, reason: collision with other inner class name */
    public static final class C8736b extends SuspendLambda implements p<InterfaceC43172j<? super StrSellerOrdersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f289787q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f289788r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f289790t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ p<InterfaceC43172j<? super StrSellerOrdersInternalAction>, Continuation<? super G0>, Object> f289791u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ q<InterfaceC43172j<? super StrSellerOrdersInternalAction>, Throwable, Continuation<? super G0>, Object> f289792v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8736b(String str, p<? super InterfaceC43172j<? super StrSellerOrdersInternalAction>, ? super Continuation<? super G0>, ? extends Object> pVar, q<? super InterfaceC43172j<? super StrSellerOrdersInternalAction>, ? super Throwable, ? super Continuation<? super G0>, ? extends Object> qVar, Continuation<? super C8736b> continuation) {
            super(2, continuation);
            this.f289790t = str;
            this.f289791u = pVar;
            this.f289792v = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C8736b c8736b = b.this.new C8736b(this.f289790t, this.f289791u, this.f289792v, continuation);
            c8736b.f289788r = obj;
            return c8736b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrSellerOrdersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C8736b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f289787q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L32
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                kotlin.C42729a0.b(r8)
                goto L97
            L22:
                java.lang.Object r1 = r7.f289788r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L5c
            L2a:
                java.lang.Object r1 = r7.f289788r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L4b
            L32:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f289788r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction$StartLoading r1 = new com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction$StartLoading
                r6 = 0
                r1.<init>(r6)
                r7.f289788r = r8
                r7.f289787q = r5
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L4a
                return r0
            L4a:
                r1 = r8
            L4b:
                com.avito.android.str_seller_orders.strsellerorders.domain.b r8 = com.avito.android.str_seller_orders.strsellerorders.domain.b.this
                com.avito.android.remote.d1 r8 = r8.f289779a
                r7.f289788r = r1
                r7.f289787q = r4
                java.lang.String r4 = r7.f289790t
                java.lang.Object r8 = r8.i(r4, r7)
                if (r8 != r0) goto L5c
                return r0
            L5c:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r4 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L78
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                Ux0.b r8 = (Ux0.b) r8
                r7.f289788r = r5
                r7.f289787q = r3
                Y41.p<kotlinx.coroutines.flow.j<? super com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction>, kotlin.coroutines.Continuation<? super kotlin.G0>, java.lang.Object> r8 = r7.f289791u
                java.lang.Object r8 = r8.invoke(r1, r7)
                if (r8 != r0) goto L97
                return r0
            L78:
                boolean r3 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto L9a
                com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
                com.avito.android.remote.error.ApiError r3 = r8.getError()
                java.lang.Throwable r8 = r8.getCause()
                com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r3, r8)
                r7.f289788r = r5
                r7.f289787q = r2
                Y41.q<kotlinx.coroutines.flow.j<? super com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.G0>, java.lang.Object> r2 = r7.f289792v
                java.lang.Object r8 = r2.invoke(r1, r8, r7)
                if (r8 != r0) goto L97
                return r0
            L97:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            L9a:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders.strsellerorders.domain.b.C8736b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: StrSellerOrdersInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerorders.domain.StrSellerOrdersInteractorImpl$makePostRequest$1", f = "StrSellerOrdersInteractor.kt", i = {0, 1}, l = {155, 156, 161, 163}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super StrSellerOrdersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f289793q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f289794r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f289796t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Map<String, String> f289797u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ p<InterfaceC43172j<? super StrSellerOrdersInternalAction>, Continuation<? super G0>, Object> f289798v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ q<InterfaceC43172j<? super StrSellerOrdersInternalAction>, Throwable, Continuation<? super G0>, Object> f289799w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(String str, Map<String, String> map, p<? super InterfaceC43172j<? super StrSellerOrdersInternalAction>, ? super Continuation<? super G0>, ? extends Object> pVar, q<? super InterfaceC43172j<? super StrSellerOrdersInternalAction>, ? super Throwable, ? super Continuation<? super G0>, ? extends Object> qVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f289796t = str;
            this.f289797u = map;
            this.f289798v = pVar;
            this.f289799w = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = b.this.new c(this.f289796t, this.f289797u, this.f289798v, this.f289799w, continuation);
            cVar.f289794r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrSellerOrdersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f289793q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L32
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                kotlin.C42729a0.b(r8)
                goto L99
            L22:
                java.lang.Object r1 = r7.f289794r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L5e
            L2a:
                java.lang.Object r1 = r7.f289794r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L4b
            L32:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f289794r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction$StartLoading r1 = new com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction$StartLoading
                r6 = 0
                r1.<init>(r6)
                r7.f289794r = r8
                r7.f289793q = r5
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L4a
                return r0
            L4a:
                r1 = r8
            L4b:
                com.avito.android.str_seller_orders.strsellerorders.domain.b r8 = com.avito.android.str_seller_orders.strsellerorders.domain.b.this
                com.avito.android.remote.d1 r8 = r8.f289779a
                r7.f289794r = r1
                r7.f289793q = r4
                java.util.Map<java.lang.String, java.lang.String> r4 = r7.f289797u
                java.lang.String r5 = r7.f289796t
                java.lang.Object r8 = r8.n(r5, r4, r7)
                if (r8 != r0) goto L5e
                return r0
            L5e:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r4 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L7a
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                Ux0.b r8 = (Ux0.b) r8
                r7.f289794r = r5
                r7.f289793q = r3
                Y41.p<kotlinx.coroutines.flow.j<? super com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction>, kotlin.coroutines.Continuation<? super kotlin.G0>, java.lang.Object> r8 = r7.f289798v
                java.lang.Object r8 = r8.invoke(r1, r7)
                if (r8 != r0) goto L99
                return r0
            L7a:
                boolean r3 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto L9c
                com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
                com.avito.android.remote.error.ApiError r3 = r8.getError()
                java.lang.Throwable r8 = r8.getCause()
                com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r3, r8)
                r7.f289794r = r5
                r7.f289793q = r2
                Y41.q<kotlinx.coroutines.flow.j<? super com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.G0>, java.lang.Object> r2 = r7.f289799w
                java.lang.Object r8 = r2.invoke(r1, r8, r7)
                if (r8 != r0) goto L99
                return r0
            L99:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            L9c:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders.strsellerorders.domain.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: StrSellerOrdersInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerorders.domain.StrSellerOrdersInteractorImpl$updateImportantToNoteSections$1", f = "StrSellerOrdersInteractor.kt", i = {0, 1, 2, 3, 3}, l = {79, 84, 92, 96, 97, 100}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "result"}, s = {"L$0", "L$0", "L$0", "L$0", "L$3"})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super StrSellerOrdersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public b f289800q;

        /* renamed from: r, reason: collision with root package name */
        public StrSellerOrdersDialogData f289801r;

        /* renamed from: s, reason: collision with root package name */
        public StrSellerOrdersListResponse f289802s;

        /* renamed from: t, reason: collision with root package name */
        public int f289803t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f289804u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ StrSellerOrdersDialogData f289805v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ b f289806w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(StrSellerOrdersDialogData strSellerOrdersDialogData, b bVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f289805v = strSellerOrdersDialogData;
            this.f289806w = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            d dVar = new d(this.f289805v, this.f289806w, continuation);
            dVar.f289804u = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrSellerOrdersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0079 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009b A[LOOP:2: B:20:0x0095->B:22:0x009b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00d0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x018b  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0198  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x019c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0129 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 476
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders.strsellerorders.domain.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k d1 d1Var, @k InterfaceC40183a interfaceC40183a, @k R0 r02) {
        this.f289779a = d1Var;
        this.f289780b = interfaceC40183a;
        this.f289781c = r02;
    }

    @Override // com.avito.android.str_seller_orders.strsellerorders.domain.a
    @k
    public final InterfaceC43160i<StrSellerOrdersInternalAction> a(@k String str, @k p<? super InterfaceC43172j<? super StrSellerOrdersInternalAction>, ? super Continuation<? super G0>, ? extends Object> pVar, @k q<? super InterfaceC43172j<? super StrSellerOrdersInternalAction>, ? super Throwable, ? super Continuation<? super G0>, ? extends Object> qVar) {
        return C43175k.I(this.f289781c.a(), C43175k.G(new C8736b(str, pVar, qVar, null)));
    }

    @Override // com.avito.android.str_seller_orders.strsellerorders.domain.a
    @k
    public final InterfaceC43160i<StrSellerOrdersInternalAction> b(boolean z12, @k StrOrdersListBody strOrdersListBody) {
        return C43175k.I(this.f289781c.a(), C43175k.G(new a(z12, this, strOrdersListBody, null)));
    }

    @Override // com.avito.android.str_seller_orders.strsellerorders.domain.a
    @k
    public final InterfaceC43160i<StrSellerOrdersInternalAction> c(@k String str, @k Map<String, String> map, @k p<? super InterfaceC43172j<? super StrSellerOrdersInternalAction>, ? super Continuation<? super G0>, ? extends Object> pVar, @k q<? super InterfaceC43172j<? super StrSellerOrdersInternalAction>, ? super Throwable, ? super Continuation<? super G0>, ? extends Object> qVar) {
        return C43175k.I(this.f289781c.a(), C43175k.G(new c(str, map, pVar, qVar, null)));
    }

    @Override // com.avito.android.str_seller_orders.strsellerorders.domain.a
    @k
    public final InterfaceC43160i<StrSellerOrdersInternalAction> d(@k StrSellerOrdersDialogData strSellerOrdersDialogData) {
        return C43175k.I(this.f289781c.a(), C43175k.G(new d(strSellerOrdersDialogData, this, null)));
    }
}
