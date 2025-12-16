package kotlinx.serialization.internal;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: PluginGeneratedSerialDescriptor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class F0 {
    public static final int a(@Y61.k SerialDescriptor serialDescriptor, @Y61.k SerialDescriptor[] serialDescriptorArr) {
        int iHashCode = (serialDescriptor.getF412796b().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        kotlinx.serialization.descriptors.i iVar = new kotlinx.serialization.descriptors.i(serialDescriptor);
        Iterator<SerialDescriptor> it = iVar.iterator();
        int iHashCode2 = 1;
        int i12 = 1;
        while (true) {
            kotlinx.serialization.descriptors.g gVar = (kotlinx.serialization.descriptors.g) it;
            int iHashCode3 = 0;
            if (!gVar.hasNext()) {
                break;
            }
            int i13 = i12 * 31;
            String f412796b = ((SerialDescriptor) gVar.next()).getF412796b();
            if (f412796b != null) {
                iHashCode3 = f412796b.hashCode();
            }
            i12 = i13 + iHashCode3;
        }
        Iterator<SerialDescriptor> it2 = iVar.iterator();
        while (true) {
            kotlinx.serialization.descriptors.g gVar2 = (kotlinx.serialization.descriptors.g) it2;
            if (!gVar2.hasNext()) {
                return (((iHashCode * 31) + i12) * 31) + iHashCode2;
            }
            int i14 = iHashCode2 * 31;
            kotlinx.serialization.descriptors.o kind = ((SerialDescriptor) gVar2.next()).getKind();
            iHashCode2 = i14 + (kind != null ? kind.hashCode() : 0);
        }
    }
}
