package kotlin.reflect.jvm.internal.impl.builtins.functions;

import Y61.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.l;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.builtins.functions.e;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.C42904w;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42850c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42858b;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.U;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.j;
import kotlin.reflect.jvm.internal.impl.types.AbstractC42961b;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.P;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.checker.i;
import kotlin.reflect.jvm.internal.impl.types.n0;
import kotlin.reflect.jvm.internal.impl.types.q0;
import kotlin.reflect.jvm.internal.impl.types.z0;
import x51.C49773a;

/* compiled from: FunctionClassDescriptor.kt */
@s0
/* loaded from: classes8.dex */
public final class b extends AbstractC42858b {

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final kotlin.reflect.jvm.internal.impl.name.b f407202n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final kotlin.reflect.jvm.internal.impl.name.b f407203o;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final kotlin.reflect.jvm.internal.impl.storage.f f407204g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final kotlin.reflect.jvm.internal.impl.builtins.b f407205h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final e f407206i;

    /* renamed from: j, reason: collision with root package name */
    public final int f407207j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final C11649b f407208k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final c f407209l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final List<g0> f407210m;

    /* compiled from: FunctionClassDescriptor.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FunctionClassDescriptor.kt */
    @s0
    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.functions.b$b, reason: collision with other inner class name */
    public final class C11649b extends AbstractC42961b {
        public C11649b() {
            super(b.this.f407204g);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42961b, kotlin.reflect.jvm.internal.impl.types.q0
        public final InterfaceC42853f b() {
            return b.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.q0
        public final boolean c() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42983j
        @k
        public final Collection<O> e() {
            List listU;
            b bVar = b.this;
            e eVar = bVar.f407206i;
            e.a aVar = e.a.f407215c;
            if (L.f(eVar, aVar)) {
                listU = Collections.singletonList(b.f407202n);
            } else {
                boolean zF2 = L.f(eVar, e.b.f407216c);
                int i12 = bVar.f407207j;
                if (zF2) {
                    listU = C42745f0.U(b.f407203o, new kotlin.reflect.jvm.internal.impl.name.b(n.f407339l, aVar.a(i12)));
                } else {
                    e.d dVar = e.d.f407218c;
                    if (L.f(eVar, dVar)) {
                        listU = Collections.singletonList(b.f407202n);
                    } else {
                        if (!L.f(eVar, e.c.f407217c)) {
                            int i13 = C49773a.f442221a;
                            throw new IllegalStateException("should not be called");
                        }
                        listU = C42745f0.U(b.f407203o, new kotlin.reflect.jvm.internal.impl.name.b(n.f407333f, dVar.a(i12)));
                    }
                }
            }
            E eF2 = bVar.f407205h.f();
            List<kotlin.reflect.jvm.internal.impl.name.b> list = listU;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (kotlin.reflect.jvm.internal.impl.name.b bVar2 : list) {
                InterfaceC42851d interfaceC42851dA = C42904w.a(eF2, bVar2);
                if (interfaceC42851dA == null) {
                    throw new IllegalStateException(("Built-in class " + bVar2 + " not found").toString());
                }
                List listF0 = C42745f0.F0(interfaceC42851dA.l().getParameters().size(), bVar.f407210m);
                ArrayList arrayList2 = new ArrayList(C42745f0.q(listF0, 10));
                Iterator it = listF0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new z0(((g0) it.next()).q()));
                }
                n0.f410236c.getClass();
                n0 n0Var = n0.f410237d;
                P p12 = P.f410039a;
                arrayList.add(P.e(n0Var, interfaceC42851dA.l(), arrayList2, false, null));
            }
            return C42745f0.M0(arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.q0
        @k
        public final List<g0> getParameters() {
            return b.this.f407210m;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42983j
        @k
        public final e0 i() {
            return e0.a.f407541a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42961b
        /* renamed from: o */
        public final InterfaceC42851d b() {
            return b.this;
        }

        @k
        public final String toString() {
            return b.this.toString();
        }
    }

    static {
        new a(null);
        f407202n = new kotlin.reflect.jvm.internal.impl.name.b(n.f407339l, kotlin.reflect.jvm.internal.impl.name.f.e("Function"));
        f407203o = new kotlin.reflect.jvm.internal.impl.name.b(n.f407336i, kotlin.reflect.jvm.internal.impl.name.f.e("KFunction"));
    }

    public b(@k kotlin.reflect.jvm.internal.impl.storage.f fVar, @k kotlin.reflect.jvm.internal.impl.builtins.b bVar, @k e eVar, int i12) {
        super(fVar, eVar.a(i12));
        this.f407204g = fVar;
        this.f407205h = bVar;
        this.f407206i = eVar;
        this.f407207j = i12;
        this.f407208k = new C11649b();
        this.f407209l = new c(fVar, this);
        ArrayList arrayList = new ArrayList();
        l lVar = new l(1, i12, 1);
        ArrayList arrayList2 = new ArrayList(C42745f0.q(lVar, 10));
        kotlin.ranges.k it = lVar.iterator();
        while (it.f406910d) {
            int iA2 = it.a();
            Variance variance = Variance.f410070e;
            String strG = AK.c.g(iA2, "P");
            g.f407522s2.getClass();
            arrayList.add(U.I0(this, g.a.f407524b, variance, kotlin.reflect.jvm.internal.impl.name.f.e(strG), arrayList.size(), this.f407204g));
            arrayList2.add(G0.f406611a);
        }
        Variance variance2 = Variance.f410071f;
        g.f407522s2.getClass();
        arrayList.add(U.I0(this, g.a.f407524b, variance2, kotlin.reflect.jvm.internal.impl.name.f.e("R"), arrayList.size(), this.f407204g));
        this.f407210m = C42745f0.M0(arrayList);
        FunctionClassKind.a aVar = FunctionClassKind.f407197b;
        e eVar2 = this.f407206i;
        aVar.getClass();
        if (eVar2.equals(e.a.f407215c) || eVar2.equals(e.d.f407218c) || eVar2.equals(e.b.f407216c)) {
            return;
        }
        eVar2.equals(e.c.f407217c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final Collection G() {
        return C42784z0.f406748b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.l
    public final i0<Y> I() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean M() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.A
    public final j N(i iVar) {
        return this.f407209l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean O() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final j P() {
        return j.c.f409687b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean W() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42854g
    public final boolean Y() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42885n
    @k
    public final b0 e() {
        return b0.f407539a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    public final InterfaceC42882k f() {
        return this.f407205h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @k
    public final g getAnnotations() {
        g.f407522s2.getClass();
        return g.a.f407524b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @k
    public final ClassKind getKind() {
        return ClassKind.f407414c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42886o, kotlin.reflect.jvm.internal.impl.descriptors.B
    @k
    public final AbstractC42900s getVisibility() {
        return r.f407789e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d, kotlin.reflect.jvm.internal.impl.descriptors.B
    @k
    public final Modality i() {
        return Modality.f407442f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f
    @k
    public final q0 l() {
        return this.f407208k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final Collection q0() {
        return C42784z0.f406748b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42854g
    @k
    public final List<g0> r() {
        return this.f407210m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final /* bridge */ /* synthetic */ InterfaceC42850c t() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean t0() {
        return false;
    }

    @k
    public final String toString() {
        return getName().b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean v0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean w0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final /* bridge */ /* synthetic */ InterfaceC42851d x0() {
        return null;
    }
}
