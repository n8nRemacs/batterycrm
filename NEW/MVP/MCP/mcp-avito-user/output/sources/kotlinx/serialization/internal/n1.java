package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: Primitives.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/internal/n1;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/G0;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* loaded from: classes8.dex */
public final class n1 implements KSerializer<kotlin.G0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final n1 f412897b = new n1();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C43439y0<kotlin.G0> f412898a = new C43439y0<>(kotlin.G0.f406611a);

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        this.f412898a.deserialize(decoder);
        return kotlin.G0.f406611a;
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return this.f412898a.getF412706c();
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        this.f412898a.serialize(encoder, (kotlin.G0) obj);
    }
}
