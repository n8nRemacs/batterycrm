package kotlinx.datetime.serializers;

import kotlin.Metadata;
import kotlinx.datetime.AbstractC43321f;
import kotlinx.datetime.C43320e;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.L0;

/* compiled from: DateTimePeriodSerializers.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/datetime/serializers/c;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/e;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class c implements KSerializer<C43320e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final c f412633a = new c();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final L0 f412634b = kotlinx.serialization.descriptors.n.a("kotlinx.datetime.DatePeriod", e.i.f412727a);

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        AbstractC43321f.Companion companion = AbstractC43321f.INSTANCE;
        String strW = decoder.w();
        companion.getClass();
        AbstractC43321f abstractC43321fA = AbstractC43321f.Companion.a(strW);
        if (abstractC43321fA instanceof C43320e) {
            return (C43320e) abstractC43321fA;
        }
        throw new SerializationException(abstractC43321fA + " is not a date-based period");
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return f412634b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        encoder.b(((C43320e) obj).toString());
    }
}
