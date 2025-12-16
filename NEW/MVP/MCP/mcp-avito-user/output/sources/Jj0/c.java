package jj0;

import Y61.k;
import Y61.l;
import Z41.g;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CacheStorage.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¨\u0006\u0006"}, d2 = {"Ljj0/c;", "", "K", "V", "Ljj0/a;", "", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class c<K, V> implements InterfaceC42389a<K, V>, Map<K, V>, g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map<K, V> f405779b;

    public c() {
        this(null, 1, null);
    }

    @Override // java.util.Map
    public final void clear() {
        this.f405779b.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(@l Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f405779b.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(@l Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f405779b.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.f405779b.entrySet();
    }

    @Override // jj0.InterfaceC42389a, java.util.Map
    @l
    public final V get(@l Object obj) {
        if (obj == null) {
            return null;
        }
        return this.f405779b.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f405779b.isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.f405779b.keySet();
    }

    @Override // jj0.InterfaceC42389a, java.util.Map
    @l
    public final V put(@k K k12, @k V v12) {
        return this.f405779b.put(k12, v12);
    }

    @Override // java.util.Map
    public final void putAll(@k Map<? extends K, ? extends V> map) {
        this.f405779b.putAll(map);
    }

    @Override // jj0.InterfaceC42389a, java.util.Map
    @l
    public final V remove(@l Object obj) {
        if (obj == null) {
            return null;
        }
        return this.f405779b.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f405779b.size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.f405779b.values();
    }

    public c(Map map, int i12, C42822w c42822w) {
        this.f405779b = (i12 & 1) != 0 ? new LinkedHashMap() : map;
    }
}
