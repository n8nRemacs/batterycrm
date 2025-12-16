package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.P;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC42750i;
import kotlin.jvm.internal.s0;

/* compiled from: PersistentHashMapContentViews.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/o;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/e;", "", "Lkotlin/collections/i;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o<K, V> extends AbstractC42750i<Map.Entry<? extends K, ? extends V>> implements androidx.compose.runtime.external.kotlinx.collections.immutable.e<Map.Entry<? extends K, ? extends V>> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final d<K, V> f38348c;

    public o(@Y61.k d<K, V> dVar) {
        this.f38348c = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractC42734a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        Object key = entry.getKey();
        d<K, V> dVar = this.f38348c;
        Object obj2 = dVar.get(key);
        return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && dVar.containsKey(entry.getKey());
    }

    @Override // kotlin.collections.AbstractC42734a
    /* renamed from: getSize */
    public final int getF406660f() {
        return this.f38348c.getF38330f();
    }

    @Override // kotlin.collections.AbstractC42750i, java.util.Collection, java.lang.Iterable, java.util.Set
    @Y61.k
    public final Iterator<Map.Entry<K, V>> iterator() {
        u<K, V> uVar = this.f38348c.f38329e;
        v[] vVarArr = new v[8];
        for (int i12 = 0; i12 < 8; i12++) {
            vVarArr[i12] = new w();
        }
        return new p(uVar, vVarArr);
    }
}
