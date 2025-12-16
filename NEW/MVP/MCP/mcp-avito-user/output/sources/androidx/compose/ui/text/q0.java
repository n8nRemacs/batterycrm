package androidx.compose.ui.text;

import androidx.collection.C20212g0;
import androidx.compose.runtime.H0;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.u;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextMeasurer.kt */
@H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/q0;", "", "a", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f42616e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final E.b f42617a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.unit.d f42618b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LayoutDirection f42619c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final m0 f42620d;

    /* compiled from: TextMeasurer.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/q0$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public q0(@Y61.k E.b bVar, @Y61.k androidx.compose.ui.unit.d dVar, @Y61.k LayoutDirection layoutDirection, int i12) {
        this.f42617a = bVar;
        this.f42618b = dVar;
        this.f42619c = layoutDirection;
        this.f42620d = i12 > 0 ? new m0(i12) : null;
    }

    public static o0 a(q0 q0Var, String str, x0 x0Var, long j12, int i12) {
        androidx.compose.ui.text.style.s.f42720b.getClass();
        int i13 = androidx.compose.ui.text.style.s.f42721c;
        long jB2 = (i12 & 32) != 0 ? C22713c.b(0, 0, 15) : j12;
        LayoutDirection layoutDirection = q0Var.f42619c;
        androidx.compose.ui.unit.d dVar = q0Var.f42618b;
        E.b bVar = q0Var.f42617a;
        q0Var.getClass();
        return b(q0Var, new C22602e(str, null, 2, null), x0Var, i13, true, Integer.MAX_VALUE, jB2, layoutDirection, dVar, bVar, 32);
    }

    public static o0 b(q0 q0Var, C22602e c22602e, x0 x0Var, int i12, boolean z12, int i13, long j12, LayoutDirection layoutDirection, androidx.compose.ui.unit.d dVar, E.b bVar, int i14) {
        int i15;
        o0 o0Var;
        if ((i14 & 4) != 0) {
            androidx.compose.ui.text.style.s.f42720b.getClass();
            i15 = androidx.compose.ui.text.style.s.f42721c;
        } else {
            i15 = i12;
        }
        boolean z13 = (i14 & 8) != 0 ? true : z12;
        int iJ2 = Integer.MAX_VALUE;
        int i16 = (i14 & 16) != 0 ? Integer.MAX_VALUE : i13;
        C42784z0 c42784z0 = C42784z0.f406748b;
        long jB2 = (i14 & 64) != 0 ? C22713c.b(0, 0, 15) : j12;
        LayoutDirection layoutDirection2 = (i14 & 128) != 0 ? q0Var.f42619c : layoutDirection;
        androidx.compose.ui.unit.d dVar2 = (i14 & 256) != 0 ? q0Var.f42618b : dVar;
        E.b bVar2 = (i14 & 512) != 0 ? q0Var.f42617a : bVar;
        q0Var.getClass();
        long j13 = jB2;
        n0 n0Var = new n0(c22602e, x0Var, c42784z0, i16, z13, i15, dVar2, layoutDirection2, bVar2, j13, (C42822w) null);
        o0 o0Var2 = null;
        m0 m0Var = q0Var.f42620d;
        if (m0Var != null) {
            C22671s c22671s = new C22671s(n0Var);
            C20212g0<C22671s, o0> c20212g0 = m0Var.f42503a;
            if (c20212g0 != null) {
                o0Var = c20212g0.get(c22671s);
            } else if (kotlin.jvm.internal.L.f(m0Var.f42504b, c22671s)) {
                o0Var = m0Var.f42505c;
            }
            if (o0Var != null && !o0Var.f42527b.f41916a.b()) {
                o0Var2 = o0Var;
            }
        }
        if (o0Var2 != null) {
            int iB2 = Q.b(o0Var2.f42527b.f41919d);
            long jB3 = Q.b(r0.f41920e) & 4294967295L;
            u.a aVar = androidx.compose.ui.unit.u.f42871b;
            return new o0(n0Var, o0Var2.f42527b, C22713c.d(j13, jB3 | (iB2 << 32)), null);
        }
        f42616e.getClass();
        H h12 = new H(n0Var.f42506a, y0.b(n0Var.f42507b, n0Var.f42513h), n0Var.f42508c, n0Var.f42512g, n0Var.f42514i);
        long j14 = n0Var.f42515j;
        int iL2 = C22712b.l(j14);
        int i17 = n0Var.f42511f;
        boolean z14 = n0Var.f42510e;
        if ((z14 || s0.a(i17)) && C22712b.f(j14)) {
            iJ2 = C22712b.j(j14);
        }
        int iG2 = iJ2;
        int i18 = (z14 || !s0.a(i17)) ? n0Var.f42509d : 1;
        if (iL2 != iG2) {
            iG2 = kotlin.ranges.s.g(Q.b(h12.a()), iL2, iG2);
        }
        C22712b.a aVar2 = C22712b.f42842b;
        int i19 = C22712b.i(j14);
        aVar2.getClass();
        long jCeil = ((int) Math.ceil(r3.f41920e)) & 4294967295L;
        u.a aVar3 = androidx.compose.ui.unit.u.f42871b;
        o0 o0Var3 = new o0(n0Var, new G(h12, C22712b.a.b(0, iG2, 0, i19), i18, n0Var.f42511f, (C42822w) null), C22713c.d(j14, jCeil | (((int) Math.ceil(r3.f41919d)) << 32)), null);
        if (m0Var != null) {
            C20212g0<C22671s, o0> c20212g02 = m0Var.f42503a;
            if (c20212g02 != null) {
                c20212g02.put(new C22671s(n0Var), o0Var3);
            } else {
                m0Var.f42504b = new C22671s(n0Var);
                m0Var.f42505c = o0Var3;
            }
        }
        return o0Var3;
    }

    public /* synthetic */ q0(E.b bVar, androidx.compose.ui.unit.d dVar, LayoutDirection layoutDirection, int i12, int i13, C42822w c42822w) {
        this(bVar, dVar, layoutDirection, (i13 & 8) != 0 ? 8 : i12);
    }
}
