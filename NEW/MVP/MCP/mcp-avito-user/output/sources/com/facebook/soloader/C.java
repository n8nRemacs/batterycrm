package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: SoLoader.java */
/* loaded from: classes16.dex */
class C implements B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f340824a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f340825b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f340826c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runtime f340827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Method f340828e;

    public C(boolean z12, String str, String str2, Runtime runtime, Method method) {
        this.f340824a = z12;
        this.f340825b = str;
        this.f340826c = str2;
        this.f340827d = runtime;
        this.f340828e = method;
    }

    public static void a(String str) throws NoSuchAlgorithmException, IOException {
        try {
            File file = new File(str);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i12 = fileInputStream.read(bArr);
                    if (i12 <= 0) {
                        String.format("%32x", new BigInteger(1, messageDigest.digest()));
                        fileInputStream.close();
                        return;
                    }
                    messageDigest.update(bArr, 0, i12);
                }
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException | SecurityException | NoSuchAlgorithmException e12) {
            e12.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r7 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        a(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r7, java.lang.String r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r6.f340824a
            if (r0 == 0) goto L6f
            r0 = 4
            r7 = r7 & r0
            if (r7 != r0) goto Lb
            java.lang.String r7 = r6.f340825b
            goto Ld
        Lb:
            java.lang.String r7 = r6.f340826c
        Ld:
            r0 = 0
            java.lang.Runtime r1 = r6.f340827d     // Catch: java.lang.Throwable -> L44 java.lang.reflect.InvocationTargetException -> L49 java.lang.IllegalArgumentException -> L4e java.lang.IllegalAccessException -> L50
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L44 java.lang.reflect.InvocationTargetException -> L49 java.lang.IllegalArgumentException -> L4e java.lang.IllegalAccessException -> L50
            java.lang.reflect.Method r2 = r6.f340828e     // Catch: java.lang.Throwable -> L36
            java.lang.Runtime r3 = r6.f340827d     // Catch: java.lang.Throwable -> L36
            java.lang.Class<com.facebook.soloader.SoLoader> r4 = com.facebook.soloader.SoLoader.class
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Throwable -> L36
            java.lang.Object[] r7 = new java.lang.Object[]{r8, r4, r7}     // Catch: java.lang.Throwable -> L36
            java.lang.Object r7 = r2.invoke(r3, r7)     // Catch: java.lang.Throwable -> L36
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L36
            if (r7 != 0) goto L30
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2e
            if (r7 == 0) goto L72
            a(r8)
            goto L72
        L2e:
            r0 = move-exception
            goto L3a
        L30:
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch: java.lang.Throwable -> L2e
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L2e
            throw r0     // Catch: java.lang.Throwable -> L2e
        L36:
            r7 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L3a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2e
            throw r0     // Catch: java.lang.Throwable -> L3c java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalArgumentException -> L40 java.lang.IllegalAccessException -> L42
        L3c:
            r0 = move-exception
            goto L69
        L3e:
            r0 = move-exception
            goto L52
        L40:
            r0 = move-exception
            goto L52
        L42:
            r0 = move-exception
            goto L52
        L44:
            r7 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
            goto L69
        L49:
            r7 = move-exception
        L4a:
            r5 = r0
            r0 = r7
            r7 = r5
            goto L52
        L4e:
            r7 = move-exception
            goto L4a
        L50:
            r7 = move-exception
            goto L4a
        L52:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r1.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = "Error: Cannot load "
            r1.append(r2)     // Catch: java.lang.Throwable -> L3c
            r1.append(r8)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L3c
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L3c
            r1.<init>(r7, r0)     // Catch: java.lang.Throwable -> L3c
            throw r1     // Catch: java.lang.Throwable -> L3c
        L69:
            if (r7 == 0) goto L6e
            a(r8)
        L6e:
            throw r0
        L6f:
            java.lang.System.load(r8)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C.b(int, java.lang.String):void");
    }
}
