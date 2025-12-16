package kotlinx.coroutines.sync;

import com.avito.android.remote.model.SearchParamsConverterKt;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.H1;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.InterfaceC43268o0;
import kotlinx.coroutines.InterfaceC43271q;
import kotlinx.coroutines.internal.X;
import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.r;
import kotlinx.coroutines.selects.s;

/* compiled from: Mutex.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0006\u0007R\u0013\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/sync/d;", "Lkotlinx/coroutines/sync/l;", "Lkotlinx/coroutines/sync/a;", "Lkotlinx/atomicfu/AtomicRef;", "", SearchParamsConverterKt.OWNER, "a", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class d extends l implements kotlinx.coroutines.sync.a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f412256h = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    /* compiled from: Mutex.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/sync/d$a;", "Lkotlinx/coroutines/q;", "Lkotlin/G0;", "Lkotlinx/coroutines/H1;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a implements InterfaceC43271q<G0>, H1 {

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final r<G0> f412257b;

        public a(@Y61.k r rVar) {
            this.f412257b = rVar;
        }

        @Override // kotlinx.coroutines.InterfaceC43271q
        public final void C(Y41.l lVar, Object obj) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f412256h;
            d dVar = d.this;
            atomicReferenceFieldUpdater.set(dVar, null);
            kotlinx.coroutines.sync.b bVar = new kotlinx.coroutines.sync.b(dVar, this);
            this.f412257b.C(bVar, (G0) obj);
        }

        @Override // kotlinx.coroutines.InterfaceC43271q
        @I0
        public final void I(@Y61.k Object obj) {
            this.f412257b.I(obj);
        }

        @Override // kotlinx.coroutines.H1
        public final void c(@Y61.k X<?> x12, int i12) {
            this.f412257b.c(x12, i12);
        }

        @Override // kotlinx.coroutines.InterfaceC43271q
        public final boolean f(@Y61.l Throwable th2) {
            return this.f412257b.f(th2);
        }

        @Override // kotlin.coroutines.Continuation
        @Y61.k
        /* renamed from: getContext */
        public final CoroutineContext getF411998b() {
            return this.f412257b.f411960f;
        }

        @Override // kotlinx.coroutines.InterfaceC43271q
        public final boolean isActive() {
            return this.f412257b.isActive();
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(@Y61.k Object obj) {
            this.f412257b.resumeWith(obj);
        }

        @Override // kotlinx.coroutines.InterfaceC43271q
        public final a0 t(Y41.l lVar, Object obj) {
            d dVar = d.this;
            c cVar = new c(dVar, this);
            a0 a0VarE = this.f412257b.E(cVar, (G0) obj);
            if (a0VarE != null) {
                d.f412256h.set(dVar, null);
            }
            return a0VarE;
        }
    }

    /* compiled from: Mutex.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/sync/d$b;", "Q", "Lkotlinx/coroutines/selects/s;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b<Q> implements s<Q> {

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final s<Q> f412259b;

        /* renamed from: c, reason: collision with root package name */
        @X41.f
        @Y61.l
        public final Object f412260c;

        public b(@Y61.k s<Q> sVar, @Y61.l Object obj) {
            this.f412259b = sVar;
            this.f412260c = obj;
        }

        @Override // kotlinx.coroutines.selects.r
        public final void b(@Y61.k InterfaceC43268o0 interfaceC43268o0) {
            this.f412259b.b(interfaceC43268o0);
        }

        @Override // kotlinx.coroutines.H1
        public final void c(@Y61.k X<?> x12, int i12) {
            this.f412259b.c(x12, i12);
        }

        @Override // kotlinx.coroutines.selects.r
        public final void d(@Y61.l Object obj) {
            d.f412256h.set(d.this, this.f412260c);
            this.f412259b.d(obj);
        }

        @Override // kotlinx.coroutines.selects.r
        public final boolean e(@Y61.k Object obj, @Y61.l Object obj2) {
            boolean zE2 = this.f412259b.e(obj, obj2);
            if (zE2) {
                d.f412256h.set(d.this, this.f412260c);
            }
            return zE2;
        }

        @Override // kotlinx.coroutines.selects.r
        @Y61.k
        /* renamed from: getContext */
        public final CoroutineContext getF412215b() {
            return this.f412259b.getF412215b();
        }
    }

    public d() {
        super(1);
        this.owner$volatile = j.f412267a;
        new h(this);
    }

    @Override // kotlinx.coroutines.sync.a
    public final boolean a() {
        return Math.max(l.f412273g.get(this), 0) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r1.C(r4.f412275b, kotlin.G0.f406611a);
     */
    @Override // kotlinx.coroutines.sync.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r4.f()
            if (r0 == 0) goto L9
            kotlin.G0 r5 = kotlin.G0.f406611a
            goto L50
        L9:
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r5)
            kotlinx.coroutines.r r0 = kotlinx.coroutines.C43302t.b(r0)
            kotlinx.coroutines.sync.d$a r1 = new kotlinx.coroutines.sync.d$a     // Catch: java.lang.Throwable -> L51
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L51
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.sync.l.f412273g     // Catch: java.lang.Throwable -> L51
            int r2 = r2.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L51
            int r3 = r4.f412274a     // Catch: java.lang.Throwable -> L51
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L2a
            kotlin.G0 r2 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L51
            Y41.l<java.lang.Throwable, kotlin.G0> r3 = r4.f412275b     // Catch: java.lang.Throwable -> L51
            r1.C(r3, r2)     // Catch: java.lang.Throwable -> L51
            goto L30
        L2a:
            boolean r2 = r4.e(r1)     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L16
        L30:
            java.lang.Object r0 = r0.o()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L3d
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r5)
        L3d:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r5) goto L45
            r5 = r0
            goto L47
        L45:
            kotlin.G0 r5 = kotlin.G0.f406611a
        L47:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r5 != r0) goto L4e
            goto L50
        L4e:
            kotlin.G0 r5 = kotlin.G0.f406611a
        L50:
            return r5
        L51:
            r5 = move-exception
            r0.z()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.d.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.sync.a
    public final void d(@Y61.l Object obj) {
        while (a()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f412256h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            a0 a0Var = j.f412267a;
            if (obj2 != a0Var) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    release();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final boolean f() {
        int i12;
        char c12;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l.f412273g;
            int i13 = atomicIntegerFieldUpdater.get(this);
            int i14 = this.f412274a;
            if (i13 > i14) {
                do {
                    i12 = atomicIntegerFieldUpdater.get(this);
                    if (i12 > i14) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i12, i14));
            } else {
                if (i13 <= 0) {
                    c12 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i13, i13 - 1)) {
                    f412256h.set(this, null);
                    c12 = 0;
                    break;
                }
            }
        }
        if (c12 == 0) {
            return true;
        }
        if (c12 == 1) {
            return false;
        }
        if (c12 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    @Y61.k
    public final String toString() {
        return "Mutex@" + kotlinx.coroutines.X.a(this) + "[isLocked=" + a() + ",owner=" + f412256h.get(this) + ']';
    }
}
