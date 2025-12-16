package kotlinx.serialization.internal;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: CollectionSerializers.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012*\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u0002¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/internal/S;", "E", "Lkotlinx/serialization/internal/z;", "", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* loaded from: classes8.dex */
public final class S<E> extends AbstractC43440z<E, Set<? extends E>, HashSet<E>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Q f412814b;

    public S(@Y61.k KSerializer<E> kSerializer) {
        super(kSerializer, null);
        this.f412814b = new Q(kSerializer.getF412706c(), null);
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Object a() {
        return new HashSet();
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final int b(Object obj) {
        return ((HashSet) obj).size();
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Object g(Object obj) {
        return new HashSet((Collection) null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return this.f412814b;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Object h(Object obj) {
        return (HashSet) obj;
    }

    @Override // kotlinx.serialization.internal.AbstractC43438y
    public final void i(int i12, Object obj, Object obj2) {
        ((HashSet) obj).add(obj2);
    }
}
