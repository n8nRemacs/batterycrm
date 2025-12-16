package defpackage;

import java.nio.ByteOrder;
import java.util.Collections;

/* loaded from: classes.dex */
public final class x16 {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public final Object l;
    public final Object m;

    public x16(byte[] bArr, int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                u62 u62Var = new u62(bArr, bArr.length, 3, (byte) 0);
                u62Var.q(i * 8);
                this.b = u62Var.i(16);
                this.c = u62Var.i(16);
                this.d = u62Var.i(24);
                this.e = u62Var.i(24);
                int i3 = u62Var.i(20);
                this.f = i3;
                this.g = g(i3);
                this.h = u62Var.i(3) + 1;
                int i4 = u62Var.i(5) + 1;
                this.i = i4;
                this.j = b(i4);
                this.k = u62Var.k(36);
                this.l = null;
                this.m = null;
                break;
            default:
                u62 u62Var2 = new u62(bArr, bArr.length, 2, (byte) 0);
                u62Var2.q(i * 8);
                this.b = u62Var2.i(16);
                this.c = u62Var2.i(16);
                this.d = u62Var2.i(24);
                this.e = u62Var2.i(24);
                int i5 = u62Var2.i(20);
                this.f = i5;
                this.g = f(i5);
                this.h = u62Var2.i(3) + 1;
                int i6 = u62Var2.i(5) + 1;
                this.i = i6;
                this.j = a(i6);
                int i7 = u62Var2.i(4);
                int i8 = u62Var2.i(32);
                int i9 = xxg.a;
                this.k = ((i7 & 4294967295L) << 32) | (i8 & 4294967295L);
                this.l = null;
                this.m = null;
                break;
        }
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int b(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int f(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public static int g(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long c() {
        switch (this.a) {
            case 0:
                long j = this.k;
                if (j == 0) {
                    return -9223372036854775807L;
                }
                return (j * 1000000) / this.f;
            default:
                long j2 = this.k;
                if (j2 == 0) {
                    return -9223372036854775807L;
                }
                return (j2 * 1000000) / this.f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.gf6 d(byte[] r7, defpackage.sy9 r8) {
        /*
            r6 = this;
            r0 = 4
            r1 = -128(0xffffffffffffff80, float:NaN)
            r7[r0] = r1
            int r0 = r6.e
            if (r0 <= 0) goto La
            goto Lb
        La:
            r0 = -1
        Lb:
            java.lang.Object r1 = r6.m
            sy9 r1 = (defpackage.sy9) r1
            if (r1 != 0) goto L12
            goto L35
        L12:
            if (r8 != 0) goto L15
            goto L1a
        L15:
            qy9[] r8 = r8.a
            int r2 = r8.length
            if (r2 != 0) goto L1c
        L1a:
            r8 = r1
            goto L35
        L1c:
            sy9 r2 = new sy9
            qy9[] r1 = r1.a
            int r3 = defpackage.xxg.a
            int r3 = r1.length
            int r4 = r8.length
            int r3 = r3 + r4
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r1, r3)
            int r1 = r1.length
            int r4 = r8.length
            r5 = 0
            java.lang.System.arraycopy(r8, r5, r3, r1, r4)
            qy9[] r3 = (defpackage.qy9[]) r3
            r2.<init>(r3)
            r8 = r2
        L35:
            ef6 r1 = new ef6
            r1.<init>()
            java.lang.String r2 = "audio/flac"
            r1.k = r2
            r1.l = r0
            int r0 = r6.h
            r1.x = r0
            int r0 = r6.f
            r1.y = r0
            java.util.List r7 = java.util.Collections.singletonList(r7)
            r1.m = r7
            r1.i = r8
            gf6 r7 = new gf6
            r7.<init>(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x16.d(byte[], sy9):gf6");
    }

    public hf6 e(byte[] bArr, ty9 ty9Var) {
        bArr[4] = -128;
        int i = this.e;
        if (i <= 0) {
            i = -1;
        }
        ty9 ty9Var2 = (ty9) this.m;
        if (ty9Var2 != null) {
            ty9Var = ty9Var2.b(ty9Var);
        }
        ff6 ff6Var = new ff6();
        ff6Var.m = xz9.n("audio/flac");
        ff6Var.n = i;
        ff6Var.E = this.h;
        ff6Var.F = this.f;
        String str = zxg.a;
        ff6Var.G = zxg.F(this.i, ByteOrder.LITTLE_ENDIAN);
        ff6Var.p = Collections.singletonList(bArr);
        ff6Var.k = ty9Var;
        return new hf6(ff6Var);
    }

    public x16(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, h79 h79Var, sy9 sy9Var) {
        this.a = 0;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = f(i5);
        this.h = i6;
        this.i = i7;
        this.j = a(i7);
        this.k = j;
        this.l = h79Var;
        this.m = sy9Var;
    }

    public x16(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, s7c s7cVar, ty9 ty9Var) {
        this.a = 1;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = g(i5);
        this.h = i6;
        this.i = i7;
        this.j = b(i7);
        this.k = j;
        this.l = s7cVar;
        this.m = ty9Var;
    }
}
