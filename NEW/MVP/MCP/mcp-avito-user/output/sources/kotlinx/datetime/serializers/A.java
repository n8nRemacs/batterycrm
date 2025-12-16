package kotlinx.datetime.serializers;

import java.time.format.DateTimeFormatter;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlinx.datetime.D;
import kotlinx.datetime.E;
import kotlinx.datetime.format.A0;
import kotlinx.datetime.format.y0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.L0;

/* compiled from: TimeZoneSerializers.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/datetime/serializers/A;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/D;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class A implements KSerializer<D> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final A f412625a = new A();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final L0 f412626b = kotlinx.serialization.descriptors.n.a("kotlinx.datetime.UtcOffset", e.i.f412727a);

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        D.Companion companion = D.INSTANCE;
        String strW = decoder.w();
        D.b.f412307a.getClass();
        InterfaceC42726C interfaceC42726C = A0.f412317a;
        y0 y0Var = (y0) interfaceC42726C.getValue();
        companion.getClass();
        return y0Var == ((y0) interfaceC42726C.getValue()) ? E.a(strW, (DateTimeFormatter) E.f412308a.getValue()) : y0Var == ((y0) A0.f412318b.getValue()) ? E.a(strW, (DateTimeFormatter) E.f412309b.getValue()) : y0Var == ((y0) A0.f412319c.getValue()) ? E.a(strW, (DateTimeFormatter) E.f412310c.getValue()) : y0Var.a(strW);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF332717a() {
        return f412626b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        encoder.b(((D) obj).f412306a.toString());
    }
}
