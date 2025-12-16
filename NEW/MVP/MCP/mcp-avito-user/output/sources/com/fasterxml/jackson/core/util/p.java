package com.fasterxml.jackson.core.util;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: TextBuffer.java */
/* loaded from: classes3.dex */
public final class p {

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f341312l = new char[0];

    /* renamed from: a, reason: collision with root package name */
    public final a f341313a;

    /* renamed from: b, reason: collision with root package name */
    public char[] f341314b;

    /* renamed from: c, reason: collision with root package name */
    public int f341315c;

    /* renamed from: d, reason: collision with root package name */
    public int f341316d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<char[]> f341317e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f341318f;

    /* renamed from: g, reason: collision with root package name */
    public int f341319g;

    /* renamed from: h, reason: collision with root package name */
    public char[] f341320h;

    /* renamed from: i, reason: collision with root package name */
    public int f341321i;

    /* renamed from: j, reason: collision with root package name */
    public String f341322j;

    /* renamed from: k, reason: collision with root package name */
    public char[] f341323k;

    public p(a aVar) {
        this.f341313a = aVar;
    }

    public final void a(int i12, int i13, String str) {
        if (this.f341315c >= 0) {
            r(i13);
        }
        this.f341322j = null;
        this.f341323k = null;
        char[] cArr = this.f341320h;
        int length = cArr.length;
        int i14 = this.f341321i;
        int i15 = length - i14;
        if (i15 >= i13) {
            str.getChars(i12, i12 + i13, cArr, i14);
            this.f341321i += i13;
            return;
        }
        if (i15 > 0) {
            int i16 = i12 + i15;
            str.getChars(i12, i16, cArr, i14);
            i13 -= i15;
            i12 = i16;
        }
        while (true) {
            i();
            int iMin = Math.min(this.f341320h.length, i13);
            int i17 = i12 + iMin;
            str.getChars(i12, i17, this.f341320h, 0);
            this.f341321i += iMin;
            i13 -= iMin;
            if (i13 <= 0) {
                return;
            } else {
                i12 = i17;
            }
        }
    }

    public final void b(char[] cArr, int i12, int i13) {
        if (this.f341315c >= 0) {
            r(i13);
        }
        this.f341322j = null;
        this.f341323k = null;
        char[] cArr2 = this.f341320h;
        int length = cArr2.length;
        int i14 = this.f341321i;
        int i15 = length - i14;
        if (i15 >= i13) {
            System.arraycopy(cArr, i12, cArr2, i14, i13);
            this.f341321i += i13;
            return;
        }
        if (i15 > 0) {
            System.arraycopy(cArr, i12, cArr2, i14, i15);
            i12 += i15;
            i13 -= i15;
        }
        do {
            i();
            int iMin = Math.min(this.f341320h.length, i13);
            System.arraycopy(cArr, i12, this.f341320h, 0, iMin);
            this.f341321i += iMin;
            i12 += iMin;
            i13 -= iMin;
        } while (i13 > 0);
    }

    public final char[] c(int i12) {
        a aVar = this.f341313a;
        return aVar != null ? aVar.b(2, i12) : new char[Math.max(i12, 500)];
    }

    public final void d() {
        this.f341318f = false;
        this.f341317e.clear();
        this.f341319g = 0;
        this.f341321i = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final char[] e() {
        /*
            r7 = this;
            char[] r0 = r7.f341323k
            if (r0 != 0) goto L5b
            java.lang.String r0 = r7.f341322j
            if (r0 == 0) goto Ld
            char[] r0 = r0.toCharArray()
            goto L59
        Ld:
            int r0 = r7.f341315c
            char[] r1 = com.fasterxml.jackson.core.util.p.f341312l
            r2 = 1
            if (r0 < 0) goto L2b
            int r3 = r7.f341316d
            if (r3 >= r2) goto L1a
        L18:
            r0 = r1
            goto L59
        L1a:
            if (r0 != 0) goto L23
            char[] r0 = r7.f341314b
            char[] r0 = java.util.Arrays.copyOf(r0, r3)
            goto L59
        L23:
            char[] r1 = r7.f341314b
            int r3 = r3 + r0
            char[] r0 = java.util.Arrays.copyOfRange(r1, r0, r3)
            goto L59
        L2b:
            int r0 = r7.q()
            if (r0 >= r2) goto L32
            goto L18
        L32:
            char[] r0 = new char[r0]
            java.util.ArrayList<char[]> r1 = r7.f341317e
            r2 = 0
            if (r1 == 0) goto L51
            int r1 = r1.size()
            r3 = r2
            r4 = r3
        L3f:
            if (r3 >= r1) goto L52
            java.util.ArrayList<char[]> r5 = r7.f341317e
            java.lang.Object r5 = r5.get(r3)
            char[] r5 = (char[]) r5
            int r6 = r5.length
            java.lang.System.arraycopy(r5, r2, r0, r4, r6)
            int r4 = r4 + r6
            int r3 = r3 + 1
            goto L3f
        L51:
            r4 = r2
        L52:
            char[] r1 = r7.f341320h
            int r3 = r7.f341321i
            java.lang.System.arraycopy(r1, r2, r0, r4, r3)
        L59:
            r7.f341323k = r0
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.util.p.e():char[]");
    }

    public final int f(boolean z12) {
        char[] cArr;
        int i12 = this.f341315c;
        return (i12 < 0 || (cArr = this.f341314b) == null) ? z12 ? -com.fasterxml.jackson.core.io.j.c(this.f341320h, 1, this.f341321i - 1) : com.fasterxml.jackson.core.io.j.c(this.f341320h, 0, this.f341321i) : z12 ? -com.fasterxml.jackson.core.io.j.c(cArr, i12 + 1, this.f341316d - 1) : com.fasterxml.jackson.core.io.j.c(cArr, i12, this.f341316d);
    }

    public final String g() {
        if (this.f341322j == null) {
            char[] cArr = this.f341323k;
            if (cArr != null) {
                this.f341322j = new String(cArr);
            } else {
                int i12 = this.f341315c;
                if (i12 >= 0) {
                    int i13 = this.f341316d;
                    if (i13 < 1) {
                        this.f341322j = "";
                        return "";
                    }
                    this.f341322j = new String(this.f341314b, i12, i13);
                } else {
                    int i14 = this.f341319g;
                    int i15 = this.f341321i;
                    if (i14 == 0) {
                        this.f341322j = i15 != 0 ? new String(this.f341320h, 0, i15) : "";
                    } else {
                        StringBuilder sb2 = new StringBuilder(i14 + i15);
                        ArrayList<char[]> arrayList = this.f341317e;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i16 = 0; i16 < size; i16++) {
                                char[] cArr2 = this.f341317e.get(i16);
                                sb2.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb2.append(this.f341320h, 0, this.f341321i);
                        this.f341322j = sb2.toString();
                    }
                }
            }
        }
        return this.f341322j;
    }

    public final char[] h() {
        this.f341315c = -1;
        this.f341321i = 0;
        this.f341316d = 0;
        this.f341314b = null;
        this.f341322j = null;
        this.f341323k = null;
        if (this.f341318f) {
            d();
        }
        char[] cArr = this.f341320h;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrC = c(0);
        this.f341320h = cArrC;
        return cArrC;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026 A[PHI: r1
  0x0026: PHI (r1v8 int) = (r1v6 int), (r1v7 int) binds: [B:6:0x0024, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r3 = this;
            java.util.ArrayList<char[]> r0 = r3.f341317e
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f341317e = r0
        Lb:
            char[] r0 = r3.f341320h
            r1 = 1
            r3.f341318f = r1
            java.util.ArrayList<char[]> r1 = r3.f341317e
            r1.add(r0)
            int r1 = r3.f341319g
            int r2 = r0.length
            int r1 = r1 + r2
            r3.f341319g = r1
            r1 = 0
            r3.f341321i = r1
            int r0 = r0.length
            int r1 = r0 >> 1
            int r0 = r0 + r1
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L28
        L26:
            r0 = r1
            goto L2d
        L28:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 <= r1) goto L2d
            goto L26
        L2d:
            char[] r0 = new char[r0]
            r3.f341320h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.util.p.i():void");
    }

    public final char[] j() {
        char[] cArr = this.f341320h;
        int length = cArr.length;
        int i12 = (length >> 1) + length;
        if (i12 > 65536) {
            i12 = (length >> 2) + length;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, i12);
        this.f341320h = cArrCopyOf;
        return cArrCopyOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0027 A[PHI: r1
  0x0027: PHI (r1v7 int) = (r1v5 int), (r1v6 int) binds: [B:6:0x0025, B:9:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final char[] k() {
        /*
            r2 = this;
            java.util.ArrayList<char[]> r0 = r2.f341317e
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f341317e = r0
        Lb:
            r0 = 1
            r2.f341318f = r0
            java.util.ArrayList<char[]> r0 = r2.f341317e
            char[] r1 = r2.f341320h
            r0.add(r1)
            char[] r0 = r2.f341320h
            int r0 = r0.length
            int r1 = r2.f341319g
            int r1 = r1 + r0
            r2.f341319g = r1
            r1 = 0
            r2.f341321i = r1
            int r1 = r0 >> 1
            int r0 = r0 + r1
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L29
        L27:
            r0 = r1
            goto L2e
        L29:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 <= r1) goto L2e
            goto L27
        L2e:
            char[] r0 = new char[r0]
            r2.f341320h = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.util.p.k():char[]");
    }

    public final char[] l() {
        if (this.f341315c >= 0) {
            r(1);
        } else {
            char[] cArr = this.f341320h;
            if (cArr == null) {
                this.f341320h = c(0);
            } else if (this.f341321i >= cArr.length) {
                i();
            }
        }
        return this.f341320h;
    }

    public final char[] m() {
        if (this.f341315c >= 0) {
            return this.f341314b;
        }
        char[] cArr = this.f341323k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.f341322j;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.f341323k = charArray;
            return charArray;
        }
        if (this.f341318f) {
            return e();
        }
        char[] cArr2 = this.f341320h;
        return cArr2 == null ? f341312l : cArr2;
    }

    public final int n() {
        int i12 = this.f341315c;
        if (i12 >= 0) {
            return i12;
        }
        return 0;
    }

    public final void o() {
        char[] cArr;
        this.f341315c = -1;
        this.f341321i = 0;
        this.f341316d = 0;
        this.f341314b = null;
        this.f341323k = null;
        if (this.f341318f) {
            d();
        }
        a aVar = this.f341313a;
        if (aVar == null || (cArr = this.f341320h) == null) {
            return;
        }
        this.f341320h = null;
        aVar.f341280b.set(2, cArr);
    }

    public final void p(char[] cArr, int i12, int i13) {
        this.f341322j = null;
        this.f341323k = null;
        this.f341314b = cArr;
        this.f341315c = i12;
        this.f341316d = i13;
        if (this.f341318f) {
            d();
        }
    }

    public final int q() {
        if (this.f341315c >= 0) {
            return this.f341316d;
        }
        char[] cArr = this.f341323k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.f341322j;
        return str != null ? str.length() : this.f341319g + this.f341321i;
    }

    public final void r(int i12) {
        int i13 = this.f341316d;
        this.f341316d = 0;
        char[] cArr = this.f341314b;
        this.f341314b = null;
        int i14 = this.f341315c;
        this.f341315c = -1;
        int i15 = i12 + i13;
        char[] cArr2 = this.f341320h;
        if (cArr2 == null || i15 > cArr2.length) {
            this.f341320h = c(i15);
        }
        if (i13 > 0) {
            System.arraycopy(cArr, i14, this.f341320h, 0, i13);
        }
        this.f341319g = 0;
        this.f341321i = i13;
    }

    public final String toString() {
        return g();
    }

    public p(char[] cArr) {
        this.f341313a = null;
        this.f341320h = cArr;
        this.f341321i = cArr.length;
        this.f341315c = -1;
    }
}
