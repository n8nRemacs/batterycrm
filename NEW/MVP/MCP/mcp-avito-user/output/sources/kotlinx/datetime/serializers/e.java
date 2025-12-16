package kotlinx.datetime.serializers;

import kotlin.Metadata;
import kotlinx.datetime.AbstractC43321f;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.L0;

/* compiled from: DateTimePeriodSerializers.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/datetime/serializers/e;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/f;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class e implements KSerializer<AbstractC43321f> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final e f412638a = new e();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final L0 f412639b = kotlinx.serialization.descriptors.n.a("kotlinx.datetime.DateTimePeriod", e.i.f412727a);

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        AbstractC43321f.Companion aVar = AbstractC43321f.INSTANCE;
        String strW = decoder.w();
        aVar.getClass();
        return AbstractC43321f.Companion.a(strW);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return f412639b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        encoder.b(((AbstractC43321f) obj).toString());
    }
}
