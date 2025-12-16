package androidx.compose.ui.unit;

import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.F3;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.u;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Constraints.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "widthVal", "heightVal", "Lkotlin/G0;", "k", "(II)V", "size", "", "l", "(I)Ljava/lang/Void;", "ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.unit.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22713c {
    @F3
    public static final long a(int i12, int i13, int i14, int i15) {
        if (!((i14 >= 0) & (i13 >= i12) & (i15 >= i14) & (i12 >= 0))) {
            p.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i12, i13, i14, i15);
    }

    public static /* synthetic */ long b(int i12, int i13, int i14) {
        if ((i14 & 2) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        if ((i14 & 8) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return a(0, i12, 0, i13);
    }

    public static final int c(int i12) {
        if (i12 < 8191) {
            return 13;
        }
        if (i12 < 32767) {
            return 15;
        }
        if (i12 < 65535) {
            return 16;
        }
        return i12 < 262143 ? 18 : 255;
    }

    @F3
    public static final long d(long j12, long j13) {
        int i12 = (int) (j13 >> 32);
        int iL2 = C22712b.l(j12);
        int iJ2 = C22712b.j(j12);
        if (i12 < iL2) {
            i12 = iL2;
        }
        if (i12 <= iJ2) {
            iJ2 = i12;
        }
        int i13 = (int) (j13 & 4294967295L);
        int iK2 = C22712b.k(j12);
        int i14 = C22712b.i(j12);
        if (i13 < iK2) {
            i13 = iK2;
        }
        if (i13 <= i14) {
            i14 = i13;
        }
        long j14 = (iJ2 << 32) | (i14 & 4294967295L);
        u.a aVar = u.f42871b;
        return j14;
    }

    public static final long e(long j12, long j13) {
        int iL2 = C22712b.l(j12);
        int iJ2 = C22712b.j(j12);
        int iK2 = C22712b.k(j12);
        int i12 = C22712b.i(j12);
        int iL3 = C22712b.l(j13);
        if (iL3 < iL2) {
            iL3 = iL2;
        }
        if (iL3 > iJ2) {
            iL3 = iJ2;
        }
        int iJ3 = C22712b.j(j13);
        if (iJ3 >= iL2) {
            iL2 = iJ3;
        }
        if (iL2 <= iJ2) {
            iJ2 = iL2;
        }
        int iK3 = C22712b.k(j13);
        if (iK3 < iK2) {
            iK3 = iK2;
        }
        if (iK3 > i12) {
            iK3 = i12;
        }
        int i13 = C22712b.i(j13);
        if (i13 >= iK2) {
            iK2 = i13;
        }
        if (iK2 <= i12) {
            i12 = iK2;
        }
        return a(iL3, iJ2, iK3, i12);
    }

    @F3
    public static final int f(int i12, long j12) {
        int iK2 = C22712b.k(j12);
        int i13 = C22712b.i(j12);
        if (i12 < iK2) {
            i12 = iK2;
        }
        return i12 > i13 ? i13 : i12;
    }

    @F3
    public static final int g(int i12, long j12) {
        int iL2 = C22712b.l(j12);
        int iJ2 = C22712b.j(j12);
        if (i12 < iL2) {
            i12 = iL2;
        }
        return i12 > iJ2 ? iJ2 : i12;
    }

    public static final long h(int i12, int i13, int i14, int i15) {
        int i16 = i15 == Integer.MAX_VALUE ? i14 : i15;
        int iC2 = c(i16);
        int i17 = i13 == Integer.MAX_VALUE ? i12 : i13;
        int iC3 = c(i17);
        if (iC2 + iC3 > 31) {
            k(i17, i16);
        }
        int i18 = i13 + 1;
        int i19 = i15 + 1;
        int i22 = iC3 - 13;
        long j12 = ((i18 & (~(i18 >> 31))) << 33) | ((i22 >> 1) + (i22 & 1)) | (i12 << 2) | (i14 << (iC3 + 2)) | ((i19 & (~(i19 >> 31))) << (iC3 + 33));
        C22712b.a aVar = C22712b.f42842b;
        return j12;
    }

    @F3
    public static final long i(int i12, int i13, long j12) {
        int iL2 = C22712b.l(j12) + i12;
        if (iL2 < 0) {
            iL2 = 0;
        }
        int iJ2 = C22712b.j(j12);
        if (iJ2 != Integer.MAX_VALUE && (iJ2 = iJ2 + i12) < 0) {
            iJ2 = 0;
        }
        int iK2 = C22712b.k(j12) + i13;
        if (iK2 < 0) {
            iK2 = 0;
        }
        int i14 = C22712b.i(j12);
        return a(iL2, iJ2, iK2, (i14 == Integer.MAX_VALUE || (i14 = i14 + i13) >= 0) ? i14 : 0);
    }

    public static /* synthetic */ long j(int i12, int i13, long j12, int i14) {
        if ((i14 & 1) != 0) {
            i12 = 0;
        }
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        return i(i12, i13, j12);
    }

    public static final void k(int i12, int i13) {
        throw new IllegalArgumentException(androidx.appcompat.app.r.l(i12, i13, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    @Y61.k
    public static final Void l(int i12) {
        throw new IllegalArgumentException(G.e(i12, "Can't represent a size of ", " in Constraints"));
    }
}
