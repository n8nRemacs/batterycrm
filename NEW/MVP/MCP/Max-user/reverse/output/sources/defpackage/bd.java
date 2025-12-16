package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class bd implements fp5 {
    public static final int[] n = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] o;
    public static final byte[] p;
    public static final byte[] q;
    public static final int r;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public boolean f;
    public int h;
    public long i;
    public jp5 j;
    public rfg k;
    public h9e l;
    public boolean m;
    public final byte[] a = new byte[1];
    public int g = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        o = iArr;
        int i = xxg.a;
        Charset charset = mb2.c;
        p = "#!AMR\n".getBytes(charset);
        q = "#!AMR-WB\n".getBytes(charset);
        r = iArr[8];
    }

    public final int a(hp5 hp5Var) throws ParserException {
        boolean z;
        hp5Var.y();
        byte[] bArr = this.a;
        hp5Var.i(0, bArr, 1);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            StringBuilder sb = new StringBuilder(42);
            sb.append("Invalid padding bits for frame header ");
            sb.append((int) b);
            throw ParserException.a(null, sb.toString());
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.b) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? o[i] : n[i];
        }
        String str = this.b ? "WB" : "NB";
        StringBuilder sb2 = new StringBuilder(str.length() + 35);
        sb2.append("Illegal AMR ");
        sb2.append(str);
        sb2.append(" frame type ");
        sb2.append(i);
        throw ParserException.a(null, sb2.toString());
    }

    public final boolean b(hp5 hp5Var) {
        hp5Var.y();
        byte[] bArr = p;
        byte[] bArr2 = new byte[bArr.length];
        hp5Var.i(0, bArr2, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.b = false;
            hp5Var.z(bArr.length);
            return true;
        }
        hp5Var.y();
        byte[] bArr3 = q;
        byte[] bArr4 = new byte[bArr3.length];
        hp5Var.i(0, bArr4, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.b = true;
        hp5Var.z(bArr3.length);
        return true;
    }

    @Override // defpackage.fp5
    public final void d(long j, long j2) {
        this.c = 0L;
        this.d = 0;
        this.e = 0;
        if (j != 0) {
            h9e h9eVar = this.l;
            if (h9eVar instanceof zs3) {
                this.i = (Math.max(0L, j - ((zs3) h9eVar).b) * 8000000) / r0.e;
                return;
            }
        }
        this.i = 0L;
    }

    @Override // defpackage.fp5
    public final void g(jp5 jp5Var) {
        this.j = jp5Var;
        this.k = jp5Var.B(0, 1);
        jp5Var.w();
    }

    @Override // defpackage.fp5
    public final boolean h(hp5 hp5Var) {
        return b(hp5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    @Override // defpackage.fp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(defpackage.hp5 r10, defpackage.n7 r11) throws com.google.android.exoplayer2.ParserException {
        /*
            r9 = this;
            rfg r11 = r9.k
            defpackage.fsi.e(r11)
            int r11 = defpackage.xxg.a
            r11 = r10
            mm4 r11 = (defpackage.mm4) r11
            long r0 = r11.d
            r2 = 0
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 != 0) goto L21
            boolean r11 = r9.b(r10)
            if (r11 == 0) goto L19
            goto L21
        L19:
            java.lang.String r10 = "Could not find AMR header."
            r11 = 0
            com.google.android.exoplayer2.ParserException r10 = com.google.android.exoplayer2.ParserException.a(r11, r10)
            throw r10
        L21:
            boolean r11 = r9.m
            r0 = 1
            if (r11 != 0) goto L51
            r9.m = r0
            boolean r11 = r9.b
            if (r11 == 0) goto L2f
            java.lang.String r1 = "audio/amr-wb"
            goto L31
        L2f:
            java.lang.String r1 = "audio/3gpp"
        L31:
            if (r11 == 0) goto L36
            r11 = 16000(0x3e80, float:2.2421E-41)
            goto L38
        L36:
            r11 = 8000(0x1f40, float:1.121E-41)
        L38:
            rfg r2 = r9.k
            ef6 r3 = new ef6
            r3.<init>()
            r3.k = r1
            int r1 = defpackage.bd.r
            r3.l = r1
            r3.x = r0
            r3.y = r11
            gf6 r11 = new gf6
            r11.<init>(r3)
            r2.d(r11)
        L51:
            int r11 = r9.e
            r1 = -1
            if (r11 != 0) goto L72
            int r11 = r9.a(r10)     // Catch: java.io.EOFException -> L9c
            r9.d = r11     // Catch: java.io.EOFException -> L9c
            r9.e = r11
            int r2 = r9.g
            if (r2 != r1) goto L69
            r2 = r10
            mm4 r2 = (defpackage.mm4) r2
            long r2 = r2.d
            r9.g = r11
        L69:
            int r2 = r9.g
            if (r2 != r11) goto L72
            int r11 = r9.h
            int r11 = r11 + r0
            r9.h = r11
        L72:
            rfg r11 = r9.k
            int r2 = r9.e
            int r10 = r11.a(r10, r2, r0)
            if (r10 != r1) goto L7d
            goto L9c
        L7d:
            int r11 = r9.e
            int r11 = r11 - r10
            r9.e = r11
            r1 = 0
            if (r11 <= 0) goto L86
            goto L9c
        L86:
            rfg r2 = r9.k
            long r10 = r9.i
            long r3 = r9.c
            long r3 = r3 + r10
            int r6 = r9.d
            r7 = 0
            r8 = 0
            r5 = 1
            r2.b(r3, r5, r6, r7, r8)
            long r10 = r9.c
            r2 = 20000(0x4e20, double:9.8813E-320)
            long r10 = r10 + r2
            r9.c = r10
        L9c:
            boolean r10 = r9.f
            if (r10 == 0) goto La1
            goto Lb4
        La1:
            w16 r10 = new w16
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10.<init>(r2)
            r9.l = r10
            jp5 r11 = r9.j
            r11.N(r10)
            r9.f = r0
        Lb4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bd.i(hp5, n7):int");
    }

    @Override // defpackage.fp5
    public final void release() {
    }
}
