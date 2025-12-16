package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.h9;
import com.yandex.mobile.ads.impl.m11;
import com.yandex.mobile.ads.impl.x91;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes8.dex */
final class l11 {

    /* renamed from: a, reason: collision with root package name */
    private final h9 f387352a;

    /* renamed from: b, reason: collision with root package name */
    private final int f387353b;

    /* renamed from: c, reason: collision with root package name */
    private final pr0 f387354c;

    /* renamed from: d, reason: collision with root package name */
    private a f387355d;

    /* renamed from: e, reason: collision with root package name */
    private a f387356e;

    /* renamed from: f, reason: collision with root package name */
    private a f387357f;

    /* renamed from: g, reason: collision with root package name */
    private long f387358g;

    public l11(h9 h9Var) {
        this.f387352a = h9Var;
        int iB2 = ((eo) h9Var).b();
        this.f387353b = iB2;
        this.f387354c = new pr0(32);
        a aVar = new a(iB2, 0L);
        this.f387355d = aVar;
        this.f387356e = aVar;
        this.f387357f = aVar;
    }

    public final void a(vn vnVar, m11.a aVar) {
        a(this.f387356e, vnVar, aVar, this.f387354c);
    }

    public final void b() {
        a aVar = this.f387355d;
        if (aVar.f387361c != null) {
            ((eo) this.f387352a).a(aVar);
            aVar.f387361c = null;
            aVar.f387362d = null;
        }
        this.f387355d.a(this.f387353b, 0L);
        a aVar2 = this.f387355d;
        this.f387356e = aVar2;
        this.f387357f = aVar2;
        this.f387358g = 0L;
        ((eo) this.f387352a).e();
    }

    public final void c() {
        this.f387356e = this.f387355d;
    }

    public final void a(long j12) {
        a aVar;
        if (j12 == -1) {
            return;
        }
        while (true) {
            aVar = this.f387355d;
            if (j12 < aVar.f387360b) {
                break;
            }
            ((eo) this.f387352a).a(aVar.f387361c);
            a aVar2 = this.f387355d;
            aVar2.f387361c = null;
            a aVar3 = aVar2.f387362d;
            aVar2.f387362d = null;
            this.f387355d = aVar3;
        }
        if (this.f387356e.f387359a < aVar.f387359a) {
            this.f387356e = aVar;
        }
    }

    public static final class a implements h9.a {

        /* renamed from: a, reason: collision with root package name */
        public long f387359a;

        /* renamed from: b, reason: collision with root package name */
        public long f387360b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public g9 f387361c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public a f387362d;

        public a(int i12, long j12) {
            a(i12, j12);
        }

        public final void a(int i12, long j12) {
            db.b(this.f387361c == null);
            this.f387359a = j12;
            this.f387360b = j12 + i12;
        }

        @Override // com.yandex.mobile.ads.impl.h9.a
        @j.P
        public final h9.a next() {
            a aVar = this.f387362d;
            if (aVar == null || aVar.f387361c == null) {
                return null;
            }
            return aVar;
        }

        @Override // com.yandex.mobile.ads.impl.h9.a
        public final g9 a() {
            g9 g9Var = this.f387361c;
            g9Var.getClass();
            return g9Var;
        }
    }

    public final long a() {
        return this.f387358g;
    }

    public final void b(vn vnVar, m11.a aVar) {
        this.f387356e = a(this.f387356e, vnVar, aVar, this.f387354c);
    }

    public final int a(dn dnVar, int i12, boolean z12) throws EOFException {
        a aVar = this.f387357f;
        if (aVar.f387361c == null) {
            g9 g9VarA = ((eo) this.f387352a).a();
            a aVar2 = new a(this.f387353b, this.f387357f.f387360b);
            aVar.f387361c = g9VarA;
            aVar.f387362d = aVar2;
        }
        int iMin = Math.min(i12, (int) (this.f387357f.f387360b - this.f387358g));
        a aVar3 = this.f387357f;
        g9 g9Var = aVar3.f387361c;
        int i13 = dnVar.read(g9Var.f385615a, ((int) (this.f387358g - aVar3.f387359a)) + g9Var.f385616b, iMin);
        if (i13 == -1) {
            if (z12) {
                return -1;
            }
            throw new EOFException();
        }
        long j12 = this.f387358g + i13;
        this.f387358g = j12;
        a aVar4 = this.f387357f;
        if (j12 == aVar4.f387360b) {
            this.f387357f = aVar4.f387362d;
        }
        return i13;
    }

    public final void a(int i12, pr0 pr0Var) {
        while (i12 > 0) {
            a aVar = this.f387357f;
            if (aVar.f387361c == null) {
                g9 g9VarA = ((eo) this.f387352a).a();
                a aVar2 = new a(this.f387353b, this.f387357f.f387360b);
                aVar.f387361c = g9VarA;
                aVar.f387362d = aVar2;
            }
            int iMin = Math.min(i12, (int) (this.f387357f.f387360b - this.f387358g));
            a aVar3 = this.f387357f;
            g9 g9Var = aVar3.f387361c;
            pr0Var.a(g9Var.f385615a, ((int) (this.f387358g - aVar3.f387359a)) + g9Var.f385616b, iMin);
            i12 -= iMin;
            long j12 = this.f387358g + iMin;
            this.f387358g = j12;
            a aVar4 = this.f387357f;
            if (j12 == aVar4.f387360b) {
                this.f387357f = aVar4.f387362d;
            }
        }
    }

    private static a a(a aVar, vn vnVar, m11.a aVar2, pr0 pr0Var) {
        a aVarA;
        int iZ2;
        if (vnVar.i()) {
            long j12 = aVar2.f387823b;
            pr0Var.c(1);
            a aVarA2 = a(aVar, j12, pr0Var.c(), 1);
            long j13 = j12 + 1;
            byte b12 = pr0Var.c()[0];
            boolean z12 = (b12 & 128) != 0;
            int i12 = b12 & 127;
            um umVar = vnVar.f390950b;
            byte[] bArr = umVar.f390585a;
            if (bArr == null) {
                umVar.f390585a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            aVarA = a(aVarA2, j13, umVar.f390585a, i12);
            long j14 = j13 + i12;
            if (z12) {
                pr0Var.c(2);
                aVarA = a(aVarA, j14, pr0Var.c(), 2);
                j14 += 2;
                iZ2 = pr0Var.z();
            } else {
                iZ2 = 1;
            }
            int[] iArr = umVar.f390588d;
            if (iArr == null || iArr.length < iZ2) {
                iArr = new int[iZ2];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = umVar.f390589e;
            if (iArr3 == null || iArr3.length < iZ2) {
                iArr3 = new int[iZ2];
            }
            int[] iArr4 = iArr3;
            if (z12) {
                int i13 = iZ2 * 6;
                pr0Var.c(i13);
                aVarA = a(aVarA, j14, pr0Var.c(), i13);
                j14 += i13;
                pr0Var.e(0);
                for (int i14 = 0; i14 < iZ2; i14++) {
                    iArr2[i14] = pr0Var.z();
                    iArr4[i14] = pr0Var.x();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = aVar2.f387822a - ((int) (j14 - aVar2.f387823b));
            }
            x91.a aVar3 = aVar2.f387824c;
            int i15 = pc1.f388768a;
            umVar.a(iZ2, iArr2, iArr4, aVar3.f391584b, umVar.f390585a, aVar3.f391583a, aVar3.f391585c, aVar3.f391586d);
            long j15 = aVar2.f387823b;
            int i16 = (int) (j14 - j15);
            aVar2.f387823b = j15 + i16;
            aVar2.f387822a -= i16;
        } else {
            aVarA = aVar;
        }
        if (vnVar.d()) {
            pr0Var.c(4);
            a aVarA3 = a(aVarA, aVar2.f387823b, pr0Var.c(), 4);
            int iX2 = pr0Var.x();
            aVar2.f387823b += 4;
            aVar2.f387822a -= 4;
            vnVar.e(iX2);
            a aVarA4 = a(aVarA3, aVar2.f387823b, vnVar.f390951c, iX2);
            aVar2.f387823b += iX2;
            int i17 = aVar2.f387822a - iX2;
            aVar2.f387822a = i17;
            ByteBuffer byteBuffer = vnVar.f390954f;
            if (byteBuffer != null && byteBuffer.capacity() >= i17) {
                vnVar.f390954f.clear();
            } else {
                vnVar.f390954f = ByteBuffer.allocate(i17);
            }
            return a(aVarA4, aVar2.f387823b, vnVar.f390954f, aVar2.f387822a);
        }
        vnVar.e(aVar2.f387822a);
        return a(aVarA, aVar2.f387823b, vnVar.f390951c, aVar2.f387822a);
    }

    private static a a(a aVar, long j12, ByteBuffer byteBuffer, int i12) {
        while (j12 >= aVar.f387360b) {
            aVar = aVar.f387362d;
        }
        while (i12 > 0) {
            int iMin = Math.min(i12, (int) (aVar.f387360b - j12));
            g9 g9Var = aVar.f387361c;
            byteBuffer.put(g9Var.f385615a, ((int) (j12 - aVar.f387359a)) + g9Var.f385616b, iMin);
            i12 -= iMin;
            j12 += iMin;
            if (j12 == aVar.f387360b) {
                aVar = aVar.f387362d;
            }
        }
        return aVar;
    }

    private static a a(a aVar, long j12, byte[] bArr, int i12) {
        while (j12 >= aVar.f387360b) {
            aVar = aVar.f387362d;
        }
        int i13 = i12;
        while (i13 > 0) {
            int iMin = Math.min(i13, (int) (aVar.f387360b - j12));
            g9 g9Var = aVar.f387361c;
            System.arraycopy(g9Var.f385615a, ((int) (j12 - aVar.f387359a)) + g9Var.f385616b, bArr, i12 - i13, iMin);
            i13 -= iMin;
            j12 += iMin;
            if (j12 == aVar.f387360b) {
                aVar = aVar.f387362d;
            }
        }
        return aVar;
    }
}
