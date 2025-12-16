package kotlinx.datetime.serializers;

import java.time.DateTimeException;
import java.time.ZoneId;
import kotlin.Metadata;
import kotlinx.datetime.IllegalTimeZoneException;
import kotlinx.datetime.z;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.L0;

/* compiled from: TimeZoneSerializers.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/datetime/serializers/z;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/z;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class z implements KSerializer<kotlinx.datetime.z> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final z f412679a = new z();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final L0 f412680b = kotlinx.serialization.descriptors.n.a("kotlinx.datetime.TimeZone", e.i.f412727a);

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) throws Exception {
        z.Companion companion = kotlinx.datetime.z.INSTANCE;
        String strW = decoder.w();
        companion.getClass();
        try {
            return z.Companion.a(ZoneId.of(strW));
        } catch (Exception e12) {
            if (e12 instanceof DateTimeException) {
                throw new IllegalTimeZoneException(e12);
            }
            throw e12;
        }
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return f412680b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        encoder.b(((kotlinx.datetime.z) obj).f412688a.getId());
    }
}
