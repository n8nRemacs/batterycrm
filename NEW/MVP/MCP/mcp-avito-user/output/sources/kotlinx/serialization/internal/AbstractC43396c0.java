package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: Tuples.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/internal/c0;", "K", "V", "R", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/internal/l0;", "Lkotlinx/serialization/internal/z0;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* renamed from: kotlinx.serialization.internal.c0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43396c0<K, V, R> implements KSerializer<R> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final KSerializer<K> f412847a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final KSerializer<V> f412848b;

    public AbstractC43396c0() {
        throw null;
    }

    public AbstractC43396c0(KSerializer kSerializer, KSerializer kSerializer2, C42822w c42822w) {
        this.f412847a = kSerializer;
        this.f412848b = kSerializer2;
    }

    public abstract K a(R r12);

    public abstract V b(R r12);

    public abstract R c(K k12, V v12);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.InterfaceC43386e
    public final R deserialize(@Y61.k Decoder decoder) {
        SerialDescriptor f412706c = getF412706c();
        kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
        Object obj = a1.f412843a;
        Object objV = obj;
        Object objV2 = objV;
        while (true) {
            int iJ2 = cVarC.j(getF412706c());
            if (iJ2 == -1) {
                if (objV == obj) {
                    throw new SerializationException("Element 'key' is missing");
                }
                if (objV2 == obj) {
                    throw new SerializationException("Element 'value' is missing");
                }
                R r12 = (R) c(objV, objV2);
                cVarC.d(f412706c);
                return r12;
            }
            if (iJ2 == 0) {
                objV = cVarC.v(getF412706c(), 0, this.f412847a, null);
            } else {
                if (iJ2 != 1) {
                    throw new SerializationException(AK.c.g(iJ2, "Invalid index: "));
                }
                objV2 = cVarC.v(getF412706c(), 1, this.f412848b, null);
            }
        }
    }

    @Override // kotlinx.serialization.x
    public final void serialize(@Y61.k Encoder encoder, R r12) {
        kotlinx.serialization.encoding.d dVarC = encoder.c(getF412706c());
        dVarC.F(getF412706c(), 0, this.f412847a, a(r12));
        dVarC.F(getF412706c(), 1, this.f412848b, b(r12));
        dVarC.d(getF412706c());
    }
}
