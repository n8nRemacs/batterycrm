package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: MyersDiff.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/A;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public int[] f40542a;

    /* renamed from: b, reason: collision with root package name */
    public int f40543b;

    public A(int i12) {
        this.f40542a = new int[i12];
    }

    public final void a(int i12, int i13, int i14) {
        int i15 = this.f40543b;
        int[] iArrCopyOf = this.f40542a;
        int i16 = i15 + 3;
        if (i16 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f40542a = iArrCopyOf;
        }
        iArrCopyOf[i15] = i12 + i14;
        iArrCopyOf[i15 + 1] = i13 + i14;
        iArrCopyOf[i15 + 2] = i14;
        this.f40543b = i16;
    }

    public final void b(int i12, int i13, int i14, int i15) {
        int i16 = this.f40543b;
        int[] iArrCopyOf = this.f40542a;
        int i17 = i16 + 4;
        if (i17 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f40542a = iArrCopyOf;
        }
        iArrCopyOf[i16] = i12;
        iArrCopyOf[i16 + 1] = i13;
        iArrCopyOf[i16 + 2] = i14;
        iArrCopyOf[i16 + 3] = i15;
        this.f40543b = i17;
    }

    public final void c(int i12, int i13) {
        if (i12 < i13) {
            int i14 = i12 - 3;
            for (int i15 = i12; i15 < i13; i15 += 3) {
                int[] iArr = this.f40542a;
                int i16 = iArr[i15];
                int i17 = iArr[i13];
                if (i16 < i17 || (i16 == i17 && iArr[i15 + 1] <= iArr[i13 + 1])) {
                    i14 += 3;
                    d(i14, i15);
                }
            }
            d(i14 + 3, i13);
            c(i12, i14);
            c(i14 + 6, i13);
        }
    }

    public final void d(int i12, int i13) {
        int[] iArr = this.f40542a;
        int i14 = iArr[i12];
        iArr[i12] = iArr[i13];
        iArr[i13] = i14;
        int i15 = i12 + 1;
        int i16 = i13 + 1;
        int i17 = iArr[i15];
        iArr[i15] = iArr[i16];
        iArr[i16] = i17;
        int i18 = i12 + 2;
        int i19 = i13 + 2;
        int i22 = iArr[i18];
        iArr[i18] = iArr[i19];
        iArr[i19] = i22;
    }
}
