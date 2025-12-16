package com.avito.android.seller_promotions.mvi;

import com.avito.android.seller_promotions.mvi.C34670a;
import com.avito.android.seller_promotions.mvi.entity.SellerPromotionsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SellerPromotionsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/seller_promotions/mvi/a$a;", "Lkotlinx/coroutines/flow/i;", "LOq0/d;", "<name for destructuring parameter 0>", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.seller_promotions.mvi.SellerPromotionsActor$process$processedGroupsFlow$2", f = "SellerPromotionsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class r extends SuspendLambda implements Y41.p<Q<? extends C34670a.InterfaceC8012a, ? extends InterfaceC43160i<? extends Oq0.d>>, Continuation<? super InterfaceC43160i<? extends SellerPromotionsInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f268033q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C34670a f268034r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Oq0.g> f268035s;

    /* compiled from: SellerPromotionsActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LOq0/d;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "<anonymous>", "(LOq0/d;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.seller_promotions.mvi.SellerPromotionsActor$process$processedGroupsFlow$2$1", f = "SellerPromotionsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<Oq0.d, Continuation<? super InterfaceC43160i<? extends SellerPromotionsInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f268036q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C34670a f268037r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<Oq0.g> f268038s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a aVar, C34670a c34670a, Continuation continuation) {
            super(2, continuation);
            this.f268037r = c34670a;
            this.f268038s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f268038s, this.f268037r, continuation);
            aVar.f268036q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(Oq0.d dVar, Continuation<? super InterfaceC43160i<? extends SellerPromotionsInternalAction>> continuation) {
            return ((a) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f268037r.b((Oq0.d) this.f268036q, this.f268038s.invoke());
        }
    }

    /* compiled from: SellerPromotionsActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LOq0/d;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "<anonymous>", "(LOq0/d;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.seller_promotions.mvi.SellerPromotionsActor$process$processedGroupsFlow$2$3", f = "SellerPromotionsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<Oq0.d, Continuation<? super InterfaceC43160i<? extends SellerPromotionsInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f268039q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C34670a f268040r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<Oq0.g> f268041s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar, C34670a c34670a, Continuation continuation) {
            super(2, continuation);
            this.f268040r = c34670a;
            this.f268041s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f268041s, this.f268040r, continuation);
            bVar.f268039q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(Oq0.d dVar, Continuation<? super InterfaceC43160i<? extends SellerPromotionsInternalAction>> continuation) {
            return ((b) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f268040r.b((Oq0.d) this.f268039q, this.f268041s.invoke());
        }
    }

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.seller_promotions.mvi.SellerPromotionsActor$process$processedGroupsFlow$2$invokeSuspend$$inlined$flatMapLatest$1", f = "SellerPromotionsActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.q<InterfaceC43172j<? super SellerPromotionsInternalAction>, Oq0.d, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f268042q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f268043r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f268044s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C34670a f268045t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.a f268046u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar, C34670a c34670a, Continuation continuation) {
            super(3, continuation);
            this.f268045t = c34670a;
            this.f268046u = aVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super SellerPromotionsInternalAction> interfaceC43172j, Oq0.d dVar, Continuation<? super G0> continuation) {
            c cVar = new c(this.f268046u, this.f268045t, continuation);
            cVar.f268043r = interfaceC43172j;
            cVar.f268044s = dVar;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f268042q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f268043r;
                C43152f0 c43152f0B = this.f268045t.b((Oq0.d) this.f268044s, (Oq0.g) this.f268046u.invoke());
                this.f268042q = 1;
                if (C43175k.u(this, c43152f0B, interfaceC43172j) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Y41.a aVar, C34670a c34670a, Continuation continuation) {
        super(2, continuation);
        this.f268034r = c34670a;
        this.f268035s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        r rVar = new r(this.f268035s, this.f268034r, continuation);
        rVar.f268033q = obj;
        return rVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends C34670a.InterfaceC8012a, ? extends InterfaceC43160i<? extends Oq0.d>> q12, Continuation<? super InterfaceC43160i<? extends SellerPromotionsInternalAction>> continuation) {
        return ((r) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f268033q;
        C34670a.InterfaceC8012a interfaceC8012a = (C34670a.InterfaceC8012a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        boolean zF2 = L.f(interfaceC8012a, C34670a.InterfaceC8012a.C8013a.f267934a);
        Y41.a<Oq0.g> aVar = this.f268035s;
        C34670a c34670a = this.f268034r;
        if (zF2) {
            return C43175k.B(new a(aVar, c34670a, null), interfaceC43160i);
        }
        if (L.f(interfaceC8012a, C34670a.InterfaceC8012a.b.f267935a)) {
            return C43175k.Y(interfaceC43160i, new c(aVar, c34670a, null));
        }
        if (L.f(interfaceC8012a, C34670a.InterfaceC8012a.c.f267936a)) {
            return C43175k.C(new b(aVar, c34670a, null), interfaceC43160i);
        }
        throw new NoWhenBranchMatchedException();
    }
}
