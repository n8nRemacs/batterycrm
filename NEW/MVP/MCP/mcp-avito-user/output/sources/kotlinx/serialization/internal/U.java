package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: InlineClassDescriptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/internal/U;", "Lkotlinx/serialization/internal/N;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class U implements N<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KSerializer<Object> f412819a;

    public U(KSerializer<Object> kSerializer) {
        this.f412819a = kSerializer;
    }

    @Override // kotlinx.serialization.internal.N
    @Y61.k
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{this.f412819a};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(@Y61.k Decoder decoder) {
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF332717a() {
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.x
    public final void serialize(@Y61.k Encoder encoder, Object obj) {
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.internal.N
    @Y61.k
    public final KSerializer<?>[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
