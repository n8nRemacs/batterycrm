package androidx.compose.runtime;

import android.os.Trace;
import androidx.collection.C20245x0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.changelist.d;
import androidx.compose.runtime.changelist.g;
import androidx.compose.runtime.internal.C22096n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.coroutines.CoroutineContext;

/* compiled from: Composer.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/B;", "Landroidx/compose/runtime/A;", "a", "b", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class B implements A {

    /* renamed from: A, reason: collision with root package name */
    public int f37872A;

    /* renamed from: B, reason: collision with root package name */
    public int f37873B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f37874C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final C f37875D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final ArrayList f37876E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f37877F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public K2 f37878G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public L2 f37879H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public O2 f37880I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f37881J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public O1 f37882K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.l
    public androidx.compose.runtime.changelist.a f37883L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.changelist.b f37884M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public C22068g f37885N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public androidx.compose.runtime.changelist.c f37886O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f37887P;

    /* renamed from: Q, reason: collision with root package name */
    public int f37888Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public K f37889R;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22078i<?> f37890b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final I f37891c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final L2 f37892d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Set<B2> f37893e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.changelist.a f37894f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.changelist.a f37895g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final M f37896h;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public N1 f37898j;

    /* renamed from: k, reason: collision with root package name */
    public int f37899k;

    /* renamed from: l, reason: collision with root package name */
    public int f37900l;

    /* renamed from: m, reason: collision with root package name */
    public int f37901m;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public int[] f37903o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public C20245x0 f37904p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f37905q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f37906r;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public androidx.collection.A0<O1> f37910v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f37911w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f37913y;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ArrayList f37897i = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final I0 f37902n = new I0();

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final ArrayList f37907s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final I0 f37908t = new I0();

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public O1 f37909u = androidx.compose.runtime.internal.K.a();

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final I0 f37912x = new I0();

    /* renamed from: z, reason: collision with root package name */
    public int f37914z = -1;

    /* compiled from: Composer.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/B$b;", "Landroidx/compose/runtime/I;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends I {

        /* renamed from: a, reason: collision with root package name */
        public final int f37916a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f37917b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f37918c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final W f37919d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public HashSet f37920e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final LinkedHashSet f37921f = new LinkedHashSet();

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final InterfaceC22204y1 f37922g = new ParcelableSnapshotMutableState(androidx.compose.runtime.internal.K.a(), C22205y2.f38805a);

        public b(int i12, boolean z12, boolean z13, @Y61.l W w12) {
            this.f37916a = i12;
            this.f37917b = z12;
            this.f37918c = z13;
            this.f37919d = w12;
        }

        @Override // androidx.compose.runtime.I
        @InterfaceC22137p
        public final void a(@Y61.k M m12, @Y61.k C22096n c22096n) {
            B.this.f37891c.a(m12, c22096n);
        }

        @Override // androidx.compose.runtime.I
        public final void b(@Y61.k C22183t1 c22183t1) {
            B.this.f37891c.b(c22183t1);
        }

        @Override // androidx.compose.runtime.I
        public final void c() {
            B b12 = B.this;
            b12.f37872A--;
        }

        @Override // androidx.compose.runtime.I
        public final boolean d() {
            return B.this.f37891c.d();
        }

        @Override // androidx.compose.runtime.I
        /* renamed from: e, reason: from getter */
        public final boolean getF37917b() {
            return this.f37917b;
        }

        @Override // androidx.compose.runtime.I
        /* renamed from: f, reason: from getter */
        public final boolean getF37918c() {
            return this.f37918c;
        }

        @Override // androidx.compose.runtime.I
        @Y61.k
        public final O1 g() {
            return (O1) ((C22082i3) this.f37922g).getF42167b();
        }

        @Override // androidx.compose.runtime.I
        /* renamed from: h, reason: from getter */
        public final int getF37916a() {
            return this.f37916a;
        }

        @Override // androidx.compose.runtime.I
        @Y61.k
        /* renamed from: i */
        public final CoroutineContext getF38130w() {
            return B.this.f37891c.getF38130w();
        }

        @Override // androidx.compose.runtime.I
        @Y61.l
        /* renamed from: j, reason: from getter */
        public final W getF37919d() {
            return this.f37919d;
        }

        @Override // androidx.compose.runtime.I
        public final void k(@Y61.k C22183t1 c22183t1) {
            B.this.f37891c.k(c22183t1);
        }

        @Override // androidx.compose.runtime.I
        public final void l(@Y61.k M m12) {
            B b12 = B.this;
            b12.f37891c.l(b12.f37896h);
            b12.f37891c.l(m12);
        }

        @Override // androidx.compose.runtime.I
        public final void m(@Y61.k C22183t1 c22183t1, @Y61.k C22153s1 c22153s1, @Y61.k InterfaceC22078i<?> interfaceC22078i) {
            B.this.f37891c.m(c22183t1, c22153s1, interfaceC22078i);
        }

        @Override // androidx.compose.runtime.I
        @Y61.l
        public final C22153s1 n(@Y61.k C22183t1 c22183t1) {
            return B.this.f37891c.n(c22183t1);
        }

        @Override // androidx.compose.runtime.I
        public final void o(@Y61.k Set<androidx.compose.runtime.tooling.a> set) {
            HashSet hashSet = this.f37920e;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f37920e = hashSet;
            }
            hashSet.add(set);
        }

        @Override // androidx.compose.runtime.I
        public final void p(@Y61.k B b12) {
            this.f37921f.add(b12);
        }

        @Override // androidx.compose.runtime.I
        public final void q(@Y61.k M m12) {
            B.this.f37891c.q(m12);
        }

        @Override // androidx.compose.runtime.I
        public final void r() {
            B.this.f37872A++;
        }

        @Override // androidx.compose.runtime.I
        public final void s(@Y61.k B b12) {
            HashSet hashSet = this.f37920e;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(b12.f37892d);
                }
            }
            kotlin.jvm.internal.v0.a(this.f37921f).remove(b12);
        }

        @Override // androidx.compose.runtime.I
        public final void t(@Y61.k M m12) {
            B.this.f37891c.t(m12);
        }

        public final void u() {
            LinkedHashSet<B> linkedHashSet = this.f37921f;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            HashSet hashSet = this.f37920e;
            if (hashSet != null) {
                for (B b12 : linkedHashSet) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(b12.f37892d);
                    }
                }
            }
            linkedHashSet.clear();
        }
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y0<Object> f37924l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Object f37925m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y0<Object> y02, Object obj) {
            super(2);
            this.f37924l = y02;
            this.f37925m = obj;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(A a12, Integer num) {
            A a13 = a12;
            int iIntValue = num.intValue();
            if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
                this.f37924l.getClass();
                throw null;
            }
            a13.f();
            return kotlin.G0.f406611a;
        }
    }

    public B(@Y61.k InterfaceC22078i interfaceC22078i, @Y61.k I i12, @Y61.k L2 l22, @Y61.k Set set, @Y61.k androidx.compose.runtime.changelist.a aVar, @Y61.k androidx.compose.runtime.changelist.a aVar2, @Y61.k M m12) {
        this.f37890b = interfaceC22078i;
        this.f37891c = i12;
        this.f37892d = l22;
        this.f37893e = set;
        this.f37894f = aVar;
        this.f37895g = aVar2;
        this.f37896h = m12;
        int i13 = 0;
        int i14 = 1;
        this.f37874C = i12.getF37918c() || i12.d();
        this.f37875D = new C(this);
        this.f37876E = new ArrayList();
        K2 k2D = l22.d();
        k2D.c();
        this.f37878G = k2D;
        L2 l23 = new L2();
        if (i12.getF37918c()) {
            l23.b();
        }
        if (i12.d()) {
            l23.f38022l = new androidx.collection.A0<>(i13, i14, null);
        }
        this.f37879H = l23;
        O2 o2E = l23.e();
        o2E.e(true);
        this.f37880I = o2E;
        this.f37884M = new androidx.compose.runtime.changelist.b(this, aVar);
        K2 k2D2 = this.f37879H.d();
        try {
            C22068g c22068gA = k2D2.a(0);
            k2D2.c();
            this.f37885N = c22068gA;
            this.f37886O = new androidx.compose.runtime.changelist.c();
        } catch (Throwable th2) {
            k2D2.c();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.runtime.C22183t1 s0(androidx.compose.runtime.B r14, int r15) {
        /*
            androidx.compose.runtime.K2 r0 = r14.f37878G
            int r1 = r15 * 5
            int[] r2 = r0.f37998b
            r3 = r2[r1]
            java.lang.Object r0 = r0.n(r15, r2)
            r2 = 126665345(0x78cc281, float:2.1179178E-34)
            r4 = 0
            if (r3 != r2) goto La8
            boolean r0 = r0 instanceof androidx.compose.runtime.Y0
            if (r0 == 0) goto La8
            androidx.compose.runtime.K2 r0 = r14.f37878G
            boolean r0 = r0.d(r15)
            if (r0 == 0) goto L2e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            t0(r14, r0, r15)
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L2e
            r13 = r0
            goto L2f
        L2e:
            r13 = r4
        L2f:
            androidx.compose.runtime.K2 r0 = r14.f37878G
            int[] r2 = r0.f37998b
            java.lang.Object r0 = r0.n(r15, r2)
            r6 = r0
            androidx.compose.runtime.Y0 r6 = (androidx.compose.runtime.Y0) r6
            androidx.compose.runtime.K2 r0 = r14.f37878G
            r2 = 0
            java.lang.Object r7 = r0.h(r15, r2)
            androidx.compose.runtime.K2 r0 = r14.f37878G
            androidx.compose.runtime.g r10 = r0.a(r15)
            androidx.compose.runtime.K2 r0 = r14.f37878G
            int[] r0 = r0.f37998b
            int r1 = r1 + 3
            r0 = r0[r1]
            int r0 = r0 + r15
            java.util.ArrayList r1 = r14.f37907s
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = androidx.compose.runtime.G.g(r15, r1)
            if (r4 >= 0) goto L60
            int r4 = r4 + 1
            int r4 = -r4
        L60:
            int r5 = r1.size()
            if (r4 >= r5) goto L76
            java.lang.Object r5 = r1.get(r4)
            androidx.compose.runtime.M0 r5 = (androidx.compose.runtime.M0) r5
            int r8 = r5.f38046b
            if (r8 >= r0) goto L76
            r3.add(r5)
            int r4 = r4 + 1
            goto L60
        L76:
            java.util.ArrayList r11 = new java.util.ArrayList
            int r0 = r3.size()
            r11.<init>(r0)
            int r0 = r3.size()
        L83:
            if (r2 >= r0) goto L9a
            java.lang.Object r1 = r3.get(r2)
            androidx.compose.runtime.M0 r1 = (androidx.compose.runtime.M0) r1
            androidx.compose.runtime.c2 r4 = r1.f38045a
            java.lang.Object r1 = r1.f38047c
            kotlin.Q r5 = new kotlin.Q
            r5.<init>(r4, r1)
            r11.add(r5)
            int r2 = r2 + 1
            goto L83
        L9a:
            androidx.compose.runtime.t1 r4 = new androidx.compose.runtime.t1
            androidx.compose.runtime.O1 r12 = r14.T(r15)
            androidx.compose.runtime.M r8 = r14.f37896h
            androidx.compose.runtime.L2 r9 = r14.f37892d
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
        La8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.B.s0(androidx.compose.runtime.B, int):androidx.compose.runtime.t1");
    }

    public static final void t0(B b12, ArrayList arrayList, int i12) {
        int i13 = b12.f37878G.f37998b[(i12 * 5) + 3] + i12;
        int i14 = i12 + 1;
        while (i14 < i13) {
            K2 k22 = b12.f37878G;
            int i15 = i14 * 5;
            if ((k22.f37998b[i15 + 1] & 134217728) != 0) {
                C22183t1 c22183t1S0 = s0(b12, i14);
                if (c22183t1S0 != null) {
                    arrayList.add(c22183t1S0);
                }
            } else if (k22.d(i14)) {
                t0(b12, arrayList, i14);
            }
            i14 += b12.f37878G.f37998b[i15 + 3];
        }
    }

    public static final int u0(B b12, int i12, int i13, boolean z12, int i14) {
        K2 k22 = b12.f37878G;
        int i15 = i13 * 5;
        int[] iArr = k22.f37998b;
        boolean z13 = (iArr[i15 + 1] & 134217728) != 0;
        androidx.compose.runtime.changelist.b bVar = b12.f37884M;
        if (!z13) {
            if (!k22.d(i13)) {
                if (k22.j(i13)) {
                    return 1;
                }
                return k22.m(i13);
            }
            int i16 = iArr[i15 + 3] + i13;
            int iU02 = 0;
            for (int i17 = i13 + 1; i17 < i16; i17 += iArr[(i17 * 5) + 3]) {
                boolean zJ2 = k22.j(i17);
                if (zJ2) {
                    bVar.d();
                    Object objL = k22.l(i17);
                    bVar.d();
                    bVar.f38198h.add(objL);
                }
                iU02 += u0(b12, i12, i17, zJ2 || z12, zJ2 ? 0 : i14 + iU02);
                if (zJ2) {
                    bVar.d();
                    bVar.b();
                }
            }
            if (k22.j(i13)) {
                return 1;
            }
            return iU02;
        }
        int i18 = iArr[i15];
        Object objN = k22.n(i13, iArr);
        I i19 = b12.f37891c;
        if (i18 == 126665345 && (objN instanceof Y0)) {
            C22183t1 c22183t1S0 = s0(b12, i13);
            if (c22183t1S0 != null) {
                i19.b(c22183t1S0);
                bVar.f();
                androidx.compose.runtime.changelist.a aVar = bVar.f38192b;
                aVar.getClass();
                d.v vVar = d.v.f38241c;
                androidx.compose.runtime.changelist.g gVar = aVar.f38190a;
                gVar.g(vVar);
                g.b.c(gVar, b12.f37896h, b12.f37891c, c22183t1S0);
            }
            if (!z12 || i13 == i12) {
                return k22.m(i13);
            }
            bVar.d();
            bVar.c();
            B b13 = bVar.f38191a;
            int iM2 = b13.f37878G.j(i13) ? 1 : b13.f37878G.m(i13);
            if (iM2 > 0) {
                bVar.g(i14, iM2);
            }
            return 0;
        }
        if (i18 != 206 || !kotlin.jvm.internal.L.f(objN, G.f37972e)) {
            if (k22.j(i13)) {
                return 1;
            }
            return k22.m(i13);
        }
        Object objH = k22.h(i13, 0);
        a aVar2 = objH instanceof a ? (a) objH : null;
        if (aVar2 != null) {
            for (B b14 : aVar2.f37915b.f37921f) {
                L2 l22 = b14.f37892d;
                if (l22.f38013c > 0 && (l22.f38012b[1] & 67108864) != 0) {
                    M m12 = b14.f37896h;
                    synchronized (m12.f38027e) {
                        m12.y();
                        androidx.collection.R0<Object, Object> r02 = m12.f38037o;
                        m12.f38037o = androidx.collection.i1.b();
                        try {
                            m12.f38042t.E0(r02);
                            kotlin.G0 g02 = kotlin.G0.f406611a;
                        } catch (Exception e12) {
                            m12.f38037o = r02;
                            throw e12;
                        }
                    }
                    androidx.compose.runtime.changelist.a aVar3 = new androidx.compose.runtime.changelist.a();
                    b14.f37883L = aVar3;
                    K2 k2D = b14.f37892d.d();
                    try {
                        b14.f37878G = k2D;
                        androidx.compose.runtime.changelist.b bVar2 = b14.f37884M;
                        androidx.compose.runtime.changelist.a aVar4 = bVar2.f38192b;
                        try {
                            bVar2.f38192b = aVar3;
                            b14.r0(0);
                            androidx.compose.runtime.changelist.b bVar3 = b14.f37884M;
                            bVar3.c();
                            if (bVar3.f38193c) {
                                androidx.compose.runtime.changelist.a aVar5 = bVar3.f38192b;
                                aVar5.getClass();
                                aVar5.f38190a.g(d.C.f38209c);
                                if (bVar3.f38193c) {
                                    bVar3.e(false);
                                    bVar3.e(false);
                                    androidx.compose.runtime.changelist.a aVar6 = bVar3.f38192b;
                                    aVar6.getClass();
                                    aVar6.f38190a.g(d.C22049j.f38229c);
                                    bVar3.f38193c = false;
                                }
                            }
                            bVar2.f38192b = aVar4;
                        } catch (Throwable th2) {
                            bVar2.f38192b = aVar4;
                            throw th2;
                        }
                    } finally {
                        k2D.c();
                    }
                }
                i19.q(b14.f37896h);
            }
        }
        return k22.m(i13);
    }

    @Override // androidx.compose.runtime.A
    public final void A() {
        D0.f37948b.getClass();
        x0(125, null, null, D0.f37950d);
        this.f37906r = true;
    }

    public final void A0() {
        D0.f37948b.getClass();
        x0(125, null, null, D0.f37949c);
        this.f37906r = true;
    }

    @Override // androidx.compose.runtime.A
    @InterfaceC22194w
    public final boolean B(@Y61.l Object obj) {
        if (kotlin.jvm.internal.L.f(j0(), obj)) {
            return false;
        }
        H0(obj);
        return true;
    }

    public final void B0(Object obj, boolean z12) {
        if (z12) {
            K2 k22 = this.f37878G;
            if (k22.f38007k <= 0) {
                if ((k22.f37998b[(k22.f38003g * 5) + 1] & 1073741824) == 0) {
                    P1.a("Expected a node group");
                }
                k22.s();
                return;
            }
            return;
        }
        if (obj != null && this.f37878G.f() != obj) {
            androidx.compose.runtime.changelist.b bVar = this.f37884M;
            bVar.getClass();
            bVar.e(false);
            androidx.compose.runtime.changelist.a aVar = bVar.f38192b;
            aVar.getClass();
            d.H h12 = d.H.f38215c;
            androidx.compose.runtime.changelist.g gVar = aVar.f38190a;
            gVar.g(h12);
            g.b.a(gVar, 0, obj);
        }
        this.f37878G.s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if ((r0.f37998b[(r4 * 5) + 1] & 536870912) != 0) goto L22;
     */
    @Override // androidx.compose.runtime.A
    @androidx.compose.runtime.InterfaceC22194w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(int r10) {
        /*
            r9 = this;
            androidx.compose.runtime.N1 r0 = r9.f37898j
            r1 = 0
            r2 = 0
            if (r0 == 0) goto Lf
            androidx.compose.runtime.D0$a r0 = androidx.compose.runtime.D0.f37948b
            r0.getClass()
            r9.x0(r10, r2, r2, r1)
            return
        Lf:
            boolean r0 = r9.f37906r
            if (r0 == 0) goto L18
            java.lang.String r0 = "A call to createNode(), emitNode() or useNode() expected"
            androidx.compose.runtime.G.c(r0)
        L18:
            int r0 = r9.f37901m
            int r3 = r9.f37888Q
            r4 = 3
            int r3 = java.lang.Integer.rotateLeft(r3, r4)
            r3 = r3 ^ r10
            int r3 = java.lang.Integer.rotateLeft(r3, r4)
            r0 = r0 ^ r3
            r9.f37888Q = r0
            int r0 = r9.f37901m
            r3 = 1
            int r0 = r0 + r3
            r9.f37901m = r0
            androidx.compose.runtime.K2 r0 = r9.f37878G
            boolean r4 = r9.f37887P
            androidx.compose.runtime.A$a r5 = androidx.compose.runtime.A.f37866a
            if (r4 == 0) goto L4a
            int r4 = r0.f38007k
            int r4 = r4 + r3
            r0.f38007k = r4
            androidx.compose.runtime.O2 r0 = r9.f37880I
            r5.getClass()
            androidx.compose.runtime.A$a$a r3 = androidx.compose.runtime.A.a.f37868b
            r0.R(r10, r3)
            r9.c0(r1, r2)
            return
        L4a:
            int r4 = r0.g()
            if (r4 != r10) goto L6a
            int r4 = r0.f38003g
            int r6 = r0.f38004h
            if (r4 >= r6) goto L63
            int r4 = r4 * 5
            int r4 = r4 + r3
            int[] r6 = r0.f37998b
            r4 = r6[r4]
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            r4 = r4 & r6
            if (r4 == 0) goto L63
            goto L6a
        L63:
            r0.s()
            r9.c0(r1, r2)
            return
        L6a:
            int r4 = r0.f38007k
            if (r4 <= 0) goto L6f
            goto L8b
        L6f:
            int r4 = r0.f38003g
            int r6 = r0.f38004h
            if (r4 != r6) goto L76
            goto L8b
        L76:
            int r6 = r9.f37899k
            r9.o0()
            int r7 = r0.q()
            androidx.compose.runtime.changelist.b r8 = r9.f37884M
            r8.g(r6, r7)
            java.util.ArrayList r6 = r9.f37907s
            int r7 = r0.f38003g
            androidx.compose.runtime.G.a(r6, r4, r7)
        L8b:
            int r4 = r0.f38007k
            int r4 = r4 + r3
            r0.f38007k = r4
            r9.f37887P = r3
            r9.f37882K = r2
            androidx.compose.runtime.O2 r0 = r9.f37880I
            boolean r0 = r0.f38090w
            if (r0 == 0) goto La9
            androidx.compose.runtime.L2 r0 = r9.f37879H
            androidx.compose.runtime.O2 r0 = r0.e()
            r9.f37880I = r0
            r0.L()
            r9.f37881J = r1
            r9.f37882K = r2
        La9:
            androidx.compose.runtime.O2 r0 = r9.f37880I
            r0.d()
            int r3 = r0.f38087t
            r5.getClass()
            androidx.compose.runtime.A$a$a r4 = androidx.compose.runtime.A.a.f37868b
            r0.R(r10, r4)
            androidx.compose.runtime.g r10 = r0.b(r3)
            r9.f37885N = r10
            r9.c0(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.B.C(int):void");
    }

    public final void C0() {
        this.f37901m = 0;
        this.f37878G = this.f37892d.d();
        D0.a aVar = D0.f37948b;
        aVar.getClass();
        x0(100, null, null, 0);
        I i12 = this.f37891c;
        i12.r();
        this.f37909u = i12.g();
        this.f37912x.c(this.f37911w ? 1 : 0);
        this.f37911w = B(this.f37909u);
        this.f37882K = null;
        if (!this.f37905q) {
            this.f37905q = i12.getF37917b();
        }
        if (!this.f37874C) {
            this.f37874C = i12.getF37918c();
        }
        Set<androidx.compose.runtime.tooling.a> set = (Set) V.a(this.f37909u, androidx.compose.runtime.tooling.i.f38773a);
        if (set != null) {
            set.add(J());
            i12.o(set);
        }
        int f37916a = i12.getF37916a();
        aVar.getClass();
        x0(f37916a, null, null, 0);
    }

    @Override // androidx.compose.runtime.A
    /* renamed from: D, reason: from getter */
    public final boolean getF37887P() {
        return this.f37887P;
    }

    public final boolean D0(@Y61.k C22039c2 c22039c2, @Y61.l Object obj) {
        C22068g c22068g = c22039c2.f38183c;
        if (c22068g == null) {
            return false;
        }
        int iA2 = this.f37878G.f37997a.a(c22068g);
        if (!this.f37877F || iA2 < this.f37878G.f38003g) {
            return false;
        }
        ArrayList arrayList = this.f37907s;
        int iG2 = G.g(iA2, arrayList);
        if (iG2 < 0) {
            int i12 = -(iG2 + 1);
            if (!(obj instanceof InterfaceC22074h0)) {
                obj = null;
            }
            arrayList.add(i12, new M0(c22039c2, iA2, obj));
        } else {
            M0 m02 = (M0) arrayList.get(iG2);
            if (obj instanceof InterfaceC22074h0) {
                Object obj2 = m02.f38047c;
                if (obj2 == null) {
                    m02.f38047c = obj;
                } else if (obj2 instanceof androidx.collection.S0) {
                    ((androidx.collection.S0) obj2).e(obj);
                } else {
                    int i13 = androidx.collection.k1.f25735a;
                    androidx.collection.S0 s02 = new androidx.collection.S0(2);
                    s02.m(obj2);
                    s02.m(obj);
                    m02.f38047c = s02;
                }
            } else {
                m02.f38047c = null;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    @Override // androidx.compose.runtime.A
    @androidx.compose.runtime.InterfaceC22194w
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.B E(int r5) {
        /*
            r4 = this;
            r4.C(r5)
            boolean r5 = r4.f37887P
            androidx.compose.runtime.M r0 = r4.f37896h
            java.util.ArrayList r1 = r4.f37876E
            if (r5 == 0) goto L22
            androidx.compose.runtime.c2 r5 = new androidx.compose.runtime.c2
            r5.<init>(r0)
            r1.add(r5)
            r4.H0(r5)
            int r0 = r4.f37873B
            r5.f38185e = r0
            int r0 = r5.f38181a
            r0 = r0 & (-17)
            r5.f38181a = r0
            goto L9e
        L22:
            java.util.ArrayList r5 = r4.f37907s
            androidx.compose.runtime.K2 r2 = r4.f37878G
            int r2 = r2.f38005i
            int r2 = androidx.compose.runtime.G.g(r2, r5)
            if (r2 < 0) goto L35
            java.lang.Object r5 = r5.remove(r2)
            androidx.compose.runtime.M0 r5 = (androidx.compose.runtime.M0) r5
            goto L36
        L35:
            r5 = 0
        L36:
            androidx.compose.runtime.K2 r2 = r4.f37878G
            java.lang.Object r2 = r2.k()
            androidx.compose.runtime.A$a r3 = androidx.compose.runtime.A.f37866a
            r3.getClass()
            androidx.compose.runtime.A$a$a r3 = androidx.compose.runtime.A.a.f37868b
            boolean r3 = kotlin.jvm.internal.L.f(r2, r3)
            if (r3 == 0) goto L52
            androidx.compose.runtime.c2 r2 = new androidx.compose.runtime.c2
            r2.<init>(r0)
            r4.H0(r2)
            goto L54
        L52:
            androidx.compose.runtime.c2 r2 = (androidx.compose.runtime.C22039c2) r2
        L54:
            r0 = 0
            if (r5 != 0) goto L70
            int r5 = r2.f38181a
            r3 = r5 & 64
            if (r3 == 0) goto L5f
            r3 = 1
            goto L60
        L5f:
            r3 = r0
        L60:
            if (r3 == 0) goto L66
            r5 = r5 & (-65)
            r2.f38181a = r5
        L66:
            if (r3 == 0) goto L69
            goto L70
        L69:
            int r5 = r2.f38181a
            r5 = r5 & (-9)
            r2.f38181a = r5
            goto L76
        L70:
            int r5 = r2.f38181a
            r5 = r5 | 8
            r2.f38181a = r5
        L76:
            r1.add(r2)
            int r5 = r4.f37873B
            r2.f38185e = r5
            int r5 = r2.f38181a
            r1 = r5 & (-17)
            r2.f38181a = r1
            r1 = r5 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L9e
            r5 = r5 & (-273(0xfffffffffffffeef, float:NaN))
            r5 = r5 | 512(0x200, float:7.17E-43)
            r2.f38181a = r5
            androidx.compose.runtime.changelist.b r5 = r4.f37884M
            androidx.compose.runtime.changelist.a r5 = r5.f38192b
            r5.getClass()
            androidx.compose.runtime.changelist.d$D r1 = androidx.compose.runtime.changelist.d.D.f38210c
            androidx.compose.runtime.changelist.g r5 = r5.f38190a
            r5.g(r1)
            androidx.compose.runtime.changelist.g.b.a(r5, r0, r2)
        L9e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.B.E(int):androidx.compose.runtime.B");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E0(@Y61.k androidx.collection.R0<java.lang.Object, java.lang.Object> r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.Object[] r1 = r0.f25722b
            java.lang.Object[] r2 = r0.f25723c
            long[] r0 = r0.f25721a
            int r3 = r0.length
            int r3 = r3 + (-2)
            r4 = r17
            java.util.ArrayList r5 = r4.f37907s
            if (r3 < 0) goto L5e
            r7 = 0
        L12:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r3
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L2c:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r1[r13]
            r13 = r2[r13]
            androidx.compose.runtime.c2 r14 = (androidx.compose.runtime.C22039c2) r14
            androidx.compose.runtime.g r15 = r14.f38183c
            if (r15 == 0) goto L53
            int r15 = r15.f38401a
            androidx.compose.runtime.G2 r6 = androidx.compose.runtime.G2.f37977a
            if (r13 != r6) goto L4b
            r13 = 0
        L4b:
            androidx.compose.runtime.M0 r6 = new androidx.compose.runtime.M0
            r6.<init>(r14, r15, r13)
            r5.add(r6)
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2c
        L57:
            if (r10 != r11) goto L5e
        L59:
            if (r7 == r3) goto L5e
            int r7 = r7 + 1
            goto L12
        L5e:
            androidx.compose.runtime.F r0 = androidx.compose.runtime.G.f37973f
            kotlin.collections.C42745f0.z0(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.B.E0(androidx.collection.R0):void");
    }

    @Override // androidx.compose.runtime.A
    @Y61.k
    public final InterfaceC22078i<?> F() {
        return this.f37890b;
    }

    public final void F0(int i12, int i13) {
        if (I0(i12) != i13) {
            if (i12 < 0) {
                C20245x0 c20245x0 = this.f37904p;
                if (c20245x0 == null) {
                    c20245x0 = new C20245x0(0, 1, null);
                    this.f37904p = c20245x0;
                }
                c20245x0.f(i12, i13);
                return;
            }
            int[] iArr = this.f37903o;
            if (iArr == null) {
                iArr = new int[this.f37878G.f37999c];
                C42756l.z(iArr, -1, 0, 6);
                this.f37903o = iArr;
            }
            iArr[i12] = i13;
        }
    }

    @Override // androidx.compose.runtime.A
    @Y61.k
    @Y61.o
    public final CoroutineContext G() {
        return this.f37891c.getF38130w();
    }

    public final void G0(int i12, int i13) {
        int iI02 = I0(i12);
        if (iI02 != i13) {
            int i14 = i13 - iI02;
            ArrayList arrayList = this.f37897i;
            int size = arrayList.size() - 1;
            while (i12 != -1) {
                int iI03 = I0(i12) + i14;
                F0(i12, iI03);
                int i15 = size;
                while (true) {
                    if (-1 < i15) {
                        N1 n12 = (N1) arrayList.get(i15);
                        if (n12 != null && n12.a(i12, iI03)) {
                            size = i15 - 1;
                            break;
                        }
                        i15--;
                    } else {
                        break;
                    }
                }
                if (i12 < 0) {
                    i12 = this.f37878G.f38005i;
                } else if (this.f37878G.j(i12)) {
                    return;
                } else {
                    i12 = this.f37878G.o(i12);
                }
            }
        }
    }

    @Override // androidx.compose.runtime.A
    public final void H(@Y61.l Object obj) {
        int i12;
        K2 k22;
        int i13;
        O2 o22;
        if (obj instanceof B2) {
            B2 b22 = (B2) obj;
            C22068g c22068gA = null;
            if (this.f37887P) {
                O2 o23 = this.f37880I;
                int i14 = o23.f38087t;
                if (i14 > o23.f38089v + 1) {
                    int i15 = i14 - 1;
                    int iE2 = o23.E(i15, o23.f38069b);
                    while (true) {
                        i13 = i15;
                        i15 = iE2;
                        o22 = this.f37880I;
                        if (i15 == o22.f38089v || i15 < 0) {
                            break;
                        } else {
                            iE2 = o22.E(i15, o22.f38069b);
                        }
                    }
                    c22068gA = o22.b(i13);
                }
            } else {
                K2 k23 = this.f37878G;
                int i16 = k23.f38003g;
                if (i16 > k23.f38005i + 1) {
                    int i17 = i16 - 1;
                    int iO2 = k23.o(i17);
                    while (true) {
                        i12 = i17;
                        i17 = iO2;
                        k22 = this.f37878G;
                        if (i17 == k22.f38005i || i17 < 0) {
                            break;
                        } else {
                            iO2 = k22.o(i17);
                        }
                    }
                    c22068gA = k22.a(i12);
                }
            }
            C2 c22 = new C2(b22, c22068gA);
            if (this.f37887P) {
                androidx.compose.runtime.changelist.a aVar = this.f37884M.f38192b;
                aVar.getClass();
                d.w wVar = d.w.f38242c;
                androidx.compose.runtime.changelist.g gVar = aVar.f38190a;
                gVar.g(wVar);
                g.b.a(gVar, 0, c22);
            }
            this.f37893e.add(obj);
            obj = c22;
        }
        H0(obj);
    }

    @kotlin.X
    public final void H0(@Y61.l Object obj) {
        if (this.f37887P) {
            this.f37880I.U(obj);
            return;
        }
        K2 k22 = this.f37878G;
        boolean z12 = k22.f38010n;
        androidx.compose.runtime.changelist.b bVar = this.f37884M;
        if (!z12) {
            C22068g c22068gA = k22.a(k22.f38005i);
            androidx.compose.runtime.changelist.a aVar = bVar.f38192b;
            aVar.getClass();
            d.C22042b c22042b = d.C22042b.f38221c;
            androidx.compose.runtime.changelist.g gVar = aVar.f38190a;
            gVar.g(c22042b);
            g.b.b(gVar, 0, c22068gA, 1, obj);
            return;
        }
        int iD2 = (k22.f38008l - N2.d(k22.f38005i, k22.f37998b)) - 1;
        if (bVar.f38191a.f37878G.f38005i - bVar.f38196f >= 0) {
            bVar.e(true);
            androidx.compose.runtime.changelist.a aVar2 = bVar.f38192b;
            aVar2.getClass();
            d.J j12 = d.J.f38217c;
            androidx.compose.runtime.changelist.g gVar2 = aVar2.f38190a;
            gVar2.g(j12);
            g.b.a(gVar2, 0, obj);
            gVar2.f38247c[gVar2.f38248d - gVar2.f38245a[gVar2.f38246b - 1].f38205a] = iD2;
            return;
        }
        K2 k23 = this.f37878G;
        C22068g c22068gA2 = k23.a(k23.f38005i);
        androidx.compose.runtime.changelist.a aVar3 = bVar.f38192b;
        aVar3.getClass();
        d.G g12 = d.G.f38214c;
        androidx.compose.runtime.changelist.g gVar3 = aVar3.f38190a;
        gVar3.g(g12);
        g.b.b(gVar3, 0, obj, 1, c22068gA2);
        gVar3.f38247c[gVar3.f38248d - gVar3.f38245a[gVar3.f38246b - 1].f38205a] = iD2;
    }

    @Override // androidx.compose.runtime.A
    @InterfaceC22194w
    public final void I(int i12) {
        D0.f37948b.getClass();
        x0(i12, null, null, 0);
    }

    public final int I0(int i12) {
        int i13;
        if (i12 >= 0) {
            int[] iArr = this.f37903o;
            return (iArr == null || (i13 = iArr[i12]) < 0) ? this.f37878G.m(i12) : i13;
        }
        C20245x0 c20245x0 = this.f37904p;
        if (c20245x0 == null || c20245x0.a(i12) < 0) {
            return 0;
        }
        int iA2 = c20245x0.a(i12);
        if (iA2 >= 0) {
            return c20245x0.f25528c[iA2];
        }
        K.f.c("Cannot find value for key " + i12);
        throw null;
    }

    @Override // androidx.compose.runtime.A
    @Y61.k
    public final androidx.compose.runtime.tooling.a J() {
        K k12 = this.f37889R;
        if (k12 != null) {
            return k12;
        }
        K k13 = new K(this.f37896h);
        this.f37889R = k13;
        return k13;
    }

    @Override // androidx.compose.runtime.A
    @InterfaceC22194w
    public final void K(int i12, @Y61.l Object obj) {
        D0.f37948b.getClass();
        x0(i12, obj, null, 0);
    }

    @Override // androidx.compose.runtime.A
    public final void L() {
        this.f37913y = false;
    }

    @Override // androidx.compose.runtime.A
    /* renamed from: M, reason: from getter */
    public final int getF37888Q() {
        return this.f37888Q;
    }

    @Override // androidx.compose.runtime.A
    @InterfaceC22194w
    public final void N() {
        X(false);
    }

    @Override // androidx.compose.runtime.A
    @InterfaceC22194w
    public final void O() {
        X(false);
    }

    public final void P() {
        R();
        this.f37897i.clear();
        this.f37902n.f37980b = 0;
        this.f37908t.f37980b = 0;
        this.f37912x.f37980b = 0;
        this.f37910v = null;
        androidx.compose.runtime.changelist.c cVar = this.f37886O;
        cVar.f38204b.b();
        cVar.f38203a.b();
        this.f37888Q = 0;
        this.f37872A = 0;
        this.f37906r = false;
        this.f37887P = false;
        this.f37913y = false;
        this.f37877F = false;
        this.f37914z = -1;
        K2 k22 = this.f37878G;
        if (!k22.f38002f) {
            k22.c();
        }
        if (this.f37880I.f38090w) {
            return;
        }
        d0();
    }

    @InterfaceC22194w
    public final boolean Q(char c12) {
        Object objJ0 = j0();
        if ((objJ0 instanceof Character) && c12 == ((Character) objJ0).charValue()) {
            return false;
        }
        H0(Character.valueOf(c12));
        return true;
    }

    public final void R() {
        this.f37898j = null;
        this.f37899k = 0;
        this.f37900l = 0;
        this.f37888Q = 0;
        this.f37906r = false;
        androidx.compose.runtime.changelist.b bVar = this.f37884M;
        bVar.f38193c = false;
        bVar.f38194d.f37980b = 0;
        bVar.f38196f = 0;
        this.f37876E.clear();
        this.f37903o = null;
        this.f37904p = null;
    }

    public final O1 S() {
        O1 o12 = this.f37882K;
        return o12 != null ? o12 : T(this.f37878G.f38005i);
    }

    public final O1 T(int i12) {
        O1 o1B;
        boolean z12 = this.f37887P;
        G1 g12 = G.f37970c;
        if (z12 && this.f37881J) {
            int iE2 = this.f37880I.f38089v;
            while (iE2 > 0) {
                O2 o22 = this.f37880I;
                if (o22.f38069b[o22.q(iE2) * 5] == 202 && kotlin.jvm.internal.L.f(this.f37880I.r(iE2), g12)) {
                    O1 o12 = (O1) this.f37880I.p(iE2);
                    this.f37882K = o12;
                    return o12;
                }
                O2 o23 = this.f37880I;
                iE2 = o23.E(iE2, o23.f38069b);
            }
        }
        if (this.f37878G.f37999c > 0) {
            while (i12 > 0) {
                K2 k22 = this.f37878G;
                int[] iArr = k22.f37998b;
                if (iArr[i12 * 5] == 202 && kotlin.jvm.internal.L.f(k22.n(i12, iArr), g12)) {
                    androidx.collection.A0<O1> a02 = this.f37910v;
                    if (a02 == null || (o1B = a02.b(i12)) == null) {
                        K2 k23 = this.f37878G;
                        o1B = (O1) k23.b(i12, k23.f37998b);
                    }
                    this.f37882K = o1B;
                    return o1B;
                }
                i12 = this.f37878G.o(i12);
            }
        }
        O1 o13 = this.f37909u;
        this.f37882K = o13;
        return o13;
    }

    public final void U() {
        androidx.compose.runtime.internal.U.f38447a.getClass();
        Trace.beginSection("Compose:Composer.dispose");
        try {
            this.f37891c.s(this);
            this.f37876E.clear();
            this.f37907s.clear();
            this.f37894f.f38190a.b();
            this.f37910v = null;
            this.f37890b.clear();
            kotlin.G0 g02 = kotlin.G0.f406611a;
            Trace.endSection();
        } catch (Throwable th2) {
            androidx.compose.runtime.internal.U.f38447a.getClass();
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0091 A[Catch: all -> 0x008f, TRY_LEAVE, TryCatch #2 {all -> 0x008f, blocks: (B:14:0x0049, B:17:0x0053, B:18:0x0064, B:21:0x006a, B:23:0x0077, B:26:0x0091), top: B:47:0x0049, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(androidx.collection.R0 r9, androidx.compose.runtime.internal.C22096n r10) {
        /*
            r8 = this;
            java.lang.String r0 = "Check failed"
            java.util.ArrayList r1 = r8.f37907s
            boolean r2 = r8.f37877F
            if (r2 == 0) goto Ld
            java.lang.String r2 = "Reentrant composition is not supported"
            androidx.compose.runtime.G.c(r2)
        Ld:
            androidx.compose.runtime.internal.U r2 = androidx.compose.runtime.internal.U.f38447a
            r2.getClass()
            java.lang.String r2 = "Compose:recompose"
            android.os.Trace.beginSection(r2)
            androidx.compose.runtime.snapshots.l r2 = androidx.compose.runtime.snapshots.C22176v.j()     // Catch: java.lang.Throwable -> Lb4
            long r2 = r2.getF38722b()     // Catch: java.lang.Throwable -> Lb4
            int r2 = java.lang.Long.hashCode(r2)     // Catch: java.lang.Throwable -> Lb4
            r8.f37873B = r2     // Catch: java.lang.Throwable -> Lb4
            r2 = 0
            r8.f37910v = r2     // Catch: java.lang.Throwable -> Lb4
            r8.E0(r9)     // Catch: java.lang.Throwable -> Lb4
            r9 = 0
            r8.f37899k = r9     // Catch: java.lang.Throwable -> Lb4
            r2 = 1
            r8.f37877F = r2     // Catch: java.lang.Throwable -> Lb4
            r8.C0()     // Catch: java.lang.Throwable -> L40
            java.lang.Object r3 = r8.j0()     // Catch: java.lang.Throwable -> L40
            if (r3 == r10) goto L43
            if (r10 == 0) goto L43
            r8.H0(r10)     // Catch: java.lang.Throwable -> L40
            goto L43
        L40:
            r10 = move-exception
            goto Lbd
        L43:
            androidx.compose.runtime.C r4 = r8.f37875D     // Catch: java.lang.Throwable -> L40
            androidx.compose.runtime.collection.e r5 = androidx.compose.runtime.C22126m3.c()     // Catch: java.lang.Throwable -> L40
            r5.b(r4)     // Catch: java.lang.Throwable -> L8f
            androidx.compose.runtime.G1 r4 = androidx.compose.runtime.G.f37968a
            r6 = 2
            r7 = 200(0xc8, float:2.8E-43)
            if (r10 == 0) goto L64
            r8.z0(r7, r4)     // Catch: java.lang.Throwable -> L8f
            kotlin.jvm.internal.v0.e(r6, r10)     // Catch: java.lang.Throwable -> L8f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L8f
            r10.invoke(r8, r3)     // Catch: java.lang.Throwable -> L8f
            r8.X(r9)     // Catch: java.lang.Throwable -> L8f
            goto L94
        L64:
            boolean r10 = r8.f37911w     // Catch: java.lang.Throwable -> L8f
            if (r10 == 0) goto L91
            if (r3 == 0) goto L91
            androidx.compose.runtime.A$a r10 = androidx.compose.runtime.A.f37866a     // Catch: java.lang.Throwable -> L8f
            r10.getClass()     // Catch: java.lang.Throwable -> L8f
            androidx.compose.runtime.A$a$a r10 = androidx.compose.runtime.A.a.f37868b     // Catch: java.lang.Throwable -> L8f
            boolean r10 = r3.equals(r10)     // Catch: java.lang.Throwable -> L8f
            if (r10 != 0) goto L91
            r8.z0(r7, r4)     // Catch: java.lang.Throwable -> L8f
            kotlin.jvm.internal.v0.e(r6, r3)     // Catch: java.lang.Throwable -> L8f
            Y41.p r3 = (Y41.p) r3     // Catch: java.lang.Throwable -> L8f
            kotlin.jvm.internal.v0.e(r6, r3)     // Catch: java.lang.Throwable -> L8f
            Y41.p r3 = (Y41.p) r3     // Catch: java.lang.Throwable -> L8f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L8f
            r3.invoke(r8, r10)     // Catch: java.lang.Throwable -> L8f
            r8.X(r9)     // Catch: java.lang.Throwable -> L8f
            goto L94
        L8f:
            r10 = move-exception
            goto Lb6
        L91:
            r8.v0()     // Catch: java.lang.Throwable -> L8f
        L94:
            int r10 = r5.f38262d     // Catch: java.lang.Throwable -> L40
            int r10 = r10 - r2
            r5.k(r10)     // Catch: java.lang.Throwable -> L40
            r8.a0()     // Catch: java.lang.Throwable -> L40
            r8.f37877F = r9     // Catch: java.lang.Throwable -> Lb4
            r1.clear()     // Catch: java.lang.Throwable -> Lb4
            androidx.compose.runtime.O2 r9 = r8.f37880I     // Catch: java.lang.Throwable -> Lb4
            boolean r9 = r9.f38090w     // Catch: java.lang.Throwable -> Lb4
            if (r9 != 0) goto Lab
            androidx.compose.runtime.G.c(r0)     // Catch: java.lang.Throwable -> Lb4
        Lab:
            r8.d0()     // Catch: java.lang.Throwable -> Lb4
            kotlin.G0 r9 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> Lb4
            android.os.Trace.endSection()
            return
        Lb4:
            r9 = move-exception
            goto Ld2
        Lb6:
            int r3 = r5.f38262d     // Catch: java.lang.Throwable -> L40
            int r3 = r3 - r2
            r5.k(r3)     // Catch: java.lang.Throwable -> L40
            throw r10     // Catch: java.lang.Throwable -> L40
        Lbd:
            r8.f37877F = r9     // Catch: java.lang.Throwable -> Lb4
            r1.clear()     // Catch: java.lang.Throwable -> Lb4
            r8.P()     // Catch: java.lang.Throwable -> Lb4
            androidx.compose.runtime.O2 r9 = r8.f37880I     // Catch: java.lang.Throwable -> Lb4
            boolean r9 = r9.f38090w     // Catch: java.lang.Throwable -> Lb4
            if (r9 != 0) goto Lce
            androidx.compose.runtime.G.c(r0)     // Catch: java.lang.Throwable -> Lb4
        Lce:
            r8.d0()     // Catch: java.lang.Throwable -> Lb4
            throw r10     // Catch: java.lang.Throwable -> Lb4
        Ld2:
            androidx.compose.runtime.internal.U r10 = androidx.compose.runtime.internal.U.f38447a
            r10.getClass()
            android.os.Trace.endSection()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.B.V(androidx.collection.R0, androidx.compose.runtime.internal.n):void");
    }

    public final void W(int i12, int i13) {
        if (i12 <= 0 || i12 == i13) {
            return;
        }
        W(this.f37878G.o(i12), i13);
        if (this.f37878G.j(i12)) {
            Object objL = this.f37878G.l(i12);
            androidx.compose.runtime.changelist.b bVar = this.f37884M;
            bVar.d();
            bVar.f38198h.add(objL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03b6  */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X(boolean r38) {
        /*
            Method dump skipped, instructions count: 1420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.B.X(boolean):void");
    }

    @InterfaceC22194w
    public final void Y() {
        X(false);
        C22039c2 c22039c2F0 = f0();
        if (c22039c2F0 != null) {
            int i12 = c22039c2F0.f38181a;
            if ((i12 & 1) != 0) {
                c22039c2F0.f38181a = i12 | 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076 A[EDGE_INSN: B:56:0x0076->B:28:0x0076 BREAK  A[LOOP:0: B:15:0x0032->B:27:0x0073], EDGE_INSN: B:57:0x0076->B:28:0x0076 BREAK  A[LOOP:0: B:15:0x0032->B:27:0x0073]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
    @androidx.compose.runtime.InterfaceC22194w
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.C22039c2 Z() {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.B.Z():androidx.compose.runtime.c2");
    }

    @Override // androidx.compose.runtime.A
    public final <V, T> void a(V v12, @Y61.k Y41.p<? super T, ? super V, kotlin.G0> pVar) {
        if (this.f37887P) {
            androidx.compose.runtime.changelist.c cVar = this.f37886O;
            cVar.getClass();
            d.I i12 = d.I.f38216c;
            androidx.compose.runtime.changelist.g gVar = cVar.f38203a;
            gVar.g(i12);
            g.b.a(gVar, 0, v12);
            kotlin.jvm.internal.v0.e(2, pVar);
            g.b.a(gVar, 1, pVar);
            return;
        }
        androidx.compose.runtime.changelist.b bVar = this.f37884M;
        bVar.c();
        androidx.compose.runtime.changelist.a aVar = bVar.f38192b;
        aVar.getClass();
        d.I i13 = d.I.f38216c;
        androidx.compose.runtime.changelist.g gVar2 = aVar.f38190a;
        gVar2.g(i13);
        kotlin.jvm.internal.v0.e(2, pVar);
        g.b.b(gVar2, 0, v12, 1, pVar);
    }

    public final void a0() {
        X(false);
        this.f37891c.c();
        X(false);
        androidx.compose.runtime.changelist.b bVar = this.f37884M;
        if (bVar.f38193c) {
            bVar.e(false);
            bVar.e(false);
            androidx.compose.runtime.changelist.a aVar = bVar.f38192b;
            aVar.getClass();
            aVar.f38190a.g(d.C22049j.f38229c);
            bVar.f38193c = false;
        }
        bVar.c();
        if (bVar.f38194d.f37980b != 0) {
            G.c("Missed recording an endGroup()");
        }
        if (!this.f37897i.isEmpty()) {
            G.c("Start/end imbalance");
        }
        R();
        this.f37878G.c();
        this.f37911w = this.f37912x.b() != 0;
    }

    @Override // androidx.compose.runtime.A
    public final <T> void b(@Y61.k Y41.a<? extends T> aVar) {
        if (!this.f37906r) {
            G.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f37906r = false;
        if (!this.f37887P) {
            G.c("createNode() can only be called when inserting");
        }
        I0 i02 = this.f37902n;
        int i12 = i02.f37979a[i02.f37980b - 1];
        O2 o22 = this.f37880I;
        C22068g c22068gB = o22.b(o22.f38089v);
        this.f37900l++;
        androidx.compose.runtime.changelist.c cVar = this.f37886O;
        cVar.getClass();
        d.o oVar = d.o.f38234c;
        androidx.compose.runtime.changelist.g gVar = cVar.f38203a;
        gVar.g(oVar);
        g.b.a(gVar, 0, aVar);
        gVar.f38247c[gVar.f38248d - gVar.f38245a[gVar.f38246b - 1].f38205a] = i12;
        g.b.a(gVar, 1, c22068gB);
        d.u uVar = d.u.f38240c;
        androidx.compose.runtime.changelist.g gVar2 = cVar.f38204b;
        gVar2.g(uVar);
        gVar2.f38247c[gVar2.f38248d - gVar2.f38245a[gVar2.f38246b - 1].f38205a] = i12;
        g.b.a(gVar2, 0, c22068gB);
    }

    public final void b0(int i12) {
        if (i12 < 0) {
            int i13 = -i12;
            O2 o22 = this.f37880I;
            while (true) {
                int i14 = o22.f38089v;
                if (i14 <= i13) {
                    return;
                } else {
                    X(o22.w(i14));
                }
            }
        } else {
            if (this.f37887P) {
                O2 o23 = this.f37880I;
                while (this.f37887P) {
                    X(o23.w(o23.f38089v));
                }
            }
            K2 k22 = this.f37878G;
            while (true) {
                int i15 = k22.f38005i;
                if (i15 <= i12) {
                    return;
                } else {
                    X(k22.j(i15));
                }
            }
        }
    }

    @Override // androidx.compose.runtime.A
    public final boolean c() {
        C22039c2 c22039c2F0;
        return (this.f37887P || this.f37913y || this.f37911w || (c22039c2F0 = f0()) == null || (c22039c2F0.f38181a & 8) != 0) ? false : true;
    }

    public final void c0(boolean z12, N1 n12) {
        this.f37897i.add(this.f37898j);
        this.f37898j = n12;
        int i12 = this.f37900l;
        I0 i02 = this.f37902n;
        i02.c(i12);
        i02.c(this.f37901m);
        i02.c(this.f37899k);
        if (z12) {
            this.f37899k = 0;
        }
        this.f37900l = 0;
        this.f37901m = 0;
    }

    @Override // androidx.compose.runtime.A
    public final void d() {
        if (!this.f37906r) {
            G.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f37906r = false;
        if (this.f37887P) {
            G.c("useNode() called while inserting");
        }
        K2 k22 = this.f37878G;
        Object objL = k22.l(k22.f38005i);
        androidx.compose.runtime.changelist.b bVar = this.f37884M;
        bVar.d();
        bVar.f38198h.add(objL);
        if (this.f37913y && (objL instanceof InterfaceC22198x)) {
            bVar.c();
            androidx.compose.runtime.changelist.a aVar = bVar.f38192b;
            aVar.getClass();
            if (objL instanceof InterfaceC22198x) {
                aVar.f38190a.g(d.L.f38219c);
            }
        }
    }

    public final void d0() {
        L2 l22 = new L2();
        if (this.f37874C) {
            l22.b();
        }
        int i12 = 1;
        if (this.f37891c.d()) {
            l22.f38022l = new androidx.collection.A0<>(0, i12, null);
        }
        this.f37879H = l22;
        O2 o2E = l22.e();
        o2E.e(true);
        this.f37880I = o2E;
    }

    @Override // androidx.compose.runtime.A
    public final void e(@Y61.l Object obj) {
        if (!this.f37887P && this.f37878G.g() == 207 && !kotlin.jvm.internal.L.f(this.f37878G.f(), obj) && this.f37914z < 0) {
            this.f37914z = this.f37878G.f38003g;
            this.f37913y = true;
        }
        D0.f37948b.getClass();
        x0(207, null, obj, 0);
    }

    public final int e0() {
        return this.f37887P ? -this.f37880I.f38089v : this.f37878G.f38005i;
    }

    @Override // androidx.compose.runtime.A
    @InterfaceC22194w
    public final void f() {
        if (this.f37900l != 0) {
            G.c("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.f37887P) {
            return;
        }
        C22039c2 c22039c2F0 = f0();
        if (c22039c2F0 != null) {
            int i12 = c22039c2F0.f38181a;
            if ((i12 & 128) == 0) {
                c22039c2F0.f38181a = i12 | 16;
            }
        }
        if (this.f37907s.isEmpty()) {
            w0();
        } else {
            n0();
        }
    }

    @Y61.l
    public final C22039c2 f0() {
        if (this.f37872A == 0) {
            ArrayList arrayList = this.f37876E;
            if (!arrayList.isEmpty()) {
                return (C22039c2) androidx.appcompat.app.r.j(1, arrayList);
            }
        }
        return null;
    }

    @Override // androidx.compose.runtime.A
    public final void g(@Y61.k InterfaceC22034b2 interfaceC22034b2) {
        C22039c2 c22039c2 = interfaceC22034b2 instanceof C22039c2 ? (C22039c2) interfaceC22034b2 : null;
        if (c22039c2 == null) {
            return;
        }
        c22039c2.e();
    }

    public final boolean g0() {
        C22039c2 c22039c2F0;
        return (c() && !this.f37911w && ((c22039c2F0 = f0()) == null || (c22039c2F0.f38181a & 4) == 0)) ? false : true;
    }

    @Override // androidx.compose.runtime.A
    @InterfaceC22194w
    public final void h() {
        X(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b A[Catch: all -> 0x015e, TryCatch #13 {all -> 0x015e, blocks: (B:85:0x01da, B:46:0x00ee, B:52:0x010e, B:53:0x0110, B:55:0x0122, B:57:0x012b, B:59:0x0136, B:61:0x0147, B:63:0x014d, B:67:0x0162, B:84:0x01d7, B:110:0x021a, B:111:0x021d, B:113:0x021f, B:114:0x0222, B:47:0x00fc, B:117:0x0228, B:68:0x0169, B:83:0x01d1, B:107:0x0212, B:108:0x0218, B:54:0x0119), top: B:148:0x00ee, inners: #9, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c5 A[Catch: all -> 0x020e, TRY_LEAVE, TryCatch #4 {all -> 0x020e, blocks: (B:80:0x01b8, B:82:0x01c5, B:101:0x020b, B:102:0x020d), top: B:130:0x01b8 }] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h0(java.util.ArrayList r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.B.h0(java.util.ArrayList):void");
    }

    @Override // androidx.compose.runtime.A
    @Y61.k
    public final b i() {
        z0(206, G.f37972e);
        if (this.f37887P) {
            O2.x(this.f37880I);
        }
        Object objJ0 = j0();
        a aVar = objJ0 instanceof a ? (a) objJ0 : null;
        if (aVar == null) {
            aVar = new a(new b(this.f37888Q, this.f37905q, this.f37874C, this.f37896h.f38041s));
            H0(aVar);
        }
        O1 o1S = S();
        b bVar = aVar.f37915b;
        ((C22082i3) bVar.f37922g).setValue(o1S);
        X(false);
        return bVar;
    }

    public final void i0(Y0<Object> y02, O1 o12, Object obj, boolean z12) {
        K(126665345, y02);
        j0();
        H0(obj);
        int i12 = this.f37888Q;
        try {
            this.f37888Q = 126665345;
            if (this.f37887P) {
                O2.x(this.f37880I);
            }
            boolean z13 = (this.f37887P || kotlin.jvm.internal.L.f(this.f37878G.f(), o12)) ? false : true;
            if (z13) {
                p0(o12);
            }
            G1 g12 = G.f37970c;
            D0.f37948b.getClass();
            x0(202, g12, o12, 0);
            this.f37882K = null;
            if (!this.f37887P || z12) {
                boolean z14 = this.f37911w;
                this.f37911w = z13;
                C22096n c22096n = new C22096n(316014703, new c(y02, obj), true);
                kotlin.jvm.internal.v0.e(2, c22096n);
                c22096n.invoke(this, 1);
                this.f37911w = z14;
            } else {
                this.f37881J = true;
                O2 o22 = this.f37880I;
                this.f37891c.k(new C22183t1(y02, obj, this.f37896h, this.f37879H, o22.b(o22.E(o22.f38089v, o22.f38069b)), C42784z0.f406748b, S(), null));
            }
            X(false);
            this.f37882K = null;
            this.f37888Q = i12;
            X(false);
        } catch (Throwable th2) {
            X(false);
            this.f37882K = null;
            this.f37888Q = i12;
            X(false);
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.A
    @InterfaceC22194w
    public final boolean j(boolean z12) {
        Object objJ0 = j0();
        if ((objJ0 instanceof Boolean) && z12 == ((Boolean) objJ0).booleanValue()) {
            return false;
        }
        H0(Boolean.valueOf(z12));
        return true;
    }

    @Y61.l
    @kotlin.X
    public final Object j0() {
        boolean z12 = this.f37887P;
        A.a aVar = A.f37866a;
        if (z12) {
            if (this.f37906r) {
                G.c("A call to createNode(), emitNode() or useNode() expected");
            }
            aVar.getClass();
            return A.a.f37868b;
        }
        Object objK = this.f37878G.k();
        if (!this.f37913y || (objK instanceof F2)) {
            return objK;
        }
        aVar.getClass();
        return A.a.f37868b;
    }

    @Override // androidx.compose.runtime.A
    @InterfaceC22194w
    public final boolean k(float f12) {
        Object objJ0 = j0();
        if ((objJ0 instanceof Float) && f12 == ((Number) objJ0).floatValue()) {
            return false;
        }
        H0(Float.valueOf(f12));
        return true;
    }

    public final int k0(int i12) {
        int iO2 = this.f37878G.o(i12) + 1;
        int i13 = 0;
        while (iO2 < i12) {
            if (!this.f37878G.i(iO2)) {
                i13++;
            }
            iO2 += N2.a(iO2, this.f37878G.f37998b);
        }
        return i13;
    }

    @Override // androidx.compose.runtime.A
    public final void l() {
        this.f37913y = this.f37914z >= 0;
    }

    public final boolean l0(@Y61.k androidx.collection.R0 r02) {
        androidx.compose.runtime.changelist.g gVar = this.f37894f.f38190a;
        if (!gVar.e()) {
            G.c("Expected applyChanges() to have been called");
        }
        if (r02.f25725e <= 0 && this.f37907s.isEmpty()) {
            return false;
        }
        V(r02, null);
        return gVar.f();
    }

    @Override // androidx.compose.runtime.A
    @InterfaceC22194w
    public final boolean m(int i12) {
        Object objJ0 = j0();
        if ((objJ0 instanceof Integer) && i12 == ((Number) objJ0).intValue()) {
            return false;
        }
        H0(Integer.valueOf(i12));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #1 {all -> 0x0027, blocks: (B:3:0x0005, B:6:0x0015, B:8:0x0023, B:12:0x002c, B:11:0x0029, B:15:0x0033, B:18:0x003b, B:21:0x0043, B:23:0x004b, B:25:0x0051, B:26:0x0055, B:27:0x0056, B:29:0x005c, B:22:0x0047), top: B:36:0x0005, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m0(androidx.compose.runtime.M r9, androidx.compose.runtime.M r10, java.lang.Integer r11, java.util.List r12, Y41.a r13) {
        /*
            r8 = this;
            boolean r0 = r8.f37877F
            int r1 = r8.f37899k
            r2 = 1
            r8.f37877F = r2     // Catch: java.lang.Throwable -> L27
            r2 = 0
            r8.f37899k = r2     // Catch: java.lang.Throwable -> L27
            r3 = r12
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L27
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L27
            r4 = r2
        L12:
            r5 = 0
            if (r4 >= r3) goto L2f
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L27
            kotlin.Q r6 = (kotlin.Q) r6     // Catch: java.lang.Throwable -> L27
            A r7 = r6.f406619b     // Catch: java.lang.Throwable -> L27
            androidx.compose.runtime.c2 r7 = (androidx.compose.runtime.C22039c2) r7     // Catch: java.lang.Throwable -> L27
            B r6 = r6.f406620c     // Catch: java.lang.Throwable -> L27
            if (r6 == 0) goto L29
            r8.D0(r7, r6)     // Catch: java.lang.Throwable -> L27
            goto L2c
        L27:
            r9 = move-exception
            goto L65
        L29:
            r8.D0(r7, r5)     // Catch: java.lang.Throwable -> L27
        L2c:
            int r4 = r4 + 1
            goto L12
        L2f:
            if (r9 == 0) goto L5c
            if (r11 == 0) goto L38
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L27
            goto L39
        L38:
            r11 = -1
        L39:
            if (r10 == 0) goto L56
            boolean r12 = r10.equals(r9)     // Catch: java.lang.Throwable -> L27
            if (r12 != 0) goto L56
            if (r11 < 0) goto L56
            r9.f38039q = r10     // Catch: java.lang.Throwable -> L27
            r9.f38040r = r11     // Catch: java.lang.Throwable -> L27
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L50
            r9.f38039q = r5     // Catch: java.lang.Throwable -> L27
            r9.f38040r = r2     // Catch: java.lang.Throwable -> L27
            goto L5a
        L50:
            r10 = move-exception
            r9.f38039q = r5     // Catch: java.lang.Throwable -> L27
            r9.f38040r = r2     // Catch: java.lang.Throwable -> L27
            throw r10     // Catch: java.lang.Throwable -> L27
        L56:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L27
        L5a:
            if (r10 != 0) goto L60
        L5c:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L27
        L60:
            r8.f37877F = r0
            r8.f37899k = r1
            return r10
        L65:
            r8.f37877F = r0
            r8.f37899k = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.B.m0(androidx.compose.runtime.M, androidx.compose.runtime.M, java.lang.Integer, java.util.List, Y41.a):java.lang.Object");
    }

    @Override // androidx.compose.runtime.A
    @InterfaceC22194w
    public final boolean n(long j12) {
        Object objJ0 = j0();
        if ((objJ0 instanceof Long) && j12 == ((Number) objJ0).longValue()) {
            return false;
        }
        H0(Long.valueOf(j12));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n0() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 963
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.B.n0():void");
    }

    @Override // androidx.compose.runtime.A
    @K0
    public final <T> T o(@Y61.k O<T> o12) {
        return (T) V.a(S(), o12);
    }

    public final void o0() {
        r0(this.f37878G.f38003g);
        androidx.compose.runtime.changelist.b bVar = this.f37884M;
        bVar.e(false);
        bVar.f();
        androidx.compose.runtime.changelist.a aVar = bVar.f38192b;
        aVar.getClass();
        aVar.f38190a.g(d.y.f38243c);
        int i12 = bVar.f38196f;
        K2 k22 = bVar.f38191a.f37878G;
        bVar.f38196f = k22.f37998b[(k22.f38003g * 5) + 3] + i12;
    }

    @Override // androidx.compose.runtime.A
    @InterfaceC22194w
    public final boolean p(int i12, boolean z12) {
        return ((i12 & 1) == 0 && (this.f37887P || this.f37913y)) || z12 || !c();
    }

    public final void p0(O1 o12) {
        androidx.collection.A0<O1> a02 = this.f37910v;
        if (a02 == null) {
            a02 = new androidx.collection.A0<>(0, 1, null);
            this.f37910v = a02;
        }
        a02.h(this.f37878G.f38003g, o12);
    }

    @Override // androidx.compose.runtime.A
    public final void q() {
        this.f37905q = true;
        this.f37874C = true;
        this.f37892d.b();
        this.f37879H.b();
        O2 o22 = this.f37880I;
        L2 l22 = o22.f38068a;
        o22.f38072e = l22.f38021k;
        o22.f38073f = l22.f38022l;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0004  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q0(int r7, int r8, int r9) {
        /*
            r6 = this;
            androidx.compose.runtime.K2 r0 = r6.f37878G
            if (r7 != r8) goto L7
        L4:
            r9 = r7
            goto L6c
        L7:
            if (r7 == r9) goto L6c
            if (r8 != r9) goto Ld
            goto L6c
        Ld:
            int r1 = r0.o(r7)
            if (r1 != r8) goto L16
            r9 = r8
            goto L6c
        L16:
            int r1 = r0.o(r8)
            if (r1 != r7) goto L1d
            goto L4
        L1d:
            int r1 = r0.o(r7)
            int r2 = r0.o(r8)
            if (r1 != r2) goto L2c
            int r9 = r0.o(r7)
            goto L6c
        L2c:
            r1 = 0
            r2 = r7
            r3 = r1
        L2f:
            if (r2 <= 0) goto L3a
            if (r2 == r9) goto L3a
            int r2 = r0.o(r2)
            int r3 = r3 + 1
            goto L2f
        L3a:
            r2 = r8
            r4 = r1
        L3c:
            if (r2 <= 0) goto L47
            if (r2 == r9) goto L47
            int r2 = r0.o(r2)
            int r4 = r4 + 1
            goto L3c
        L47:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4b:
            if (r2 >= r9) goto L54
            int r5 = r0.o(r5)
            int r2 = r2 + 1
            goto L4b
        L54:
            int r4 = r4 - r3
            r9 = r8
        L56:
            if (r1 >= r4) goto L5f
            int r9 = r0.o(r9)
            int r1 = r1 + 1
            goto L56
        L5f:
            r1 = r9
            r9 = r5
        L61:
            if (r9 == r1) goto L6c
            int r9 = r0.o(r9)
            int r1 = r0.o(r1)
            goto L61
        L6c:
            if (r7 <= 0) goto L80
            if (r7 == r9) goto L80
            boolean r1 = r0.j(r7)
            if (r1 == 0) goto L7b
            androidx.compose.runtime.changelist.b r1 = r6.f37884M
            r1.b()
        L7b:
            int r7 = r0.o(r7)
            goto L6c
        L80:
            r6.W(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.B.q0(int, int, int):void");
    }

    @Override // androidx.compose.runtime.A
    @Y61.l
    public final C22039c2 r() {
        return f0();
    }

    public final void r0(int i12) {
        boolean zJ2 = this.f37878G.j(i12);
        androidx.compose.runtime.changelist.b bVar = this.f37884M;
        if (zJ2) {
            bVar.d();
            Object objL = this.f37878G.l(i12);
            bVar.d();
            bVar.f38198h.add(objL);
        }
        u0(this, i12, i12, zJ2, 0);
        bVar.d();
        if (zJ2) {
            bVar.b();
        }
    }

    @Override // androidx.compose.runtime.A
    public final void s() {
        if (this.f37913y && this.f37878G.f38005i == this.f37914z) {
            this.f37914z = -1;
            this.f37913y = false;
        }
        X(false);
    }

    @Override // androidx.compose.runtime.A
    @Y61.l
    public final Object t() {
        boolean z12 = this.f37887P;
        A.a aVar = A.f37866a;
        if (z12) {
            if (this.f37906r) {
                G.c("A call to createNode(), emitNode() or useNode() expected");
            }
            aVar.getClass();
            return A.a.f37868b;
        }
        Object objK = this.f37878G.k();
        if (!this.f37913y || (objK instanceof F2)) {
            return objK instanceof C2 ? ((C2) objK).f37941a : objK;
        }
        aVar.getClass();
        return A.a.f37868b;
    }

    @Override // androidx.compose.runtime.A
    @InterfaceC22194w
    public final boolean u(@Y61.l Object obj) {
        if (j0() == obj) {
            return false;
        }
        H0(obj);
        return true;
    }

    @Override // androidx.compose.runtime.A
    @InterfaceC22194w
    public final void v(boolean z12) {
        if (this.f37900l != 0) {
            G.c("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (this.f37887P) {
            return;
        }
        if (!z12) {
            w0();
            return;
        }
        K2 k22 = this.f37878G;
        int i12 = k22.f38003g;
        int i13 = k22.f38004h;
        androidx.compose.runtime.changelist.b bVar = this.f37884M;
        bVar.getClass();
        bVar.e(false);
        androidx.compose.runtime.changelist.a aVar = bVar.f38192b;
        aVar.getClass();
        aVar.f38190a.g(d.C22045f.f38225c);
        G.a(this.f37907s, i12, i13);
        this.f37878G.r();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    @androidx.compose.runtime.InterfaceC22194w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v0() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.B.v0():void");
    }

    @Override // androidx.compose.runtime.A
    public final void w(@Y61.k Y41.a<kotlin.G0> aVar) {
        androidx.compose.runtime.changelist.a aVar2 = this.f37884M.f38192b;
        aVar2.getClass();
        d.B b12 = d.B.f38208c;
        androidx.compose.runtime.changelist.g gVar = aVar2.f38190a;
        gVar.g(b12);
        g.b.a(gVar, 0, aVar);
    }

    public final void w0() {
        int i12;
        K2 k22 = this.f37878G;
        int i13 = k22.f38005i;
        if (i13 >= 0) {
            i12 = k22.f37998b[(i13 * 5) + 1] & 67108863;
        } else {
            i12 = 0;
        }
        this.f37900l = i12;
        k22.r();
    }

    @Override // androidx.compose.runtime.A
    @K0
    public final void x(@Y61.l Object obj) {
        i0(null, S(), obj, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x0(int r27, java.lang.Object r28, java.lang.Object r29, int r30) {
        /*
            Method dump skipped, instructions count: 929
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.B.x0(int, java.lang.Object, java.lang.Object, int):void");
    }

    @Override // androidx.compose.runtime.A
    @Y61.k
    public final O1 y() {
        return S();
    }

    @InterfaceC22194w
    public final void y0() {
        D0.f37948b.getClass();
        x0(-127, null, null, 0);
    }

    @Override // androidx.compose.runtime.A
    public final void z() {
        X(true);
    }

    public final void z0(int i12, G1 g12) {
        D0.f37948b.getClass();
        x0(i12, g12, null, 0);
    }

    /* compiled from: Composer.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/B$a;", "Landroidx/compose/runtime/F2;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements F2 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final b f37915b;

        public a(@Y61.k b bVar) {
            this.f37915b = bVar;
        }

        @Override // androidx.compose.runtime.B2
        public final void b() {
            this.f37915b.u();
        }

        @Override // androidx.compose.runtime.B2
        public final void e() {
            this.f37915b.u();
        }

        @Override // androidx.compose.runtime.B2
        public final void c() {
        }
    }
}
