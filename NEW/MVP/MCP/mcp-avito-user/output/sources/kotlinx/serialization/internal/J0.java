package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.H0;

/* compiled from: CollectionSerializers.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/internal/J0;", "Element", "Array", "Lkotlinx/serialization/internal/H0;", "Builder", "Lkotlinx/serialization/internal/y;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* loaded from: classes8.dex */
public abstract class J0<Element, Array, Builder extends H0<Array>> extends AbstractC43438y<Element, Array, Builder> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final I0 f412784b;

    public J0(@Y61.k KSerializer<Element> kSerializer) {
        super(kSerializer, null);
        this.f412784b = new I0(kSerializer.getF412706c());
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Object a() {
        return g(j());
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final int b(Object obj) {
        return ((H0) obj).getF412880b();
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    @Y61.k
    public final Iterator<Element> c(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a, kotlinx.serialization.InterfaceC43386e
    public final Array deserialize(@Y61.k Decoder decoder) {
        return (Array) e(decoder);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return this.f412784b;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Object h(Object obj) {
        return ((H0) obj).a();
    }

    @Override // kotlinx.serialization.internal.AbstractC43438y
    public final void i(int i12, Object obj, Object obj2) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Array j();

    public abstract void k(@Y61.k kotlinx.serialization.encoding.d dVar, Array array, int i12);

    @Override // kotlinx.serialization.internal.AbstractC43438y, kotlinx.serialization.x
    public final void serialize(@Y61.k Encoder encoder, Array array) {
        int iD2 = d(array);
        I0 i02 = this.f412784b;
        kotlinx.serialization.encoding.d dVarA = encoder.A(i02);
        k(dVarA, array, iD2);
        dVarA.d(i02);
    }
}
