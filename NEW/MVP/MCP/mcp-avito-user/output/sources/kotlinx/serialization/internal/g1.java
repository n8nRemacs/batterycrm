package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: ValueClasses.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/internal/g1;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/s0;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* loaded from: classes8.dex */
public final class g1 implements KSerializer<kotlin.s0> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final g1 f412860a = new g1();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final T f412861b;

    static {
        int i12 = kotlin.jvm.internal.J.f406821a;
        f412861b = V.a("kotlin.UInt", Y.f412835a);
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        return kotlin.s0.a(decoder.A(f412861b).z());
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return f412861b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        encoder.h(f412861b).m(((kotlin.s0) obj).f410476b);
    }
}
