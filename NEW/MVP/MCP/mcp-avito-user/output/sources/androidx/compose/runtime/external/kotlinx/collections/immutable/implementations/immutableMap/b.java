package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.P;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PersistentHashMapContentIterators.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/b;", "K", "V", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class b<K, V> implements Map.Entry<K, V>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    public final K f38323b;

    /* renamed from: c, reason: collision with root package name */
    public final V f38324c;

    public b(K k12, V v12) {
        this.f38323b = k12;
        this.f38324c = v12;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(@Y61.l Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && L.f(entry.getKey(), this.f38323b) && L.f(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f38323b;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.f38324c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K k12 = this.f38323b;
        int iHashCode = k12 != null ? k12.hashCode() : 0;
        V value = getValue();
        return (value != null ? value.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f38323b);
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
