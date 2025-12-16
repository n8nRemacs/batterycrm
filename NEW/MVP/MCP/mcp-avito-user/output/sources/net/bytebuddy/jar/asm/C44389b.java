package net.bytebuddy.jar.asm;

import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import net.bytebuddy.jar.asm.A;

/* compiled from: AnnotationWriter.java */
/* renamed from: net.bytebuddy.jar.asm.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C44389b extends AbstractC44388a {

    /* renamed from: c, reason: collision with root package name */
    public final A f418153c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f418154d;

    /* renamed from: e, reason: collision with root package name */
    public final C44391d f418155e;

    /* renamed from: f, reason: collision with root package name */
    public final int f418156f;

    /* renamed from: g, reason: collision with root package name */
    public int f418157g;

    /* renamed from: h, reason: collision with root package name */
    public final C44389b f418158h;

    /* renamed from: i, reason: collision with root package name */
    public final C44389b f418159i;

    public C44389b(A a12, boolean z12, C44391d c44391d, C44389b c44389b) {
        super(589824, null);
        this.f418153c = a12;
        this.f418154d = z12;
        this.f418155e = c44391d;
        int i12 = c44391d.f418166b;
        this.f418156f = i12 == 0 ? -1 : i12 - 2;
        this.f418158h = c44389b;
        if (c44389b != null) {
            c44389b.f418159i = this;
        }
    }

    public static int g(C44389b c44389b, C44389b c44389b2, C44389b c44389b3, C44389b c44389b4) {
        int iF2 = c44389b != null ? c44389b.f("RuntimeVisibleAnnotations") : 0;
        if (c44389b2 != null) {
            iF2 += c44389b2.f("RuntimeInvisibleAnnotations");
        }
        if (c44389b3 != null) {
            iF2 += c44389b3.f("RuntimeVisibleTypeAnnotations");
        }
        return c44389b4 != null ? iF2 + c44389b4.f("RuntimeInvisibleTypeAnnotations") : iF2;
    }

    public static int h(String str, C44389b[] c44389bArr, int i12) {
        int iF2 = (i12 * 2) + 7;
        for (int i13 = 0; i13 < i12; i13++) {
            iF2 += c44389bArr[i13] == null ? 0 : r3.f(str) - 8;
        }
        return iF2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static net.bytebuddy.jar.asm.C44389b i(net.bytebuddy.jar.asm.A r4, int r5, net.bytebuddy.jar.asm.C r6, java.lang.String r7, net.bytebuddy.jar.asm.C44389b r8) {
        /*
            net.bytebuddy.jar.asm.d r0 = new net.bytebuddy.jar.asm.d
            r0.<init>()
            int r1 = r5 >>> 24
            r2 = 1
            if (r1 == 0) goto L2a
            if (r1 == r2) goto L2a
            switch(r1) {
                case 16: goto L20;
                case 17: goto L20;
                case 18: goto L20;
                case 19: goto L1c;
                case 20: goto L1c;
                case 21: goto L1c;
                case 22: goto L2a;
                case 23: goto L20;
                default: goto Lf;
            }
        Lf:
            switch(r1) {
                case 66: goto L20;
                case 67: goto L20;
                case 68: goto L20;
                case 69: goto L20;
                case 70: goto L20;
                case 71: goto L18;
                case 72: goto L18;
                case 73: goto L18;
                case 74: goto L18;
                case 75: goto L18;
                default: goto L12;
            }
        L12:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        L18:
            r0.i(r5)
            goto L2f
        L1c:
            r0.g(r1)
            goto L2f
        L20:
            r3 = 16776960(0xffff00, float:2.3509528E-38)
            r5 = r5 & r3
            int r5 = r5 >> 8
            r0.e(r1, r5)
            goto L2f
        L2a:
            int r5 = r5 >>> 16
            r0.j(r5)
        L2f:
            r5 = 0
            if (r6 != 0) goto L36
            r0.g(r5)
            goto L42
        L36:
            byte[] r1 = r6.f418148a
            int r6 = r6.f418149b
            r3 = r1[r6]
            int r3 = r3 * 2
            int r3 = r3 + r2
            r0.h(r6, r3, r1)
        L42:
            int r6 = r4.j(r7)
            r0.j(r6)
            r0.j(r5)
            net.bytebuddy.jar.asm.b r5 = new net.bytebuddy.jar.asm.b
            r5.<init>(r4, r2, r0, r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.jar.asm.C44389b.i(net.bytebuddy.jar.asm.A, int, net.bytebuddy.jar.asm.C, java.lang.String, net.bytebuddy.jar.asm.b):net.bytebuddy.jar.asm.b");
    }

    public static C44389b j(A a12, String str, C44389b c44389b) {
        C44391d c44391d = new C44391d();
        c44391d.j(a12.j(str));
        c44391d.j(0);
        return new C44389b(a12, true, c44391d, c44389b);
    }

    public static void l(A a12, C44389b c44389b, C44389b c44389b2, C44389b c44389b3, C44389b c44389b4, C44391d c44391d) {
        if (c44389b != null) {
            c44389b.k(a12.j("RuntimeVisibleAnnotations"), c44391d);
        }
        if (c44389b2 != null) {
            c44389b2.k(a12.j("RuntimeInvisibleAnnotations"), c44391d);
        }
        if (c44389b3 != null) {
            c44389b3.k(a12.j("RuntimeVisibleTypeAnnotations"), c44391d);
        }
        if (c44389b4 != null) {
            c44389b4.k(a12.j("RuntimeInvisibleTypeAnnotations"), c44391d);
        }
    }

    public static void m(int i12, C44389b[] c44389bArr, int i13, C44391d c44391d) {
        int iF2 = (i13 * 2) + 1;
        for (int i14 = 0; i14 < i13; i14++) {
            iF2 += c44389bArr[i14] == null ? 0 : r4.f(null) - 8;
        }
        c44391d.j(i12);
        c44391d.i(iF2);
        c44391d.g(i13);
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = 0;
            C44389b c44389b = null;
            for (C44389b c44389b2 = c44389bArr[i15]; c44389b2 != null; c44389b2 = c44389b2.f418158h) {
                c44389b2.d();
                i16++;
                c44389b = c44389b2;
            }
            c44391d.j(i16);
            while (c44389b != null) {
                C44391d c44391d2 = c44389b.f418155e;
                c44391d.h(0, c44391d2.f418166b, c44391d2.f418165a);
                c44389b = c44389b.f418159i;
            }
        }
    }

    @Override // net.bytebuddy.jar.asm.AbstractC44388a
    public final void a(Object obj, String str) {
        this.f418157g++;
        boolean z12 = this.f418154d;
        A a12 = this.f418153c;
        C44391d c44391d = this.f418155e;
        if (z12) {
            c44391d.j(a12.j(str));
        }
        if (obj instanceof String) {
            c44391d.e(115, a12.j((String) obj));
            return;
        }
        if (obj instanceof Byte) {
            c44391d.e(66, a12.e(3, ((Byte) obj).byteValue()).f418364a);
            return;
        }
        if (obj instanceof Boolean) {
            c44391d.e(90, a12.e(3, ((Boolean) obj).booleanValue() ? 1 : 0).f418364a);
            return;
        }
        if (obj instanceof Character) {
            c44391d.e(67, a12.e(3, ((Character) obj).charValue()).f418364a);
            return;
        }
        if (obj instanceof Short) {
            c44391d.e(83, a12.e(3, ((Short) obj).shortValue()).f418364a);
            return;
        }
        if (obj instanceof B) {
            c44391d.e(99, a12.j(((B) obj).h()));
            return;
        }
        int i12 = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            c44391d.e(91, bArr.length);
            int length = bArr.length;
            while (i12 < length) {
                c44391d.e(66, a12.e(3, bArr[i12]).f418364a);
                i12++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            c44391d.e(91, zArr.length);
            int length2 = zArr.length;
            while (i12 < length2) {
                c44391d.e(90, a12.e(3, zArr[i12] ? 1 : 0).f418364a);
                i12++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            c44391d.e(91, sArr.length);
            int length3 = sArr.length;
            while (i12 < length3) {
                c44391d.e(83, a12.e(3, sArr[i12]).f418364a);
                i12++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            c44391d.e(91, cArr.length);
            int length4 = cArr.length;
            while (i12 < length4) {
                c44391d.e(67, a12.e(3, cArr[i12]).f418364a);
                i12++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            c44391d.e(91, iArr.length);
            int length5 = iArr.length;
            while (i12 < length5) {
                c44391d.e(73, a12.e(3, iArr[i12]).f418364a);
                i12++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            c44391d.e(91, jArr.length);
            int length6 = jArr.length;
            while (i12 < length6) {
                c44391d.e(74, a12.f(5, jArr[i12]).f418364a);
                i12++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            c44391d.e(91, fArr.length);
            int length7 = fArr.length;
            while (i12 < length7) {
                float f12 = fArr[i12];
                a12.getClass();
                c44391d.e(70, a12.e(4, Float.floatToRawIntBits(f12)).f418364a);
                i12++;
            }
            return;
        }
        if (!(obj instanceof double[])) {
            A.a aVarC = a12.c(obj);
            c44391d.e(".s.IFJDCS".charAt(aVarC.f418365b), aVarC.f418364a);
            return;
        }
        double[] dArr = (double[]) obj;
        c44391d.e(91, dArr.length);
        int length8 = dArr.length;
        while (i12 < length8) {
            double d12 = dArr[i12];
            a12.getClass();
            c44391d.e(68, a12.f(6, Double.doubleToRawLongBits(d12)).f418364a);
            i12++;
        }
    }

    @Override // net.bytebuddy.jar.asm.AbstractC44388a
    public final AbstractC44388a b(String str, String str2) {
        this.f418157g++;
        boolean z12 = this.f418154d;
        A a12 = this.f418153c;
        C44391d c44391d = this.f418155e;
        if (z12) {
            c44391d.j(a12.j(str));
        }
        c44391d.e(64, a12.j(str2));
        c44391d.j(0);
        return new C44389b(a12, true, c44391d, null);
    }

    @Override // net.bytebuddy.jar.asm.AbstractC44388a
    public final AbstractC44388a c(String str) {
        this.f418157g++;
        boolean z12 = this.f418154d;
        A a12 = this.f418153c;
        C44391d c44391d = this.f418155e;
        if (z12) {
            c44391d.j(a12.j(str));
        }
        c44391d.e(91, 0);
        return new C44389b(a12, false, c44391d, null);
    }

    @Override // net.bytebuddy.jar.asm.AbstractC44388a
    public final void d() {
        int i12 = this.f418156f;
        if (i12 != -1) {
            byte[] bArr = this.f418155e.f418165a;
            int i13 = this.f418157g;
            bArr[i12] = (byte) (i13 >>> 8);
            bArr[i12 + 1] = (byte) i13;
        }
    }

    @Override // net.bytebuddy.jar.asm.AbstractC44388a
    public final void e(String str, String str2, String str3) {
        this.f418157g++;
        boolean z12 = this.f418154d;
        C44391d c44391d = this.f418155e;
        A a12 = this.f418153c;
        if (z12) {
            c44391d.j(a12.j(str));
        }
        c44391d.e(UpdateStatusCode.DialogButton.CONFIRM, a12.j(str2));
        c44391d.j(a12.j(str3));
    }

    public final int f(String str) {
        if (str != null) {
            this.f418153c.j(str);
        }
        int i12 = 8;
        for (C44389b c44389b = this; c44389b != null; c44389b = c44389b.f418158h) {
            i12 += c44389b.f418155e.f418166b;
        }
        return i12;
    }

    public final void k(int i12, C44391d c44391d) {
        int i13 = 2;
        int i14 = 0;
        C44389b c44389b = null;
        for (C44389b c44389b2 = this; c44389b2 != null; c44389b2 = c44389b2.f418158h) {
            c44389b2.d();
            i13 += c44389b2.f418155e.f418166b;
            i14++;
            c44389b = c44389b2;
        }
        c44391d.j(i12);
        c44391d.i(i13);
        c44391d.j(i14);
        while (c44389b != null) {
            C44391d c44391d2 = c44389b.f418155e;
            c44391d.h(0, c44391d2.f418166b, c44391d2.f418165a);
            c44389b = c44389b.f418159i;
        }
    }
}
