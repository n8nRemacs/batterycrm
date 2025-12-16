package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import Z41.g;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/c;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/b;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class c<K, V> extends b<K, V> implements Map.Entry<K, V>, g.a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final i<K, V> f38325d;

    /* renamed from: e, reason: collision with root package name */
    public V f38326e;

    public c(@Y61.k i<K, V> iVar, K k12, V v12) {
        super(k12, v12);
        this.f38325d = iVar;
        this.f38326e = v12;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b, java.util.Map.Entry
    public final V getValue() {
        return this.f38326e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b, java.util.Map.Entry
    public final V setValue(V v12) {
        V v13 = this.f38326e;
        this.f38326e = v12;
        g<K, V, Map.Entry<K, V>> gVar = this.f38325d.f38345b;
        f<K, V> fVar = gVar.f38340e;
        K k12 = this.f38323b;
        if (fVar.containsKey(k12)) {
            boolean z12 = gVar.f38333d;
            if (!z12) {
                fVar.put(k12, v12);
            } else {
                if (!z12) {
                    throw new NoSuchElementException();
                }
                v vVar = gVar.f38331b[gVar.f38332c];
                Object obj = vVar.f38359b[vVar.f38361d];
                fVar.put(k12, v12);
                gVar.c(obj != null ? obj.hashCode() : 0, fVar.f38336d, obj, 0);
            }
            gVar.f38343h = fVar.f38338f;
        }
        return v13;
    }
}
