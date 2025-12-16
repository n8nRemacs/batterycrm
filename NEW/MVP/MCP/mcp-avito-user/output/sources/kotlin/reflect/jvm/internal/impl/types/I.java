package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: flexibleTypes.kt */
@kotlin.jvm.internal.s0
/* loaded from: classes8.dex */
public final class I extends H implements InterfaceC42995u {

    /* compiled from: flexibleTypes.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    public final O J0(kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        return new I((Y) iVar.c(this.f410024c), (Y) iVar.c(this.f410025d));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.J0
    @Y61.k
    public final J0 L0(boolean z12) {
        return P.c(this.f410024c.L0(z12), this.f410025d.L0(z12));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.J0
    /* renamed from: M0 */
    public final J0 J0(kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        return new I((Y) iVar.c(this.f410024c), (Y) iVar.c(this.f410025d));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC42995u
    @Y61.k
    public final J0 N(@Y61.k O o12) {
        J0 j0C;
        J0 j0K0 = o12.K0();
        if (j0K0 instanceof H) {
            j0C = j0K0;
        } else {
            if (!(j0K0 instanceof Y)) {
                throw new NoWhenBranchMatchedException();
            }
            Y y12 = (Y) j0K0;
            j0C = P.c(y12, y12.L0(true));
        }
        return I0.b(j0C, I0.a(j0K0));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.J0
    @Y61.k
    public final J0 N0(@Y61.k n0 n0Var) {
        return P.c(this.f410024c.N0(n0Var), this.f410025d.N0(n0Var));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.H
    @Y61.k
    public final Y O0() {
        return this.f410024c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.H
    @Y61.k
    public final String P0(@Y61.k kotlin.reflect.jvm.internal.impl.renderer.c cVar, @Y61.k kotlin.reflect.jvm.internal.impl.renderer.c cVar2) {
        boolean zP2 = cVar2.f409484e.p();
        Y y12 = this.f410025d;
        Y y13 = this.f410024c;
        if (!zP2) {
            return cVar.G(cVar.Y(y13), cVar.Y(y12), H0().m());
        }
        return "(" + cVar.Y(y13) + ".." + cVar.Y(y12) + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC42995u
    public final boolean U() {
        Y y12 = this.f410024c;
        return (y12.H0().b() instanceof kotlin.reflect.jvm.internal.impl.descriptors.g0) && kotlin.jvm.internal.L.f(y12.H0(), this.f410025d.H0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.H
    @Y61.k
    public final String toString() {
        return "(" + this.f410024c + ".." + this.f410025d + ')';
    }
}
