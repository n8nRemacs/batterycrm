package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.G;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.M;
import kotlin.reflect.jvm.internal.impl.types.Y;

/* compiled from: DeserializedClassDescriptor.kt */
/* loaded from: classes8.dex */
final /* synthetic */ class h extends G implements Y41.l<ProtoBuf.Type, Y> {
    @Override // kotlin.jvm.internal.AbstractC42817q, kotlin.reflect.c
    @Y61.k
    /* renamed from: getName */
    public final String getF407039i() {
        return "simpleType";
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    @Y61.k
    public final kotlin.reflect.h getOwner() {
        return m0.f406844a.b(L.a.class);
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    @Y61.k
    public final String getSignature() {
        return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
    }

    @Override // Y41.l
    public final Y invoke(ProtoBuf.Type type) {
        return ((M) this.receiver).d(type, true);
    }
}
