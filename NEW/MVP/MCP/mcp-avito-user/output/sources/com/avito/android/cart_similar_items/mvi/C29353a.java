package com.avito.android.cart_similar_items.mvi;

import com.avito.android.cart_similar_items.model.CartSimilarItemsArguments;
import com.avito.android.cart_similar_items.mvi.entity.CartSimilarItemsInternalAction;
import com.avito.android.deep_linking.links.CartLink;
import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.rec.ScreenSource;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43200s1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.C43292o;
import ln.C43800a;
import mn.C44104d;
import mn.InterfaceC44101a;
import mn.InterfaceC44107g;

/* compiled from: CartSimilarItemsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lmn/a;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "Lmn/d;", "a", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.cart_similar_items.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29353a implements com.avito.android.arch.mvi.a<InterfaceC44101a, CartSimilarItemsInternalAction, C44104d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final I f115975a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final F f115976b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.h f115977c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cart_snippet_actions.e f115978d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cart_snippet_actions.a f115979e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final R0 f115980f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.repository.domain.cart_items.h f115981g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final CartSimilarItemsArguments f115982h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f115983i;

    /* compiled from: CartSimilarItemsActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/a$a;", "", "a", "b", "c", "Lcom/avito/android/cart_similar_items/mvi/a$a$a;", "Lcom/avito/android/cart_similar_items/mvi/a$a$b;", "Lcom/avito/android/cart_similar_items/mvi/a$a$c;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.cart_similar_items.mvi.a$a, reason: collision with other inner class name */
    public interface InterfaceC3382a {

        /* compiled from: CartSimilarItemsActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/a$a$a;", "Lcom/avito/android/cart_similar_items/mvi/a$a;", "<init>", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.cart_similar_items.mvi.a$a$a, reason: collision with other inner class name */
        public static final class C3383a implements InterfaceC3382a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C3383a f115984a = new C3383a();
        }

        /* compiled from: CartSimilarItemsActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/a$a$b;", "Lcom/avito/android/cart_similar_items/mvi/a$a;", "<init>", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.cart_similar_items.mvi.a$a$b */
        public static final class b implements InterfaceC3382a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f115985a = new b();
        }

        /* compiled from: CartSimilarItemsActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/a$a$c;", "Lcom/avito/android/cart_similar_items/mvi/a$a;", "<init>", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.cart_similar_items.mvi.a$a$c */
        public static final class c implements InterfaceC3382a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f115986a = new c();
        }
    }

    /* compiled from: CartSimilarItemsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cart_similar_items.mvi.CartSimilarItemsActor$process$1", f = "CartSimilarItemsActor.kt", i = {0}, l = {72, 73}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.cart_similar_items.mvi.a$b */
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CartSimilarItemsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f115987q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f115988r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = C29353a.this.new b(continuation);
            bVar.f115988r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CartSimilarItemsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f115987q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f115988r;
                CartSimilarItemsInternalAction.ScreenLoading screenLoading = new CartSimilarItemsInternalAction.ScreenLoading(false);
                this.f115988r = interfaceC43172j;
                this.f115987q = 1;
                if (interfaceC43172j.emit(screenLoading, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f115988r;
                C42729a0.b(obj);
            }
            InterfaceC43160i<CartSimilarItemsInternalAction> interfaceC43160iInvoke = C29353a.this.f115975a.invoke();
            this.f115988r = null;
            this.f115987q = 2;
            if (C43175k.u(this, interfaceC43160iInvoke, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CartSimilarItemsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cart_similar_items.mvi.CartSimilarItemsActor$process$2", f = "CartSimilarItemsActor.kt", i = {0}, l = {77, 78}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.cart_similar_items.mvi.a$c */
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CartSimilarItemsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f115990q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f115991r;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = C29353a.this.new c(continuation);
            cVar.f115991r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CartSimilarItemsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f115990q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f115991r;
                CartSimilarItemsInternalAction.ScreenLoading screenLoading = new CartSimilarItemsInternalAction.ScreenLoading(true);
                this.f115991r = interfaceC43172j;
                this.f115990q = 1;
                if (interfaceC43172j.emit(screenLoading, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f115991r;
                C42729a0.b(obj);
            }
            InterfaceC43160i<CartSimilarItemsInternalAction> interfaceC43160iInvoke = C29353a.this.f115975a.invoke();
            this.f115991r = null;
            this.f115990q = 2;
            if (C43175k.u(this, interfaceC43160iInvoke, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CartSimilarItemsActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$UpdateItemsStocks;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cart_similar_items.mvi.CartSimilarItemsActor$process$3", f = "CartSimilarItemsActor.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.cart_similar_items.mvi.a$d */
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CartSimilarItemsInternalAction.UpdateItemsStocks>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f115993q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f115994r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C44104d f115995s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C29353a f115996t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C44104d c44104d, C29353a c29353a, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f115995s = c44104d;
            this.f115996t = c29353a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = new d(this.f115995s, this.f115996t, continuation);
            dVar.f115994r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CartSimilarItemsInternalAction.UpdateItemsStocks> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f115993q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f115994r;
                List<com.avito.android.cart_similar_items.konveyor.c> list = this.f115995s.f414714j;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof com.avito.android.cart_similar_items.konveyor.snippet.c) {
                        arrayList.add(obj2);
                    }
                }
                int iF2 = P0.f(C42745f0.q(arrayList, 10));
                if (iF2 < 16) {
                    iF2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = ((com.avito.android.cart_similar_items.konveyor.snippet.c) it.next()).f115873b;
                    linkedHashMap.put(str, this.f115996t.f115981g.get(str));
                }
                CartSimilarItemsInternalAction.UpdateItemsStocks updateItemsStocks = new CartSimilarItemsInternalAction.UpdateItemsStocks(linkedHashMap);
                this.f115993q = 1;
                if (interfaceC43172j.emit(updateItemsStocks, this) == coroutine_suspended) {
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

    /* compiled from: CartSimilarItemsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cart_similar_items.mvi.CartSimilarItemsActor$process$4", f = "CartSimilarItemsActor.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.cart_similar_items.mvi.a$e */
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CartSimilarItemsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f115997q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC44101a f115999s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C44104d f116000t;

        /* compiled from: CartSimilarItemsActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.cart_similar_items.mvi.CartSimilarItemsActor$process$4$1", f = "CartSimilarItemsActor.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.cart_similar_items.mvi.a$e$a, reason: collision with other inner class name */
        public static final class C3384a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f116001q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ C29353a f116002r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ InterfaceC44101a f116003s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ C44104d f116004t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3384a(C29353a c29353a, InterfaceC44101a interfaceC44101a, C44104d c44104d, Continuation<? super C3384a> continuation) {
                super(2, continuation);
                this.f116002r = c29353a;
                this.f116003s = interfaceC44101a;
                this.f116004t = c44104d;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C3384a(this.f116002r, this.f116003s, this.f116004t, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C3384a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f116001q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    C29353a c29353a = this.f116002r;
                    com.avito.android.favorite.h hVar = c29353a.f115977c;
                    InterfaceC44101a.j jVar = (InterfaceC44101a.j) this.f116003s;
                    String str = jVar.f414686a;
                    String str2 = this.f116004t.f414706b;
                    if (str2 == null) {
                        str2 = c29353a.f115982h.f115928f;
                    }
                    io.reactivex.rxjava3.core.I iG2 = hVar.g(str, new AbstractC30567a.m(str2), jVar.f414687b, null, null, (2016 & 32) != 0 ? null : null, (2016 & 64) != 0 ? null : null, (2016 & 128) != 0 ? null : null, (2016 & 256) != 0 ? null : null, (2016 & 512) != 0 ? null : null, (2016 & 1024) != 0);
                    this.f116001q = 1;
                    if (C43292o.b(iG2, this) == coroutine_suspended) {
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
        public e(InterfaceC44101a interfaceC44101a, C44104d c44104d, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f115999s = interfaceC44101a;
            this.f116000t = c44104d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return C29353a.this.new e(this.f115999s, this.f116000t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CartSimilarItemsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f115997q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C29353a c29353a = C29353a.this;
                kotlinx.coroutines.scheduling.b bVarA = c29353a.f115980f.a();
                C3384a c3384a = new C3384a(c29353a, this.f115999s, this.f116000t, null);
                this.f115997q = 1;
                if (C43259k.g(bVarA, c3384a, this) == coroutine_suspended) {
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
    public C29353a(@Y61.k I i12, @Y61.k F f12, @Y61.k com.avito.android.favorite.h hVar, @Y61.k com.avito.android.cart_snippet_actions.e eVar, @Y61.k com.avito.android.cart_snippet_actions.a aVar, @Y61.k R0 r02, @Y61.k com.avito.android.lib.beduin_v2.repository.domain.cart_items.h hVar2, @Y61.k CartSimilarItemsArguments cartSimilarItemsArguments, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f115975a = i12;
        this.f115976b = f12;
        this.f115977c = hVar;
        this.f115978d = eVar;
        this.f115979e = aVar;
        this.f115980f = r02;
        this.f115981g = hVar2;
        this.f115982h = cartSimilarItemsArguments;
        this.f115983i = interfaceC35745a5;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        InterfaceC43160i interfaceC43160iC = C43175k.C(new n(aVar, this, null), com.avito.android.arch.mvi.utils.h.a(c43197r1, m.f116080l));
        ArrayList arrayList = new ArrayList();
        InterfaceC43160i interfaceC43160iC2 = C43175k.C(new l(2, null), C43175k.I(this.f115980f.c(), C43175k.B(new C29363k(arrayList, this, aVar, null), C43175k.p(new C29361i(new C43200s1(arrayList, new C29360h(c43197r1), new C29362j(3, null))), o.f116095a))));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        return C43175k.N(interfaceC43160iC2, kotlinx.coroutines.rx3.y.a(com.avito.android.cart_snippet_actions.utils.h.a(kotlinx.coroutines.rx3.y.b(new C43197r1(new C29356d(linkedHashMap2, null), new C29355c(new C29354b(c43197r1)))), this.f115983i, this.f115981g, linkedHashMap, C29357e.f116017l, new C29359g(this, linkedHashMap2))), interfaceC43160iC);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<CartSimilarItemsInternalAction> b(@Y61.k InterfaceC44101a interfaceC44101a, @Y61.k C44104d c44104d) {
        String str;
        C43210w c43210w;
        if (interfaceC44101a.equals(InterfaceC44101a.h.f414684a)) {
            return C43175k.G(new b(null));
        }
        if (interfaceC44101a.equals(InterfaceC44101a.f.f414682a)) {
            return C43175k.G(new c(null));
        }
        if (interfaceC44101a.equals(InterfaceC44101a.i.f414685a)) {
            return C43175k.I(this.f115980f.a(), C43175k.G(new d(c44104d, this, null)));
        }
        if (interfaceC44101a.equals(InterfaceC44101a.e.f414681a)) {
            c43210w = new C43210w(CartSimilarItemsInternalAction.CloseScreen.f116020b);
        } else {
            if (interfaceC44101a instanceof InterfaceC44101a.k) {
                return new C43210w(new CartSimilarItemsInternalAction.UpdateCartIconState(((InterfaceC44101a.k) interfaceC44101a).f414688a));
            }
            boolean zEquals = interfaceC44101a.equals(InterfaceC44101a.c.f414676a);
            String str2 = c44104d.f414706b;
            CartSimilarItemsArguments cartSimilarItemsArguments = this.f115982h;
            if (!zEquals) {
                if (interfaceC44101a instanceof InterfaceC44101a.b) {
                    InterfaceC44101a.b bVar = (InterfaceC44101a.b) interfaceC44101a;
                    C43800a c43800a = new C43800a(bVar.f414672b, ScreenSource.CART_SIMILAR_ITEMS.f251778d, bVar.f414675e, bVar.f414674d, bVar.f414673c);
                    if (str2 == null) {
                        str2 = cartSimilarItemsArguments.f115928f;
                    }
                    return new C43210w(new CartSimilarItemsInternalAction.OpenAdvertDetails(bVar.f414671a, str2, c43800a));
                }
                boolean z12 = interfaceC44101a instanceof InterfaceC44101a.C11839a;
                int i12 = 1;
                if (z12) {
                    InterfaceC44101a.C11839a c11839a = (InterfaceC44101a.C11839a) interfaceC44101a;
                    if (interfaceC44101a instanceof InterfaceC44101a.d) {
                        i12 = ((InterfaceC44101a.d) interfaceC44101a).f414679c;
                    } else if (!z12) {
                        throw new IllegalStateException("Only ChangeItemQuantity and AddItemToCart actions are expected");
                    }
                    return new C43210w(new CartSimilarItemsInternalAction.ChangeItemQuantity(c11839a.f414669a, i12));
                }
                boolean z13 = interfaceC44101a instanceof InterfaceC44101a.d;
                if (!z13) {
                    if (interfaceC44101a instanceof InterfaceC44101a.j) {
                        return C43175k.G(new e(interfaceC44101a, c44104d, null));
                    }
                    if (interfaceC44101a instanceof InterfaceC44101a.g) {
                        return ((c44104d.f414709e instanceof InterfaceC44107g.c) || (str = c44104d.f414715k) == null) ? C43175k.w() : this.f115976b.a(str);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC44101a.d dVar = (InterfaceC44101a.d) interfaceC44101a;
                if (z13) {
                    i12 = ((InterfaceC44101a.d) interfaceC44101a).f414679c;
                } else if (!z12) {
                    throw new IllegalStateException("Only ChangeItemQuantity and AddItemToCart actions are expected");
                }
                return new C43210w(new CartSimilarItemsInternalAction.ChangeItemQuantity(dVar.f414677a, i12));
            }
            if (str2 == null) {
                str2 = cartSimilarItemsArguments.f115928f;
            }
            c43210w = new C43210w(new CartSimilarItemsInternalAction.OpenDeepLink(new CartLink(str2, null, 2, null)));
        }
        return c43210w;
    }
}
