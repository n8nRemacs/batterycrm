package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlinx.serialization.KSerializer;

/* compiled from: Caching.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/B;", "T", "Lkotlinx/serialization/internal/B0;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class B<T> implements B0<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f412758a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ConcurrentHashMap<Class<?>, A0<T>> f412759b = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public B(@Y61.k Y41.p<? super kotlin.reflect.d<Object>, ? super List<? extends kotlin.reflect.r>, ? extends KSerializer<T>> pVar) {
        this.f412758a = (kotlin.jvm.internal.N) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // kotlinx.serialization.internal.B0
    @Y61.k
    public final Object a(@Y61.k kotlin.reflect.d dVar, @Y61.k ArrayList arrayList) {
        Object bVar;
        A0<T> a0PutIfAbsent;
        ConcurrentHashMap<Class<?>, A0<T>> concurrentHashMap = this.f412759b;
        Class<?> clsF = ((InterfaceC42819t) dVar).f();
        A0<T> a02 = concurrentHashMap.get(clsF);
        if (a02 == null && (a0PutIfAbsent = concurrentHashMap.putIfAbsent(clsF, (a02 = new A0<>()))) != null) {
            a02 = a0PutIfAbsent;
        }
        A0<T> a03 = a02;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C43394b0((kotlin.reflect.r) it.next()));
        }
        ConcurrentHashMap<List<C43394b0>, kotlin.Z<KSerializer<T>>> concurrentHashMap2 = a03.f412757a;
        kotlin.Z<KSerializer<T>> z12 = concurrentHashMap2.get(arrayList2);
        if (z12 == null) {
            try {
                int i12 = kotlin.Z.f406624c;
                bVar = (KSerializer) this.f412758a.invoke(dVar, arrayList);
            } catch (Throwable th2) {
                int i13 = kotlin.Z.f406624c;
                bVar = new Z.b(th2);
            }
            kotlin.Z<KSerializer<T>> zA2 = kotlin.Z.a(bVar);
            kotlin.Z<KSerializer<T>> zPutIfAbsent = concurrentHashMap2.putIfAbsent(arrayList2, zA2);
            z12 = zPutIfAbsent == null ? zA2 : zPutIfAbsent;
        }
        return z12.f406625b;
    }
}
