package io.ktor.util.collections;

import Y41.l;
import Y61.k;
import Z41.g;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ConcurrentMapJvm.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/util/collections/b;", "Key", "Value", "", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b<Key, Value> implements Map<Key, Value>, g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ConcurrentHashMap<Key, Value> f400447b;

    /* compiled from: ConcurrentMapJvm.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Value", "Key", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends N implements l<Object, Object> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f400448l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<Object> aVar) {
            super(1);
            this.f400448l = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final Object invoke(Object obj) {
            return this.f400448l.invoke();
        }
    }

    public b() {
        this(0, 1, null);
    }

    public final Object a(@k Y41.a aVar, Object obj) {
        return this.f400447b.computeIfAbsent(obj, new com.avito.android.service_booking.mvi.navigation.mvi.k(1, new a(aVar)));
    }

    @Override // java.util.Map
    public final void clear() {
        this.f400447b.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f400447b.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f400447b.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<Key, Value>> entrySet() {
        return this.f400447b.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof Map) {
            return L.f(obj, this.f400447b);
        }
        return false;
    }

    @Override // java.util.Map
    @Y61.l
    public final Value get(Object obj) {
        return this.f400447b.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f400447b.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f400447b.isEmpty();
    }

    @Override // java.util.Map
    public final Set<Key> keySet() {
        return this.f400447b.keySet();
    }

    @Override // java.util.Map
    @Y61.l
    public final Value put(Key key, Value value) {
        return this.f400447b.put(key, value);
    }

    @Override // java.util.Map
    public final void putAll(@k Map<? extends Key, ? extends Value> map) {
        this.f400447b.putAll(map);
    }

    @Override // java.util.Map
    @Y61.l
    public final Value remove(Object obj) {
        return this.f400447b.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f400447b.size();
    }

    @k
    public final String toString() {
        return "ConcurrentMapJvm by " + this.f400447b;
    }

    @Override // java.util.Map
    public final Collection<Value> values() {
        return this.f400447b.values();
    }

    public b(int i12, int i13, C42822w c42822w) {
        this.f400447b = new ConcurrentHashMap<>((i13 & 1) != 0 ? 32 : i12);
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        return this.f400447b.remove(obj, obj2);
    }
}
