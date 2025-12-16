package androidx.compose.runtime;

import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.snapshots.AbstractC22167l;
import androidx.compose.runtime.snapshots.AbstractC22168m;
import androidx.compose.runtime.snapshots.C22160e;
import androidx.compose.runtime.snapshots.C22176v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43311x0;
import kotlinx.coroutines.InterfaceC43271q;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: Recomposer.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/I;", "a", "b", "c", "d", "State", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Recomposer extends I {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public static final AtomicReference<Boolean> f38105A;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public static final a f38106y = new a(null);

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.flow.Z1<androidx.compose.runtime.external.kotlinx.collections.immutable.i<d>> f38107z;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C22117l f38108a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f38109b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public kotlinx.coroutines.N0 f38110c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Throwable f38111d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ArrayList f38112e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Object f38113f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public androidx.collection.S0<Object> f38114g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<InterfaceC22053d0> f38115h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ArrayList f38116i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ArrayList f38117j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.R0<Object, Object> f38118k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C22208z1 f38119l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.R0<C22183t1, C22153s1> f38120m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.R0<Object, Object> f38121n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public ArrayList f38122o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public LinkedHashSet f38123p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public kotlinx.coroutines.r f38124q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f38125r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public c f38126s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f38127t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.flow.Z1<State> f38128u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.P0 f38129v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final CoroutineContext f38130w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final d f38131x;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        /* renamed from: b, reason: collision with root package name */
        public static final State f38132b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f38133c;

        /* renamed from: d, reason: collision with root package name */
        public static final State f38134d;

        /* renamed from: e, reason: collision with root package name */
        public static final State f38135e;

        /* renamed from: f, reason: collision with root package name */
        public static final State f38136f;

        /* renamed from: g, reason: collision with root package name */
        public static final State f38137g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ State[] f38138h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f38139i;

        static {
            State state = new State("ShutDown", 0);
            f38132b = state;
            State state2 = new State("ShuttingDown", 1);
            f38133c = state2;
            State state3 = new State("Inactive", 2);
            f38134d = state3;
            State state4 = new State("InactivePendingWork", 3);
            f38135e = state4;
            State state5 = new State("Idle", 4);
            f38136f = state5;
            State state6 = new State("PendingWork", 5);
            f38137g = state6;
            State[] stateArr = {state, state2, state3, state4, state5, state6};
            f38138h = stateArr;
            f38139i = kotlin.enums.c.a(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f38138h.clone();
        }
    }

    /* compiled from: Recomposer.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R4\u0010\b\u001a\"\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004j\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR$\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\fR\u00020\r0\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/Recomposer$a;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicReference;", "", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/internal/AtomicReference;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/flow/Z1;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "Landroidx/compose/runtime/Recomposer$d;", "Landroidx/compose/runtime/Recomposer;", "_runningRecomposers", "Lkotlinx/coroutines/flow/Z1;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/Recomposer$b;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/Recomposer$c;", "Landroidx/compose/runtime/t2;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC22184t2 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Throwable f38140a;

        public c(@Y61.k Throwable th2) {
            this.f38140a = th2;
        }
    }

    /* compiled from: Recomposer.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/Recomposer$d;", "Landroidx/compose/runtime/u2;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class d implements InterfaceC22189u2 {
        public d() {
            throw null;
        }
    }

    /* compiled from: Recomposer.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            InterfaceC43271q<kotlin.G0> interfaceC43271qZ;
            Recomposer recomposer = Recomposer.this;
            synchronized (recomposer.f38109b) {
                interfaceC43271qZ = recomposer.z();
                if (recomposer.f38128u.getValue().compareTo(State.f38133c) <= 0) {
                    throw C43311x0.a("Recomposer shutdown; frame clock awaiter will never resume", recomposer.f38111d);
                }
            }
            if (interfaceC43271qZ != null) {
                int i12 = kotlin.Z.f406624c;
                interfaceC43271qZ.resumeWith(kotlin.G0.f406611a);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Recomposer.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            kotlinx.coroutines.r rVar;
            kotlinx.coroutines.r rVar2;
            Throwable th3 = th2;
            CancellationException cancellationExceptionA = C43311x0.a("Recomposer effect job completed", th3);
            Recomposer recomposer = Recomposer.this;
            synchronized (recomposer.f38109b) {
                try {
                    kotlinx.coroutines.N0 n02 = recomposer.f38110c;
                    rVar = null;
                    if (n02 != null) {
                        recomposer.f38128u.setValue(State.f38133c);
                        if (recomposer.f38125r) {
                            rVar2 = recomposer.f38124q;
                            if (rVar2 != null) {
                            }
                            recomposer.f38124q = null;
                            n02.k(new C22110j2(recomposer, th3));
                            rVar = rVar2;
                        } else {
                            n02.c(cancellationExceptionA);
                        }
                        rVar2 = null;
                        recomposer.f38124q = null;
                        n02.k(new C22110j2(recomposer, th3));
                        rVar = rVar2;
                    } else {
                        recomposer.f38111d = cancellationExceptionA;
                        recomposer.f38128u.setValue(State.f38132b);
                        kotlin.G0 g02 = kotlin.G0.f406611a;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            if (rVar != null) {
                int i12 = kotlin.Z.f406624c;
                rVar.resumeWith(kotlin.G0.f406611a);
            }
            return kotlin.G0.f406611a;
        }
    }

    static {
        h0.b.f396955f.getClass();
        f38107z = kotlinx.coroutines.flow.p2.a(h0.b.f396956g);
        f38105A = new AtomicReference<>(Boolean.FALSE);
    }

    public Recomposer(@Y61.k CoroutineContext coroutineContext) {
        C22117l c22117l = new C22117l(new e());
        this.f38108a = c22117l;
        this.f38109b = new Object();
        this.f38112e = new ArrayList();
        this.f38114g = new androidx.collection.S0<>(0, 1, null);
        this.f38115h = new androidx.compose.runtime.collection.e<>(new InterfaceC22053d0[16], 0);
        this.f38116i = new ArrayList();
        this.f38117j = new ArrayList();
        this.f38118k = androidx.compose.runtime.collection.d.c();
        this.f38119l = new C22208z1();
        this.f38120m = androidx.collection.i1.b();
        this.f38121n = androidx.compose.runtime.collection.d.c();
        this.f38128u = kotlinx.coroutines.flow.p2.a(State.f38134d);
        new androidx.compose.runtime.internal.N();
        kotlinx.coroutines.P0 p02 = new kotlinx.coroutines.P0((kotlinx.coroutines.N0) coroutineContext.get(kotlinx.coroutines.N0.f410716u2));
        p02.k(new f());
        this.f38129v = p02;
        this.f38130w = coroutineContext.plus(c22117l).plus(p02);
        this.f38131x = new d();
    }

    public static final void F(ArrayList arrayList, Recomposer recomposer, M m12) {
        arrayList.clear();
        synchronized (recomposer.f38109b) {
            try {
                Iterator it = recomposer.f38117j.iterator();
                while (it.hasNext()) {
                    C22183t1 c22183t1 = (C22183t1) it.next();
                    if (c22183t1.f38767c.equals(m12)) {
                        arrayList.add(c22183t1);
                        it.remove();
                    }
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final InterfaceC22053d0 u(Recomposer recomposer, InterfaceC22053d0 interfaceC22053d0, androidx.collection.S0 s02) {
        recomposer.getClass();
        if (interfaceC22053d0.o() || interfaceC22053d0.getF38044v()) {
            return null;
        }
        LinkedHashSet linkedHashSet = recomposer.f38123p;
        if (linkedHashSet != null && linkedHashSet.contains(interfaceC22053d0)) {
            return null;
        }
        AbstractC22167l.a aVar = AbstractC22167l.f38720e;
        C22125m2 c22125m2 = new C22125m2(interfaceC22053d0);
        C22154s2 c22154s2 = new C22154s2(s02, interfaceC22053d0);
        aVar.getClass();
        C22160e c22160eG = AbstractC22167l.a.g(c22125m2, c22154s2);
        try {
            AbstractC22167l abstractC22167lJ = c22160eG.j();
            if (s02 != null) {
                try {
                    if (s02.d()) {
                        interfaceC22053d0.b(new C22120l2(s02, interfaceC22053d0));
                    }
                } catch (Throwable th2) {
                    AbstractC22167l.q(abstractC22167lJ);
                    throw th2;
                }
            }
            boolean zE2 = interfaceC22053d0.e();
            AbstractC22167l.q(abstractC22167lJ);
            if (!zE2) {
                interfaceC22053d0 = null;
            }
            return interfaceC22053d0;
        } finally {
            w(c22160eG);
        }
    }

    public static final boolean v(Recomposer recomposer) {
        List<InterfaceC22053d0> listC;
        boolean z12 = true;
        synchronized (recomposer.f38109b) {
            if (!recomposer.f38114g.c()) {
                androidx.compose.runtime.collection.g gVar = new androidx.compose.runtime.collection.g(recomposer.f38114g);
                recomposer.f38114g = new androidx.collection.S0<>(0, 1, null);
                synchronized (recomposer.f38109b) {
                    listC = recomposer.C();
                }
                try {
                    int size = listC.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        listC.get(i12).j(gVar);
                        if (recomposer.f38128u.getValue().compareTo(State.f38133c) <= 0) {
                            break;
                        }
                    }
                    synchronized (recomposer.f38109b) {
                        recomposer.f38114g = new androidx.collection.S0<>(0, 1, null);
                        kotlin.G0 g02 = kotlin.G0.f406611a;
                    }
                    synchronized (recomposer.f38109b) {
                        if (recomposer.z() != null) {
                            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                        }
                        if (recomposer.f38115h.f38262d == 0 && !recomposer.A()) {
                            z12 = false;
                        }
                    }
                } catch (Throwable th2) {
                    synchronized (recomposer.f38109b) {
                        androidx.collection.S0<Object> s02 = recomposer.f38114g;
                        int i13 = s02.f25732d;
                        Iterator<T> it = gVar.iterator();
                        while (it.hasNext()) {
                            s02.m(it.next());
                        }
                        throw th2;
                    }
                }
            } else if (recomposer.f38115h.f38262d == 0 && !recomposer.A()) {
                z12 = false;
            }
        }
        return z12;
    }

    public static void w(C22160e c22160e) {
        try {
            if (c22160e.w() instanceof AbstractC22168m.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            c22160e.c();
        }
    }

    public static final void y(Recomposer recomposer, C22183t1 c22183t1, C22183t1 c22183t12) {
        ArrayList arrayList = c22183t12.f38772h;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                C22183t1 c22183t13 = (C22183t1) arrayList.get(i12);
                C22208z1 c22208z1 = recomposer.f38119l;
                Y0<Object> y02 = c22183t13.f38765a;
                androidx.compose.runtime.collection.d.a(c22208z1.f38806a, y02, new A1(c22183t13, c22183t1));
                androidx.compose.runtime.collection.d.a(c22208z1.f38807b, c22183t1, y02);
                y(recomposer, c22183t1, c22183t13);
            }
        }
    }

    public final boolean A() {
        return (this.f38127t || this.f38108a.f38490g.get() == 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f38109b
            monitor-enter(r0)
            androidx.collection.S0<java.lang.Object> r1 = r2.f38114g     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r1.d()     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            androidx.compose.runtime.collection.e<androidx.compose.runtime.d0> r1 = r2.f38115h     // Catch: java.lang.Throwable -> L1b
            int r1 = r1.f38262d     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L12
            goto L1d
        L12:
            boolean r1 = r2.A()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L19
            goto L1d
        L19:
            r1 = 0
            goto L1e
        L1b:
            r1 = move-exception
            goto L20
        L1d:
            r1 = 1
        L1e:
            monitor-exit(r0)
            return r1
        L20:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.B():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<androidx.compose.runtime.d0>] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final List<InterfaceC22053d0> C() {
        Object obj = this.f38113f;
        ?? r02 = obj;
        if (obj == null) {
            ArrayList arrayList = this.f38112e;
            RandomAccess arrayList2 = arrayList.isEmpty() ? C42784z0.f406748b : new ArrayList(arrayList);
            this.f38113f = arrayList2;
            r02 = arrayList2;
        }
        return r02;
    }

    @Y61.l
    public final Object D(@Y61.k SuspendLambda suspendLambda) {
        Object objX = C43175k.x(this.f38128u, new C22115k2(2, null), suspendLambda);
        return objX == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objX : kotlin.G0.f406611a;
    }

    public final void E(M m12) {
        synchronized (this.f38109b) {
            ArrayList arrayList = this.f38117j;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                if (((C22183t1) arrayList.get(i12)).f38767c.equals(m12)) {
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                    ArrayList arrayList2 = new ArrayList();
                    F(arrayList2, this, m12);
                    while (!arrayList2.isEmpty()) {
                        G(arrayList2, null);
                        F(arrayList2, this, m12);
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0148, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014d, code lost:
    
        if (r4 >= r3) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0157, code lost:
    
        if (((kotlin.Q) r10.get(r4)).f406620c == 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0159, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015c, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016a, code lost:
    
        if (r8 >= r4) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x016c, code lost:
    
        r11 = (kotlin.Q) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0174, code lost:
    
        if (r11.f406620c != 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        r11 = (androidx.compose.runtime.C22183t1) r11.f406619b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017d, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017e, code lost:
    
        if (r11 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0180, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0183, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0186, code lost:
    
        r4 = r16.f38109b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0188, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0189, code lost:
    
        kotlin.collections.C42745f0.h(r3, r16.f38117j);
        r3 = kotlin.G0.f406611a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0190, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0191, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019f, code lost:
    
        if (r8 >= r4) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a1, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01aa, code lost:
    
        if (((kotlin.Q) r11).f406620c == 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ac, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01af, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b2, code lost:
    
        r10 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<androidx.compose.runtime.InterfaceC22053d0> G(java.util.List<androidx.compose.runtime.C22183t1> r17, androidx.collection.S0<java.lang.Object> r18) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.G(java.util.List, androidx.collection.S0):java.util.List");
    }

    public final void H(Throwable th2, M m12) throws Throwable {
        if (!f38105A.get().booleanValue() || (th2 instanceof ComposeRuntimeError)) {
            synchronized (this.f38109b) {
                c cVar = this.f38126s;
                if (cVar != null) {
                    throw cVar.f38140a;
                }
                this.f38126s = new c(th2);
                kotlin.G0 g02 = kotlin.G0.f406611a;
            }
            throw th2;
        }
        synchronized (this.f38109b) {
            try {
                this.f38116i.clear();
                this.f38115h.g();
                this.f38114g = new androidx.collection.S0<>(0, 1, null);
                this.f38117j.clear();
                this.f38118k.g();
                this.f38120m.g();
                this.f38126s = new c(th2);
                if (m12 != null) {
                    I(m12);
                }
                z();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void I(InterfaceC22053d0 interfaceC22053d0) {
        ArrayList arrayList = this.f38122o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f38122o = arrayList;
        }
        if (!arrayList.contains(interfaceC22053d0)) {
            arrayList.add(interfaceC22053d0);
        }
        if (this.f38112e.remove(interfaceC22053d0)) {
            this.f38113f = null;
        }
    }

    @Y61.l
    public final Object J(@Y61.k SuspendLambda suspendLambda) {
        Object objG = C43259k.g(this.f38108a, new C22130n2(this, new C22145q2(this, null), X0.a(suspendLambda.getF411960f()), null), suspendLambda);
        if (objG != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objG = kotlin.G0.f406611a;
        }
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : kotlin.G0.f406611a;
    }

    @Override // androidx.compose.runtime.I
    @InterfaceC22137p
    public final void a(@Y61.k M m12, @Y61.k C22096n c22096n) throws Throwable {
        boolean z12 = m12.f38042t.f37877F;
        try {
            AbstractC22167l.a aVar = AbstractC22167l.f38720e;
            C22125m2 c22125m2 = new C22125m2(m12);
            C22154s2 c22154s2 = new C22154s2(null, m12);
            aVar.getClass();
            C22160e c22160eG = AbstractC22167l.a.g(c22125m2, c22154s2);
            try {
                AbstractC22167l abstractC22167lJ = c22160eG.j();
                try {
                    m12.v(c22096n);
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                    if (!z12) {
                        C22176v.j().m();
                    }
                    synchronized (this.f38109b) {
                        if (this.f38128u.getValue().compareTo(State.f38133c) > 0 && !C().contains(m12)) {
                            this.f38112e.add(m12);
                            this.f38113f = null;
                        }
                    }
                    try {
                        E(m12);
                        try {
                            m12.l();
                            m12.n();
                            if (z12) {
                                return;
                            }
                            C22176v.j().m();
                        } catch (Throwable th2) {
                            H(th2, null);
                        }
                    } catch (Throwable th3) {
                        H(th3, m12);
                    }
                } finally {
                    AbstractC22167l.q(abstractC22167lJ);
                }
            } finally {
                w(c22160eG);
            }
        } catch (Throwable th4) {
            H(th4, m12);
        }
    }

    @Override // androidx.compose.runtime.I
    public final void b(@Y61.k C22183t1 c22183t1) {
        synchronized (this.f38109b) {
            try {
                androidx.compose.runtime.collection.d.a(this.f38118k, c22183t1.f38765a, c22183t1);
                if (c22183t1.f38772h != null) {
                    y(this, c22183t1, c22183t1);
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.I
    public final boolean d() {
        return f38105A.get().booleanValue();
    }

    @Override // androidx.compose.runtime.I
    /* renamed from: e */
    public final boolean getF37917b() {
        return false;
    }

    @Override // androidx.compose.runtime.I
    /* renamed from: f */
    public final boolean getF37918c() {
        return false;
    }

    @Override // androidx.compose.runtime.I
    /* renamed from: h */
    public final int getF37916a() {
        return 1000;
    }

    @Override // androidx.compose.runtime.I
    @Y61.k
    /* renamed from: i, reason: from getter */
    public final CoroutineContext getF38130w() {
        return this.f38130w;
    }

    @Override // androidx.compose.runtime.I
    public final void k(@Y61.k C22183t1 c22183t1) {
        InterfaceC43271q<kotlin.G0> interfaceC43271qZ;
        synchronized (this.f38109b) {
            this.f38117j.add(c22183t1);
            interfaceC43271qZ = z();
        }
        if (interfaceC43271qZ != null) {
            int i12 = kotlin.Z.f406624c;
            interfaceC43271qZ.resumeWith(kotlin.G0.f406611a);
        }
    }

    @Override // androidx.compose.runtime.I
    public final void l(@Y61.k M m12) {
        InterfaceC43271q<kotlin.G0> interfaceC43271qZ;
        synchronized (this.f38109b) {
            if (this.f38115h.h(m12)) {
                interfaceC43271qZ = null;
            } else {
                this.f38115h.b(m12);
                interfaceC43271qZ = z();
            }
        }
        if (interfaceC43271qZ != null) {
            int i12 = kotlin.Z.f406624c;
            interfaceC43271qZ.resumeWith(kotlin.G0.f406611a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    @Override // androidx.compose.runtime.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(@Y61.k androidx.compose.runtime.C22183t1 r19, @Y61.k androidx.compose.runtime.C22153s1 r20, @Y61.k androidx.compose.runtime.InterfaceC22078i<?> r21) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            r3 = 1
            java.lang.Object r4 = r1.f38109b
            monitor-enter(r4)
            androidx.collection.R0<androidx.compose.runtime.t1, androidx.compose.runtime.s1> r5 = r1.f38120m     // Catch: java.lang.Throwable -> L7e
            r5.m(r0, r2)     // Catch: java.lang.Throwable -> L7e
            androidx.collection.R0<java.lang.Object, java.lang.Object> r5 = r1.f38121n     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r0 = r5.e(r0)     // Catch: java.lang.Throwable -> L7e
            if (r0 != 0) goto L1a
            androidx.collection.N0 r0 = androidx.collection.a1.f25679b     // Catch: java.lang.Throwable -> L7e
            goto L2d
        L1a:
            boolean r5 = r0 instanceof androidx.collection.N0     // Catch: java.lang.Throwable -> L7e
            if (r5 == 0) goto L21
            androidx.collection.Z0 r0 = (androidx.collection.Z0) r0     // Catch: java.lang.Throwable -> L7e
            goto L2d
        L21:
            java.lang.Object[] r5 = androidx.collection.a1.f25678a     // Catch: java.lang.Throwable -> L7e
            androidx.collection.N0 r5 = new androidx.collection.N0     // Catch: java.lang.Throwable -> L7e
            r6 = 0
            r5.<init>(r3, r6)     // Catch: java.lang.Throwable -> L7e
            r5.f(r0)     // Catch: java.lang.Throwable -> L7e
            r0 = r5
        L2d:
            int r5 = r0.f25660b     // Catch: java.lang.Throwable -> L7e
            if (r5 == 0) goto L33
            r5 = r3
            goto L34
        L33:
            r5 = 0
        L34:
            if (r5 == 0) goto L89
            r5 = r21
            androidx.collection.R0 r0 = r2.b(r5, r0)     // Catch: java.lang.Throwable -> L7e
            java.lang.Object[] r2 = r0.f25722b     // Catch: java.lang.Throwable -> L7e
            java.lang.Object[] r5 = r0.f25723c     // Catch: java.lang.Throwable -> L7e
            long[] r0 = r0.f25721a     // Catch: java.lang.Throwable -> L7e
            int r7 = r0.length     // Catch: java.lang.Throwable -> L7e
            int r7 = r7 + (-2)
            if (r7 < 0) goto L89
            r8 = 0
        L48:
            r9 = r0[r8]     // Catch: java.lang.Throwable -> L7e
            long r11 = ~r9     // Catch: java.lang.Throwable -> L7e
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L85
            int r11 = r8 - r7
            int r11 = ~r11     // Catch: java.lang.Throwable -> L7e
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L62:
            if (r13 >= r11) goto L83
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L80
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r2[r14]     // Catch: java.lang.Throwable -> L7e
            r14 = r5[r14]     // Catch: java.lang.Throwable -> L7e
            androidx.compose.runtime.s1 r14 = (androidx.compose.runtime.C22153s1) r14     // Catch: java.lang.Throwable -> L7e
            androidx.compose.runtime.t1 r15 = (androidx.compose.runtime.C22183t1) r15     // Catch: java.lang.Throwable -> L7e
            androidx.collection.R0<androidx.compose.runtime.t1, androidx.compose.runtime.s1> r6 = r1.f38120m     // Catch: java.lang.Throwable -> L7e
            r6.m(r15, r14)     // Catch: java.lang.Throwable -> L7e
            goto L80
        L7e:
            r0 = move-exception
            goto L8d
        L80:
            long r9 = r9 >> r12
            int r13 = r13 + r3
            goto L62
        L83:
            if (r11 != r12) goto L89
        L85:
            if (r8 == r7) goto L89
            int r8 = r8 + r3
            goto L48
        L89:
            kotlin.G0 r0 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r4)
            return
        L8d:
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.m(androidx.compose.runtime.t1, androidx.compose.runtime.s1, androidx.compose.runtime.i):void");
    }

    @Override // androidx.compose.runtime.I
    @Y61.l
    public final C22153s1 n(@Y61.k C22183t1 c22183t1) {
        C22153s1 c22153s1K;
        synchronized (this.f38109b) {
            c22153s1K = this.f38120m.k(c22183t1);
        }
        return c22153s1K;
    }

    @Override // androidx.compose.runtime.I
    public final void q(@Y61.k M m12) {
        synchronized (this.f38109b) {
            try {
                LinkedHashSet linkedHashSet = this.f38123p;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f38123p = linkedHashSet;
                }
                linkedHashSet.add(m12);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.I
    public final void t(@Y61.k M m12) {
        synchronized (this.f38109b) {
            if (this.f38112e.remove(m12)) {
                this.f38113f = null;
            }
            this.f38115h.j(m12);
            this.f38116i.remove(m12);
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
    }

    public final void x() {
        synchronized (this.f38109b) {
            try {
                if (this.f38128u.getValue().compareTo(State.f38136f) >= 0) {
                    this.f38128u.setValue(State.f38133c);
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f38129v.c(null);
    }

    public final InterfaceC43271q<kotlin.G0> z() {
        State state;
        kotlinx.coroutines.flow.Z1<State> z12 = this.f38128u;
        int iCompareTo = z12.getValue().compareTo(State.f38133c);
        ArrayList arrayList = this.f38117j;
        ArrayList arrayList2 = this.f38116i;
        androidx.compose.runtime.collection.e<InterfaceC22053d0> eVar = this.f38115h;
        if (iCompareTo <= 0) {
            this.f38112e.clear();
            this.f38113f = C42784z0.f406748b;
            this.f38114g = new androidx.collection.S0<>(0, 1, null);
            eVar.g();
            arrayList2.clear();
            arrayList.clear();
            this.f38122o = null;
            kotlinx.coroutines.r rVar = this.f38124q;
            if (rVar != null) {
                rVar.f(null);
            }
            this.f38124q = null;
            this.f38126s = null;
            return null;
        }
        if (this.f38126s != null) {
            state = State.f38134d;
        } else if (this.f38110c == null) {
            this.f38114g = new androidx.collection.S0<>(0, 1, null);
            eVar.g();
            state = A() ? State.f38135e : State.f38134d;
        } else {
            state = (eVar.f38262d == 0 && !this.f38114g.d() && arrayList2.isEmpty() && arrayList.isEmpty() && !A()) ? State.f38136f : State.f38137g;
        }
        z12.setValue(state);
        if (state != State.f38137g) {
            return null;
        }
        kotlinx.coroutines.r rVar2 = this.f38124q;
        this.f38124q = null;
        return rVar2;
    }

    @Override // androidx.compose.runtime.I
    public final void o(@Y61.k Set<androidx.compose.runtime.tooling.a> set) {
    }
}
