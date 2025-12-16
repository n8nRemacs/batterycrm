package com.yandex.mobile.ads.impl;

import com.adjust.sdk.Constants;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.id3.ApicFrame;
import com.yandex.mobile.ads.exo.metadata.id3.ChapterFrame;
import com.yandex.mobile.ads.exo.metadata.id3.ChapterTocFrame;
import com.yandex.mobile.ads.exo.metadata.id3.CommentFrame;
import com.yandex.mobile.ads.exo.metadata.id3.GeobFrame;
import com.yandex.mobile.ads.exo.metadata.id3.Id3Frame;
import com.yandex.mobile.ads.exo.metadata.id3.MlltFrame;
import com.yandex.mobile.ads.exo.metadata.id3.PrivFrame;
import com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame;
import com.yandex.mobile.ads.exo.metadata.id3.UrlLinkFrame;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class c20 extends b41 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f384158b = new L0(8);

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final a f384159a;

    public interface a {
        boolean a(int i12, int i13, int i14, int i15, int i16);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f384160a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f384161b;

        /* renamed from: c, reason: collision with root package name */
        private final int f384162c;

        public b(int i12, int i13, boolean z12) {
            this.f384160a = i12;
            this.f384161b = z12;
            this.f384162c = i13;
        }
    }

    public c20(@j.P a aVar) {
        this.f384159a = aVar;
    }

    private static int a(int i12) {
        return (i12 == 0 || i12 == 3) ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean b(int i12, int i13, int i14, int i15, int i16) {
        return false;
    }

    private static PrivFrame d(int i12, pr0 pr0Var) {
        byte[] bArr = new byte[i12];
        pr0Var.a(bArr, 0, i12);
        int iB2 = b(0, bArr);
        String str = new String(bArr, 0, iB2, "ISO-8859-1");
        int i13 = iB2 + 1;
        return new PrivFrame(str, i12 <= i13 ? pc1.f388773f : Arrays.copyOfRange(bArr, i13, i12));
    }

    @j.P
    private static TextInformationFrame e(int i12, pr0 pr0Var) {
        if (i12 < 1) {
            return null;
        }
        int iT2 = pr0Var.t();
        String strB = b(iT2);
        int i13 = i12 - 1;
        byte[] bArr = new byte[i13];
        pr0Var.a(bArr, 0, i13);
        int iA2 = a(bArr, 0, iT2);
        String str = new String(bArr, 0, iA2, strB);
        int iA3 = iA2 + a(iT2);
        int iA4 = a(bArr, iA3, iT2);
        return new TextInformationFrame("TXXX", str, (iA4 <= iA3 || iA4 > i13) ? "" : new String(bArr, iA3, iA4 - iA3, strB));
    }

    @j.P
    private static UrlLinkFrame f(int i12, pr0 pr0Var) {
        if (i12 < 1) {
            return null;
        }
        int iT2 = pr0Var.t();
        String strB = b(iT2);
        int i13 = i12 - 1;
        byte[] bArr = new byte[i13];
        pr0Var.a(bArr, 0, i13);
        int iA2 = a(bArr, 0, iT2);
        String str = new String(bArr, 0, iA2, strB);
        int iA3 = iA2 + a(iT2);
        int iB2 = b(iA3, bArr);
        return new UrlLinkFrame("WXXX", str, (iB2 <= iA3 || iB2 > i13) ? "" : new String(bArr, iA3, iB2 - iA3, "ISO-8859-1"));
    }

    private static UrlLinkFrame b(int i12, pr0 pr0Var, String str) {
        byte[] bArr = new byte[i12];
        pr0Var.a(bArr, 0, i12);
        return new UrlLinkFrame(str, null, new String(bArr, 0, b(0, bArr), "ISO-8859-1"));
    }

    private static MlltFrame c(int i12, pr0 pr0Var) {
        int iZ2 = pr0Var.z();
        int iW2 = pr0Var.w();
        int iW3 = pr0Var.w();
        int iT2 = pr0Var.t();
        int iT3 = pr0Var.t();
        or0 or0Var = new or0();
        or0Var.a(pr0Var.e(), pr0Var.c());
        or0Var.c(pr0Var.d() * 8);
        int i13 = ((i12 - 10) * 8) / (iT2 + iT3);
        int[] iArr = new int[i13];
        int[] iArr2 = new int[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            int iB2 = or0Var.b(iT2);
            int iB3 = or0Var.b(iT3);
            iArr[i14] = iB2;
            iArr2[i14] = iB3;
        }
        return new MlltFrame(iZ2, iW2, iW3, iArr, iArr2);
    }

    @Override // com.yandex.mobile.ads.impl.b41
    @j.P
    public final Metadata a(hg0 hg0Var, ByteBuffer byteBuffer) {
        return a(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.yandex.mobile.ads.exo.metadata.Metadata a(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.c20.a(int, byte[]):com.yandex.mobile.ads.exo.metadata.Metadata");
    }

    private static GeobFrame b(int i12, pr0 pr0Var) {
        byte[] bArrCopyOfRange;
        int iT2 = pr0Var.t();
        String strB = b(iT2);
        int i13 = i12 - 1;
        byte[] bArr = new byte[i13];
        pr0Var.a(bArr, 0, i13);
        int iB2 = b(0, bArr);
        String str = new String(bArr, 0, iB2, "ISO-8859-1");
        int i14 = iB2 + 1;
        int iA2 = a(bArr, i14, iT2);
        String str2 = "";
        String str3 = (iA2 <= i14 || iA2 > i13) ? "" : new String(bArr, i14, iA2 - i14, strB);
        int iA3 = iA2 + a(iT2);
        int iA4 = a(bArr, iA3, iT2);
        if (iA4 > iA3 && iA4 <= i13) {
            str2 = new String(bArr, iA3, iA4 - iA3, strB);
        }
        int iA5 = iA4 + a(iT2);
        if (i13 <= iA5) {
            bArrCopyOfRange = pc1.f388773f;
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, iA5, i13);
        }
        return new GeobFrame(str, str3, str2, bArrCopyOfRange);
    }

    private static ChapterTocFrame b(pr0 pr0Var, int i12, int i13, boolean z12, int i14, @j.P a aVar) {
        int iD2 = pr0Var.d();
        int iB2 = b(iD2, pr0Var.c());
        String str = new String(pr0Var.c(), iD2, iB2 - iD2, "ISO-8859-1");
        pr0Var.e(iB2 + 1);
        int iT2 = pr0Var.t();
        boolean z13 = (iT2 & 2) != 0;
        boolean z14 = (iT2 & 1) != 0;
        int iT3 = pr0Var.t();
        String[] strArr = new String[iT3];
        for (int i15 = 0; i15 < iT3; i15++) {
            int iD3 = pr0Var.d();
            int iB3 = b(iD3, pr0Var.c());
            strArr[i15] = new String(pr0Var.c(), iD3, iB3 - iD3, "ISO-8859-1");
            pr0Var.e(iB3 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = iD2 + i12;
        while (pr0Var.d() < i16) {
            Id3Frame id3FrameA = a(i13, pr0Var, z12, i14, aVar);
            if (id3FrameA != null) {
                arrayList.add(id3FrameA);
            }
        }
        return new ChapterTocFrame(str, z13, z14, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008a A[PHI: r3
  0x008a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:41:0x0087, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(com.yandex.mobile.ads.impl.pr0 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.d()
        L8:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lae
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L25
            int r7 = r18.h()     // Catch: java.lang.Throwable -> L22
            long r8 = r18.v()     // Catch: java.lang.Throwable -> L22
            int r10 = r18.z()     // Catch: java.lang.Throwable -> L22
            goto L2f
        L22:
            r0 = move-exception
            goto Lb2
        L25:
            int r7 = r18.w()     // Catch: java.lang.Throwable -> L22
            int r8 = r18.w()     // Catch: java.lang.Throwable -> L22
            long r8 = (long) r8
            r10 = r6
        L2f:
            r11 = 0
            if (r7 != 0) goto L3d
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3d
            if (r10 != 0) goto L3d
            r1.e(r2)
            return r4
        L3d:
            r7 = 4
            if (r0 != r7) goto L6e
            if (r21 != 0) goto L6e
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4e
            r1.e(r2)
            return r6
        L4e:
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
        L6e:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L76
            r3 = r4
            goto L77
        L76:
            r3 = r6
        L77:
            r7 = r10 & 1
            if (r7 == 0) goto L8a
            goto L8e
        L7c:
            if (r0 != r3) goto L8c
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L8a
            goto L8e
        L8a:
            r4 = r6
            goto L8e
        L8c:
            r3 = r6
            r4 = r3
        L8e:
            if (r4 == 0) goto L92
            int r3 = r3 + 4
        L92:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9b
            r1.e(r2)
            return r6
        L9b:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L22
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La8
            r1.e(r2)
            return r6
        La8:
            int r3 = (int) r8
            r1.f(r3)     // Catch: java.lang.Throwable -> L22
            goto L8
        Lae:
            r1.e(r2)
            return r4
        Lb2:
            r1.e(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.c20.a(com.yandex.mobile.ads.impl.pr0, int, int, boolean):boolean");
    }

    private static String b(int i12) {
        if (i12 == 1) {
            return "UTF-16";
        }
        if (i12 == 2) {
            return "UTF-16BE";
        }
        if (i12 != 3) {
            return "ISO-8859-1";
        }
        return Constants.ENCODING;
    }

    private static int b(int i12, byte[] bArr) {
        while (i12 < bArr.length) {
            if (bArr[i12] == 0) {
                return i12;
            }
            i12++;
        }
        return bArr.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x020f A[Catch: all -> 0x0143, UnsupportedEncodingException -> 0x0146, TryCatch #0 {all -> 0x0143, blocks: (B:98:0x013d, B:167:0x0221, B:169:0x0240, B:172:0x0247, B:103:0x014c, B:110:0x0162, B:112:0x016a, B:120:0x0184, B:129:0x019c, B:140:0x01b7, B:147:0x01c9, B:153:0x01d8, B:158:0x01f0, B:164:0x020a, B:165:0x020f), top: B:180:0x0133 }] */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.yandex.mobile.ads.exo.metadata.id3.Id3Frame a(int r19, com.yandex.mobile.ads.impl.pr0 r20, boolean r21, int r22, @j.P com.yandex.mobile.ads.impl.c20.a r23) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.c20.a(int, com.yandex.mobile.ads.impl.pr0, boolean, int, com.yandex.mobile.ads.impl.c20$a):com.yandex.mobile.ads.exo.metadata.id3.Id3Frame");
    }

    @j.P
    private static TextInformationFrame a(int i12, pr0 pr0Var, String str) {
        if (i12 < 1) {
            return null;
        }
        int iT2 = pr0Var.t();
        String strB = b(iT2);
        int i13 = i12 - 1;
        byte[] bArr = new byte[i13];
        pr0Var.a(bArr, 0, i13);
        return new TextInformationFrame(str, null, new String(bArr, 0, a(bArr, 0, iT2), strB));
    }

    private static ApicFrame a(int i12, int i13, pr0 pr0Var) {
        int iB2;
        String strB;
        byte[] bArrCopyOfRange;
        int iT2 = pr0Var.t();
        String strB2 = b(iT2);
        int i14 = i12 - 1;
        byte[] bArr = new byte[i14];
        pr0Var.a(bArr, 0, i14);
        if (i13 == 2) {
            StringBuilder sbA = Cif.a("image/");
            sbA.append(bb.b(new String(bArr, 0, 3, "ISO-8859-1")));
            String string = sbA.toString();
            if ("image/jpg".equals(string)) {
                string = "image/jpeg";
            }
            strB = string;
            iB2 = 2;
        } else {
            iB2 = b(0, bArr);
            strB = bb.b(new String(bArr, 0, iB2, "ISO-8859-1"));
            if (strB.indexOf(47) == -1) {
                strB = up1.a("image/", strB);
            }
        }
        int i15 = bArr[iB2 + 1] & 255;
        int i16 = iB2 + 2;
        int iA2 = a(bArr, i16, iT2);
        String str = new String(bArr, i16, iA2 - i16, strB2);
        int iA3 = iA2 + a(iT2);
        if (i14 <= iA3) {
            bArrCopyOfRange = pc1.f388773f;
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, iA3, i14);
        }
        return new ApicFrame(strB, str, i15, bArrCopyOfRange);
    }

    @j.P
    private static CommentFrame a(int i12, pr0 pr0Var) {
        String str;
        if (i12 < 4) {
            return null;
        }
        int iT2 = pr0Var.t();
        String strB = b(iT2);
        byte[] bArr = new byte[3];
        pr0Var.a(bArr, 0, 3);
        String str2 = new String(bArr, 0, 3);
        int i13 = i12 - 4;
        byte[] bArr2 = new byte[i13];
        pr0Var.a(bArr2, 0, i13);
        int iA2 = a(bArr2, 0, iT2);
        String str3 = new String(bArr2, 0, iA2, strB);
        int iA3 = iA2 + a(iT2);
        int iA4 = a(bArr2, iA3, iT2);
        if (iA4 > iA3 && iA4 <= i13) {
            str = new String(bArr2, iA3, iA4 - iA3, strB);
        } else {
            str = "";
        }
        return new CommentFrame(str2, str3, str);
    }

    private static ChapterFrame a(pr0 pr0Var, int i12, int i13, boolean z12, int i14, @j.P a aVar) {
        int iD2 = pr0Var.d();
        int iB2 = b(iD2, pr0Var.c());
        String str = new String(pr0Var.c(), iD2, iB2 - iD2, "ISO-8859-1");
        pr0Var.e(iB2 + 1);
        int iH2 = pr0Var.h();
        int iH3 = pr0Var.h();
        long jV2 = pr0Var.v();
        long j12 = jV2 == 4294967295L ? -1L : jV2;
        long jV3 = pr0Var.v();
        long j13 = jV3 == 4294967295L ? -1L : jV3;
        ArrayList arrayList = new ArrayList();
        int i15 = iD2 + i12;
        while (pr0Var.d() < i15) {
            Id3Frame id3FrameA = a(i13, pr0Var, z12, i14, aVar);
            if (id3FrameA != null) {
                arrayList.add(id3FrameA);
            }
        }
        return new ChapterFrame(str, iH2, iH3, j12, j13, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static String a(int i12, int i13, int i14, int i15, int i16) {
        if (i12 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16));
    }

    private static int a(byte[] bArr, int i12, int i13) {
        int iB2 = b(i12, bArr);
        if (i13 == 0 || i13 == 3) {
            return iB2;
        }
        while (iB2 < bArr.length - 1) {
            if ((iB2 - i12) % 2 == 0 && bArr[iB2 + 1] == 0) {
                return iB2;
            }
            iB2 = b(iB2 + 1, bArr);
        }
        return bArr.length;
    }
}
