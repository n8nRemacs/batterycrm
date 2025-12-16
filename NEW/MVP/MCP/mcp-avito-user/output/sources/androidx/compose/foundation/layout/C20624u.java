package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC22391w;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.u;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: AspectRatio.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/u;", "Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/v$d;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20624u extends v.d implements androidx.compose.ui.node.K {

    /* renamed from: p, reason: collision with root package name */
    public float f28742p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f28743q;

    /* compiled from: AspectRatio.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.u$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f28744l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.layout.K0 k02) {
            super(1);
            this.f28744l = k02;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            aVar.h(this.f28744l, 0, 0, 0.0f);
            return kotlin.G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.node.K
    public final int A(@Y61.k androidx.compose.ui.node.X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return i12 != Integer.MAX_VALUE ? Math.round(i12 / this.f28742p) : interfaceC22391w.R(i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca  */
    @Override // androidx.compose.ui.node.K
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.layout.InterfaceC22367j0 f(@Y61.k androidx.compose.ui.layout.InterfaceC22369k0 r8, @Y61.k androidx.compose.ui.layout.InterfaceC22363h0 r9, long r10) {
        /*
            r7 = this;
            boolean r0 = r7.f28743q
            r1 = 0
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L6d
            long r5 = r7.l2(r10, r4)
            androidx.compose.ui.unit.u$a r0 = androidx.compose.ui.unit.u.f42871b
            r0.getClass()
            boolean r0 = androidx.compose.ui.unit.u.c(r5, r1)
            if (r0 != 0) goto L19
            goto Ld0
        L19:
            long r5 = r7.k2(r10, r4)
            boolean r0 = androidx.compose.ui.unit.u.c(r5, r1)
            if (r0 != 0) goto L25
            goto Ld0
        L25:
            long r5 = r7.n2(r10, r4)
            boolean r0 = androidx.compose.ui.unit.u.c(r5, r1)
            if (r0 != 0) goto L31
            goto Ld0
        L31:
            long r5 = r7.m2(r10, r4)
            boolean r0 = androidx.compose.ui.unit.u.c(r5, r1)
            if (r0 != 0) goto L3d
            goto Ld0
        L3d:
            long r5 = r7.l2(r10, r3)
            boolean r0 = androidx.compose.ui.unit.u.c(r5, r1)
            if (r0 != 0) goto L49
            goto Ld0
        L49:
            long r5 = r7.k2(r10, r3)
            boolean r0 = androidx.compose.ui.unit.u.c(r5, r1)
            if (r0 != 0) goto L55
            goto Ld0
        L55:
            long r5 = r7.n2(r10, r3)
            boolean r0 = androidx.compose.ui.unit.u.c(r5, r1)
            if (r0 != 0) goto L61
            goto Ld0
        L61:
            long r5 = r7.m2(r10, r3)
            boolean r0 = androidx.compose.ui.unit.u.c(r5, r1)
            if (r0 != 0) goto Lca
            goto Ld0
        L6d:
            long r5 = r7.k2(r10, r4)
            androidx.compose.ui.unit.u$a r0 = androidx.compose.ui.unit.u.f42871b
            r0.getClass()
            boolean r0 = androidx.compose.ui.unit.u.c(r5, r1)
            if (r0 != 0) goto L7d
            goto Ld0
        L7d:
            long r5 = r7.l2(r10, r4)
            boolean r0 = androidx.compose.ui.unit.u.c(r5, r1)
            if (r0 != 0) goto L88
            goto Ld0
        L88:
            long r5 = r7.m2(r10, r4)
            boolean r0 = androidx.compose.ui.unit.u.c(r5, r1)
            if (r0 != 0) goto L93
            goto Ld0
        L93:
            long r5 = r7.n2(r10, r4)
            boolean r0 = androidx.compose.ui.unit.u.c(r5, r1)
            if (r0 != 0) goto L9e
            goto Ld0
        L9e:
            long r5 = r7.k2(r10, r3)
            boolean r0 = androidx.compose.ui.unit.u.c(r5, r1)
            if (r0 != 0) goto La9
            goto Ld0
        La9:
            long r5 = r7.l2(r10, r3)
            boolean r0 = androidx.compose.ui.unit.u.c(r5, r1)
            if (r0 != 0) goto Lb4
            goto Ld0
        Lb4:
            long r5 = r7.m2(r10, r3)
            boolean r0 = androidx.compose.ui.unit.u.c(r5, r1)
            if (r0 != 0) goto Lbf
            goto Ld0
        Lbf:
            long r5 = r7.n2(r10, r3)
            boolean r0 = androidx.compose.ui.unit.u.c(r5, r1)
            if (r0 != 0) goto Lca
            goto Ld0
        Lca:
            androidx.compose.ui.unit.u$a r0 = androidx.compose.ui.unit.u.f42871b
            r0.getClass()
            r5 = r1
        Ld0:
            androidx.compose.ui.unit.u$a r0 = androidx.compose.ui.unit.u.f42871b
            r0.getClass()
            boolean r0 = androidx.compose.ui.unit.u.c(r5, r1)
            if (r0 != 0) goto Lf0
            androidx.compose.ui.unit.b$a r10 = androidx.compose.ui.unit.C22712b.f42842b
            r11 = 32
            long r0 = r5 >> r11
            int r11 = (int) r0
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r5
            int r0 = (int) r0
            r10.getClass()
            long r10 = androidx.compose.ui.unit.C22712b.a.c(r11, r0)
        Lf0:
            androidx.compose.ui.layout.K0 r9 = r9.I(r10)
            int r10 = r9.f40345b
            int r11 = r9.f40346c
            androidx.compose.foundation.layout.u$a r0 = new androidx.compose.foundation.layout.u$a
            r0.<init>(r9)
            androidx.compose.ui.layout.j0 r8 = androidx.compose.ui.layout.InterfaceC22369k0.q1(r8, r10, r11, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.C20624u.f(androidx.compose.ui.layout.k0, androidx.compose.ui.layout.h0, long):androidx.compose.ui.layout.j0");
    }

    public final long k2(long j12, boolean z12) {
        int iRound;
        int i12 = C22712b.i(j12);
        if (i12 == Integer.MAX_VALUE || (iRound = Math.round(i12 * this.f28742p)) <= 0 || (z12 && !C20620t.b(iRound, i12, j12))) {
            androidx.compose.ui.unit.u.f42871b.getClass();
            return 0L;
        }
        long j13 = (iRound << 32) | (i12 & 4294967295L);
        u.a aVar = androidx.compose.ui.unit.u.f42871b;
        return j13;
    }

    public final long l2(long j12, boolean z12) {
        int iRound;
        int iJ2 = C22712b.j(j12);
        if (iJ2 == Integer.MAX_VALUE || (iRound = Math.round(iJ2 / this.f28742p)) <= 0 || (z12 && !C20620t.b(iJ2, iRound, j12))) {
            androidx.compose.ui.unit.u.f42871b.getClass();
            return 0L;
        }
        long j13 = (iJ2 << 32) | (iRound & 4294967295L);
        u.a aVar = androidx.compose.ui.unit.u.f42871b;
        return j13;
    }

    @Override // androidx.compose.ui.node.K
    public final int m(@Y61.k androidx.compose.ui.node.X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return i12 != Integer.MAX_VALUE ? Math.round(i12 * this.f28742p) : interfaceC22391w.G(i12);
    }

    public final long m2(long j12, boolean z12) {
        int iK2 = C22712b.k(j12);
        int iRound = Math.round(iK2 * this.f28742p);
        if (iRound <= 0 || (z12 && !C20620t.b(iRound, iK2, j12))) {
            androidx.compose.ui.unit.u.f42871b.getClass();
            return 0L;
        }
        long j13 = (iRound << 32) | (iK2 & 4294967295L);
        u.a aVar = androidx.compose.ui.unit.u.f42871b;
        return j13;
    }

    public final long n2(long j12, boolean z12) {
        int iL2 = C22712b.l(j12);
        int iRound = Math.round(iL2 / this.f28742p);
        if (iRound <= 0 || (z12 && !C20620t.b(iL2, iRound, j12))) {
            androidx.compose.ui.unit.u.f42871b.getClass();
            return 0L;
        }
        long j13 = (iL2 << 32) | (iRound & 4294967295L);
        u.a aVar = androidx.compose.ui.unit.u.f42871b;
        return j13;
    }

    @Override // androidx.compose.ui.node.K
    public final int x(@Y61.k androidx.compose.ui.node.X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return i12 != Integer.MAX_VALUE ? Math.round(i12 / this.f28742p) : interfaceC22391w.X(i12);
    }

    @Override // androidx.compose.ui.node.K
    public final int z(@Y61.k androidx.compose.ui.node.X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return i12 != Integer.MAX_VALUE ? Math.round(i12 * this.f28742p) : interfaceC22391w.b0(i12);
    }
}
