package L51;

import Y61.k;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.descriptors.n;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.L0;

/* compiled from: LongAsStringSerializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LL51/b;", "Lkotlinx/serialization/KSerializer;", "", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b implements KSerializer<Long> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final L0 f9777a;

    static {
        new b();
        f9777a = n.a("kotlinx.serialization.LongAsStringSerializer", e.i.f412727a);
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        return Long.valueOf(Long.parseLong(decoder.w()));
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return f9777a;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        encoder.b(String.valueOf(((Number) obj).longValue()));
    }
}
