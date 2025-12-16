package com.google.android.gms.common.internal;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
@Deprecated
/* renamed from: com.google.android.gms.common.internal.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36726s {

    /* renamed from: b, reason: collision with root package name */
    public static final C36713l f349456b = new C36713l("LibraryVersion", "");

    /* renamed from: c, reason: collision with root package name */
    public static final C36726s f349457c = new C36726s();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f349458a = new ConcurrentHashMap();

    @j.k0
    public C36726s() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    @j.N
    @RX0.a
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(@j.N java.lang.String r10) throws java.lang.Throwable {
        /*
            r9 = this;
            com.google.android.gms.common.internal.l r0 = com.google.android.gms.common.internal.C36726s.f349456b
            java.lang.String r1 = "Failed to get app version for libraryName: "
            java.lang.String r2 = "/"
            java.lang.String r3 = "Please provide a valid libraryName"
            com.google.android.gms.common.internal.C36729v.g(r10, r3)
            java.util.concurrent.ConcurrentHashMap r3 = r9.f349458a
            boolean r4 = r3.containsKey(r10)
            if (r4 == 0) goto L1a
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L1a:
            java.util.Properties r4 = new java.util.Properties
            r4.<init>()
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7d
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7d
            r6.append(r10)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7d
            java.lang.String r2 = ".properties"
            r6.append(r2)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7d
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7d
            java.lang.Class<com.google.android.gms.common.internal.s> r6 = com.google.android.gms.common.internal.C36726s.class
            java.io.InputStream r2 = r6.getResourceAsStream(r2)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7d
            if (r2 == 0) goto L69
            r4.load(r2)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            java.lang.String r6 = "version"
            java.lang.String r5 = r4.getProperty(r6, r5)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            r4.<init>()     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            r4.append(r10)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            java.lang.String r6 = " version is "
            r4.append(r6)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            r4.append(r5)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            java.lang.String r6 = r0.f349447a     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            r7 = 2
            boolean r6 = android.util.Log.isLoggable(r6, r7)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            if (r6 == 0) goto L99
            r0.d(r4)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            goto L99
        L63:
            r10 = move-exception
            goto L79
        L65:
            r8 = r5
            r5 = r2
            r2 = r8
            goto L7e
        L69:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            r4.append(r10)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            r0.c(r4)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            goto L99
        L79:
            r5 = r2
            goto Lab
        L7b:
            r10 = move-exception
            goto Lab
        L7d:
            r2 = r5
        L7e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L7b
            r4.append(r10)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = r0.f349447a     // Catch: java.lang.Throwable -> L7b
            r6 = 6
            boolean r4 = android.util.Log.isLoggable(r4, r6)     // Catch: java.lang.Throwable -> L7b
            if (r4 == 0) goto L96
            r0.d(r1)     // Catch: java.lang.Throwable -> L7b
        L96:
            r8 = r5
            r5 = r2
            r2 = r8
        L99:
            if (r2 == 0) goto L9e
            com.google.android.gms.common.util.q.a(r2)
        L9e:
            if (r5 != 0) goto La7
            java.lang.String r1 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r0.a(r1)
            java.lang.String r5 = "UNKNOWN"
        La7:
            r3.put(r10, r5)
            return r5
        Lab:
            if (r5 == 0) goto Lb0
            com.google.android.gms.common.util.q.a(r5)
        Lb0:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C36726s.a(java.lang.String):java.lang.String");
    }
}
