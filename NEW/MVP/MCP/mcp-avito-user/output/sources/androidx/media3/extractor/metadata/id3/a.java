package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.common.util.y;
import androidx.media3.common.util.z;
import androidx.media3.exoplayer.analytics.m;
import androidx.media3.extractor.metadata.c;
import com.google.common.base.C37257c;
import com.google.common.base.C37262f;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.O4;
import j.P;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: Id3Decoder.java */
@J
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: b, reason: collision with root package name */
    public static final m f50694b = new m(10);

    /* renamed from: a, reason: collision with root package name */
    @P
    public final InterfaceC1853a f50695a;

    /* compiled from: Id3Decoder.java */
    /* renamed from: androidx.media3.extractor.metadata.id3.a$a, reason: collision with other inner class name */
    public interface InterfaceC1853a {
        boolean a(int i12, int i13, int i14, int i15, int i16);
    }

    /* compiled from: Id3Decoder.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f50696a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f50697b;

        /* renamed from: c, reason: collision with root package name */
        public final int f50698c;

        public b(int i12, int i13, boolean z12) {
            this.f50696a = i12;
            this.f50697b = z12;
            this.f50698c = i13;
        }
    }

    public a() {
        this(null);
    }

    public static ApicFrame d(z zVar, int i12, int i13) {
        int iQ2;
        String strConcat;
        int iU2 = zVar.u();
        Charset charsetN = n(iU2);
        int i14 = i12 - 1;
        byte[] bArr = new byte[i14];
        zVar.e(0, i14, bArr);
        if (i13 == 2) {
            strConcat = "image/" + C37257c.b(new String(bArr, 0, 3, C37262f.f359033b));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iQ2 = 2;
        } else {
            iQ2 = q(0, bArr);
            String strB = C37257c.b(new String(bArr, 0, iQ2, C37262f.f359033b));
            strConcat = strB.indexOf(47) == -1 ? "image/".concat(strB) : strB;
        }
        int i15 = bArr[iQ2 + 1] & 255;
        int i16 = iQ2 + 2;
        int iP2 = p(i16, iU2, bArr);
        String str = new String(bArr, i16, iP2 - i16, charsetN);
        int iM2 = m(iU2) + iP2;
        return new ApicFrame(strConcat, str, i15, i14 <= iM2 ? M.f47891e : Arrays.copyOfRange(bArr, iM2, i14));
    }

    public static ChapterFrame e(z zVar, int i12, int i13, boolean z12, int i14, @P InterfaceC1853a interfaceC1853a) {
        int i15 = zVar.f47963b;
        int iQ2 = q(i15, zVar.f47962a);
        String str = new String(zVar.f47962a, i15, iQ2 - i15, C37262f.f359033b);
        zVar.F(iQ2 + 1);
        int iG2 = zVar.g();
        int iG3 = zVar.g();
        long jV2 = zVar.v();
        long j12 = jV2 == 4294967295L ? -1L : jV2;
        long jV3 = zVar.v();
        long j13 = jV3 == 4294967295L ? -1L : jV3;
        ArrayList arrayList = new ArrayList();
        int i16 = i15 + i12;
        while (zVar.f47963b < i16) {
            Id3Frame id3FrameH = h(i13, zVar, z12, i14, interfaceC1853a);
            if (id3FrameH != null) {
                arrayList.add(id3FrameH);
            }
        }
        return new ChapterFrame(str, iG2, iG3, j12, j13, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static ChapterTocFrame f(z zVar, int i12, int i13, boolean z12, int i14, @P InterfaceC1853a interfaceC1853a) {
        int i15 = zVar.f47963b;
        int iQ2 = q(i15, zVar.f47962a);
        String str = new String(zVar.f47962a, i15, iQ2 - i15, C37262f.f359033b);
        zVar.F(iQ2 + 1);
        int iU2 = zVar.u();
        boolean z13 = (iU2 & 2) != 0;
        boolean z14 = (iU2 & 1) != 0;
        int iU3 = zVar.u();
        String[] strArr = new String[iU3];
        for (int i16 = 0; i16 < iU3; i16++) {
            int i17 = zVar.f47963b;
            int iQ3 = q(i17, zVar.f47962a);
            strArr[i16] = new String(zVar.f47962a, i17, iQ3 - i17, C37262f.f359033b);
            zVar.F(iQ3 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i18 = i15 + i12;
        while (zVar.f47963b < i18) {
            Id3Frame id3FrameH = h(i13, zVar, z12, i14, interfaceC1853a);
            if (id3FrameH != null) {
                arrayList.add(id3FrameH);
            }
        }
        return new ChapterTocFrame(str, z13, z14, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    @P
    public static CommentFrame g(int i12, z zVar) {
        if (i12 < 4) {
            return null;
        }
        int iU2 = zVar.u();
        Charset charsetN = n(iU2);
        byte[] bArr = new byte[3];
        zVar.e(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i13 = i12 - 4;
        byte[] bArr2 = new byte[i13];
        zVar.e(0, i13, bArr2);
        int iP2 = p(0, iU2, bArr2);
        String str2 = new String(bArr2, 0, iP2, charsetN);
        int iM2 = m(iU2) + iP2;
        return new CommentFrame(str, str2, k(bArr2, iM2, p(iM2, iU2, bArr2), charsetN));
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0271 A[Catch: all -> 0x015c, TryCatch #0 {all -> 0x015c, blocks: (B:173:0x0282, B:95:0x0113, B:97:0x013f, B:100:0x0146, B:111:0x016e, B:113:0x019f, B:122:0x01cc, B:124:0x01e0, B:126:0x01e7, B:125:0x01e3, B:135:0x0200, B:146:0x021b, B:153:0x022d, B:159:0x023c, B:164:0x0253, B:170:0x026c, B:171:0x0271), top: B:180:0x0104 }] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [androidx.media3.extractor.metadata.id3.Id3Frame, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v4 */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.extractor.metadata.id3.Id3Frame h(int r18, androidx.media3.common.util.z r19, boolean r20, int r21, @j.P androidx.media3.extractor.metadata.id3.a.InterfaceC1853a r22) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.id3.a.h(int, androidx.media3.common.util.z, boolean, int, androidx.media3.extractor.metadata.id3.a$a):androidx.media3.extractor.metadata.id3.Id3Frame");
    }

    public static GeobFrame i(int i12, z zVar) {
        int iU2 = zVar.u();
        Charset charsetN = n(iU2);
        int i13 = i12 - 1;
        byte[] bArr = new byte[i13];
        zVar.e(0, i13, bArr);
        int iQ2 = q(0, bArr);
        String str = new String(bArr, 0, iQ2, C37262f.f359033b);
        int i14 = iQ2 + 1;
        int iP2 = p(i14, iU2, bArr);
        String strK = k(bArr, i14, iP2, charsetN);
        int iM2 = m(iU2) + iP2;
        int iP3 = p(iM2, iU2, bArr);
        String strK2 = k(bArr, iM2, iP3, charsetN);
        int iM3 = m(iU2) + iP3;
        return new GeobFrame(str, strK, strK2, i13 <= iM3 ? M.f47891e : Arrays.copyOfRange(bArr, iM3, i13));
    }

    public static MlltFrame j(int i12, z zVar) {
        int iZ2 = zVar.z();
        int iW2 = zVar.w();
        int iW3 = zVar.w();
        int iU2 = zVar.u();
        int iU3 = zVar.u();
        y yVar = new y();
        yVar.k(zVar);
        int i13 = ((i12 - 10) * 8) / (iU2 + iU3);
        int[] iArr = new int[i13];
        int[] iArr2 = new int[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            int iG2 = yVar.g(iU2);
            int iG3 = yVar.g(iU3);
            iArr[i14] = iG2;
            iArr2[i14] = iG3;
        }
        return new MlltFrame(iZ2, iW2, iW3, iArr, iArr2);
    }

    public static String k(byte[] bArr, int i12, int i13, Charset charset) {
        return (i13 <= i12 || i13 > bArr.length) ? "" : new String(bArr, i12, i13 - i12, charset);
    }

    public static AbstractC37401r1 l(int i12, int i13, byte[] bArr) {
        if (i13 >= bArr.length) {
            return AbstractC37401r1.E("");
        }
        O4<Object> o42 = AbstractC37401r1.f359977c;
        AbstractC37401r1.a aVar = new AbstractC37401r1.a();
        int iP2 = p(i13, i12, bArr);
        while (i13 < iP2) {
            aVar.g(new String(bArr, i13, iP2 - i13, n(i12)));
            i13 = m(i12) + iP2;
            iP2 = p(i13, i12, bArr);
        }
        AbstractC37401r1 abstractC37401r1I = aVar.i();
        return abstractC37401r1I.isEmpty() ? AbstractC37401r1.E("") : abstractC37401r1I;
    }

    public static int m(int i12) {
        return (i12 == 0 || i12 == 3) ? 1 : 2;
    }

    public static Charset n(int i12) {
        return i12 != 1 ? i12 != 2 ? i12 != 3 ? C37262f.f359033b : C37262f.f359034c : C37262f.f359035d : C37262f.f359037f;
    }

    public static String o(int i12, int i13, int i14, int i15, int i16) {
        return i12 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16));
    }

    public static int p(int i12, int i13, byte[] bArr) {
        int iQ2 = q(i12, bArr);
        if (i13 == 0 || i13 == 3) {
            return iQ2;
        }
        while (iQ2 < bArr.length - 1) {
            if ((iQ2 - i12) % 2 == 0 && bArr[iQ2 + 1] == 0) {
                return iQ2;
            }
            iQ2 = q(iQ2 + 1, bArr);
        }
        return bArr.length;
    }

    public static int q(int i12, byte[] bArr) {
        while (i12 < bArr.length) {
            if (bArr[i12] == 0) {
                return i12;
            }
            i12++;
        }
        return bArr.length;
    }

    public static int r(int i12, z zVar) {
        byte[] bArr = zVar.f47962a;
        int i13 = zVar.f47963b;
        int i14 = i13;
        while (true) {
            int i15 = i14 + 1;
            if (i15 >= i13 + i12) {
                return i12;
            }
            if ((bArr[i14] & 255) == 255 && bArr[i15] == 0) {
                System.arraycopy(bArr, i14 + 2, bArr, i15, (i12 - (i14 - i13)) - 2);
                i12--;
            }
            i14 = i15;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[PHI: r3
  0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean s(androidx.media3.common.util.z r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f47963b
        L6:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r18.g()     // Catch: java.lang.Throwable -> L20
            long r8 = r18.v()     // Catch: java.lang.Throwable -> L20
            int r10 = r18.z()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r18.w()     // Catch: java.lang.Throwable -> L20
            int r8 = r18.w()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.F(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.F(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.F(r2)
            return r6
        L99:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.F(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.G(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.F(r2)
            return r4
        Lb0:
            r1.F(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.id3.a.s(androidx.media3.common.util.z, int, int, boolean):boolean");
    }

    @Override // androidx.media3.extractor.metadata.c
    @P
    public final Metadata b(androidx.media3.extractor.metadata.b bVar, ByteBuffer byteBuffer) {
        return c(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.media3.common.Metadata c(int r12, byte[] r13) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.media3.common.util.z r1 = new androidx.media3.common.util.z
            r1.<init>(r13, r12)
            int r12 = r1.a()
            r13 = 4
            r2 = 2
            r3 = 10
            r4 = 0
            r5 = 1
            r6 = 0
            if (r12 >= r3) goto L1d
            androidx.media3.common.util.s.g()
        L1a:
            r9 = r6
            goto L90
        L1d:
            int r12 = r1.w()
            r7 = 4801587(0x494433, float:6.728456E-39)
            if (r12 == r7) goto L3d
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r7 = "%06X"
            java.lang.String r12 = java.lang.String.format(r7, r12)
            java.lang.String r7 = "Unexpected first three bytes of ID3 tag header: 0x"
            r7.concat(r12)
            androidx.media3.common.util.s.g()
            goto L1a
        L3d:
            int r12 = r1.u()
            r1.G(r5)
            int r7 = r1.u()
            int r8 = r1.t()
            if (r12 != r2) goto L56
            r9 = r7 & 64
            if (r9 == 0) goto L7d
            androidx.media3.common.util.s.g()
            goto L1a
        L56:
            r9 = 3
            if (r12 != r9) goto L67
            r9 = r7 & 64
            if (r9 == 0) goto L7d
            int r9 = r1.g()
            r1.G(r9)
            int r9 = r9 + r13
            int r8 = r8 - r9
            goto L7d
        L67:
            if (r12 != r13) goto L8c
            r9 = r7 & 64
            if (r9 == 0) goto L77
            int r9 = r1.t()
            int r10 = r9 + (-4)
            r1.G(r10)
            int r8 = r8 - r9
        L77:
            r9 = r7 & 16
            if (r9 == 0) goto L7d
            int r8 = r8 + (-10)
        L7d:
            if (r12 >= r13) goto L85
            r7 = r7 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L85
            r7 = r5
            goto L86
        L85:
            r7 = r4
        L86:
            androidx.media3.extractor.metadata.id3.a$b r9 = new androidx.media3.extractor.metadata.id3.a$b
            r9.<init>(r12, r8, r7)
            goto L90
        L8c:
            androidx.media3.common.util.s.g()
            goto L1a
        L90:
            if (r9 != 0) goto L93
            return r6
        L93:
            int r12 = r1.f47963b
            int r7 = r9.f50696a
            if (r7 != r2) goto L9a
            r3 = 6
        L9a:
            boolean r2 = r9.f50697b
            int r8 = r9.f50698c
            if (r2 == 0) goto La4
            int r8 = r(r8, r1)
        La4:
            int r12 = r12 + r8
            r1.E(r12)
            boolean r12 = s(r1, r7, r3, r4)
            if (r12 != 0) goto Lbc
            if (r7 != r13) goto Lb8
            boolean r12 = s(r1, r13, r3, r5)
            if (r12 == 0) goto Lb8
            r4 = r5
            goto Lbc
        Lb8:
            androidx.media3.common.util.s.g()
            return r6
        Lbc:
            int r12 = r1.a()
            if (r12 < r3) goto Lce
            androidx.media3.extractor.metadata.id3.a$a r12 = r11.f50695a
            androidx.media3.extractor.metadata.id3.Id3Frame r12 = h(r7, r1, r4, r3, r12)
            if (r12 == 0) goto Lbc
            r0.add(r12)
            goto Lbc
        Lce:
            androidx.media3.common.Metadata r12 = new androidx.media3.common.Metadata
            r12.<init>(r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.id3.a.c(int, byte[]):androidx.media3.common.Metadata");
    }

    public a(@P InterfaceC1853a interfaceC1853a) {
        this.f50695a = interfaceC1853a;
    }
}
