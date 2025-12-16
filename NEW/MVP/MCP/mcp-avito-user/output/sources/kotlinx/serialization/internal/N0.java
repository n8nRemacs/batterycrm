package kotlinx.serialization.internal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42809i;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: CollectionSerializers.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\n\b\u0001\u0010\u0003*\u0004\u0018\u00018\u00002*\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00070\u0004¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/N0;", "", "ElementKlass", "Element", "Lkotlinx/serialization/internal/y;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* loaded from: classes8.dex */
public final class N0<ElementKlass, Element extends ElementKlass> extends AbstractC43438y<Element, Element[], ArrayList<Element>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.d<ElementKlass> f412793b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C43397d f412794c;

    public N0(@Y61.k kotlin.reflect.d<ElementKlass> dVar, @Y61.k KSerializer<Element> kSerializer) {
        super(kSerializer, null);
        this.f412793b = dVar;
        this.f412794c = new C43397d(kSerializer.getF412706c(), null);
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Object a() {
        return new ArrayList();
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final int b(Object obj) {
        return ((ArrayList) obj).size();
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Iterator c(Object obj) {
        return C42809i.a((Object[]) obj);
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final int d(Object obj) {
        return ((Object[]) obj).length;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Object g(Object obj) {
        return new ArrayList(Arrays.asList(null));
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return this.f412794c;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        return arrayList.toArray((Object[]) Array.newInstance(((InterfaceC42819t) this.f412793b).f(), arrayList.size()));
    }

    @Override // kotlinx.serialization.internal.AbstractC43438y
    public final void i(int i12, Object obj, Object obj2) {
        ((ArrayList) obj).add(i12, obj2);
    }
}
