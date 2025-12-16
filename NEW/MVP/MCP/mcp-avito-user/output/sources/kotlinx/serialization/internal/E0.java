package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlinx.serialization.InterfaceC43389h;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: PluginExceptions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class E0 {
    @InterfaceC43389h
    public static final void a(@Y61.k int[] iArr, @Y61.k int[] iArr2, @Y61.k SerialDescriptor serialDescriptor) {
        ArrayList arrayList = new ArrayList();
        int length = iArr2.length;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr2[i12] & (~iArr[i12]);
            if (i13 != 0) {
                for (int i14 = 0; i14 < 32; i14++) {
                    if ((i13 & 1) != 0) {
                        arrayList.add(serialDescriptor.d((i12 * 32) + i14));
                    }
                    i13 >>>= 1;
                }
            }
        }
        throw new MissingFieldException(arrayList, serialDescriptor.getF412788a());
    }

    @InterfaceC43389h
    public static final void b(int i12, int i13, @Y61.k SerialDescriptor serialDescriptor) {
        ArrayList arrayList = new ArrayList();
        int i14 = (~i12) & i13;
        for (int i15 = 0; i15 < 32; i15++) {
            if ((i14 & 1) != 0) {
                arrayList.add(serialDescriptor.d(i15));
            }
            i14 >>>= 1;
        }
        throw new MissingFieldException(arrayList, serialDescriptor.getF412788a());
    }
}
