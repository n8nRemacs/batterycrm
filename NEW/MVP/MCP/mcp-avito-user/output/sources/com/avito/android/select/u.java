package com.avito.android.select;

import Xp0.AbstractC17036a;
import androidx.compose.runtime.internal.P;
import androidx.view.N0;
import com.avito.android.select.bottom_sheet_pagination.blueprints.PaginationState;
import dq0.C39783e;
import dq0.InterfaceC39781c;
import dq0.InterfaceC39782d;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: SelectViewModel.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/select/u;", "Lcom/avito/android/arch/mvi/android/j;", "Ldq0/c;", "Ldq0/e;", "Ldq0/d;", "e", "f", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class u extends com.avito.android.arch.mvi.android.j<InterfaceC39781c, C39783e, InterfaceC39782d> {

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final e2 f266822N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final e2 f266823O;

    /* compiled from: SelectViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/select/bottom_sheet_pagination/blueprints/PaginationState;", "it", "LXp0/a;", "apply", "(Lcom/avito/android/select/bottom_sheet_pagination/blueprints/PaginationState;)LXp0/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f266824b = new a<>();

        /* compiled from: SelectViewModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.select.u$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C7956a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f266825a;

            static {
                int[] iArr = new int[PaginationState.values().length];
                try {
                    PaginationState paginationState = PaginationState.f265329b;
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f266825a = iArr;
            }
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return C7956a.f266825a[((PaginationState) obj).ordinal()] == 1 ? AbstractC17036a.C1350a.f19075a : AbstractC17036a.b.f19076a;
        }
    }

    /* compiled from: SelectViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LXp0/a;", "it", "Lkotlin/G0;", "<anonymous>", "(LXp0/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.select.SelectViewModel$2", f = "SelectViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<AbstractC17036a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f266826q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = u.this.new b(continuation);
            bVar.f266826q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(AbstractC17036a abstractC17036a, Continuation<? super G0> continuation) {
            return ((b) create(abstractC17036a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            AbstractC17036a abstractC17036a = (AbstractC17036a) this.f266826q;
            u.this.accept(L.f(abstractC17036a, AbstractC17036a.c.f19077a) ? InterfaceC39781c.h.f394126a : L.f(abstractC17036a, AbstractC17036a.b.f19076a) ? new InterfaceC39781c.g(true) : new InterfaceC39781c.g(false));
            return G0.f406611a;
        }
    }

    /* compiled from: SelectViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.select.SelectViewModel$3", f = "SelectViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<String, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f266828q;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = u.this.new c(continuation);
            cVar.f266828q = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(String str, Continuation<? super G0> continuation) {
            return ((c) create(str, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            u.this.accept(new InterfaceC39781c.b((String) this.f266828q));
            return G0.f406611a;
        }
    }

    /* compiled from: SelectViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.select.SelectViewModel$4", f = "SelectViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<String, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f266830q;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = u.this.new d(continuation);
            dVar.f266830q = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(String str, Continuation<? super G0> continuation) {
            return ((d) create(str, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            u.this.accept(new InterfaceC39781c.e((String) this.f266830q));
            return G0.f406611a;
        }
    }

    /* compiled from: SelectViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/select/u$e;", "", "<init>", "()V", "", "SEARCH_DEBOUNCE", "J", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e {
        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        public e() {
        }
    }

    /* compiled from: SelectViewModel.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/u$f;", "", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface f {
        @Y61.k
        u create();
    }

    static {
        new e(null);
    }

    @i31.c
    public u(@Y61.k com.avito.android.select.mvi.n nVar, @Y61.k io.reactivex.rxjava3.core.z<PaginationState> zVar) {
        super(nVar, null, 2, null);
        e2 e2VarB = f2.b(0, 1, null, 5);
        this.f266822N = e2VarB;
        e2 e2VarB2 = f2.b(0, 1, null, 5);
        this.f266823O = e2VarB2;
        C43175k.K(new C43197r1(new b(null), C43175k.N(kotlinx.coroutines.rx3.y.a(zVar.d0(a.f266824b)), e2VarB2)), N0.a(this));
        C43175k.K(new C43197r1(new c(null), C43175k.n(C43175k.r(e2VarB), 400L)), N0.a(this));
        C43175k.K(new C43197r1(new d(null), C43175k.r(e2VarB)), N0.a(this));
    }
}
