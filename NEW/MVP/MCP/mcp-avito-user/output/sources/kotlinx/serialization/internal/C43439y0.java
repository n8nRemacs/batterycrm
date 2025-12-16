package kotlinx.serialization.internal;

import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: ObjectSerializer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/internal/y0;", "", "T", "Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* renamed from: kotlinx.serialization.internal.y0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43439y0<T> implements KSerializer<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.G0 f412923a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C42784z0 f412924b = C42784z0.f406748b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f412925c = C42727D.b(LazyThreadSafetyMode.f406615c, new C43437x0(this));

    public C43439y0(@Y61.k kotlin.G0 g02) {
        this.f412923a = g02;
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @Y61.k
    public final T deserialize(@Y61.k Decoder decoder) {
        SerialDescriptor f412706c = getF412706c();
        kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
        int iJ2 = cVarC.j(getF412706c());
        if (iJ2 != -1) {
            throw new SerializationException(AK.c.g(iJ2, "Unexpected index "));
        }
        kotlin.G0 g02 = kotlin.G0.f406611a;
        cVarC.d(f412706c);
        return (T) this.f412923a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return (SerialDescriptor) this.f412925c.getValue();
    }

    @Override // kotlinx.serialization.x
    public final void serialize(@Y61.k Encoder encoder, @Y61.k T t12) {
        encoder.c(getF412706c()).d(getF412706c());
    }
}
