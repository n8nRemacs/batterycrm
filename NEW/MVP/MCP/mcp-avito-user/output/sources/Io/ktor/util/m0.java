package io.ktor.util;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Cache.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/util/m0;", "K", "V", "Ljava/util/LinkedHashMap;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class m0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<K, V> f400493b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<V, kotlin.G0> f400494c;

    /* renamed from: d, reason: collision with root package name */
    public final int f400495d;

    /* JADX WARN: Multi-variable type inference failed */
    public m0(@Y61.k Y41.l<? super K, ? extends V> lVar, @Y61.k Y41.l<? super V, kotlin.G0> lVar2, int i12) {
        super(10, 0.75f, true);
        this.f400493b = lVar;
        this.f400494c = lVar2;
        this.f400495d = i12;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        if (this.f400495d == 0) {
            return this.f400493b.invoke(obj);
        }
        synchronized (this) {
            V v12 = (V) super.get(obj);
            if (v12 != null) {
                return v12;
            }
            V vInvoke = this.f400493b.invoke(obj);
            put(obj, vInvoke);
            return vInvoke;
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(@Y61.k Map.Entry<? extends K, ? extends V> entry) {
        boolean z12 = super.size() > this.f400495d;
        if (z12) {
            this.f400494c.invoke(entry.getValue());
        }
        return z12;
    }
}
