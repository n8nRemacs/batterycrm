package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k51.InterfaceC42516a;
import k51.InterfaceC42522g;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42850c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.Y;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42867k;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.jvm.internal.impl.load.java.K;
import kotlin.reflect.jvm.internal.impl.types.AbstractC42961b;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.q0;

/* compiled from: LazyJavaClassDescriptor.kt */
@s0
/* loaded from: classes8.dex */
public final class f extends AbstractC42867k implements kotlin.reflect.jvm.internal.impl.load.java.descriptors.c {

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public static final Set<String> f408129y;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.h f408130i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42522g f408131j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final InterfaceC42851d f408132k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.h f408133l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f408134m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final ClassKind f408135n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Modality f408136o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final p0 f408137p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f408138q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final b f408139r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final l f408140s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final Y<l> f408141t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h f408142u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final z f408143v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.e f408144w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k<List<g0>> f408145x;

    /* compiled from: LazyJavaClassDescriptor.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LazyJavaClassDescriptor.kt */
    @s0
    public final class b extends AbstractC42961b {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.storage.k<List<g0>> f408146c;

        /* compiled from: LazyJavaClassDescriptor.kt */
        public static final class a extends N implements Y41.a<List<? extends g0>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ f f408148l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar) {
                super(0);
                this.f408148l = fVar;
            }

            @Override // Y41.a
            public final List<? extends g0> invoke() {
                return h0.b(this.f408148l);
            }
        }

        public b() {
            super(f.this.f408133l.f408253a.f408076a);
            kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = f.this.f408133l.f408253a;
            this.f408146c = cVar.f408076a.g(new a(f.this));
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42961b, kotlin.reflect.jvm.internal.impl.types.q0
        public final InterfaceC42853f b() {
            return f.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.q0
        public final boolean c() {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0188  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x01a6  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01d6  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01dd  */
        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42983j
        @Y61.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.O> e() {
            /*
                Method dump skipped, instructions count: 495
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f.b.e():java.util.Collection");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.q0
        @Y61.k
        public final List<g0> getParameters() {
            return this.f408146c.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42983j
        @Y61.k
        public final e0 i() {
            return f.this.f408133l.f408253a.f408088m;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42961b
        @Y61.k
        /* renamed from: o */
        public final InterfaceC42851d b() {
            return f.this;
        }

        @Y61.k
        public final String toString() {
            return f.this.getName().b();
        }
    }

    /* compiled from: LazyJavaClassDescriptor.kt */
    @s0
    public static final class c extends N implements Y41.a<List<? extends g0>> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends g0> invoke() {
            f fVar = f.this;
            ArrayList<k51.y> typeParameters = fVar.f408131j.getTypeParameters();
            ArrayList arrayList = new ArrayList(C42745f0.q(typeParameters, 10));
            for (k51.y yVar : typeParameters) {
                g0 g0VarA = fVar.f408133l.f408254b.a(yVar);
                if (g0VarA == null) {
                    throw new AssertionError("Parameter " + yVar + " surely belongs to class " + fVar.f408131j + ", so it must be resolved");
                }
                arrayList.add(g0VarA);
            }
            return arrayList;
        }
    }

    /* compiled from: Comparisons.kt */
    @s0
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            return kotlin.comparisons.a.b(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.g((InterfaceC42851d) t12).b(), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.g((InterfaceC42851d) t13).b());
        }
    }

    /* compiled from: LazyJavaClassDescriptor.kt */
    @s0
    public static final class e extends N implements Y41.a<List<? extends InterfaceC42516a>> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends InterfaceC42516a> invoke() {
            f fVar = f.this;
            if (kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(fVar) == null) {
                return null;
            }
            fVar.f408130i.f408253a.f408098w.getClass();
            return null;
        }
    }

    /* compiled from: LazyJavaClassDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f$f, reason: collision with other inner class name */
    public static final class C11660f extends N implements Y41.l<kotlin.reflect.jvm.internal.impl.types.checker.i, l> {
        public C11660f() {
            super(1);
        }

        @Override // Y41.l
        public final l invoke(kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
            f fVar = f.this;
            return new l(fVar.f408133l, fVar, fVar.f408131j, fVar.f408132k != null, fVar.f408140s);
        }
    }

    static {
        new a(null);
        f408129y = C42756l.l0(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    public /* synthetic */ f(kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, InterfaceC42882k interfaceC42882k, InterfaceC42522g interfaceC42522g, InterfaceC42851d interfaceC42851d, int i12, C42822w c42822w) {
        this(hVar, interfaceC42882k, interfaceC42522g, (i12 & 8) != 0 ? null : interfaceC42851d);
    }

    @Y61.k
    public final l F0() {
        return (l) super.g0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final Collection G() {
        return this.f408140s.f408158q.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.l
    public final i0<kotlin.reflect.jvm.internal.impl.types.Y> I() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean M() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.A
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j N(kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        return (l) this.f408141t.a(iVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean O() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j P() {
        return this.f408143v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean W() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42854g
    public final boolean Y() {
        return this.f408138q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42858b, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j f0() {
        return this.f408142u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42858b, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j g0() {
        return (l) super.g0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return this.f408144w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final ClassKind getKind() {
        return this.f408135n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42886o, kotlin.reflect.jvm.internal.impl.descriptors.B
    @Y61.k
    public final AbstractC42900s getVisibility() {
        AbstractC42900s abstractC42900s = kotlin.reflect.jvm.internal.impl.descriptors.r.f407785a;
        p0 p0Var = this.f408137p;
        return (L.f(p0Var, abstractC42900s) && this.f408131j.M() == null) ? kotlin.reflect.jvm.internal.impl.load.java.u.f408408a : K.a(p0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d, kotlin.reflect.jvm.internal.impl.descriptors.B
    @Y61.k
    public final Modality i() {
        return this.f408136o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f
    @Y61.k
    public final q0 l() {
        return this.f408139r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final Collection<InterfaceC42851d> q0() {
        if (this.f408136o != Modality.f407440d) {
            return C42784z0.f406748b;
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVarA = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.a(TypeUsage.f410066c, false, null, 7);
        Collection<k51.j> collectionP = this.f408131j.P();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionP.iterator();
        while (it.hasNext()) {
            InterfaceC42853f interfaceC42853fB = this.f408133l.f408257e.d((k51.j) it.next(), aVarA).H0().b();
            InterfaceC42851d interfaceC42851d = interfaceC42853fB instanceof InterfaceC42851d ? (InterfaceC42851d) interfaceC42853fB : null;
            if (interfaceC42851d != null) {
                arrayList.add(interfaceC42851d);
            }
        }
        return C42745f0.B0(arrayList, new d());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42854g
    @Y61.k
    public final List<g0> r() {
        return this.f408145x.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.l
    public final InterfaceC42850c t() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean t0() {
        return false;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Lazy Java class ");
        int i12 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f409615a;
        sb2.append(kotlin.reflect.jvm.internal.impl.resolve.j.g(this));
        return sb2.toString();
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
    @Y61.l
    public final InterfaceC42851d x0() {
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, @Y61.k InterfaceC42882k interfaceC42882k, @Y61.k InterfaceC42522g interfaceC42522g, @Y61.l InterfaceC42851d interfaceC42851d) {
        Modality modalityA;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = hVar.f408253a;
        super(cVar.f408076a, interfaceC42882k, interfaceC42522g.getName(), cVar.f408085j.a(interfaceC42522g));
        this.f408130i = hVar;
        this.f408131j = interfaceC42522g;
        this.f408132k = interfaceC42851d;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVarB = kotlin.reflect.jvm.internal.impl.load.java.lazy.b.b(hVar, this, interfaceC42522g, 4);
        this.f408133l = hVarB;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar2 = hVarB.f408253a;
        cVar2.f408082g.c(interfaceC42522g, this);
        this.f408134m = C42727D.c(new e());
        this.f408135n = interfaceC42522g.N() ? ClassKind.f407417f : interfaceC42522g.E() ? ClassKind.f407414c : interfaceC42522g.I() ? ClassKind.f407415d : ClassKind.f407413b;
        if (interfaceC42522g.N() || interfaceC42522g.I()) {
            modalityA = Modality.f407439c;
        } else {
            Modality.a aVar = Modality.f407438b;
            boolean zB2 = interfaceC42522g.B();
            boolean z12 = interfaceC42522g.B() || interfaceC42522g.isAbstract() || interfaceC42522g.E();
            boolean z13 = !interfaceC42522g.isFinal();
            aVar.getClass();
            modalityA = Modality.a.a(zB2, z12, z13);
        }
        this.f408136o = modalityA;
        this.f408137p = interfaceC42522g.getVisibility();
        this.f408138q = (interfaceC42522g.M() == null || interfaceC42522g.b()) ? false : true;
        this.f408139r = new b();
        l lVar = new l(hVarB, this, interfaceC42522g, interfaceC42851d != null, null, 16, null);
        this.f408140s = lVar;
        Y.a aVar2 = Y.f407448e;
        kotlin.reflect.jvm.internal.impl.types.checker.i iVarA = cVar2.f408096u.a();
        C11660f c11660f = new C11660f();
        aVar2.getClass();
        this.f408141t = new Y<>(this, cVar2.f408076a, c11660f, iVarA, null);
        this.f408142u = new kotlin.reflect.jvm.internal.impl.resolve.scopes.h(lVar);
        this.f408143v = new z(hVarB, interfaceC42522g, this);
        this.f408144w = kotlin.reflect.jvm.internal.impl.load.java.lazy.f.a(hVarB, interfaceC42522g);
        this.f408145x = cVar2.f408076a.g(new c());
    }
}
