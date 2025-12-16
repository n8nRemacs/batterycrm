package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.G;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.types.Y;

/* compiled from: DeserializedClassDescriptor.kt */
/* loaded from: classes8.dex */
final /* synthetic */ class i extends G implements Y41.l<kotlin.reflect.jvm.internal.impl.name.f, Y> {
    @Override // kotlin.jvm.internal.AbstractC42817q, kotlin.reflect.c
    @Y61.k
    /* renamed from: getName */
    public final String getF407039i() {
        return "getValueClassPropertyType";
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    @Y61.k
    public final kotlin.reflect.h getOwner() {
        return m0.f406844a.b(e.class);
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    @Y61.k
    public final String getSignature() {
        return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
    }

    @Override // Y41.l
    public final Y invoke(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        e eVar = (e) this.receiver;
        int i12 = e.f409800A;
        return eVar.G0(fVar);
    }
}
