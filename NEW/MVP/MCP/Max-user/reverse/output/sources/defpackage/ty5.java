package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;
import java.net.URI;
import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;
import one.me.sdk.transfer.exceptions.HttpErrorException;

/* loaded from: classes2.dex */
public final class ty5 implements ivg {
    public final int a;
    public final String b;
    public final tgg c;
    public final String d;
    public final k18 e;
    public final bwf f;
    public final k18 g;
    public final k18 h;
    public final URI i;
    public final File j;
    public final long k;
    public final n9a l;
    public final bwf m;
    public final n9a n;
    public final bwf o;
    public final rt7 p;
    public final bwf q;
    public final bwf r;
    public long s;
    public String t;
    public final rvg u;
    public final boolean v;

    public ty5(String str, String str2, k18 k18Var, bwf bwfVar, k18 k18Var2, k18 k18Var3, k18 k18Var4, int i, String str3, tgg tggVar) throws HttpErrorException {
        this.a = i;
        this.b = str3;
        this.c = tggVar;
        String name = ty5.class.getName();
        this.d = name;
        this.e = k18Var;
        this.f = bwfVar;
        this.g = k18Var4;
        this.h = k18Var3;
        this.i = new URI(str);
        File file = new File(str2);
        this.j = file;
        String name2 = str3;
        long length = file.length();
        this.k = length;
        Symbol symbol = o9a.a;
        this.l = new n9a();
        this.m = new bwf(new hy5(this, 0));
        this.n = new n9a();
        this.o = new bwf(new nz(k18Var3, 16));
        this.p = eoi.a();
        this.q = new bwf(new hy5(this, 1));
        this.r = new bwf(new nq5(8));
        name2 = name2 == null ? file.getName() : name2;
        int i2 = hr3.$EnumSwitchMapping$0[tggVar.a().ordinal()];
        this.u = new rvg(k18Var2, (i2 == 1 || i2 == 2) ? PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE : i2 != 3 ? PlaybackStateCompat.ACTION_PREPARE : PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID, length, i, name2);
        this.v = true;
        if (!file.exists()) {
            wqi.e(name, "File by path not found=".concat(str2), null);
            throw new HttpErrorException("File not found", null, null, 6);
        }
        if (length == 0) {
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.Y;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, name, "Upload failed: trying to upload file with zero length", null);
                }
            }
            throw new HttpErrorException("File is zero length", null, null, 6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
    
        if (r11.e(r10, r9, r14) != r7) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r13v3, types: [sm6] */
    /* JADX WARN: Type inference failed for: r9v8, types: [sm6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.ty5 r9, defpackage.ebg r10, defpackage.utg r11, java.nio.channels.AsynchronousFileChannel r12, defpackage.jy5 r13, defpackage.q44 r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ty5.b(ty5, ebg, utg, java.nio.channels.AsynchronousFileChannel, jy5, q44):java.lang.Object");
    }

    @Override // defpackage.ivg
    public final n46 a() {
        return new n46(new mwd(new d56(gw0.l(new lo1(gw0.f(new my5(this, null)), 1), new cj0(15)), new ny5(3, null, 0), null)), new s83(this, (Continuation) null));
    }

    public final su0 c() {
        return (su0) this.h.getValue();
    }

    public final void d(utg utgVar, long j, long j2, long j3) {
        StringBuilder sb = new StringBuilder();
        long j4 = (j + j2) - 1;
        StringBuilder sbL = az1.l(j, "Content-Range: bytes ", "-");
        sbL.append(j4);
        sb.append(u45.i(j3, "/", "\n", sbL));
        sb.append("Content-Length: " + j2 + "\n");
        sb.append('\n');
        String string = sb.toString();
        if (this.v) {
            String str = this.d;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, utgVar + ": remained headers " + string, null);
                }
            }
        }
        ((ByteBuffer) this.o.getValue()).clear();
        ((ByteBuffer) this.o.getValue()).put(string.getBytes(lb2.a));
        ((ByteBuffer) this.o.getValue()).flip();
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fa A[Catch: all -> 0x0106, TryCatch #2 {all -> 0x0106, blocks: (B:42:0x00f3, B:44:0x00fa, B:51:0x0109, B:53:0x0110, B:59:0x0121, B:47:0x0103), top: B:152:0x00f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0110 A[Catch: all -> 0x0106, LOOP:1: B:53:0x0110->B:58:0x011f, LOOP_START, PHI: r0
  0x0110: PHI (r0v44 int) = (r0v42 int), (r0v45 int) binds: [B:52:0x010e, B:58:0x011f] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x0106, blocks: (B:42:0x00f3, B:44:0x00fa, B:51:0x0109, B:53:0x0110, B:59:0x0121, B:47:0x0103), top: B:152:0x00f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008e -> B:23:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ebg r18, defpackage.utg r19, defpackage.q44 r20) throws org.json.JSONException, one.me.sdk.transfer.exceptions.HttpErrorException {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ty5.e(ebg, utg, q44):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x01bb, code lost:
    
        if (r6.invoke(r7, r15) == r3) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0162 A[Catch: all -> 0x0076, PHI: r1 r4 r9 r10 r11 r12 r13 r14
  0x0162: PHI (r1v6 ry5) = (r1v8 ry5), (r1v2 ry5) binds: [B:48:0x015f, B:19:0x0071] A[DONT_GENERATE, DONT_INLINE]
  0x0162: PHI (r4v8 int) = (r4v14 int), (r4v20 int) binds: [B:48:0x015f, B:19:0x0071] A[DONT_GENERATE, DONT_INLINE]
  0x0162: PHI (r9v4 int) = (r9v6 int), (r9v12 int) binds: [B:48:0x015f, B:19:0x0071] A[DONT_GENERATE, DONT_INLINE]
  0x0162: PHI (r10v3 sm6) = (r10v5 sm6), (r10v12 sm6) binds: [B:48:0x015f, B:19:0x0071] A[DONT_GENERATE, DONT_INLINE]
  0x0162: PHI (r11v0 java.nio.channels.AsynchronousFileChannel) = (r11v1 java.nio.channels.AsynchronousFileChannel), (r11v11 java.nio.channels.AsynchronousFileChannel) binds: [B:48:0x015f, B:19:0x0071] A[DONT_GENERATE, DONT_INLINE]
  0x0162: PHI (r12v1 utg) = (r12v3 utg), (r12v12 utg) binds: [B:48:0x015f, B:19:0x0071] A[DONT_GENERATE, DONT_INLINE]
  0x0162: PHI (r13v2 ebg) = (r13v3 ebg), (r13v9 ebg) binds: [B:48:0x015f, B:19:0x0071] A[DONT_GENERATE, DONT_INLINE]
  0x0162: PHI (r14v0 ty5) = (r14v1 ty5), (r14v6 ty5) binds: [B:48:0x015f, B:19:0x0071] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0076, blocks: (B:47:0x0139, B:50:0x0162, B:19:0x0071, B:24:0x0085), top: B:68:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x019c -> B:28:0x009c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01bb -> B:61:0x01be). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ebg r18, defpackage.utg r19, java.nio.channels.AsynchronousFileChannel r20, defpackage.sm6 r21, defpackage.q44 r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ty5.f(ebg, utg, java.nio.channels.AsynchronousFileChannel, sm6, q44):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v17, types: [j9a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ebg r20, defpackage.utg r21, defpackage.q44 r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ty5.g(ebg, utg, q44):java.lang.Object");
    }
}
