package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.text.TextUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

/* compiled from: CommonUtils.java */
/* renamed from: com.google.firebase.crashlytics.internal.common.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C37586h {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f360974a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    public static long f360975b = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonUtils.java */
    /* renamed from: com.google.firebase.crashlytics.internal.common.h$a */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f360976b;

        /* renamed from: c, reason: collision with root package name */
        public static final HashMap f360977c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a[] f360978d;

        /* JADX INFO: Fake field, exist only in values array */
        a EF10;

        static {
            a aVar = new a("X86_32", 0);
            a aVar2 = new a("X86_64", 1);
            a aVar3 = new a("ARM_UNKNOWN", 2);
            a aVar4 = new a("PPC", 3);
            a aVar5 = new a("PPC64", 4);
            a aVar6 = new a("ARMV6", 5);
            a aVar7 = new a("ARMV7", 6);
            a aVar8 = new a(GrsBaseInfo.CountryCodeSource.UNKNOWN, 7);
            f360976b = aVar8;
            a aVar9 = new a("ARMV7S", 8);
            a aVar10 = new a("ARM64", 9);
            f360978d = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
            HashMap map = new HashMap(4);
            f360977c = map;
            map.put("armeabi-v7a", aVar7);
            map.put("armeabi", aVar6);
            map.put("arm64-v8a", aVar10);
            map.put("x86", aVar);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f360978d.clone();
        }
    }

    public static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                com.google.firebase.crashlytics.internal.d.f361031a.b();
            }
        }
    }

    public static void b(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e12) {
                throw e12;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        r2 = r3[1];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(java.io.File r6) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "MemTotal"
            boolean r1 = r6.exists()
            r2 = 0
            if (r1 == 0) goto L4d
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
        L15:
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L40
            if (r3 == 0) goto L39
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L40
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L40
            int r4 = r3.length     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L40
            r5 = 1
            if (r4 <= r5) goto L15
            r4 = 0
            r4 = r3[r4]     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L40
            boolean r4 = r4.equals(r0)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L40
            if (r4 == 0) goto L15
            r2 = r3[r5]     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L40
            goto L39
        L36:
            r6 = move-exception
            r2 = r1
            goto L49
        L39:
            a(r1)
            goto L4d
        L3d:
            r6 = move-exception
            goto L49
        L3f:
            r1 = r2
        L40:
            com.google.firebase.crashlytics.internal.d r0 = com.google.firebase.crashlytics.internal.d.f361031a     // Catch: java.lang.Throwable -> L36
            r6.toString()     // Catch: java.lang.Throwable -> L36
            r0.b()     // Catch: java.lang.Throwable -> L36
            goto L39
        L49:
            a(r2)
            throw r6
        L4d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.C37586h.c(java.io.File):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int d() {
        boolean zH2 = h();
        ?? r02 = zH2;
        if (i()) {
            r02 = (zH2 ? 1 : 0) | 2;
        }
        return (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) ? r02 | 4 : r02;
    }

    public static int e(Context context, String str, String str2) throws Resources.NotFoundException {
        String packageName;
        Resources resources = context.getResources();
        int i12 = context.getApplicationContext().getApplicationInfo().icon;
        if (i12 > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i12);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    public static synchronized long f() {
        long j12;
        int i12;
        try {
            if (f360975b == -1) {
                String strC = c(new File("/proc/meminfo"));
                long j13 = 0;
                if (!TextUtils.isEmpty(strC)) {
                    String upperCase = strC.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j12 = Long.parseLong(upperCase.split("KB")[0].trim());
                            i12 = 1024;
                        } else if (upperCase.endsWith("MB")) {
                            j12 = Long.parseLong(upperCase.split("MB")[0].trim());
                            i12 = 1048576;
                        } else if (upperCase.endsWith("GB")) {
                            j12 = Long.parseLong(upperCase.split("GB")[0].trim());
                            i12 = 1073741824;
                        } else {
                            com.google.firebase.crashlytics.internal.d.f361031a.a(5);
                        }
                        j13 = i12 * j12;
                    } catch (NumberFormatException unused) {
                        com.google.firebase.crashlytics.internal.d.f361031a.b();
                    }
                }
                f360975b = j13;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f360975b;
    }

    public static String g(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i12 = 0; i12 < bArr.length; i12++) {
            byte b12 = bArr[i12];
            int i13 = i12 * 2;
            char[] cArr2 = f360974a;
            cArr[i13] = cArr2[(b12 & 255) >>> 4];
            cArr[i13 + 1] = cArr2[b12 & 15];
        }
        return new String(cArr);
    }

    public static boolean h() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
        }
        return true;
    }

    public static boolean i() {
        boolean zH2 = h();
        String str = Build.TAGS;
        if ((zH2 || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zH2 && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static String j(String str) throws NoSuchAlgorithmException {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return g(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            com.google.firebase.crashlytics.internal.d.f361031a.b();
            return "";
        }
    }

    public static String k(FileInputStream fileInputStream) {
        Scanner scannerUseDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        return scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
    }
}
