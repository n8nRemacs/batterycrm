package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.InterfaceC22391w;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Size.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/layout/o2;", "Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/unit/h;", "minWidth", "minHeight", "maxWidth", "maxHeight", "", "enforceIncoming", "<init>", "(FFFFZLkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.o2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20604o2 extends v.d implements androidx.compose.ui.node.K {

    /* renamed from: p, reason: collision with root package name */
    public float f28695p;

    /* renamed from: q, reason: collision with root package name */
    public float f28696q;

    /* renamed from: r, reason: collision with root package name */
    public float f28697r;

    /* renamed from: s, reason: collision with root package name */
    public float f28698s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f28699t;

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.o2$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f28700l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.layout.K0 k02) {
            super(1);
            this.f28700l = k02;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            aVar.h(this.f28700l, 0, 0, 0.0f);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20604o2(float f12, float f13, float f14, float f15, boolean z12, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            f12 = androidx.compose.ui.unit.h.f42851e;
        }
        float f16 = f12;
        if ((i12 & 2) != 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            f13 = androidx.compose.ui.unit.h.f42851e;
        }
        float f17 = f13;
        if ((i12 & 4) != 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            f14 = androidx.compose.ui.unit.h.f42851e;
        }
        float f18 = f14;
        if ((i12 & 8) != 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            f15 = androidx.compose.ui.unit.h.f42851e;
        }
        this(f16, f17, f18, f15, z12, null);
    }

    @Override // androidx.compose.ui.node.K
    public final int A(@Y61.k androidx.compose.ui.node.X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        long jK2 = k2(x12);
        if (C22712b.g(jK2)) {
            return C22712b.i(jK2);
        }
        if (!this.f28699t) {
            i12 = C22713c.g(i12, jK2);
        }
        return C22713c.f(interfaceC22391w.R(i12), jK2);
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        int iL2;
        int iJ2;
        int iK2;
        int i12;
        long jA2;
        long jK2 = k2(interfaceC22369k0);
        if (this.f28699t) {
            jA2 = C22713c.e(j12, jK2);
        } else {
            if (Float.isNaN(this.f28695p)) {
                iL2 = C22712b.l(j12);
                int iJ3 = C22712b.j(jK2);
                if (iL2 > iJ3) {
                    iL2 = iJ3;
                }
            } else {
                iL2 = C22712b.l(jK2);
            }
            if (Float.isNaN(this.f28697r)) {
                iJ2 = C22712b.j(j12);
                int iL3 = C22712b.l(jK2);
                if (iJ2 < iL3) {
                    iJ2 = iL3;
                }
            } else {
                iJ2 = C22712b.j(jK2);
            }
            if (Float.isNaN(this.f28696q)) {
                iK2 = C22712b.k(j12);
                int i13 = C22712b.i(jK2);
                if (iK2 > i13) {
                    iK2 = i13;
                }
            } else {
                iK2 = C22712b.k(jK2);
            }
            if (Float.isNaN(this.f28698s)) {
                i12 = C22712b.i(j12);
                int iK3 = C22712b.k(jK2);
                if (i12 < iK3) {
                    i12 = iK3;
                }
            } else {
                i12 = C22712b.i(jK2);
            }
            jA2 = C22713c.a(iL2, iJ2, iK2, i12);
        }
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(jA2);
        return interfaceC22369k0.L0(k0I.f40345b, k0I.f40346c, kotlin.collections.P0.c(), new a(k0I));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long k2(androidx.compose.ui.layout.InterfaceC22393x r7) {
        /*
            r6 = this;
            float r0 = r6.f28697r
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.f28697r
            int r0 = r7.y0(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.f28698s
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.f28698s
            int r3 = r7.y0(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.f28695p
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.f28695p
            int r4 = r7.y0(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.f28696q
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r5 = r6.f28696q
            int r7 = r7.y0(r5)
            if (r7 >= 0) goto L53
            r7 = r2
        L53:
            if (r7 <= r3) goto L56
            r7 = r3
        L56:
            if (r7 == r1) goto L59
            r2 = r7
        L59:
            long r0 = androidx.compose.ui.unit.C22713c.a(r4, r0, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.C20604o2.k2(androidx.compose.ui.layout.x):long");
    }

    @Override // androidx.compose.ui.node.K
    public final int m(@Y61.k androidx.compose.ui.node.X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        long jK2 = k2(x12);
        if (C22712b.h(jK2)) {
            return C22712b.j(jK2);
        }
        if (!this.f28699t) {
            i12 = C22713c.f(i12, jK2);
        }
        return C22713c.g(interfaceC22391w.G(i12), jK2);
    }

    @Override // androidx.compose.ui.node.K
    public final int x(@Y61.k androidx.compose.ui.node.X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        long jK2 = k2(x12);
        if (C22712b.g(jK2)) {
            return C22712b.i(jK2);
        }
        if (!this.f28699t) {
            i12 = C22713c.g(i12, jK2);
        }
        return C22713c.f(interfaceC22391w.X(i12), jK2);
    }

    @Override // androidx.compose.ui.node.K
    public final int z(@Y61.k androidx.compose.ui.node.X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        long jK2 = k2(x12);
        if (C22712b.h(jK2)) {
            return C22712b.j(jK2);
        }
        if (!this.f28699t) {
            i12 = C22713c.f(i12, jK2);
        }
        return C22713c.g(interfaceC22391w.b0(i12), jK2);
    }

    public C20604o2(float f12, float f13, float f14, float f15, boolean z12, C42822w c42822w) {
        this.f28695p = f12;
        this.f28696q = f13;
        this.f28697r = f14;
        this.f28698s = f15;
        this.f28699t = z12;
    }
}
