package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.C42906y;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42850c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42883l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.i0;
import kotlin.reflect.jvm.internal.impl.types.A0;
import kotlin.reflect.jvm.internal.impl.types.C42993s;
import kotlin.reflect.jvm.internal.impl.types.C42996v;
import kotlin.reflect.jvm.internal.impl.types.E0;
import kotlin.reflect.jvm.internal.impl.types.G0;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.i;
import kotlin.reflect.jvm.internal.impl.types.q0;

/* compiled from: LazySubstitutingClassDescriptor.java */
/* loaded from: classes8.dex */
public class z extends A {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f407763i = 0;

    /* renamed from: c, reason: collision with root package name */
    public final A f407764c;

    /* renamed from: d, reason: collision with root package name */
    public final E0 f407765d;

    /* renamed from: e, reason: collision with root package name */
    public E0 f407766e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f407767f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f407768g;

    /* renamed from: h, reason: collision with root package name */
    public C42993s f407769h;

    /* compiled from: LazySubstitutingClassDescriptor.java */
    public class a implements Y41.l<g0, Boolean> {
        @Override // Y41.l
        public final Boolean invoke(g0 g0Var) {
            return Boolean.valueOf(!g0Var.u());
        }
    }

    /* compiled from: LazySubstitutingClassDescriptor.java */
    public class b implements Y41.l<kotlin.reflect.jvm.internal.impl.types.Y, kotlin.reflect.jvm.internal.impl.types.Y> {
        public b() {
        }

        @Override // Y41.l
        public final kotlin.reflect.jvm.internal.impl.types.Y invoke(kotlin.reflect.jvm.internal.impl.types.Y y12) {
            kotlin.reflect.jvm.internal.impl.types.Y y13 = y12;
            z zVar = z.this;
            if (y13 != null) {
                return zVar.f407765d.f410010a.e() ? y13 : (kotlin.reflect.jvm.internal.impl.types.Y) zVar.n0().j(y13, Variance.f410069d);
            }
            int i12 = z.f407763i;
            zVar.getClass();
            return y13;
        }
    }

    public z(A a12, E0 e02) {
        this.f407764c = a12;
        this.f407765d = e02;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void U(int r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.z.U(int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    public final <R, D> R A(InterfaceC42884m<R, D> interfaceC42884m, D d12) {
        return (R) interfaceC42884m.i(this, d12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final Collection<InterfaceC42850c> G() {
        Collection<InterfaceC42850c> collectionG = this.f407764c.G();
        ArrayList arrayList = new ArrayList(collectionG.size());
        for (InterfaceC42850c interfaceC42850c : collectionG) {
            arrayList.add(((InterfaceC42850c) interfaceC42850c.m0().l(interfaceC42850c.n0()).p(interfaceC42850c.i()).j(interfaceC42850c.getVisibility()).q(interfaceC42850c.getKind()).i().build()).b(n0()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.l
    public final i0<kotlin.reflect.jvm.internal.impl.types.Y> I() {
        i0<kotlin.reflect.jvm.internal.impl.types.Y> i0VarI = this.f407764c.I();
        if (i0VarI == null) {
            return null;
        }
        b bVar = new b();
        if (i0VarI instanceof C42906y) {
            C42906y c42906y = (C42906y) i0VarI;
            return new C42906y(c42906y.f407881a, (u51.i) bVar.invoke(c42906y.f407882b));
        }
        if (!(i0VarI instanceof kotlin.reflect.jvm.internal.impl.descriptors.F)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList<kotlin.Q> arrayList = ((kotlin.reflect.jvm.internal.impl.descriptors.F) i0VarI).f407422a;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        for (kotlin.Q q12 : arrayList) {
            arrayList2.add(new kotlin.Q((kotlin.reflect.jvm.internal.impl.name.f) q12.f406619b, bVar.invoke((u51.i) q12.f406620c)));
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.F(arrayList2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.A
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j L(@Y61.k A0 a02, @Y61.k kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        if (iVar == null) {
            U(6);
            throw null;
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVarL = this.f407764c.L(a02, iVar);
        if (!this.f407765d.f410010a.e()) {
            return new kotlin.reflect.jvm.internal.impl.resolve.scopes.q(jVarL, n0());
        }
        if (jVarL != null) {
            return jVarL;
        }
        U(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean M() {
        return this.f407764c.M();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.A
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j N(@Y61.k kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        if (iVar == null) {
            U(13);
            throw null;
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVarN = this.f407764c.N(iVar);
        if (!this.f407765d.f410010a.e()) {
            return new kotlin.reflect.jvm.internal.impl.resolve.scopes.q(jVarN, n0());
        }
        if (jVarN != null) {
            return jVarN;
        }
        U(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean O() {
        return this.f407764c.O();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j P() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVarP = this.f407764c.P();
        if (jVarP != null) {
            return jVarP;
        }
        U(15);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j R(@Y61.k A0 a02) {
        kotlin.reflect.jvm.internal.impl.descriptors.E eD2 = kotlin.reflect.jvm.internal.impl.resolve.j.d(this);
        int i12 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f409615a;
        return L(a02, i.a.f410099a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean W() {
        return this.f407764c.W();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42854g
    public final boolean Y() {
        return this.f407764c.Y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0, kotlin.reflect.jvm.internal.impl.descriptors.m0
    @Y61.k
    public final InterfaceC42883l b(@Y61.k E0 e02) {
        if (e02 != null) {
            return e02.f410010a.e() ? this : new z(this, E0.f(e02.g(), n0().g()));
        }
        U(23);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42885n
    @Y61.k
    public final b0 e() {
        b0 b0Var = b0.f407539a;
        if (b0Var != null) {
            return b0Var;
        }
        U(29);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    public final InterfaceC42882k f() {
        InterfaceC42882k interfaceC42882kF = this.f407764c.f();
        if (interfaceC42882kF != null) {
            return interfaceC42882kF;
        }
        U(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j f0() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVarF0 = this.f407764c.f0();
        if (jVarF0 != null) {
            return jVarF0;
        }
        U(28);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j g0() {
        kotlin.reflect.jvm.internal.impl.descriptors.E eD2 = kotlin.reflect.jvm.internal.impl.resolve.j.d(this.f407764c);
        int i12 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f409615a;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVarN = N(i.a.f410099a);
        if (jVarN != null) {
            return jVarN;
        }
        U(12);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = this.f407764c.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        U(19);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final ClassKind getKind() {
        ClassKind kind = this.f407764c.getKind();
        if (kind != null) {
            return kind;
        }
        U(25);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.G
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.f getName() {
        kotlin.reflect.jvm.internal.impl.name.f name = this.f407764c.getName();
        if (name != null) {
            return name;
        }
        U(20);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42886o, kotlin.reflect.jvm.internal.impl.descriptors.B
    @Y61.k
    public final AbstractC42900s getVisibility() {
        AbstractC42900s visibility = this.f407764c.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        U(27);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d, kotlin.reflect.jvm.internal.impl.descriptors.B
    @Y61.k
    public final Modality i() {
        Modality modalityI = this.f407764c.i();
        if (modalityI != null) {
            return modalityI;
        }
        U(26);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean isExternal() {
        return this.f407764c.isExternal();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean isInline() {
        return this.f407764c.isInline();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f
    @Y61.k
    public final q0 l() {
        q0 q0VarL = this.f407764c.l();
        if (this.f407765d.f410010a.e()) {
            if (q0VarL != null) {
                return q0VarL;
            }
            U(0);
            throw null;
        }
        if (this.f407769h == null) {
            E0 e0N0 = n0();
            Collection<kotlin.reflect.jvm.internal.impl.types.O> collectionC = q0VarL.C();
            ArrayList arrayList = new ArrayList(collectionC.size());
            Iterator<kotlin.reflect.jvm.internal.impl.types.O> it = collectionC.iterator();
            while (it.hasNext()) {
                arrayList.add(e0N0.j(it.next(), Variance.f410069d));
            }
            this.f407769h = new C42993s(this, this.f407767f, arrayList, kotlin.reflect.jvm.internal.impl.storage.f.f409976e);
        }
        C42993s c42993s = this.f407769h;
        if (c42993s != null) {
            return c42993s;
        }
        U(1);
        throw null;
    }

    public final E0 n0() {
        if (this.f407766e == null) {
            E0 e02 = this.f407765d;
            if (e02.f410010a.e()) {
                this.f407766e = e02;
            } else {
                List<g0> parameters = this.f407764c.l().getParameters();
                this.f407767f = new ArrayList(parameters.size());
                this.f407766e = kotlin.reflect.jvm.internal.impl.types.A.b(parameters, e02.g(), this, this.f407767f);
                this.f407768g = C42745f0.A(this.f407767f, new a());
            }
        }
        return this.f407766e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.X p0() {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.types.Y q() {
        return kotlin.reflect.jvm.internal.impl.types.P.f(G0.e(l().getParameters()), g0(), C42996v.f410262a.a(getAnnotations()), l(), false);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final Collection<InterfaceC42851d> q0() {
        Collection<InterfaceC42851d> collectionQ0 = this.f407764c.q0();
        if (collectionQ0 != null) {
            return collectionQ0;
        }
        U(31);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42854g
    @Y61.k
    public final List<g0> r() {
        n0();
        ArrayList arrayList = this.f407768g;
        if (arrayList != null) {
            return arrayList;
        }
        U(30);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.l
    public final InterfaceC42850c t() {
        return this.f407764c.t();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean t0() {
        return this.f407764c.t0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.X> u0() {
        List<kotlin.reflect.jvm.internal.impl.descriptors.X> listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        U(17);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean v0() {
        return this.f407764c.v0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean w0() {
        return this.f407764c.w0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final InterfaceC42851d x0() {
        return this.f407764c.x0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.A, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    /* renamed from: a */
    public final InterfaceC42851d n0() {
        InterfaceC42851d interfaceC42851dN0 = this.f407764c.n0();
        if (interfaceC42851dN0 != null) {
            return interfaceC42851dN0;
        }
        U(21);
        throw null;
    }
}
