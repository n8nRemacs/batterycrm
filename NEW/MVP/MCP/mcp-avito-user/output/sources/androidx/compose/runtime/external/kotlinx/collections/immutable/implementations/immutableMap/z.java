package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.P;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/z;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/v;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class z<K, V> extends v<K, V, Map.Entry<K, V>> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final i<K, V> f38362e;

    public z(@Y61.k i<K, V> iVar) {
        this.f38362e = iVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i12 = this.f38361d;
        this.f38361d = i12 + 2;
        Object[] objArr = this.f38359b;
        return new c(this.f38362e, objArr[i12], objArr[i12 + 1]);
    }
}
