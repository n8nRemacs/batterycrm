package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: ValueClasses.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/internal/j1;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/w0;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* loaded from: classes8.dex */
public final class j1 implements KSerializer<kotlin.w0> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final j1 f412874a = new j1();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final T f412875b;

    static {
        int i12 = kotlin.jvm.internal.Q.f406822a;
        f412875b = V.a("kotlin.ULong", C43412k0.f412877a);
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        return kotlin.w0.a(decoder.A(f412875b).r());
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return f412875b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        encoder.h(f412875b).r(((kotlin.w0) obj).f410663b);
    }
}
