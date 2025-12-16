package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.h;
import androidx.compose.runtime.internal.P;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.X;
import kotlin.collections.AbstractC42740d;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PersistentOrderedMap.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/c;", "K", "V", "Lkotlin/collections/d;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c<K, V> extends AbstractC42740d<K, V> implements androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Object f38368e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Object f38369f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V>> f38370g;

    /* compiled from: PersistentOrderedMap.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/c$a;", "", "<init>", "()V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/c;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/c;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        i0.c cVar = i0.c.f398334a;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.f38327g.getClass();
        new c(cVar, cVar, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.f38328h);
    }

    public c(@Y61.l Object obj, @Y61.l Object obj2, @Y61.k androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V>> dVar) {
        this.f38368e = obj;
        this.f38369f = obj2;
        this.f38370g = dVar;
    }

    @Override // kotlin.collections.AbstractC42740d
    @X
    @Y61.k
    public final Set<Map.Entry<K, V>> b() {
        return new l(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @Y61.k
    public final h.a<K, V> builder() {
        return new d(this);
    }

    @Override // kotlin.collections.AbstractC42740d
    public final Set c() {
        return new n(this);
    }

    @Override // kotlin.collections.AbstractC42740d, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f38370g.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC42740d
    public final Collection d() {
        return new q(this);
    }

    @Override // kotlin.collections.AbstractC42740d, java.util.Map
    @Y61.l
    public final V get(Object obj) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.a<V> aVar = this.f38370g.get(obj);
        if (aVar != null) {
            return aVar.f38363a;
        }
        return null;
    }

    @Override // kotlin.collections.AbstractC42740d
    /* renamed from: getSize */
    public final int getF38330f() {
        return this.f38370g.size();
    }
}
