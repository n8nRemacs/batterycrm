package androidx.compose.foundation.layout;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.u;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Box.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20632w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final androidx.collection.R0<InterfaceC22215f, InterfaceC22365i0> f28763a = c(true);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final androidx.collection.R0<InterfaceC22215f, InterfaceC22365i0> f28764b = c(false);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC22365i0 f28765c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC22365i0 f28766d;

    /* compiled from: Box.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.w$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f28767l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f28768m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.v vVar, int i12) {
            super(2);
            this.f28767l = vVar;
            this.f28768m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f28768m | 1);
            C20632w.a(this.f28767l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Box.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "<anonymous parameter 0>", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.w$b */
    public static final class b implements InterfaceC22365i0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f28769a = new b();

        /* compiled from: Box.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.layout.w$b$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f28770l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final /* bridge */ /* synthetic */ kotlin.G0 invoke(K0.a aVar) {
                return kotlin.G0.f406611a;
            }
        }

        @Override // androidx.compose.ui.layout.InterfaceC22365i0
        public final InterfaceC22367j0 b(InterfaceC22369k0 interfaceC22369k0, List<? extends InterfaceC22363h0> list, long j12) {
            return interfaceC22369k0.L0(C22712b.l(j12), C22712b.k(j12), kotlin.collections.P0.c(), a.f28770l);
        }
    }

    static {
        InterfaceC22215f.f39074a.getClass();
        f28765c = new C20636x(InterfaceC22215f.a.f39076b, false);
        f28766d = b.f28769a;
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-211209833);
        if ((i12 & 6) == 0) {
            i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if (bE2.p(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC22365i0 interfaceC22365i0 = f28766d;
            int i14 = bE2.f37888Q;
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
            androidx.compose.runtime.O1 o1S = bE2.S();
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            bE2.X(true);
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(vVar, i12);
        }
    }

    public static final void b(K0.a aVar, androidx.compose.ui.layout.K0 k02, InterfaceC22363h0 interfaceC22363h0, LayoutDirection layoutDirection, int i12, int i13, InterfaceC22215f interfaceC22215f) {
        InterfaceC22215f interfaceC22215f2;
        Object f40847t = interfaceC22363h0.getF40763y();
        C20628v c20628v = f40847t instanceof C20628v ? (C20628v) f40847t : null;
        InterfaceC22215f interfaceC22215f3 = (c20628v == null || (interfaceC22215f2 = c20628v.f28752p) == null) ? interfaceC22215f : interfaceC22215f2;
        u.a aVar2 = androidx.compose.ui.unit.u.f42871b;
        K0.a.g(aVar, k02, interfaceC22215f3.a((k02.f40345b << 32) | (k02.f40346c & 4294967295L), (i12 << 32) | (i13 & 4294967295L), layoutDirection));
    }

    public static final androidx.collection.R0<InterfaceC22215f, InterfaceC22365i0> c(boolean z12) {
        androidx.collection.R0<InterfaceC22215f, InterfaceC22365i0> r02 = new androidx.collection.R0<>(9);
        InterfaceC22215f.f39074a.getClass();
        androidx.compose.ui.i iVar = InterfaceC22215f.a.f39076b;
        r02.m(iVar, new C20636x(iVar, z12));
        androidx.compose.ui.i iVar2 = InterfaceC22215f.a.f39077c;
        r02.m(iVar2, new C20636x(iVar2, z12));
        androidx.compose.ui.i iVar3 = InterfaceC22215f.a.f39078d;
        r02.m(iVar3, new C20636x(iVar3, z12));
        androidx.compose.ui.i iVar4 = InterfaceC22215f.a.f39079e;
        r02.m(iVar4, new C20636x(iVar4, z12));
        androidx.compose.ui.i iVar5 = InterfaceC22215f.a.f39080f;
        r02.m(iVar5, new C20636x(iVar5, z12));
        androidx.compose.ui.i iVar6 = InterfaceC22215f.a.f39081g;
        r02.m(iVar6, new C20636x(iVar6, z12));
        androidx.compose.ui.i iVar7 = InterfaceC22215f.a.f39082h;
        r02.m(iVar7, new C20636x(iVar7, z12));
        androidx.compose.ui.i iVar8 = InterfaceC22215f.a.f39083i;
        r02.m(iVar8, new C20636x(iVar8, z12));
        androidx.compose.ui.i iVar9 = InterfaceC22215f.a.f39084j;
        r02.m(iVar9, new C20636x(iVar9, z12));
        return r02;
    }

    @kotlin.X
    @Y61.k
    public static final InterfaceC22365i0 d(@Y61.k InterfaceC22215f interfaceC22215f, boolean z12) {
        InterfaceC22365i0 interfaceC22365i0E = (z12 ? f28763a : f28764b).e(interfaceC22215f);
        return interfaceC22365i0E == null ? new C20636x(interfaceC22215f, z12) : interfaceC22365i0E;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    @androidx.compose.runtime.InterfaceC22132o
    @kotlin.X
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.layout.InterfaceC22365i0 e(@Y61.k androidx.compose.ui.i r5, boolean r6, @Y61.l androidx.compose.runtime.A r7, int r8) {
        /*
            androidx.compose.ui.f$a r0 = androidx.compose.ui.InterfaceC22215f.f39074a
            r0.getClass()
            androidx.compose.ui.i r0 = androidx.compose.ui.InterfaceC22215f.a.f39076b
            boolean r0 = kotlin.jvm.internal.L.f(r5, r0)
            if (r0 == 0) goto L1b
            if (r6 != 0) goto L1b
            r5 = -1709785313(0xffffffff9a16bf1f, float:-3.117366E-23)
            r7.C(r5)
            r7.h()
            androidx.compose.ui.layout.i0 r5 = androidx.compose.foundation.layout.C20632w.f28765c
            goto L69
        L1b:
            r0 = -1709737635(0xffffffff9a17795d, float:-3.1324105E-23)
            r7.C(r0)
            r0 = r8 & 14
            r0 = r0 ^ 6
            r1 = 0
            r2 = 1
            r3 = 4
            if (r0 <= r3) goto L30
            boolean r0 = r7.B(r5)
            if (r0 != 0) goto L34
        L30:
            r0 = r8 & 6
            if (r0 != r3) goto L36
        L34:
            r0 = r2
            goto L37
        L36:
            r0 = r1
        L37:
            r3 = r8 & 112(0x70, float:1.57E-43)
            r3 = r3 ^ 48
            r4 = 32
            if (r3 <= r4) goto L45
            boolean r3 = r7.j(r6)
            if (r3 != 0) goto L49
        L45:
            r8 = r8 & 48
            if (r8 != r4) goto L4a
        L49:
            r1 = r2
        L4a:
            r8 = r0 | r1
            java.lang.Object r0 = r7.t()
            if (r8 != 0) goto L5b
            androidx.compose.runtime.A$a r8 = androidx.compose.runtime.A.f37866a
            r8.getClass()
            androidx.compose.runtime.A$a$a r8 = androidx.compose.runtime.A.a.f37868b
            if (r0 != r8) goto L63
        L5b:
            androidx.compose.foundation.layout.x r0 = new androidx.compose.foundation.layout.x
            r0.<init>(r5, r6)
            r7.H(r0)
        L63:
            r5 = r0
            androidx.compose.foundation.layout.x r5 = (androidx.compose.foundation.layout.C20636x) r5
            r7.h()
        L69:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.C20632w.e(androidx.compose.ui.i, boolean, androidx.compose.runtime.A, int):androidx.compose.ui.layout.i0");
    }
}
