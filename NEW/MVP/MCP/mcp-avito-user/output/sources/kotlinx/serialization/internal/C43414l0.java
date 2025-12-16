package kotlinx.serialization.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.p;

/* compiled from: Tuples.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/internal/l0;", "K", "V", "Lkotlinx/serialization/internal/c0;", "", "a", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* renamed from: kotlinx.serialization.internal.l0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43414l0<K, V> extends AbstractC43396c0<K, V, Map.Entry<? extends K, ? extends V>> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlinx.serialization.descriptors.f f412883c;

    /* compiled from: Tuples.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\b\u0082\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/internal/l0$a;", "K", "V", "", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.serialization.internal.l0$a */
    public static final /* data */ class a<K, V> implements Map.Entry<K, V>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        public final K f412884b;

        /* renamed from: c, reason: collision with root package name */
        public final V f412885c;

        public a(K k12, V v12) {
            this.f412884b = k12;
            this.f412885c = v12;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f412884b, aVar.f412884b) && kotlin.jvm.internal.L.f(this.f412885c, aVar.f412885c);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f412884b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f412885c;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k12 = this.f412884b;
            int iHashCode = (k12 == null ? 0 : k12.hashCode()) * 31;
            V v12 = this.f412885c;
            return iHashCode + (v12 != null ? v12.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v12) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MapEntry(key=");
            sb2.append(this.f412884b);
            sb2.append(", value=");
            return androidx.compose.foundation.H.n(sb2, this.f412885c, ')');
        }
    }

    /* compiled from: Tuples.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"K", "V", "Lkotlinx/serialization/descriptors/a;", "Lkotlin/G0;", "invoke", "(Lkotlinx/serialization/descriptors/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlinx.serialization.internal.l0$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<kotlinx.serialization.descriptors.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ KSerializer<K> f412886l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ KSerializer<V> f412887m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
            super(1);
            this.f412886l = kSerializer;
            this.f412887m = kSerializer2;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(kotlinx.serialization.descriptors.a aVar) {
            kotlinx.serialization.descriptors.a aVar2 = aVar;
            kotlinx.serialization.descriptors.a.b(aVar2, "key", this.f412886l.getF412706c());
            kotlinx.serialization.descriptors.a.b(aVar2, "value", this.f412887m.getF412706c());
            return kotlin.G0.f406611a;
        }
    }

    public C43414l0(@Y61.k KSerializer<K> kSerializer, @Y61.k KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2, null);
        this.f412883c = kotlinx.serialization.descriptors.n.c("kotlin.collections.Map.Entry", p.c.f412753a, new SerialDescriptor[0], new b(kSerializer, kSerializer2));
    }

    @Override // kotlinx.serialization.internal.AbstractC43396c0
    public final Object a(Object obj) {
        return ((Map.Entry) obj).getKey();
    }

    @Override // kotlinx.serialization.internal.AbstractC43396c0
    public final Object b(Object obj) {
        return ((Map.Entry) obj).getValue();
    }

    @Override // kotlinx.serialization.internal.AbstractC43396c0
    public final Object c(Object obj, Object obj2) {
        return new a(obj, obj2);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return this.f412883c;
    }
}
