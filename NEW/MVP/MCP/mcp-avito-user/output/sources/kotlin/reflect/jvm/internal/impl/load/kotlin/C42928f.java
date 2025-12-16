package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.load.kotlin.C;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import m51.d;

/* compiled from: AbstractBinaryClassAnnotationLoader.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42928f {
    @Y61.l
    public static final C a(@Y61.k ProtoBuf.h hVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, boolean z12, boolean z13, boolean z14) {
        JvmProtoBuf.d dVar = (JvmProtoBuf.d) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(hVar, JvmProtoBuf.f409148d);
        if (dVar == null) {
            return null;
        }
        if (z12) {
            m51.i.f414326a.getClass();
            d.a aVarB = m51.i.b(hVar, cVar, gVar, z14);
            if (aVarB == null) {
                return null;
            }
            C.f408430b.getClass();
            return C.a.b(aVarB);
        }
        if (!z13 || (dVar.f409221c & 2) != 2) {
            return null;
        }
        C.a aVar = C.f408430b;
        JvmProtoBuf.c cVar2 = dVar.f409223e;
        aVar.getClass();
        return new C(cVar.getString(cVar2.f409211d).concat(cVar.getString(cVar2.f409212e)), null);
    }
}
