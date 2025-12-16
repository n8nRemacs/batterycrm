package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.p0;
import kotlinx.serialization.json.internal.r0;

/* compiled from: JsonTransformingSerializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/json/F;", "", "T", "Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class F<T> implements KSerializer<T> {
    @Override // kotlinx.serialization.InterfaceC43386e
    @Y61.k
    public final T deserialize(@Y61.k Decoder decoder) {
        h hVarA = s.a(decoder);
        JsonElement jsonElementI = hVarA.i();
        AbstractC43443a f413090a = hVarA.getF413090a();
        f413090a.getClass();
        return (T) p0.a(f413090a, jsonElementI, null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        throw null;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(@Y61.k Encoder encoder, @Y61.k T t12) {
        t tVarB = s.b(encoder);
        tVarB.z(r0.a(tVarB.getF413070b(), t12, null));
    }
}
