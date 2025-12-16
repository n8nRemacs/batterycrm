package com.google.android.exoplayer2.metadata.id3;

import com.adjust.sdk.Constants;
import com.google.android.exoplayer2.analytics.h;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.c;
import com.google.android.exoplayer2.metadata.f;
import com.google.android.exoplayer2.util.E;
import com.google.android.exoplayer2.util.F;
import com.google.android.exoplayer2.util.U;
import com.google.common.base.C37257c;
import j.P;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: Id3Decoder.java */
/* loaded from: classes6.dex */
public final class a extends f {

    /* renamed from: b, reason: collision with root package name */
    public static final h f345708b = new h(23);

    /* renamed from: a, reason: collision with root package name */
    @P
    public final InterfaceC10587a f345709a;

    /* compiled from: Id3Decoder.java */
    /* renamed from: com.google.android.exoplayer2.metadata.id3.a$a, reason: collision with other inner class name */
    public interface InterfaceC10587a {
        boolean a(int i12, int i13, int i14, int i15, int i16);
    }

    /* compiled from: Id3Decoder.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f345710a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f345711b;

        /* renamed from: c, reason: collision with root package name */
        public final int f345712c;

        public b(int i12, int i13, boolean z12) {
            this.f345710a = i12;
            this.f345711b = z12;
            this.f345712c = i13;
        }
    }

    public a() {
        this(null);
    }

    public static ApicFrame d(F f12, int i12, int i13) {
        int iU2;
        String strB;
        int iR2 = f12.r();
        String strR = r(iR2);
        int i14 = i12 - 1;
        byte[] bArr = new byte[i14];
        f12.c(0, i14, bArr);
        if (i13 == 2) {
            strB = "image/" + C37257c.b(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(strB)) {
                strB = "image/jpeg";
            }
            iU2 = 2;
        } else {
            iU2 = u(0, bArr);
            strB = C37257c.b(new String(bArr, 0, iU2, "ISO-8859-1"));
            if (strB.indexOf(47) == -1) {
                strB = "image/".concat(strB);
            }
        }
        int i15 = bArr[iU2 + 1] & 255;
        int i16 = iU2 + 2;
        int iT2 = t(i16, iR2, bArr);
        String str = new String(bArr, i16, iT2 - i16, strR);
        int iQ2 = q(iR2) + iT2;
        return new ApicFrame(strB, str, i15, i14 <= iQ2 ? U.f348110e : Arrays.copyOfRange(bArr, iQ2, i14));
    }

    public static ChapterFrame e(F f12, int i12, int i13, boolean z12, int i14, @P InterfaceC10587a interfaceC10587a) {
        int i15 = f12.f348071b;
        int iU2 = u(i15, f12.f348070a);
        String str = new String(f12.f348070a, i15, iU2 - i15, "ISO-8859-1");
        f12.B(iU2 + 1);
        int iD2 = f12.d();
        int iD3 = f12.d();
        long jS2 = f12.s();
        long j12 = jS2 == 4294967295L ? -1L : jS2;
        long jS3 = f12.s();
        long j13 = jS3 == 4294967295L ? -1L : jS3;
        ArrayList arrayList = new ArrayList();
        int i16 = i15 + i12;
        while (f12.f348071b < i16) {
            Id3Frame id3FrameH = h(i13, f12, z12, i14, interfaceC10587a);
            if (id3FrameH != null) {
                arrayList.add(id3FrameH);
            }
        }
        return new ChapterFrame(str, iD2, iD3, j12, j13, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static ChapterTocFrame f(F f12, int i12, int i13, boolean z12, int i14, @P InterfaceC10587a interfaceC10587a) {
        int i15 = f12.f348071b;
        int iU2 = u(i15, f12.f348070a);
        String str = new String(f12.f348070a, i15, iU2 - i15, "ISO-8859-1");
        f12.B(iU2 + 1);
        int iR2 = f12.r();
        boolean z13 = (iR2 & 2) != 0;
        boolean z14 = (iR2 & 1) != 0;
        int iR3 = f12.r();
        String[] strArr = new String[iR3];
        for (int i16 = 0; i16 < iR3; i16++) {
            int i17 = f12.f348071b;
            int iU3 = u(i17, f12.f348070a);
            strArr[i16] = new String(f12.f348070a, i17, iU3 - i17, "ISO-8859-1");
            f12.B(iU3 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i18 = i15 + i12;
        while (f12.f348071b < i18) {
            Id3Frame id3FrameH = h(i13, f12, z12, i14, interfaceC10587a);
            if (id3FrameH != null) {
                arrayList.add(id3FrameH);
            }
        }
        return new ChapterTocFrame(str, z13, z14, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    @P
    public static CommentFrame g(int i12, F f12) {
        if (i12 < 4) {
            return null;
        }
        int iR2 = f12.r();
        String strR = r(iR2);
        byte[] bArr = new byte[3];
        f12.c(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i13 = i12 - 4;
        byte[] bArr2 = new byte[i13];
        f12.c(0, i13, bArr2);
        int iT2 = t(0, iR2, bArr2);
        String str2 = new String(bArr2, 0, iT2, strR);
        int iQ2 = q(iR2) + iT2;
        return new CommentFrame(str, str2, l(iQ2, t(iQ2, iR2, bArr2), strR, bArr2));
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c7 A[Catch: all -> 0x0101, UnsupportedEncodingException -> 0x01e4, TryCatch #2 {UnsupportedEncodingException -> 0x01e4, all -> 0x0101, blocks: (B:91:0x00fb, B:159:0x01d9, B:95:0x0106, B:102:0x011c, B:104:0x0124, B:112:0x013e, B:121:0x0156, B:132:0x0171, B:139:0x0183, B:145:0x0192, B:150:0x01a9, B:156:0x01c2, B:157:0x01c7), top: B:168:0x00f1 }] */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.metadata.id3.Id3Frame h(int r17, com.google.android.exoplayer2.util.F r18, boolean r19, int r20, @j.P com.google.android.exoplayer2.metadata.id3.a.InterfaceC10587a r21) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.a.h(int, com.google.android.exoplayer2.util.F, boolean, int, com.google.android.exoplayer2.metadata.id3.a$a):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    public static GeobFrame i(int i12, F f12) {
        int iR2 = f12.r();
        String strR = r(iR2);
        int i13 = i12 - 1;
        byte[] bArr = new byte[i13];
        f12.c(0, i13, bArr);
        int iU2 = u(0, bArr);
        String str = new String(bArr, 0, iU2, "ISO-8859-1");
        int i14 = iU2 + 1;
        int iT2 = t(i14, iR2, bArr);
        String strL = l(i14, iT2, strR, bArr);
        int iQ2 = q(iR2) + iT2;
        int iT3 = t(iQ2, iR2, bArr);
        String strL2 = l(iQ2, iT3, strR, bArr);
        int iQ3 = q(iR2) + iT3;
        return new GeobFrame(str, strL, strL2, i13 <= iQ3 ? U.f348110e : Arrays.copyOfRange(bArr, iQ3, i13));
    }

    public static MlltFrame j(int i12, F f12) {
        int iW2 = f12.w();
        int iT2 = f12.t();
        int iT3 = f12.t();
        int iR2 = f12.r();
        int iR3 = f12.r();
        E e12 = new E();
        e12.j(f12.f348072c, f12.f348070a);
        e12.k(f12.f348071b * 8);
        int i13 = ((i12 - 10) * 8) / (iR2 + iR3);
        int[] iArr = new int[i13];
        int[] iArr2 = new int[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            int iG2 = e12.g(iR2);
            int iG3 = e12.g(iR3);
            iArr[i14] = iG2;
            iArr2[i14] = iG3;
        }
        return new MlltFrame(iW2, iT2, iT3, iArr, iArr2);
    }

    public static PrivFrame k(int i12, F f12) {
        byte[] bArr = new byte[i12];
        f12.c(0, i12, bArr);
        int iU2 = u(0, bArr);
        String str = new String(bArr, 0, iU2, "ISO-8859-1");
        int i13 = iU2 + 1;
        return new PrivFrame(str, i12 <= i13 ? U.f348110e : Arrays.copyOfRange(bArr, i13, i12));
    }

    public static String l(int i12, int i13, String str, byte[] bArr) {
        return (i13 <= i12 || i13 > bArr.length) ? "" : new String(bArr, i12, i13 - i12, str);
    }

    @P
    public static TextInformationFrame m(int i12, F f12, String str) {
        if (i12 < 1) {
            return null;
        }
        int iR2 = f12.r();
        String strR = r(iR2);
        int i13 = i12 - 1;
        byte[] bArr = new byte[i13];
        f12.c(0, i13, bArr);
        return new TextInformationFrame(str, null, new String(bArr, 0, t(0, iR2, bArr), strR));
    }

    @P
    public static TextInformationFrame n(int i12, F f12) {
        if (i12 < 1) {
            return null;
        }
        int iR2 = f12.r();
        String strR = r(iR2);
        int i13 = i12 - 1;
        byte[] bArr = new byte[i13];
        f12.c(0, i13, bArr);
        int iT2 = t(0, iR2, bArr);
        String str = new String(bArr, 0, iT2, strR);
        int iQ2 = q(iR2) + iT2;
        return new TextInformationFrame("TXXX", str, l(iQ2, t(iQ2, iR2, bArr), strR, bArr));
    }

    public static UrlLinkFrame o(int i12, F f12, String str) {
        byte[] bArr = new byte[i12];
        f12.c(0, i12, bArr);
        return new UrlLinkFrame(str, null, new String(bArr, 0, u(0, bArr), "ISO-8859-1"));
    }

    @P
    public static UrlLinkFrame p(int i12, F f12) {
        if (i12 < 1) {
            return null;
        }
        int iR2 = f12.r();
        String strR = r(iR2);
        int i13 = i12 - 1;
        byte[] bArr = new byte[i13];
        f12.c(0, i13, bArr);
        int iT2 = t(0, iR2, bArr);
        String str = new String(bArr, 0, iT2, strR);
        int iQ2 = q(iR2) + iT2;
        return new UrlLinkFrame("WXXX", str, l(iQ2, u(iQ2, bArr), "ISO-8859-1", bArr));
    }

    public static int q(int i12) {
        return (i12 == 0 || i12 == 3) ? 1 : 2;
    }

    public static String r(int i12) {
        return i12 != 1 ? i12 != 2 ? i12 != 3 ? "ISO-8859-1" : Constants.ENCODING : "UTF-16BE" : "UTF-16";
    }

    public static String s(int i12, int i13, int i14, int i15, int i16) {
        return i12 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16));
    }

    public static int t(int i12, int i13, byte[] bArr) {
        int iU2 = u(i12, bArr);
        if (i13 == 0 || i13 == 3) {
            return iU2;
        }
        while (iU2 < bArr.length - 1) {
            if ((iU2 - i12) % 2 == 0 && bArr[iU2 + 1] == 0) {
                return iU2;
            }
            iU2 = u(iU2 + 1, bArr);
        }
        return bArr.length;
    }

    public static int u(int i12, byte[] bArr) {
        while (i12 < bArr.length) {
            if (bArr[i12] == 0) {
                return i12;
            }
            i12++;
        }
        return bArr.length;
    }

    public static int v(int i12, F f12) {
        byte[] bArr = f12.f348070a;
        int i13 = f12.f348071b;
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
    public static boolean w(com.google.android.exoplayer2.util.F r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f348071b
        L6:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r18.d()     // Catch: java.lang.Throwable -> L20
            long r8 = r18.s()     // Catch: java.lang.Throwable -> L20
            int r10 = r18.w()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r18.t()     // Catch: java.lang.Throwable -> L20
            int r8 = r18.t()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.B(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.B(r2)
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
            r1.B(r2)
            return r6
        L99:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.B(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.C(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.B(r2)
            return r4
        Lb0:
            r1.B(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.a.w(com.google.android.exoplayer2.util.F, int, int, boolean):boolean");
    }

    @Override // com.google.android.exoplayer2.metadata.f
    @P
    public final Metadata b(c cVar, ByteBuffer byteBuffer) {
        return c(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.exoplayer2.metadata.Metadata c(int r12, byte[] r13) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.exoplayer2.util.F r1 = new com.google.android.exoplayer2.util.F
            r1.<init>(r13, r12)
            int r12 = r1.a()
            r13 = 4
            r2 = 2
            r3 = 10
            r4 = 0
            r5 = 1
            r6 = 0
            if (r12 >= r3) goto L19
        L17:
            r9 = r6
            goto L7b
        L19:
            int r12 = r1.t()
            r7 = 4801587(0x494433, float:6.728456E-39)
            if (r12 == r7) goto L30
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r7 = "%06X"
            java.lang.String.format(r7, r12)
            goto L17
        L30:
            int r12 = r1.r()
            r1.C(r5)
            int r7 = r1.r()
            int r8 = r1.q()
            if (r12 != r2) goto L46
            r9 = r7 & 64
            if (r9 == 0) goto L6d
            goto L17
        L46:
            r9 = 3
            if (r12 != r9) goto L57
            r9 = r7 & 64
            if (r9 == 0) goto L6d
            int r9 = r1.d()
            r1.C(r9)
            int r9 = r9 + r13
            int r8 = r8 - r9
            goto L6d
        L57:
            if (r12 != r13) goto L17
            r9 = r7 & 64
            if (r9 == 0) goto L67
            int r9 = r1.q()
            int r10 = r9 + (-4)
            r1.C(r10)
            int r8 = r8 - r9
        L67:
            r9 = r7 & 16
            if (r9 == 0) goto L6d
            int r8 = r8 + (-10)
        L6d:
            if (r12 >= r13) goto L75
            r7 = r7 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L75
            r7 = r5
            goto L76
        L75:
            r7 = r4
        L76:
            com.google.android.exoplayer2.metadata.id3.a$b r9 = new com.google.android.exoplayer2.metadata.id3.a$b
            r9.<init>(r12, r8, r7)
        L7b:
            if (r9 != 0) goto L7e
            return r6
        L7e:
            int r12 = r1.f348071b
            int r7 = r9.f345710a
            if (r7 != r2) goto L85
            r3 = 6
        L85:
            boolean r2 = r9.f345711b
            int r8 = r9.f345712c
            if (r2 == 0) goto L8f
            int r8 = v(r8, r1)
        L8f:
            int r12 = r12 + r8
            r1.A(r12)
            boolean r12 = w(r1, r7, r3, r4)
            if (r12 != 0) goto La4
            if (r7 != r13) goto La3
            boolean r12 = w(r1, r13, r3, r5)
            if (r12 == 0) goto La3
            r4 = r5
            goto La4
        La3:
            return r6
        La4:
            int r12 = r1.a()
            if (r12 < r3) goto Lb6
            com.google.android.exoplayer2.metadata.id3.a$a r12 = r11.f345709a
            com.google.android.exoplayer2.metadata.id3.Id3Frame r12 = h(r7, r1, r4, r3, r12)
            if (r12 == 0) goto La4
            r0.add(r12)
            goto La4
        Lb6:
            com.google.android.exoplayer2.metadata.Metadata r12 = new com.google.android.exoplayer2.metadata.Metadata
            r12.<init>(r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.a.c(int, byte[]):com.google.android.exoplayer2.metadata.Metadata");
    }

    public a(@P InterfaceC10587a interfaceC10587a) {
        this.f345709a = interfaceC10587a;
    }
}
