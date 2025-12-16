package kotlin.reflect.jvm.internal;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CacheByClass.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/f;", "V", "Lkotlin/reflect/jvm/internal/a;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.reflect.jvm.internal.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42844f<V> extends AbstractC42839a<V> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f407153a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ConcurrentHashMap<Class<?>, V> f407154b = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public C42844f(@Y61.k Y41.l<? super Class<?>, ? extends V> lVar) {
        this.f407153a = (kotlin.jvm.internal.N) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // kotlin.reflect.jvm.internal.AbstractC42839a
    public final V a(@Y61.k Class<?> cls) {
        ConcurrentHashMap<Class<?>, V> concurrentHashMap = this.f407154b;
        V v12 = (V) concurrentHashMap.get(cls);
        if (v12 != null) {
            return v12;
        }
        V v13 = (V) this.f407153a.invoke(cls);
        V v14 = (V) concurrentHashMap.putIfAbsent(cls, v13);
        return v14 == null ? v13 : v14;
    }
}
