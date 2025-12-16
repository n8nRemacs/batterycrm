package kotlin.collections.builders;

import Y61.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC42744f;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ListBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class c {
    public static final boolean a(Object[] objArr, int i12, int i13, List list) {
        if (i13 != list.size()) {
            return false;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            if (!L.f(objArr[i12 + i14], list.get(i14))) {
                return false;
            }
        }
        return true;
    }

    public static final String b(Object[] objArr, int i12, int i13, AbstractC42744f abstractC42744f) {
        StringBuilder sb2 = new StringBuilder((i13 * 3) + 2);
        sb2.append("[");
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i12 + i14];
            if (obj == abstractC42744f) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public static final void c(int i12, int i13, @k Object[] objArr) {
        while (i12 < i13) {
            objArr[i12] = null;
            i12++;
        }
    }
}
