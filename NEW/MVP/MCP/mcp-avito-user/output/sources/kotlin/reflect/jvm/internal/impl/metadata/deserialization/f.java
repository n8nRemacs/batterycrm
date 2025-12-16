package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import Y61.k;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* compiled from: protoTypeTableUtil.kt */
@s0
/* loaded from: classes8.dex */
public final class f {
    @k
    public static final ProtoBuf.Type a(@k ProtoBuf.l lVar, @k g gVar) {
        int i12 = lVar.f409067d;
        if ((i12 & 4) == 4) {
            return lVar.f409070g;
        }
        if ((i12 & 8) == 8) {
            return gVar.a(lVar.f409071h);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }
}
