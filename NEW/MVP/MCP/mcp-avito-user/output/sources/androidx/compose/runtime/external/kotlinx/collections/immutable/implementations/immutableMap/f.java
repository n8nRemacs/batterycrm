package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.h;
import androidx.compose.runtime.internal.P;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC42746g;

/* compiled from: PersistentHashMapBuilder.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/h$a;", "Lkotlin/collections/g;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class f<K, V> extends AbstractC42746g<K, V> implements h.a<K, V> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public d<K, V> f38334b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public i0.f f38335c = new i0.f();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public u<K, V> f38336d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public V f38337e;

    /* renamed from: f, reason: collision with root package name */
    public int f38338f;

    /* renamed from: g, reason: collision with root package name */
    public int f38339g;

    public f(@Y61.k d<K, V> dVar) {
        this.f38334b = dVar;
        d<K, V> dVar2 = this.f38334b;
        this.f38336d = dVar2.f38329e;
        this.f38339g = dVar2.getF38330f();
    }

    @Override // kotlin.collections.AbstractC42746g
    @Y61.k
    public final Set<Map.Entry<K, V>> a() {
        return new h(this);
    }

    @Override // kotlin.collections.AbstractC42746g
    @Y61.k
    public final Set<K> b() {
        return new j(this);
    }

    @Override // kotlin.collections.AbstractC42746g
    @Y61.k
    public final Collection<V> c() {
        return new l(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        u.f38351e.getClass();
        this.f38336d = u.f38352f;
        e(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(K k12) {
        return this.f38336d.d(k12 != null ? k12.hashCode() : 0, 0, k12);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.h.a
    @Y61.k
    public d<K, V> d() {
        u<K, V> uVar = this.f38336d;
        d<K, V> dVar = this.f38334b;
        if (uVar != dVar.f38329e) {
            this.f38335c = new i0.f();
            dVar = new d<>(this.f38336d, getF38339g());
        }
        this.f38334b = dVar;
        return dVar;
    }

    public final void e(int i12) {
        this.f38339g = i12;
        this.f38338f++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Y61.l
    public V get(K k12) {
        return (V) this.f38336d.g(k12 != null ? k12.hashCode() : 0, 0, k12);
    }

    @Override // kotlin.collections.AbstractC42746g
    /* renamed from: getSize, reason: from getter */
    public final int getF38339g() {
        return this.f38339g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Y61.l
    public final V put(K k12, V v12) {
        this.f38337e = null;
        this.f38336d = this.f38336d.l(k12 != null ? k12.hashCode() : 0, k12, v12, 0, this);
        return this.f38337e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(@Y61.k Map<? extends K, ? extends V> map) {
        d<K, V> dVarD = map instanceof d ? (d) map : null;
        if (dVarD == null) {
            f fVar = map instanceof f ? (f) map : null;
            dVarD = fVar != null ? fVar.d() : null;
        }
        if (dVarD == null) {
            super.putAll(map);
            return;
        }
        i0.b bVar = new i0.b(0, 1, null);
        int i12 = this.f38339g;
        this.f38336d = this.f38336d.m(dVarD.f38329e, 0, bVar, this);
        int i13 = (dVarD.f38330f + i12) - bVar.f398333a;
        if (i12 != i13) {
            e(i13);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int f38339g = getF38339g();
        u<K, V> uVarO = this.f38336d.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (uVarO == null) {
            u.f38351e.getClass();
            uVarO = u.f38352f;
        }
        this.f38336d = uVarO;
        return f38339g != getF38339g();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Y61.l
    public V remove(K k12) {
        this.f38337e = null;
        u<K, V> uVarN = this.f38336d.n(k12 != null ? k12.hashCode() : 0, k12, 0, this);
        if (uVarN == null) {
            u.f38351e.getClass();
            uVarN = u.f38352f;
        }
        this.f38336d = uVarN;
        return this.f38337e;
    }
}
