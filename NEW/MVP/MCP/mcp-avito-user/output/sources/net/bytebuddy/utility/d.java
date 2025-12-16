package net.bytebuddy.utility;

import java.io.InputStream;
import java.lang.reflect.AnnotatedElement;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.description.annotation.AnnotationSource;
import net.bytebuddy.description.annotation.a;
import net.bytebuddy.description.d;
import net.bytebuddy.utility.dispatcher.JavaDispatcher;

/* compiled from: JavaModule.java */
/* loaded from: classes7.dex */
public class d implements d.c, AnnotationSource {

    /* renamed from: c, reason: collision with root package name */
    public static final b f418921c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f418922d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f418923e;

    /* renamed from: b, reason: collision with root package name */
    public final AnnotatedElement f418924b;

    /* compiled from: JavaModule.java */
    @JavaDispatcher.i("java.lang.Module")
    public interface a {
        @JavaDispatcher.e
        @JavaDispatcher.i("isInstance")
        boolean a();

        @JavaDispatcher.i("getResourceAsStream")
        @net.bytebuddy.utility.nullability.b
        InputStream b();

        @JavaDispatcher.i("canRead")
        boolean c();

        @JavaDispatcher.i("isExported")
        boolean d();

        @JavaDispatcher.i("isNamed")
        boolean g();

        @JavaDispatcher.i("getName")
        String getName();
    }

    /* compiled from: JavaModule.java */
    @JavaDispatcher.i("java.lang.Class")
    public interface b {
        @JavaDispatcher.i("getModule")
        @JavaDispatcher.c
        @net.bytebuddy.utility.nullability.b
        Object h();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    static {
        /*
            r0 = 0
            java.lang.String r1 = "java.security.AccessController"
            r2 = 0
            java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            java.lang.String r1 = "net.bytebuddy.securitymanager"
            java.lang.String r2 = "true"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            net.bytebuddy.utility.d.f418923e = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            goto L19
        L16:
            r0 = 1
        L17:
            net.bytebuddy.utility.d.f418923e = r0
        L19:
            java.lang.Class<net.bytebuddy.utility.d$b> r0 = net.bytebuddy.utility.d.b.class
            net.bytebuddy.utility.dispatcher.JavaDispatcher r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.a(r0)
            boolean r1 = net.bytebuddy.utility.d.f418923e
            if (r1 == 0) goto L28
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            goto L2c
        L28:
            java.lang.Object r0 = r0.run()
        L2c:
            net.bytebuddy.utility.d$b r0 = (net.bytebuddy.utility.d.b) r0
            net.bytebuddy.utility.d.f418921c = r0
            java.lang.Class<net.bytebuddy.utility.d$a> r0 = net.bytebuddy.utility.d.a.class
            net.bytebuddy.utility.dispatcher.JavaDispatcher r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.a(r0)
            if (r1 == 0) goto L3d
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            goto L41
        L3d:
            java.lang.Object r0 = r0.run()
        L41:
            net.bytebuddy.utility.d$a r0 = (net.bytebuddy.utility.d.a) r0
            net.bytebuddy.utility.d.f418922d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.utility.d.<clinit>():void");
    }

    public d(AnnotatedElement annotatedElement) {
        this.f418924b = annotatedElement;
    }

    public static boolean b() {
        return ClassFileVersion.h(ClassFileVersion.f415295g).c(ClassFileVersion.f415299k);
    }

    @net.bytebuddy.utility.nullability.b
    public static d c(Class<?> cls) {
        Object objH = f418921c.h();
        if (objH == null) {
            return null;
        }
        return new d((AnnotatedElement) objH);
    }

    @Override // net.bytebuddy.description.d
    public final String R() {
        return f418922d.getName();
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return this.f418924b.equals(((d) obj).f418924b);
        }
        return false;
    }

    @Override // net.bytebuddy.description.d.c
    public final boolean g() {
        return f418922d.g();
    }

    @Override // net.bytebuddy.description.annotation.AnnotationSource
    public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
        return new a.d(this.f418924b.getDeclaredAnnotations());
    }

    public final int hashCode() {
        return this.f418924b.hashCode();
    }

    public final String toString() {
        return this.f418924b.toString();
    }
}
