package kotlinx.serialization;

import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.o;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: ContextualSerializer.kt */
@InterfaceC43387f
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/d;", "", "T", "Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43385d<T> implements KSerializer<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.d<T> f412704a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<KSerializer<?>> f412705b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SerialDescriptor f412706c;

    public C43385d(@Y61.k kotlin.reflect.d dVar, @Y61.k KSerializer[] kSerializerArr) {
        this.f412704a = dVar;
        this.f412705b = Arrays.asList(kSerializerArr);
        this.f412706c = kotlinx.serialization.descriptors.b.b(kotlinx.serialization.descriptors.n.c("kotlinx.serialization.ContextualSerializer", o.a.f412749a, new SerialDescriptor[0], new C43384c(this)), dVar);
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @Y61.k
    public final T deserialize(@Y61.k Decoder decoder) {
        kotlinx.serialization.modules.f f413093d = decoder.getF413093d();
        List<KSerializer<?>> list = this.f412705b;
        kotlin.reflect.d<T> dVar = this.f412704a;
        KSerializer<T> kSerializerB = f413093d.b(dVar, list);
        if (kSerializerB != null) {
            return (T) decoder.m(kSerializerB);
        }
        String strL0 = dVar.l0();
        if (strL0 == null) {
            strL0 = "<local class name not available>";
        }
        throw new SerializationException(AK.c.k("Serializer for class '", strL0, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor, reason: from getter */
    public final SerialDescriptor getF412706c() {
        return this.f412706c;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(@Y61.k Encoder encoder, @Y61.k T t12) {
        kotlinx.serialization.modules.f f413104e = encoder.getF413104e();
        List<KSerializer<?>> list = this.f412705b;
        kotlin.reflect.d<T> dVar = this.f412704a;
        KSerializer<T> kSerializerB = f413104e.b(dVar, list);
        if (kSerializerB != null) {
            encoder.f(kSerializerB, t12);
            return;
        }
        String strL0 = dVar.l0();
        if (strL0 == null) {
            strL0 = "<local class name not available>";
        }
        throw new SerializationException(AK.c.k("Serializer for class '", strL0, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }
}
