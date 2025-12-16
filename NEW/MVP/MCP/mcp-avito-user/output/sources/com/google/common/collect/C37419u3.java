package com.google.common.collect;

import aZ0.InterfaceC19845a;
import com.google.common.collect.C37374m3;
import java.util.Arrays;

/* compiled from: ObjectCountHashMap.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.u3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37419u3<K> {

    /* renamed from: a, reason: collision with root package name */
    public transient Object[] f360013a;

    /* renamed from: b, reason: collision with root package name */
    public transient int[] f360014b;

    /* renamed from: c, reason: collision with root package name */
    public transient int f360015c;

    /* renamed from: d, reason: collision with root package name */
    public transient int f360016d;

    /* renamed from: e, reason: collision with root package name */
    public transient int[] f360017e;

    /* renamed from: f, reason: collision with root package name */
    @XY0.e
    public transient long[] f360018f;

    /* renamed from: g, reason: collision with root package name */
    public transient float f360019g;

    /* renamed from: h, reason: collision with root package name */
    public transient int f360020h;

    /* compiled from: ObjectCountHashMap.java */
    /* renamed from: com.google.common.collect.u3$a */
    public class a extends C37374m3.a<K> {

        /* renamed from: b, reason: collision with root package name */
        @InterfaceC37434x3
        public final K f360021b;

        /* renamed from: c, reason: collision with root package name */
        public int f360022c;

        public a(int i12) {
            this.f360021b = (K) C37419u3.this.f360013a[i12];
            this.f360022c = i12;
        }

        @Override // com.google.common.collect.InterfaceC37338g3.a
        @InterfaceC37434x3
        public final K a() {
            return this.f360021b;
        }

        @Override // com.google.common.collect.InterfaceC37338g3.a
        public final int getCount() {
            int i12 = this.f360022c;
            C37419u3 c37419u3 = C37419u3.this;
            K k12 = this.f360021b;
            if (i12 == -1 || i12 >= c37419u3.f360015c || !com.google.common.base.F.a(k12, c37419u3.f360013a[i12])) {
                this.f360022c = c37419u3.g(k12);
            }
            int i13 = this.f360022c;
            if (i13 == -1) {
                return 0;
            }
            return c37419u3.f360014b[i13];
        }
    }

    public C37419u3() {
        h(3);
    }

    public void a() {
        this.f360016d++;
        Arrays.fill(this.f360013a, 0, this.f360015c, (Object) null);
        Arrays.fill(this.f360014b, 0, this.f360015c, 0);
        Arrays.fill(this.f360017e, -1);
        Arrays.fill(this.f360018f, -1L);
        this.f360015c = 0;
    }

    public final void b(int i12) {
        if (i12 > this.f360018f.length) {
            p(i12);
        }
        if (i12 >= this.f360020h) {
            q(Math.max(2, Integer.highestOneBit(i12 - 1) << 1));
        }
    }

    public int c() {
        return this.f360015c == 0 ? -1 : 0;
    }

    public final int d(@I41.a Object obj) {
        int iG2 = g(obj);
        if (iG2 == -1) {
            return 0;
        }
        return this.f360014b[iG2];
    }

    @InterfaceC37434x3
    public final K e(int i12) {
        com.google.common.base.M.i(i12, this.f360015c);
        return (K) this.f360013a[i12];
    }

    public final int f(int i12) {
        com.google.common.base.M.i(i12, this.f360015c);
        return this.f360014b[i12];
    }

    public final int g(@I41.a Object obj) {
        int iC2 = C37348i1.c(obj);
        int i12 = this.f360017e[(r1.length - 1) & iC2];
        while (i12 != -1) {
            long j12 = this.f360018f[i12];
            if (((int) (j12 >>> 32)) == iC2 && com.google.common.base.F.a(obj, this.f360013a[i12])) {
                return i12;
            }
            i12 = (int) j12;
        }
        return -1;
    }

    public void h(int i12) {
        com.google.common.base.M.d("Initial capacity must be non-negative", i12 >= 0);
        int iA2 = C37348i1.a(1.0f, i12);
        int[] iArr = new int[iA2];
        Arrays.fill(iArr, -1);
        this.f360017e = iArr;
        this.f360019g = 1.0f;
        this.f360013a = new Object[i12];
        this.f360014b = new int[i12];
        long[] jArr = new long[i12];
        Arrays.fill(jArr, -1L);
        this.f360018f = jArr;
        this.f360020h = Math.max(1, (int) (iA2 * 1.0f));
    }

    public void i(@InterfaceC37434x3 Object obj, int i12, int i13, int i14) {
        this.f360018f[i12] = (i14 << 32) | 4294967295L;
        this.f360013a[i12] = obj;
        this.f360014b[i12] = i13;
    }

    public void j(int i12) {
        int i13 = this.f360015c - 1;
        if (i12 >= i13) {
            this.f360013a[i12] = null;
            this.f360014b[i12] = 0;
            this.f360018f[i12] = -1;
            return;
        }
        Object[] objArr = this.f360013a;
        objArr[i12] = objArr[i13];
        int[] iArr = this.f360014b;
        iArr[i12] = iArr[i13];
        objArr[i13] = null;
        iArr[i13] = 0;
        long[] jArr = this.f360018f;
        long j12 = jArr[i13];
        jArr[i12] = j12;
        jArr[i13] = -1;
        int[] iArr2 = this.f360017e;
        int length = ((int) (j12 >>> 32)) & (iArr2.length - 1);
        int i14 = iArr2[length];
        if (i14 == i13) {
            iArr2[length] = i12;
            return;
        }
        while (true) {
            long[] jArr2 = this.f360018f;
            long j13 = jArr2[i14];
            int i15 = (int) j13;
            if (i15 == i13) {
                jArr2[i14] = (j13 & (-4294967296L)) | (4294967295L & i12);
                return;
            }
            i14 = i15;
        }
    }

    public int k(int i12) {
        int i13 = i12 + 1;
        if (i13 < this.f360015c) {
            return i13;
        }
        return -1;
    }

    public int l(int i12, int i13) {
        return i12 - 1;
    }

    @InterfaceC19845a
    public final int m(int i12, @InterfaceC37434x3 Object obj) {
        F.d(i12, "count");
        long[] jArr = this.f360018f;
        Object[] objArr = this.f360013a;
        int[] iArr = this.f360014b;
        int iC2 = C37348i1.c(obj);
        int[] iArr2 = this.f360017e;
        int length = (iArr2.length - 1) & iC2;
        int i13 = this.f360015c;
        int i14 = iArr2[length];
        if (i14 == -1) {
            iArr2[length] = i13;
        } else {
            while (true) {
                long j12 = jArr[i14];
                if (((int) (j12 >>> 32)) == iC2 && com.google.common.base.F.a(obj, objArr[i14])) {
                    int i15 = iArr[i14];
                    iArr[i14] = i12;
                    return i15;
                }
                int i16 = (int) j12;
                if (i16 == -1) {
                    jArr[i14] = ((-4294967296L) & j12) | (4294967295L & i13);
                    break;
                }
                i14 = i16;
            }
        }
        if (i13 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i17 = i13 + 1;
        int length2 = this.f360018f.length;
        if (i17 > length2) {
            int iMax = Math.max(1, length2 >>> 1) + length2;
            int i18 = iMax >= 0 ? iMax : Integer.MAX_VALUE;
            if (i18 != length2) {
                p(i18);
            }
        }
        i(obj, i13, i12, iC2);
        this.f360015c = i17;
        if (i13 >= this.f360020h) {
            q(this.f360017e.length * 2);
        }
        this.f360016d++;
        return 0;
    }

    public final int n(int i12, @I41.a Object obj) {
        int length = (r0.length - 1) & i12;
        int i13 = this.f360017e[length];
        if (i13 == -1) {
            return 0;
        }
        int i14 = -1;
        while (true) {
            if (((int) (this.f360018f[i13] >>> 32)) == i12 && com.google.common.base.F.a(obj, this.f360013a[i13])) {
                int i15 = this.f360014b[i13];
                if (i14 == -1) {
                    this.f360017e[length] = (int) this.f360018f[i13];
                } else {
                    long[] jArr = this.f360018f;
                    jArr[i14] = (jArr[i14] & (-4294967296L)) | (4294967295L & ((int) jArr[i13]));
                }
                j(i13);
                this.f360015c--;
                this.f360016d++;
                return i15;
            }
            int i16 = (int) this.f360018f[i13];
            if (i16 == -1) {
                return 0;
            }
            i14 = i13;
            i13 = i16;
        }
    }

    @InterfaceC19845a
    public final int o(int i12) {
        return n((int) (this.f360018f[i12] >>> 32), this.f360013a[i12]);
    }

    public void p(int i12) {
        this.f360013a = Arrays.copyOf(this.f360013a, i12);
        this.f360014b = Arrays.copyOf(this.f360014b, i12);
        long[] jArr = this.f360018f;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i12);
        if (i12 > length) {
            Arrays.fill(jArrCopyOf, length, i12, -1L);
        }
        this.f360018f = jArrCopyOf;
    }

    public final void q(int i12) {
        if (this.f360017e.length >= 1073741824) {
            this.f360020h = Integer.MAX_VALUE;
            return;
        }
        int i13 = ((int) (i12 * this.f360019g)) + 1;
        int[] iArr = new int[i12];
        Arrays.fill(iArr, -1);
        long[] jArr = this.f360018f;
        int i14 = i12 - 1;
        for (int i15 = 0; i15 < this.f360015c; i15++) {
            int i16 = (int) (jArr[i15] >>> 32);
            int i17 = i16 & i14;
            int i18 = iArr[i17];
            iArr[i17] = i15;
            jArr[i15] = (i16 << 32) | (i18 & 4294967295L);
        }
        this.f360020h = i13;
        this.f360017e = iArr;
    }

    public C37419u3(int i12, int i13) {
        h(i12);
    }
}
