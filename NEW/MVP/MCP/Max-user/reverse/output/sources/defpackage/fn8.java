package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class fn8 {
    public static volatile a07 a;
    public static final int[] b = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] c = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] d = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] e = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] f = {5, 8, 10, 12};
    public static final int[] g = {6, 9, 12, 15};
    public static final int[] h = {2, 4, 6, 8};
    public static final int[] i = {9, 11, 13, 16};
    public static final int[] j = {5, 8, 10, 12};

    public static final void a(File file, List list) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), lb2.a);
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                outputStreamWriter.write((String) it.next());
                outputStreamWriter.write(10);
            }
            outputStreamWriter.close();
        } finally {
        }
    }

    public static u62 b(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == 127 || b2 == 100 || b2 == 64 || b2 == 113) {
            return new u62(bArr, bArr.length, 3, (byte) 0);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = bArrCopyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b4 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b4;
            }
        }
        u62 u62Var = new u62(bArrCopyOf, bArrCopyOf.length, 3, (byte) 0);
        if (bArrCopyOf[0] == 31) {
            u62 u62Var2 = new u62(bArrCopyOf, bArrCopyOf.length, 3, (byte) 0);
            while (u62Var2.b() >= 16) {
                u62Var2.t(2);
                int i4 = u62Var2.i(14) & 16383;
                int iMin = Math.min(8 - u62Var.c, 14);
                int i5 = u62Var.c;
                int i6 = (8 - i5) - iMin;
                byte[] bArr2 = u62Var.d;
                int i7 = u62Var.b;
                byte b5 = (byte) (((65280 >> i5) | ((1 << i6) - 1)) & bArr2[i7]);
                bArr2[i7] = b5;
                int i8 = 14 - iMin;
                bArr2[i7] = (byte) (b5 | ((i4 >>> i8) << i6));
                int i9 = i7 + 1;
                while (i8 > 8) {
                    u62Var.d[i9] = (byte) (i4 >>> (i8 - 8));
                    i8 -= 8;
                    i9++;
                }
                int i10 = 8 - i8;
                byte[] bArr3 = u62Var.d;
                byte b6 = (byte) (bArr3[i9] & ((1 << i10) - 1));
                bArr3[i9] = b6;
                bArr3[i9] = (byte) (((i4 & ((1 << i8) - 1)) << i10) | b6);
                u62Var.t(14);
                u62Var.a();
            }
        }
        u62Var.o(bArrCopyOf.length, bArrCopyOf);
        return u62Var;
    }

    public static int c(u62 u62Var, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && u62Var.h(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return u62Var.i(iArr[i2]) + i4;
    }

    public static final void d(esg esgVar) {
        esgVar.d(617, new a13(20));
        esgVar.d(540, new a13(21));
        esgVar.d(558, new a13(22));
        esgVar.d(618, new a13(23));
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        esgVar.d(619, new bl6(0, atomicBoolean));
        esgVar.b(2, new al6(atomicBoolean));
        esgVar.d(583, new a13(24));
        esgVar.d(582, new a13(25));
        esgVar.d(620, new a13(26));
        esgVar.d(621, new a13(27));
    }
}
