package x40;

import Y61.k;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.u0;
import kotlin.text.C43066x;
import okhttp3.Headers;

/* compiled from: HeadersExt.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_offlinization_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: x40.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C49763c {
    @k
    public static final Set<String> a(@k Headers headers) {
        int size = headers.size();
        TreeSet treeSet = null;
        for (int i12 = 0; i12 < size; i12++) {
            if ("Vary".equalsIgnoreCase(headers.name(i12))) {
                String strValue = headers.value(i12);
                if (treeSet == null) {
                    u0 u0Var = u0.f406856a;
                    treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                Iterator it = C43066x.e0(strValue, new char[]{','}).iterator();
                while (it.hasNext()) {
                    treeSet.add(C43066x.A0((String) it.next()).toString());
                }
            }
        }
        return treeSet == null ? B0.f406639b : treeSet;
    }
}
