package kotlin.reflect.jvm;

import Y41.p;
import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.m0;
import kotlin.reflect.h;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.z;

/* compiled from: reflectLambda.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class f extends G implements p<z, ProtoBuf.e, a0> {

    /* renamed from: b, reason: collision with root package name */
    public static final f f406965b = new f();

    public f() {
        super(2);
    }

    @Override // kotlin.jvm.internal.AbstractC42817q, kotlin.reflect.c
    @k
    /* renamed from: getName */
    public final String getF407039i() {
        return "loadFunction";
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    @k
    public final h getOwner() {
        return m0.f406844a.b(z.class);
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    @k
    public final String getSignature() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    @Override // Y41.p
    public final a0 invoke(z zVar, ProtoBuf.e eVar) {
        return zVar.e(eVar);
    }
}
