package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SnapshotStateMap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\"\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/S;", "K", "V", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
abstract class S<K, V> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final F<K, V> f38668b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Iterator<Map.Entry<K, V>> f38669c;

    /* renamed from: d, reason: collision with root package name */
    public int f38670d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Map.Entry<? extends K, ? extends V> f38671e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Map.Entry<? extends K, ? extends V> f38672f;

    /* JADX WARN: Multi-variable type inference failed */
    public S(@Y61.k F<K, V> f12, @Y61.k Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.f38668b = f12;
        this.f38669c = it;
        this.f38670d = f12.c().f38625d;
        a();
    }

    public final void a() {
        this.f38671e = this.f38672f;
        Iterator<Map.Entry<K, V>> it = this.f38669c;
        this.f38672f = it.hasNext() ? it.next() : null;
    }

    public final boolean hasNext() {
        return this.f38672f != null;
    }

    public final void remove() {
        F<K, V> f12 = this.f38668b;
        if (f12.c().f38625d != this.f38670d) {
            throw new ConcurrentModificationException();
        }
        Map.Entry<? extends K, ? extends V> entry = this.f38671e;
        if (entry == null) {
            throw new IllegalStateException();
        }
        f12.remove(entry.getKey());
        this.f38671e = null;
        G0 g02 = G0.f406611a;
        this.f38670d = f12.c().f38625d;
    }
}
