package androidx.media3.extractor.text.dvb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.media3.common.util.M;
import androidx.media3.common.util.y;
import j.P;

/* compiled from: DvbParser.java */
/* loaded from: classes.dex */
final class b {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f51245h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f51246i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f51247j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f51248a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f51249b;

    /* renamed from: c, reason: collision with root package name */
    public final Canvas f51250c;

    /* renamed from: d, reason: collision with root package name */
    public final C1860b f51251d;

    /* renamed from: e, reason: collision with root package name */
    public final a f51252e;

    /* renamed from: f, reason: collision with root package name */
    public final h f51253f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f51254g;

    /* compiled from: DvbParser.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f51255a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f51256b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f51257c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f51258d;

        public a(int i12, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f51255a = i12;
            this.f51256b = iArr;
            this.f51257c = iArr2;
            this.f51258d = iArr3;
        }
    }

    /* compiled from: DvbParser.java */
    /* renamed from: androidx.media3.extractor.text.dvb.b$b, reason: collision with other inner class name */
    public static final class C1860b {

        /* renamed from: a, reason: collision with root package name */
        public final int f51259a;

        /* renamed from: b, reason: collision with root package name */
        public final int f51260b;

        /* renamed from: c, reason: collision with root package name */
        public final int f51261c;

        /* renamed from: d, reason: collision with root package name */
        public final int f51262d;

        /* renamed from: e, reason: collision with root package name */
        public final int f51263e;

        /* renamed from: f, reason: collision with root package name */
        public final int f51264f;

        public C1860b(int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f51259a = i12;
            this.f51260b = i13;
            this.f51261c = i14;
            this.f51262d = i15;
            this.f51263e = i16;
            this.f51264f = i17;
        }
    }

    /* compiled from: DvbParser.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f51265a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51266b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f51267c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f51268d;

        public c(int i12, boolean z12, byte[] bArr, byte[] bArr2) {
            this.f51265a = i12;
            this.f51266b = z12;
            this.f51267c = bArr;
            this.f51268d = bArr2;
        }
    }

    /* compiled from: DvbParser.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f51269a;

        /* renamed from: b, reason: collision with root package name */
        public final int f51270b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray<e> f51271c;

        public d(int i12, int i13, SparseArray sparseArray) {
            this.f51269a = i12;
            this.f51270b = i13;
            this.f51271c = sparseArray;
        }
    }

    /* compiled from: DvbParser.java */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f51272a;

        /* renamed from: b, reason: collision with root package name */
        public final int f51273b;

        public e(int i12, int i13) {
            this.f51272a = i12;
            this.f51273b = i13;
        }
    }

    /* compiled from: DvbParser.java */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f51274a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51275b;

        /* renamed from: c, reason: collision with root package name */
        public final int f51276c;

        /* renamed from: d, reason: collision with root package name */
        public final int f51277d;

        /* renamed from: e, reason: collision with root package name */
        public final int f51278e;

        /* renamed from: f, reason: collision with root package name */
        public final int f51279f;

        /* renamed from: g, reason: collision with root package name */
        public final int f51280g;

        /* renamed from: h, reason: collision with root package name */
        public final int f51281h;

        /* renamed from: i, reason: collision with root package name */
        public final int f51282i;

        /* renamed from: j, reason: collision with root package name */
        public final SparseArray<g> f51283j;

        public f(int i12, boolean z12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, SparseArray sparseArray) {
            this.f51274a = i12;
            this.f51275b = z12;
            this.f51276c = i13;
            this.f51277d = i14;
            this.f51278e = i15;
            this.f51279f = i16;
            this.f51280g = i17;
            this.f51281h = i18;
            this.f51282i = i19;
            this.f51283j = sparseArray;
        }
    }

    /* compiled from: DvbParser.java */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f51284a;

        /* renamed from: b, reason: collision with root package name */
        public final int f51285b;

        public g(int i12, int i13) {
            this.f51284a = i12;
            this.f51285b = i13;
        }
    }

    /* compiled from: DvbParser.java */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f51286a;

        /* renamed from: b, reason: collision with root package name */
        public final int f51287b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f51288c = new SparseArray<>();

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<a> f51289d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f51290e = new SparseArray<>();

        /* renamed from: f, reason: collision with root package name */
        public final SparseArray<a> f51291f = new SparseArray<>();

        /* renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f51292g = new SparseArray<>();

        /* renamed from: h, reason: collision with root package name */
        @P
        public C1860b f51293h;

        /* renamed from: i, reason: collision with root package name */
        @P
        public d f51294i;

        public h(int i12, int i13) {
            this.f51286a = i12;
            this.f51287b = i13;
        }
    }

    public b(int i12, int i13) {
        Paint paint = new Paint();
        this.f51248a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f51249b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f51250c = new Canvas();
        this.f51251d = new C1860b(719, 575, 0, 719, 0, 575);
        this.f51252e = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f51253f = new h(i12, i13);
    }

    public static byte[] a(int i12, int i13, y yVar) {
        byte[] bArr = new byte[i12];
        for (int i14 = 0; i14 < i12; i14++) {
            bArr[i14] = (byte) yVar.g(i13);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i12 = 1; i12 < 16; i12++) {
            if (i12 < 8) {
                iArr[i12] = d(255, (i12 & 1) != 0 ? 255 : 0, (i12 & 2) != 0 ? 255 : 0, (i12 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i12] = d(255, (i12 & 1) != 0 ? 127 : 0, (i12 & 2) != 0 ? 127 : 0, (i12 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            if (i12 < 8) {
                iArr[i12] = d(63, (i12 & 1) != 0 ? 255 : 0, (i12 & 2) != 0 ? 255 : 0, (i12 & 4) == 0 ? 0 : 255);
            } else {
                int i13 = i12 & 136;
                if (i13 == 0) {
                    iArr[i12] = d(255, ((i12 & 1) != 0 ? 85 : 0) + ((i12 & 16) != 0 ? 170 : 0), ((i12 & 2) != 0 ? 85 : 0) + ((i12 & 32) != 0 ? 170 : 0), ((i12 & 4) == 0 ? 0 : 85) + ((i12 & 64) == 0 ? 0 : 170));
                } else if (i13 == 8) {
                    iArr[i12] = d(127, ((i12 & 1) != 0 ? 85 : 0) + ((i12 & 16) != 0 ? 170 : 0), ((i12 & 2) != 0 ? 85 : 0) + ((i12 & 32) != 0 ? 170 : 0), ((i12 & 4) == 0 ? 0 : 85) + ((i12 & 64) == 0 ? 0 : 170));
                } else if (i13 == 128) {
                    iArr[i12] = d(255, ((i12 & 1) != 0 ? 43 : 0) + 127 + ((i12 & 16) != 0 ? 85 : 0), ((i12 & 2) != 0 ? 43 : 0) + 127 + ((i12 & 32) != 0 ? 85 : 0), ((i12 & 4) == 0 ? 0 : 43) + 127 + ((i12 & 64) == 0 ? 0 : 85));
                } else if (i13 == 136) {
                    iArr[i12] = d(255, ((i12 & 1) != 0 ? 43 : 0) + ((i12 & 16) != 0 ? 85 : 0), ((i12 & 2) != 0 ? 43 : 0) + ((i12 & 32) != 0 ? 85 : 0), ((i12 & 4) == 0 ? 0 : 43) + ((i12 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int d(int i12, int i13, int i14, int i15) {
        return (i12 << 24) | (i13 << 16) | (i14 << 8) | i15;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0224 A[LOOP:3: B:89:0x0172->B:118:0x0224, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x021f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(byte[] r23, int[] r24, int r25, int r26, int r27, @j.P android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.dvb.b.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static a f(y yVar, int i12) {
        int iG2;
        int i13;
        int iG3;
        int iG4;
        int iG5;
        int i14 = 8;
        int iG6 = yVar.g(8);
        yVar.n(8);
        int i15 = 2;
        int i16 = i12 - 2;
        int i17 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrB = b();
        int[] iArrC = c();
        while (i16 > 0) {
            int iG7 = yVar.g(i14);
            int iG8 = yVar.g(i14);
            int[] iArr2 = (iG8 & 128) != 0 ? iArr : (iG8 & 64) != 0 ? iArrB : iArrC;
            if ((iG8 & 1) != 0) {
                iG4 = yVar.g(i14);
                iG5 = yVar.g(i14);
                iG2 = yVar.g(i14);
                iG3 = yVar.g(i14);
                i13 = i16 - 6;
            } else {
                int iG9 = yVar.g(6) << i15;
                int iG10 = yVar.g(4) << 4;
                iG2 = yVar.g(4) << 4;
                i13 = i16 - 4;
                iG3 = yVar.g(i15) << 6;
                iG4 = iG9;
                iG5 = iG10;
            }
            if (iG4 == 0) {
                iG5 = i17;
                iG2 = iG5;
                iG3 = 255;
            }
            double d12 = iG4;
            double d13 = iG5 - 128;
            double d14 = iG2 - 128;
            iArr2[iG7] = d((byte) (255 - (iG3 & 255)), M.k((int) ((1.402d * d13) + d12), 0, 255), M.k((int) ((d12 - (0.34414d * d14)) - (d13 * 0.71414d)), 0, 255), M.k((int) ((d14 * 1.772d) + d12), 0, 255));
            i16 = i13;
            i17 = 0;
            iG6 = iG6;
            iArrC = iArrC;
            i14 = 8;
            i15 = 2;
        }
        return new a(iG6, iArr, iArrB, iArrC);
    }

    public static c g(y yVar) {
        byte[] bArr;
        int iG2 = yVar.g(16);
        yVar.n(4);
        int iG3 = yVar.g(2);
        boolean zF2 = yVar.f();
        yVar.n(1);
        byte[] bArr2 = M.f47891e;
        if (iG3 != 1) {
            if (iG3 == 0) {
                int iG4 = yVar.g(16);
                int iG5 = yVar.g(16);
                if (iG4 > 0) {
                    bArr2 = new byte[iG4];
                    yVar.i(iG4, bArr2);
                }
                if (iG5 > 0) {
                    bArr = new byte[iG5];
                    yVar.i(iG5, bArr);
                }
            }
            return new c(iG2, zF2, bArr2, bArr);
        }
        yVar.n(yVar.g(8) * 16);
        bArr = bArr2;
        return new c(iG2, zF2, bArr2, bArr);
    }
}
