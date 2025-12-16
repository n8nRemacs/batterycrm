package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: Primitives.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/internal/l;", "Lkotlinx/serialization/KSerializer;", "", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* renamed from: kotlinx.serialization.internal.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43413l implements KSerializer<Byte> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C43413l f412881a = new C43413l();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final L0 f412882b = new L0("kotlin.Byte", e.b.f412720a);

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        return Byte.valueOf(decoder.n());
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return f412882b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        encoder.w(((Number) obj).byteValue());
    }
}
