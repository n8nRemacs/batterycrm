package androidx.compose.foundation;

import androidx.compose.foundation.gestures.InterfaceC20432a1;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.C22032b0;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.C22417j;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.InterfaceC22415i;
import androidx.compose.ui.node.InterfaceC22419k;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* compiled from: ScrollingContainer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/f2;", "Landroidx/compose/ui/node/n;", "Landroidx/compose/ui/node/i;", "Landroidx/compose/ui/node/D0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class f2 extends AbstractC22425n implements InterfaceC22415i, androidx.compose.ui.node.D0 {

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public androidx.compose.foundation.gestures.O1 f27143A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public InterfaceC22419k f27144B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public N1 f27145C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public M1 f27146D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f27147E;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public androidx.compose.foundation.gestures.U1 f27148r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public Orientation f27149s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f27150t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f27151u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public InterfaceC20432a1 f27152v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public androidx.compose.foundation.interaction.m f27153w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public androidx.compose.foundation.gestures.J f27154x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f27155y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public M1 f27156z;

    /* compiled from: ScrollingContainer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C22032b0 c22032b0 = O1.f26808a;
            f2 f2Var = f2.this;
            N1 n12 = (N1) C22417j.a(f2Var, c22032b0);
            f2Var.f27145C = n12;
            f2Var.f27146D = n12 != null ? n12.a() : null;
            return kotlin.G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC22419k
    public final void H1() {
        boolean zP2 = p2();
        if (this.f27147E != zP2) {
            this.f27147E = zP2;
            androidx.compose.foundation.gestures.U1 u12 = this.f27148r;
            Orientation orientation = this.f27149s;
            boolean z12 = this.f27155y;
            M1 m1O2 = o2();
            boolean z13 = this.f27150t;
            boolean z14 = this.f27151u;
            q2(m1O2, this.f27154x, this.f27152v, orientation, u12, this.f27153w, z12, z13, z14);
        }
    }

    @Override // androidx.compose.ui.node.D0
    public final void K1() {
        N1 n12 = (N1) C22417j.a(this, O1.f26808a);
        if (kotlin.jvm.internal.L.f(n12, this.f27145C)) {
            return;
        }
        this.f27145C = n12;
        this.f27146D = null;
        InterfaceC22419k interfaceC22419k = this.f27144B;
        if (interfaceC22419k != null) {
            l2(interfaceC22419k);
        }
        this.f27144B = null;
        n2();
        androidx.compose.foundation.gestures.O1 o12 = this.f27143A;
        if (o12 != null) {
            androidx.compose.foundation.gestures.U1 u12 = this.f27148r;
            Orientation orientation = this.f27149s;
            M1 m1O2 = o2();
            boolean z12 = this.f27150t;
            boolean z13 = this.f27147E;
            o12.w2(m1O2, this.f27154x, this.f27152v, orientation, u12, this.f27153w, z12, z13);
        }
    }

    @Override // androidx.compose.ui.v.d
    /* renamed from: Z1 */
    public final boolean getF40330q() {
        return false;
    }

    @Override // androidx.compose.ui.v.d
    public final void c2() {
        this.f27147E = p2();
        n2();
        if (this.f27143A == null) {
            androidx.compose.foundation.gestures.U1 u12 = this.f27148r;
            M1 m1O2 = o2();
            InterfaceC20432a1 interfaceC20432a1 = this.f27152v;
            Orientation orientation = this.f27149s;
            boolean z12 = this.f27150t;
            boolean z13 = this.f27147E;
            androidx.compose.foundation.gestures.O1 o12 = new androidx.compose.foundation.gestures.O1(m1O2, this.f27154x, interfaceC20432a1, orientation, u12, this.f27153w, z12, z13);
            k2(o12);
            this.f27143A = o12;
        }
    }

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        InterfaceC22419k interfaceC22419k = this.f27144B;
        if (interfaceC22419k != null) {
            l2(interfaceC22419k);
        }
    }

    public final void n2() {
        InterfaceC22419k interfaceC22419k = this.f27144B;
        if (interfaceC22419k != null) {
            if (interfaceC22419k.getF42880b().f42893o) {
                return;
            }
            k2(interfaceC22419k);
            return;
        }
        if (this.f27155y) {
            androidx.compose.ui.node.E0.a(this, new a());
        }
        M1 m1O2 = o2();
        if (m1O2 != null) {
            InterfaceC22419k interfaceC22419kN = m1O2.N();
            if (interfaceC22419kN.getF42880b().f42893o) {
                return;
            }
            k2(interfaceC22419kN);
            this.f27144B = interfaceC22419kN;
        }
    }

    @Y61.l
    public final M1 o2() {
        return this.f27155y ? this.f27146D : this.f27156z;
    }

    public final boolean p2() {
        LayoutDirection layoutDirection = LayoutDirection.f42838b;
        if (this.f42893o) {
            layoutDirection = C22421l.g(this).f40609C;
        }
        androidx.compose.foundation.gestures.J1 j12 = androidx.compose.foundation.gestures.J1.f27300a;
        Orientation orientation = this.f27149s;
        boolean z12 = this.f27151u;
        j12.getClass();
        return (layoutDirection != LayoutDirection.f42839c || orientation == Orientation.f27425b) ? !z12 : z12;
    }

    public final void q2(@Y61.l M1 m12, @Y61.l androidx.compose.foundation.gestures.J j12, @Y61.l InterfaceC20432a1 interfaceC20432a1, @Y61.k Orientation orientation, @Y61.k androidx.compose.foundation.gestures.U1 u12, @Y61.l androidx.compose.foundation.interaction.m mVar, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        this.f27148r = u12;
        this.f27149s = orientation;
        boolean z16 = true;
        if (this.f27155y != z12) {
            this.f27155y = z12;
            z15 = true;
        } else {
            z15 = false;
        }
        if (kotlin.jvm.internal.L.f(this.f27156z, m12)) {
            z16 = false;
        } else {
            this.f27156z = m12;
        }
        if (z15 || (z16 && !z12)) {
            InterfaceC22419k interfaceC22419k = this.f27144B;
            if (interfaceC22419k != null) {
                l2(interfaceC22419k);
            }
            this.f27144B = null;
            n2();
        }
        this.f27150t = z13;
        this.f27151u = z14;
        this.f27152v = interfaceC20432a1;
        this.f27153w = mVar;
        this.f27154x = j12;
        this.f27147E = p2();
        androidx.compose.foundation.gestures.O1 o12 = this.f27143A;
        if (o12 != null) {
            o12.w2(o2(), j12, interfaceC20432a1, orientation, u12, mVar, z13, this.f27147E);
        }
    }
}
