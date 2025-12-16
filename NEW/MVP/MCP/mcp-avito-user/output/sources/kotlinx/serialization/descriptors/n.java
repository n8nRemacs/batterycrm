package kotlinx.serialization.descriptors;

import androidx.appcompat.app.r;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.serialization.InterfaceC43389h;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.descriptors.p;
import kotlinx.serialization.internal.L0;
import kotlinx.serialization.internal.M0;

/* compiled from: SerialDescriptors.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class n {
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Y61.k
    public static final L0 a(@Y61.k String str, @Y61.k e.i iVar) {
        if (C43066x.K(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Iterator it = M0.f412792a.keySet().iterator();
        while (it.hasNext()) {
            String strA = M0.a(((kotlin.reflect.d) it.next()).l0());
            if (str.equalsIgnoreCase("kotlin." + strA) || str.equalsIgnoreCase(strA)) {
                StringBuilder sbA = r.A("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exist ");
                sbA.append(M0.a(strA));
                sbA.append("Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(C43066x.E0(sbA.toString()));
            }
        }
        return new L0(str, iVar);
    }

    @Y61.k
    public static final f b(@Y61.k String str, @Y61.k SerialDescriptor[] serialDescriptorArr, @Y61.k Y41.l lVar) {
        if (C43066x.K(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        a aVar = new a(str);
        lVar.invoke(aVar);
        return new f(str, p.a.f412751a, aVar.f412709c.size(), C42756l.g0(serialDescriptorArr), aVar);
    }

    @InterfaceC43389h
    @Y61.k
    public static final f c(@Y61.k String str, @Y61.k o oVar, @Y61.k SerialDescriptor[] serialDescriptorArr, @Y61.k Y41.l lVar) {
        if (C43066x.K(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (oVar.equals(p.a.f412751a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        a aVar = new a(str);
        lVar.invoke(aVar);
        return new f(str, oVar, aVar.f412709c.size(), C42756l.g0(serialDescriptorArr), aVar);
    }
}
