package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlinx.serialization.InterfaceC43386e;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.p0;

/* compiled from: JsonContentPolymorphicSerializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/json/g;", "", "T", "Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.json.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43449g<T> implements KSerializer<T> {
    @Y61.k
    public abstract InterfaceC43386e a();

    @Override // kotlinx.serialization.InterfaceC43386e
    @Y61.k
    public final T deserialize(@Y61.k Decoder decoder) {
        h hVarA = s.a(decoder);
        JsonElement jsonElementI = hVarA.i();
        KSerializer kSerializer = (KSerializer) a();
        AbstractC43443a f413090a = hVarA.getF413090a();
        f413090a.getClass();
        return (T) p0.a(f413090a, jsonElementI, kSerializer);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF332717a() {
        return null;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(@Y61.k Encoder encoder, @Y61.k T t12) {
        kotlinx.serialization.x<T> xVarD = encoder.getF413080a().d(null, t12);
        if (xVarD == null) {
            Class<?> cls = t12.getClass();
            n0 n0Var = m0.f406844a;
            xVarD = kotlinx.serialization.C.f(n0Var.b(cls));
            if (xVarD == null) {
                kotlin.reflect.d dVarB = n0Var.b(t12.getClass());
                if (dVarB.l0() != null) {
                    throw null;
                }
                String.valueOf(dVarB);
                throw null;
            }
        }
        ((KSerializer) xVarD).serialize(encoder, t12);
    }
}
