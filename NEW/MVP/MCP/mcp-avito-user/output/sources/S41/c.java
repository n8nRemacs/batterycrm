package S41;

import X41.i;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Thread.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@i
/* loaded from: classes8.dex */
public final class c {
    public static b a(int i12, Y41.a aVar) {
        boolean z12 = (i12 & 1) != 0;
        String str = (i12 & 8) != 0 ? null : "Heap analysis executor";
        b bVar = new b(aVar);
        if (str != null) {
            bVar.setName(str);
        }
        if (z12) {
            bVar.start();
        }
        return bVar;
    }
}
