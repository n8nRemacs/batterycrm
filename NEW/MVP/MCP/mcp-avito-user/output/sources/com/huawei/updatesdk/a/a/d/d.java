package com.huawei.updatesdk.a.a.d;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class d {
    /* JADX WARN: Can't wrap try/catch for region: R(5:(3:72|5|6)|(5:74|7|(2:8|(1:10)(1:76))|23|(1:25))|70|26|61) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0081, code lost:
    
        com.huawei.updatesdk.a.a.c.a.a.a.b("FileUtil", "Close FileInputStream failed!");
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r10, java.lang.String r11) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "Close FileInputStream failed!"
            java.lang.String r1 = "FileUtil"
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            r3 = 0
            if (r2 == 0) goto Lc
            return r3
        Lc:
            java.security.MessageDigest r11 = java.security.MessageDigest.getInstance(r11)     // Catch: java.lang.Throwable -> L48 java.lang.IndexOutOfBoundsException -> L4a java.lang.IllegalArgumentException -> L4c java.io.IOException -> L4e java.io.FileNotFoundException -> L50 java.security.NoSuchAlgorithmException -> L52
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L48 java.lang.IndexOutOfBoundsException -> L4a java.lang.IllegalArgumentException -> L4c java.io.IOException -> L4e java.io.FileNotFoundException -> L50 java.security.NoSuchAlgorithmException -> L52
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L48 java.lang.IndexOutOfBoundsException -> L4a java.lang.IllegalArgumentException -> L4c java.io.IOException -> L4e java.io.FileNotFoundException -> L50 java.security.NoSuchAlgorithmException -> L52
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]     // Catch: java.lang.Throwable -> L2a java.lang.IndexOutOfBoundsException -> L2e java.lang.IllegalArgumentException -> L30 java.io.IOException -> L32 java.io.FileNotFoundException -> L34 java.security.NoSuchAlgorithmException -> L36
            r4 = 0
            r6 = r4
        L1c:
            int r8 = r2.read(r10)     // Catch: java.lang.Throwable -> L2a java.lang.IndexOutOfBoundsException -> L2e java.lang.IllegalArgumentException -> L30 java.io.IOException -> L32 java.io.FileNotFoundException -> L34 java.security.NoSuchAlgorithmException -> L36
            r9 = -1
            if (r8 == r9) goto L38
            r9 = 0
            r11.update(r10, r9, r8)     // Catch: java.lang.Throwable -> L2a java.lang.IndexOutOfBoundsException -> L2e java.lang.IllegalArgumentException -> L30 java.io.IOException -> L32 java.io.FileNotFoundException -> L34 java.security.NoSuchAlgorithmException -> L36
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L2a java.lang.IndexOutOfBoundsException -> L2e java.lang.IllegalArgumentException -> L30 java.io.IOException -> L32 java.io.FileNotFoundException -> L34 java.security.NoSuchAlgorithmException -> L36
            long r6 = r6 + r8
            goto L1c
        L2a:
            r10 = move-exception
            r3 = r2
            goto L85
        L2e:
            r10 = move-exception
            goto L55
        L30:
            r10 = move-exception
            goto L5e
        L32:
            r10 = move-exception
            goto L67
        L34:
            r10 = move-exception
            goto L70
        L36:
            r10 = move-exception
            goto L79
        L38:
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 <= 0) goto L44
            byte[] r10 = r11.digest()     // Catch: java.lang.Throwable -> L2a java.lang.IndexOutOfBoundsException -> L2e java.lang.IllegalArgumentException -> L30 java.io.IOException -> L32 java.io.FileNotFoundException -> L34 java.security.NoSuchAlgorithmException -> L36
            java.lang.String r3 = com.huawei.updatesdk.a.a.d.b.a(r10)     // Catch: java.lang.Throwable -> L2a java.lang.IndexOutOfBoundsException -> L2e java.lang.IllegalArgumentException -> L30 java.io.IOException -> L32 java.io.FileNotFoundException -> L34 java.security.NoSuchAlgorithmException -> L36
        L44:
            r2.close()     // Catch: java.io.IOException -> L81
            goto L84
        L48:
            r10 = move-exception
            goto L85
        L4a:
            r10 = move-exception
            goto L54
        L4c:
            r10 = move-exception
            goto L5d
        L4e:
            r10 = move-exception
            goto L66
        L50:
            r10 = move-exception
            goto L6f
        L52:
            r10 = move-exception
            goto L78
        L54:
            r2 = r3
        L55:
            java.lang.String r11 = "getFileHashData IndexOutOfBoundsException"
            com.huawei.updatesdk.a.a.c.a.a.a.a(r1, r11, r10)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L84
            goto L44
        L5d:
            r2 = r3
        L5e:
            java.lang.String r11 = "getFileHashData IllegalArgumentException"
            com.huawei.updatesdk.a.a.c.a.a.a.a(r1, r11, r10)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L84
            goto L44
        L66:
            r2 = r3
        L67:
            java.lang.String r11 = "getFileHashData IOException"
            com.huawei.updatesdk.a.a.c.a.a.a.a(r1, r11, r10)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L84
            goto L44
        L6f:
            r2 = r3
        L70:
            java.lang.String r11 = "getFileHashData FileNotFoundException"
            com.huawei.updatesdk.a.a.c.a.a.a.a(r1, r11, r10)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L84
            goto L44
        L78:
            r2 = r3
        L79:
            java.lang.String r11 = "getFileHashData NoSuchAlgorithmException"
            com.huawei.updatesdk.a.a.c.a.a.a.a(r1, r11, r10)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L84
            goto L44
        L81:
            com.huawei.updatesdk.a.a.c.a.a.a.b(r1, r0)
        L84:
            return r3
        L85:
            if (r3 == 0) goto L8e
            r3.close()     // Catch: java.io.IOException -> L8b
            goto L8e
        L8b:
            com.huawei.updatesdk.a.a.c.a.a.a.b(r1, r0)
        L8e:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.a.a.d.d.a(java.lang.String, java.lang.String):java.lang.String");
    }

    public static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e12) {
                com.huawei.updatesdk.a.a.c.a.a.a.a("FileUtil", "Closeable exception", e12);
            }
        }
    }

    public static boolean a(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                a(file2);
            }
        }
        return file.delete();
    }
}
