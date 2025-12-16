package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ieb {
    public static final Pattern f = Pattern.compile("^bytes \\*/([0-9]+)");
    public static final Pattern g = Pattern.compile(".*filename=\".*\\.(\\w+)\".*");
    public final tgg a;
    public final k18 b;
    public final k18 c;
    public final String d = ieb.class.getName();
    public final ConcurrentHashMap e = new ConcurrentHashMap();

    public ieb(k18 k18Var, k18 k18Var2, tgg tggVar) {
        this.a = tggVar;
        this.b = k18Var2;
        this.c = k18Var;
    }

    public static String d(ood oodVar) {
        String strC = ood.c(oodVar, "Content-Disposition");
        if (strC == null || strC.length() == 0) {
            return null;
        }
        Matcher matcher = g.matcher(strC);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    public static File e(File file, String str) throws NoSuchAlgorithmException {
        if (file == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String parent = file.getParent();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        String name = file.getName();
        Charset charset = lb2.a;
        messageDigest.update(name.getBytes(charset));
        messageDigest.update(str != null ? str.getBytes(charset) : new byte[0]);
        byte[] bArrDigest = messageDigest.digest();
        int[] iArr = i27.a;
        l27 l27Var = l27.c;
        int length = bArrDigest.length;
        int length2 = bArrDigest.length;
        if (length > length2) {
            throw new IndexOutOfBoundsException(ho7.g("startIndex: 0, endIndex: ", length, length2, ", size: "));
        }
        if (length < 0) {
            throw new IllegalArgumentException(ho7.f(length, "startIndex: 0 > endIndex: "));
        }
        String str2 = "";
        if (length != 0) {
            int[] iArr2 = i27.a;
            j27 j27Var = l27Var.a;
            if (!j27Var.a) {
                if (length <= 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i = length - 1;
                int i2 = i / Integer.MAX_VALUE;
                int i3 = length % Integer.MAX_VALUE;
                if (i3 == 0) {
                    i3 = Integer.MAX_VALUE;
                }
                int i4 = (i3 - 1) / Integer.MAX_VALUE;
                long j = 0;
                int iA = i27.a(((j + 2 + j) * length) + (((i - i2) - i4) * j) + (i4 * 2) + i2);
                char[] cArr = new char[iA];
                int iC = 0;
                int i5 = 0;
                int i6 = 0;
                for (int i7 = 0; i7 < length; i7++) {
                    if (i5 == Integer.MAX_VALUE) {
                        cArr[iC] = '\n';
                        i6 = 0;
                        iC++;
                        i5 = 0;
                    } else if (i6 == Integer.MAX_VALUE) {
                        iC = i27.c("  ", cArr, iC);
                        i6 = 0;
                    }
                    if (i6 != 0) {
                        iC = i27.c("", cArr, iC);
                    }
                    iC = i27.c("", cArr, i27.b(bArrDigest, i7, iArr2, cArr, i27.c("", cArr, iC)));
                    i6++;
                    i5++;
                }
                if (iC != iA) {
                    throw new IllegalStateException("Check failed.");
                }
                str2 = new String(cArr);
            } else if (j27Var.b) {
                char[] cArr2 = new char[i27.a(length * 2)];
                int iB = 0;
                for (int i8 = 0; i8 < length; i8++) {
                    iB = i27.b(bArrDigest, i8, iArr2, cArr2, iB);
                }
                str2 = new String(cArr2);
            } else {
                if (length <= 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                long j2 = 0;
                char[] cArr3 = new char[i27.a((length * (((2 + j2) + j2) + j2)) - j2)];
                int iC2 = i27.c("", cArr3, i27.b(bArrDigest, 0, iArr2, cArr3, i27.c("", cArr3, 0)));
                for (int i9 = 1; i9 < length; i9++) {
                    iC2 = i27.c("", cArr3, i27.b(bArrDigest, i9, iArr2, cArr3, i27.c("", cArr3, i27.c("", cArr3, iC2))));
                }
                str2 = new String(cArr3);
            }
        }
        return new File(parent, str2.concat(".part"));
    }

    public static boolean g(String str) {
        Set setH = gke.h(uz9.u0, uz9.t0);
        if (!setH.isEmpty()) {
            Iterator it = setH.iterator();
            while (it.hasNext()) {
                if (vmf.s(str, ((uz9) it.next()).a, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.io.File r9, java.lang.String r10, defpackage.q44 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.ceb
            if (r0 == 0) goto L13
            r0 = r11
            ceb r0 = (defpackage.ceb) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ceb r0 = new ceb
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.o
            g84 r1 = defpackage.g84.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.Iterator r9 = r0.d
            defpackage.g8j.b(r11)
            goto L7f
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            defpackage.g8j.b(r11)
            java.util.concurrent.ConcurrentHashMap r11 = r8.e
            java.io.File r9 = e(r9, r10)
            java.lang.String r9 = r9.getAbsolutePath()
            java.lang.Object r9 = r11.get(r9)
            beb r9 = (defpackage.beb) r9
            java.lang.String r11 = r8.d
            l6b r2 = defpackage.wqi.a
            if (r2 != 0) goto L4b
            goto L72
        L4b:
            lg8 r4 = defpackage.lg8.d
            boolean r5 = r2.b(r4)
            if (r5 == 0) goto L72
            if (r9 == 0) goto L57
            r5 = r3
            goto L58
        L57:
            r5 = 0
        L58:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "File download. Cancel download, attachId:"
            r6.<init>(r7)
            r6.append(r10)
            java.lang.String r10 = ", task exist:"
            r6.append(r10)
            r6.append(r5)
            java.lang.String r10 = r6.toString()
            r5 = 0
            r2.c(r4, r11, r10, r5)
        L72:
            if (r9 == 0) goto L98
            mbd r10 = r9.a
            r10.d()
            java.util.concurrent.CopyOnWriteArrayList r9 = r9.b
            java.util.Iterator r9 = r9.iterator()
        L7f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L98
            java.lang.Object r10 = r9.next()
            btf r10 = (defpackage.btf) r10
            if (r10 == 0) goto L7f
            r0.d = r9
            r0.Y = r3
            java.lang.Object r10 = r10.c(r0)
            if (r10 != r1) goto L7f
            return r1
        L98:
            qqg r9 = defpackage.qqg.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ieb.a(java.io.File, java.lang.String, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [beb, btf, java.io.File, java.lang.Object, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r19, java.io.File r20, defpackage.btf r21, java.lang.String r22, boolean r23, java.lang.String r24, kotlin.coroutines.Continuation r25) throws java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ieb.b(java.lang.String, java.io.File, btf, java.lang.String, boolean, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final File c(File file, File file2, String str) throws IOException {
        File fileS;
        String str2 = this.d;
        try {
            wqi.c(str2, "File download. Start copy data from temp file to output", new Object[0]);
            if (str != null && str.length() != 0) {
                String name = file2.getName();
                int iG = vmf.G(name, '.', 0, 6);
                if (iG >= 0) {
                    name = name.substring(0, iG);
                }
                file2 = new File(file2.getParentFile(), name + "." + str);
            }
            File parentFile = file2.getParentFile();
            fileS = parentFile != null ? b6a.S(parentFile, file2.getName()) : null;
        } catch (IOException e) {
            e = e;
            fileS = null;
        }
        try {
            Path path = file.toPath();
            if (fileS == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Files.move(path, fileS.toPath(), new CopyOption[0]);
            wqi.c(str2, "File download. Finish copy data", new Object[0]);
            return fileS;
        } catch (IOException e2) {
            e = e2;
            wqi.e(str2, e.getMessage(), null);
            return fileS;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(1:170)|149|150|168|151|(4:154|155|177|(1:145))|153) */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02f2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ab, code lost:
    
        if (l(r27, r25, r8) == r5) goto L153;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x0294 -> B:121:0x026b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x02e5 -> B:155:0x02eb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x02f6 -> B:145:0x02c5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.qod r22, long r23, java.io.File r25, defpackage.ood r26, defpackage.beb r27, java.io.File r28, boolean r29, java.lang.String r30, defpackage.q44 r31) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ieb.f(qod, long, java.io.File, ood, beb, java.io.File, boolean, java.lang.String, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00bc -> B:49:0x00bf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.io.IOException r7, defpackage.zmd r8, defpackage.beb r9, java.io.File r10, defpackage.q44 r11) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ieb.h(java.io.IOException, zmd, beb, java.io.File, q44):java.lang.Object");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:182:0x04ed -> B:403:0x0379). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:201:0x0583 -> B:355:0x0599). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:244:0x067c -> B:245:0x0680). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:250:0x0689 -> B:235:0x0644). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:328:0x077d -> B:286:0x06ff). Please report as a decompilation issue!!! */
    public final java.lang.Object i(defpackage.ood r39, defpackage.beb r40, java.io.File r41, java.io.File r42, boolean r43, java.lang.String r44, defpackage.q44 r45) {
        /*
            Method dump skipped, instructions count: 1942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ieb.i(ood, beb, java.io.File, java.io.File, boolean, java.lang.String, q44):java.lang.Object");
    }

    public final void j(beb bebVar, String str) {
        bebVar.b.clear();
        this.e.remove(str);
    }

    public final Object k(File file, String str, Continuation continuation) {
        String absolutePath = e(file, str).getAbsolutePath();
        beb bebVar = (beb) this.e.get(absolutePath);
        String str2 = this.d;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str2, "File download. Silent cancel download, attachId:" + str + ", task exist:" + (bebVar != null), null);
            }
        }
        if (bebVar != null) {
            bebVar.a.d();
            j(bebVar, absolutePath);
        }
        return qqg.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x005d -> B:19:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.beb r5, java.io.File r6, defpackage.q44 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.heb
            if (r0 == 0) goto L13
            r0 = r7
            heb r0 = (defpackage.heb) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            heb r0 = new heb
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.X
            int r1 = r0.Z
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            java.util.Iterator r5 = r0.o
            ieb r6 = r0.d
            defpackage.g8j.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L40
        L29:
            r7 = move-exception
            goto L5d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.g8j.b(r7)
            r6.delete()
            java.util.concurrent.CopyOnWriteArrayList r5 = r5.b
            java.util.Iterator r5 = r5.iterator()
            r6 = r4
        L40:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L65
            java.lang.Object r7 = r5.next()
            btf r7 = (defpackage.btf) r7
            if (r7 == 0) goto L40
            r0.d = r6     // Catch: java.lang.Throwable -> L29
            r0.o = r5     // Catch: java.lang.Throwable -> L29
            r0.Z = r2     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r7.e(r0)     // Catch: java.lang.Throwable -> L29
            g84 r1 = defpackage.g84.a
            if (r7 != r1) goto L40
            return r1
        L5d:
            java.lang.String r1 = r6.d
            java.lang.String r3 = "File download. Failed to notify listener on url expired"
            defpackage.wqi.e(r1, r3, r7)
            goto L40
        L65:
            qqg r5 = defpackage.qqg.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ieb.l(beb, java.io.File, q44):java.lang.Object");
    }
}
