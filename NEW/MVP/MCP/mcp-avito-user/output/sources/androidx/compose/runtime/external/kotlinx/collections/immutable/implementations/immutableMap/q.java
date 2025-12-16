package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.P;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC42750i;

/* compiled from: PersistentHashMapContentViews.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/q;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/e;", "Lkotlin/collections/i;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q<K, V> extends AbstractC42750i<K> implements androidx.compose.runtime.external.kotlinx.collections.immutable.e<K> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final d<K, V> f38349c;

    public q(@Y61.k d<K, V> dVar) {
        this.f38349c = dVar;
    }

    @Override // kotlin.collections.AbstractC42734a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f38349c.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC42734a
    /* renamed from: getSize */
    public final int getF395503d() {
        return this.f38349c.getF38330f();
    }

    @Override // kotlin.collections.AbstractC42750i, java.util.Collection, java.lang.Iterable, java.util.Set
    @Y61.k
    public final Iterator<K> iterator() {
        u<K, V> uVar = this.f38349c.f38329e;
        v[] vVarArr = new v[8];
        for (int i12 = 0; i12 < 8; i12++) {
            vVarArr[i12] = new x();
        }
        return new r(uVar, vVarArr);
    }
}
