package androidx.compose.runtime.snapshots;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SnapshotStateMap.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/snapshots/Q;", "K", "V", "Landroidx/compose/runtime/snapshots/S;", "", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class Q<K, V> extends S<K, V> implements Iterator<Map.Entry<K, V>>, Z41.d {
    public Q() {
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        if (this.f38671e != null) {
            return new P(this);
        }
        throw new IllegalStateException();
    }
}
