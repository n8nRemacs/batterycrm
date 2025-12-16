package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: CollectionSerializers.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022B\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00060\u0003¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/internal/e0;", "K", "V", "Lkotlinx/serialization/internal/n0;", "", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* renamed from: kotlinx.serialization.internal.e0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43400e0<K, V> extends AbstractC43418n0<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C43398d0 f412852c;

    public C43400e0(@Y61.k KSerializer<K> kSerializer, @Y61.k KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2, null);
        this.f412852c = new C43398d0("kotlin.collections.LinkedHashMap", kSerializer.getF412706c(), kSerializer2.getF412706c(), null);
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Object a() {
        return new LinkedHashMap();
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final int b(Object obj) {
        return ((LinkedHashMap) obj).size() * 2;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Iterator c(Object obj) {
        return ((Map) obj).entrySet().iterator();
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final int d(Object obj) {
        return ((Map) obj).size();
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Object g(Object obj) {
        return new LinkedHashMap((Map) null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return this.f412852c;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Object h(Object obj) {
        return (LinkedHashMap) obj;
    }
}
