package com.avito.android.cart_similar_items.mvi;

import com.avito.android.cart_similar_items.mvi.C29353a;
import com.avito.android.cart_similar_items.mvi.entity.CartSimilarItemsInternalAction;
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
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import mn.C44104d;
import mn.InterfaceC44101a;

/* compiled from: CartSimilarItemsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/cart_similar_items/mvi/a$a;", "Lkotlinx/coroutines/flow/i;", "Lmn/a;", "<name for destructuring parameter 0>", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cart_similar_items.mvi.CartSimilarItemsActor$process$processedGroupsFlow$2", f = "CartSimilarItemsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class n extends SuspendLambda implements Y41.p<Q<? extends C29353a.InterfaceC3382a, ? extends InterfaceC43160i<? extends InterfaceC44101a>>, Continuation<? super InterfaceC43160i<? extends CartSimilarItemsInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f116081q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C29353a f116082r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<C44104d> f116083s;

    /* compiled from: CartSimilarItemsActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmn/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "<anonymous>", "(Lmn/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cart_similar_items.mvi.CartSimilarItemsActor$process$processedGroupsFlow$2$1", f = "CartSimilarItemsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC44101a, Continuation<? super InterfaceC43160i<? extends CartSimilarItemsInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f116084q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C29353a f116085r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<C44104d> f116086s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a aVar, C29353a c29353a, Continuation continuation) {
            super(2, continuation);
            this.f116085r = c29353a;
            this.f116086s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f116086s, this.f116085r, continuation);
            aVar.f116084q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC44101a interfaceC44101a, Continuation<? super InterfaceC43160i<? extends CartSimilarItemsInternalAction>> continuation) {
            return ((a) create(interfaceC44101a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f116085r.b((InterfaceC44101a) this.f116084q, this.f116086s.invoke());
        }
    }

    /* compiled from: CartSimilarItemsActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmn/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "<anonymous>", "(Lmn/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cart_similar_items.mvi.CartSimilarItemsActor$process$processedGroupsFlow$2$3", f = "CartSimilarItemsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC44101a, Continuation<? super InterfaceC43160i<? extends CartSimilarItemsInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f116087q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C29353a f116088r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<C44104d> f116089s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar, C29353a c29353a, Continuation continuation) {
            super(2, continuation);
            this.f116088r = c29353a;
            this.f116089s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f116089s, this.f116088r, continuation);
            bVar.f116087q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC44101a interfaceC44101a, Continuation<? super InterfaceC43160i<? extends CartSimilarItemsInternalAction>> continuation) {
            return ((b) create(interfaceC44101a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f116088r.b((InterfaceC44101a) this.f116087q, this.f116089s.invoke());
        }
    }

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cart_similar_items.mvi.CartSimilarItemsActor$process$processedGroupsFlow$2$invokeSuspend$$inlined$flatMapLatest$1", f = "CartSimilarItemsActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.q<InterfaceC43172j<? super CartSimilarItemsInternalAction>, InterfaceC44101a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f116090q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f116091r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f116092s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C29353a f116093t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.a f116094u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar, C29353a c29353a, Continuation continuation) {
            super(3, continuation);
            this.f116093t = c29353a;
            this.f116094u = aVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super CartSimilarItemsInternalAction> interfaceC43172j, InterfaceC44101a interfaceC44101a, Continuation<? super G0> continuation) {
            c cVar = new c(this.f116094u, this.f116093t, continuation);
            cVar.f116091r = interfaceC43172j;
            cVar.f116092s = interfaceC44101a;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f116090q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f116091r;
                InterfaceC43160i<CartSimilarItemsInternalAction> interfaceC43160iB = this.f116093t.b((InterfaceC44101a) this.f116092s, (C44104d) this.f116094u.invoke());
                this.f116090q = 1;
                if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
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
    public n(Y41.a aVar, C29353a c29353a, Continuation continuation) {
        super(2, continuation);
        this.f116082r = c29353a;
        this.f116083s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        n nVar = new n(this.f116083s, this.f116082r, continuation);
        nVar.f116081q = obj;
        return nVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends C29353a.InterfaceC3382a, ? extends InterfaceC43160i<? extends InterfaceC44101a>> q12, Continuation<? super InterfaceC43160i<? extends CartSimilarItemsInternalAction>> continuation) {
        return ((n) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f116081q;
        C29353a.InterfaceC3382a interfaceC3382a = (C29353a.InterfaceC3382a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        boolean zF2 = L.f(interfaceC3382a, C29353a.InterfaceC3382a.C3383a.f115984a);
        Y41.a<C44104d> aVar = this.f116083s;
        C29353a c29353a = this.f116082r;
        if (zF2) {
            return C43175k.B(new a(aVar, c29353a, null), interfaceC43160i);
        }
        if (L.f(interfaceC3382a, C29353a.InterfaceC3382a.b.f115985a)) {
            return C43175k.Y(interfaceC43160i, new c(aVar, c29353a, null));
        }
        if (L.f(interfaceC3382a, C29353a.InterfaceC3382a.c.f115986a)) {
            return C43175k.C(new b(aVar, c29353a, null), interfaceC43160i);
        }
        throw new NoWhenBranchMatchedException();
    }
}
