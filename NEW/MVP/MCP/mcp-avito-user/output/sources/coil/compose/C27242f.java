package coil.compose;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.B2;
import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.Q1;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.C22261k;
import androidx.compose.ui.graphics.drawscope.g;
import androidx.compose.ui.layout.InterfaceC22374n;
import coil.request.C27246c;
import coil.request.p;
import coil.view.C27251e;
import coil.view.Precision;
import coil.view.Scale;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.internal.K;
import kotlinx.coroutines.t1;
import okhttp3.internal.http.StatusLine;

/* compiled from: AsyncImagePainter.kt */
@F3
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcoil/compose/f;", "Landroidx/compose/ui/graphics/painter/e;", "Landroidx/compose/runtime/B2;", "b", "c", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: coil.compose.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27242f extends androidx.compose.ui.graphics.painter.e implements B2 {

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public static final b f58194v = new b(null);

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<c, c> f58195w = a.f58211l;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public C43238h f58196g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Z1<l0.n> f58197h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f58198i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f58199j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f58200k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public c f58201l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.graphics.painter.e f58202m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public Y41.l<? super c, ? extends c> f58203n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super c, G0> f58204o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public InterfaceC22374n f58205p;

    /* renamed from: q, reason: collision with root package name */
    public int f58206q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f58207r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f58208s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f58209t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f58210u;

    /* compiled from: AsyncImagePainter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcoil/compose/f$c;", "it", "invoke", "(Lcoil/compose/f$c;)Lcoil/compose/f$c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: coil.compose.f$a */
    public static final class a extends N implements Y41.l<c, c> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f58211l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final c invoke(c cVar) {
            return cVar;
        }
    }

    /* compiled from: AsyncImagePainter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcoil/compose/f$b;", "", "<init>", "()V", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: coil.compose.f$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: AsyncImagePainter.kt */
    @P
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcoil/compose/f$c;", "", "<init>", "()V", "a", "b", "c", "d", "Lcoil/compose/f$c$a;", "Lcoil/compose/f$c$b;", "Lcoil/compose/f$c$c;", "Lcoil/compose/f$c$d;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: coil.compose.f$c */
    public static abstract class c {

        /* compiled from: AsyncImagePainter.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcoil/compose/f$c$a;", "Lcoil/compose/f$c;", "<init>", "()V", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: coil.compose.f$c$a */
        public static final /* data */ class a extends c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f58212a = new a();

            public a() {
                super(null);
            }

            @Override // coil.compose.C27242f.c
            @Y61.l
            /* renamed from: a */
            public final androidx.compose.ui.graphics.painter.e getF58216a() {
                return null;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1515560141;
            }

            @Y61.k
            public final String toString() {
                return "Empty";
            }
        }

        /* compiled from: AsyncImagePainter.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/compose/f$c$b;", "Lcoil/compose/f$c;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: coil.compose.f$c$b */
        public static final /* data */ class b extends c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final androidx.compose.ui.graphics.painter.e f58213a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final coil.request.e f58214b;

            public b(@Y61.l androidx.compose.ui.graphics.painter.e eVar, @Y61.k coil.request.e eVar2) {
                super(null);
                this.f58213a = eVar;
                this.f58214b = eVar2;
            }

            @Override // coil.compose.C27242f.c
            @Y61.l
            /* renamed from: a, reason: from getter */
            public final androidx.compose.ui.graphics.painter.e getF58216a() {
                return this.f58213a;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f58213a, bVar.f58213a) && L.f(this.f58214b, bVar.f58214b);
            }

            public final int hashCode() {
                androidx.compose.ui.graphics.painter.e eVar = this.f58213a;
                return this.f58214b.hashCode() + ((eVar == null ? 0 : eVar.hashCode()) * 31);
            }

            @Y61.k
            public final String toString() {
                return "Error(painter=" + this.f58213a + ", result=" + this.f58214b + ')';
            }
        }

        /* compiled from: AsyncImagePainter.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/compose/f$c$c;", "Lcoil/compose/f$c;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: coil.compose.f$c$c, reason: collision with other inner class name */
        public static final /* data */ class C2065c extends c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final androidx.compose.ui.graphics.painter.e f58215a;

            public C2065c(@Y61.l androidx.compose.ui.graphics.painter.e eVar) {
                super(null);
                this.f58215a = eVar;
            }

            @Override // coil.compose.C27242f.c
            @Y61.l
            /* renamed from: a, reason: from getter */
            public final androidx.compose.ui.graphics.painter.e getF58216a() {
                return this.f58215a;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2065c) && L.f(this.f58215a, ((C2065c) obj).f58215a);
            }

            public final int hashCode() {
                androidx.compose.ui.graphics.painter.e eVar = this.f58215a;
                if (eVar == null) {
                    return 0;
                }
                return eVar.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Loading(painter=" + this.f58215a + ')';
            }
        }

        /* compiled from: AsyncImagePainter.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/compose/f$c$d;", "Lcoil/compose/f$c;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: coil.compose.f$c$d */
        public static final /* data */ class d extends c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final androidx.compose.ui.graphics.painter.e f58216a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final coil.request.x f58217b;

            public d(@Y61.k androidx.compose.ui.graphics.painter.e eVar, @Y61.k coil.request.x xVar) {
                super(null);
                this.f58216a = eVar;
                this.f58217b = xVar;
            }

            @Override // coil.compose.C27242f.c
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final androidx.compose.ui.graphics.painter.e getF58216a() {
                return this.f58216a;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return L.f(this.f58216a, dVar.f58216a) && L.f(this.f58217b, dVar.f58217b);
            }

            public final int hashCode() {
                return this.f58217b.hashCode() + (this.f58216a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                return "Success(painter=" + this.f58216a + ", result=" + this.f58217b + ')';
            }
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        @Y61.l
        /* renamed from: a */
        public abstract androidx.compose.ui.graphics.painter.e getF58216a();

        public c() {
        }
    }

    /* compiled from: AsyncImagePainter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "coil.compose.AsyncImagePainter$onRemembered$1", f = "AsyncImagePainter.kt", i = {}, l = {StatusLine.HTTP_TEMP_REDIRECT}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: coil.compose.f$d */
    public static final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f58218q;

        /* compiled from: AsyncImagePainter.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcoil/request/p;", "invoke", "()Lcoil/request/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: coil.compose.f$d$a */
        public static final class a extends N implements Y41.a<coil.request.p> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ C27242f f58220l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C27242f c27242f) {
                super(0);
                this.f58220l = c27242f;
            }

            @Override // Y41.a
            public final coil.request.p invoke() {
                return (coil.request.p) ((C22082i3) this.f58220l.f58209t).getF42167b();
            }
        }

        /* compiled from: AsyncImagePainter.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcoil/request/p;", "it", "Lcoil/compose/f$c;", "<anonymous>", "(Lcoil/request/p;)Lcoil/compose/f$c;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "coil.compose.AsyncImagePainter$onRemembered$1$2", f = "AsyncImagePainter.kt", i = {}, l = {306}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: coil.compose.f$d$b */
        public static final class b extends SuspendLambda implements Y41.p<coil.request.p, Continuation<? super c>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f58221q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f58222r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ C27242f f58223s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C27242f c27242f, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f58223s = c27242f;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                b bVar = new b(this.f58223s, continuation);
                bVar.f58222r = obj;
                return bVar;
            }

            @Override // Y41.p
            public final Object invoke(coil.request.p pVar, Continuation<? super c> continuation) {
                return ((b) create(pVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                C27242f c27242f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f58221q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    coil.request.p pVar = (coil.request.p) this.f58222r;
                    C27242f c27242f2 = this.f58223s;
                    coil.j jVar = (coil.j) ((C22082i3) c27242f2.f58210u).getF42167b();
                    p.a aVarA = coil.request.p.a(pVar);
                    aVarA.f58692d = new C27243g(c27242f2);
                    aVarA.b();
                    C27246c c27246c = pVar.f58657L;
                    if (c27246c.f58637a == null) {
                        aVarA.f58714z = new h(c27242f2);
                        aVarA.b();
                    }
                    if (c27246c.f58638b == null) {
                        InterfaceC22374n interfaceC22374n = c27242f2.f58205p;
                        C27251e c27251e = G.f58164b;
                        InterfaceC22374n.f40491a.getClass();
                        aVarA.f58685A = L.f(interfaceC22374n, InterfaceC22374n.a.f40494c) ? true : L.f(interfaceC22374n, InterfaceC22374n.a.f40497f) ? Scale.f58756c : Scale.f58755b;
                    }
                    if (c27246c.f58640d != Precision.f58750b) {
                        aVarA.f58697i = Precision.f58751c;
                    }
                    coil.request.p pVarA = aVarA.a();
                    this.f58222r = c27242f2;
                    this.f58221q = 1;
                    obj = jVar.c(pVarA, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c27242f = c27242f2;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c27242f = (C27242f) this.f58222r;
                    C42729a0.b(obj);
                }
                coil.request.q qVar = (coil.request.q) obj;
                b bVar = C27242f.f58194v;
                c27242f.getClass();
                if (qVar instanceof coil.request.x) {
                    coil.request.x xVar = (coil.request.x) qVar;
                    return new c.d(c27242f.j(xVar.f58738a), xVar);
                }
                if (!(qVar instanceof coil.request.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                Drawable drawable = ((coil.request.e) qVar).f58641a;
                return new c.b(drawable != null ? c27242f.j(drawable) : null, (coil.request.e) qVar);
            }
        }

        /* compiled from: AsyncImagePainter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: coil.compose.f$d$c */
        public /* synthetic */ class c implements InterfaceC43172j, kotlin.jvm.internal.D {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C27242f f58224b;

            public c(C27242f c27242f) {
                this.f58224b = c27242f;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                b bVar = C27242f.f58194v;
                this.f58224b.k((c) obj);
                G0 g02 = G0.f406611a;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return g02;
            }

            public final boolean equals(@Y61.l Object obj) {
                if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                    return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.D
            @Y61.k
            public final InterfaceC43072x<?> getFunctionDelegate() {
                return new C42801a(2, this.f58224b, C27242f.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return C27242f.this.new d(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f58218q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C27242f c27242f = C27242f.this;
                kotlinx.coroutines.flow.internal.l lVarL = C43175k.L(new b(c27242f, null), C22126m3.n(new a(c27242f)));
                c cVar = new c(c27242f);
                this.f58218q = 1;
                if (lVarL.collect(cVar, this) == coroutine_suspended) {
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

    public C27242f(@Y61.k coil.request.p pVar, @Y61.k coil.j jVar) {
        l0.n.f413402b.getClass();
        this.f58197h = p2.a(l0.n.a(0L));
        this.f58198i = C22126m3.g(null);
        this.f58199j = Q1.a(1.0f);
        this.f58200k = C22126m3.g(null);
        c.a aVar = c.a.f58212a;
        this.f58201l = aVar;
        this.f58203n = f58195w;
        InterfaceC22374n.f40491a.getClass();
        this.f58205p = InterfaceC22374n.a.f40494c;
        androidx.compose.ui.graphics.drawscope.g.f39490B1.getClass();
        this.f58206q = g.a.f39493c;
        this.f58208s = C22126m3.g(aVar);
        this.f58209t = C22126m3.g(pVar);
        this.f58210u = C22126m3.g(jVar);
    }

    @Override // androidx.compose.ui.graphics.painter.e
    public final boolean a(float f12) {
        ((C22040c3) this.f58199j).S6(f12);
        return true;
    }

    @Override // androidx.compose.runtime.B2
    public final void b() {
        C43238h c43238h = this.f58196g;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        this.f58196g = null;
        Object obj = this.f58202m;
        B2 b22 = obj instanceof B2 ? (B2) obj : null;
        if (b22 != null) {
            b22.b();
        }
    }

    @Override // androidx.compose.runtime.B2
    public final void c() {
        if (this.f58196g != null) {
            return;
        }
        CoroutineContext.Element elementB = t1.b();
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        C43238h c43238hA = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) elementB, K.f411877a.y()));
        this.f58196g = c43238hA;
        Object obj = this.f58202m;
        B2 b22 = obj instanceof B2 ? (B2) obj : null;
        if (b22 != null) {
            b22.c();
        }
        if (!this.f58207r) {
            C43259k.d(c43238hA, null, null, new d(null), 3);
            return;
        }
        p.a aVarA = coil.request.p.a((coil.request.p) ((C22082i3) this.f58209t).getF42167b());
        aVarA.f58690b = ((coil.j) ((C22082i3) this.f58210u).getF42167b()).getF58541b();
        aVarA.f58688D = null;
        coil.request.p pVarA = aVarA.a();
        Drawable drawableB = coil.util.k.b(pVarA, pVarA.f58652G, pVarA.f58651F, pVarA.f58658M.f58631j);
        k(new c.C2065c(drawableB != null ? j(drawableB) : null));
    }

    @Override // androidx.compose.ui.graphics.painter.e
    public final boolean d(@Y61.l androidx.compose.ui.graphics.U u12) {
        ((C22082i3) this.f58200k).setValue(u12);
        return true;
    }

    @Override // androidx.compose.runtime.B2
    public final void e() {
        C43238h c43238h = this.f58196g;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        this.f58196g = null;
        Object obj = this.f58202m;
        B2 b22 = obj instanceof B2 ? (B2) obj : null;
        if (b22 != null) {
            b22.e();
        }
    }

    @Override // androidx.compose.ui.graphics.painter.e
    /* renamed from: h */
    public final long getF39738j() {
        androidx.compose.ui.graphics.painter.e eVar = (androidx.compose.ui.graphics.painter.e) ((C22082i3) this.f58198i).getF42167b();
        if (eVar != null) {
            return eVar.getF39738j();
        }
        l0.n.f413402b.getClass();
        return l0.n.f413403c;
    }

    @Override // androidx.compose.ui.graphics.painter.e
    public final void i(@Y61.k androidx.compose.ui.graphics.drawscope.g gVar) {
        this.f58197h.setValue(l0.n.a(gVar.i()));
        androidx.compose.ui.graphics.painter.e eVar = (androidx.compose.ui.graphics.painter.e) ((C22082i3) this.f58198i).getF42167b();
        if (eVar != null) {
            eVar.g(gVar, gVar.i(), ((C22040c3) this.f58199j).f(), (androidx.compose.ui.graphics.U) ((C22082i3) this.f58200k).getF42167b());
        }
    }

    public final androidx.compose.ui.graphics.painter.e j(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? androidx.compose.ui.graphics.painter.b.a(new C22261k(((BitmapDrawable) drawable).getBitmap()), this.f58206q) : new com.google.accompanist.drawablepainter.a(drawable.mutate());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(coil.compose.C27242f.c r14) {
        /*
            r13 = this;
            coil.compose.f$c r0 = r13.f58201l
            Y41.l<? super coil.compose.f$c, ? extends coil.compose.f$c> r1 = r13.f58203n
            java.lang.Object r14 = r1.invoke(r14)
            coil.compose.f$c r14 = (coil.compose.C27242f.c) r14
            r13.f58201l = r14
            androidx.compose.runtime.y1 r1 = r13.f58208s
            androidx.compose.runtime.i3 r1 = (androidx.compose.runtime.C22082i3) r1
            r1.setValue(r14)
            boolean r1 = r14 instanceof coil.compose.C27242f.c.d
            r2 = 0
            if (r1 == 0) goto L1e
            r1 = r14
            coil.compose.f$c$d r1 = (coil.compose.C27242f.c.d) r1
            coil.request.x r1 = r1.f58217b
            goto L27
        L1e:
            boolean r1 = r14 instanceof coil.compose.C27242f.c.b
            if (r1 == 0) goto L65
            r1 = r14
            coil.compose.f$c$b r1 = (coil.compose.C27242f.c.b) r1
            coil.request.e r1 = r1.f58214b
        L27:
            coil.request.p r3 = r1.getF58739b()
            M2.c$a r3 = r3.f58671m
            coil.compose.i$a r4 = coil.compose.i.f58232a
            M2.c r3 = r3.a(r4, r1)
            boolean r4 = r3 instanceof M2.a
            if (r4 == 0) goto L65
            androidx.compose.ui.graphics.painter.e r4 = r0.getF58216a()
            boolean r5 = r0 instanceof coil.compose.C27242f.c.C2065c
            if (r5 == 0) goto L41
            r7 = r4
            goto L42
        L41:
            r7 = r2
        L42:
            androidx.compose.ui.graphics.painter.e r8 = r14.getF58216a()
            androidx.compose.ui.layout.n r9 = r13.f58205p
            M2.a r3 = (M2.a) r3
            boolean r4 = r1 instanceof coil.request.x
            if (r4 == 0) goto L58
            coil.request.x r1 = (coil.request.x) r1
            boolean r1 = r1.f58744g
            if (r1 != 0) goto L55
            goto L58
        L55:
            r1 = 0
        L56:
            r11 = r1
            goto L5a
        L58:
            r1 = 1
            goto L56
        L5a:
            coil.compose.n r1 = new coil.compose.n
            boolean r12 = r3.f10351d
            int r10 = r3.f10350c
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L66
        L65:
            r1 = r2
        L66:
            if (r1 == 0) goto L69
            goto L6d
        L69:
            androidx.compose.ui.graphics.painter.e r1 = r14.getF58216a()
        L6d:
            r13.f58202m = r1
            androidx.compose.runtime.y1 r3 = r13.f58198i
            androidx.compose.runtime.i3 r3 = (androidx.compose.runtime.C22082i3) r3
            r3.setValue(r1)
            kotlinx.coroutines.internal.h r1 = r13.f58196g
            if (r1 == 0) goto La5
            androidx.compose.ui.graphics.painter.e r1 = r0.getF58216a()
            androidx.compose.ui.graphics.painter.e r3 = r14.getF58216a()
            if (r1 == r3) goto La5
            androidx.compose.ui.graphics.painter.e r0 = r0.getF58216a()
            boolean r1 = r0 instanceof androidx.compose.runtime.B2
            if (r1 == 0) goto L8f
            androidx.compose.runtime.B2 r0 = (androidx.compose.runtime.B2) r0
            goto L90
        L8f:
            r0 = r2
        L90:
            if (r0 == 0) goto L95
            r0.e()
        L95:
            androidx.compose.ui.graphics.painter.e r0 = r14.getF58216a()
            boolean r1 = r0 instanceof androidx.compose.runtime.B2
            if (r1 == 0) goto La0
            r2 = r0
            androidx.compose.runtime.B2 r2 = (androidx.compose.runtime.B2) r2
        La0:
            if (r2 == 0) goto La5
            r2.c()
        La5:
            Y41.l<? super coil.compose.f$c, kotlin.G0> r0 = r13.f58204o
            if (r0 == 0) goto Lae
            coil.compose.G$a r0 = (coil.compose.G.a) r0
            r0.invoke(r14)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.compose.C27242f.k(coil.compose.f$c):void");
    }
}
