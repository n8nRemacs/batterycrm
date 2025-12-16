package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.b1;
import kotlin.jvm.internal.C42822w;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;

/* compiled from: TypeParameterUpperBoundEraser.kt */
@kotlin.jvm.internal.s0
/* loaded from: classes8.dex */
public final class u0 {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f410255e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final E f410256a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final t0 f410257b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f410258c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.i<b, O> f410259d;

    /* compiled from: TypeParameterUpperBoundEraser.kt */
    @kotlin.jvm.internal.s0
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TypeParameterUpperBoundEraser.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.descriptors.g0 f410260a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final F f410261b;

        public b(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var, @Y61.k F f12) {
            this.f410260a = g0Var;
            this.f410261b = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.L.f(bVar.f410260a, this.f410260a) && kotlin.jvm.internal.L.f(bVar.f410261b, this.f410261b);
        }

        public final int hashCode() {
            int iHashCode = this.f410260a.hashCode();
            return this.f410261b.hashCode() + (iHashCode * 31) + iHashCode;
        }

        @Y61.k
        public final String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f410260a + ", typeAttr=" + this.f410261b + ')';
        }
    }

    public u0(E e12, t0 t0Var, int i12, C42822w c42822w) {
        t0Var = (i12 & 2) != 0 ? new t0() : t0Var;
        this.f410256a = e12;
        this.f410257b = t0Var;
        kotlin.reflect.jvm.internal.impl.storage.f fVar = new kotlin.reflect.jvm.internal.impl.storage.f("Type parameter upper bound erasure results");
        this.f410258c = C42727D.c(new v0(this));
        this.f410259d = fVar.c(new w0(this));
    }

    public final J0 a(F f12) {
        J0 j0J;
        Y yA2 = f12.a();
        return (yA2 == null || (j0J = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.j(yA2)) == null) ? (kotlin.reflect.jvm.internal.impl.types.error.f) this.f410258c.getValue() : j0J;
    }

    @Y61.k
    public final O b(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var, @Y61.k F f12) {
        return this.f410259d.invoke(new b(g0Var, f12));
    }

    public final kotlin.collections.builders.j c(E0 e02, List list, F f12) {
        J0 j0D;
        kotlin.collections.builders.j jVar = new kotlin.collections.builders.j();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            O o12 = (O) it.next();
            InterfaceC42853f interfaceC42853fB = o12.H0().b();
            boolean z12 = interfaceC42853fB instanceof InterfaceC42851d;
            t0 t0Var = this.f410257b;
            if (z12) {
                Set<kotlin.reflect.jvm.internal.impl.descriptors.g0> setC = f12.c();
                t0Var.getClass();
                f410255e.getClass();
                J0 j0K0 = o12.K0();
                if (j0K0 instanceof H) {
                    H h12 = (H) j0K0;
                    Y yD2 = h12.f410024c;
                    if (!yD2.H0().getParameters().isEmpty() && yD2.H0().b() != null) {
                        List<kotlin.reflect.jvm.internal.impl.descriptors.g0> parameters = yD2.H0().getParameters();
                        ArrayList arrayList = new ArrayList(C42745f0.q(parameters, 10));
                        for (kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var : parameters) {
                            x0 c42974e0 = (x0) C42745f0.K(g0Var.getIndex(), o12.F0());
                            boolean z13 = setC != null && setC.contains(g0Var);
                            if (c42974e0 == null || z13 || e02.g().d(c42974e0.getType()) == null) {
                                c42974e0 = new C42974e0(g0Var);
                            }
                            arrayList.add(c42974e0);
                        }
                        yD2 = C0.d(yD2, arrayList, null, 2);
                    }
                    Y yD3 = h12.f410025d;
                    if (!yD3.H0().getParameters().isEmpty() && yD3.H0().b() != null) {
                        List<kotlin.reflect.jvm.internal.impl.descriptors.g0> parameters2 = yD3.H0().getParameters();
                        ArrayList arrayList2 = new ArrayList(C42745f0.q(parameters2, 10));
                        for (kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var2 : parameters2) {
                            x0 c42974e02 = (x0) C42745f0.K(g0Var2.getIndex(), o12.F0());
                            boolean z14 = setC != null && setC.contains(g0Var2);
                            if (c42974e02 == null || z14 || e02.g().d(c42974e02.getType()) == null) {
                                c42974e02 = new C42974e0(g0Var2);
                            }
                            arrayList2.add(c42974e02);
                        }
                        yD3 = C0.d(yD3, arrayList2, null, 2);
                    }
                    j0D = P.c(yD2, yD3);
                } else {
                    if (!(j0K0 instanceof Y)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Y y12 = (Y) j0K0;
                    if (y12.H0().getParameters().isEmpty() || y12.H0().b() == null) {
                        j0D = y12;
                    } else {
                        List<kotlin.reflect.jvm.internal.impl.descriptors.g0> parameters3 = y12.H0().getParameters();
                        ArrayList arrayList3 = new ArrayList(C42745f0.q(parameters3, 10));
                        for (kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var3 : parameters3) {
                            x0 c42974e03 = (x0) C42745f0.K(g0Var3.getIndex(), o12.F0());
                            boolean z15 = setC != null && setC.contains(g0Var3);
                            if (c42974e03 == null || z15 || e02.g().d(c42974e03.getType()) == null) {
                                c42974e03 = new C42974e0(g0Var3);
                            }
                            arrayList3.add(c42974e03);
                        }
                        j0D = C0.d(y12, arrayList3, null, 2);
                    }
                }
                jVar.add(e02.h(I0.b(j0D, I0.a(j0K0)), Variance.f410071f));
            } else if (interfaceC42853fB instanceof kotlin.reflect.jvm.internal.impl.descriptors.g0) {
                Set<kotlin.reflect.jvm.internal.impl.descriptors.g0> setC2 = f12.c();
                if (setC2 == null || !setC2.contains(interfaceC42853fB)) {
                    jVar.addAll(c(e02, ((kotlin.reflect.jvm.internal.impl.descriptors.g0) interfaceC42853fB).getUpperBounds(), f12));
                } else {
                    jVar.add(a(f12));
                }
            }
            t0Var.getClass();
        }
        return b1.a(jVar);
    }
}
