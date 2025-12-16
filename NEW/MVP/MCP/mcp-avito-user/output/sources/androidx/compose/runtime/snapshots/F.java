package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.F3;
import androidx.compose.runtime.external.kotlinx.collections.immutable.h;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SnapshotStateMap.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/snapshots/F;", "K", "V", "Landroidx/compose/runtime/snapshots/V;", "", "<init>", "()V", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@F3
/* loaded from: classes.dex */
public final class F<K, V> implements V, Map<K, V>, Z41.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public a f38620b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Set<Map.Entry<K, V>> f38621c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Set<K> f38622d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Collection<V> f38623e;

    /* compiled from: SnapshotStateMap.kt */
    @androidx.compose.runtime.internal.P
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/F$a;", "K", "V", "Landroidx/compose/runtime/snapshots/X;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<K, V> extends X {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, ? extends V> f38624c;

        /* renamed from: d, reason: collision with root package name */
        public int f38625d;

        public a(long j12, @Y61.k androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, ? extends V> hVar) {
            super(j12);
            this.f38624c = hVar;
        }

        @Override // androidx.compose.runtime.snapshots.X
        public final void a(@Y61.k X x12) {
            a aVar = (a) x12;
            synchronized (G.f38626a) {
                this.f38624c = aVar.f38624c;
                this.f38625d = aVar.f38625d;
                G0 g02 = G0.f406611a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.X
        @Y61.k
        public final X b() {
            return new a(C22176v.j().getF38722b(), this.f38624c);
        }

        @Override // androidx.compose.runtime.snapshots.X
        @Y61.k
        public final X c(long j12) {
            return new a(j12, this.f38624c);
        }
    }

    public F() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.f38327g.getClass();
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d dVar = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.f38328h;
        AbstractC22167l abstractC22167lJ = C22176v.j();
        a aVar = new a(abstractC22167lJ.getF38722b(), dVar);
        if (!(abstractC22167lJ instanceof C22158c)) {
            aVar.f38675b = new a(1, dVar);
        }
        this.f38620b = aVar;
        this.f38621c = new C22179y(this);
        this.f38622d = new C22180z(this);
        this.f38623e = new B(this);
    }

    public static final boolean b(F f12, a aVar, int i12, androidx.compose.runtime.external.kotlinx.collections.immutable.h hVar) {
        boolean z12;
        synchronized (G.f38626a) {
            int i13 = aVar.f38625d;
            if (i13 == i12) {
                aVar.f38624c = hVar;
                z12 = true;
                aVar.f38625d = i13 + 1;
            } else {
                z12 = false;
            }
        }
        return z12;
    }

    @Y61.k
    public final a<K, V> c() {
        return (a) C22176v.s(this.f38620b, this);
    }

    @Override // java.util.Map
    public final void clear() {
        AbstractC22167l abstractC22167lJ;
        a aVar = (a) C22176v.h(this.f38620b);
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.f38327g.getClass();
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d dVar = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.f38328h;
        if (dVar != aVar.f38624c) {
            a aVar2 = this.f38620b;
            synchronized (C22176v.f38750c) {
                AbstractC22167l.f38720e.getClass();
                abstractC22167lJ = C22176v.j();
                a aVar3 = (a) C22176v.v(aVar2, this, abstractC22167lJ);
                synchronized (G.f38626a) {
                    aVar3.f38624c = dVar;
                    aVar3.f38625d++;
                }
            }
            C22176v.m(abstractC22167lJ, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return c().f38624c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return c().f38624c.containsValue(obj);
    }

    @Override // androidx.compose.runtime.snapshots.V
    @Y61.k
    public final X d() {
        return this.f38620b;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.f38621c;
    }

    @Override // java.util.Map
    @Y61.l
    public final V get(Object obj) {
        return c().f38624c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return c().f38624c.isEmpty();
    }

    @Override // androidx.compose.runtime.snapshots.V
    public final void j(@Y61.k X x12) {
        this.f38620b = (a) x12;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.f38622d;
    }

    @Override // java.util.Map
    @Y61.l
    public final V put(K k12, V v12) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, ? extends V> hVar;
        int i12;
        V vPut;
        AbstractC22167l abstractC22167lJ;
        boolean zB2;
        do {
            synchronized (G.f38626a) {
                a aVar = (a) C22176v.h(this.f38620b);
                hVar = aVar.f38624c;
                i12 = aVar.f38625d;
                G0 g02 = G0.f406611a;
            }
            h.a<K, ? extends V> aVarBuilder = hVar.builder();
            vPut = aVarBuilder.put(k12, v12);
            androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, ? extends V> hVarBuild = aVarBuilder.d();
            if (kotlin.jvm.internal.L.f(hVarBuild, hVar)) {
                break;
            }
            a aVar2 = this.f38620b;
            synchronized (C22176v.f38750c) {
                AbstractC22167l.f38720e.getClass();
                abstractC22167lJ = C22176v.j();
                zB2 = b(this, (a) C22176v.v(aVar2, this, abstractC22167lJ), i12, hVarBuild);
            }
            C22176v.m(abstractC22167lJ, this);
        } while (!zB2);
        return vPut;
    }

    @Override // java.util.Map
    public final void putAll(@Y61.k Map<? extends K, ? extends V> map) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, ? extends V> hVar;
        int i12;
        AbstractC22167l abstractC22167lJ;
        boolean zB2;
        do {
            synchronized (G.f38626a) {
                a aVar = (a) C22176v.h(this.f38620b);
                hVar = aVar.f38624c;
                i12 = aVar.f38625d;
                G0 g02 = G0.f406611a;
            }
            h.a<K, ? extends V> aVarBuilder = hVar.builder();
            aVarBuilder.putAll(map);
            androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, ? extends V> hVarBuild = aVarBuilder.d();
            if (kotlin.jvm.internal.L.f(hVarBuild, hVar)) {
                return;
            }
            a aVar2 = this.f38620b;
            synchronized (C22176v.f38750c) {
                AbstractC22167l.f38720e.getClass();
                abstractC22167lJ = C22176v.j();
                zB2 = b(this, (a) C22176v.v(aVar2, this, abstractC22167lJ), i12, hVarBuild);
            }
            C22176v.m(abstractC22167lJ, this);
        } while (!zB2);
    }

    @Override // java.util.Map
    @Y61.l
    public final V remove(Object obj) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, ? extends V> hVar;
        int i12;
        V vRemove;
        AbstractC22167l abstractC22167lJ;
        boolean zB2;
        do {
            synchronized (G.f38626a) {
                a aVar = (a) C22176v.h(this.f38620b);
                hVar = aVar.f38624c;
                i12 = aVar.f38625d;
                G0 g02 = G0.f406611a;
            }
            h.a<K, ? extends V> aVarBuilder = hVar.builder();
            vRemove = aVarBuilder.remove(obj);
            androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, ? extends V> hVarBuild = aVarBuilder.d();
            if (kotlin.jvm.internal.L.f(hVarBuild, hVar)) {
                break;
            }
            a aVar2 = this.f38620b;
            synchronized (C22176v.f38750c) {
                AbstractC22167l.f38720e.getClass();
                abstractC22167lJ = C22176v.j();
                zB2 = b(this, (a) C22176v.v(aVar2, this, abstractC22167lJ), i12, hVarBuild);
            }
            C22176v.m(abstractC22167lJ, this);
        } while (!zB2);
        return vRemove;
    }

    @Override // java.util.Map
    public final int size() {
        return c().f38624c.size();
    }

    @Y61.k
    public final String toString() {
        return "SnapshotStateMap(value=" + ((a) C22176v.h(this.f38620b)).f38624c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.f38623e;
    }
}
