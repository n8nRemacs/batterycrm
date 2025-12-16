package shark.internal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.C42822w;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;
import shark.AbstractC48368z1;
import shark.C48240c2;
import shark.N2;
import shark.OnAnalysisProgressListener;
import shark.internal.D0;
import shark.internal.K;

/* compiled from: PathFinder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lshark/internal/B0;", "", "a", "b", "c", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class B0 {

    /* renamed from: a, reason: collision with root package name */
    public final K f438318a;

    /* renamed from: b, reason: collision with root package name */
    public final C48240c2 f438319b;

    /* renamed from: c, reason: collision with root package name */
    public final OnAnalysisProgressListener f438320c;

    /* renamed from: d, reason: collision with root package name */
    public final B f438321d;

    /* compiled from: PathFinder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/B0$a;", "", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f438322a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final C f438323b;

        public a(@Y61.k ArrayList arrayList, @Y61.l C c12) {
            this.f438322a = arrayList;
            this.f438323b = c12;
        }
    }

    /* compiled from: PathFinder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/B0$b;", "", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayDeque f438324a = new ArrayDeque();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayDeque f438325b = new ArrayDeque();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final shark.internal.hppc.j f438326c = new shark.internal.hppc.j(0, 1, null);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final shark.internal.hppc.j f438327d = new shark.internal.hppc.j(0, 1, null);

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final c f438328e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f438329f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final shark.internal.hppc.j f438330g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f438331h;

        public b(@Y61.k shark.internal.hppc.j jVar, boolean z12, int i12) {
            this.f438330g = jVar;
            this.f438331h = z12;
            this.f438328e = z12 ? new c.a(i12) : new c.b(i12);
        }
    }

    /* compiled from: PathFinder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lshark/internal/B0$c;", "", "<init>", "()V", "a", "b", "Lshark/internal/B0$c$a;", "Lshark/internal/B0$c$b;", "shark"}, k = 1, mv = {1, 4, 1})
    public static abstract class c {

        /* compiled from: PathFinder.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/B0$c$a;", "Lshark/internal/B0$c;", "shark"}, k = 1, mv = {1, 4, 1})
        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final C f438332a;

            public a(int i12) {
                super(null);
                this.f438332a = new C(i12);
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
            @Override // shark.internal.B0.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean a(long r17, long r19) {
                /*
                    r16 = this;
                    r0 = r17
                    r2 = r19
                    r4 = r16
                    shark.internal.C r5 = r4.f438332a
                    shark.internal.hppc.d r5 = r5.f438334a
                    int r6 = r5.d(r0)
                    r7 = 0
                    r8 = 1
                    r9 = -1
                    if (r6 == r9) goto L15
                    r10 = r8
                    goto L16
                L15:
                    r10 = r7
                L16:
                    if (r10 == 0) goto L90
                    r11 = 0
                    int r13 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
                    if (r13 != 0) goto L20
                    goto L90
                L20:
                    long[] r13 = r5.f438531b
                    r14 = r13[r6]
                    int r6 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
                    if (r6 == 0) goto L93
                    shark.internal.hppc.j r6 = new shark.internal.hppc.j
                    r13 = 0
                    r6.<init>(r7, r8, r13)
                    r7 = r14
                L2f:
                    int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                    java.lang.String r11 = " when going through the dominator chain for "
                    java.lang.String r12 = "Did not find dominator for "
                    if (r13 == 0) goto L61
                    r6.a(r7)
                    int r13 = r5.d(r7)
                    if (r13 == r9) goto L48
                    long[] r7 = r5.f438531b
                    r11 = r7[r13]
                    r7 = r11
                    r11 = 0
                    goto L2f
                L48:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = androidx.compose.foundation.H.q(r7, r12, r11)
                    r1.append(r14)
                    java.lang.String r2 = ": "
                    r1.append(r2)
                    r1.append(r6)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                L61:
                    r13 = r2
                    r7 = 0
                L64:
                    int r15 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
                    if (r15 == 0) goto L8c
                    boolean r15 = r6.c(r13)
                    if (r15 == 0) goto L6f
                    goto L8c
                L6f:
                    int r15 = r5.d(r13)
                    if (r15 == r9) goto L7b
                    long[] r13 = r5.f438531b
                    r14 = r13[r15]
                    r13 = r14
                    goto L64
                L7b:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = androidx.compose.foundation.H.q(r13, r12, r11)
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                L8c:
                    r5.f(r0, r13)
                    goto L93
                L90:
                    r5.f(r0, r2)
                L93:
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: shark.internal.B0.c.a.a(long, long):boolean");
            }
        }

        /* compiled from: PathFinder.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/B0$c$b;", "Lshark/internal/B0$c;", "shark"}, k = 1, mv = {1, 4, 1})
        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            public final shark.internal.hppc.j f438333a;

            public b(int i12) {
                super(null);
                this.f438333a = new shark.internal.hppc.j(i12);
            }

            @Override // shark.internal.B0.c
            public final boolean a(long j12, long j13) {
                return !this.f438333a.a(j12);
            }
        }

        public c() {
        }

        public abstract boolean a(long j12, long j13);

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }
    }

    public B0(@Y61.k C48240c2 c48240c2, @Y61.k OnAnalysisProgressListener onAnalysisProgressListener, @Y61.k B b12, @Y61.k List list) {
        this.f438319b = c48240c2;
        this.f438320c = onAnalysisProgressListener;
        this.f438321d = b12;
        this.f438318a = new K(list, c48240c2);
    }

    public static void a(b bVar, D0 d02, boolean z12) {
        long f438342a = 0;
        if (d02.getF438342a() == 0) {
            return;
        }
        if (!(d02 instanceof D0.b)) {
            if (!(d02 instanceof D0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f438342a = ((D0.a) d02).f438343b.getF438342a();
        }
        boolean zA2 = bVar.f438328e.a(d02.getF438342a(), f438342a);
        boolean z13 = bVar.f438329f || z12;
        ArrayDeque arrayDeque = bVar.f438324a;
        ArrayDeque arrayDeque2 = bVar.f438325b;
        shark.internal.hppc.j jVar = bVar.f438327d;
        shark.internal.hppc.j jVar2 = bVar.f438326c;
        if (!zA2) {
            if (z13) {
                arrayDeque2.add(d02);
                jVar.a(d02.getF438342a());
                return;
            } else {
                arrayDeque.add(d02);
                jVar2.a(d02.getF438342a());
                return;
            }
        }
        if (z13 || jVar2.c(d02.getF438342a()) || !jVar.c(d02.getF438342a())) {
            return;
        }
        arrayDeque.add(d02);
        jVar2.a(d02.getF438342a());
        Iterator it = arrayDeque2.iterator();
        while (it.hasNext()) {
            D0 d03 = (D0) it.next();
            if (d03.getF438342a() == d02.getF438342a()) {
                arrayDeque2.remove(d03);
                jVar.f(d02.getF438342a());
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Y61.k
    public final a b(@Y61.k Set<Long> set, boolean z12) {
        D0 d02;
        OnAnalysisProgressListener.Step step = OnAnalysisProgressListener.Step.FINDING_PATHS_TO_RETAINED_OBJECTS;
        OnAnalysisProgressListener onAnalysisProgressListener = this.f438320c;
        onAnalysisProgressListener.a(step);
        C48240c2 c48240c2 = this.f438319b;
        int i12 = c48240c2.i() / 2;
        if (i12 < 4) {
            i12 = 4;
        }
        shark.internal.hppc.j jVar = new shark.internal.hppc.j(0, 1, null);
        int size = set.size();
        if (size > jVar.f438557d) {
            long[] jArr = jVar.f438554a;
            shark.internal.hppc.a.f438525a.getClass();
            jVar.b(shark.internal.hppc.a.a(jVar.f438559f, size));
            if (jVar.f438555b + (jVar.f438558e ? 1 : 0) != 0) {
                jVar.e(jArr);
            }
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            jVar.a(((Number) it.next()).longValue());
        }
        b bVar = new b(jVar, z12, i12);
        K k12 = this.f438318a;
        k12.getClass();
        N n12 = N.f438404l;
        L0 l02 = L0.f438390a;
        C48240c2 c48240c22 = k12.f438384b;
        l02.getClass();
        Collection collectionValues = ((Map) c48240c22.f438253b.a(L0.class.getName(), new K0(c48240c22))).values();
        ArrayList arrayList = new ArrayList(C42745f0.q(collectionValues, 10));
        Iterator it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((AbstractC48368z1.m) it2.next()).f438834b));
        }
        Set setP0 = C42745f0.P0(arrayList);
        List<AbstractC48368z1> list = c48240c22.f438260i.f438423h;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            AbstractC48368z1 abstractC48368z1 = (AbstractC48368z1) obj;
            if (c48240c22.k(abstractC48368z1.getF438838a()) && (!(abstractC48368z1 instanceof AbstractC48368z1.d) || !setP0.contains(Integer.valueOf(((AbstractC48368z1.d) abstractC48368z1).f438816b)))) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            AbstractC48368z1 abstractC48368z12 = (AbstractC48368z1) it3.next();
            arrayList3.add(new kotlin.Q(c48240c22.f(abstractC48368z12.getF438838a()), abstractC48368z12));
        }
        C43025h.a aVar = new C43025h.a(C43033p.y(new C42770s0(C42745f0.B0(arrayList3, new M(n12))), new L(k12)));
        while (aVar.hasNext()) {
            K.a aVar2 = (K.a) aVar.next();
            N2 n22 = aVar2.f438387c;
            AbstractC48368z1 abstractC48368z13 = aVar2.f438385a;
            a(bVar, n22 != null ? new D0.b.a(abstractC48368z13, n22) : new D0.b.C12631b(abstractC48368z13), aVar2.f438386b);
        }
        ArrayList arrayList4 = new ArrayList();
        while (true) {
            ArrayDeque arrayDeque = bVar.f438324a;
            boolean zIsEmpty = arrayDeque.isEmpty();
            ArrayDeque arrayDeque2 = bVar.f438325b;
            if (zIsEmpty && arrayDeque2.isEmpty()) {
                break;
            }
            if (bVar.f438329f || arrayDeque.isEmpty()) {
                bVar.f438329f = true;
                d02 = (D0) arrayDeque2.poll();
                bVar.f438327d.f(d02.getF438342a());
            } else {
                D0 d03 = (D0) arrayDeque.poll();
                bVar.f438326c.f(d03.getF438342a());
                d02 = d03;
            }
            long f438342a = d02.getF438342a();
            shark.internal.hppc.j jVar2 = bVar.f438330g;
            if (jVar2.c(f438342a)) {
                arrayList4.add(d02);
                if (arrayList4.size() == jVar2.f438555b + (jVar2.f438558e ? 1 : 0)) {
                    if (!bVar.f438331h) {
                        break;
                    }
                    onAnalysisProgressListener.a(OnAnalysisProgressListener.Step.FINDING_DOMINATORS);
                }
            }
            for (C0 c02 : this.f438321d.b(c48240c2.f(d02.getF438342a()))) {
                a(bVar, new D0.a(c02.f438335a, d02, c02.f438337c), c02.f438336b);
            }
        }
        c cVar = bVar.f438328e;
        return new a(arrayList4, cVar instanceof c.a ? ((c.a) cVar).f438332a : null);
    }
}
