package defpackage;

import android.view.View;
import android.widget.ImageView;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public abstract class gfi {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    public static void a(OneMeButton oneMeButton, mfb mfbVar, yeb yebVar) {
        boolean z = mfbVar instanceof kfb;
        gza gzaVar = gza.c;
        iza izaVar = iza.d;
        jza jzaVar = jza.b;
        if (z) {
            rfb rfbVar = ((kfb) mfbVar).a;
            if (oneMeButton == null) {
                oneMeButton = null;
            }
            if (oneMeButton != null) {
                oneMeButton.setSize(jzaVar);
                oneMeButton.setMode(izaVar);
                oneMeButton.setAppearance(gzaVar);
                return;
            }
            return;
        }
        if (!(mfbVar instanceof gfb) && !(mfbVar instanceof hfb)) {
            if (!(mfbVar instanceof jfb)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        if (oneMeButton == null) {
            oneMeButton = null;
        }
        if (oneMeButton != null) {
            oneMeButton.setSize(jzaVar);
            oneMeButton.setMode(izaVar);
            oneMeButton.setAppearance(gzaVar);
            oneMeButton.setCustomTheme(yebVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v16 */
    public static void b(View view, ofb ofbVar, int i) {
        ufb ufbVar;
        boolean z = ofbVar instanceof lfb;
        gza gzaVar = gza.c;
        iza izaVar = iza.d;
        jza jzaVar = jza.b;
        if (!z) {
            if (ofbVar instanceof nfb) {
                OneMeButton oneMeButton = view instanceof OneMeButton ? (OneMeButton) view : null;
                if (oneMeButton != null) {
                    oneMeButton.setSize(jzaVar);
                    oneMeButton.setMode(izaVar);
                    oneMeButton.setAppearance(gzaVar);
                    return;
                }
                return;
            }
            if (!(ofbVar instanceof ifb) && !(ofbVar instanceof hfb)) {
                if (!(ofbVar instanceof jfb)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            oneMeButton = view instanceof OneMeButton ? (OneMeButton) view : 0;
            if (oneMeButton != 0) {
                oneMeButton.setSize(jzaVar);
                oneMeButton.setMode(izaVar);
                oneMeButton.setAppearance(gzaVar);
                return;
            }
            return;
        }
        int iV = az1.v(i);
        if (iV == 0) {
            ufbVar = ((lfb) ofbVar).b;
        } else if (iV == 1) {
            ufbVar = ((lfb) ofbVar).a;
        } else {
            if (iV != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ufbVar = ((lfb) ofbVar).c;
        }
        if (ufbVar instanceof tfb) {
            fbb fbbVar = view instanceof fbb ? (fbb) view : null;
            if (fbbVar != null) {
                fbbVar.setCollapsedStyle(bbb.b);
                return;
            }
            return;
        }
        if (ufbVar instanceof rfb) {
            OneMeButton oneMeButton2 = view instanceof OneMeButton ? (OneMeButton) view : null;
            if (oneMeButton2 != null) {
                oneMeButton2.setSize(jzaVar);
                oneMeButton2.setMode(izaVar);
                oneMeButton2.setAppearance(gzaVar);
                return;
            }
            return;
        }
        if (!(ufbVar instanceof sfb)) {
            if (ufbVar != null) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
            if (imageView != null) {
                tqi.c(new z8e(ufbVar, (Continuation) oneMeButton, 7), imageView);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v12 */
    public static void c(View view, ofb ofbVar, int i) {
        ufb ufbVar;
        iza izaVar;
        boolean z = ofbVar instanceof lfb;
        gza gzaVar = gza.d;
        gza gzaVar2 = gza.c;
        if (!z) {
            if (!(ofbVar instanceof nfb) && !(ofbVar instanceof ifb) && !(ofbVar instanceof hfb)) {
                if (!(ofbVar instanceof jfb)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            int iV = az1.v(i);
            if (iV != 0) {
                if (iV != 1 && iV != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                gzaVar = gzaVar2;
            }
            oneMeButton = view instanceof OneMeButton ? (OneMeButton) view : 0;
            if (oneMeButton != 0) {
                oneMeButton.setSize(jza.b);
                oneMeButton.setMode(iza.d);
                oneMeButton.setAppearance(gzaVar);
                return;
            }
            return;
        }
        int iV2 = az1.v(i);
        if (iV2 == 0) {
            ufbVar = ((lfb) ofbVar).b;
        } else if (iV2 == 1) {
            ufbVar = ((lfb) ofbVar).a;
        } else {
            if (iV2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ufbVar = ((lfb) ofbVar).c;
        }
        int iV3 = az1.v(i);
        if (iV3 != 0) {
            izaVar = iza.b;
            if (iV3 != 1 && iV3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            izaVar = iza.a;
        }
        int iV4 = az1.v(i);
        if (iV4 != 0) {
            if (iV4 != 1 && iV4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            gzaVar = gzaVar2;
        }
        if (ufbVar instanceof tfb) {
            fbb fbbVar = view instanceof fbb ? (fbb) view : null;
            if (fbbVar != null) {
                fbbVar.setCollapsedStyle(bbb.a);
                return;
            }
            return;
        }
        if (ufbVar instanceof rfb) {
            OneMeButton oneMeButton = view instanceof OneMeButton ? (OneMeButton) view : null;
            if (oneMeButton != null) {
                oneMeButton.setSize(jza.a);
                oneMeButton.setMode(izaVar);
                oneMeButton.setAppearance(gzaVar);
                return;
            }
            return;
        }
        if (!(ufbVar instanceof sfb)) {
            if (ufbVar != null) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
            if (imageView != null) {
                tqi.c(new kga(view, (Continuation) oneMeButton, 28), imageView);
            }
        }
    }

    public static void d(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int e(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        fsi.d(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            d(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            d(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            d(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    d(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.d f(defpackage.tm9 r13) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gfi.f(tm9):d");
    }

    public static aca g(int i, byte[] bArr, int i2) {
        u62 u62Var = new u62(i + 2, i2, 4, bArr);
        int i3 = 4;
        u62Var.t(4);
        int i4 = u62Var.i(3);
        u62Var.s();
        int i5 = u62Var.i(2);
        boolean zH = u62Var.h();
        int i6 = u62Var.i(5);
        int i7 = 0;
        for (int i8 = 0; i8 < 32; i8++) {
            if (u62Var.h()) {
                i7 |= 1 << i8;
            }
        }
        int i9 = 6;
        int[] iArr = new int[6];
        for (int i10 = 0; i10 < 6; i10++) {
            iArr[i10] = u62Var.i(8);
        }
        int i11 = 0;
        int i12 = u62Var.i(8);
        for (int i13 = 0; i13 < i4; i13++) {
            if (u62Var.h()) {
                i11 += 89;
            }
            if (u62Var.h()) {
                i11 += 8;
            }
        }
        u62Var.t(i11);
        if (i4 > 0) {
            u62Var.t((8 - i4) * 2);
        }
        u62Var.m();
        int iM = u62Var.m();
        if (iM == 3) {
            u62Var.s();
        }
        int iM2 = u62Var.m();
        int iM3 = u62Var.m();
        if (u62Var.h()) {
            int iM4 = u62Var.m();
            int iM5 = u62Var.m();
            int iM6 = u62Var.m();
            int iM7 = u62Var.m();
            iM2 -= (iM4 + iM5) * ((iM == 1 || iM == 2) ? 2 : 1);
            iM3 -= (iM6 + iM7) * (iM == 1 ? 2 : 1);
        }
        u62Var.m();
        u62Var.m();
        int iM8 = u62Var.m();
        for (int i14 = u62Var.h() ? 0 : i4; i14 <= i4; i14++) {
            u62Var.m();
            u62Var.m();
            u62Var.m();
        }
        u62Var.m();
        u62Var.m();
        u62Var.m();
        u62Var.m();
        u62Var.m();
        u62Var.m();
        if (u62Var.h() && u62Var.h()) {
            int i15 = 0;
            while (i15 < i3) {
                int i16 = 0;
                while (i16 < i9) {
                    if (u62Var.h()) {
                        int iMin = Math.min(64, 1 << ((i15 << 1) + 4));
                        if (i15 > 1) {
                            u62Var.n();
                        }
                        for (int i17 = 0; i17 < iMin; i17++) {
                            u62Var.n();
                        }
                    } else {
                        u62Var.m();
                    }
                    i16 += i15 == 3 ? 3 : 1;
                    i9 = 6;
                }
                i15++;
                i3 = 4;
                i9 = 6;
            }
        }
        u62Var.t(2);
        if (u62Var.h()) {
            u62Var.t(8);
            u62Var.m();
            u62Var.m();
            u62Var.s();
        }
        int iM9 = u62Var.m();
        boolean zH2 = false;
        int i18 = 0;
        for (int i19 = 0; i19 < iM9; i19++) {
            if (i19 != 0) {
                zH2 = u62Var.h();
            }
            if (zH2) {
                u62Var.s();
                u62Var.m();
                for (int i20 = 0; i20 <= i18; i20++) {
                    if (!u62Var.h()) {
                        u62Var.s();
                    }
                }
            } else {
                int iM10 = u62Var.m();
                int iM11 = u62Var.m();
                int i21 = iM10 + iM11;
                for (int i22 = 0; i22 < iM10; i22++) {
                    u62Var.m();
                    u62Var.s();
                }
                for (int i23 = 0; i23 < iM11; i23++) {
                    u62Var.m();
                    u62Var.s();
                }
                i18 = i21;
            }
        }
        if (u62Var.h()) {
            for (int i24 = 0; i24 < u62Var.m(); i24++) {
                u62Var.t(iM8 + 5);
            }
        }
        u62Var.t(2);
        float f = 1.0f;
        if (u62Var.h()) {
            if (u62Var.h()) {
                int i25 = u62Var.i(8);
                if (i25 == 255) {
                    int i26 = u62Var.i(16);
                    int i27 = u62Var.i(16);
                    if (i26 != 0 && i27 != 0) {
                        f = i26 / i27;
                    }
                } else if (i25 < 17) {
                    f = b[i25];
                } else {
                    az1.s("Unexpected aspect_ratio_idc value: ", 46, i25, "NalUnitUtil");
                }
            }
            if (u62Var.h()) {
                u62Var.s();
            }
            if (u62Var.h()) {
                u62Var.t(4);
                if (u62Var.h()) {
                    u62Var.t(24);
                }
            }
            if (u62Var.h()) {
                u62Var.m();
                u62Var.m();
            }
            u62Var.s();
            if (u62Var.h()) {
                iM3 *= 2;
            }
        }
        return new aca(i5, zH, i6, i7, iArr, i12, iM2, iM3, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.fca h(int r23, byte[] r24, int r25) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gfi.h(int, byte[], int):fca");
    }

    public static int i(int i, byte[] bArr) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = d;
                    if (iArr.length <= i4) {
                        d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
