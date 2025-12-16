package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import i51.InterfaceC41228b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k51.InterfaceC42513B;
import k51.InterfaceC42521f;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.H0;
import kotlin.collections.I0;
import kotlin.collections.J0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.U;
import kotlin.reflect.jvm.internal.impl.descriptors.X;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.V;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.K;
import kotlin.reflect.jvm.internal.impl.load.kotlin.E;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.c;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.j;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;

/* compiled from: LazyJavaScope.kt */
@s0
/* loaded from: classes8.dex */
public abstract class p extends kotlin.reflect.jvm.internal.impl.resolve.scopes.k {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f408199m;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.h f408200b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final p f408201c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k<Collection<InterfaceC42882k>> f408202d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k<InterfaceC42920b> f408203e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.name.f, Collection<a0>> f408204f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.name.f, U> f408205g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.name.f, Collection<a0>> f408206h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f408207i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f408208j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f408209k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.name.f, List<U>> f408210l;

    /* compiled from: LazyJavaScope.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final O f408211a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<k0> f408212b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ArrayList f408213c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final List<String> f408214d;

        public a(@Y61.k O o12, @Y61.k List list, @Y61.k ArrayList arrayList, @Y61.k List list2) {
            this.f408211a = o12;
            this.f408212b = list;
            this.f408213c = arrayList;
            this.f408214d = list2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f408211a.equals(aVar.f408211a) && L.f(null, null) && L.f(this.f408212b, aVar.f408212b) && this.f408213c.equals(aVar.f408213c) && L.f(this.f408214d, aVar.f408214d);
        }

        public final int hashCode() {
            return this.f408214d.hashCode() + androidx.appcompat.app.r.i(androidx.compose.ui.graphics.colorspace.e.g(this.f408213c, H.e(this.f408211a.hashCode() * 961, 31, this.f408212b), 31), 31, false);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MethodSignatureData(returnType=");
            sb2.append(this.f408211a);
            sb2.append(", receiverType=null, valueParameters=");
            sb2.append(this.f408212b);
            sb2.append(", typeParameters=");
            sb2.append(this.f408213c);
            sb2.append(", hasStableParameterNames=false, errors=");
            return H.p(sb2, this.f408214d, ')');
        }
    }

    /* compiled from: LazyJavaScope.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<k0> f408215a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f408216b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.k List<? extends k0> list, boolean z12) {
            this.f408215a = list;
            this.f408216b = z12;
        }
    }

    /* compiled from: LazyJavaScope.kt */
    public static final class c extends N implements Y41.a<Collection<? extends InterfaceC42882k>> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Collection<? extends InterfaceC42882k> invoke() {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409663l;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.j.f409683a.getClass();
            Y41.l<kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar = j.a.f409685b;
            p pVar = p.this;
            pVar.getClass();
            NoLookupLocation noLookupLocation = NoLookupLocation.f407887e;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409654c.getClass();
            if (dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409662k)) {
                for (kotlin.reflect.jvm.internal.impl.name.f fVar : pVar.h(dVar, lVar)) {
                    lVar.invoke(fVar);
                    kotlin.reflect.jvm.internal.impl.utils.a.a(linkedHashSet, pVar.g(fVar, noLookupLocation));
                }
            }
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409654c.getClass();
            boolean zA2 = dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409659h);
            List<kotlin.reflect.jvm.internal.impl.resolve.scopes.c> list = dVar.f409670a;
            if (zA2 && !list.contains(c.a.f409651a)) {
                for (kotlin.reflect.jvm.internal.impl.name.f fVar2 : pVar.i(dVar, lVar)) {
                    lVar.invoke(fVar2);
                    linkedHashSet.addAll(pVar.d(fVar2, noLookupLocation));
                }
            }
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409654c.getClass();
            if (dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409660i) && !list.contains(c.a.f409651a)) {
                for (kotlin.reflect.jvm.internal.impl.name.f fVar3 : pVar.n()) {
                    lVar.invoke(fVar3);
                    linkedHashSet.addAll(pVar.f(fVar3, noLookupLocation));
                }
            }
            return C42745f0.M0(linkedHashSet);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    public static final class d extends N implements Y41.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Set<? extends kotlin.reflect.jvm.internal.impl.name.f> invoke() {
            return p.this.h(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409665n, null);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    public static final class e extends N implements Y41.l<kotlin.reflect.jvm.internal.impl.name.f, U> {
        public e() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
        /* JADX WARN: Type inference failed for: r5v8, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.impl.L] */
        /* JADX WARN: Type inference failed for: r6v1, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.impl.L, kotlin.reflect.jvm.internal.impl.load.java.descriptors.f] */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.reflect.jvm.internal.impl.descriptors.U invoke(kotlin.reflect.jvm.internal.impl.name.f r22) {
            /*
                Method dump skipped, instructions count: 329
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p.e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: LazyJavaScope.kt */
    public static final class f extends N implements Y41.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends a0>> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final Collection<? extends a0> invoke(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            kotlin.reflect.jvm.internal.impl.name.f fVar2 = fVar;
            p pVar = p.this;
            p pVar2 = pVar.f408201c;
            if (pVar2 != null) {
                return pVar2.f408204f.invoke(fVar2);
            }
            ArrayList arrayList = new ArrayList();
            for (k51.r rVar : pVar.f408203e.invoke().e(fVar2)) {
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVarS = pVar.s(rVar);
                if (pVar.q(eVarS)) {
                    pVar.f408200b.f408253a.f408082g.b(rVar, eVarS);
                    arrayList.add(eVarS);
                }
            }
            pVar.j(arrayList, fVar2);
            return arrayList;
        }
    }

    /* compiled from: LazyJavaScope.kt */
    public static final class g extends N implements Y41.a<InterfaceC42920b> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC42920b invoke() {
            return p.this.k();
        }
    }

    /* compiled from: LazyJavaScope.kt */
    public static final class h extends N implements Y41.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Set<? extends kotlin.reflect.jvm.internal.impl.name.f> invoke() {
            return p.this.i(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409666o, null);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    public static final class i extends N implements Y41.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends a0>> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final Collection<? extends a0> invoke(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            kotlin.reflect.jvm.internal.impl.name.f fVar2 = fVar;
            p pVar = p.this;
            LinkedHashSet linkedHashSet = new LinkedHashSet(pVar.f408204f.invoke(fVar2));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                String strA = E.a((a0) obj, 2);
                Object objR = linkedHashMap.get(strA);
                if (objR == null) {
                    objR = androidx.compose.ui.graphics.colorspace.e.r(linkedHashMap, strA);
                }
                ((List) objR).add(obj);
            }
            for (List list : linkedHashMap.values()) {
                if (list.size() != 1) {
                    List list2 = list;
                    Collection collectionA = kotlin.reflect.jvm.internal.impl.resolve.w.a(list2, s.f408232l);
                    linkedHashSet.removeAll(list2);
                    linkedHashSet.addAll(collectionA);
                }
            }
            pVar.l(linkedHashSet, fVar2);
            kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar = pVar.f408200b;
            return C42745f0.M0(hVar.f408253a.f408093r.c(hVar, linkedHashSet));
        }
    }

    /* compiled from: LazyJavaScope.kt */
    public static final class j extends N implements Y41.l<kotlin.reflect.jvm.internal.impl.name.f, List<? extends U>> {
        public j() {
            super(1);
        }

        @Override // Y41.l
        public final List<? extends U> invoke(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            kotlin.reflect.jvm.internal.impl.name.f fVar2 = fVar;
            ArrayList arrayList = new ArrayList();
            p pVar = p.this;
            kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, pVar.f408205g.invoke(fVar2));
            pVar.m(arrayList, fVar2);
            InterfaceC42882k interfaceC42882kP = pVar.p();
            int i12 = kotlin.reflect.jvm.internal.impl.resolve.j.f409625a;
            if (kotlin.reflect.jvm.internal.impl.resolve.j.n(interfaceC42882kP, ClassKind.f407417f)) {
                return C42745f0.M0(arrayList);
            }
            kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar = pVar.f408200b;
            return C42745f0.M0(hVar.f408253a.f408093r.c(hVar, arrayList));
        }
    }

    /* compiled from: LazyJavaScope.kt */
    public static final class k extends N implements Y41.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Set<? extends kotlin.reflect.jvm.internal.impl.name.f> invoke() {
            d.a aVar = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409654c;
            return p.this.n();
        }
    }

    static {
        n0 n0Var = m0.f406844a;
        f408199m = new kotlin.reflect.n[]{n0Var.i(new h0(n0Var.b(p.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), n0Var.i(new h0(n0Var.b(p.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), n0Var.i(new h0(n0Var.b(p.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    }

    public /* synthetic */ p(kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, p pVar, int i12, C42822w c42822w) {
        this(hVar, (i12 & 2) != 0 ? null : pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public static b t(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, @Y61.k AbstractC42878w abstractC42878w, @Y61.k List list) {
        Q q12;
        kotlin.reflect.jvm.internal.impl.name.f name;
        I0 i0S0 = C42745f0.S0(list);
        ArrayList arrayList = new ArrayList(C42745f0.q(i0S0, 10));
        Iterator it = i0S0.iterator();
        boolean z12 = false;
        boolean z13 = false;
        while (true) {
            J0 j02 = (J0) it;
            if (!j02.f406646b.hasNext()) {
                return new b(C42745f0.M0(arrayList), z13);
            }
            H0 h02 = (H0) j02.next();
            int i12 = h02.f406643a;
            InterfaceC42513B interfaceC42513B = (InterfaceC42513B) h02.f406644b;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.e eVarA = kotlin.reflect.jvm.internal.impl.load.java.lazy.f.a(hVar, interfaceC42513B);
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVarA = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.a(TypeUsage.f410066c, z12, null, 7);
            boolean zA2 = interfaceC42513B.a();
            kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = hVar.f408253a;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d dVar = hVar.f408257e;
            kotlin.reflect.jvm.internal.impl.descriptors.E e12 = cVar.f408090o;
            if (zA2) {
                k51.x type = interfaceC42513B.getType();
                InterfaceC42521f interfaceC42521f = type instanceof InterfaceC42521f ? (InterfaceC42521f) type : null;
                if (interfaceC42521f == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + interfaceC42513B);
                }
                kotlin.reflect.jvm.internal.impl.types.J0 j0C = dVar.c(interfaceC42521f, aVarA, true);
                q12 = new Q(j0C, e12.m().f(j0C));
            } else {
                q12 = new Q(dVar.d(interfaceC42513B.getType(), aVarA), null);
            }
            O o12 = (O) q12.f406619b;
            O o13 = (O) q12.f406620c;
            if (L.f(abstractC42878w.getName().b(), "equals") && list.size() == 1 && e12.m().n().equals(o12)) {
                name = kotlin.reflect.jvm.internal.impl.name.f.e(PluralsKeys.OTHER);
            } else {
                name = interfaceC42513B.getName();
                if (name == null) {
                    z13 = true;
                }
                if (name == null) {
                    name = kotlin.reflect.jvm.internal.impl.name.f.e("p" + i12);
                }
            }
            arrayList.add(new V(abstractC42878w, null, i12, eVarA, name, o12, false, false, false, o13, cVar.f408085j.a(interfaceC42513B)));
            z12 = false;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> a() {
        kotlin.reflect.n<Object> nVar = f408199m[0];
        return (Set) this.f408207i.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        kotlin.reflect.n<Object> nVar = f408199m[1];
        return (Set) this.f408208j.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        kotlin.reflect.n<Object> nVar = f408199m[2];
        return (Set) this.f408209k.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public Collection<a0> d(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC41228b interfaceC41228b) {
        return !a().contains(fVar) ? C42784z0.f406748b : this.f408206h.invoke(fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    @Y61.k
    public Collection<InterfaceC42882k> e(@Y61.k kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @Y61.k Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        return this.f408202d.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public Collection f(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k NoLookupLocation noLookupLocation) {
        return !b().contains(fVar) ? C42784z0.f406748b : this.f408210l.invoke(fVar);
    }

    @Y61.k
    public abstract Set<kotlin.reflect.jvm.internal.impl.name.f> h(@Y61.k kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @Y61.l Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar);

    @Y61.k
    public abstract Set<kotlin.reflect.jvm.internal.impl.name.f> i(@Y61.k kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @Y61.l Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar);

    @Y61.k
    public abstract InterfaceC42920b k();

    public abstract void l(@Y61.k LinkedHashSet linkedHashSet, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar);

    public abstract void m(@Y61.k ArrayList arrayList, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar);

    @Y61.k
    public abstract Set n();

    @Y61.l
    public abstract X o();

    @Y61.k
    public abstract InterfaceC42882k p();

    public boolean q(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar) {
        return true;
    }

    @Y61.k
    public abstract a r(@Y61.k k51.r rVar, @Y61.k ArrayList arrayList, @Y61.k O o12, @Y61.k List list);

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.C] */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.load.java.descriptors.e s(@Y61.k k51.r rVar) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar = this.f408200b;
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVarT0 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.T0(p(), kotlin.reflect.jvm.internal.impl.load.java.lazy.f.a(hVar, rVar), rVar.getName(), hVar.f408253a.f408085j.a(rVar), this.f408203e.invoke().f(rVar.getName()) != null && ((ArrayList) rVar.g()).isEmpty());
        kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVarA = kotlin.reflect.jvm.internal.impl.load.java.lazy.b.a(hVar, eVarT0, rVar, 0, hVar.f408255c);
        ArrayList typeParameters = rVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(C42745f0.q(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            arrayList.add(hVarA.f408254b.a((k51.y) it.next()));
        }
        b bVarT = t(hVarA, eVarT0, rVar.g());
        a aVarR = r(rVar, arrayList, hVarA.f408257e.d(rVar.m(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.a(TypeUsage.f410066c, rVar.k().f407871a.isAnnotation(), null, 6)), bVarT.f408215a);
        X xO2 = o();
        C42784z0 c42784z0 = C42784z0.f406748b;
        Modality.a aVar = Modality.f407438b;
        boolean zIsAbstract = rVar.isAbstract();
        boolean zIsFinal = true ^ rVar.isFinal();
        aVar.getClass();
        eVarT0.S0(null, xO2, c42784z0, aVarR.f408213c, aVarR.f408212b, aVarR.f408211a, Modality.a.a(false, zIsAbstract, zIsFinal), K.a(rVar.getVisibility()), P0.c());
        eVarT0.U0(false, bVarT.f408216b);
        List<String> list = aVarR.f408214d;
        if (list.isEmpty()) {
            return eVarT0;
        }
        hVarA.f408253a.f408080e.a(eVarT0, list);
        throw null;
    }

    @Y61.k
    public String toString() {
        return "Lazy scope for " + p();
    }

    public p(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, @Y61.l p pVar) {
        this.f408200b = hVar;
        this.f408201c = pVar;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = hVar.f408253a;
        c cVar2 = new c();
        C42784z0 c42784z0 = C42784z0.f406748b;
        kotlin.reflect.jvm.internal.impl.storage.p pVar2 = cVar.f408076a;
        this.f408202d = pVar2.a(cVar2, c42784z0);
        this.f408203e = pVar2.g(new g());
        this.f408204f = pVar2.c(new f());
        this.f408205g = pVar2.b(new e());
        this.f408206h = pVar2.c(new i());
        this.f408207i = pVar2.g(new h());
        this.f408208j = pVar2.g(new k());
        this.f408209k = pVar2.g(new d());
        this.f408210l = pVar2.c(new j());
    }

    public void j(@Y61.k ArrayList arrayList, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
    }
}
