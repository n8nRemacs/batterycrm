package kotlinx.datetime.serializers;

import kotlin.Metadata;
import kotlinx.datetime.w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.L0;

/* compiled from: LocalTimeSerializers.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/datetime/serializers/s;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/w;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class s implements KSerializer<kotlinx.datetime.w> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final s f412668a = new s();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final L0 f412669b = kotlinx.serialization.descriptors.n.a("kotlinx.datetime.LocalTime", e.i.f412727a);

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        return w.Companion.a(kotlinx.datetime.w.INSTANCE, decoder.w());
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return f412669b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        encoder.b(((kotlinx.datetime.w) obj).f412684b.toString());
    }
}
