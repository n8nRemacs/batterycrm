package io.ktor.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* compiled from: AttributesJvm.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/util/A;", "Lio/ktor/util/d;", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class A extends AbstractC41590d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ConcurrentHashMap<C41586b<?>, Object> f400383a = new ConcurrentHashMap<>();

    @Override // io.ktor.util.InterfaceC41588c
    @Y61.k
    public final <T> T e(@Y61.k C41586b<T> c41586b, @Y61.k Y41.a<? extends T> aVar) {
        ConcurrentHashMap<C41586b<?>, Object> concurrentHashMap = this.f400383a;
        T t12 = (T) concurrentHashMap.get(c41586b);
        if (t12 != null) {
            return t12;
        }
        T tInvoke = aVar.invoke();
        T t13 = (T) concurrentHashMap.putIfAbsent(c41586b, tInvoke);
        return t13 == null ? tInvoke : t13;
    }

    @Override // io.ktor.util.AbstractC41590d
    public final Map h() {
        return this.f400383a;
    }
}
