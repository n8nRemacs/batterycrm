package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C42833p;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlin.sequences.AbstractC43032o;
import kotlin.sequences.C43034q;
import kotlin.sequences.InterfaceC43030m;
import kotlinx.coroutines.H0;

/* compiled from: JobSupport.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0005\t\n\u000b\f\rR\u0013\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0002X\u0082\u0004¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/V0;", "Lkotlinx/coroutines/N0;", "Lkotlinx/coroutines/y;", "Lkotlinx/coroutines/j1;", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/w;", "_parentHandle", "", "_state", "a", "b", "c", "d", "e", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes8.dex */
public class V0 implements N0, InterfaceC43312y, InterfaceC43258j1 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f410723b = AtomicReferenceFieldUpdater.newUpdater(V0.class, Object.class, "_state$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f410724c = AtomicReferenceFieldUpdater.newUpdater(V0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* compiled from: JobSupport.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/V0$a;", "T", "Lkotlinx/coroutines/r;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> extends r<T> {

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public final V0 f410725j;

        public a(@Y61.k Continuation<? super T> continuation, @Y61.k V0 v02) {
            super(1, continuation);
            this.f410725j = v02;
        }

        @Override // kotlinx.coroutines.r
        @Y61.k
        public final Throwable n(@Y61.k V0 v02) {
            Throwable thB;
            Object objJ0 = this.f410725j.j0();
            return (!(objJ0 instanceof c) || (thB = ((c) objJ0).b()) == null) ? objJ0 instanceof E ? ((E) objJ0).f410693a : v02.J() : thB;
        }

        @Override // kotlinx.coroutines.r
        @Y61.k
        public final String y() {
            return "AwaitContinuation";
        }
    }

    /* compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/V0$b;", "Lkotlinx/coroutines/U0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends U0 {

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final V0 f410726f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final c f410727g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final C43310x f410728h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final Object f410729i;

        public b(@Y61.k V0 v02, @Y61.k c cVar, @Y61.k C43310x c43310x, @Y61.l Object obj) {
            this.f410726f = v02;
            this.f410727g = cVar;
            this.f410728h = c43310x;
            this.f410729i = obj;
        }

        @Override // kotlinx.coroutines.H0
        public final void a(@Y61.l Throwable th2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V0.f410723b;
            V0 v02 = this.f410726f;
            v02.getClass();
            C43310x c43310xS0 = V0.s0(this.f410728h);
            c cVar = this.f410727g;
            Object obj = this.f410729i;
            if (c43310xS0 != null) {
                while (Q0.g(c43310xS0.f412303f, new b(v02, cVar, c43310xS0, obj), 1) == C43224g1.f411855b) {
                    c43310xS0 = V0.s0(c43310xS0);
                    if (c43310xS0 == null) {
                    }
                }
                return;
            }
            v02.K(v02.b0(cVar, obj));
        }
    }

    /* compiled from: JobSupport.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003R\u0013\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0082\u0004R\u000b\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004R\u0013\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0002X\u0082\u0004¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/V0$c;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/F0;", "Lkotlinx/atomicfu/AtomicRef;", "_exceptionsHolder", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleting", "", "_rootCause", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements F0 {

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f410730c = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f410731d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f410732e = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile = 0;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* renamed from: b, reason: collision with root package name and from toString */
        @Y61.k
        public final C43132e1 list;

        public c(@Y61.k C43132e1 c43132e1, @Y61.l Throwable th2) {
            this.list = c43132e1;
            this._rootCause$volatile = th2;
        }

        public final void a(@Y61.k Throwable th2) {
            Throwable thB = b();
            if (thB == null) {
                f410731d.set(this, th2);
                return;
            }
            if (th2 == thB) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f410732e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th2);
                return;
            }
            if (!(obj instanceof Throwable)) {
                if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th2);
                    return;
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
            if (th2 == obj) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th2);
            atomicReferenceFieldUpdater.set(this, arrayList);
        }

        @Y61.l
        public final Throwable b() {
            return (Throwable) f410731d.get(this);
        }

        @Override // kotlinx.coroutines.F0
        @Y61.k
        /* renamed from: c, reason: from getter */
        public final C43132e1 getF410694b() {
            return this.list;
        }

        public final boolean d() {
            return b() != null;
        }

        public final boolean e() {
            return f410730c.get(this) != 0;
        }

        @Y61.k
        public final ArrayList f(@Y61.l Throwable th2) {
            ArrayList arrayList;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f410732e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
                arrayList = (ArrayList) obj;
            }
            Throwable thB = b();
            if (thB != null) {
                arrayList.add(0, thB);
            }
            if (th2 != null && !th2.equals(thB)) {
                arrayList.add(th2);
            }
            atomicReferenceFieldUpdater.set(this, C43077a1.f410753e);
            return arrayList;
        }

        @Override // kotlinx.coroutines.F0
        /* renamed from: isActive */
        public final boolean getF411961b() {
            return b() == null;
        }

        @Y61.k
        public final String toString() {
            return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + b() + ", exceptions=" + f410732e.get(this) + ", list=" + this.list + ']';
        }
    }

    /* compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/V0$d;", "Lkotlinx/coroutines/U0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class d extends U0 {

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final kotlinx.coroutines.selects.r<?> f410734f;

        public d(@Y61.k kotlinx.coroutines.selects.r<?> rVar) {
            this.f410734f = rVar;
        }

        @Override // kotlinx.coroutines.H0
        public final void a(@Y61.l Throwable th2) {
            V0 v02 = V0.this;
            Object objJ0 = v02.j0();
            if (!(objJ0 instanceof E)) {
                objJ0 = C43077a1.a(objJ0);
            }
            this.f410734f.e(v02, objJ0);
        }
    }

    /* compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/V0$e;", "Lkotlinx/coroutines/U0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class e extends U0 {

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final kotlinx.coroutines.selects.r<?> f410736f;

        public e(@Y61.k kotlinx.coroutines.selects.r<?> rVar) {
            this.f410736f = rVar;
        }

        @Override // kotlinx.coroutines.H0
        public final void a(@Y61.l Throwable th2) {
            this.f410736f.e(V0.this, kotlin.G0.f406611a);
        }
    }

    /* compiled from: JobSupport.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/o;", "Lkotlinx/coroutines/N0;", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {963, 965}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
    public static final class f extends RestrictedSuspendLambda implements Y41.p<AbstractC43032o<? super N0>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public kotlinx.coroutines.internal.C f410738q;

        /* renamed from: r, reason: collision with root package name */
        public kotlinx.coroutines.internal.E f410739r;

        /* renamed from: s, reason: collision with root package name */
        public int f410740s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f410741t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ V0 f410742u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Continuation continuation, V0 v02) {
            super(2, continuation);
            this.f410742u = v02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(continuation, this.f410742u);
            fVar.f410741t = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(AbstractC43032o<? super N0> abstractC43032o, Continuation<? super kotlin.G0> continuation) {
            return ((f) create(abstractC43032o, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0062 -> B:27:0x0078). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0075 -> B:27:0x0078). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f410740s
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                kotlinx.coroutines.internal.E r1 = r6.f410739r
                kotlinx.coroutines.internal.C r3 = r6.f410738q
                java.lang.Object r4 = r6.f410741t
                kotlin.sequences.o r4 = (kotlin.sequences.AbstractC43032o) r4
                kotlin.C42729a0.b(r7)
                goto L78
            L1a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L22:
                kotlin.C42729a0.b(r7)
                goto L7d
            L26:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f410741t
                kotlin.sequences.o r7 = (kotlin.sequences.AbstractC43032o) r7
                kotlinx.coroutines.V0 r1 = r6.f410742u
                java.lang.Object r1 = r1.j0()
                boolean r4 = r1 instanceof kotlinx.coroutines.C43310x
                if (r4 == 0) goto L44
                kotlinx.coroutines.x r1 = (kotlinx.coroutines.C43310x) r1
                kotlinx.coroutines.V0 r1 = r1.f412303f
                r6.f410740s = r3
                java.lang.Object r7 = r7.a(r1, r6)
                if (r7 != r0) goto L7d
                return r0
            L44:
                boolean r3 = r1 instanceof kotlinx.coroutines.F0
                if (r3 == 0) goto L7d
                kotlinx.coroutines.F0 r1 = (kotlinx.coroutines.F0) r1
                kotlinx.coroutines.e1 r1 = r1.getF410694b()
                if (r1 == 0) goto L7d
                java.lang.Object r3 = r1.f()
                kotlinx.coroutines.internal.E r3 = (kotlinx.coroutines.internal.E) r3
                r4 = r7
                r5 = r3
                r3 = r1
                r1 = r5
            L5a:
                boolean r7 = r1.equals(r3)
                if (r7 != 0) goto L7d
                boolean r7 = r1 instanceof kotlinx.coroutines.C43310x
                if (r7 == 0) goto L78
                r7 = r1
                kotlinx.coroutines.x r7 = (kotlinx.coroutines.C43310x) r7
                r6.f410741t = r4
                r6.f410738q = r3
                r6.f410739r = r1
                r6.f410740s = r2
                kotlinx.coroutines.V0 r7 = r7.f412303f
                java.lang.Object r7 = r4.a(r7, r6)
                if (r7 != r0) goto L78
                return r0
            L78:
                kotlinx.coroutines.internal.E r1 = r1.g()
                goto L5a
            L7d:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.V0.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public V0(boolean z12) {
        this._state$volatile = z12 ? C43077a1.f410755g : C43077a1.f410754f;
    }

    public static CancellationException A0(V0 v02, Throwable th2) {
        v02.getClass();
        CancellationException cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        return cancellationException == null ? new JobCancellationException(v02.X(), th2, v02) : cancellationException;
    }

    public static C43310x s0(kotlinx.coroutines.internal.E e12) {
        while (e12.i()) {
            e12 = e12.h();
        }
        while (true) {
            e12 = e12.g();
            if (!e12.i()) {
                if (e12 instanceof C43310x) {
                    return (C43310x) e12;
                }
                if (e12 instanceof C43132e1) {
                    return null;
                }
            }
        }
    }

    public static String z0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof F0 ? ((F0) obj).getF411961b() ? "Active" : "New" : obj instanceof E ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.d() ? "Cancelling" : cVar.e() ? "Completing" : "Active";
    }

    @Override // kotlinx.coroutines.N0
    @Y61.l
    public final Object A(@Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objJ0;
        do {
            objJ0 = j0();
            if (!(objJ0 instanceof F0)) {
                Q0.e(continuation.getF411960f());
                return kotlin.G0.f406611a;
            }
        } while (y0(objJ0) < 0);
        r rVar = new r(1, IntrinsicsKt.intercepted(continuation));
        rVar.p();
        C43302t.a(rVar, Q0.g(this, new l1(rVar), 3));
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        if (objO != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objO = kotlin.G0.f406611a;
        }
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : kotlin.G0.f406611a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [T, java.lang.Throwable] */
    public final Object B0(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof F0)) {
            return C43077a1.f410749a;
        }
        C43310x c43310xS0 = null;
        if (((obj instanceof C43273r0) || (obj instanceof U0)) && !(obj instanceof C43310x) && !(obj2 instanceof E)) {
            F0 f02 = (F0) obj;
            Object g02 = obj2 instanceof F0 ? new G0((F0) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f410723b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, f02, g02)) {
                    u0(null);
                    v0(obj2);
                    Z(f02, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == f02);
            return C43077a1.f410751c;
        }
        F0 f03 = (F0) obj;
        C43132e1 c43132e1I0 = i0(f03);
        if (c43132e1I0 == null) {
            return C43077a1.f410751c;
        }
        c cVar = f03 instanceof c ? (c) f03 : null;
        if (cVar == null) {
            cVar = new c(c43132e1I0, null);
        }
        l0.h hVar = new l0.h();
        synchronized (cVar) {
            try {
                if (cVar.e()) {
                    return C43077a1.f410749a;
                }
                c.f410730c.set(cVar, 1);
                if (cVar != f03) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f410723b;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, f03, cVar)) {
                        if (atomicReferenceFieldUpdater2.get(this) != f03) {
                            return C43077a1.f410751c;
                        }
                    }
                }
                boolean zD2 = cVar.d();
                E e12 = obj2 instanceof E ? (E) obj2 : null;
                if (e12 != null) {
                    cVar.a(e12.f410693a);
                }
                ?? B12 = !zD2 ? cVar.b() : 0;
                hVar.f406842b = B12;
                kotlin.G0 g03 = kotlin.G0.f406611a;
                if (B12 != 0) {
                    t0(c43132e1I0, B12);
                }
                C43310x c43310x = f03 instanceof C43310x ? (C43310x) f03 : null;
                if (c43310x == null) {
                    C43132e1 list = f03.getF410694b();
                    if (list != null) {
                        c43310xS0 = s0(list);
                    }
                } else {
                    c43310xS0 = c43310x;
                }
                if (c43310xS0 != null) {
                    while (Q0.g(c43310xS0.f412303f, new b(this, cVar, c43310xS0, obj2), 1) == C43224g1.f411855b) {
                        c43310xS0 = s0(c43310xS0);
                        if (c43310xS0 == null) {
                        }
                    }
                    return C43077a1.f410750b;
                }
                return b0(cVar, obj2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kotlinx.coroutines.N0
    @Y61.k
    public final CancellationException J() {
        Object objJ0 = j0();
        if (!(objJ0 instanceof c)) {
            if (!(objJ0 instanceof F0)) {
                return objJ0 instanceof E ? A0(this, ((E) objJ0).f410693a) : new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        Throwable thB = ((c) objJ0).b();
        if (thB == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = X();
        }
        return new JobCancellationException(strConcat, thB, this);
    }

    @Override // kotlinx.coroutines.N0
    @Y61.k
    public final InterfaceC43308w L(@Y61.k V0 v02) {
        return (InterfaceC43308w) Q0.g(this, new C43310x(v02), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // kotlinx.coroutines.InterfaceC43258j1
    @Y61.k
    public final CancellationException O() {
        CancellationException cancellationExceptionB;
        Object objJ0 = j0();
        if (objJ0 instanceof c) {
            cancellationExceptionB = ((c) objJ0).b();
        } else if (objJ0 instanceof E) {
            cancellationExceptionB = ((E) objJ0).f410693a;
        } else {
            if (objJ0 instanceof F0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objJ0).toString());
            }
            cancellationExceptionB = null;
        }
        CancellationException cancellationException = cancellationExceptionB instanceof CancellationException ? cancellationExceptionB : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(z0(objJ0)), cancellationExceptionB, this) : cancellationException;
    }

    @Override // kotlinx.coroutines.N0
    @Y61.k
    public final InterfaceC43268o0 Q(boolean z12, boolean z13, @Y61.k Y41.l<? super Throwable, kotlin.G0> lVar) {
        return n0(z12, z13, new H0.a(lVar));
    }

    public void S(@Y61.l Object obj) {
        K(obj);
    }

    @Y61.l
    public final Object T(@Y61.k Continuation<Object> continuation) throws Throwable {
        Object objJ0;
        do {
            objJ0 = j0();
            if (!(objJ0 instanceof F0)) {
                if (objJ0 instanceof E) {
                    throw ((E) objJ0).f410693a;
                }
                return C43077a1.a(objJ0);
            }
        } while (y0(objJ0) < 0);
        a aVar = new a(IntrinsicsKt.intercepted(continuation), this);
        aVar.p();
        C43302t.a(aVar, Q0.g(this, new k1(aVar), 3));
        Object objO = aVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean U(@Y61.l Object obj) {
        kotlinx.coroutines.internal.a0 a0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objB0 = C43077a1.f410749a;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i12 = 2;
        boolean z12 = false;
        if (h0()) {
            do {
                Object objJ0 = j0();
                if (!(objJ0 instanceof F0) || ((objJ0 instanceof c) && ((c) objJ0).e())) {
                    objB0 = C43077a1.f410749a;
                    break;
                }
                objB0 = B0(objJ0, new E(a0(obj), z12, i12, objArr2 == true ? 1 : 0));
            } while (objB0 == C43077a1.f410751c);
            if (objB0 == C43077a1.f410750b) {
                return true;
            }
        }
        if (objB0 == C43077a1.f410749a) {
            Throwable thA0 = null;
            loop1: while (true) {
                Object objJ02 = j0();
                if (!(objJ02 instanceof c)) {
                    if (!(objJ02 instanceof F0)) {
                        a0Var = C43077a1.f410752d;
                        break;
                    }
                    if (thA0 == null) {
                        thA0 = a0(obj);
                    }
                    F0 f02 = (F0) objJ02;
                    if (f02.getF411961b()) {
                        C43132e1 c43132e1I0 = i0(f02);
                        if (c43132e1I0 == null) {
                            continue;
                        } else {
                            c cVar = new c(c43132e1I0, thA0);
                            do {
                                atomicReferenceFieldUpdater = f410723b;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, f02, cVar)) {
                                    t0(c43132e1I0, thA0);
                                    a0Var = C43077a1.f410749a;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == f02);
                        }
                    } else {
                        Object objB02 = B0(objJ02, new E(thA0, z12, i12, objArr == true ? 1 : 0));
                        if (objB02 == C43077a1.f410749a) {
                            throw new IllegalStateException(("Cannot happen in " + objJ02).toString());
                        }
                        if (objB02 != C43077a1.f410751c) {
                            objB0 = objB02;
                            break;
                        }
                    }
                } else {
                    synchronized (objJ02) {
                        try {
                            c cVar2 = (c) objJ02;
                            cVar2.getClass();
                            if ((c.f410732e.get(cVar2) == C43077a1.f410753e) == true) {
                                a0Var = C43077a1.f410752d;
                            } else {
                                boolean zD2 = ((c) objJ02).d();
                                if (obj != null || !zD2) {
                                    if (thA0 == null) {
                                        thA0 = a0(obj);
                                    }
                                    ((c) objJ02).a(thA0);
                                }
                                Throwable thB = zD2 ? null : ((c) objJ02).b();
                                if (thB != null) {
                                    t0(((c) objJ02).list, thB);
                                }
                                a0Var = C43077a1.f410749a;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            objB0 = a0Var;
        }
        if (objB0 != C43077a1.f410749a && objB0 != C43077a1.f410750b) {
            if (objB0 == C43077a1.f410752d) {
                return false;
            }
            K(objB0);
        }
        return true;
    }

    public void V(@Y61.k CancellationException cancellationException) {
        U(cancellationException);
    }

    public final boolean W(Throwable th2) {
        if (o0()) {
            return true;
        }
        boolean z12 = th2 instanceof CancellationException;
        InterfaceC43308w interfaceC43308w = (InterfaceC43308w) f410724c.get(this);
        return (interfaceC43308w == null || interfaceC43308w == C43224g1.f411855b) ? z12 : interfaceC43308w.b(th2) || z12;
    }

    @Y61.k
    public String X() {
        return "Job was cancelled";
    }

    public boolean Y(@Y61.k Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return U(th2) && getF410718d();
    }

    public final void Z(F0 f02, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f410724c;
        InterfaceC43308w interfaceC43308w = (InterfaceC43308w) atomicReferenceFieldUpdater.get(this);
        if (interfaceC43308w != null) {
            interfaceC43308w.dispose();
            atomicReferenceFieldUpdater.set(this, C43224g1.f411855b);
        }
        CompletionHandlerException completionHandlerException = null;
        E e12 = obj instanceof E ? (E) obj : null;
        Throwable th2 = e12 != null ? e12.f410693a : null;
        if (f02 instanceof U0) {
            try {
                ((U0) f02).a(th2);
                return;
            } catch (Throwable th3) {
                l0(new CompletionHandlerException("Exception in completion handler " + f02 + " for " + this, th3));
                return;
            }
        }
        C43132e1 list = f02.getF410694b();
        if (list != null) {
            for (kotlinx.coroutines.internal.E eG2 = (kotlinx.coroutines.internal.E) list.f(); !eG2.equals(list); eG2 = eG2.g()) {
                if (eG2 instanceof U0) {
                    U0 u02 = (U0) eG2;
                    try {
                        u02.a(th2);
                    } catch (Throwable th4) {
                        if (completionHandlerException != null) {
                            C42833p.a(completionHandlerException, th4);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + u02 + " for " + this, th4);
                            kotlin.G0 g02 = kotlin.G0.f406611a;
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                l0(completionHandlerException);
            }
        }
    }

    public final Throwable a0(Object obj) {
        if (!(obj == null ? true : obj instanceof Throwable)) {
            return ((InterfaceC43258j1) obj).O();
        }
        Throwable th2 = (Throwable) obj;
        return th2 == null ? new JobCancellationException(X(), null, this) : th2;
    }

    public final Object b0(c cVar, Object obj) {
        boolean zD2;
        Throwable thF0;
        C42822w c42822w = null;
        E e12 = obj instanceof E ? (E) obj : null;
        Throwable th2 = e12 != null ? e12.f410693a : null;
        synchronized (cVar) {
            zD2 = cVar.d();
            ArrayList<Throwable> arrayListF = cVar.f(th2);
            thF0 = f0(cVar, arrayListF);
            if (thF0 != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                for (Throwable th3 : arrayListF) {
                    if (th3 != thF0 && th3 != thF0 && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                        C42833p.a(thF0, th3);
                    }
                }
            }
        }
        boolean z12 = false;
        if (thF0 != null && thF0 != th2) {
            obj = new E(thF0, z12, 2, c42822w);
        }
        if (thF0 != null && (W(thF0) || k0(thF0))) {
            E e13 = (E) obj;
            e13.getClass();
            E.f410692b.compareAndSet(e13, 0, 1);
        }
        if (!zD2) {
            u0(thF0);
        }
        v0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f410723b;
        Object g02 = obj instanceof F0 ? new G0((F0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, cVar, g02) && atomicReferenceFieldUpdater.get(this) == cVar) {
        }
        Z(cVar, obj);
        return obj;
    }

    @Override // kotlinx.coroutines.N0
    public void c(@Y61.l CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(X(), null, this);
        }
        V(cancellationException);
    }

    @Override // kotlinx.coroutines.N0
    public final boolean c0() {
        return !(j0() instanceof F0);
    }

    @Y61.l
    public final Throwable d0() {
        Object objJ0 = j0();
        if (objJ0 instanceof c) {
            Throwable thB = ((c) objJ0).b();
            if (thB != null) {
                return thB;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (objJ0 instanceof F0) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (objJ0 instanceof E) {
            return ((E) objJ0).f410693a;
        }
        return null;
    }

    public final boolean e(F0 f02, C43132e1 c43132e1, U0 u02) {
        char c12;
        W0 w02 = new W0(u02, this, f02);
        do {
            kotlinx.coroutines.internal.E eH2 = c43132e1.h();
            kotlinx.coroutines.internal.E.f411863c.set(u02, eH2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.internal.E.f411862b;
            atomicReferenceFieldUpdater.set(u02, c43132e1);
            w02.f411866c = c43132e1;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(eH2, c43132e1, w02)) {
                    c12 = w02.a(eH2) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater.get(eH2) != c43132e1) {
                    c12 = 0;
                    break;
                }
            }
            if (c12 == 1) {
                return true;
            }
        } while (c12 != 2);
        return false;
    }

    public final boolean e0() {
        Object objJ0 = j0();
        if (objJ0 instanceof E) {
            E e12 = (E) objJ0;
            e12.getClass();
            if (E.f410692b.get(e12) != 0) {
                return true;
            }
        }
        return false;
    }

    public final Throwable f0(c cVar, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (cVar.d()) {
                return new JobCancellationException(X(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th2 = (Throwable) next;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof TimeoutCancellationException) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th4 = (Throwable) next2;
                if (th4 != th3 && (th4 instanceof TimeoutCancellationException)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r12, @Y61.k Y41.p<? super R, ? super CoroutineContext.Element, ? extends R> pVar) {
        return (R) CoroutineContext.Element.DefaultImpls.fold(this, r12, pVar);
    }

    /* renamed from: g0 */
    public boolean getF410718d() {
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Y61.l
    public final <E extends CoroutineContext.Element> E get(@Y61.k CoroutineContext.Key<E> key) {
        return (E) CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlinx.coroutines.N0
    @Y61.k
    public final InterfaceC43030m<N0> getChildren() {
        return new C43034q(new f(null, this));
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @Y61.k
    public final CoroutineContext.Key<?> getKey() {
        return N0.f410716u2;
    }

    @Override // kotlinx.coroutines.N0
    @Y61.l
    public final N0 getParent() {
        InterfaceC43308w interfaceC43308w = (InterfaceC43308w) f410724c.get(this);
        if (interfaceC43308w != null) {
            return interfaceC43308w.getParent();
        }
        return null;
    }

    public boolean h(@Y61.l Throwable th2) {
        return U(th2);
    }

    public boolean h0() {
        return this instanceof A;
    }

    public final C43132e1 i0(F0 f02) {
        C43132e1 list = f02.getF410694b();
        if (list != null) {
            return list;
        }
        if (f02 instanceof C43273r0) {
            return new C43132e1();
        }
        if (f02 instanceof U0) {
            x0((U0) f02);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + f02).toString());
    }

    @Override // kotlinx.coroutines.N0
    public boolean isActive() {
        Object objJ0 = j0();
        return (objJ0 instanceof F0) && ((F0) objJ0).getF411961b();
    }

    @Override // kotlinx.coroutines.N0
    public final boolean isCancelled() {
        Object objJ0 = j0();
        return (objJ0 instanceof E) || ((objJ0 instanceof c) && ((c) objJ0).d());
    }

    @Y61.l
    public final Object j0() {
        while (true) {
            Object obj = f410723b.get(this);
            if (!(obj instanceof kotlinx.coroutines.internal.S)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.S) obj).a(this);
        }
    }

    @Override // kotlinx.coroutines.N0
    @Y61.k
    public final InterfaceC43268o0 k(@Y61.k Y41.l<? super Throwable, kotlin.G0> lVar) {
        return n0(false, true, new H0.a(lVar));
    }

    public boolean k0(@Y61.k Throwable th2) {
        return false;
    }

    public final void m0(@Y61.l N0 n02) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f410724c;
        if (n02 == null) {
            atomicReferenceFieldUpdater.set(this, C43224g1.f411855b);
            return;
        }
        n02.start();
        InterfaceC43308w interfaceC43308wL = n02.L(this);
        atomicReferenceFieldUpdater.set(this, interfaceC43308wL);
        if (c0()) {
            interfaceC43308wL.dispose();
            atomicReferenceFieldUpdater.set(this, C43224g1.f411855b);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Y61.k
    public final CoroutineContext minusKey(@Y61.k CoroutineContext.Key<?> key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    public boolean n(Object obj) {
        return p0(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b4 A[SYNTHETIC] */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.InterfaceC43268o0 n0(boolean r8, boolean r9, @Y61.k kotlinx.coroutines.H0 r10) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.V0.n0(boolean, boolean, kotlinx.coroutines.H0):kotlinx.coroutines.o0");
    }

    public boolean o0() {
        return this instanceof C43228i;
    }

    public final boolean p0(@Y61.l Object obj) {
        Object objB0;
        do {
            objB0 = B0(j0(), obj);
            if (objB0 == C43077a1.f410749a) {
                return false;
            }
            if (objB0 == C43077a1.f410750b) {
                return true;
            }
        } while (objB0 == C43077a1.f410751c);
        K(objB0);
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Y61.k
    public final CoroutineContext plus(@Y61.k CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }

    @Y61.l
    public final Object q0(@Y61.l Object obj) {
        Object objB0;
        do {
            objB0 = B0(j0(), obj);
            if (objB0 == C43077a1.f410749a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                E e12 = obj instanceof E ? (E) obj : null;
                throw new IllegalStateException(str, e12 != null ? e12.f410693a : null);
            }
        } while (objB0 == C43077a1.f410751c);
        return objB0;
    }

    @Y61.k
    public String r0() {
        return getClass().getSimpleName();
    }

    @Override // kotlinx.coroutines.N0
    public final boolean start() {
        int iY02;
        do {
            iY02 = y0(j0());
            if (iY02 == 0) {
                return false;
            }
        } while (iY02 != 1);
        return true;
    }

    public final void t0(C43132e1 c43132e1, Throwable th2) {
        u0(th2);
        CompletionHandlerException completionHandlerException = null;
        for (kotlinx.coroutines.internal.E eG2 = (kotlinx.coroutines.internal.E) c43132e1.f(); !eG2.equals(c43132e1); eG2 = eG2.g()) {
            if (eG2 instanceof O0) {
                U0 u02 = (U0) eG2;
                try {
                    u02.a(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        C42833p.a(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + u02 + " for " + this, th3);
                        kotlin.G0 g02 = kotlin.G0.f406611a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            l0(completionHandlerException);
        }
        W(th2);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(r0() + '{' + z0(j0()) + '}');
        sb2.append('@');
        sb2.append(X.a(this));
        return sb2.toString();
    }

    public final void x0(U0 u02) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C43132e1 c43132e1 = new C43132e1();
        u02.getClass();
        kotlinx.coroutines.internal.E.f411863c.set(c43132e1, u02);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = kotlinx.coroutines.internal.E.f411862b;
        atomicReferenceFieldUpdater2.set(c43132e1, u02);
        loop0: while (true) {
            if (u02.f() == u02) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(u02, u02, c43132e1)) {
                    if (atomicReferenceFieldUpdater2.get(u02) != u02) {
                        break;
                    }
                }
                c43132e1.e(u02);
                break loop0;
            }
            break;
        }
        kotlinx.coroutines.internal.E eG2 = u02.g();
        do {
            atomicReferenceFieldUpdater = f410723b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, u02, eG2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == u02);
    }

    public final int y0(Object obj) {
        boolean z12 = obj instanceof C43273r0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f410723b;
        if (z12) {
            if (((C43273r0) obj).f411961b) {
                return 0;
            }
            C43273r0 c43273r0 = C43077a1.f410755g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c43273r0)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            w0();
            return 1;
        }
        if (!(obj instanceof E0)) {
            return 0;
        }
        C43132e1 c43132e1 = ((E0) obj).f410694b;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c43132e1)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        w0();
        return 1;
    }

    public void w0() {
    }

    public void K(@Y61.l Object obj) {
    }

    public void l0(@Y61.k CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public void u0(@Y61.l Throwable th2) {
    }

    public void v0(@Y61.l Object obj) {
    }
}
