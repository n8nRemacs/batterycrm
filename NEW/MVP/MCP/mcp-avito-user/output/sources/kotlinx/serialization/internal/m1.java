package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: ValueClasses.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/internal/m1;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/C0;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* loaded from: classes8.dex */
public final class m1 implements KSerializer<kotlin.C0> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final m1 f412893a = new m1();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final T f412894b;

    static {
        int i12 = kotlin.jvm.internal.q0.f406848a;
        f412894b = V.a("kotlin.UShort", U0.f412820a);
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        return kotlin.C0.a(decoder.A(f412894b).t());
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return f412894b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        encoder.h(f412894b).i(((kotlin.C0) obj).f406603b);
    }
}
