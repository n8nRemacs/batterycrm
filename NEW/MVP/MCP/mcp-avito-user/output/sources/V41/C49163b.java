package v41;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/* compiled from: Lookup.java */
/* renamed from: v41.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49163b {

    /* renamed from: a, reason: collision with root package name */
    public static final org.slf4j.a f440459a;

    /* renamed from: b, reason: collision with root package name */
    public static final Properties f440460b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f440461c;

    static {
        org.slf4j.a aVarD = org.slf4j.b.d(C49163b.class);
        f440459a = aVarD;
        f440461c = true;
        String property = System.getProperty("sentry.properties.file");
        if (property == null) {
            property = System.getenv("SENTRY_PROPERTIES_FILE");
        }
        if (property == null) {
            property = "sentry.properties";
        }
        InputStream inputStreamA = null;
        try {
            try {
                inputStreamA = a(property);
                if (inputStreamA != null) {
                    Properties properties = new Properties();
                    f440460b = properties;
                    properties.load(inputStreamA);
                } else {
                    aVarD.m(property, "Sentry configuration file not found in filesystem or classpath: '{}'.");
                }
                if (inputStreamA == null) {
                    return;
                }
            } catch (Exception e12) {
                f440459a.d("Error loading Sentry configuration file '{}': ", property, e12);
                if (0 == 0) {
                    return;
                }
            }
            try {
                inputStreamA.close();
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    inputStreamA.close();
                } catch (Exception unused2) {
                }
            }
            throw th2;
        }
    }

    public static InputStream a(String str) {
        File file = new File(str);
        return (file.isFile() && file.canRead()) ? new FileInputStream(file) : Thread.currentThread().getContextClassLoader().getResourceAsStream(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.lang.String r7, w41.C49445a r8) throws java.lang.ClassNotFoundException {
        /*
            boolean r0 = v41.C49163b.f440461c
            org.slf4j.a r1 = v41.C49163b.f440459a
            r2 = 0
            if (r0 == 0) goto L40
            r0 = 0
            java.lang.String r3 = "javax.naming.InitialContext"
            java.lang.Class<w41.a> r4 = w41.C49445a.class
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.NoClassDefFoundError -> L23 java.lang.ClassNotFoundException -> L26
            java.lang.Class.forName(r3, r0, r4)     // Catch: java.lang.NoClassDefFoundError -> L23 java.lang.ClassNotFoundException -> L26
            java.lang.String r3 = v41.C49162a.a(r7)     // Catch: java.lang.NoClassDefFoundError -> L23 java.lang.ClassNotFoundException -> L26
            if (r3 == 0) goto L41
            java.lang.String r4 = "Found {}={} in JNDI."
            r1.k(r4, r7, r3)     // Catch: java.lang.NoClassDefFoundError -> L1f java.lang.ClassNotFoundException -> L21
            goto L41
        L1f:
            r4 = move-exception
            goto L28
        L21:
            r4 = move-exception
            goto L28
        L23:
            r4 = move-exception
        L24:
            r3 = r2
            goto L28
        L26:
            r4 = move-exception
            goto L24
        L28:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "JNDI is not available: "
            r5.<init>(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r1.e(r4)
            v41.C49163b.f440461c = r0
            goto L41
        L40:
            r3 = r2
        L41:
            if (r3 != 0) goto L60
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "sentry."
            r0.<init>(r3)
            java.lang.String r3 = r7.toLowerCase()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = java.lang.System.getProperty(r0)
            if (r3 == 0) goto L60
            java.lang.String r0 = "Found {}={} in Java System Properties."
            r1.k(r0, r7, r3)
        L60:
            if (r3 != 0) goto L87
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "SENTRY_"
            r0.<init>(r3)
            java.lang.String r3 = "."
            java.lang.String r4 = "_"
            java.lang.String r3 = r7.replace(r3, r4)
            java.lang.String r3 = r3.toUpperCase()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = java.lang.System.getenv(r0)
            if (r3 == 0) goto L87
            java.lang.String r0 = "Found {}={} in System Environment Variables."
            r1.k(r0, r7, r3)
        L87:
            if (r3 != 0) goto L9b
            if (r8 == 0) goto L9b
            java.util.Map<java.lang.String, java.lang.String> r8 = r8.f441277i
            java.lang.Object r8 = r8.get(r7)
            r3 = r8
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L9b
            java.lang.String r8 = "Found {}={} in DSN."
            r1.k(r8, r7, r3)
        L9b:
            if (r3 != 0) goto Lb0
            java.util.Properties r8 = v41.C49163b.f440460b
            if (r8 == 0) goto Lb0
            java.lang.String r3 = r8.getProperty(r7)
            if (r3 == 0) goto Lb0
            java.lang.String r8 = "sentry.properties"
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r3, r8}
            r1.n(r7)
        Lb0:
            if (r3 == 0) goto Lb7
            java.lang.String r7 = r3.trim()
            return r7
        Lb7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v41.C49163b.b(java.lang.String, w41.a):java.lang.String");
    }
}
