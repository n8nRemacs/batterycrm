package com.google.android.exoplayer2.extractor.amr;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.A;
import com.google.android.exoplayer2.extractor.C36515e;
import com.google.android.exoplayer2.extractor.f;
import com.google.android.exoplayer2.extractor.j;
import com.google.android.exoplayer2.extractor.k;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.util.U;
import com.google.common.base.C37262f;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: AmrExtractor.java */
/* loaded from: classes6.dex */
public final class a implements j {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f344418n = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f344419o;

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f344420p;

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f344421q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f344422r;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f344423a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f344424b;

    /* renamed from: c, reason: collision with root package name */
    public long f344425c;

    /* renamed from: d, reason: collision with root package name */
    public int f344426d;

    /* renamed from: e, reason: collision with root package name */
    public int f344427e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f344428f;

    /* renamed from: g, reason: collision with root package name */
    public int f344429g;

    /* renamed from: h, reason: collision with root package name */
    public int f344430h;

    /* renamed from: i, reason: collision with root package name */
    public long f344431i;

    /* renamed from: j, reason: collision with root package name */
    public l f344432j;

    /* renamed from: k, reason: collision with root package name */
    public A f344433k;

    /* renamed from: l, reason: collision with root package name */
    public y f344434l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f344435m;

    /* compiled from: AmrExtractor.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.extractor.amr.a$a, reason: collision with other inner class name */
    public @interface InterfaceC10575a {
    }

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f344419o = iArr;
        int i12 = U.f348106a;
        Charset charset = C37262f.f359034c;
        f344420p = "#!AMR\n".getBytes(charset);
        f344421q = "#!AMR-WB\n".getBytes(charset);
        f344422r = iArr[8];
    }

    public a() {
        this(0);
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void a(long j12, long j13) {
        this.f344425c = 0L;
        this.f344426d = 0;
        this.f344427e = 0;
        if (j12 != 0) {
            y yVar = this.f344434l;
            if (yVar instanceof C36515e) {
                this.f344431i = (Math.max(0L, j12 - ((C36515e) yVar).f344486b) * 8000000) / r0.f344489e;
                return;
            }
        }
        this.f344431i = 0L;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void b(l lVar) {
        this.f344432j = lVar;
        this.f344433k = lVar.c(0, 1);
        lVar.b();
    }

    public final int c(f fVar) throws ParserException {
        boolean z12;
        fVar.f344497f = 0;
        byte[] bArr = this.f344423a;
        fVar.a(bArr, 0, 1, false);
        byte b12 = bArr[0];
        if ((b12 & 131) > 0) {
            throw ParserException.a("Invalid padding bits for frame header " + ((int) b12), null);
        }
        int i12 = (b12 >> 3) & 15;
        if (i12 >= 0 && i12 <= 15 && (((z12 = this.f344424b) && (i12 < 10 || i12 > 13)) || (!z12 && (i12 < 12 || i12 > 14)))) {
            return z12 ? f344419o[i12] : f344418n[i12];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f344424b ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i12);
        throw ParserException.a(sb2.toString(), null);
    }

    public final boolean d(f fVar) throws EOFException, InterruptedIOException {
        fVar.f344497f = 0;
        byte[] bArr = f344420p;
        byte[] bArr2 = new byte[bArr.length];
        fVar.a(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f344424b = false;
            fVar.i(bArr.length);
            return true;
        }
        fVar.f344497f = 0;
        byte[] bArr3 = f344421q;
        byte[] bArr4 = new byte[bArr3.length];
        fVar.a(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f344424b = true;
        fVar.i(bArr3.length);
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final boolean h(k kVar) {
        return d((f) kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    @Override // com.google.android.exoplayer2.extractor.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(com.google.android.exoplayer2.extractor.k r10, com.google.android.exoplayer2.extractor.w r11) throws com.google.android.exoplayer2.ParserException {
        /*
            r9 = this;
            com.google.android.exoplayer2.extractor.A r11 = r9.f344433k
            com.google.android.exoplayer2.util.C36585a.e(r11)
            int r11 = com.google.android.exoplayer2.util.U.f348106a
            r11 = r10
            com.google.android.exoplayer2.extractor.f r11 = (com.google.android.exoplayer2.extractor.f) r11
            long r0 = r11.f344495d
            r2 = 0
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 != 0) goto L24
            r11 = r10
            com.google.android.exoplayer2.extractor.f r11 = (com.google.android.exoplayer2.extractor.f) r11
            boolean r11 = r9.d(r11)
            if (r11 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r10 = "Could not find AMR header."
            r11 = 0
            com.google.android.exoplayer2.ParserException r10 = com.google.android.exoplayer2.ParserException.a(r10, r11)
            throw r10
        L24:
            boolean r11 = r9.f344435m
            r0 = 1
            if (r11 != 0) goto L53
            r9.f344435m = r0
            boolean r11 = r9.f344424b
            if (r11 == 0) goto L32
            java.lang.String r1 = "audio/amr-wb"
            goto L34
        L32:
            java.lang.String r1 = "audio/3gpp"
        L34:
            if (r11 == 0) goto L39
            r11 = 16000(0x3e80, float:2.2421E-41)
            goto L3b
        L39:
            r11 = 8000(0x1f40, float:1.121E-41)
        L3b:
            com.google.android.exoplayer2.extractor.A r2 = r9.f344433k
            com.google.android.exoplayer2.I$b r3 = new com.google.android.exoplayer2.I$b
            r3.<init>()
            r3.f343504k = r1
            int r1 = com.google.android.exoplayer2.extractor.amr.a.f344422r
            r3.f343505l = r1
            r3.f343517x = r0
            r3.f343518y = r11
            com.google.android.exoplayer2.I r11 = r3.a()
            r2.a(r11)
        L53:
            int r11 = r9.f344427e
            r1 = -1
            if (r11 != 0) goto L77
            r11 = r10
            com.google.android.exoplayer2.extractor.f r11 = (com.google.android.exoplayer2.extractor.f) r11     // Catch: java.io.EOFException -> La1
            int r11 = r9.c(r11)     // Catch: java.io.EOFException -> La1
            r9.f344426d = r11     // Catch: java.io.EOFException -> La1
            r9.f344427e = r11
            int r2 = r9.f344429g
            if (r2 != r1) goto L6e
            r2 = r10
            com.google.android.exoplayer2.extractor.f r2 = (com.google.android.exoplayer2.extractor.f) r2
            long r2 = r2.f344495d
            r9.f344429g = r11
        L6e:
            int r2 = r9.f344429g
            if (r2 != r11) goto L77
            int r11 = r9.f344430h
            int r11 = r11 + r0
            r9.f344430h = r11
        L77:
            com.google.android.exoplayer2.extractor.A r11 = r9.f344433k
            int r2 = r9.f344427e
            int r10 = r11.b(r10, r2, r0)
            if (r10 != r1) goto L82
            goto La1
        L82:
            int r11 = r9.f344427e
            int r11 = r11 - r10
            r9.f344427e = r11
            r1 = 0
            if (r11 <= 0) goto L8b
            goto La1
        L8b:
            com.google.android.exoplayer2.extractor.A r2 = r9.f344433k
            long r10 = r9.f344431i
            long r3 = r9.f344425c
            long r3 = r3 + r10
            int r6 = r9.f344426d
            r5 = 1
            r7 = 0
            r8 = 0
            r2.f(r3, r5, r6, r7, r8)
            long r10 = r9.f344425c
            r2 = 20000(0x4e20, double:9.8813E-320)
            long r10 = r10 + r2
            r9.f344425c = r10
        La1:
            boolean r10 = r9.f344428f
            if (r10 == 0) goto La6
            goto Lb9
        La6:
            com.google.android.exoplayer2.extractor.y$b r10 = new com.google.android.exoplayer2.extractor.y$b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10.<init>(r2)
            r9.f344434l = r10
            com.google.android.exoplayer2.extractor.l r11 = r9.f344432j
            r11.i(r10)
            r9.f344428f = r0
        Lb9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.amr.a.i(com.google.android.exoplayer2.extractor.k, com.google.android.exoplayer2.extractor.w):int");
    }

    public a(int i12) {
        this.f344423a = new byte[1];
        this.f344429g = -1;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void release() {
    }
}
