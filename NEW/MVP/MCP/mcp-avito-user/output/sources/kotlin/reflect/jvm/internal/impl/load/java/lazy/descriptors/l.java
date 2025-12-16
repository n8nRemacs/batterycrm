package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import h51.C40774a;
import i51.InterfaceC41228b;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k51.InterfaceC42521f;
import k51.InterfaceC42522g;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.collections.b1;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42850c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.U;
import kotlin.reflect.jvm.internal.impl.descriptors.X;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.M;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.V;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.C42913f;
import kotlin.reflect.jvm.internal.impl.load.java.C42914g;
import kotlin.reflect.jvm.internal.impl.load.java.C42916i;
import kotlin.reflect.jvm.internal.impl.load.java.C42918k;
import kotlin.reflect.jvm.internal.impl.load.java.D;
import kotlin.reflect.jvm.internal.impl.load.java.I;
import kotlin.reflect.jvm.internal.impl.load.java.J;
import kotlin.reflect.jvm.internal.impl.load.java.K;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.components.l;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p;
import kotlin.reflect.jvm.internal.impl.load.java.r;
import kotlin.reflect.jvm.internal.impl.load.java.v;
import kotlin.reflect.jvm.internal.impl.load.kotlin.E;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.G0;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC42970f;
import kotlin.reflect.jvm.internal.impl.utils.g;
import kotlin.text.C43066x;
import v51.C49167a;

/* compiled from: LazyJavaClassMemberScope.kt */
@s0
/* loaded from: classes8.dex */
public final class l extends p {

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42851d f408155n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42522g f408156o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f408157p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k<List<InterfaceC42850c>> f408158q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k<Set<kotlin.reflect.jvm.internal.impl.name.f>> f408159r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k<Set<kotlin.reflect.jvm.internal.impl.name.f>> f408160s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k<Map<kotlin.reflect.jvm.internal.impl.name.f, k51.n>> f408161t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.name.f, InterfaceC42851d> f408162u;

    /* compiled from: LazyJavaClassMemberScope.kt */
    @s0
    public static final class a extends N implements Y41.a<List<? extends InterfaceC42850c>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l f408163l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.h f408164m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, l lVar) {
            super(0);
            this.f408163l = lVar;
            this.f408164m = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final List<? extends InterfaceC42850c> invoke() {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar;
            InterfaceC42851d interfaceC42851d;
            List listEmptyList;
            ArrayList arrayList;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d dVar;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar;
            ArrayList arrayList2;
            Q q12;
            l lVar = this.f408163l;
            Collection<k51.k> collectionG = lVar.f408156o.G();
            ArrayList arrayList3 = new ArrayList(collectionG.size());
            Iterator<k51.k> it = collectionG.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                hVar = lVar.f408200b;
                interfaceC42851d = lVar.f408155n;
                if (!zHasNext) {
                    break;
                }
                k51.k next = it.next();
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.b bVarS0 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.b.S0(interfaceC42851d, kotlin.reflect.jvm.internal.impl.load.java.lazy.f.a(hVar, next), false, hVar.f408253a.f408085j.a(next));
                kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVarA = kotlin.reflect.jvm.internal.impl.load.java.lazy.b.a(hVar, bVarS0, next, interfaceC42851d.r().size(), hVar.f408255c);
                p.b bVarT = p.t(hVarA, bVarS0, next.g());
                List<g0> listR = interfaceC42851d.r();
                ArrayList typeParameters = next.getTypeParameters();
                ArrayList arrayList4 = new ArrayList(C42745f0.q(typeParameters, 10));
                Iterator it2 = typeParameters.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(hVarA.f408254b.a((k51.y) it2.next()));
                }
                bVarS0.R0(bVarT.f408215a, K.a(next.getVisibility()), C42745f0.h0(arrayList4, listR));
                bVarS0.L0(false);
                bVarS0.M0(bVarT.f408216b);
                bVarS0.N0(interfaceC42851d.q());
                hVarA.f408253a.f408082g.a(next, bVarS0);
                arrayList3.add(bVarS0);
            }
            InterfaceC42522g interfaceC42522g = lVar.f408156o;
            boolean zA2 = interfaceC42522g.A();
            kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar2 = this.f408164m;
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.b bVar = null;
            if (zA2) {
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.b bVarS02 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.b.S0(interfaceC42851d, g.a.f407524b, true, hVar.f408253a.f408085j.a(interfaceC42522g));
                ArrayList arrayListZ = interfaceC42522g.z();
                ArrayList arrayList5 = new ArrayList(arrayListZ.size());
                kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVarA = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.a(TypeUsage.f410066c, false, null, 6);
                Iterator it3 = arrayListZ.iterator();
                int i12 = 0;
                while (it3.hasNext()) {
                    k51.w wVar = (k51.w) it3.next();
                    O oD2 = hVar.f408257e.d(wVar.getType(), aVarA);
                    kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = hVar.f408253a;
                    kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
                    arrayList5.add(new V(bVarS02, null, i12, g.a.f407524b, wVar.getName(), oD2, false, false, false, null, cVar.f408085j.a(wVar)));
                    aVarA = aVarA;
                    i12++;
                }
                bVarS02.M0(false);
                AbstractC42900s visibility = interfaceC42851d.getVisibility();
                if (visibility.equals(kotlin.reflect.jvm.internal.impl.load.java.u.f408409b)) {
                    visibility = kotlin.reflect.jvm.internal.impl.load.java.u.f408410c;
                }
                bVarS02.Q0(arrayList5, visibility);
                bVarS02.L0(false);
                bVarS02.N0(interfaceC42851d.q());
                String strA = E.a(bVarS02, 2);
                if (arrayList3.isEmpty()) {
                    arrayList3.add(bVarS02);
                    hVar2.f408253a.f408082g.a(interfaceC42522g, bVarS02);
                } else {
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        if (E.a((InterfaceC42850c) it4.next(), 2).equals(strA)) {
                            break;
                        }
                    }
                    arrayList3.add(bVarS02);
                    hVar2.f408253a.f408082g.a(interfaceC42522g, bVarS02);
                }
            }
            hVar2.f408253a.f408099x.a(hVar2, interfaceC42851d, arrayList3);
            kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar2 = hVar2.f408253a;
            boolean zIsEmpty = arrayList3.isEmpty();
            Collection collectionV = arrayList3;
            if (zIsEmpty) {
                boolean zN2 = interfaceC42522g.N();
                interfaceC42522g.E();
                if (zN2) {
                    kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
                    kotlin.reflect.jvm.internal.impl.load.java.descriptors.b bVarS03 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.b.S0(interfaceC42851d, g.a.f407524b, true, hVar.f408253a.f408085j.a(interfaceC42522g));
                    if (zN2) {
                        Collection<k51.r> collectionL = interfaceC42522g.L();
                        ArrayList arrayList6 = new ArrayList(collectionL.size());
                        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVarA2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.a(TypeUsage.f410066c, true, null, 6);
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        for (Object obj : collectionL) {
                            if (L.f(((k51.r) obj).getName(), kotlin.reflect.jvm.internal.impl.load.java.E.f407915b)) {
                                arrayList7.add(obj);
                            } else {
                                arrayList8.add(obj);
                            }
                        }
                        arrayList7.size();
                        k51.r rVar = (k51.r) C42745f0.G(arrayList7);
                        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d dVar2 = hVar.f408257e;
                        if (rVar != null) {
                            k51.x xVarM = rVar.m();
                            if (xVarM instanceof InterfaceC42521f) {
                                InterfaceC42521f interfaceC42521f = (InterfaceC42521f) xVarM;
                                q12 = new Q(dVar2.c(interfaceC42521f, aVarA2, true), dVar2.d(interfaceC42521f.l(), aVarA2));
                            } else {
                                q12 = new Q(dVar2.d(xVarM, aVarA2), null);
                            }
                            arrayList = arrayList8;
                            dVar = dVar2;
                            aVar = aVarA2;
                            arrayList2 = arrayList6;
                            lVar.w(arrayList6, bVarS03, 0, rVar, (O) q12.f406619b, (O) q12.f406620c);
                        } else {
                            arrayList = arrayList8;
                            dVar = dVar2;
                            aVar = aVarA2;
                            arrayList2 = arrayList6;
                        }
                        int i13 = rVar != null ? 1 : 0;
                        Iterator it5 = arrayList.iterator();
                        int i14 = 0;
                        while (it5.hasNext()) {
                            k51.r rVar2 = (k51.r) it5.next();
                            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d dVar3 = dVar;
                            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar2 = aVar;
                            lVar.w(arrayList2, bVarS03, i14 + i13, rVar2, dVar3.d(rVar2.m(), aVar2), null);
                            i14++;
                            aVar = aVar2;
                            dVar = dVar3;
                        }
                        listEmptyList = arrayList2;
                    } else {
                        listEmptyList = Collections.emptyList();
                    }
                    bVarS03.M0(false);
                    AbstractC42900s visibility2 = interfaceC42851d.getVisibility();
                    if (visibility2.equals(kotlin.reflect.jvm.internal.impl.load.java.u.f408409b)) {
                        visibility2 = kotlin.reflect.jvm.internal.impl.load.java.u.f408410c;
                    }
                    bVarS03.Q0(listEmptyList, visibility2);
                    bVarS03.L0(true);
                    bVarS03.N0(interfaceC42851d.q());
                    hVar.f408253a.f408082g.a(interfaceC42522g, bVarS03);
                    bVar = bVarS03;
                }
                collectionV = C42745f0.V(bVar);
            }
            return C42745f0.M0(cVar2.f408093r.c(hVar2, collectionV));
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    @s0
    public static final class b extends N implements Y41.a<Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends k51.n>> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends k51.n> invoke() {
            Collection<k51.n> fields = l.this.f408156o.getFields();
            ArrayList arrayList = new ArrayList();
            for (Object obj : fields) {
                if (((k51.n) obj).n()) {
                    arrayList.add(obj);
                }
            }
            int iF2 = P0.f(C42745f0.q(arrayList, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                linkedHashMap.put(((k51.n) next).getName(), next);
            }
            return linkedHashMap;
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    @s0
    public static final class c extends N implements Y41.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.h f408166l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l f408167m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, l lVar) {
            super(0);
            this.f408166l = hVar;
            this.f408167m = lVar;
        }

        @Override // Y41.a
        public final Set<? extends kotlin.reflect.jvm.internal.impl.name.f> invoke() {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar = this.f408166l;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = hVar.f408253a;
            return C42745f0.P0(cVar.f408099x.g(hVar, this.f408167m.f408155n));
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    public static final class d extends N implements Y41.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends a0>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a0 f408168l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l f408169m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a0 a0Var, l lVar) {
            super(1);
            this.f408168l = a0Var;
            this.f408169m = lVar;
        }

        @Override // Y41.l
        public final Collection<? extends a0> invoke(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            kotlin.reflect.jvm.internal.impl.name.f fVar2 = fVar;
            a0 a0Var = this.f408168l;
            if (L.f(a0Var.getName(), fVar2)) {
                return Collections.singletonList(a0Var);
            }
            l lVar = this.f408169m;
            return C42745f0.h0(l.v(lVar, fVar2), l.u(lVar, fVar2));
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    public static final class e extends N implements Y41.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Set<? extends kotlin.reflect.jvm.internal.impl.name.f> invoke() {
            return C42745f0.P0(l.this.f408156o.O());
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    @s0
    public static final class f extends N implements Y41.l<kotlin.reflect.jvm.internal.impl.name.f, InterfaceC42851d> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l f408171l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.h f408172m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, l lVar) {
            super(1);
            this.f408171l = lVar;
            this.f408172m = hVar;
        }

        @Override // Y41.l
        public final InterfaceC42851d invoke(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            kotlin.reflect.jvm.internal.impl.name.f fVar2 = fVar;
            l lVar = this.f408171l;
            boolean zContains = lVar.f408159r.invoke().contains(fVar2);
            InterfaceC42851d interfaceC42851d = lVar.f408155n;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar = this.f408172m;
            if (zContains) {
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t tVarB = hVar.f408253a.f408077b.b(new r.a(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(interfaceC42851d).d(fVar2), null, lVar.f408156o, 2, null));
                if (tVarB == null) {
                    return null;
                }
                kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar2 = this.f408172m;
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f fVar3 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f(hVar2, lVar.f408155n, tVarB, null, 8, null);
                hVar2.f408253a.f408094s.getClass();
                return fVar3;
            }
            if (lVar.f408160s.invoke().contains(fVar2)) {
                kotlin.collections.builders.b bVarT = C42745f0.t();
                hVar.f408253a.f408099x.c(hVar, interfaceC42851d, fVar2, bVarT);
                kotlin.collections.builders.b bVarP = C42745f0.p(bVarT);
                int f38308i = bVarP.getF38308i();
                if (f38308i == 0) {
                    return null;
                }
                if (f38308i == 1) {
                    return (InterfaceC42851d) C42745f0.u0(bVarP);
                }
                throw new IllegalStateException(("Multiple classes with same name are generated: " + bVarP).toString());
            }
            k51.n nVar = lVar.f408161t.invoke().get(fVar2);
            if (nVar == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.storage.k kVarG = hVar.f408253a.f408076a.g(new m(lVar));
            kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = hVar.f408253a;
            return kotlin.reflect.jvm.internal.impl.descriptors.impl.r.F0(cVar.f408076a, lVar.f408155n, fVar2, kVarG, kotlin.reflect.jvm.internal.impl.load.java.lazy.f.a(hVar, nVar), cVar.f408085j.a(nVar));
        }
    }

    public /* synthetic */ l(kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, InterfaceC42851d interfaceC42851d, InterfaceC42522g interfaceC42522g, boolean z12, l lVar, int i12, C42822w c42822w) {
        this(hVar, interfaceC42851d, interfaceC42522g, z12, (i12 & 16) != 0 ? null : lVar);
    }

    public static a0 A(a0 a0Var, InterfaceC42905x interfaceC42905x, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return a0Var;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            a0 a0Var2 = (a0) it.next();
            if (!a0Var.equals(a0Var2) && a0Var2.A0() == null && D(a0Var2, interfaceC42905x)) {
                return (a0) a0Var.m0().d().build();
            }
        }
        return a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.reflect.jvm.internal.impl.descriptors.a0 B(kotlin.reflect.jvm.internal.impl.descriptors.a0 r4) {
        /*
            java.util.List r0 = r4.g()
            java.lang.Object r0 = kotlin.collections.C42745f0.S(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.k0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.k0) r0
            r1 = 0
            if (r0 == 0) goto L75
            kotlin.reflect.jvm.internal.impl.types.O r2 = r0.getType()
            kotlin.reflect.jvm.internal.impl.types.q0 r2 = r2.H0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r2 = r2.b()
            if (r2 == 0) goto L30
            int r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f409615a
            kotlin.reflect.jvm.internal.impl.name.d r2 = kotlin.reflect.jvm.internal.impl.resolve.j.g(r2)
            boolean r3 = r2.d()
            if (r3 == 0) goto L28
            goto L29
        L28:
            r2 = r1
        L29:
            if (r2 == 0) goto L30
            kotlin.reflect.jvm.internal.impl.name.c r2 = r2.g()
            goto L31
        L30:
            r2 = r1
        L31:
            kotlin.reflect.jvm.internal.impl.name.c r3 = kotlin.reflect.jvm.internal.impl.builtins.n.f407334g
            boolean r2 = kotlin.jvm.internal.L.f(r2, r3)
            if (r2 == 0) goto L3a
            goto L3b
        L3a:
            r0 = r1
        L3b:
            if (r0 != 0) goto L3e
            goto L75
        L3e:
            kotlin.reflect.jvm.internal.impl.descriptors.x$a r1 = r4.m0()
            java.util.List r4 = r4.g()
            java.util.List r4 = kotlin.collections.C42745f0.x(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.x$a r4 = r1.n(r4)
            kotlin.reflect.jvm.internal.impl.types.O r0 = r0.getType()
            java.util.List r0 = r0.F0()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            kotlin.reflect.jvm.internal.impl.types.x0 r0 = (kotlin.reflect.jvm.internal.impl.types.x0) r0
            kotlin.reflect.jvm.internal.impl.types.O r0 = r0.getType()
            kotlin.reflect.jvm.internal.impl.descriptors.x$a r4 = r4.f(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.x r4 = r4.build()
            kotlin.reflect.jvm.internal.impl.descriptors.a0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.a0) r4
            r0 = r4
            kotlin.reflect.jvm.internal.impl.descriptors.impl.P r0 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.P) r0
            if (r0 != 0) goto L71
            goto L74
        L71:
            r1 = 1
            r0.f407724w = r1
        L74:
            return r4
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.l.B(kotlin.reflect.jvm.internal.impl.descriptors.a0):kotlin.reflect.jvm.internal.impl.descriptors.a0");
    }

    public static boolean D(InterfaceC42905x interfaceC42905x, InterfaceC42905x interfaceC42905x2) {
        if (OverridingUtil.f409560e.n(interfaceC42905x2, interfaceC42905x, true).c() == OverridingUtil.OverrideCompatibilityInfo.Result.f409567b) {
            kotlin.reflect.jvm.internal.impl.load.java.v.f408412a.getClass();
            if (!v.a.a(interfaceC42905x2, interfaceC42905x)) {
                return true;
            }
        }
        return false;
    }

    public static boolean E(a0 a0Var, a0 a0Var2) {
        C42913f.f408060m.getClass();
        InterfaceC42905x interfaceC42905xN0 = a0Var2;
        if (L.f(a0Var.getName().b(), "removeAt")) {
            String strB = E.b(a0Var);
            SpecialGenericSignatures.f407963a.getClass();
            interfaceC42905xN0 = a0Var2;
            if (L.f(strB, SpecialGenericSignatures.f407970h.f407991e)) {
                interfaceC42905xN0 = a0Var2.n0();
            }
        }
        return D(interfaceC42905xN0, a0Var);
    }

    public static a0 F(U u12, String str, Y41.l lVar) {
        a0 a0Var;
        Iterator it = ((Iterable) lVar.invoke(kotlin.reflect.jvm.internal.impl.name.f.e(str))).iterator();
        do {
            a0Var = null;
            if (!it.hasNext()) {
                break;
            }
            a0 a0Var2 = (a0) it.next();
            if (a0Var2.g().size() == 0) {
                kotlin.reflect.jvm.internal.impl.types.checker.q qVar = InterfaceC42970f.f410097a;
                O returnType = a0Var2.getReturnType();
                if (returnType == null ? false : qVar.d(returnType, u12.getType())) {
                    a0Var = a0Var2;
                }
            }
        } while (a0Var == null);
        return a0Var;
    }

    public static a0 H(U u12, Y41.l lVar) {
        a0 a0Var;
        O returnType;
        String strB = u12.getName().b();
        D d12 = D.f407911a;
        StringBuilder sb2 = new StringBuilder("set");
        sb2.append(D.b(strB) ? strB.substring(2) : C49167a.a(strB));
        Iterator it = ((Iterable) lVar.invoke(kotlin.reflect.jvm.internal.impl.name.f.e(sb2.toString()))).iterator();
        do {
            a0Var = null;
            if (!it.hasNext()) {
                break;
            }
            a0 a0Var2 = (a0) it.next();
            if (a0Var2.g().size() == 1 && (returnType = a0Var2.getReturnType()) != null) {
                kotlin.reflect.jvm.internal.impl.name.f fVar = kotlin.reflect.jvm.internal.impl.builtins.k.f407311f;
                if (kotlin.reflect.jvm.internal.impl.builtins.k.C(returnType, n.a.f407379e) && InterfaceC42970f.f410097a.b(((k0) C42745f0.u0(a0Var2.g())).getType(), u12.getType())) {
                    a0Var = a0Var2;
                }
            }
        } while (a0Var == null);
        return a0Var;
    }

    public static final ArrayList u(l lVar, kotlin.reflect.jvm.internal.impl.name.f fVar) {
        Collection<k51.r> collectionE = lVar.f408203e.invoke().e(fVar);
        ArrayList arrayList = new ArrayList(C42745f0.q(collectionE, 10));
        Iterator<T> it = collectionE.iterator();
        while (it.hasNext()) {
            arrayList.add(lVar.s((k51.r) it.next()));
        }
        return arrayList;
    }

    public static final ArrayList v(l lVar, kotlin.reflect.jvm.internal.impl.name.f fVar) {
        LinkedHashSet linkedHashSetI = lVar.I(fVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetI) {
            a0 a0Var = (a0) obj;
            if (J.b(a0Var) == null && C42914g.a(a0Var) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean C(U u12, Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends a0>> lVar) {
        if (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c.a(u12)) {
            return false;
        }
        a0 a0VarG = G(u12, lVar);
        a0 a0VarH = H(u12, lVar);
        if (a0VarG == null) {
            return false;
        }
        if (u12.c0()) {
            return a0VarH != null && a0VarH.i() == a0VarG.i();
        }
        return true;
    }

    public final a0 G(U u12, Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends a0>> lVar) {
        M getter = u12.getGetter();
        String strA = null;
        kotlin.reflect.jvm.internal.impl.descriptors.V v12 = getter != null ? (kotlin.reflect.jvm.internal.impl.descriptors.V) J.b(getter) : null;
        if (v12 != null) {
            C42918k.f408069a.getClass();
            strA = C42918k.a(v12);
        }
        return (strA == null || J.d(this.f408155n, v12)) ? F(u12, D.a(u12.getName().b()), lVar) : F(u12, strA, lVar);
    }

    public final LinkedHashSet I(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        boolean z12 = this.f408157p;
        InterfaceC42851d interfaceC42851d = this.f408155n;
        Collection<O> collectionC = z12 ? interfaceC42851d.l().C() : this.f408200b.f408253a.f408096u.a().b(interfaceC42851d);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = collectionC.iterator();
        while (it.hasNext()) {
            C42745f0.h(((O) it.next()).n().d(fVar, NoLookupLocation.f407888f), linkedHashSet);
        }
        return linkedHashSet;
    }

    public final Set<U> J(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        boolean z12 = this.f408157p;
        InterfaceC42851d interfaceC42851d = this.f408155n;
        Collection<O> collectionC = z12 ? interfaceC42851d.l().C() : this.f408200b.f408253a.f408096u.a().b(interfaceC42851d);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionC.iterator();
        while (it.hasNext()) {
            Collection collectionF = ((O) it.next()).n().f(fVar, NoLookupLocation.f407888f);
            ArrayList arrayList2 = new ArrayList(C42745f0.q(collectionF, 10));
            Iterator it2 = collectionF.iterator();
            while (it2.hasNext()) {
                arrayList2.add((U) it2.next());
            }
            C42745f0.h(arrayList2, arrayList);
        }
        return C42745f0.P0(arrayList);
    }

    public final boolean K(a0 a0Var) {
        Iterable iterableV;
        kotlin.reflect.jvm.internal.impl.name.f name = a0Var.getName();
        String strB = name.b();
        D d12 = D.f407911a;
        if (C43066x.h0(strB, "get", false) || C43066x.h0(strB, "is", false)) {
            kotlin.reflect.jvm.internal.impl.name.f fVarA = I.a(name, "get", null, 12);
            if (fVarA == null) {
                fVarA = I.a(name, "is", null, 8);
            }
            iterableV = C42745f0.V(fVarA);
        } else if (C43066x.h0(strB, "set", false)) {
            iterableV = C42756l.B(new kotlin.reflect.jvm.internal.impl.name.f[]{I.a(name, "set", null, 4), I.a(name, "set", "is", 4)});
        } else {
            C42916i.f408064a.getClass();
            iterableV = (List) C42916i.f408066c.get(name);
            if (iterableV == null) {
                iterableV = C42784z0.f406748b;
            }
        }
        Iterable iterable = iterableV;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Set<U> setJ = J((kotlin.reflect.jvm.internal.impl.name.f) it.next());
                if (!(setJ instanceof Collection) || !setJ.isEmpty()) {
                    for (U u12 : setJ) {
                        if (C(u12, new d(a0Var, this)) && (u12.c0() || !C43066x.h0(a0Var.getName().b(), "set", false))) {
                            return false;
                        }
                    }
                }
            }
        }
        SpecialGenericSignatures.a aVar = SpecialGenericSignatures.f407963a;
        kotlin.reflect.jvm.internal.impl.name.f name2 = a0Var.getName();
        aVar.getClass();
        kotlin.reflect.jvm.internal.impl.name.f fVar = (kotlin.reflect.jvm.internal.impl.name.f) SpecialGenericSignatures.f407974l.get(name2);
        if (fVar != null) {
            LinkedHashSet linkedHashSetI = I(fVar);
            ArrayList arrayList = new ArrayList();
            for (Object obj : linkedHashSetI) {
                if (J.b((a0) obj) != null) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                InterfaceC42905x.a<? extends InterfaceC42905x> aVarM0 = a0Var.m0();
                aVarM0.e(fVar);
                aVarM0.r();
                aVarM0.m();
                a0 a0Var2 = (a0) aVarM0.build();
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (E((a0) it2.next(), a0Var2)) {
                            return false;
                        }
                    }
                }
            }
        }
        C42914g c42914g = C42914g.f408061m;
        kotlin.reflect.jvm.internal.impl.name.f name3 = a0Var.getName();
        c42914g.getClass();
        if (C42914g.b(name3)) {
            LinkedHashSet linkedHashSetI2 = I(a0Var.getName());
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = linkedHashSetI2.iterator();
            while (it3.hasNext()) {
                InterfaceC42905x interfaceC42905xA = C42914g.a((a0) it3.next());
                if (interfaceC42905xA != null) {
                    arrayList2.add(interfaceC42905xA);
                }
            }
            if (!arrayList2.isEmpty()) {
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    InterfaceC42905x interfaceC42905x = (InterfaceC42905x) it4.next();
                    if (E.a(a0Var, 2).equals(E.a(interfaceC42905x.n0(), 2)) && !D(a0Var, interfaceC42905x)) {
                        return false;
                    }
                }
            }
        }
        a0 a0VarB = B(a0Var);
        if (a0VarB != null) {
            LinkedHashSet<a0> linkedHashSetI3 = I(a0Var.getName());
            if (!linkedHashSetI3.isEmpty()) {
                for (a0 a0Var3 : linkedHashSetI3) {
                    if (a0Var3.isSuspend() && D(a0VarB, a0Var3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p, kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Collection<a0> d(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC41228b interfaceC41228b) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = this.f408200b.f408253a;
        C40774a.a(cVar.f408089n, interfaceC41228b, this.f408155n, fVar);
        return super.d(fVar, interfaceC41228b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p, kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Collection f(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k NoLookupLocation noLookupLocation) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = this.f408200b.f408253a;
        C40774a.a(cVar.f408089n, noLookupLocation, this.f408155n, fVar);
        return super.f(fVar, noLookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    @Y61.l
    public final InterfaceC42853f g(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC41228b interfaceC41228b) {
        kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.name.f, InterfaceC42851d> jVar;
        InterfaceC42851d interfaceC42851dInvoke;
        C40774a.a(this.f408200b.f408253a.f408089n, interfaceC41228b, this.f408155n, fVar);
        l lVar = (l) this.f408201c;
        return (lVar == null || (jVar = lVar.f408162u) == null || (interfaceC42851dInvoke = jVar.invoke(fVar)) == null) ? this.f408162u.invoke(fVar) : interfaceC42851dInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    @Y61.k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> h(@Y61.k kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @Y61.l Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        return b1.h(this.f408159r.invoke(), this.f408161t.invoke().keySet());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    public final Set i(kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, Y41.l lVar) {
        InterfaceC42851d interfaceC42851d = this.f408155n;
        Collection<O> collectionC = interfaceC42851d.l().C();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = collectionC.iterator();
        while (it.hasNext()) {
            C42745f0.h(((O) it.next()).n().a(), linkedHashSet);
        }
        kotlin.reflect.jvm.internal.impl.storage.k<InterfaceC42920b> kVar = this.f408203e;
        linkedHashSet.addAll(kVar.invoke().a());
        linkedHashSet.addAll(kVar.invoke().c());
        linkedHashSet.addAll(h(dVar, lVar));
        kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar = this.f408200b;
        linkedHashSet.addAll(hVar.f408253a.f408099x.e(hVar, interfaceC42851d));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    public final void j(@Y61.k ArrayList arrayList, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        boolean zA2 = this.f408156o.A();
        InterfaceC42851d interfaceC42851d = this.f408155n;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar = this.f408200b;
        if (zA2) {
            kotlin.reflect.jvm.internal.impl.storage.k<InterfaceC42920b> kVar = this.f408203e;
            if (kVar.invoke().f(fVar) != null) {
                if (arrayList.isEmpty()) {
                    k51.w wVarF = kVar.invoke().f(fVar);
                    kotlin.reflect.jvm.internal.impl.load.java.lazy.e eVarA = kotlin.reflect.jvm.internal.impl.load.java.lazy.f.a(hVar, wVarF);
                    kotlin.reflect.jvm.internal.impl.name.f name = wVarF.getName();
                    kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = hVar.f408253a;
                    kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVarT0 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.T0(interfaceC42851d, eVarA, name, cVar.f408085j.a(wVarF), true);
                    kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVarA = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.a(TypeUsage.f410066c, false, null, 6);
                    O oD2 = hVar.f408257e.d(wVarF.getType(), aVarA);
                    X xO2 = o();
                    C42784z0 c42784z0 = C42784z0.f406748b;
                    Modality.f407438b.getClass();
                    eVarT0.S0(null, xO2, c42784z0, c42784z0, c42784z0, oD2, Modality.a.a(false, false, true), kotlin.reflect.jvm.internal.impl.descriptors.r.f407789e, null);
                    eVarT0.U0(false, false);
                    cVar.f408082g.b(wVarF, eVarT0);
                    arrayList.add(eVarT0);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((a0) it.next()).g().isEmpty()) {
                            break;
                        }
                    }
                    k51.w wVarF2 = kVar.invoke().f(fVar);
                    kotlin.reflect.jvm.internal.impl.load.java.lazy.e eVarA2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.f.a(hVar, wVarF2);
                    kotlin.reflect.jvm.internal.impl.name.f name2 = wVarF2.getName();
                    kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar2 = hVar.f408253a;
                    kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVarT02 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.T0(interfaceC42851d, eVarA2, name2, cVar2.f408085j.a(wVarF2), true);
                    kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVarA2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.a(TypeUsage.f410066c, false, null, 6);
                    O oD22 = hVar.f408257e.d(wVarF2.getType(), aVarA2);
                    X xO22 = o();
                    C42784z0 c42784z02 = C42784z0.f406748b;
                    Modality.f407438b.getClass();
                    eVarT02.S0(null, xO22, c42784z02, c42784z02, c42784z02, oD22, Modality.a.a(false, false, true), kotlin.reflect.jvm.internal.impl.descriptors.r.f407789e, null);
                    eVarT02.U0(false, false);
                    cVar2.f408082g.b(wVarF2, eVarT02);
                    arrayList.add(eVarT02);
                }
            }
        }
        hVar.f408253a.f408099x.d(hVar, interfaceC42851d, fVar, arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    public final InterfaceC42920b k() {
        return new C42919a(this.f408156o, g.f408152l);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    public final void l(@Y61.k LinkedHashSet linkedHashSet, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        LinkedHashSet linkedHashSetI = I(fVar);
        SpecialGenericSignatures.f407963a.getClass();
        if (!SpecialGenericSignatures.f407973k.contains(fVar)) {
            C42914g.f408061m.getClass();
            if (!C42914g.b(fVar)) {
                if (!linkedHashSetI.isEmpty()) {
                    Iterator it = linkedHashSetI.iterator();
                    while (it.hasNext()) {
                        if (((InterfaceC42905x) it.next()).isSuspend()) {
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : linkedHashSetI) {
                    if (K((a0) obj)) {
                        arrayList.add(obj);
                    }
                }
                x(linkedHashSet, fVar, arrayList, false);
                return;
            }
        }
        kotlin.reflect.jvm.internal.impl.utils.g.f410367d.getClass();
        kotlin.reflect.jvm.internal.impl.utils.g gVarA = g.b.a();
        LinkedHashSet linkedHashSetD = kotlin.reflect.jvm.internal.impl.load.java.components.b.d(fVar, linkedHashSetI, C42784z0.f406748b, this.f408155n, kotlin.reflect.jvm.internal.impl.serialization.deserialization.s.f409955a, this.f408200b.f408253a.f408096u.c());
        y(fVar, linkedHashSet, linkedHashSetD, linkedHashSet, new h(1, this));
        y(fVar, linkedHashSet, linkedHashSetD, gVarA, new i(1, this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : linkedHashSetI) {
            if (K((a0) obj2)) {
                arrayList2.add(obj2);
            }
        }
        x(linkedHashSet, fVar, C42745f0.h0(gVarA, arrayList2), true);
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    public final void m(@Y61.k ArrayList arrayList, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        k51.r rVar;
        boolean zN2 = this.f408156o.N();
        kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar = this.f408200b;
        if (zN2 && (rVar = (k51.r) C42745f0.v0(this.f408203e.invoke().e(fVar))) != null) {
            Modality.a aVar = Modality.f407438b;
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.f fVarM0 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.f.M0(this.f408155n, kotlin.reflect.jvm.internal.impl.load.java.lazy.f.a(hVar, rVar), K.a(rVar.getVisibility()), false, rVar.getName(), hVar.f408253a.f408085j.a(rVar), false);
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
            M mC2 = kotlin.reflect.jvm.internal.impl.resolve.i.c(fVarM0, g.a.f407524b);
            fVarM0.J0(mC2, null, null, null);
            kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVarA = kotlin.reflect.jvm.internal.impl.load.java.lazy.b.a(hVar, fVarM0, rVar, 0, hVar.f408255c);
            O oD2 = hVarA.f408257e.d(rVar.m(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.a(TypeUsage.f410066c, rVar.k().f407871a.isAnnotation(), null, 6));
            C42784z0 c42784z0 = C42784z0.f406748b;
            fVarM0.L0(oD2, c42784z0, o(), null, c42784z0);
            mC2.f407611n = oD2;
            arrayList.add(fVarM0);
        }
        Set<U> setJ = J(fVar);
        if (setJ.isEmpty()) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.utils.g.f410367d.getClass();
        kotlin.reflect.jvm.internal.impl.utils.g gVarA = g.b.a();
        kotlin.reflect.jvm.internal.impl.utils.g gVarA2 = g.b.a();
        z(setJ, arrayList, gVarA, new j(this));
        z(b1.f(setJ, gVarA), gVarA2, null, new k(this));
        LinkedHashSet linkedHashSetH = b1.h(setJ, gVarA2);
        kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = hVar.f408253a;
        arrayList.addAll(kotlin.reflect.jvm.internal.impl.load.java.components.b.d(fVar, linkedHashSetH, arrayList, this.f408155n, cVar.f408081f, cVar.f408096u.c()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    @Y61.k
    public final Set n() {
        if (this.f408156o.N()) {
            return a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.f408203e.invoke().d());
        Iterator<T> it = this.f408155n.l().C().iterator();
        while (it.hasNext()) {
            C42745f0.h(((O) it.next()).n().b(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    @Y61.l
    public final X o() {
        InterfaceC42851d interfaceC42851d = this.f408155n;
        if (interfaceC42851d != null) {
            int i12 = kotlin.reflect.jvm.internal.impl.resolve.j.f409625a;
            return interfaceC42851d.p0();
        }
        kotlin.reflect.jvm.internal.impl.resolve.j.a(0);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    public final InterfaceC42882k p() {
        return this.f408155n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    public final boolean q(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar) {
        if (this.f408156o.N()) {
            return false;
        }
        return K(eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    @Y61.k
    public final p.a r(@Y61.k k51.r rVar, @Y61.k ArrayList arrayList, @Y61.k O o12, @Y61.k List list) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = this.f408200b.f408253a;
        l.b bVarB = cVar.f408080e.b(rVar, this.f408155n, o12, list, arrayList);
        O o13 = bVarB.f408037a;
        List<k0> list2 = bVarB.f408038b;
        if (list2 == null) {
            l.b.a(5);
            throw null;
        }
        ArrayList arrayList2 = bVarB.f408039c;
        List<String> list3 = bVarB.f408040d;
        if (list3 != null) {
            return new p.a(o13, list2, arrayList2, list3);
        }
        l.b.a(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    @Y61.k
    public final String toString() {
        return "Lazy Java member scope for " + this.f408156o.d();
    }

    public final void w(ArrayList arrayList, kotlin.reflect.jvm.internal.impl.load.java.descriptors.b bVar, int i12, k51.r rVar, O o12, O o13) {
        l lVar;
        J0 j0H;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
        g.a.C11652a c11652a = g.a.f407524b;
        kotlin.reflect.jvm.internal.impl.name.f name = rVar.getName();
        if (o12 == null) {
            G0.a(2);
            throw null;
        }
        J0 j0H2 = G0.h(o12, false);
        boolean zO2 = rVar.o();
        if (o13 != null) {
            j0H = G0.h(o13, false);
            lVar = this;
        } else {
            lVar = this;
            j0H = null;
        }
        arrayList.add(new V(bVar, null, i12, c11652a, name, j0H2, zO2, false, false, j0H, lVar.f408200b.f408253a.f408085j.a(rVar)));
    }

    public final void x(LinkedHashSet linkedHashSet, kotlin.reflect.jvm.internal.impl.name.f fVar, ArrayList arrayList, boolean z12) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = this.f408200b.f408253a;
        LinkedHashSet<a0> linkedHashSetD = kotlin.reflect.jvm.internal.impl.load.java.components.b.d(fVar, arrayList, linkedHashSet, this.f408155n, cVar.f408081f, cVar.f408096u.c());
        if (!z12) {
            linkedHashSet.addAll(linkedHashSetD);
            return;
        }
        ArrayList arrayListH0 = C42745f0.h0(linkedHashSetD, linkedHashSet);
        ArrayList arrayList2 = new ArrayList(C42745f0.q(linkedHashSetD, 10));
        for (a0 a0VarA : linkedHashSetD) {
            a0 a0Var = (a0) J.c(a0VarA);
            if (a0Var != null) {
                a0VarA = A(a0VarA, a0Var, arrayListH0);
            }
            arrayList2.add(a0VarA);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(kotlin.reflect.jvm.internal.impl.name.f r10, java.util.LinkedHashSet r11, java.util.LinkedHashSet r12, java.util.AbstractSet r13, Y41.l r14) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.l.y(kotlin.reflect.jvm.internal.impl.name.f, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.AbstractSet, Y41.l):void");
    }

    public final void z(Set set, AbstractCollection abstractCollection, kotlin.reflect.jvm.internal.impl.utils.g gVar, Y41.l lVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.N nK2;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            U u12 = (U) it.next();
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.d dVar = null;
            if (C(u12, lVar)) {
                a0 a0VarG = G(u12, lVar);
                a0 a0VarH = u12.c0() ? H(u12, lVar) : null;
                if (a0VarH != null) {
                    a0VarH.i();
                    a0VarG.i();
                }
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.d dVar2 = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.d(this.f408155n, a0VarG, a0VarH, u12);
                O returnType = a0VarG.getReturnType();
                C42784z0 c42784z0 = C42784z0.f406748b;
                dVar2.L0(returnType, c42784z0, o(), null, c42784z0);
                M mI2 = kotlin.reflect.jvm.internal.impl.resolve.i.i(dVar2, a0VarG.getAnnotations(), false, a0VarG.e());
                mI2.f407581m = a0VarG;
                mI2.H0(dVar2.getType());
                if (a0VarH != null) {
                    k0 k0Var = (k0) C42745f0.G(a0VarH.g());
                    if (k0Var == null) {
                        throw new AssertionError("No parameter found for " + a0VarH);
                    }
                    nK2 = kotlin.reflect.jvm.internal.impl.resolve.i.k(dVar2, a0VarH.getAnnotations(), k0Var.getAnnotations(), false, a0VarH.getVisibility(), a0VarH.e());
                    nK2.f407581m = a0VarH;
                } else {
                    nK2 = null;
                }
                dVar2.J0(mI2, nK2, null, null);
                dVar = dVar2;
            }
            if (dVar != null) {
                abstractCollection.add(dVar);
                if (gVar != null) {
                    gVar.add(u12);
                    return;
                }
                return;
            }
        }
    }

    public l(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, @Y61.k InterfaceC42851d interfaceC42851d, @Y61.k InterfaceC42522g interfaceC42522g, boolean z12, @Y61.l l lVar) {
        super(hVar, lVar);
        this.f408155n = interfaceC42851d;
        this.f408156o = interfaceC42522g;
        this.f408157p = z12;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = hVar.f408253a;
        a aVar = new a(hVar, this);
        kotlin.reflect.jvm.internal.impl.storage.p pVar = cVar.f408076a;
        this.f408158q = pVar.g(aVar);
        this.f408159r = pVar.g(new e());
        this.f408160s = pVar.g(new c(hVar, this));
        this.f408161t = pVar.g(new b());
        this.f408162u = pVar.b(new f(hVar, this));
    }
}
