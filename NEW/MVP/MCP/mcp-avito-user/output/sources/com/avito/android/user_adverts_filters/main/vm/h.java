package com.avito.android.user_adverts_filters.main.vm;

import androidx.view.M0;
import com.avito.android.remote.error.ApiError;
import com.avito.android.user_adverts_filters.UserAdvertsFiltersData;
import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinScreen;
import com.avito.android.user_adverts_filters.main.tracker.UserAdvertsFiltersScreen;
import com.avito.android.user_adverts_filters.main.vm.a;
import com.avito.android.user_adverts_filters.main.vm.e;
import com.avito.android.util.R0;
import gj.InterfaceC40691b;
import java.io.Closeable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Y1;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import qJ0.InterfaceC47305a;
import qJ0.InterfaceC47308d;
import rJ0.InterfaceC47554a;

/* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/vm/h;", "Lcom/avito/android/arch/mvi/android/k;", "Lcom/avito/android/user_adverts_filters/main/vm/h$b;", "Lcom/avito/android/user_adverts_filters/main/vm/h$f;", "Lcom/avito/android/user_adverts_filters/main/vm/h$d;", "Lgj/e;", "Landroidx/lifecycle/M0;", "b", "c", "d", "e", "f", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h extends M0 implements com.avito.android.arch.mvi.android.k<b, f, d>, gj.e {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final R0 f316399E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f316400J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final e.a f316401K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final a.C9825a f316402L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.l
    public N0 f316403M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.l
    public N0 f316404N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f316405O = C42727D.c(new i());

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f316406P = C42727D.c(new j());

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f316407Q = C42727D.c(g.f316431l);

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final c f316408R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f316409S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f316410T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f316411U;

    /* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts_filters.main.vm.UserAdvertsFiltersMainMviViewModel$1", f = "UserAdvertsFiltersMainMviViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f316412q;

        /* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.user_adverts_filters.main.vm.UserAdvertsFiltersMainMviViewModel$1$1", f = "UserAdvertsFiltersMainMviViewModel.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.user_adverts_filters.main.vm.h$a$a, reason: collision with other inner class name */
        public static final class C9827a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f316414q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ h f316415r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9827a(h hVar, Continuation<? super C9827a> continuation) {
                super(2, continuation);
                this.f316415r = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C9827a(this.f316415r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C9827a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f316414q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f316414q = 1;
                    h hVar = this.f316415r;
                    Object objCollect = C43175k.I(hVar.f316399E.c(), com.avito.android.arch.mvi.utils.h.c(hVar.le().f316389d)).collect(new p(hVar), this);
                    if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCollect = G0.f406611a;
                    }
                    if (objCollect == coroutine_suspended) {
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

        /* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.user_adverts_filters.main.vm.UserAdvertsFiltersMainMviViewModel$1$2", f = "UserAdvertsFiltersMainMviViewModel.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f316416q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ h f316417r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(h hVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f316417r = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f316417r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f316416q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f316416q = 1;
                    h hVar = this.f316417r;
                    Object objCollect = hVar.le().getEvents().collect(new o(hVar), this);
                    if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCollect = G0.f406611a;
                    }
                    if (objCollect == coroutine_suspended) {
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

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = h.this.new a(continuation);
            aVar.f316412q = obj;
            return aVar;
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
            T t12 = (T) this.f316412q;
            h hVar = h.this;
            C43259k.d(t12, null, null, new C9827a(hVar, null), 3);
            C43259k.d(t12, null, null, new b(hVar, null), 3);
            return G0.f406611a;
        }
    }

    /* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/vm/h$b;", "", "a", "b", "c", "d", "Lcom/avito/android/user_adverts_filters/main/vm/h$b$a;", "Lcom/avito/android/user_adverts_filters/main/vm/h$b$b;", "Lcom/avito/android/user_adverts_filters/main/vm/h$b$c;", "Lcom/avito/android/user_adverts_filters/main/vm/h$b$d;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/vm/h$b$a;", "Lcom/avito/android/user_adverts_filters/main/vm/h$b;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final UserAdvertsFiltersBeduinScreen f316418a;

            public a(@Y61.k UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreen) {
                this.f316418a = userAdvertsFiltersBeduinScreen;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f316418a, ((a) obj).f316418a);
            }

            public final int hashCode() {
                return this.f316418a.f316078b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Back(screen=" + this.f316418a + ')';
            }
        }

        /* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/vm/h$b$b;", "Lcom/avito/android/user_adverts_filters/main/vm/h$b;", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts_filters.main.vm.h$b$b, reason: collision with other inner class name */
        public static final /* data */ class C9828b implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C9828b f316419a = new C9828b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C9828b);
            }

            public final int hashCode() {
                return -146969652;
            }

            @Y61.k
            public final String toString() {
                return "Close";
            }
        }

        /* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/vm/h$b$c;", "Lcom/avito/android/user_adverts_filters/main/vm/h$b;", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f316420a = new c();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 161787461;
            }

            @Y61.k
            public final String toString() {
                return "Reload";
            }
        }

        /* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/vm/h$b$d;", "Lcom/avito/android/user_adverts_filters/main/vm/h$b;", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final d f316421a = new d();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -133321949;
            }

            @Y61.k
            public final String toString() {
                return "Reset";
            }
        }
    }

    /* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/vm/h$c;", "Ljava/io/Closeable;", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Closeable {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f316422b = new LinkedHashMap();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            LinkedHashMap linkedHashMap = this.f316422b;
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                ((com.avito.android.user_adverts_filters.main.vm.a) it.next()).close();
            }
            linkedHashMap.clear();
        }
    }

    /* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/vm/h$d;", "", "a", "b", "c", "Lcom/avito/android/user_adverts_filters/main/vm/h$d$a;", "Lcom/avito/android/user_adverts_filters/main/vm/h$d$b;", "Lcom/avito/android/user_adverts_filters/main/vm/h$d$c;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {

        /* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/vm/h$d$a;", "Lcom/avito/android/user_adverts_filters/main/vm/h$d;", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f316423a = new a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1708050344;
            }

            @Y61.k
            public final String toString() {
                return "Close";
            }
        }

        /* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/vm/h$d$b;", "Lcom/avito/android/user_adverts_filters/main/vm/h$d;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final UserAdvertsFiltersData f316424a;

            public b(@Y61.k UserAdvertsFiltersData userAdvertsFiltersData) {
                this.f316424a = userAdvertsFiltersData;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f316424a, ((b) obj).f316424a);
            }

            public final int hashCode() {
                return this.f316424a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "FiltersApplied(filtersData=" + this.f316424a + ')';
            }
        }

        /* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/vm/h$d$c;", "Lcom/avito/android/user_adverts_filters/main/vm/h$d;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final ApiError f316425a;

            public c(@Y61.k ApiError apiError) {
                this.f316425a = apiError;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f316425a, ((c) obj).f316425a);
            }

            public final int hashCode() {
                return this.f316425a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return AK.c.n(new StringBuilder("RequestFailed(apiError="), this.f316425a, ')');
            }
        }
    }

    /* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/vm/h$e;", "", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface e {
        @Y61.k
        h create();
    }

    /* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/vm/h$f;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/user_adverts_filters/main/vm/h$f$a;", "Lcom/avito/android/user_adverts_filters/main/vm/h$f$b;", "Lcom/avito/android/user_adverts_filters/main/vm/h$f$c;", "Lcom/avito/android/user_adverts_filters/main/vm/h$f$d;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class f extends com.avito.android.analytics.screens.mvi.q {

        /* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/vm/h$f$a;", "Lcom/avito/android/user_adverts_filters/main/vm/h$f;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends f {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final com.avito.android.user_adverts_filters.main.view.h f316426b;

            public a(@Y61.k com.avito.android.user_adverts_filters.main.view.h hVar) {
                super(null);
                this.f316426b = hVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f316426b, ((a) obj).f316426b);
            }

            public final int hashCode() {
                return this.f316426b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Content(viewState=" + this.f316426b + ')';
            }
        }

        /* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/vm/h$f$b;", "Lcom/avito/android/user_adverts_filters/main/vm/h$f;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends f {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final ApiError f316427b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final Throwable f316428c;

            public b(@Y61.l ApiError apiError, @Y61.l Throwable th2) {
                super(null);
                this.f316427b = apiError;
                this.f316428c = th2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f316427b, bVar.f316427b) && L.f(this.f316428c, bVar.f316428c);
            }

            public final int hashCode() {
                ApiError apiError = this.f316427b;
                int iHashCode = (apiError == null ? 0 : apiError.hashCode()) * 31;
                Throwable th2 = this.f316428c;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(apiError=");
                sb2.append(this.f316427b);
                sb2.append(", throwable=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f316428c, ')');
            }
        }

        /* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/vm/h$f$c;", "Lcom/avito/android/user_adverts_filters/main/vm/h$f;", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends f {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final c f316429b = new c();

            public c() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1696173715;
            }

            @Y61.k
            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/vm/h$f$d;", "Lcom/avito/android/user_adverts_filters/main/vm/h$f;", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d extends f {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final d f316430b = new d();

            public d() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1365694785;
            }

            @Y61.k
            public final String toString() {
                return "None";
            }
        }

        public /* synthetic */ f(C42822w c42822w) {
            this();
        }

        public f() {
        }
    }

    /* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/Z1;", "LqJ0/d;", "invoke", "()Lkotlinx/coroutines/flow/Z1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Z1<InterfaceC47308d>> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f316431l = new g();

        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Z1<InterfaceC47308d> invoke() {
            return p2.a(InterfaceC47308d.b.f429187a);
        }
    }

    /* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/Y1;", "Lcom/avito/android/user_adverts_filters/main/vm/h$d;", "invoke", "()Lkotlinx/coroutines/flow/Y1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts_filters.main.vm.h$h, reason: collision with other inner class name */
    public static final class C9829h extends N implements Y41.a<Y1<d>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C9829h f316432l = new C9829h();

        public C9829h() {
            super(0);
        }

        @Override // Y41.a
        public final Y1<d> invoke() {
            return f2.b(0, 16, null, 5);
        }
    }

    /* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/vm/e;", "invoke", "()Lcom/avito/android/user_adverts_filters/main/vm/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.android.user_adverts_filters.main.vm.e> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.user_adverts_filters.main.vm.e invoke() {
            e.a aVar = h.this.f316401K;
            return new com.avito.android.user_adverts_filters.main.vm.e(aVar.f316391a, aVar.f316392b, null);
        }
    }

    /* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/Z1;", "LrJ0/c;", "invoke", "()Lkotlinx/coroutines/flow/Z1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<Z1<rJ0.c>> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Z1<rJ0.c> invoke() {
            return p2.a(h.this.le().f316389d.getValue());
        }
    }

    /* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/n2;", "Lcom/avito/android/user_adverts_filters/main/vm/h$f;", "invoke", "()Lkotlinx/coroutines/flow/n2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<n2<? extends f>> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final n2<? extends f> invoke() {
            h hVar = h.this;
            InterfaceC43160i interfaceC43160iI = C43175k.I(hVar.f316399E.c(), new q(new C1((Z1) hVar.f316406P.getValue(), (Z1) hVar.f316407Q.getValue(), r.f316463b), hVar));
            A1.a aVarA = androidx.view.N0.a(hVar);
            i2.f411430a.getClass();
            return C43175k.U(interfaceC43160iI, aVarA, i2.a.f411432b, f.d.f316430b);
        }
    }

    @i31.c
    public h(@Y61.k R0 r02, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k e.a aVar, @Y61.k a.C9825a c9825a) {
        this.f316399E = r02;
        this.f316400J = interfaceC40691b;
        this.f316401K = aVar;
        this.f316402L = c9825a;
        c cVar = new c();
        this.f316408R = cVar;
        this.f316409S = C42727D.c(new k());
        this.f316410T = C42727D.c(C9829h.f316432l);
        this.f316411U = interfaceC40691b;
        interfaceC40691b.g(UserAdvertsFiltersScreen.f316328d);
        addCloseable(cVar);
        addCloseable(le());
        C43259k.d(androidx.view.N0.a(this), null, null, new a(null), 3);
    }

    @Override // com.avito.android.arch.mvi.android.m
    public final InterfaceC43160i getEvents() {
        return (Y1) this.f316410T.getValue();
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<f> getState() {
        return (n2) this.f316409S.getValue();
    }

    @Override // com.avito.android.arch.mvi.android.l
    /* renamed from: ke, reason: merged with bridge method [inline-methods] */
    public final void accept(@Y61.k b bVar) {
        if (bVar instanceof b.a) {
            com.avito.android.user_adverts_filters.main.vm.a aVar = (com.avito.android.user_adverts_filters.main.vm.a) this.f316408R.f316422b.get(((b.a) bVar).f316418a);
            if (aVar != null) {
                aVar.accept(InterfaceC47305a.C12316a.f429162a);
            }
            le().accept(InterfaceC47554a.C12368a.f429727a);
            return;
        }
        if (bVar instanceof b.c) {
            le().accept(InterfaceC47554a.f.f429734a);
        } else if (bVar instanceof b.d) {
            le().accept(InterfaceC47554a.g.f429735a);
        } else if (bVar instanceof b.C9828b) {
            le().accept(InterfaceC47554a.b.f429728a);
        }
    }

    public final com.avito.android.user_adverts_filters.main.vm.e le() {
        return (com.avito.android.user_adverts_filters.main.vm.e) this.f316405O.getValue();
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f316400J.onCleared();
        N0 n02 = this.f316403M;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        N0 n03 = this.f316404N;
        if (n03 != null) {
            ((V0) n03).c(null);
        }
    }
}
