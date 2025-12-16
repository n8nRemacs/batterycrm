package com.fasterxml.jackson.core.sym;

import androidx.compose.foundation.H;
import com.fasterxml.jackson.core.JsonFactory;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ByteQuadsCanonicalizer.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final a f341222a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<C10543a> f341223b;

    /* renamed from: c, reason: collision with root package name */
    public final int f341224c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f341225d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f341226e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f341227f;

    /* renamed from: g, reason: collision with root package name */
    public int f341228g;

    /* renamed from: h, reason: collision with root package name */
    public int f341229h;

    /* renamed from: i, reason: collision with root package name */
    public int f341230i;

    /* renamed from: j, reason: collision with root package name */
    public int f341231j;

    /* renamed from: k, reason: collision with root package name */
    public int f341232k;

    /* renamed from: l, reason: collision with root package name */
    public String[] f341233l;

    /* renamed from: m, reason: collision with root package name */
    public int f341234m;

    /* renamed from: n, reason: collision with root package name */
    public int f341235n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f341236o;

    public a(int i12) {
        this.f341222a = null;
        this.f341232k = 0;
        this.f341236o = true;
        this.f341224c = i12;
        this.f341225d = false;
        this.f341226e = true;
        this.f341223b = new AtomicReference<>(new C10543a(64, 4, new int[512], new String[128], 448, 512));
    }

    public final int a(int i12) {
        return (i12 & (this.f341228g - 1)) << 2;
    }

    public final int b(int i12) {
        int iA2 = a(i12);
        int[] iArr = this.f341227f;
        if (iArr[iA2 + 3] == 0) {
            return iA2;
        }
        if (this.f341232k > (this.f341228g >> 1)) {
            int iD2 = (this.f341234m - d()) >> 2;
            int i13 = this.f341232k;
            if (iD2 > ((i13 + 1) >> 7) || i13 > this.f341228g * 0.8d) {
                return c(i12);
            }
        }
        int i14 = this.f341229h + ((iA2 >> 3) << 2);
        if (iArr[i14 + 3] == 0) {
            return i14;
        }
        int i15 = this.f341230i;
        int i16 = this.f341231j;
        int i17 = i15 + ((iA2 >> (i16 + 2)) << i16);
        int i18 = (1 << i16) + i17;
        while (i17 < i18) {
            if (iArr[i17 + 3] == 0) {
                return i17;
            }
            i17 += 4;
        }
        int i19 = this.f341234m;
        int i22 = i19 + 4;
        this.f341234m = i22;
        int i23 = this.f341228g;
        if (i22 < (i23 << 3)) {
            return i19;
        }
        if (!this.f341226e || i23 <= 1024) {
            return c(i12);
        }
        StringBuilder sb2 = new StringBuilder("Spill-over slots in symbol table with ");
        sb2.append(this.f341232k);
        sb2.append(" entries, hash area of ");
        sb2.append(this.f341228g);
        sb2.append(" slots is now full (all ");
        throw new IllegalStateException(AK.c.i(this.f341228g >> 3, " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`", sb2));
    }

    public final int c(int i12) {
        this.f341236o = false;
        int[] iArr = this.f341227f;
        String[] strArr = this.f341233l;
        int i13 = this.f341228g;
        int i14 = this.f341232k;
        int i15 = i13 + i13;
        int i16 = this.f341234m;
        if (i15 > 65536) {
            o(true);
        } else {
            this.f341227f = new int[iArr.length + (i13 << 3)];
            this.f341228g = i15;
            int i17 = i15 << 2;
            this.f341229h = i17;
            this.f341230i = i17 + (i17 >> 1);
            int i18 = i15 >> 2;
            this.f341231j = i18 < 64 ? 4 : i18 <= 256 ? 5 : i18 <= 1024 ? 6 : 7;
            this.f341233l = new String[strArr.length << 1];
            o(false);
            int[] iArr2 = new int[16];
            int i19 = 0;
            for (int i22 = 0; i22 < i16; i22 += 4) {
                int i23 = iArr[i22 + 3];
                if (i23 != 0) {
                    i19++;
                    String str = strArr[i22 >> 2];
                    if (i23 == 1) {
                        iArr2[0] = iArr[i22];
                        f(1, str, iArr2);
                    } else if (i23 == 2) {
                        iArr2[0] = iArr[i22];
                        iArr2[1] = iArr[i22 + 1];
                        f(2, str, iArr2);
                    } else if (i23 != 3) {
                        if (i23 > iArr2.length) {
                            iArr2 = new int[i23];
                        }
                        System.arraycopy(iArr, iArr[i22 + 1], iArr2, 0, i23);
                        f(i23, str, iArr2);
                    } else {
                        iArr2[0] = iArr[i22];
                        iArr2[1] = iArr[i22 + 1];
                        iArr2[2] = iArr[i22 + 2];
                        f(3, str, iArr2);
                    }
                }
            }
            if (i19 != i14) {
                throw new IllegalStateException(H.j(i14, i19, "Failed rehash(): old count=", ", copyCount="));
            }
        }
        int iA2 = a(i12);
        int[] iArr3 = this.f341227f;
        if (iArr3[iA2 + 3] == 0) {
            return iA2;
        }
        int i24 = this.f341229h + ((iA2 >> 3) << 2);
        if (iArr3[i24 + 3] == 0) {
            return i24;
        }
        int i25 = this.f341230i;
        int i26 = this.f341231j;
        int i27 = i25 + ((iA2 >> (i26 + 2)) << i26);
        int i28 = (1 << i26) + i27;
        while (i27 < i28) {
            if (iArr3[i27 + 3] == 0) {
                return i27;
            }
            i27 += 4;
        }
        int i29 = this.f341234m;
        this.f341234m = i29 + 4;
        return i29;
    }

    public final int d() {
        int i12 = this.f341228g;
        return (i12 << 3) - i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(int r8, int r9, int[] r10) {
        /*
            r7 = this;
            int[] r0 = r7.f341227f
            r1 = 1
            r2 = 0
            switch(r8) {
                case 4: goto L52;
                case 5: goto L44;
                case 6: goto L36;
                case 7: goto L28;
                case 8: goto L1c;
                default: goto L7;
            }
        L7:
            r0 = r2
        L8:
            int r3 = r0 + 1
            r0 = r10[r0]
            int[] r4 = r7.f341227f
            int r5 = r9 + 1
            r9 = r4[r9]
            if (r0 == r9) goto L16
            r1 = r2
            goto L18
        L16:
            if (r3 < r8) goto L19
        L18:
            return r1
        L19:
            r0 = r3
            r9 = r5
            goto L8
        L1c:
            r8 = r10[r2]
            int r3 = r9 + 1
            r9 = r0[r9]
            if (r8 == r9) goto L25
            return r2
        L25:
            r8 = r1
            r9 = r3
            goto L29
        L28:
            r8 = r2
        L29:
            int r3 = r8 + 1
            r8 = r10[r8]
            int r4 = r9 + 1
            r9 = r0[r9]
            if (r8 == r9) goto L34
            return r2
        L34:
            r9 = r4
            goto L37
        L36:
            r3 = r2
        L37:
            int r8 = r3 + 1
            r3 = r10[r3]
            int r4 = r9 + 1
            r9 = r0[r9]
            if (r3 == r9) goto L42
            return r2
        L42:
            r9 = r4
            goto L45
        L44:
            r8 = r2
        L45:
            int r3 = r8 + 1
            r8 = r10[r8]
            int r4 = r9 + 1
            r9 = r0[r9]
            if (r8 == r9) goto L50
            return r2
        L50:
            r9 = r4
            goto L53
        L52:
            r3 = r2
        L53:
            int r8 = r3 + 1
            r4 = r10[r3]
            int r5 = r9 + 1
            r6 = r0[r9]
            if (r4 == r6) goto L5e
            return r2
        L5e:
            int r4 = r3 + 2
            r8 = r10[r8]
            int r6 = r9 + 2
            r5 = r0[r5]
            if (r8 == r5) goto L69
            return r2
        L69:
            int r3 = r3 + 3
            r8 = r10[r4]
            int r9 = r9 + 3
            r4 = r0[r6]
            if (r8 == r4) goto L74
            return r2
        L74:
            r8 = r10[r3]
            r9 = r0[r9]
            if (r8 == r9) goto L7b
            return r2
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.sym.a.e(int, int, int[]):boolean");
    }

    public final String f(int i12, String str, int[] iArr) {
        int iB2;
        if (this.f341236o) {
            if (this.f341222a == null) {
                if (this.f341232k == 0) {
                    throw new IllegalStateException("Cannot add names to Root symbol table");
                }
                throw new IllegalStateException("Cannot add names to Placeholder symbol table");
            }
            int[] iArr2 = this.f341227f;
            this.f341227f = Arrays.copyOf(iArr2, iArr2.length);
            String[] strArr = this.f341233l;
            this.f341233l = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.f341236o = false;
        }
        if (this.f341225d) {
            str = com.fasterxml.jackson.core.util.g.f341303c.a(str);
        }
        if (i12 == 1) {
            int i13 = iArr[0] ^ this.f341224c;
            int i14 = i13 + (i13 >>> 16);
            int i15 = i14 ^ (i14 << 3);
            iB2 = b(i15 + (i15 >>> 12));
            int[] iArr3 = this.f341227f;
            iArr3[iB2] = iArr[0];
            iArr3[iB2 + 3] = 1;
        } else if (i12 == 2) {
            iB2 = b(g(iArr[0], iArr[1]));
            int[] iArr4 = this.f341227f;
            iArr4[iB2] = iArr[0];
            iArr4[iB2 + 1] = iArr[1];
            iArr4[iB2 + 3] = 2;
        } else if (i12 != 3) {
            int i16 = i(i12, iArr);
            iB2 = b(i16);
            int[] iArr5 = this.f341227f;
            iArr5[iB2] = i16;
            int i17 = this.f341235n;
            int i18 = i17 + i12;
            if (i18 > iArr5.length) {
                this.f341227f = Arrays.copyOf(this.f341227f, Math.max(i18 - iArr5.length, Math.min(4096, this.f341228g)) + this.f341227f.length);
            }
            System.arraycopy(iArr, 0, this.f341227f, i17, i12);
            this.f341235n += i12;
            int[] iArr6 = this.f341227f;
            iArr6[iB2 + 1] = i17;
            iArr6[iB2 + 3] = i12;
        } else {
            iB2 = b(h(iArr[0], iArr[1], iArr[2]));
            int[] iArr7 = this.f341227f;
            iArr7[iB2] = iArr[0];
            iArr7[iB2 + 1] = iArr[1];
            iArr7[iB2 + 2] = iArr[2];
            iArr7[iB2 + 3] = 3;
        }
        this.f341233l[iB2 >> 2] = str;
        this.f341232k++;
        return str;
    }

    public final int g(int i12, int i13) {
        int i14 = i12 + (i12 >>> 15);
        int i15 = this.f341224c ^ ((i13 * 33) + (i14 ^ (i14 >>> 9)));
        int i16 = i15 + (i15 >>> 16);
        int i17 = i16 ^ (i16 >>> 4);
        return i17 + (i17 << 3);
    }

    public final int h(int i12, int i13, int i14) {
        int i15 = i12 ^ this.f341224c;
        int i16 = (((i15 + (i15 >>> 9)) * 31) + i13) * 33;
        int i17 = (i16 + (i16 >>> 15)) ^ i14;
        int i18 = i17 + (i17 >>> 4);
        int i19 = i18 + (i18 >>> 15);
        return i19 ^ (i19 << 9);
    }

    public final int i(int i12, int[] iArr) {
        if (i12 < 4) {
            throw new IllegalArgumentException();
        }
        int i13 = iArr[0] ^ this.f341224c;
        int i14 = i13 + (i13 >>> 9) + iArr[1];
        int i15 = ((i14 + (i14 >>> 15)) * 33) ^ iArr[2];
        int i16 = i15 + (i15 >>> 4);
        for (int i17 = 3; i17 < i12; i17++) {
            int i18 = iArr[i17];
            i16 += i18 ^ (i18 >> 21);
        }
        int i19 = i16 * 65599;
        int i22 = i19 + (i19 >>> 19);
        return (i22 << 5) ^ i22;
    }

    public final String j(int i12) {
        int i13 = this.f341224c ^ i12;
        int i14 = i13 + (i13 >>> 16);
        int i15 = i14 ^ (i14 << 3);
        int iA2 = a(i15 + (i15 >>> 12));
        int[] iArr = this.f341227f;
        int i16 = iArr[iA2 + 3];
        if (i16 == 1) {
            if (iArr[iA2] == i12) {
                return this.f341233l[iA2 >> 2];
            }
        } else if (i16 == 0) {
            return null;
        }
        int i17 = this.f341229h + ((iA2 >> 3) << 2);
        int i18 = iArr[i17 + 3];
        if (i18 == 1) {
            if (iArr[i17] == i12) {
                return this.f341233l[i17 >> 2];
            }
        } else if (i18 == 0) {
            return null;
        }
        int i19 = this.f341230i;
        int i22 = this.f341231j;
        int i23 = i19 + ((iA2 >> (i22 + 2)) << i22);
        int i24 = (1 << i22) + i23;
        while (i23 < i24) {
            int i25 = iArr[i23 + 3];
            if (i12 == iArr[i23] && 1 == i25) {
                return this.f341233l[i23 >> 2];
            }
            if (i25 == 0) {
                return null;
            }
            i23 += 4;
        }
        for (int iD2 = d(); iD2 < this.f341234m; iD2 += 4) {
            if (i12 == iArr[iD2] && 1 == iArr[iD2 + 3]) {
                return this.f341233l[iD2 >> 2];
            }
        }
        return null;
    }

    public final String k(int i12, int i13) {
        int iA2 = a(g(i12, i13));
        int[] iArr = this.f341227f;
        int i14 = iArr[iA2 + 3];
        if (i14 == 2) {
            if (i12 == iArr[iA2] && i13 == iArr[iA2 + 1]) {
                return this.f341233l[iA2 >> 2];
            }
        } else if (i14 == 0) {
            return null;
        }
        int i15 = this.f341229h + ((iA2 >> 3) << 2);
        int i16 = iArr[i15 + 3];
        if (i16 == 2) {
            if (i12 == iArr[i15] && i13 == iArr[i15 + 1]) {
                return this.f341233l[i15 >> 2];
            }
        } else if (i16 == 0) {
            return null;
        }
        int i17 = this.f341230i;
        int i18 = this.f341231j;
        int i19 = i17 + ((iA2 >> (i18 + 2)) << i18);
        int i22 = (1 << i18) + i19;
        while (i19 < i22) {
            int i23 = iArr[i19 + 3];
            if (i12 == iArr[i19] && i13 == iArr[i19 + 1] && 2 == i23) {
                return this.f341233l[i19 >> 2];
            }
            if (i23 == 0) {
                return null;
            }
            i19 += 4;
        }
        for (int iD2 = d(); iD2 < this.f341234m; iD2 += 4) {
            if (i12 == iArr[iD2] && i13 == iArr[iD2 + 1] && 2 == iArr[iD2 + 3]) {
                return this.f341233l[iD2 >> 2];
            }
        }
        return null;
    }

    public final String l(int i12, int i13, int i14) {
        int iA2 = a(h(i12, i13, i14));
        int[] iArr = this.f341227f;
        int i15 = iArr[iA2 + 3];
        if (i15 == 3) {
            if (i12 == iArr[iA2] && iArr[iA2 + 1] == i13 && iArr[iA2 + 2] == i14) {
                return this.f341233l[iA2 >> 2];
            }
        } else if (i15 == 0) {
            return null;
        }
        int i16 = this.f341229h + ((iA2 >> 3) << 2);
        int i17 = iArr[i16 + 3];
        if (i17 == 3) {
            if (i12 == iArr[i16] && iArr[i16 + 1] == i13 && iArr[i16 + 2] == i14) {
                return this.f341233l[i16 >> 2];
            }
        } else if (i17 == 0) {
            return null;
        }
        int i18 = this.f341230i;
        int i19 = this.f341231j;
        int i22 = i18 + ((iA2 >> (i19 + 2)) << i19);
        int i23 = (1 << i19) + i22;
        while (i22 < i23) {
            int i24 = iArr[i22 + 3];
            if (i12 == iArr[i22] && i13 == iArr[i22 + 1] && i14 == iArr[i22 + 2] && 3 == i24) {
                return this.f341233l[i22 >> 2];
            }
            if (i24 == 0) {
                return null;
            }
            i22 += 4;
        }
        for (int iD2 = d(); iD2 < this.f341234m; iD2 += 4) {
            if (i12 == iArr[iD2] && i13 == iArr[iD2 + 1] && i14 == iArr[iD2 + 2] && 3 == iArr[iD2 + 3]) {
                return this.f341233l[iD2 >> 2];
            }
        }
        return null;
    }

    public final String m(int i12, int[] iArr) {
        if (i12 < 4) {
            return i12 != 1 ? i12 != 2 ? i12 != 3 ? "" : l(iArr[0], iArr[1], iArr[2]) : k(iArr[0], iArr[1]) : j(iArr[0]);
        }
        int i13 = i(i12, iArr);
        int iA2 = a(i13);
        int[] iArr2 = this.f341227f;
        int i14 = iArr2[iA2 + 3];
        if (i13 == iArr2[iA2] && i14 == i12 && e(i12, iArr2[iA2 + 1], iArr)) {
            return this.f341233l[iA2 >> 2];
        }
        if (i14 == 0) {
            return null;
        }
        int i15 = this.f341229h + ((iA2 >> 3) << 2);
        int i16 = iArr2[i15 + 3];
        if (i13 == iArr2[i15] && i16 == i12 && e(i12, iArr2[i15 + 1], iArr)) {
            return this.f341233l[i15 >> 2];
        }
        int i17 = this.f341230i;
        int i18 = this.f341231j;
        int i19 = i17 + ((iA2 >> (i18 + 2)) << i18);
        int[] iArr3 = this.f341227f;
        int i22 = (1 << i18) + i19;
        while (i19 < i22) {
            int i23 = iArr3[i19 + 3];
            if (i13 == iArr3[i19] && i12 == i23 && e(i12, iArr3[i19 + 1], iArr)) {
                return this.f341233l[i19 >> 2];
            }
            if (i23 == 0) {
                return null;
            }
            i19 += 4;
        }
        for (int iD2 = d(); iD2 < this.f341234m; iD2 += 4) {
            if (i13 == iArr3[iD2] && i12 == iArr3[iD2 + 3] && e(i12, iArr3[iD2 + 1], iArr)) {
                return this.f341233l[iD2 >> 2];
            }
        }
        return null;
    }

    public final a n(int i12) {
        return new a(this, this.f341224c, this.f341223b.get(), JsonFactory.Feature.f341034b.c(i12), JsonFactory.Feature.f341036d.c(i12));
    }

    public final void o(boolean z12) {
        this.f341232k = 0;
        this.f341234m = d();
        this.f341235n = this.f341228g << 3;
        if (z12) {
            Arrays.fill(this.f341227f, 0);
            Arrays.fill(this.f341233l, (Object) null);
        }
    }

    public final void p() {
        a aVar = this.f341222a;
        if (aVar == null || this.f341236o) {
            return;
        }
        C10543a c10543a = new C10543a(this);
        AtomicReference<C10543a> atomicReference = aVar.f341223b;
        C10543a c10543a2 = atomicReference.get();
        int i12 = c10543a2.f341238b;
        int i13 = c10543a.f341238b;
        if (i13 != i12) {
            if (i13 > 6000) {
                c10543a = new C10543a(64, 4, new int[512], new String[128], 448, 512);
            }
            while (!atomicReference.compareAndSet(c10543a2, c10543a) && atomicReference.get() == c10543a2) {
            }
        }
        this.f341236o = true;
    }

    public final String toString() {
        int i12 = this.f341229h;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 3; i15 < i12; i15 += 4) {
            if (this.f341227f[i15] != 0) {
                i14++;
            }
        }
        int i16 = this.f341230i;
        int i17 = 0;
        for (int i18 = this.f341229h + 3; i18 < i16; i18 += 4) {
            if (this.f341227f[i18] != 0) {
                i17++;
            }
        }
        int i19 = this.f341230i + 3;
        int i22 = this.f341228g + i19;
        int i23 = 0;
        while (i19 < i22) {
            if (this.f341227f[i19] != 0) {
                i23++;
            }
            i19 += 4;
        }
        int iD2 = (this.f341234m - d()) >> 2;
        int i24 = this.f341228g << 3;
        for (int i25 = 3; i25 < i24; i25 += 4) {
            if (this.f341227f[i25] != 0) {
                i13++;
            }
        }
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", a.class.getName(), Integer.valueOf(this.f341232k), Integer.valueOf(this.f341228g), Integer.valueOf(i14), Integer.valueOf(i17), Integer.valueOf(i23), Integer.valueOf(iD2), Integer.valueOf(i14 + i17 + i23 + iD2), Integer.valueOf(i13));
    }

    /* compiled from: ByteQuadsCanonicalizer.java */
    /* renamed from: com.fasterxml.jackson.core.sym.a$a, reason: collision with other inner class name */
    public static final class C10543a {

        /* renamed from: a, reason: collision with root package name */
        public final int f341237a;

        /* renamed from: b, reason: collision with root package name */
        public final int f341238b;

        /* renamed from: c, reason: collision with root package name */
        public final int f341239c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f341240d;

        /* renamed from: e, reason: collision with root package name */
        public final String[] f341241e;

        /* renamed from: f, reason: collision with root package name */
        public final int f341242f;

        /* renamed from: g, reason: collision with root package name */
        public final int f341243g;

        public C10543a(int i12, int i13, int[] iArr, String[] strArr, int i14, int i15) {
            this.f341237a = i12;
            this.f341238b = 0;
            this.f341239c = i13;
            this.f341240d = iArr;
            this.f341241e = strArr;
            this.f341242f = i14;
            this.f341243g = i15;
        }

        public C10543a(a aVar) {
            this.f341237a = aVar.f341228g;
            this.f341238b = aVar.f341232k;
            this.f341239c = aVar.f341231j;
            this.f341240d = aVar.f341227f;
            this.f341241e = aVar.f341233l;
            this.f341242f = aVar.f341234m;
            this.f341243g = aVar.f341235n;
        }
    }

    public a(a aVar, int i12, C10543a c10543a, boolean z12, boolean z13) {
        this.f341222a = aVar;
        this.f341224c = i12;
        this.f341225d = z12;
        this.f341226e = z13;
        this.f341223b = null;
        this.f341232k = c10543a.f341238b;
        int i13 = c10543a.f341237a;
        this.f341228g = i13;
        int i14 = i13 << 2;
        this.f341229h = i14;
        this.f341230i = i14 + (i14 >> 1);
        this.f341231j = c10543a.f341239c;
        this.f341227f = c10543a.f341240d;
        this.f341233l = c10543a.f341241e;
        this.f341234m = c10543a.f341242f;
        this.f341235n = c10543a.f341243g;
        this.f341236o = true;
    }
}
