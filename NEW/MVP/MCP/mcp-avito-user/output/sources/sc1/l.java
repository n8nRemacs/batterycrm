package sc1;

import io.ktor.util.C41596g;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C42745f0;
import kotlin.text.C43044a;
import kotlin.text.C43066x;

/* loaded from: classes9.dex */
public abstract class l {
    public static final String a(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalStateException("Must have an even length");
        }
        ArrayList arrayListO = C43066x.o(2, str);
        ArrayList arrayList = new ArrayList(C42745f0.q(arrayListO, 10));
        Iterator it = arrayListO.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            C43044a.a(16);
            arrayList.add(Byte.valueOf((byte) Integer.parseInt(str2, 16)));
        }
        byte[] bArr = new byte[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        int i12 = 0;
        while (it2.hasNext()) {
            bArr[i12] = ((Number) it2.next()).byteValue();
            i12++;
        }
        return C41596g.a(C43066x.v(bArr));
    }
}
