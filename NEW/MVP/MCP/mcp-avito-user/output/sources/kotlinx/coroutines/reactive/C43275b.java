package kotlinx.coroutines.reactive;

import java.util.NoSuchElementException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.P;

/* compiled from: Await.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/reactive/b;", "Lorg/reactivestreams/d;", "kotlinx-coroutines-reactive"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.reactive.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43275b implements org.reactivestreams.d<Object> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public org.reactivestreams.e f411974b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Object f411975c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f411976d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f411977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r f411978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f411979g;

    /* compiled from: Await.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.reactive.b$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                s sVar = s.f412007c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                s sVar2 = s.f412007c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                s sVar3 = s.f412007c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                s sVar4 = s.f412007c;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: Await.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlinx.coroutines.reactive.b$b, reason: collision with other inner class name */
    public static final class C11735b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ org.reactivestreams.e f411980l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11735b(org.reactivestreams.e eVar) {
            super(0);
            this.f411980l = eVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f411980l.cancel();
            return G0.f406611a;
        }
    }

    /* compiled from: Await.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlinx.coroutines.reactive.b$c */
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ org.reactivestreams.e f411981l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(org.reactivestreams.e eVar) {
            super(0);
            this.f411981l = eVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f411981l.cancel();
            return G0.f406611a;
        }
    }

    /* compiled from: Await.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlinx.coroutines.reactive.b$d */
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ org.reactivestreams.e f411982l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(org.reactivestreams.e eVar) {
            super(0);
            this.f411982l = eVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f411982l.cancel();
            return G0.f406611a;
        }
    }

    /* compiled from: Await.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlinx.coroutines.reactive.b$e */
    public static final class e extends N implements Y41.l<Throwable, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ org.reactivestreams.e f411984m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(org.reactivestreams.e eVar) {
            super(1);
            this.f411984m = eVar;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            C43275b.this.a(new C43276c(this.f411984m));
            return G0.f406611a;
        }
    }

    /* compiled from: Await.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlinx.coroutines.reactive.b$f */
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ org.reactivestreams.e f411985l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ s f411986m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(org.reactivestreams.e eVar, s sVar) {
            super(0);
            this.f411985l = eVar;
            this.f411986m = sVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            s sVar = s.f412007c;
            s sVar2 = this.f411986m;
            this.f411985l.request((sVar2 == sVar || sVar2 == s.f412008d) ? 1L : Long.MAX_VALUE);
            return G0.f406611a;
        }
    }

    public C43275b(kotlinx.coroutines.r rVar, s sVar) {
        this.f411978f = rVar;
        this.f411979g = sVar;
    }

    @Override // org.reactivestreams.d
    public final void K(@Y61.k org.reactivestreams.e eVar) {
        if (this.f411974b != null) {
            a(new d(eVar));
            return;
        }
        this.f411974b = eVar;
        this.f411978f.r(new e(eVar));
        a(new f(eVar, this.f411979g));
    }

    public final synchronized void a(Y41.a<G0> aVar) {
        aVar.invoke();
    }

    @Override // org.reactivestreams.d
    public final void e() {
        boolean z12 = this.f411977e;
        kotlinx.coroutines.r rVar = this.f411978f;
        if (z12) {
            P.a(rVar.f411960f, new IllegalStateException("'onComplete' was called after the publisher already signalled being in a terminal state"));
            return;
        }
        this.f411977e = true;
        boolean z13 = this.f411976d;
        s sVar = this.f411979g;
        if (z13) {
            if (sVar == s.f412008d || sVar == s.f412007c || !rVar.isActive()) {
                return;
            }
            int i12 = Z.f406624c;
            rVar.resumeWith(this.f411975c);
            return;
        }
        if (sVar == s.f412008d || sVar == s.f412011g) {
            int i13 = Z.f406624c;
            rVar.resumeWith(null);
        } else if (rVar.isActive()) {
            int i14 = Z.f406624c;
            rVar.resumeWith(new Z.b(new NoSuchElementException("No value received via onNext for " + sVar)));
        }
    }

    @Override // org.reactivestreams.d
    public final void onError(@Y61.k Throwable th2) {
        boolean z12 = this.f411977e;
        kotlinx.coroutines.r rVar = this.f411978f;
        if (z12) {
            P.a(rVar.f411960f, new IllegalStateException("'onError' was called after the publisher already signalled being in a terminal state"));
        } else {
            this.f411977e = true;
            int i12 = Z.f406624c;
            rVar.resumeWith(new Z.b(th2));
        }
    }

    @Override // org.reactivestreams.d
    public final void onNext(Object obj) {
        org.reactivestreams.e eVar = this.f411974b;
        kotlinx.coroutines.r rVar = this.f411978f;
        CoroutineContext coroutineContext = rVar.f411960f;
        if (eVar == null) {
            P.a(coroutineContext, new IllegalStateException("'onNext' was called before 'onSubscribe'"));
            return;
        }
        if (this.f411977e) {
            P.a(coroutineContext, new IllegalStateException("'onNext' was called after the publisher already signalled being in a terminal state"));
            return;
        }
        s sVar = this.f411979g;
        int iOrdinal = sVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            if (this.f411976d) {
                P.a(coroutineContext, new IllegalStateException("Only a single value was requested in '" + sVar + "', but the publisher provided more"));
                return;
            }
            this.f411976d = true;
            a(new C11735b(eVar));
            int i12 = Z.f406624c;
            rVar.resumeWith(obj);
            return;
        }
        if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
            if ((sVar != s.f412010f && sVar != s.f412011g) || !this.f411976d) {
                this.f411975c = obj;
                this.f411976d = true;
                return;
            }
            a(new c(eVar));
            if (rVar.isActive()) {
                int i13 = Z.f406624c;
                rVar.resumeWith(new Z.b(new IllegalArgumentException("More than one onNext value for " + sVar)));
            }
        }
    }
}
