package E0;

import Y41.l;
import Y61.k;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.X;
import kotlin.jvm.internal.s0;

/* compiled from: ListUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "message", "", "c", "(Ljava/lang/String;)Ljava/lang/Void;", "Lkotlin/G0;", "d", "(Ljava/lang/String;)V", "ui-util_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {
    @k
    public static final ArrayList a(@k ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = arrayList.get(i12);
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static String b(List list, String str, l lVar, int i12) {
        if ((i12 & 1) != 0) {
            str = ", ";
        }
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = list.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            Object obj = list.get(i14);
            i13++;
            if (i13 > 1) {
                sb2.append((CharSequence) str);
            }
            if (lVar != null) {
                sb2.append((CharSequence) lVar.invoke(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    @X
    @k
    public static final Void c(@k String str) {
        throw new NoSuchElementException(str);
    }

    @X
    public static final void d(@k String str) {
        throw new UnsupportedOperationException(str);
    }
}
