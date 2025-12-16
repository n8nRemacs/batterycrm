package OU0;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* compiled from: KotlinxJson.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LOU0/h;", "LOU0/e;", "LPU0/h;", "kotlinx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h extends e implements PU0.h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final JsonObject f12292b;

    public h() {
        throw null;
    }

    public h(@k JsonObject jsonObject) {
        super(null);
        this.f12292b = jsonObject;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ PU0.f compute(String str, BiFunction<? super String, ? super PU0.f, ? extends PU0.f> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ PU0.f computeIfAbsent(String str, Function<? super String, ? extends PU0.f> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ PU0.f computeIfPresent(String str, BiFunction<? super String, ? super PU0.f, ? extends PU0.f> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f12292b.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj instanceof PU0.f) {
            return this.f12292b.containsValue(f.a((PU0.f) obj));
        }
        return false;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, PU0.f>> entrySet() {
        Set<Map.Entry<String, JsonElement>> setEntrySet = this.f12292b.f412952b.entrySet();
        int iF2 = P0.f(C42745f0.q(setEntrySet, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), f.b((JsonElement) entry.getValue()));
        }
        return linkedHashMap.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(@l Object obj) {
        return L.f(this.f12292b.f412952b, obj);
    }

    @Override // java.util.Map
    public final PU0.f get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        JsonElement jsonElement = (JsonElement) this.f12292b.get((String) obj);
        if (jsonElement != null) {
            return f.b(jsonElement);
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f12292b.f412952b.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f12292b.f412952b.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f12292b.f412952b.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ PU0.f merge(String str, PU0.f fVar, BiFunction<? super PU0.f, ? super PU0.f, ? extends PU0.f> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ PU0.f put(String str, PU0.f fVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends PU0.f> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ PU0.f putIfAbsent(String str, PU0.f fVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final PU0.f remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ PU0.f replace(String str, PU0.f fVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super PU0.f, ? extends PU0.f> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f12292b.f412952b.size();
    }

    @k
    public final String toString() {
        return this.f12292b.toString();
    }

    @Override // java.util.Map
    public final Collection<PU0.f> values() {
        Collection<JsonElement> collectionValues = this.f12292b.f412952b.values();
        ArrayList arrayList = new ArrayList(C42745f0.q(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(f.b((JsonElement) it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, PU0.f fVar, PU0.f fVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
