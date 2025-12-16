package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.o;
import kotlinx.serialization.descriptors.p;
import kotlinx.serialization.json.AbstractC43443a;

/* compiled from: WriteMode.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class s0 {
    @Y61.k
    public static final SerialDescriptor a(@Y61.k SerialDescriptor serialDescriptor, @Y61.k kotlinx.serialization.modules.f fVar) {
        SerialDescriptor serialDescriptorA;
        KSerializer kSerializerB;
        if (!kotlin.jvm.internal.L.f(serialDescriptor.getF412729b(), o.a.f412749a)) {
            return serialDescriptor.getF412817l() ? a(serialDescriptor.h(0), fVar) : serialDescriptor;
        }
        kotlin.reflect.d<?> dVarA = kotlinx.serialization.descriptors.b.a(serialDescriptor);
        SerialDescriptor f412706c = null;
        if (dVarA != null && (kSerializerB = fVar.b(dVarA, C42784z0.f406748b)) != null) {
            f412706c = kSerializerB.getF412706c();
        }
        return (f412706c == null || (serialDescriptorA = a(f412706c, fVar)) == null) ? serialDescriptor : serialDescriptorA;
    }

    @Y61.k
    public static final WriteMode b(@Y61.k SerialDescriptor serialDescriptor, @Y61.k AbstractC43443a abstractC43443a) {
        kotlinx.serialization.descriptors.o f412729b = serialDescriptor.getF412729b();
        if (f412729b instanceof kotlinx.serialization.descriptors.d) {
            return WriteMode.f413037g;
        }
        if (kotlin.jvm.internal.L.f(f412729b, p.b.f412752a)) {
            return WriteMode.f413035e;
        }
        if (!kotlin.jvm.internal.L.f(f412729b, p.c.f412753a)) {
            return WriteMode.f413034d;
        }
        SerialDescriptor serialDescriptorA = a(serialDescriptor.h(0), abstractC43443a.f412956b);
        kotlinx.serialization.descriptors.o f412729b2 = serialDescriptorA.getF412729b();
        if ((f412729b2 instanceof kotlinx.serialization.descriptors.e) || kotlin.jvm.internal.L.f(f412729b2, o.b.f412750a)) {
            return WriteMode.f413036f;
        }
        if (abstractC43443a.f412955a.f412984d) {
            return WriteMode.f413035e;
        }
        throw D.b(serialDescriptorA);
    }
}
