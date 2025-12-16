package kotlin.reflect.jvm.internal.impl.util;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ArrayMapOwner.kt */
/* loaded from: classes8.dex */
public abstract class t<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ConcurrentHashMap<String, Integer> f410340a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AtomicInteger f410341b = new AtomicInteger(0);

    public abstract int a(@Y61.k ConcurrentHashMap<String, Integer> concurrentHashMap, @Y61.k String str, @Y61.k Y41.l<? super String, Integer> lVar);

    public final <T extends K> int b(@Y61.k kotlin.reflect.d<T> dVar) {
        return a(this.f410340a, dVar.p0(), new s(this));
    }
}
