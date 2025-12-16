package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C42815o;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: ValueClasses.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/internal/d1;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/o0;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* loaded from: classes8.dex */
public final class d1 implements KSerializer<kotlin.o0> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final d1 f412850a = new d1();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final T f412851b;

    static {
        int i12 = C42815o.f406846a;
        f412851b = V.a("kotlin.UByte", C43413l.f412881a);
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        return kotlin.o0.a(decoder.A(f412851b).n());
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return f412851b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        encoder.h(f412851b).w(((kotlin.o0) obj).f406875b);
    }
}
