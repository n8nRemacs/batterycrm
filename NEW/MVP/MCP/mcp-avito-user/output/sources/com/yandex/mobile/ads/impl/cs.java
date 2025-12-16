package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.yandex.mobile.ads.impl.vm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
final class cs {

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f384400h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f384401i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    private static final byte[] f384402j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f384403a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f384404b;

    /* renamed from: c, reason: collision with root package name */
    private final Canvas f384405c;

    /* renamed from: d, reason: collision with root package name */
    private final b f384406d;

    /* renamed from: e, reason: collision with root package name */
    private final a f384407e;

    /* renamed from: f, reason: collision with root package name */
    private final h f384408f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f384409g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f384410a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f384411b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f384412c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f384413d;

        public a(int i12, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f384410a = i12;
            this.f384411b = iArr;
            this.f384412c = iArr2;
            this.f384413d = iArr3;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f384414a;

        /* renamed from: b, reason: collision with root package name */
        public final int f384415b;

        /* renamed from: c, reason: collision with root package name */
        public final int f384416c;

        /* renamed from: d, reason: collision with root package name */
        public final int f384417d;

        /* renamed from: e, reason: collision with root package name */
        public final int f384418e;

        /* renamed from: f, reason: collision with root package name */
        public final int f384419f;

        public b(int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f384414a = i12;
            this.f384415b = i13;
            this.f384416c = i14;
            this.f384417d = i15;
            this.f384418e = i16;
            this.f384419f = i17;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f384420a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f384421b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f384422c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f384423d;

        public c(int i12, boolean z12, byte[] bArr, byte[] bArr2) {
            this.f384420a = i12;
            this.f384421b = z12;
            this.f384422c = bArr;
            this.f384423d = bArr2;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f384424a;

        /* renamed from: b, reason: collision with root package name */
        public final int f384425b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray<e> f384426c;

        public d(int i12, int i13, SparseArray sparseArray) {
            this.f384424a = i12;
            this.f384425b = i13;
            this.f384426c = sparseArray;
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f384427a;

        /* renamed from: b, reason: collision with root package name */
        public final int f384428b;

        public e(int i12, int i13) {
            this.f384427a = i12;
            this.f384428b = i13;
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f384429a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f384430b;

        /* renamed from: c, reason: collision with root package name */
        public final int f384431c;

        /* renamed from: d, reason: collision with root package name */
        public final int f384432d;

        /* renamed from: e, reason: collision with root package name */
        public final int f384433e;

        /* renamed from: f, reason: collision with root package name */
        public final int f384434f;

        /* renamed from: g, reason: collision with root package name */
        public final int f384435g;

        /* renamed from: h, reason: collision with root package name */
        public final int f384436h;

        /* renamed from: i, reason: collision with root package name */
        public final int f384437i;

        /* renamed from: j, reason: collision with root package name */
        public final SparseArray<g> f384438j;

        public f(int i12, boolean z12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, SparseArray sparseArray) {
            this.f384429a = i12;
            this.f384430b = z12;
            this.f384431c = i13;
            this.f384432d = i14;
            this.f384433e = i15;
            this.f384434f = i16;
            this.f384435g = i17;
            this.f384436h = i18;
            this.f384437i = i19;
            this.f384438j = sparseArray;
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f384439a;

        /* renamed from: b, reason: collision with root package name */
        public final int f384440b;

        public g(int i12, int i13) {
            this.f384439a = i12;
            this.f384440b = i13;
        }
    }

    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f384441a;

        /* renamed from: b, reason: collision with root package name */
        public final int f384442b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f384443c = new SparseArray<>();

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<a> f384444d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f384445e = new SparseArray<>();

        /* renamed from: f, reason: collision with root package name */
        public final SparseArray<a> f384446f = new SparseArray<>();

        /* renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f384447g = new SparseArray<>();

        /* renamed from: h, reason: collision with root package name */
        @j.P
        public b f384448h;

        /* renamed from: i, reason: collision with root package name */
        @j.P
        public d f384449i;

        public h(int i12, int i13) {
            this.f384441a = i12;
            this.f384442b = i13;
        }
    }

    public cs(int i12, int i13) {
        Paint paint = new Paint();
        this.f384403a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f384404b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f384405c = new Canvas();
        this.f384406d = new b(719, 575, 0, 719, 0, 575);
        this.f384407e = new a(0, a(), b(), c());
        this.f384408f = new h(i12, i13);
    }

    private static int a(int i12, int i13, int i14, int i15) {
        return (i12 << 24) | (i13 << 16) | (i14 << 8) | i15;
    }

    private static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i12 = 1; i12 < 16; i12++) {
            if (i12 < 8) {
                iArr[i12] = a(255, (i12 & 1) != 0 ? 255 : 0, (i12 & 2) != 0 ? 255 : 0, (i12 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i12] = a(255, (i12 & 1) != 0 ? 127 : 0, (i12 & 2) != 0 ? 127 : 0, (i12 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            if (i12 < 8) {
                iArr[i12] = a(63, (i12 & 1) != 0 ? 255 : 0, (i12 & 2) != 0 ? 255 : 0, (i12 & 4) == 0 ? 0 : 255);
            } else {
                int i13 = i12 & 136;
                if (i13 == 0) {
                    iArr[i12] = a(255, ((i12 & 1) != 0 ? 85 : 0) + ((i12 & 16) != 0 ? 170 : 0), ((i12 & 2) != 0 ? 85 : 0) + ((i12 & 32) != 0 ? 170 : 0), ((i12 & 4) == 0 ? 0 : 85) + ((i12 & 64) == 0 ? 0 : 170));
                } else if (i13 == 8) {
                    iArr[i12] = a(127, ((i12 & 1) != 0 ? 85 : 0) + ((i12 & 16) != 0 ? 170 : 0), ((i12 & 2) != 0 ? 85 : 0) + ((i12 & 32) != 0 ? 170 : 0), ((i12 & 4) == 0 ? 0 : 85) + ((i12 & 64) == 0 ? 0 : 170));
                } else if (i13 == 128) {
                    iArr[i12] = a(255, ((i12 & 1) != 0 ? 43 : 0) + 127 + ((i12 & 16) != 0 ? 85 : 0), ((i12 & 2) != 0 ? 43 : 0) + 127 + ((i12 & 32) != 0 ? 85 : 0), ((i12 & 4) == 0 ? 0 : 43) + 127 + ((i12 & 64) == 0 ? 0 : 85));
                } else if (i13 == 136) {
                    iArr[i12] = a(255, ((i12 & 1) != 0 ? 43 : 0) + ((i12 & 16) != 0 ? 85 : 0), ((i12 & 2) != 0 ? 43 : 0) + ((i12 & 32) != 0 ? 85 : 0), ((i12 & 4) == 0 ? 0 : 43) + ((i12 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public final void d() {
        h hVar = this.f384408f;
        hVar.f384443c.clear();
        hVar.f384444d.clear();
        hVar.f384445e.clear();
        hVar.f384446f.clear();
        hVar.f384447g.clear();
        hVar.f384448h = null;
        hVar.f384449i = null;
    }

    public final List a(int i12, byte[] bArr) {
        boolean z12;
        char c12;
        int i13;
        SparseArray<e> sparseArray;
        int i14;
        SparseArray<g> sparseArray2;
        boolean z13;
        f fVar;
        int iB2;
        int iB3;
        int i15;
        int iB4;
        or0 or0Var = new or0(i12, bArr);
        while (true) {
            z12 = true;
            if (or0Var.b() >= 48 && or0Var.b(8) == 15) {
                h hVar = this.f384408f;
                int iB5 = or0Var.b(8);
                int i16 = 16;
                int iB6 = or0Var.b(16);
                int iB7 = or0Var.b(16);
                int iD2 = or0Var.d() + iB7;
                if (iB7 * 8 > or0Var.b()) {
                    ka0.d("DvbParser", "Data field length exceeds limit");
                    or0Var.d(or0Var.b());
                } else {
                    switch (iB5) {
                        case 16:
                            if (iB6 == hVar.f384441a) {
                                d dVar = hVar.f384449i;
                                or0Var.b(8);
                                int iB8 = or0Var.b(4);
                                int iB9 = or0Var.b(2);
                                or0Var.d(2);
                                int i17 = iB7 - 2;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i17 > 0) {
                                    int iB10 = or0Var.b(8);
                                    or0Var.d(8);
                                    i17 -= 6;
                                    sparseArray3.put(iB10, new e(or0Var.b(16), or0Var.b(16)));
                                }
                                d dVar2 = new d(iB8, iB9, sparseArray3);
                                if (iB9 != 0) {
                                    hVar.f384449i = dVar2;
                                    hVar.f384443c.clear();
                                    hVar.f384444d.clear();
                                    hVar.f384445e.clear();
                                    break;
                                } else if (dVar != null && dVar.f384424a != iB8) {
                                    hVar.f384449i = dVar2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            d dVar3 = hVar.f384449i;
                            if (iB6 == hVar.f384441a && dVar3 != null) {
                                int iB11 = or0Var.b(8);
                                or0Var.d(4);
                                boolean zF2 = or0Var.f();
                                or0Var.d(3);
                                int iB12 = or0Var.b(16);
                                int iB13 = or0Var.b(16);
                                or0Var.b(3);
                                int iB14 = or0Var.b(3);
                                or0Var.d(2);
                                int iB15 = or0Var.b(8);
                                int iB16 = or0Var.b(8);
                                int iB17 = or0Var.b(4);
                                int iB18 = or0Var.b(2);
                                or0Var.d(2);
                                int i18 = iB7 - 10;
                                SparseArray sparseArray4 = new SparseArray();
                                while (i18 > 0) {
                                    int iB19 = or0Var.b(i16);
                                    int iB20 = or0Var.b(2);
                                    or0Var.b(2);
                                    int iB21 = or0Var.b(12);
                                    or0Var.d(4);
                                    int iB22 = or0Var.b(12);
                                    int i19 = i18 - 6;
                                    if (iB20 == 1 || iB20 == 2) {
                                        or0Var.b(8);
                                        or0Var.b(8);
                                        i18 -= 8;
                                    } else {
                                        i18 = i19;
                                    }
                                    sparseArray4.put(iB19, new g(iB21, iB22));
                                    i16 = 16;
                                }
                                f fVar2 = new f(iB11, zF2, iB12, iB13, iB14, iB15, iB16, iB17, iB18, sparseArray4);
                                if (dVar3.f384425b == 0 && (fVar = hVar.f384443c.get(iB11)) != null) {
                                    SparseArray<g> sparseArray5 = fVar.f384438j;
                                    for (int i22 = 0; i22 < sparseArray5.size(); i22++) {
                                        fVar2.f384438j.put(sparseArray5.keyAt(i22), sparseArray5.valueAt(i22));
                                    }
                                }
                                hVar.f384443c.put(fVar2.f384429a, fVar2);
                                break;
                            }
                            break;
                        case 18:
                            if (iB6 == hVar.f384441a) {
                                a aVarA = a(or0Var, iB7);
                                hVar.f384444d.put(aVarA.f384410a, aVarA);
                                break;
                            } else if (iB6 == hVar.f384442b) {
                                a aVarA2 = a(or0Var, iB7);
                                hVar.f384446f.put(aVarA2.f384410a, aVarA2);
                                break;
                            }
                            break;
                        case 19:
                            if (iB6 == hVar.f384441a) {
                                c cVarA = a(or0Var);
                                hVar.f384445e.put(cVarA.f384420a, cVarA);
                                break;
                            } else if (iB6 == hVar.f384442b) {
                                c cVarA2 = a(or0Var);
                                hVar.f384447g.put(cVarA2.f384420a, cVarA2);
                                break;
                            }
                            break;
                        case 20:
                            if (iB6 == hVar.f384441a) {
                                or0Var.d(4);
                                boolean zF3 = or0Var.f();
                                or0Var.d(3);
                                int iB23 = or0Var.b(16);
                                int iB24 = or0Var.b(16);
                                if (zF3) {
                                    int iB25 = or0Var.b(16);
                                    iB2 = or0Var.b(16);
                                    iB4 = or0Var.b(16);
                                    iB3 = or0Var.b(16);
                                    i15 = iB25;
                                } else {
                                    iB2 = iB23;
                                    iB3 = iB24;
                                    i15 = 0;
                                    iB4 = 0;
                                }
                                hVar.f384448h = new b(iB23, iB24, i15, iB2, iB4, iB3);
                                break;
                            }
                            break;
                    }
                    or0Var.e(iD2 - or0Var.d());
                }
            }
        }
        h hVar2 = this.f384408f;
        d dVar4 = hVar2.f384449i;
        if (dVar4 == null) {
            return Collections.emptyList();
        }
        b bVar = hVar2.f384448h;
        if (bVar == null) {
            bVar = this.f384406d;
        }
        Bitmap bitmap = this.f384409g;
        if (bitmap == null || bVar.f384414a + 1 != bitmap.getWidth() || bVar.f384415b + 1 != this.f384409g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar.f384414a + 1, bVar.f384415b + 1, Bitmap.Config.ARGB_8888);
            this.f384409g = bitmapCreateBitmap;
            this.f384405c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray6 = dVar4.f384426c;
        int i23 = 0;
        while (i23 < sparseArray6.size()) {
            this.f384405c.save();
            e eVarValueAt = sparseArray6.valueAt(i23);
            f fVar3 = this.f384408f.f384443c.get(sparseArray6.keyAt(i23));
            int i24 = eVarValueAt.f384427a + bVar.f384416c;
            int i25 = eVarValueAt.f384428b + bVar.f384418e;
            this.f384405c.clipRect(i24, i25, Math.min(fVar3.f384431c + i24, bVar.f384417d), Math.min(fVar3.f384432d + i25, bVar.f384419f));
            a aVar = this.f384408f.f384444d.get(fVar3.f384434f);
            if (aVar == null && (aVar = this.f384408f.f384446f.get(fVar3.f384434f)) == null) {
                aVar = this.f384407e;
            }
            SparseArray<g> sparseArray7 = fVar3.f384438j;
            int i26 = 0;
            while (i26 < sparseArray7.size()) {
                int iKeyAt = sparseArray7.keyAt(i26);
                g gVarValueAt = sparseArray7.valueAt(i26);
                c cVar = this.f384408f.f384445e.get(iKeyAt);
                if (cVar == null) {
                    cVar = this.f384408f.f384447g.get(iKeyAt);
                }
                if (cVar != null) {
                    Paint paint = cVar.f384421b ? null : this.f384403a;
                    int i27 = fVar3.f384433e;
                    int i28 = gVarValueAt.f384439a + i24;
                    int i29 = gVarValueAt.f384440b + i25;
                    sparseArray = sparseArray6;
                    Canvas canvas = this.f384405c;
                    sparseArray2 = sparseArray7;
                    i14 = i23;
                    int[] iArr = i27 == 3 ? aVar.f384413d : i27 == 2 ? aVar.f384412c : aVar.f384411b;
                    Paint paint2 = paint;
                    a(cVar.f384422c, iArr, i27, i28, i29, paint2, canvas);
                    z13 = true;
                    a(cVar.f384423d, iArr, i27, i28, i29 + 1, paint2, canvas);
                } else {
                    sparseArray = sparseArray6;
                    i14 = i23;
                    sparseArray2 = sparseArray7;
                    z13 = true;
                }
                i26++;
                z12 = z13;
                sparseArray6 = sparseArray;
                sparseArray7 = sparseArray2;
                i23 = i14;
            }
            SparseArray<e> sparseArray8 = sparseArray6;
            int i32 = i23;
            boolean z14 = z12;
            if (fVar3.f384430b) {
                int i33 = fVar3.f384433e;
                if (i33 == 3) {
                    i13 = aVar.f384413d[fVar3.f384435g];
                    c12 = 2;
                } else {
                    c12 = 2;
                    i13 = i33 == 2 ? aVar.f384412c[fVar3.f384436h] : aVar.f384411b[fVar3.f384437i];
                }
                this.f384404b.setColor(i13);
                this.f384405c.drawRect(i24, i25, fVar3.f384431c + i24, fVar3.f384432d + i25, this.f384404b);
            } else {
                c12 = 2;
            }
            arrayList.add(new vm.a().a(Bitmap.createBitmap(this.f384409g, i24, i25, fVar3.f384431c, fVar3.f384432d)).b(i24 / bVar.f384414a).b(0).a(0, i25 / bVar.f384415b).a(0).d(fVar3.f384431c / bVar.f384414a).a(fVar3.f384432d / bVar.f384415b).a());
            this.f384405c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f384405c.restore();
            z12 = z14;
            i23 = i32 + 1;
            sparseArray6 = sparseArray8;
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static a a(or0 or0Var, int i12) {
        int iB2;
        int i13;
        int iB3;
        int iB4;
        int iB5;
        int i14 = 8;
        int iB6 = or0Var.b(8);
        or0Var.d(8);
        int i15 = 2;
        int i16 = i12 - 2;
        int[] iArrA = a();
        int[] iArrB = b();
        int[] iArrC = c();
        while (i16 > 0) {
            int iB7 = or0Var.b(i14);
            int iB8 = or0Var.b(i14);
            int[] iArr = (iB8 & 128) != 0 ? iArrA : (iB8 & 64) != 0 ? iArrB : iArrC;
            if ((iB8 & 1) != 0) {
                iB4 = or0Var.b(i14);
                iB5 = or0Var.b(i14);
                iB2 = or0Var.b(i14);
                iB3 = or0Var.b(i14);
                i13 = i16 - 6;
            } else {
                int iB9 = or0Var.b(6) << i15;
                int iB10 = or0Var.b(4) << 4;
                iB2 = or0Var.b(4) << 4;
                i13 = i16 - 4;
                iB3 = or0Var.b(i15) << 6;
                iB4 = iB9;
                iB5 = iB10;
            }
            if (iB4 == 0) {
                iB3 = 255;
                iB5 = 0;
                iB2 = 0;
            }
            double d12 = iB4;
            int i17 = iB6;
            double d13 = iB5 - 128;
            int i18 = (int) ((1.402d * d13) + d12);
            double d14 = iB2 - 128;
            int i19 = (int) ((d12 - (0.34414d * d14)) - (d13 * 0.71414d));
            int i22 = (int) ((d14 * 1.772d) + d12);
            int i23 = pc1.f388768a;
            iArr[iB7] = a((byte) (255 - (iB3 & 255)), Math.max(0, Math.min(i18, 255)), Math.max(0, Math.min(i19, 255)), Math.max(0, Math.min(i22, 255)));
            i16 = i13;
            iB6 = i17;
            i14 = 8;
            i15 = 2;
        }
        return new a(iB6, iArrA, iArrB, iArrC);
    }

    private static c a(or0 or0Var) {
        byte[] bArr;
        int iB2 = or0Var.b(16);
        or0Var.d(4);
        int iB3 = or0Var.b(2);
        boolean zF2 = or0Var.f();
        or0Var.d(1);
        byte[] bArr2 = pc1.f388773f;
        if (iB3 == 1) {
            or0Var.d(or0Var.b(8) * 16);
        } else {
            if (iB3 == 0) {
                int iB4 = or0Var.b(16);
                int iB5 = or0Var.b(16);
                if (iB4 > 0) {
                    bArr2 = new byte[iB4];
                    or0Var.b(bArr2, iB4);
                }
                if (iB5 > 0) {
                    bArr = new byte[iB5];
                    or0Var.b(bArr, iB5);
                }
            }
            return new c(iB2, zF2, bArr2, bArr);
        }
        bArr = bArr2;
        return new c(iB2, zF2, bArr2, bArr);
    }

    private static int[] a() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0213 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0248 A[LOOP:3: B:93:0x0194->B:122:0x0248, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte[] r23, int[] r24, int r25, int r26, int r27, @j.P android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.cs.a(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }
}
