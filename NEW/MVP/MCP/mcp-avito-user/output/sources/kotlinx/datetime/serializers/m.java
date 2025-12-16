package kotlinx.datetime.serializers;

import kotlin.Metadata;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.format.C43342k;
import kotlinx.datetime.format.C43367y;
import kotlinx.datetime.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.L0;

/* compiled from: InstantSerializers.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/datetime/serializers/m;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/l;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class m implements KSerializer<kotlinx.datetime.l> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final m f412653a = new m();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final L0 f412654b = kotlinx.serialization.descriptors.n.a("kotlinx.datetime.Instant", e.i.f412727a);

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        l.Companion aVar = kotlinx.datetime.l.INSTANCE;
        String strW = decoder.w();
        C43342k.b.f412424a.getClass();
        C43367y c43367y = C43342k.b.f412425b;
        aVar.getClass();
        try {
            return c43367y.a(strW).a();
        } catch (IllegalArgumentException e12) {
            throw new DateTimeFormatException("Failed to parse an instant from '" + ((Object) strW) + '\'', e12);
        }
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF332717a() {
        return f412654b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        encoder.b(((kotlinx.datetime.l) obj).f412618b.toString());
    }
}
