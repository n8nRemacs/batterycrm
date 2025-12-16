package Fc1;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.NoWhenBranchMatchedException;
import xyz.n.a.ub;

@androidx.compose.runtime.F3
/* renamed from: Fc1.g0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13615g0 extends AbstractC13717r4 {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f5512s = 0;

    /* renamed from: l, reason: collision with root package name */
    @Inject
    public U4 f5513l;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public InterfaceC13624h0 f5514m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public InterfaceC13790z5 f5515n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public C13697p1 f5516o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public H3 f5517p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f5518q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final C13608f2 f5519r;

    /* renamed from: Fc1.g0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {
        public a(int i12) {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            C13615g0.this.a(a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* renamed from: Fc1.g0$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C13615g0 c13615g0 = C13615g0.this;
            if (c13615g0.d().size() >= 3) {
                InterfaceC13790z5 interfaceC13790z5 = c13615g0.f5515n;
                if (interfaceC13790z5 == null) {
                    interfaceC13790z5 = null;
                }
                interfaceC13790z5.a(ub.f442802d, null);
            } else {
                U4 u42 = c13615g0.f5513l;
                (u42 != null ? u42 : null).a(new B0(c13615g0));
            }
            return kotlin.G0.f406611a;
        }
    }

    /* renamed from: Fc1.g0$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public c() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0070 A[PHI: r0
  0x0070: PHI (r0v7 androidx.activity.result.h) = (r0v6 androidx.activity.result.h), (r0v11 androidx.activity.result.h) binds: [B:29:0x006e, B:19:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // Y41.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke() {
            /*
                r6 = this;
                Fc1.g0 r0 = Fc1.C13615g0.this
                Fc1.H3 r1 = r0.f5517p
                r2 = 0
                if (r1 == 0) goto L8
                goto L9
            L8:
                r1 = r2
            L9:
                androidx.compose.runtime.snapshots.D r3 = r0.d()
                int r3 = r3.size()
                int r3 = 3 - r3
                r4 = 1
                if (r3 <= r4) goto L47
                Fc1.H3 r4 = r0.f5517p
                if (r4 == 0) goto L1b
                goto L1c
            L1b:
                r4 = r2
            L1c:
                android.app.Activity r4 = r4.b()
                int r4 = r4.hashCode()
                Fc1.i1 r5 = new Fc1.i1
                r5.<init>(r0, r1)
                r1.f4991d = r5
                java.util.LinkedHashMap r0 = r1.f4992e
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
                java.lang.Object r0 = r0.get(r1)
                androidx.activity.result.h r0 = (androidx.view.result.h) r0
                if (r0 == 0) goto L3d
                i.a r2 = r0.a()
            L3d:
                Fc1.O5 r2 = (Fc1.O5) r2
                if (r2 != 0) goto L42
                goto L44
            L42:
                r2.f5126d = r3
            L44:
                if (r0 == 0) goto L91
                goto L70
            L47:
                if (r3 != r4) goto L86
                Fc1.H3 r3 = r0.f5517p
                if (r3 == 0) goto L4f
                r4 = r3
                goto L50
            L4f:
                r4 = r2
            L50:
                if (r3 == 0) goto L53
                r2 = r3
            L53:
                android.app.Activity r2 = r2.b()
                int r2 = r2.hashCode()
                Fc1.R0 r3 = new Fc1.R0
                r3.<init>(r0, r1)
                r4.f4993f = r3
                java.util.LinkedHashMap r0 = r4.f4994g
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                java.lang.Object r0 = r0.get(r1)
                androidx.activity.result.h r0 = (androidx.view.result.h) r0
                if (r0 == 0) goto L91
            L70:
                i.b$j$c r1 = i.b.j.c.f398331a
                androidx.activity.result.l$a r2 = new androidx.activity.result.l$a
                r2.<init>()
                r2.f21274a = r1
                androidx.activity.result.l r1 = new androidx.activity.result.l
                r1.<init>()
                i.b$j$f r2 = r2.f21274a
                r1.f21273a = r2
                r0.b(r1)
                goto L91
            L86:
                Fc1.z5 r0 = r0.f5515n
                if (r0 == 0) goto L8b
                goto L8c
            L8b:
                r0 = r2
            L8c:
                xyz.n.a.ub r1 = xyz.n.a.ub.f442802d
                r0.a(r1, r2)
            L91:
                kotlin.G0 r0 = kotlin.G0.f406611a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Fc1.C13615g0.c.invoke():java.lang.Object");
        }
    }

    /* renamed from: Fc1.g0$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<C13602e5, kotlin.G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(C13602e5 c13602e5) {
            ub ubVar;
            C13602e5 c13602e52 = c13602e5;
            C13615g0 c13615g0 = C13615g0.this;
            InterfaceC13790z5 interfaceC13790z5 = c13615g0.f5515n;
            if (interfaceC13790z5 == null) {
                interfaceC13790z5 = null;
            }
            int iOrdinal = c13602e52.f5487a.ordinal();
            if (iOrdinal == 0) {
                ubVar = ub.f442801c;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                ubVar = ub.f442800b;
            }
            interfaceC13790z5.a(ubVar, new A1(c13615g0, c13602e52));
            return kotlin.G0.f406611a;
        }
    }

    /* renamed from: Fc1.g0$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<C13602e5, kotlin.G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(C13602e5 c13602e5) {
            C13602e5 c13602e52 = c13602e5;
            C13615g0 c13615g0 = C13615g0.this;
            InterfaceC13624h0 interfaceC13624h0 = c13615g0.f5514m;
            if (interfaceC13624h0 == null) {
                interfaceC13624h0 = null;
            }
            interfaceC13624h0.a(c13602e52, c13615g0.d().e().f38613c);
            return kotlin.G0.f406611a;
        }
    }

    /* renamed from: Fc1.g0$f */
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<androidx.compose.runtime.snapshots.D<C13602e5>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ I6 f5526m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(I6 i62) {
            super(0);
            this.f5526m = i62;
        }

        @Override // Y41.a
        public final androidx.compose.runtime.snapshots.D<C13602e5> invoke() {
            C13615g0 c13615g0 = C13615g0.this;
            C13697p1 c13697p1 = c13615g0.f5516o;
            if (c13697p1 == null) {
                c13697p1 = null;
            }
            Q1 q12 = new Q1(c13615g0);
            c13697p1.getClass();
            I6 i62 = this.f5526m;
            androidx.compose.runtime.snapshots.D<C13602e5> d12 = new androidx.compose.runtime.snapshots.D<>();
            c13697p1.a(i62.getId(), new X0(d12, q12));
            return d12;
        }
    }

    public C13615g0(@Y61.k I6 i62) {
        super(i62);
        this.f5518q = C42727D.c(new f(i62));
        this.f5519r = new C13608f2(new b(), new c(), new d(), new e());
    }

    @Override // Fc1.AbstractC13717r4
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-353726985);
        if ((i12 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            C13713r0.a(this, bE2, 8);
            L2.a(this.f5519r, d(), bE2, 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new a(i12);
    }

    public final androidx.compose.runtime.snapshots.D<C13602e5> d() {
        return (androidx.compose.runtime.snapshots.D) this.f5518q.getValue();
    }
}
