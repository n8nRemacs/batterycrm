package androidx.compose.runtime.snapshots;

import androidx.collection.S0;
import java.util.Collection;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Snapshot.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\bB\u0019\b\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/snapshots/l;", "", "", "id", "Landroidx/compose/runtime/snapshots/t;", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/t;)V", "a", "Landroidx/compose/runtime/snapshots/e;", "Landroidx/compose/runtime/snapshots/g;", "Landroidx/compose/runtime/snapshots/j;", "Landroidx/compose/runtime/snapshots/b0;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.snapshots.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22167l {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f38720e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public C22174t f38721a;

    /* renamed from: b, reason: collision with root package name */
    public long f38722b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38723c;

    /* renamed from: d, reason: collision with root package name */
    public int f38724d;

    /* compiled from: Snapshot.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/l$a;", "", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.snapshots.l$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.l
        public static AbstractC22167l a() {
            return C22176v.f38749b.a();
        }

        @kotlin.X
        @Y61.k
        public static AbstractC22167l b(@Y61.l AbstractC22167l abstractC22167l) {
            if (abstractC22167l instanceof a0) {
                a0 a0Var = (a0) abstractC22167l;
                if (a0Var.f38692u == androidx.compose.runtime.internal.T.a()) {
                    a0Var.f38690s = null;
                    return abstractC22167l;
                }
            }
            if (abstractC22167l instanceof b0) {
                b0 b0Var = (b0) abstractC22167l;
                if (b0Var.f38697i == androidx.compose.runtime.internal.T.a()) {
                    b0Var.f38696h = null;
                    return abstractC22167l;
                }
            }
            AbstractC22167l abstractC22167lG = C22176v.g(abstractC22167l, null, false);
            abstractC22167lG.j();
            return abstractC22167lG;
        }

        public static Object c(@Y61.k Y41.a aVar, @Y61.l Y41.l lVar) {
            AbstractC22167l a0Var;
            if (lVar == null) {
                return aVar.invoke();
            }
            AbstractC22167l abstractC22167lA = C22176v.f38749b.a();
            if (abstractC22167lA instanceof a0) {
                a0 a0Var2 = (a0) abstractC22167lA;
                if (a0Var2.f38692u == androidx.compose.runtime.internal.T.a()) {
                    Y41.l<Object, G0> lVar2 = a0Var2.f38690s;
                    Y41.l<Object, G0> lVar3 = a0Var2.f38691t;
                    try {
                        ((a0) abstractC22167lA).f38690s = C22176v.k(lVar, lVar2, true);
                        ((a0) abstractC22167lA).f38691t = C22176v.a(null, lVar3);
                        return aVar.invoke();
                    } finally {
                        a0Var2.f38690s = lVar2;
                        a0Var2.f38691t = lVar3;
                    }
                }
            }
            if (abstractC22167lA == null || (abstractC22167lA instanceof C22160e)) {
                a0Var = new a0(abstractC22167lA instanceof C22160e ? (C22160e) abstractC22167lA : null, lVar, null, true, false);
            } else {
                if (lVar == null) {
                    return aVar.invoke();
                }
                a0Var = abstractC22167lA.u(lVar);
            }
            try {
                AbstractC22167l abstractC22167lJ = a0Var.j();
                try {
                    return aVar.invoke();
                } finally {
                    AbstractC22167l.q(abstractC22167lJ);
                }
            } finally {
                a0Var.c();
            }
        }

        @Y61.k
        public static C22166k d(@Y61.k Y41.p pVar) {
            C22176v.e(C22176v.f38748a);
            synchronized (C22176v.f38750c) {
                C22176v.f38755h = C42745f0.i0(pVar, (Collection) C22176v.f38755h);
                G0 g02 = G0.f406611a;
            }
            return new C22166k(0, pVar);
        }

        @kotlin.X
        public static void e(@Y61.l AbstractC22167l abstractC22167l, @Y61.k AbstractC22167l abstractC22167l2, @Y61.l Y41.l lVar) {
            if (abstractC22167l != abstractC22167l2) {
                abstractC22167l2.getClass();
                AbstractC22167l.q(abstractC22167l);
                abstractC22167l2.c();
            } else if (abstractC22167l instanceof a0) {
                ((a0) abstractC22167l).f38690s = lVar;
            } else if (abstractC22167l instanceof b0) {
                ((b0) abstractC22167l).f38696h = lVar;
            } else {
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + abstractC22167l).toString());
            }
        }

        public static void f() {
            boolean z12;
            synchronized (C22176v.f38750c) {
                S0<V> s02 = C22176v.f38757j.f38705i;
                z12 = false;
                if (s02 != null) {
                    if (s02.d()) {
                        z12 = true;
                    }
                }
            }
            if (z12) {
                C22176v.e(C22176v.f38748a);
            }
        }

        @Y61.k
        public static C22160e g(@Y61.l Y41.l lVar, @Y61.l Y41.l lVar2) {
            C22160e c22160eC;
            AbstractC22167l abstractC22167lJ = C22176v.j();
            C22160e c22160e = abstractC22167lJ instanceof C22160e ? (C22160e) abstractC22167lJ : null;
            if (c22160e == null || (c22160eC = c22160e.C(lVar, lVar2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return c22160eC;
        }

        public a() {
        }
    }

    public /* synthetic */ AbstractC22167l(int i12, C22174t c22174t, C42822w c42822w) {
        this(i12, c22174t);
    }

    @kotlin.X
    public static void q(@Y61.l AbstractC22167l abstractC22167l) {
        C22176v.f38749b.b(abstractC22167l);
    }

    public final void a() {
        synchronized (C22176v.f38750c) {
            b();
            p();
            G0 g02 = G0.f406611a;
        }
    }

    public void b() {
        C22176v.f38751d = C22176v.f38751d.b(getF38722b());
    }

    public void c() {
        this.f38723c = true;
        synchronized (C22176v.f38750c) {
            o();
            G0 g02 = G0.f406611a;
        }
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public C22174t getF38721a() {
        return this.f38721a;
    }

    @Y61.l
    /* renamed from: e */
    public abstract Y41.l<Object, G0> getF38696h();

    public abstract boolean f();

    /* renamed from: g, reason: from getter */
    public long getF38722b() {
        return this.f38722b;
    }

    /* renamed from: h */
    public int getF38704h() {
        return 0;
    }

    @Y61.l
    public abstract Y41.l<Object, G0> i();

    @Y61.l
    @kotlin.X
    public final AbstractC22167l j() {
        androidx.compose.runtime.internal.N<AbstractC22167l> n12 = C22176v.f38749b;
        AbstractC22167l abstractC22167lA = n12.a();
        n12.b(this);
        return abstractC22167lA;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(@Y61.k V v12);

    public final void o() {
        int i12 = this.f38724d;
        if (i12 >= 0) {
            C22176v.t(i12);
            this.f38724d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(@Y61.k C22174t c22174t) {
        this.f38721a = c22174t;
    }

    public void s(long j12) {
        this.f38722b = j12;
    }

    public void t(int i12) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    @Y61.k
    public abstract AbstractC22167l u(@Y61.l Y41.l<Object, G0> lVar);

    public AbstractC22167l(long j12, C22174t c22174t, C42822w c42822w) {
        int iA2;
        int iNumberOfTrailingZeros;
        this.f38721a = c22174t;
        this.f38722b = j12;
        Y41.l<C22174t, G0> lVar = C22176v.f38748a;
        if (j12 != 0) {
            C22174t f38721a = getF38721a();
            long[] jArr = f38721a.f38739e;
            if (jArr != null) {
                j12 = jArr[0];
            } else {
                long j13 = f38721a.f38737c;
                long j14 = f38721a.f38738d;
                if (j13 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j13);
                } else {
                    long j15 = f38721a.f38736b;
                    if (j15 != 0) {
                        j14 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j15);
                    }
                }
                j12 = iNumberOfTrailingZeros + j14;
            }
            synchronized (C22176v.f38750c) {
                iA2 = C22176v.f38753f.a(j12);
            }
        } else {
            iA2 = -1;
        }
        this.f38724d = iA2;
    }

    @InterfaceC42830m
    private AbstractC22167l(int i12, C22174t c22174t) {
        this(i12, c22174t, (C42822w) null);
    }
}
