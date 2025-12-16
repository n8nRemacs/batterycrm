package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import Y61.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* compiled from: TypeTable.kt */
@s0
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<ProtoBuf.Type> f409141a;

    public g(@k ProtoBuf.k kVar) {
        List<ProtoBuf.Type> list = kVar.f409057d;
        if ((kVar.f409056c & 1) == 1) {
            int i12 = kVar.f409058e;
            List<ProtoBuf.Type> list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            int i13 = 0;
            for (Object obj : list2) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                ProtoBuf.Type typeM = (ProtoBuf.Type) obj;
                if (i13 >= i12) {
                    typeM.getClass();
                    ProtoBuf.Type.b bVarR = ProtoBuf.Type.r(typeM);
                    bVarR.f408815e |= 2;
                    bVarR.f408817g = true;
                    typeM = bVarR.m();
                    if (!typeM.isInitialized()) {
                        throw new UninitializedMessageException();
                    }
                }
                arrayList.add(typeM);
                i13 = i14;
            }
            list = arrayList;
        }
        this.f409141a = list;
    }

    @k
    public final ProtoBuf.Type a(int i12) {
        return this.f409141a.get(i12);
    }
}
