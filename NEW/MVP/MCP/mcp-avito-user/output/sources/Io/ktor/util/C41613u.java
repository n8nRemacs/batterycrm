package io.ktor.util;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: CaseInsensitiveMap.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/util/u;", "", "Value", "", "", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.util.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41613u<Value> implements Map<String, Value>, Z41.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f400550b = new LinkedHashMap();

    @Override // java.util.Map
    public final void clear() {
        this.f400550b.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return this.f400550b.containsKey(new C41615w((String) obj));
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(@Y61.l Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f400550b.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, Value>> entrySet() {
        return new S(this.f400550b.entrySet(), C41610q.f400544l, r.f400545l);
    }

    @Override // java.util.Map
    public final boolean equals(@Y61.l Object obj) {
        if (obj == null || !(obj instanceof C41613u)) {
            return false;
        }
        return kotlin.jvm.internal.L.f(((C41613u) obj).f400550b, this.f400550b);
    }

    @Override // java.util.Map
    public final Value get(Object obj) {
        if (obj instanceof String) {
            return (Value) this.f400550b.get(new C41615w((String) obj));
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f400550b.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f400550b.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return new S(this.f400550b.keySet(), C41611s.f400546l, C41612t.f400549l);
    }

    @Override // java.util.Map
    public final Object put(String str, Object obj) {
        return this.f400550b.put(new C41615w(str), obj);
    }

    @Override // java.util.Map
    public final void putAll(@Y61.k Map<? extends String, ? extends Value> map) {
        for (Map.Entry<? extends String, ? extends Value> entry : map.entrySet()) {
            String key = entry.getKey();
            this.f400550b.put(new C41615w(key), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Value remove(Object obj) {
        if (obj instanceof String) {
            return (Value) this.f400550b.remove(new C41615w((String) obj));
        }
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f400550b.size();
    }

    @Override // java.util.Map
    public final Collection<Value> values() {
        return this.f400550b.values();
    }
}
