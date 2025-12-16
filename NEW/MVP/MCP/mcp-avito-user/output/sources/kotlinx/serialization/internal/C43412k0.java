package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: Primitives.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/internal/k0;", "Lkotlinx/serialization/KSerializer;", "", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* renamed from: kotlinx.serialization.internal.k0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43412k0 implements KSerializer<Long> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C43412k0 f412877a = new C43412k0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final L0 f412878b = new L0("kotlin.Long", e.g.f412725a);

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        return Long.valueOf(decoder.r());
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return f412878b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        encoder.r(((Number) obj).longValue());
    }
}
