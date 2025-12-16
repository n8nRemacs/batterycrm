package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import i51.InterfaceC41228b;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42854g;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.j;
import w51.C49448a;

/* compiled from: ChainedMemberScope.kt */
@s0
/* loaded from: classes8.dex */
public final class b implements j {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f409648d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f409649b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final j[] f409650c;

    /* compiled from: ChainedMemberScope.kt */
    @s0
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static j a(@Y61.k Iterable iterable, @Y61.k String str) {
            kotlin.reflect.jvm.internal.impl.utils.f fVar = new kotlin.reflect.jvm.internal.impl.utils.f();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                if (jVar != j.c.f409687b) {
                    if (jVar instanceof b) {
                        C42745f0.i(fVar, ((b) jVar).f409650c);
                    } else {
                        fVar.add(jVar);
                    }
                }
            }
            return b(str, fVar);
        }

        @Y61.k
        public static j b(@Y61.k String str, @Y61.k kotlin.reflect.jvm.internal.impl.utils.f fVar) {
            int i12 = fVar.f410361b;
            return i12 != 0 ? i12 != 1 ? new b(str, (j[]) fVar.toArray(new j[0]), null) : (j) fVar.get(0) : j.c.f409687b;
        }

        public a() {
        }
    }

    public b(String str, j[] jVarArr, C42822w c42822w) {
        this.f409649b = str;
        this.f409650c = jVarArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (j jVar : this.f409650c) {
            C42745f0.h(jVar.a(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (j jVar : this.f409650c) {
            C42745f0.h(jVar.b(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.l
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        return l.a(C42756l.e(this.f409650c));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Collection<a0> d(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC41228b interfaceC41228b) {
        j[] jVarArr = this.f409650c;
        int length = jVarArr.length;
        if (length == 0) {
            return C42784z0.f406748b;
        }
        if (length == 1) {
            return jVarArr[0].d(fVar, interfaceC41228b);
        }
        Collection<a0> collectionA = null;
        for (j jVar : jVarArr) {
            collectionA = C49448a.a(collectionA, jVar.d(fVar, interfaceC41228b));
        }
        return collectionA == null ? B0.f406639b : collectionA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    @Y61.k
    public final Collection<InterfaceC42882k> e(@Y61.k d dVar, @Y61.k Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        j[] jVarArr = this.f409650c;
        int length = jVarArr.length;
        if (length == 0) {
            return C42784z0.f406748b;
        }
        if (length == 1) {
            return jVarArr[0].e(dVar, lVar);
        }
        Collection<InterfaceC42882k> collectionA = null;
        for (j jVar : jVarArr) {
            collectionA = C49448a.a(collectionA, jVar.e(dVar, lVar));
        }
        return collectionA == null ? B0.f406639b : collectionA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Collection f(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k NoLookupLocation noLookupLocation) {
        j[] jVarArr = this.f409650c;
        int length = jVarArr.length;
        if (length == 0) {
            return C42784z0.f406748b;
        }
        if (length == 1) {
            return jVarArr[0].f(fVar, noLookupLocation);
        }
        Collection collectionA = null;
        for (j jVar : jVarArr) {
            collectionA = C49448a.a(collectionA, jVar.f(fVar, noLookupLocation));
        }
        return collectionA == null ? B0.f406639b : collectionA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    @Y61.l
    public final InterfaceC42853f g(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC41228b interfaceC41228b) {
        InterfaceC42853f interfaceC42853f = null;
        for (j jVar : this.f409650c) {
            InterfaceC42853f interfaceC42853fG = jVar.g(fVar, interfaceC41228b);
            if (interfaceC42853fG != null) {
                if (!(interfaceC42853fG instanceof InterfaceC42854g) || !((InterfaceC42854g) interfaceC42853fG).O()) {
                    return interfaceC42853fG;
                }
                if (interfaceC42853f == null) {
                    interfaceC42853f = interfaceC42853fG;
                }
            }
        }
        return interfaceC42853f;
    }

    @Y61.k
    public final String toString() {
        return this.f409649b;
    }
}
