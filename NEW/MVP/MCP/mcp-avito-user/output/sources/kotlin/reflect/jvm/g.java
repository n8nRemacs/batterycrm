package kotlin.reflect.jvm;

import Y61.k;
import Y61.l;
import java.io.ByteArrayInputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.A;
import kotlin.reflect.jvm.internal.C42846h;
import kotlin.reflect.jvm.internal.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.o;
import m51.C43887a;
import m51.i;

/* compiled from: reflectLambda.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class g {
    @a
    @l
    public static final A a(@k E e12) {
        Metadata metadata = (Metadata) e12.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 == null) {
            return null;
        }
        String[] strArrD2 = metadata.d2();
        i iVar = i.f414326a;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C43887a.a(strArrD1));
        i.f414326a.getClass();
        m51.f fVarG = i.g(byteArrayInputStream, strArrD2);
        kotlin.reflect.jvm.internal.impl.protobuf.f fVar = i.f414327b;
        kotlin.reflect.jvm.internal.impl.protobuf.b bVar = (kotlin.reflect.jvm.internal.impl.protobuf.b) ProtoBuf.e.f408917w;
        bVar.getClass();
        kotlin.reflect.jvm.internal.impl.protobuf.e eVar = new kotlin.reflect.jvm.internal.impl.protobuf.e(byteArrayInputStream);
        o oVar = (o) bVar.a(eVar, fVar);
        try {
            eVar.a(0);
            kotlin.reflect.jvm.internal.impl.protobuf.b.b(oVar);
            ProtoBuf.e eVar2 = (ProtoBuf.e) oVar;
            return new A(C42846h.f407156e, (a0) i0.f(e12.getClass(), eVar2, fVarG, new kotlin.reflect.jvm.internal.impl.metadata.deserialization.g(eVar2.f408932q), new m51.e(metadata.mv(), (metadata.xi() & 8) != 0), f.f406965b));
        } catch (InvalidProtocolBufferException e13) {
            e13.f409295b = oVar;
            throw e13;
        }
    }
}
