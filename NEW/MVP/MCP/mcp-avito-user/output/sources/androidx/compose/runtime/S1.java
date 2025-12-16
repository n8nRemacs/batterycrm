package androidx.compose.runtime;

import androidx.collection.C20247y0;
import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@X41.g
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/S1;", "", "list", "Landroidx/collection/y0;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class S1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C20247y0 f38150a;

    public static final void a(C20247y0 c20247y0, int i12) {
        if (c20247y0.f25545b == 0 || !(c20247y0.a(0) == i12 || c20247y0.a(c20247y0.f25545b - 1) == i12)) {
            int i13 = c20247y0.f25545b;
            c20247y0.d(i12);
            while (i13 > 0) {
                int i14 = ((i13 + 1) >>> 1) - 1;
                int iA2 = c20247y0.a(i14);
                if (i12 <= iA2) {
                    break;
                }
                c20247y0.g(i13, iA2);
                i13 = i14;
            }
            c20247y0.g(i13, i12);
        }
    }

    public static final int b(C20247y0 c20247y0) {
        int iA2;
        int i12 = c20247y0.f25545b;
        int iA3 = c20247y0.a(0);
        while (c20247y0.f25545b != 0 && c20247y0.a(0) == iA3) {
            c20247y0.g(0, c20247y0.b());
            c20247y0.f(c20247y0.f25545b - 1);
            int i13 = c20247y0.f25545b;
            int i14 = i13 >>> 1;
            int i15 = 0;
            while (i15 < i14) {
                int iA4 = c20247y0.a(i15);
                int i16 = (i15 + 1) * 2;
                int i17 = i16 - 1;
                int iA5 = c20247y0.a(i17);
                if (i16 >= i13 || (iA2 = c20247y0.a(i16)) <= iA5) {
                    if (iA5 > iA4) {
                        c20247y0.g(i15, iA5);
                        c20247y0.g(i17, iA4);
                        i15 = i17;
                    }
                } else if (iA2 > iA4) {
                    c20247y0.g(i15, iA2);
                    c20247y0.g(i16, iA4);
                    i15 = i16;
                }
            }
        }
        return iA3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof S1) {
            return kotlin.jvm.internal.L.f(this.f38150a, ((S1) obj).f38150a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38150a.hashCode();
    }

    public final String toString() {
        return "PrioritySet(list=" + this.f38150a + ')';
    }
}
