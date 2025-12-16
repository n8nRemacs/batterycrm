package kotlinx.serialization.internal;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlinx.serialization.KSerializer;

/* compiled from: Caching.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/A;", "T", "Lkotlinx/serialization/internal/Q0;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class A<T> implements Q0<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f412755a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ConcurrentHashMap<Class<?>, C43415m<T>> f412756b = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public A(@Y61.k Y41.l<? super kotlin.reflect.d<?>, ? extends KSerializer<T>> lVar) {
        this.f412755a = (kotlin.jvm.internal.N) lVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // kotlinx.serialization.internal.Q0
    @Y61.l
    public final KSerializer<T> a(@Y61.k kotlin.reflect.d<Object> dVar) {
        C43415m<T> c43415mPutIfAbsent;
        ConcurrentHashMap<Class<?>, C43415m<T>> concurrentHashMap = this.f412756b;
        Class<?> clsF = ((InterfaceC42819t) dVar).f();
        C43415m<T> c43415m = concurrentHashMap.get(clsF);
        if (c43415m == null && (c43415mPutIfAbsent = concurrentHashMap.putIfAbsent(clsF, (c43415m = new C43415m<>((KSerializer) this.f412755a.invoke(dVar))))) != null) {
            c43415m = c43415mPutIfAbsent;
        }
        return c43415m.f412889a;
    }
}
