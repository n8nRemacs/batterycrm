package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import i51.InterfaceC41228b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k51.InterfaceC42522g;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.U;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;

/* compiled from: LazyJavaStaticClassScope.kt */
@s0
/* loaded from: classes8.dex */
public final class z extends A {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f408241p = 0;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42522g f408242n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final f f408243o;

    public z(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, @Y61.k InterfaceC42522g interfaceC42522g, @Y61.k f fVar) {
        super(hVar);
        this.f408242n = interfaceC42522g;
        this.f408243o = fVar;
    }

    public static U u(U u12) {
        CallableMemberDescriptor.Kind kind = u12.getKind();
        kind.getClass();
        if (kind != CallableMemberDescriptor.Kind.f407409c) {
            return u12;
        }
        Collection<? extends CallableMemberDescriptor> collectionP = u12.p();
        ArrayList arrayList = new ArrayList(C42745f0.q(collectionP, 10));
        Iterator<T> it = collectionP.iterator();
        while (it.hasNext()) {
            arrayList.add(u((U) it.next()));
        }
        return (U) C42745f0.u0(C42745f0.v(arrayList));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    @Y61.l
    public final InterfaceC42853f g(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC41228b interfaceC41228b) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    @Y61.k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> h(@Y61.k kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @Y61.l Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        return B0.f406639b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    @Y61.k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> i(@Y61.k kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @Y61.l Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        LinkedHashSet linkedHashSetO0 = C42745f0.O0(this.f408203e.invoke().a());
        f fVar = this.f408243o;
        z zVarB = kotlin.reflect.jvm.internal.impl.load.java.descriptors.h.b(fVar);
        Set<kotlin.reflect.jvm.internal.impl.name.f> setA = zVarB != null ? zVarB.a() : null;
        if (setA == null) {
            setA = B0.f406639b;
        }
        linkedHashSetO0.addAll(setA);
        if (this.f408242n.I()) {
            linkedHashSetO0.addAll(C42745f0.U(kotlin.reflect.jvm.internal.impl.builtins.n.f407330c, kotlin.reflect.jvm.internal.impl.builtins.n.f407328a));
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar = this.f408200b;
        linkedHashSetO0.addAll(hVar.f408253a.f408099x.b(hVar, fVar));
        return linkedHashSetO0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    public final void j(@Y61.k ArrayList arrayList, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar = this.f408200b;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = hVar.f408253a;
        cVar.f408099x.f(hVar, this.f408243o, fVar, arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    public final InterfaceC42920b k() {
        return new C42919a(this.f408242n, u.f408234l);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    public final void l(@Y61.k LinkedHashSet linkedHashSet, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        f fVar2 = this.f408243o;
        z zVarB = kotlin.reflect.jvm.internal.impl.load.java.descriptors.h.b(fVar2);
        Collection collectionP0 = zVarB == null ? B0.f406639b : C42745f0.P0(zVarB.d(fVar, NoLookupLocation.f407888f));
        kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = this.f408200b.f408253a;
        linkedHashSet.addAll(kotlin.reflect.jvm.internal.impl.load.java.components.b.e(fVar, collectionP0, linkedHashSet, this.f408243o, cVar.f408081f, cVar.f408096u.c()));
        if (this.f408242n.I()) {
            if (fVar.equals(kotlin.reflect.jvm.internal.impl.builtins.n.f407330c)) {
                linkedHashSet.add(kotlin.reflect.jvm.internal.impl.resolve.i.f(fVar2));
            } else if (fVar.equals(kotlin.reflect.jvm.internal.impl.builtins.n.f407328a)) {
                linkedHashSet.add(kotlin.reflect.jvm.internal.impl.resolve.i.g(fVar2));
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.A, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    public final void m(@Y61.k ArrayList arrayList, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        v vVar = new v(fVar);
        f fVar2 = this.f408243o;
        kotlin.reflect.jvm.internal.impl.utils.b.b(Collections.singletonList(fVar2), t.f408233a, new y(fVar2, linkedHashSet, vVar));
        boolean zIsEmpty = arrayList.isEmpty();
        kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar = this.f408200b;
        if (zIsEmpty) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                U u12 = u((U) obj);
                Object arrayList2 = linkedHashMap.get(u12);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(u12, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = hVar.f408253a;
                C42745f0.h(kotlin.reflect.jvm.internal.impl.load.java.components.b.e(fVar, collection, arrayList, this.f408243o, cVar.f408081f, cVar.f408096u.c()), arrayList3);
            }
            arrayList.addAll(arrayList3);
        } else {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar2 = hVar.f408253a;
            arrayList.addAll(kotlin.reflect.jvm.internal.impl.load.java.components.b.e(fVar, linkedHashSet, arrayList, this.f408243o, cVar2.f408081f, cVar2.f408096u.c()));
        }
        if (this.f408242n.I() && fVar.equals(kotlin.reflect.jvm.internal.impl.builtins.n.f407329b)) {
            kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, kotlin.reflect.jvm.internal.impl.resolve.i.e(fVar2));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    @Y61.k
    public final Set n() {
        LinkedHashSet linkedHashSetO0 = C42745f0.O0(this.f408203e.invoke().d());
        w wVar = w.f408236l;
        f fVar = this.f408243o;
        kotlin.reflect.jvm.internal.impl.utils.b.b(Collections.singletonList(fVar), t.f408233a, new y(fVar, linkedHashSetO0, wVar));
        if (this.f408242n.I()) {
            linkedHashSetO0.add(kotlin.reflect.jvm.internal.impl.builtins.n.f407329b);
        }
        return linkedHashSetO0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    public final InterfaceC42882k p() {
        return this.f408243o;
    }
}
