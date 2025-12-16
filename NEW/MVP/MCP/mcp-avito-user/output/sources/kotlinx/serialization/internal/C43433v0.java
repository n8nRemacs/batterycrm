package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: NullableSerializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/internal/v0;", "", "T", "Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* renamed from: kotlinx.serialization.internal.v0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43433v0<T> implements KSerializer<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final KSerializer<T> f412918a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final O0 f412919b;

    public C43433v0(@Y61.k KSerializer<T> kSerializer) {
        this.f412918a = kSerializer;
        this.f412919b = new O0(kSerializer.getF332717a());
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @Y61.l
    public final T deserialize(@Y61.k Decoder decoder) {
        if (decoder.E()) {
            return (T) decoder.m(this.f412918a);
        }
        return null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C43433v0.class == obj.getClass() && kotlin.jvm.internal.L.f(this.f412918a, ((C43433v0) obj).f412918a);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF332717a() {
        return this.f412919b;
    }

    public final int hashCode() {
        return this.f412918a.hashCode();
    }

    @Override // kotlinx.serialization.x
    public final void serialize(@Y61.k Encoder encoder, @Y61.l T t12) {
        if (t12 == null) {
            encoder.C();
        } else {
            encoder.E();
            encoder.f(this.f412918a, t12);
        }
    }
}
