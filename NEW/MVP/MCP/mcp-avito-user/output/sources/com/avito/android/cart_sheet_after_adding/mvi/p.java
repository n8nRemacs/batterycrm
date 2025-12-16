package com.avito.android.cart_sheet_after_adding.mvi;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.cart_sheet_after_adding.mvi.entity.CartSheetAfterAddingInternalAction;
import com.avito.android.util.R0;
import gn.InterfaceC40710b;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;
import tn.InterfaceC48692a;
import tn.InterfaceC48693b;
import tn.InterfaceC48694c;

/* compiled from: CartSheetAfterAddingViewModel.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u0018\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/p;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/arch/mvi/android/k;", "", "Lcom/avito/android/cart_sheet_after_adding/mvi/Action;", "Lgn/e;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class p extends M0 implements com.avito.android.arch.mvi.android.k<Object, gn.e, Object> {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final R0 f115422E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final t f115423J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f115424K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f115425L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f115426M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f115427N;

    /* compiled from: CartSheetAfterAddingViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cart_sheet_after_adding.mvi.CartSheetAfterAddingViewModel$1", f = "CartSheetAfterAddingViewModel.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f115428q;

        /* compiled from: CartSheetAfterAddingViewModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.cart_sheet_after_adding.mvi.p$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C3363a extends C42801a implements Y41.p<tn.d, Continuation<? super InterfaceC43160i<? extends Object>>, Object>, SuspendFunction {
            @Y61.l
            public final Object a(@Y61.k tn.d dVar) {
                ((t) this.receiver).getClass();
                return C43175k.G(new s(dVar, null));
            }

            @Override // Y41.p
            public final /* bridge */ /* synthetic */ Object invoke(tn.d dVar, Continuation<? super InterfaceC43160i<? extends Object>> continuation) {
                return a(dVar);
            }
        }

        /* compiled from: CartSheetAfterAddingViewModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class b implements InterfaceC43172j, D {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f115430b;

            public b(p pVar) {
                this.f115430b = pVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            public final Object emit(@Y61.k Object obj, @Y61.k Continuation<? super G0> continuation) {
                this.f115430b.accept(obj);
                G0 g02 = G0.f406611a;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return g02;
            }

            public final boolean equals(@Y61.l Object obj) {
                if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                    return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.D
            @Y61.k
            public final InterfaceC43072x<?> getFunctionDelegate() {
                return new C42801a(2, this.f115430b, p.class, "accept", "accept(Ljava/lang/Object;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return p.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f115428q;
            if (i12 == 0) {
                C42729a0.b(obj);
                p pVar = p.this;
                InterfaceC43160i interfaceC43160iC = C43175k.C(new C3363a(2, pVar.f115423J, t.class, "mapToActions", "mapToActions(Lcom/avito/android/cart_snippet_actions/feature/entity/CartSnippetActionsState;)Lkotlinx/coroutines/flow/Flow;", 4), C43175k.t((com.avito.android.arch.mvi.c) pVar.f115425L.getValue(), 1));
                b bVar = new b(pVar);
                this.f115428q = 1;
                if (interfaceC43160iC.collect(bVar, this) == coroutine_suspended) {
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

    /* compiled from: CartSheetAfterAddingViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cart_sheet_after_adding.mvi.CartSheetAfterAddingViewModel$accept$1", f = "CartSheetAfterAddingViewModel.kt", i = {}, l = {54, 55}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f115431q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Object f115432r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ p f115433s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, p pVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f115432r = obj;
            this.f115433s = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f115432r, this.f115433s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f115431q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Object obj2 = this.f115432r;
                boolean z12 = obj2 instanceof InterfaceC48692a;
                p pVar = this.f115433s;
                if (z12) {
                    com.avito.android.arch.mvi.c cVar = (com.avito.android.arch.mvi.c) pVar.f115425L.getValue();
                    this.f115431q = 1;
                    if (cVar.ya(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (obj2 instanceof InterfaceC40710b) {
                    com.avito.android.arch.mvi.c cVar2 = (com.avito.android.arch.mvi.c) pVar.f115424K.getValue();
                    this.f115431q = 2;
                    if (cVar2.ya(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CartSheetAfterAddingViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/i;", "", "invoke", "()Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<InterfaceC43160i<? extends Object>> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC43160i<? extends Object> invoke() {
            p pVar = p.this;
            return C43175k.N(((com.avito.android.arch.mvi.c) pVar.f115424K.getValue()).f91928q, ((com.avito.android.arch.mvi.c) pVar.f115425L.getValue()).f91928q);
        }
    }

    /* compiled from: CartSheetAfterAddingViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/arch/mvi/c;", "Lgn/b;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction;", "Lgn/e;", "Lgn/d;", "invoke", "()Lcom/avito/android/arch/mvi/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<com.avito.android.arch.mvi.c<InterfaceC40710b, CartSheetAfterAddingInternalAction, gn.e, gn.d>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f115435l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ p f115436m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(j jVar, p pVar) {
            super(0);
            this.f115435l = jVar;
            this.f115436m = pVar;
        }

        @Override // Y41.a
        public final com.avito.android.arch.mvi.c<InterfaceC40710b, CartSheetAfterAddingInternalAction, gn.e, gn.d> invoke() {
            return com.avito.android.arch.mvi.q.b(this.f115435l, null, N0.a(this.f115436m), 1);
        }
    }

    /* compiled from: CartSheetAfterAddingViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/arch/mvi/c;", "Ltn/a;", "Ltn/b;", "Ltn/d;", "Ltn/c;", "invoke", "()Lcom/avito/android/arch/mvi/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<com.avito.android.arch.mvi.c<InterfaceC48692a, InterfaceC48693b, tn.d, InterfaceC48694c>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.arch.mvi.q<InterfaceC48692a, InterfaceC48693b, tn.d, InterfaceC48694c> f115437l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ p f115438m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.avito.android.arch.mvi.q<InterfaceC48692a, InterfaceC48693b, tn.d, InterfaceC48694c> qVar, p pVar) {
            super(0);
            this.f115437l = qVar;
            this.f115438m = pVar;
        }

        @Override // Y41.a
        public final com.avito.android.arch.mvi.c<InterfaceC48692a, InterfaceC48693b, tn.d, InterfaceC48694c> invoke() {
            return com.avito.android.arch.mvi.q.b(this.f115437l, null, N0.a(this.f115438m), 1);
        }
    }

    /* compiled from: CartSheetAfterAddingViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/n2;", "Lgn/e;", "invoke", "()Lkotlinx/coroutines/flow/n2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<n2<? extends gn.e>> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final n2<? extends gn.e> invoke() {
            p pVar = p.this;
            com.avito.android.arch.mvi.c cVar = (com.avito.android.arch.mvi.c) pVar.f115424K.getValue();
            A1.a aVarA = N0.a(pVar);
            i2.f411430a.getClass();
            return C43175k.U(cVar, aVarA, i2.a.f411433c, ((com.avito.android.arch.mvi.c) pVar.f115424K.getValue()).f91929r.get());
        }
    }

    @Inject
    public p(@Y61.k j jVar, @Y61.k com.avito.android.arch.mvi.q<InterfaceC48692a, InterfaceC48693b, tn.d, InterfaceC48694c> qVar, @Y61.k R0 r02, @Y61.k t tVar) {
        this.f115422E = r02;
        this.f115423J = tVar;
        this.f115424K = C42727D.c(new d(jVar, this));
        this.f115425L = C42727D.c(new e(qVar, this));
        C43259k.d(N0.a(this), null, null, new a(null), 3);
        this.f115426M = C42727D.c(new f());
        this.f115427N = C42727D.c(new c());
    }

    @Override // com.avito.android.arch.mvi.android.l
    public final void accept(@Y61.k Object obj) {
        C43259k.d(N0.a(this), this.f115422E.b(), null, new b(obj, this, null), 2);
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<Object> getEvents() {
        return (InterfaceC43160i) this.f115427N.getValue();
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<gn.e> getState() {
        return (n2) this.f115426M.getValue();
    }
}
