package kotlinx.serialization.json.internal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: SchemaCache.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/json/internal/w;", "", "<init>", "()V", "a", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.json.internal.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43471w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ConcurrentHashMap f413131a = new ConcurrentHashMap(16);

    /* compiled from: SchemaCache.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/json/internal/w$a;", "", "T", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.serialization.json.internal.w$a */
    public static final class a<T> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final <T> T a(@Y61.k SerialDescriptor serialDescriptor, @Y61.k a<T> aVar, @Y61.k Y41.a<? extends T> aVar2) {
        ConcurrentHashMap concurrentHashMap = this.f413131a;
        Map map = (Map) concurrentHashMap.get(serialDescriptor);
        T t12 = map != null ? map.get(aVar) : null;
        T t13 = t12 != null ? t12 : null;
        if (t13 != null) {
            return t13;
        }
        T tInvoke = aVar2.invoke();
        Object concurrentHashMap2 = concurrentHashMap.get(serialDescriptor);
        if (concurrentHashMap2 == null) {
            concurrentHashMap2 = new ConcurrentHashMap(2);
            concurrentHashMap.put(serialDescriptor, concurrentHashMap2);
        }
        ((Map) concurrentHashMap2).put(aVar, tInvoke);
        return tInvoke;
    }
}
