package kotlin.collections;

import java.util.List;
import kotlin.Metadata;

/* compiled from: ReversedViews.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.q0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C42767q0 extends C42765p0 {
    public static final int d(int i12, List list) {
        if (i12 >= 0 && i12 <= list.size() - 1) {
            return (list.size() - 1) - i12;
        }
        StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Element index ", " must be in range [");
        sbJ.append(new kotlin.ranges.l(0, list.size() - 1, 1));
        sbJ.append("].");
        throw new IndexOutOfBoundsException(sbJ.toString());
    }

    public static final int e(int i12, List list) {
        if (i12 >= 0 && i12 <= list.size()) {
            return list.size() - i12;
        }
        StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Position index ", " must be in range [");
        sbJ.append(new kotlin.ranges.l(0, list.size(), 1));
        sbJ.append("].");
        throw new IndexOutOfBoundsException(sbJ.toString());
    }
}
