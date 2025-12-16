package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.C22082i3;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: LazyStaggeredGridState.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class C0 extends kotlin.jvm.internal.H implements Y41.p<Integer, Integer, int[]> {
    @Override // Y41.p
    public final int[] invoke(Integer num, Integer num2) {
        int iMin;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        y0 y0Var = (y0) this.receiver;
        int i12 = y0.f29679w;
        y0Var.getClass();
        int[] iArr = new int[iIntValue2];
        ((C20770i0) ((C22082i3) y0Var.f29683d).getF42167b()).f29630j.a(iIntValue);
        Y y12 = y0Var.f29684e;
        y12.c(iIntValue + iIntValue2);
        int iF2 = y12.f(iIntValue);
        if (iF2 == -2 || iF2 == -1) {
            iMin = 0;
        } else {
            if (iF2 < 0) {
                androidx.compose.foundation.internal.e.a("Expected positive lane number, got " + iF2 + " instead.");
            }
            iMin = Math.min(iF2, iIntValue2);
        }
        int i13 = iMin - 1;
        int iD2 = iIntValue;
        while (true) {
            if (-1 >= i13) {
                break;
            }
            iD2 = y12.d(iD2, i13);
            iArr[i13] = iD2;
            if (iD2 == -1) {
                C42756l.z(iArr, -1, i13, 2);
                break;
            }
            i13--;
        }
        iArr[iMin] = iIntValue;
        while (true) {
            iMin++;
            if (iMin >= iIntValue2) {
                return iArr;
            }
            iIntValue++;
            int length = y12.f29582a + y12.f29583b.length;
            while (true) {
                if (iIntValue >= length) {
                    iIntValue = y12.f29582a + y12.f29583b.length;
                    break;
                }
                if (y12.a(iIntValue, iMin)) {
                    break;
                }
                iIntValue++;
            }
            iArr[iMin] = iIntValue;
        }
    }
}
