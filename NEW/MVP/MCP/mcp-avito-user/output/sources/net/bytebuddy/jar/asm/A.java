package net.bytebuddy.jar.asm;

import okhttp3.internal.http2.Settings;

/* compiled from: SymbolTable.java */
/* loaded from: classes7.dex */
final class A {

    /* renamed from: a, reason: collision with root package name */
    public final g f418121a;

    /* renamed from: b, reason: collision with root package name */
    public final e f418122b;

    /* renamed from: c, reason: collision with root package name */
    public int f418123c;

    /* renamed from: d, reason: collision with root package name */
    public String f418124d;

    /* renamed from: e, reason: collision with root package name */
    public int f418125e;

    /* renamed from: f, reason: collision with root package name */
    public a[] f418126f;

    /* renamed from: g, reason: collision with root package name */
    public int f418127g;

    /* renamed from: h, reason: collision with root package name */
    public final C44391d f418128h;

    /* renamed from: i, reason: collision with root package name */
    public int f418129i;

    /* renamed from: j, reason: collision with root package name */
    public C44391d f418130j;

    /* renamed from: k, reason: collision with root package name */
    public int f418131k;

    /* renamed from: l, reason: collision with root package name */
    public a[] f418132l;

    public A(g gVar) {
        this.f418121a = gVar;
        this.f418122b = null;
        this.f418126f = new a[256];
        this.f418127g = 1;
        this.f418128h = new C44391d();
    }

    public final void a(a aVar) {
        this.f418125e++;
        a[] aVarArr = this.f418126f;
        int length = aVar.f418133h % aVarArr.length;
        aVar.f418134i = aVarArr[length];
        aVarArr[length] = aVar;
    }

    public final a b(p pVar, Object... objArr) {
        C44391d c44391d = this.f418130j;
        if (c44391d == null) {
            c44391d = new C44391d();
            this.f418130j = c44391d;
        }
        int length = objArr.length;
        int[] iArr = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = c(objArr[i12]).f418364a;
        }
        int i13 = c44391d.f418166b;
        c44391d.j(h(pVar.f418257b, pVar.f418258c, pVar.f418259d, pVar.f418256a, pVar.f418260e).f418364a);
        c44391d.j(length);
        for (int i14 = 0; i14 < length; i14++) {
            c44391d.j(iArr[i14]);
        }
        int i15 = c44391d.f418166b - i13;
        int iHashCode = pVar.hashCode();
        for (Object obj : objArr) {
            iHashCode ^= obj.hashCode();
        }
        int i16 = iHashCode & Integer.MAX_VALUE;
        byte[] bArr = this.f418130j.f418165a;
        for (a aVarO = o(i16); aVarO != null; aVarO = aVarO.f418134i) {
            if (aVarO.f418365b == 64 && aVarO.f418133h == i16) {
                int i17 = (int) aVarO.f418369f;
                for (int i18 = 0; i18 < i15; i18++) {
                    if (bArr[i13 + i18] != bArr[i17 + i18]) {
                        break;
                    }
                }
                this.f418130j.f418166b = i13;
                return aVarO;
            }
        }
        int i19 = this.f418129i;
        this.f418129i = i19 + 1;
        a aVar = new a(i19, 64, i13, i16);
        p(aVar);
        return aVar;
    }

    public final a c(Object obj) {
        if (obj instanceof Integer) {
            return e(3, ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return e(3, ((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return e(3, ((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return e(3, ((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return e(3, ((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return e(4, Float.floatToRawIntBits(((Float) obj).floatValue()));
        }
        if (obj instanceof Long) {
            return f(5, ((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return f(6, Double.doubleToRawLongBits(((Double) obj).doubleValue()));
        }
        if (obj instanceof String) {
            return k(8, (String) obj);
        }
        if (obj instanceof B) {
            B b12 = (B) obj;
            int iT2 = b12.t();
            return iT2 == 10 ? k(7, b12.k()) : iT2 == 11 ? k(16, b12.h()) : k(7, b12.h());
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return h(pVar.f418257b, pVar.f418258c, pVar.f418259d, pVar.f418256a, pVar.f418260e);
        }
        if (!(obj instanceof h)) {
            throw new IllegalArgumentException(androidx.camera.view.k.a(obj, "value "));
        }
        h hVar = (h) obj;
        return d(17, b(hVar.f418210c, hVar.f418211d).f418364a, hVar.f418208a, hVar.f418209b);
    }

    public final a d(int i12, int i13, String str, String str2) {
        int iHashCode = (((i13 + 1) * str2.hashCode() * str.hashCode()) + i12) & Integer.MAX_VALUE;
        for (a aVarO = o(iHashCode); aVarO != null; aVarO = aVarO.f418134i) {
            if (aVarO.f418365b == i12 && aVarO.f418133h == iHashCode && aVarO.f418369f == i13 && aVarO.f418367d.equals(str) && aVarO.f418368e.equals(str2)) {
                return aVarO;
            }
        }
        this.f418128h.f(i12, i13, i(str, str2));
        int i14 = this.f418127g;
        this.f418127g = i14 + 1;
        a aVar = new a(i14, i12, null, str, str2, i13, iHashCode);
        p(aVar);
        return aVar;
    }

    public final a e(int i12, int i13) {
        int i14 = (i12 + i13) & Integer.MAX_VALUE;
        for (a aVarO = o(i14); aVarO != null; aVarO = aVarO.f418134i) {
            if (aVarO.f418365b == i12 && aVarO.f418133h == i14 && aVarO.f418369f == i13) {
                return aVarO;
            }
        }
        C44391d c44391d = this.f418128h;
        c44391d.g(i12);
        c44391d.i(i13);
        int i15 = this.f418127g;
        this.f418127g = i15 + 1;
        a aVar = new a(i15, i12, i13, i14);
        p(aVar);
        return aVar;
    }

    public final a f(int i12, long j12) {
        int i13 = (int) j12;
        int i14 = (int) (j12 >>> 32);
        int i15 = (i12 + i13 + i14) & Integer.MAX_VALUE;
        for (a aVarO = o(i15); aVarO != null; aVarO = aVarO.f418134i) {
            if (aVarO.f418365b == i12 && aVarO.f418133h == i15 && aVarO.f418369f == j12) {
                return aVarO;
            }
        }
        int i16 = this.f418127g;
        C44391d c44391d = this.f418128h;
        c44391d.g(i12);
        int i17 = c44391d.f418166b;
        int i18 = i17 + 8;
        if (i18 > c44391d.f418165a.length) {
            c44391d.b(8);
        }
        byte[] bArr = c44391d.f418165a;
        bArr[i17] = (byte) (i14 >>> 24);
        bArr[i17 + 1] = (byte) (i14 >>> 16);
        bArr[i17 + 2] = (byte) (i14 >>> 8);
        bArr[i17 + 3] = (byte) i14;
        bArr[i17 + 4] = (byte) (i13 >>> 24);
        bArr[i17 + 5] = (byte) (i13 >>> 16);
        bArr[i17 + 6] = (byte) (i13 >>> 8);
        bArr[i17 + 7] = (byte) i13;
        c44391d.f418166b = i18;
        this.f418127g += 2;
        a aVar = new a(i16, i12, j12, i15);
        p(aVar);
        return aVar;
    }

    public final a g(int i12, String str, String str2, String str3) {
        int iHashCode = ((str3.hashCode() * str2.hashCode() * str.hashCode()) + i12) & Integer.MAX_VALUE;
        for (a aVarO = o(iHashCode); aVarO != null; aVarO = aVarO.f418134i) {
            if (aVarO.f418365b == i12 && aVarO.f418133h == iHashCode && aVarO.f418366c.equals(str) && aVarO.f418367d.equals(str2) && aVarO.f418368e.equals(str3)) {
                return aVarO;
            }
        }
        a aVarK = k(7, str);
        this.f418128h.f(i12, aVarK.f418364a, i(str2, str3));
        int i13 = this.f418127g;
        this.f418127g = i13 + 1;
        a aVar = new a(i13, i12, str, str2, str3, 0L, iHashCode);
        p(aVar);
        return aVar;
    }

    public final a h(String str, String str2, String str3, int i12, boolean z12) {
        int iHashCode = ((str3.hashCode() * str2.hashCode() * str.hashCode() * i12) + 15) & Integer.MAX_VALUE;
        for (a aVarO = o(iHashCode); aVarO != null; aVarO = aVarO.f418134i) {
            if (aVarO.f418365b == 15 && aVarO.f418133h == iHashCode && aVarO.f418369f == i12 && aVarO.f418366c.equals(str) && aVarO.f418367d.equals(str2) && aVarO.f418368e.equals(str3)) {
                return aVarO;
            }
        }
        C44391d c44391d = this.f418128h;
        if (i12 <= 4) {
            c44391d.d(i12, g(9, str, str2, str3).f418364a);
        } else {
            c44391d.d(i12, g(z12 ? 11 : 10, str, str2, str3).f418364a);
        }
        int i13 = this.f418127g;
        this.f418127g = i13 + 1;
        a aVar = new a(i13, 15, str, str2, str3, i12, iHashCode);
        p(aVar);
        return aVar;
    }

    public final int i(String str, String str2) {
        int iHashCode = ((str2.hashCode() * str.hashCode()) + 12) & Integer.MAX_VALUE;
        for (a aVarO = o(iHashCode); aVarO != null; aVarO = aVarO.f418134i) {
            if (aVarO.f418365b == 12 && aVarO.f418133h == iHashCode && aVarO.f418367d.equals(str) && aVarO.f418368e.equals(str2)) {
                return aVarO.f418364a;
            }
        }
        this.f418128h.f(12, j(str), j(str2));
        int i12 = this.f418127g;
        this.f418127g = i12 + 1;
        p(new a(i12, iHashCode, str, str2));
        return i12;
    }

    public final int j(String str) {
        int iHashCode = (str.hashCode() + 1) & Integer.MAX_VALUE;
        for (a aVarO = o(iHashCode); aVarO != null; aVarO = aVarO.f418134i) {
            if (aVarO.f418365b == 1 && aVarO.f418133h == iHashCode && aVarO.f418368e.equals(str)) {
                return aVarO.f418364a;
            }
        }
        C44391d c44391d = this.f418128h;
        c44391d.g(1);
        int length = str.length();
        if (length > 65535) {
            throw new IllegalArgumentException("UTF8 string too large");
        }
        int i12 = c44391d.f418166b;
        int i13 = i12 + 2;
        if (i13 + length > c44391d.f418165a.length) {
            c44391d.b(length + 2);
        }
        byte[] bArr = c44391d.f418165a;
        bArr[i12] = (byte) (length >>> 8);
        bArr[i12 + 1] = (byte) length;
        int i14 = 0;
        while (i14 < length) {
            char cCharAt = str.charAt(i14);
            if (cCharAt < 1 || cCharAt > 127) {
                c44391d.f418166b = i13;
                c44391d.a(i14, Settings.DEFAULT_INITIAL_WINDOW_SIZE, str);
                break;
            }
            bArr[i13] = (byte) cCharAt;
            i14++;
            i13++;
        }
        c44391d.f418166b = i13;
        int i15 = this.f418127g;
        this.f418127g = i15 + 1;
        p(new a(i15, 1, str, iHashCode));
        return i15;
    }

    public final a k(int i12, String str) {
        int iHashCode = (str.hashCode() + i12) & Integer.MAX_VALUE;
        for (a aVarO = o(iHashCode); aVarO != null; aVarO = aVarO.f418134i) {
            if (aVarO.f418365b == i12 && aVarO.f418133h == iHashCode && aVarO.f418368e.equals(str)) {
                return aVarO;
            }
        }
        this.f418128h.e(i12, j(str));
        int i13 = this.f418127g;
        this.f418127g = i13 + 1;
        a aVar = new a(i13, i12, str, iHashCode);
        p(aVar);
        return aVar;
    }

    public final int l(String str) {
        int iHashCode = (str.hashCode() + 128) & Integer.MAX_VALUE;
        for (a aVarO = o(iHashCode); aVarO != null; aVarO = aVarO.f418134i) {
            if (aVarO.f418365b == 128 && aVarO.f418133h == iHashCode && aVarO.f418368e.equals(str)) {
                return aVarO.f418364a;
            }
        }
        return m(new a(this.f418131k, 128, str, iHashCode));
    }

    public final int m(a aVar) {
        if (this.f418132l == null) {
            this.f418132l = new a[16];
        }
        int i12 = this.f418131k;
        a[] aVarArr = this.f418132l;
        if (i12 == aVarArr.length) {
            a[] aVarArr2 = new a[aVarArr.length * 2];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, aVarArr.length);
            this.f418132l = aVarArr2;
        }
        a[] aVarArr3 = this.f418132l;
        int i13 = this.f418131k;
        this.f418131k = i13 + 1;
        aVarArr3[i13] = aVar;
        p(aVar);
        return aVar.f418364a;
    }

    public final int n(int i12, String str) {
        int iHashCode = (str.hashCode() + 129 + i12) & Integer.MAX_VALUE;
        for (a aVarO = o(iHashCode); aVarO != null; aVarO = aVarO.f418134i) {
            if (aVarO.f418365b == 129 && aVarO.f418133h == iHashCode && aVarO.f418369f == i12 && aVarO.f418368e.equals(str)) {
                return aVarO.f418364a;
            }
        }
        return m(new a(i12, str, this.f418131k, iHashCode));
    }

    public final a o(int i12) {
        a[] aVarArr = this.f418126f;
        return aVarArr[i12 % aVarArr.length];
    }

    public final void p(a aVar) {
        int i12 = this.f418125e;
        a[] aVarArr = this.f418126f;
        if (i12 > (aVarArr.length * 3) / 4) {
            int length = aVarArr.length;
            int i13 = (length * 2) + 1;
            a[] aVarArr2 = new a[i13];
            for (int i14 = length - 1; i14 >= 0; i14--) {
                a aVar2 = this.f418126f[i14];
                while (aVar2 != null) {
                    int i15 = aVar2.f418133h % i13;
                    a aVar3 = aVar2.f418134i;
                    aVar2.f418134i = aVarArr2[i15];
                    aVarArr2[i15] = aVar2;
                    aVar2 = aVar3;
                }
            }
            this.f418126f = aVarArr2;
        }
        this.f418125e++;
        a[] aVarArr3 = this.f418126f;
        int length2 = aVar.f418133h % aVarArr3.length;
        aVar.f418134i = aVarArr3[length2];
        aVarArr3[length2] = aVar;
    }

    /* compiled from: SymbolTable.java */
    public static class a extends z {

        /* renamed from: h, reason: collision with root package name */
        public final int f418133h;

        /* renamed from: i, reason: collision with root package name */
        public a f418134i;

        public a(int i12, int i13, String str, String str2, String str3, long j12, int i14) {
            super(i12, i13, j12, str, str2, str3);
            this.f418133h = i14;
        }

        public a(int i12, int i13, String str, int i14) {
            super(i12, i13, 0L, null, null, str);
            this.f418133h = i14;
        }

        public a(long j12, String str, int i12, int i13) {
            super(i12, 129, j12, null, null, str);
            this.f418133h = i13;
        }

        public a(int i12, int i13, String str, String str2) {
            super(i12, 12, 0L, null, str, str2);
            this.f418133h = i13;
        }

        public a(int i12, int i13, long j12, int i14) {
            super(i12, i13, j12, null, null, null);
            this.f418133h = i14;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public A(net.bytebuddy.jar.asm.g r23, net.bytebuddy.jar.asm.e r24) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.jar.asm.A.<init>(net.bytebuddy.jar.asm.g, net.bytebuddy.jar.asm.e):void");
    }
}
