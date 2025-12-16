package androidx.work.impl.utils;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: RawQueries.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@X41.i
/* loaded from: classes10.dex */
public final class y {
    public static final void a(int i12, StringBuilder sb2) {
        if (i12 <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            arrayList.add("?");
        }
        sb2.append(C42745f0.O(arrayList, ",", null, null, null, 62));
    }
}
