package io.ktor.util;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AttributesJvm.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\"\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/util/d;", "Lio/ktor/util/c;", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.util.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
abstract class AbstractC41590d implements InterfaceC41588c {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.ktor.util.InterfaceC41588c
    public final <T> void a(@Y61.k C41586b<T> c41586b, @Y61.k T t12) {
        h().put(c41586b, t12);
    }

    @Override // io.ktor.util.InterfaceC41588c
    @Y61.k
    public final List<C41586b<?>> b() {
        return C42745f0.M0(h().keySet());
    }

    @Override // io.ktor.util.InterfaceC41588c
    public final boolean c(@Y61.k C41586b<?> c41586b) {
        return h().containsKey(c41586b);
    }

    @Override // io.ktor.util.InterfaceC41588c
    @Y61.l
    public final <T> T d(@Y61.k C41586b<T> c41586b) {
        return (T) h().get(c41586b);
    }

    @Override // io.ktor.util.InterfaceC41588c
    public final <T> void f(@Y61.k C41586b<T> c41586b) {
        h().remove(c41586b);
    }

    @Override // io.ktor.util.InterfaceC41588c
    @Y61.k
    public final <T> T g(@Y61.k C41586b<T> c41586b) {
        T t12 = (T) d(c41586b);
        if (t12 != null) {
            return t12;
        }
        throw new IllegalStateException("No instance for key " + c41586b);
    }

    @Y61.k
    public abstract Map<C41586b<?>, Object> h();
}
