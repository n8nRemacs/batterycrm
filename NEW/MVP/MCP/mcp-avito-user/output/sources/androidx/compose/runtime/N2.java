package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "g", "()V", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class N2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final long[] f38061a = new long[0];

    public static final int a(int i12, int[] iArr) {
        return iArr[(i12 * 5) + 3];
    }

    public static final int b(ArrayList arrayList, int i12, int i13) {
        int iF2 = f(arrayList, i12, i13);
        return iF2 >= 0 ? iF2 : -(iF2 + 1);
    }

    public static final int c(int i12, int[] iArr) {
        int i13 = i12 * 5;
        return Integer.bitCount(iArr[i13 + 1] >> 30) + iArr[i13 + 4];
    }

    public static final int d(int i12, int[] iArr) {
        int i13 = i12 * 5;
        return Integer.bitCount(iArr[i13 + 1] >> 28) + iArr[i13 + 4];
    }

    public static final void e(int i12, int i13, int[] iArr) {
        if (i13 >= 0) {
        }
        int i14 = (i12 * 5) + 1;
        iArr[i14] = i13 | (iArr[i14] & (-67108864));
    }

    public static final int f(ArrayList<C22068g> arrayList, int i12, int i13) {
        int size = arrayList.size() - 1;
        int i14 = 0;
        while (i14 <= size) {
            int i15 = (i14 + size) >>> 1;
            int i16 = arrayList.get(i15).f38401a;
            if (i16 < 0) {
                i16 += i13;
            }
            int iG2 = kotlin.jvm.internal.L.g(i16, i12);
            if (iG2 < 0) {
                i14 = i15 + 1;
            } else {
                if (iG2 <= 0) {
                    return i15;
                }
                size = i15 - 1;
            }
        }
        return -(i14 + 1);
    }

    public static final void g() {
        throw new ConcurrentModificationException();
    }
}
