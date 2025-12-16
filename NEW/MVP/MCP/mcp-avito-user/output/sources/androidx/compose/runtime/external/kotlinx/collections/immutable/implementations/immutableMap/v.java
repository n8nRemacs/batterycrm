package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.P;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: PersistentHashMapContentIterators.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0003\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/v;", "K", "V", "T", "", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class v<K, V, T> implements Iterator<T>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public Object[] f38359b;

    /* renamed from: c, reason: collision with root package name */
    public int f38360c;

    /* renamed from: d, reason: collision with root package name */
    public int f38361d;

    public v() {
        u.f38351e.getClass();
        this.f38359b = u.f38352f.f38356d;
    }

    public final void a(int i12, int i13, @Y61.k Object[] objArr) {
        this.f38359b = objArr;
        this.f38360c = i12;
        this.f38361d = i13;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f38361d < this.f38360c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
