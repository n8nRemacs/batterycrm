package com.avito.android.seller_promotions.mvi;

import Rq0.InterfaceC15072a;
import Sq0.c;
import com.avito.android.cart_snippet_actions.models.api.CartSnippetActionsStepper;
import com.avito.android.lib.beduin_v2.repository.domain.cart_items.model.CartItem;
import com.avito.android.lib.beduin_v2.repository.domain.cart_items.model.CartItemInfo;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.seller_promotions.model.SellerPromotionsArguments;
import com.avito.android.seller_promotions.mvi.entity.SellerPromotionsInternalAction;
import com.avito.android.util.A4;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import rU.C47595a;
import yn.C50271a;

/* compiled from: SellerPromotionsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/C;", "Lcom/avito/android/seller_promotions/mvi/B;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class C implements B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC15072a> f267889a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SellerPromotionsArguments f267890b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f267891c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.repository.domain.cart_items.h f267892d;

    /* compiled from: SellerPromotionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.seller_promotions.mvi.SellerPromotionsInteractorImpl$getPromotions$1", f = "SellerPromotionsInteractor.kt", i = {0, 1, 1, 2, 2, 3, 3, 4}, l = {42, 49, 56, 57, 64, 68}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "promotionsResult", "$this$flow", "promotionsResult", "$this$flow", "promotionsResult", "promotionsResult"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SellerPromotionsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public TypedResult f267893q;

        /* renamed from: r, reason: collision with root package name */
        public int f267894r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f267895s;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = C.this.new a(continuation);
            aVar.f267895s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SellerPromotionsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00cd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00fd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x011d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0131  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 354
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.seller_promotions.mvi.C.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SellerPromotionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.seller_promotions.mvi.SellerPromotionsInteractorImpl$getPromotions$2", f = "SellerPromotionsInteractor.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super SellerPromotionsInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f267897q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f267898r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f267899s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super SellerPromotionsInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f267898r = interfaceC43172j;
            bVar.f267899s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f267897q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f267898r;
                SellerPromotionsInternalAction.InternalError internalError = new SellerPromotionsInternalAction.InternalError(this.f267899s, null);
                this.f267898r = null;
                this.f267897q = 1;
                if (interfaceC43172j.emit(internalError, this) == coroutine_suspended) {
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

    /* compiled from: SellerPromotionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.seller_promotions.mvi.SellerPromotionsInteractorImpl$getPromotionsItems$1", f = "SellerPromotionsInteractor.kt", i = {0, 1, 2}, l = {95, 96, 106, 110}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "newItemsResult"}, s = {"L$0", "L$0", "L$0"})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SellerPromotionsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f267900q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f267901r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f267903t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f267904u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j12, int i12, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f267903t = j12;
            this.f267904u = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = C.this.new c(this.f267903t, this.f267904u, continuation);
            cVar.f267901r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SellerPromotionsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r13.f267900q
                r9 = 4
                r10 = 3
                r1 = 1
                com.avito.android.seller_promotions.mvi.C r11 = com.avito.android.seller_promotions.mvi.C.this
                r2 = 2
                if (r0 == 0) goto L3f
                if (r0 == r1) goto L36
                if (r0 == r2) goto L2c
                if (r0 == r10) goto L23
                if (r0 != r9) goto L1b
                kotlin.C42729a0.b(r14)
                goto Lcb
            L1b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L23:
                java.lang.Object r0 = r13.f267901r
                com.avito.android.remote.model.TypedResult r0 = (com.avito.android.remote.model.TypedResult) r0
                kotlin.C42729a0.b(r14)
                goto L9e
            L2c:
                java.lang.Object r0 = r13.f267901r
                kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.InterfaceC43172j) r0
                kotlin.C42729a0.b(r14)
                r12 = r0
                r0 = r14
                goto L7f
            L36:
                java.lang.Object r0 = r13.f267901r
                kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.InterfaceC43172j) r0
                kotlin.C42729a0.b(r14)
            L3d:
                r12 = r0
                goto L56
            L3f:
                kotlin.C42729a0.b(r14)
                java.lang.Object r0 = r13.f267901r
                kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.InterfaceC43172j) r0
                com.avito.android.seller_promotions.mvi.entity.SellerPromotionsInternalAction$PageLoading r3 = new com.avito.android.seller_promotions.mvi.entity.SellerPromotionsInternalAction$PageLoading
                r3.<init>()
                r13.f267901r = r0
                r13.f267900q = r1
                java.lang.Object r1 = r0.emit(r3, r13)
                if (r1 != r8) goto L3d
                return r8
            L56:
                h31.e<Rq0.a> r0 = r11.f267889a
                java.lang.Object r0 = r0.get()
                Rq0.a r0 = (Rq0.InterfaceC15072a) r0
                com.avito.android.seller_promotions.model.SellerPromotionsArguments r1 = r11.f267890b
                java.lang.String r3 = r1.f267880e
                com.avito.android.util.A4 r4 = com.avito.android.util.A4.f318516a
                java.util.Map<java.lang.String, java.lang.Object> r5 = r1.f267882g
                java.util.Map r6 = com.avito.android.util.A4.j(r4, r5)
                r13.f267901r = r12
                r13.f267900q = r2
                long r4 = r13.f267903t
                int r7 = r13.f267904u
                java.lang.String r2 = r1.f267877b
                r1 = r3
                r3 = r4
                r5 = r7
                r7 = r13
                java.lang.Object r0 = r0.c(r1, r2, r3, r5, r6, r7)
                if (r0 != r8) goto L7f
                return r8
            L7f:
                com.avito.android.remote.model.TypedResult r0 = (com.avito.android.remote.model.TypedResult) r0
                boolean r1 = r0 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r1 == 0) goto Lb0
                com.avito.android.seller_promotions.mvi.entity.SellerPromotionsInternalAction$PageLoaded r1 = new com.avito.android.seller_promotions.mvi.entity.SellerPromotionsInternalAction$PageLoaded
                r2 = r0
                com.avito.android.remote.model.TypedResult$Success r2 = (com.avito.android.remote.model.TypedResult.Success) r2
                java.lang.Object r2 = r2.getResult()
                Sq0.g r2 = (Sq0.g) r2
                r1.<init>(r2)
                r13.f267901r = r0
                r13.f267900q = r10
                java.lang.Object r1 = r12.emit(r1, r13)
                if (r1 != r8) goto L9e
                return r8
            L9e:
                com.avito.android.lib.beduin_v2.repository.domain.cart_items.h r1 = r11.f267892d
                com.avito.android.remote.model.TypedResult$Success r0 = (com.avito.android.remote.model.TypedResult.Success) r0
                java.lang.Object r0 = r0.getResult()
                Sq0.g r0 = (Sq0.g) r0
                java.util.List r0 = r0.a()
                com.avito.android.seller_promotions.mvi.C.e(r11, r1, r0)
                goto Lcb
            Lb0:
                boolean r1 = r0 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r1 == 0) goto Lcb
                com.avito.android.seller_promotions.mvi.entity.SellerPromotionsInternalAction$PageLoadingError r1 = new com.avito.android.seller_promotions.mvi.entity.SellerPromotionsInternalAction$PageLoadingError
                com.avito.android.remote.model.TypedResult$Error r0 = (com.avito.android.remote.model.TypedResult.Error) r0
                com.avito.android.remote.error.ApiError r0 = r0.getError()
                r1.<init>(r0)
                r0 = 0
                r13.f267901r = r0
                r13.f267900q = r9
                java.lang.Object r0 = r12.emit(r1, r13)
                if (r0 != r8) goto Lcb
                return r8
            Lcb:
                kotlin.G0 r0 = kotlin.G0.f406611a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.seller_promotions.mvi.C.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SellerPromotionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.seller_promotions.mvi.SellerPromotionsInteractorImpl$getPromotionsItems$2", f = "SellerPromotionsInteractor.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.q<InterfaceC43172j<? super SellerPromotionsInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f267905q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f267906r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f267907s;

        public d() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super SellerPromotionsInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            d dVar = new d(3, continuation);
            dVar.f267906r = interfaceC43172j;
            dVar.f267907s = th2;
            return dVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f267905q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f267906r;
                SellerPromotionsInternalAction.InternalError internalError = new SellerPromotionsInternalAction.InternalError(this.f267907s, "load-next-items");
                this.f267906r = null;
                this.f267905q = 1;
                if (interfaceC43172j.emit(internalError, this) == coroutine_suspended) {
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

    /* compiled from: SellerPromotionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LSq0/e;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.seller_promotions.mvi.SellerPromotionsInteractorImpl$updateItems$2", f = "SellerPromotionsInteractor.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<Sq0.e>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f267908q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ List<C50271a> f267910s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<C50271a> list, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f267910s = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return C.this.new e(this.f267910s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<Sq0.e>> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f267908q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C c12 = C.this;
                InterfaceC15072a interfaceC15072a = c12.f267889a.get();
                SellerPromotionsArguments sellerPromotionsArguments = c12.f267890b;
                String str = sellerPromotionsArguments.f267879d;
                A4.f318516a.getClass();
                Map<String, String> mapH = A4.h(this.f267910s, "items");
                Map<String, String> mapI = A4.i(sellerPromotionsArguments.f267882g, false);
                this.f267908q = 1;
                obj = interfaceC15072a.b(str, sellerPromotionsArguments.f267877b, mapH, mapI, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* compiled from: SellerPromotionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.seller_promotions.mvi.SellerPromotionsInteractorImpl$updatePromotion$1", f = "SellerPromotionsInteractor.kt", i = {0, 1, 2, 2, 3, 3, 4, 4}, l = {130, 131, 136, 139, 140, 141, 144}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "promotionConditionResult", "$this$flow", "$this$invokeSuspend_u24lambda_u240", "$this$flow", "$this$invokeSuspend_u24lambda_u240"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SellerPromotionsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f267911q;

        /* renamed from: r, reason: collision with root package name */
        public int f267912r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f267913s;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = C.this.new f(continuation);
            fVar.f267913s = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SellerPromotionsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0093 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00aa A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0100 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 310
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.seller_promotions.mvi.C.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SellerPromotionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.seller_promotions.mvi.SellerPromotionsInteractorImpl$updatePromotion$2", f = "SellerPromotionsInteractor.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.q<InterfaceC43172j<? super SellerPromotionsInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f267915q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f267916r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f267917s;

        public g() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super SellerPromotionsInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            g gVar = new g(3, continuation);
            gVar.f267916r = interfaceC43172j;
            gVar.f267917s = th2;
            return gVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f267915q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f267916r;
                SellerPromotionsInternalAction.InternalError internalError = new SellerPromotionsInternalAction.InternalError(this.f267917s, "update-promotion");
                this.f267916r = null;
                this.f267915q = 1;
                if (interfaceC43172j.emit(internalError, this) == coroutine_suspended) {
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

    @Inject
    public C(@Y61.k h31.e<InterfaceC15072a> eVar, @Y61.k SellerPromotionsArguments sellerPromotionsArguments, @Y61.k R0 r02, @Y61.k com.avito.android.lib.beduin_v2.repository.domain.cart_items.h hVar) {
        this.f267889a = eVar;
        this.f267890b = sellerPromotionsArguments;
        this.f267891c = r02;
        this.f267892d = hVar;
    }

    public static final void e(C c12, com.avito.android.lib.beduin_v2.repository.domain.cart_items.h hVar, List list) {
        c12.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof c.b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c.b bVar = (c.b) it.next();
            CartSnippetActionsStepper stepper = bVar.getStepper();
            CartItem cartItem = stepper != null ? new CartItem(bVar.getId(), new CartItemInfo(stepper.getValue(), stepper.getMaxValue())) : null;
            if (cartItem != null) {
                arrayList2.add(cartItem);
            }
        }
        hVar.c(new C47595a(arrayList2));
    }

    @Override // com.avito.android.seller_promotions.mvi.B
    @Y61.k
    public final InterfaceC43160i<SellerPromotionsInternalAction> a() {
        return C43175k.I(this.f267891c.a(), new C43152f0(C43175k.G(new f(null)), new g(3, null)));
    }

    @Override // com.avito.android.seller_promotions.mvi.B
    @Y61.l
    public final Object b(@Y61.k List<C50271a> list, @Y61.k Continuation<? super TypedResult<Sq0.e>> continuation) {
        return C43259k.g(this.f267891c.a(), new e(list, null), continuation);
    }

    @Override // com.avito.android.seller_promotions.mvi.B
    @Y61.k
    public final InterfaceC43160i<SellerPromotionsInternalAction> c() {
        return C43175k.I(this.f267891c.a(), new C43152f0(C43175k.G(new a(null)), new b(3, null)));
    }

    @Override // com.avito.android.seller_promotions.mvi.B
    @Y61.k
    public final InterfaceC43160i d(int i12, long j12) {
        return C43175k.I(this.f267891c.a(), new C43152f0(C43175k.G(new c(j12, i12, null)), new d(3, null)));
    }
}
