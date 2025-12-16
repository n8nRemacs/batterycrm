package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import Y61.k;
import Y61.l;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* compiled from: ProtoBufUtil.kt */
/* loaded from: classes8.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final <M extends h.d<M>, T> T a(@k h.d<M> dVar, @k h.g<M, T> gVar) {
        if (dVar.k(gVar)) {
            return (T) dVar.g(gVar);
        }
        return null;
    }
}
