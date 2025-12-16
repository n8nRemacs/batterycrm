package com.google.android.exoplayer2.text.dvb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.exoplayer2.util.E;
import com.google.android.exoplayer2.util.U;
import j.P;

/* compiled from: DvbParser.java */
/* loaded from: classes6.dex */
final class b {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f346849h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f346850i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f346851j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f346852a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f346853b;

    /* renamed from: c, reason: collision with root package name */
    public final Canvas f346854c;

    /* renamed from: d, reason: collision with root package name */
    public final C10602b f346855d;

    /* renamed from: e, reason: collision with root package name */
    public final a f346856e;

    /* renamed from: f, reason: collision with root package name */
    public final h f346857f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f346858g;

    /* compiled from: DvbParser.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f346859a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f346860b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f346861c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f346862d;

        public a(int i12, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f346859a = i12;
            this.f346860b = iArr;
            this.f346861c = iArr2;
            this.f346862d = iArr3;
        }
    }

    /* compiled from: DvbParser.java */
    /* renamed from: com.google.android.exoplayer2.text.dvb.b$b, reason: collision with other inner class name */
    public static final class C10602b {

        /* renamed from: a, reason: collision with root package name */
        public final int f346863a;

        /* renamed from: b, reason: collision with root package name */
        public final int f346864b;

        /* renamed from: c, reason: collision with root package name */
        public final int f346865c;

        /* renamed from: d, reason: collision with root package name */
        public final int f346866d;

        /* renamed from: e, reason: collision with root package name */
        public final int f346867e;

        /* renamed from: f, reason: collision with root package name */
        public final int f346868f;

        public C10602b(int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f346863a = i12;
            this.f346864b = i13;
            this.f346865c = i14;
            this.f346866d = i15;
            this.f346867e = i16;
            this.f346868f = i17;
        }
    }

    /* compiled from: DvbParser.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f346869a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f346870b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f346871c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f346872d;

        public c(int i12, boolean z12, byte[] bArr, byte[] bArr2) {
            this.f346869a = i12;
            this.f346870b = z12;
            this.f346871c = bArr;
            this.f346872d = bArr2;
        }
    }

    /* compiled from: DvbParser.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f346873a;

        /* renamed from: b, reason: collision with root package name */
        public final int f346874b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray<e> f346875c;

        public d(int i12, int i13, SparseArray sparseArray) {
            this.f346873a = i12;
            this.f346874b = i13;
            this.f346875c = sparseArray;
        }
    }

    /* compiled from: DvbParser.java */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f346876a;

        /* renamed from: b, reason: collision with root package name */
        public final int f346877b;

        public e(int i12, int i13) {
            this.f346876a = i12;
            this.f346877b = i13;
        }
    }

    /* compiled from: DvbParser.java */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f346878a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f346879b;

        /* renamed from: c, reason: collision with root package name */
        public final int f346880c;

        /* renamed from: d, reason: collision with root package name */
        public final int f346881d;

        /* renamed from: e, reason: collision with root package name */
        public final int f346882e;

        /* renamed from: f, reason: collision with root package name */
        public final int f346883f;

        /* renamed from: g, reason: collision with root package name */
        public final int f346884g;

        /* renamed from: h, reason: collision with root package name */
        public final int f346885h;

        /* renamed from: i, reason: collision with root package name */
        public final int f346886i;

        /* renamed from: j, reason: collision with root package name */
        public final SparseArray<g> f346887j;

        public f(int i12, boolean z12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, SparseArray sparseArray) {
            this.f346878a = i12;
            this.f346879b = z12;
            this.f346880c = i13;
            this.f346881d = i14;
            this.f346882e = i15;
            this.f346883f = i16;
            this.f346884g = i17;
            this.f346885h = i18;
            this.f346886i = i19;
            this.f346887j = sparseArray;
        }
    }

    /* compiled from: DvbParser.java */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f346888a;

        /* renamed from: b, reason: collision with root package name */
        public final int f346889b;

        public g(int i12, int i13) {
            this.f346888a = i12;
            this.f346889b = i13;
        }
    }

    /* compiled from: DvbParser.java */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f346890a;

        /* renamed from: b, reason: collision with root package name */
        public final int f346891b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f346892c = new SparseArray<>();

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<a> f346893d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f346894e = new SparseArray<>();

        /* renamed from: f, reason: collision with root package name */
        public final SparseArray<a> f346895f = new SparseArray<>();

        /* renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f346896g = new SparseArray<>();

        /* renamed from: h, reason: collision with root package name */
        @P
        public C10602b f346897h;

        /* renamed from: i, reason: collision with root package name */
        @P
        public d f346898i;

        public h(int i12, int i13) {
            this.f346890a = i12;
            this.f346891b = i13;
        }
    }

    public b(int i12, int i13) {
        Paint paint = new Paint();
        this.f346852a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f346853b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f346854c = new Canvas();
        this.f346855d = new C10602b(719, 575, 0, 719, 0, 575);
        this.f346856e = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f346857f = new h(i12, i13);
    }

    public static byte[] a(int i12, int i13, E e12) {
        byte[] bArr = new byte[i12];
        for (int i14 = 0; i14 < i12; i14++) {
            bArr[i14] = (byte) e12.g(i13);
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.dvb.b.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static a f(E e12, int i12) {
        int iG2;
        int i13;
        int iG3;
        int iG4;
        int iG5;
        int i14 = 8;
        int iG6 = e12.g(8);
        e12.m(8);
        int i15 = 2;
        int i16 = i12 - 2;
        int i17 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrB = b();
        int[] iArrC = c();
        while (i16 > 0) {
            int iG7 = e12.g(i14);
            int iG8 = e12.g(i14);
            int[] iArr2 = (iG8 & 128) != 0 ? iArr : (iG8 & 64) != 0 ? iArrB : iArrC;
            if ((iG8 & 1) != 0) {
                iG4 = e12.g(i14);
                iG5 = e12.g(i14);
                iG2 = e12.g(i14);
                iG3 = e12.g(i14);
                i13 = i16 - 6;
            } else {
                int iG9 = e12.g(6) << i15;
                int iG10 = e12.g(4) << 4;
                iG2 = e12.g(4) << 4;
                i13 = i16 - 4;
                iG3 = e12.g(i15) << 6;
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
            iArr2[iG7] = d((byte) (255 - (iG3 & 255)), U.k((int) ((1.402d * d13) + d12), 0, 255), U.k((int) ((d12 - (0.34414d * d14)) - (d13 * 0.71414d)), 0, 255), U.k((int) ((d14 * 1.772d) + d12), 0, 255));
            i16 = i13;
            i17 = 0;
            iG6 = iG6;
            iArrC = iArrC;
            i14 = 8;
            i15 = 2;
        }
        return new a(iG6, iArr, iArrB, iArrC);
    }

    public static c g(E e12) {
        byte[] bArr;
        int iG2 = e12.g(16);
        e12.m(4);
        int iG3 = e12.g(2);
        boolean zF2 = e12.f();
        e12.m(1);
        byte[] bArr2 = U.f348110e;
        if (iG3 != 1) {
            if (iG3 == 0) {
                int iG4 = e12.g(16);
                int iG5 = e12.g(16);
                if (iG4 > 0) {
                    bArr2 = new byte[iG4];
                    e12.i(iG4, bArr2);
                }
                if (iG5 > 0) {
                    bArr = new byte[iG5];
                    e12.i(iG5, bArr);
                }
            }
            return new c(iG2, zF2, bArr2, bArr);
        }
        e12.m(e12.g(8) * 16);
        bArr = bArr2;
        return new c(iG2, zF2, bArr2, bArr);
    }
}
