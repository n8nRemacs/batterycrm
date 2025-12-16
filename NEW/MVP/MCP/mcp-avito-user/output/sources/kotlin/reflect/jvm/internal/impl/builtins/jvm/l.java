package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import f51.InterfaceC40235a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Q;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.descriptors.C42888q;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42850c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C42868l;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.G;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.D;
import kotlin.reflect.jvm.internal.impl.load.kotlin.E;
import kotlin.reflect.jvm.internal.impl.load.kotlin.H;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.j;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.y;
import kotlin.reflect.jvm.internal.impl.types.E0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.T;
import kotlin.reflect.jvm.internal.impl.types.Y;

/* compiled from: JvmBuiltInsCustomizer.kt */
@s0
/* loaded from: classes8.dex */
public final class l implements InterfaceC40235a, f51.c {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f407274i;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final G f407275a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d f407276b = d.f407256a;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f407277c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y f407278d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f407279e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.a<kotlin.reflect.jvm.internal.impl.name.c, InterfaceC42851d> f407280f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f407281g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.i<Q<String, String>, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g> f407282h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f407283b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f407284c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f407285d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f407286e;

        /* renamed from: f, reason: collision with root package name */
        public static final a f407287f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ a[] f407288g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f407289h;

        static {
            a aVar = new a("HIDDEN", 0);
            f407283b = aVar;
            a aVar2 = new a("VISIBLE", 1);
            f407284c = aVar2;
            a aVar3 = new a("DEPRECATED_LIST_METHODS", 2);
            f407285d = aVar3;
            a aVar4 = new a("NOT_CONSIDERED", 3);
            f407286e = aVar4;
            a aVar5 = new a("DROP", 4);
            f407287f = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
            f407288g = aVarArr;
            f407289h = kotlin.enums.c.a(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f407288g.clone();
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a aVar = a.f407283b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a aVar2 = a.f407283b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a aVar3 = a.f407283b;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a aVar4 = a.f407283b;
                iArr[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    public static final class c extends N implements Y41.l<kotlin.reflect.jvm.internal.impl.resolve.scopes.j, Collection<? extends a0>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f f407290l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            super(1);
            this.f407290l = fVar;
        }

        @Override // Y41.l
        public final Collection<? extends a0> invoke(kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVar) {
            return jVar.d(this.f407290l, NoLookupLocation.f407884b);
        }
    }

    static {
        n0 n0Var = m0.f406844a;
        f407274i = new kotlin.reflect.n[]{n0Var.i(new h0(n0Var.b(l.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), n0Var.i(new h0(n0Var.b(l.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), n0Var.i(new h0(n0Var.b(l.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    }

    public l(@Y61.k G g12, @Y61.k kotlin.reflect.jvm.internal.impl.storage.f fVar, @Y61.k Y41.a aVar) {
        this.f407275a = g12;
        this.f407277c = fVar.g(aVar);
        C42868l c42868l = new C42868l(new n(g12, new kotlin.reflect.jvm.internal.impl.name.c("java.io")), kotlin.reflect.jvm.internal.impl.name.f.e("Serializable"), Modality.f407442f, ClassKind.f407414c, Collections.singletonList(new T(fVar, new o(this))), b0.f407539a, fVar);
        c42868l.F0(j.c.f409687b, B0.f406639b, null);
        this.f407278d = c42868l.q();
        this.f407279e = fVar.g(new m(this, fVar));
        this.f407280f = fVar.e();
        this.f407281g = fVar.g(new t(this));
        this.f407282h = fVar.c(new p(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0213  */
    @Override // f51.InterfaceC40235a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.a0> a(@Y61.k kotlin.reflect.jvm.internal.impl.name.f r18, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d r19) {
        /*
            Method dump skipped, instructions count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.l.a(kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.d):java.util.Collection");
    }

    @Override // f51.c
    public final boolean b(@Y61.k InterfaceC42851d interfaceC42851d, @Y61.k y yVar) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f fVarF = f(interfaceC42851d);
        if (fVarF == null || !yVar.getAnnotations().i3(f51.d.f395660a)) {
            return true;
        }
        g().getClass();
        String strA = E.a(yVar, 3);
        Collection<a0> collectionD = fVarF.F0().d(yVar.getName(), NoLookupLocation.f407884b);
        if (!(collectionD instanceof Collection) || !collectionD.isEmpty()) {
            Iterator<T> it = collectionD.iterator();
            while (it.hasNext()) {
                if (E.a((a0) it.next(), 3).equals(strA)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // f51.InterfaceC40235a
    @Y61.k
    public final Collection<InterfaceC42850c> c(@Y61.k InterfaceC42851d interfaceC42851d) {
        kotlin.reflect.jvm.internal.impl.name.d dVarG;
        if (interfaceC42851d.getKind() != ClassKind.f407413b) {
            return C42784z0.f406748b;
        }
        g().getClass();
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f fVarF = f(interfaceC42851d);
        if (fVarF == null) {
            return C42784z0.f406748b;
        }
        kotlin.reflect.jvm.internal.impl.name.c cVarG = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.g(fVarF);
        kotlin.reflect.jvm.internal.impl.builtins.jvm.b.f407236g.getClass();
        InterfaceC42851d interfaceC42851dB = d.b(this.f407276b, cVarG, kotlin.reflect.jvm.internal.impl.builtins.jvm.b.f407237h);
        if (interfaceC42851dB == null) {
            return C42784z0.f406748b;
        }
        E0 e0E = E0.e(x.a(interfaceC42851dB, fVarF));
        List<InterfaceC42850c> listInvoke = fVarF.f408140s.f408158q.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listInvoke) {
            InterfaceC42850c interfaceC42850c = (InterfaceC42850c) obj;
            if (interfaceC42850c.getVisibility().a().f407784b) {
                Collection<InterfaceC42850c> collectionG = interfaceC42851dB.G();
                if (!(collectionG instanceof Collection) || !collectionG.isEmpty()) {
                    Iterator<T> it = collectionG.iterator();
                    while (it.hasNext()) {
                        if (OverridingUtil.j((InterfaceC42850c) it.next(), interfaceC42850c.b(e0E)) == OverridingUtil.OverrideCompatibilityInfo.Result.f409567b) {
                            break;
                        }
                    }
                }
                if (interfaceC42850c.g().size() == 1) {
                    InterfaceC42853f interfaceC42853fB = ((k0) C42745f0.u0(interfaceC42850c.g())).getType().H0().b();
                    if (interfaceC42853fB != null) {
                        int i12 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f409615a;
                        dVarG = kotlin.reflect.jvm.internal.impl.resolve.j.g(interfaceC42853fB);
                    } else {
                        dVarG = null;
                    }
                    int i13 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f409615a;
                    if (L.f(dVarG, kotlin.reflect.jvm.internal.impl.resolve.j.g(interfaceC42851d))) {
                    }
                }
                if (!kotlin.reflect.jvm.internal.impl.builtins.k.B(interfaceC42850c)) {
                    w.f407303a.getClass();
                    if (!w.f407309g.contains(D.a(H.f408434a, fVarF, E.a(interfaceC42850c, 3)))) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            InterfaceC42850c interfaceC42850c2 = (InterfaceC42850c) it2.next();
            InterfaceC42905x.a<? extends InterfaceC42905x> aVarM0 = interfaceC42850c2.m0();
            aVarM0.k(interfaceC42851d);
            aVarM0.f(interfaceC42851d.q());
            aVarM0.m();
            aVarM0.c(e0E.g());
            w.f407303a.getClass();
            if (!w.f407310h.contains(D.a(H.f408434a, fVarF, E.a(interfaceC42850c2, 3)))) {
                kotlin.reflect.n<Object> nVar = f407274i[2];
                aVarM0.g((kotlin.reflect.jvm.internal.impl.descriptors.annotations.g) this.f407281g.invoke());
            }
            arrayList2.add((InterfaceC42850c) aVarM0.build());
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f51.InterfaceC40235a
    @Y61.k
    public final Collection<O> d(@Y61.k InterfaceC42851d interfaceC42851d) {
        boolean zIsAssignableFrom = true;
        int i12 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f409615a;
        kotlin.reflect.jvm.internal.impl.name.d dVarG = kotlin.reflect.jvm.internal.impl.resolve.j.g(interfaceC42851d);
        w.f407303a.getClass();
        kotlin.reflect.jvm.internal.impl.name.d dVar = n.a.f407382h;
        boolean z12 = dVarG.equals(dVar) || n.a.f407378d0.get(dVarG) != null;
        Y y12 = this.f407278d;
        if (z12) {
            kotlin.reflect.n<Object> nVar = f407274i[1];
            return C42745f0.U((Y) this.f407279e.invoke(), y12);
        }
        if (!dVarG.equals(dVar) && n.a.f407378d0.get(dVarG) == null) {
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f407238a.getClass();
            kotlin.reflect.jvm.internal.impl.name.b bVarE = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.e(dVarG);
            if (bVarE == null) {
                zIsAssignableFrom = false;
            } else {
                try {
                    zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(bVarE.b().b()));
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        return zIsAssignableFrom ? Collections.singletonList(y12) : C42784z0.f406748b;
    }

    @Override // f51.InterfaceC40235a
    public final Collection e(InterfaceC42851d interfaceC42851d) {
        Set<kotlin.reflect.jvm.internal.impl.name.f> setA;
        g().getClass();
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f fVarF = f(interfaceC42851d);
        if (fVarF == null || (setA = fVarF.F0().a()) == null) {
            setA = B0.f406639b;
        }
        return setA;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f f(InterfaceC42851d interfaceC42851d) {
        if (interfaceC42851d == null) {
            kotlin.reflect.jvm.internal.impl.builtins.k.a(109);
            throw null;
        }
        kotlin.reflect.jvm.internal.impl.name.f fVar = kotlin.reflect.jvm.internal.impl.builtins.k.f407311f;
        if (kotlin.reflect.jvm.internal.impl.builtins.k.b(interfaceC42851d, n.a.f407373b) || !kotlin.reflect.jvm.internal.impl.builtins.k.H(interfaceC42851d)) {
            return null;
        }
        int i12 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f409615a;
        kotlin.reflect.jvm.internal.impl.name.d dVarG = kotlin.reflect.jvm.internal.impl.resolve.j.g(interfaceC42851d);
        if (!dVarG.d()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f407238a.getClass();
        kotlin.reflect.jvm.internal.impl.name.b bVarE = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.e(dVarG);
        if (bVarE == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.c cVarB = bVarE.b();
        G g12 = g().f407233a;
        NoLookupLocation noLookupLocation = NoLookupLocation.f407884b;
        InterfaceC42851d interfaceC42851dB = C42888q.b(g12, cVarB);
        if (interfaceC42851dB instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f) {
            return (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f) interfaceC42851dB;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JvmBuiltIns.a g() {
        kotlin.reflect.n<Object> nVar = f407274i[0];
        return (JvmBuiltIns.a) this.f407277c.invoke();
    }
}
