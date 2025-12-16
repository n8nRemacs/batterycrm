package net.bytebuddy.dynamic;

import androidx.camera.view.k;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.instrument.ClassFileTransformer;
import java.lang.ref.WeakReference;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.utility.d;
import net.bytebuddy.utility.dispatcher.JavaDispatcher;

/* loaded from: classes8.dex */
public interface ClassFileLocator extends Closeable {

    @HashCodeAndEqualsPlugin.Enhance
    public static class a implements ClassFileLocator, Closeable {
        @Override // net.bytebuddy.dynamic.ClassFileLocator
        public final h K(String str) {
            throw null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            getClass().hashCode();
            throw null;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class c implements ClassFileLocator {

        /* renamed from: b, reason: collision with root package name */
        public static final List<String> f416581b = Arrays.asList("lib/rt.jar", "../lib/rt.jar", "../Classes/classes.jar");

        @Override // net.bytebuddy.dynamic.ClassFileLocator
        public final h K(String str) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str.replace('.', '/'));
            sb2.append(".class");
            throw null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            getClass().hashCode();
            throw null;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class e implements ClassFileLocator {

        /* renamed from: b, reason: collision with root package name */
        public static final List<String> f416583b = Arrays.asList("jmods", "../jmods", "modules");

        @Override // net.bytebuddy.dynamic.ClassFileLocator
        public final h K(String str) {
            StringBuilder sb2 = new StringBuilder("classes/");
            sb2.append(str.replace('.', '/'));
            sb2.append(".class");
            throw null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            getClass().hashCode();
            throw null;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class g implements ClassFileLocator {
        @Override // net.bytebuddy.dynamic.ClassFileLocator
        public final h K(String str) {
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf != -1) {
                str.substring(0, iLastIndexOf);
            }
            throw null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            getClass().hashCode();
            throw null;
        }
    }

    public interface h {

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements h {

            /* renamed from: a, reason: collision with root package name */
            public final byte[] f416584a;

            @SuppressFBWarnings(justification = "The array is not modified by class contract.", value = {"EI_EXPOSE_REP2"})
            public a(byte[] bArr) {
                this.f416584a = bArr;
            }

            @Override // net.bytebuddy.dynamic.ClassFileLocator.h
            @SuppressFBWarnings(justification = "The array is not modified by class contract.", value = {"EI_EXPOSE_REP"})
            public final byte[] a() {
                return this.f416584a;
            }

            @Override // net.bytebuddy.dynamic.ClassFileLocator.h
            public final boolean b() {
                return true;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return Arrays.equals(this.f416584a, ((a) obj).f416584a);
                }
                return false;
            }

            public final int hashCode() {
                return Arrays.hashCode(this.f416584a) + (getClass().hashCode() * 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements h {

            /* renamed from: a, reason: collision with root package name */
            public final String f416585a;

            public b(String str) {
                this.f416585a = str;
            }

            @Override // net.bytebuddy.dynamic.ClassFileLocator.h
            public final byte[] a() {
                throw new IllegalStateException("Could not locate class file for " + this.f416585a);
            }

            @Override // net.bytebuddy.dynamic.ClassFileLocator.h
            public final boolean b() {
                return false;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f416585a.equals(((b) obj).f416585a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f416585a.hashCode() + (getClass().hashCode() * 31);
            }
        }

        byte[] a();

        boolean b();
    }

    h K(String str);

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForClassLoader implements ClassFileLocator {

        /* renamed from: c, reason: collision with root package name */
        public static final ClassLoader f416564c;

        /* renamed from: d, reason: collision with root package name */
        public static final boolean f416565d;

        /* renamed from: b, reason: collision with root package name */
        public final ClassLoader f416566b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class BootLoaderProxyCreationAction implements PrivilegedAction<ClassLoader> {

            /* renamed from: b, reason: collision with root package name */
            public static final BootLoaderProxyCreationAction f416567b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ BootLoaderProxyCreationAction[] f416568c;

            static {
                BootLoaderProxyCreationAction bootLoaderProxyCreationAction = new BootLoaderProxyCreationAction("INSTANCE", 0);
                f416567b = bootLoaderProxyCreationAction;
                f416568c = new BootLoaderProxyCreationAction[]{bootLoaderProxyCreationAction};
            }

            public BootLoaderProxyCreationAction() {
                throw null;
            }

            public static BootLoaderProxyCreationAction valueOf(String str) {
                return (BootLoaderProxyCreationAction) Enum.valueOf(BootLoaderProxyCreationAction.class, str);
            }

            public static BootLoaderProxyCreationAction[] values() {
                return (BootLoaderProxyCreationAction[]) f416568c.clone();
            }

            @Override // java.security.PrivilegedAction
            public final ClassLoader run() {
                return new URLClassLoader(new URL[0], null);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
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
                net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.f416565d = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.f416565d = r0
            L19:
                net.bytebuddy.dynamic.ClassFileLocator$ForClassLoader$BootLoaderProxyCreationAction r0 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.BootLoaderProxyCreationAction.f416567b
                boolean r1 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.f416565d
                if (r1 == 0) goto L24
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
                goto L28
            L24:
                java.lang.Object r0 = r0.run()
            L28:
                java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
                net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.f416564c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.<clinit>():void");
        }

        public ForClassLoader(ClassLoader classLoader) {
            this.f416566b = classLoader;
        }

        public static h a(ClassLoader classLoader, String str) throws IOException {
            InputStream resourceAsStream = classLoader.getResourceAsStream(str.replace('.', '/') + ".class");
            if (resourceAsStream == null) {
                return new h.b(str);
            }
            try {
                return new h.a(net.bytebuddy.utility.h.f418990a.a(resourceAsStream));
            } finally {
                resourceAsStream.close();
            }
        }

        public static ForClassLoader b(@net.bytebuddy.utility.nullability.b ClassLoader classLoader) {
            if (classLoader == null) {
                classLoader = f416564c;
            }
            return new ForClassLoader(classLoader);
        }

        @Override // net.bytebuddy.dynamic.ClassFileLocator
        public final h K(String str) {
            return a(this.f416566b, str);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f416566b.equals(((ForClassLoader) obj).f416566b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f416566b.hashCode() + (getClass().hashCode() * 31);
        }

        public static class a extends WeakReference<ClassLoader> implements ClassFileLocator {
            @Override // net.bytebuddy.dynamic.ClassFileLocator
            public final h K(String str) {
                ClassLoader classLoader = get();
                return classLoader == null ? new h.b(str) : ForClassLoader.a(classLoader, str);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ClassLoader classLoader = ((a) obj).get();
                return classLoader != null && get() == classLoader;
            }

            public final int hashCode() {
                return 0;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class d implements ClassFileLocator {

        /* renamed from: b, reason: collision with root package name */
        public static final Object[] f416582b = new Object[0];

        public static h a(net.bytebuddy.utility.d dVar, String str) throws IOException {
            str.replace('.', '/');
            d.a aVar = net.bytebuddy.utility.d.f418922d;
            AnnotatedElement annotatedElement = dVar.f418924b;
            InputStream inputStreamB = aVar.b();
            if (inputStreamB == null) {
                return new h.b(str);
            }
            try {
                return new h.a(net.bytebuddy.utility.h.f418990a.a(inputStreamB));
            } finally {
                inputStreamB.close();
            }
        }

        @Override // net.bytebuddy.dynamic.ClassFileLocator
        public final h K(String str) {
            return a(null, str);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            getClass().hashCode();
            throw null;
        }

        public static class a extends WeakReference<Object> implements ClassFileLocator {
            @Override // net.bytebuddy.dynamic.ClassFileLocator
            public final h K(String str) {
                Object obj = get();
                if (obj == null) {
                    return new h.b(str);
                }
                if (net.bytebuddy.utility.d.f418922d.a()) {
                    return d.a(new net.bytebuddy.utility.d((AnnotatedElement) obj), str);
                }
                throw new IllegalArgumentException(k.a(obj, "Not a Java module: "));
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Object obj2 = ((a) obj).get();
                return obj2 != null && get() == obj2;
            }

            public final int hashCode() {
                return 0;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForInstrumentation implements ClassFileLocator {

        /* renamed from: b, reason: collision with root package name */
        public static final a f416569b;

        /* renamed from: c, reason: collision with root package name */
        public static final boolean f416570c;

        public interface ClassLoadingDelegate {

            @HashCodeAndEqualsPlugin.Enhance
            public static class Default implements ClassLoadingDelegate {

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class BootLoaderProxyCreationAction implements PrivilegedAction<ClassLoader> {

                    /* renamed from: b, reason: collision with root package name */
                    public static final BootLoaderProxyCreationAction f416571b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final /* synthetic */ BootLoaderProxyCreationAction[] f416572c;

                    static {
                        BootLoaderProxyCreationAction bootLoaderProxyCreationAction = new BootLoaderProxyCreationAction("INSTANCE", 0);
                        f416571b = bootLoaderProxyCreationAction;
                        f416572c = new BootLoaderProxyCreationAction[]{bootLoaderProxyCreationAction};
                    }

                    public BootLoaderProxyCreationAction() {
                        throw null;
                    }

                    public static BootLoaderProxyCreationAction valueOf(String str) {
                        return (BootLoaderProxyCreationAction) Enum.valueOf(BootLoaderProxyCreationAction.class, str);
                    }

                    public static BootLoaderProxyCreationAction[] values() {
                        return (BootLoaderProxyCreationAction[]) f416572c.clone();
                    }

                    @Override // java.security.PrivilegedAction
                    public final ClassLoader run() {
                        return new URLClassLoader(new URL[0], null);
                    }
                }

                static {
                    BootLoaderProxyCreationAction bootLoaderProxyCreationAction = BootLoaderProxyCreationAction.f416571b;
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    throw null;
                }

                public final int hashCode() {
                    getClass().hashCode();
                    throw null;
                }
            }

            public static class ForDelegatingClassLoader extends Default {

                /* renamed from: a, reason: collision with root package name */
                public static final Dispatcher.a f416573a;

                /* renamed from: b, reason: collision with root package name */
                public static final boolean f416574b;

                public interface Dispatcher {

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    public static final class CreationAction implements PrivilegedAction<a> {

                        /* renamed from: b, reason: collision with root package name */
                        public static final CreationAction f416575b;

                        /* renamed from: c, reason: collision with root package name */
                        public static final /* synthetic */ CreationAction[] f416576c;

                        static {
                            CreationAction creationAction = new CreationAction("INSTANCE", 0);
                            f416575b = creationAction;
                            f416576c = new CreationAction[]{creationAction};
                        }

                        public CreationAction() {
                            throw null;
                        }

                        public static CreationAction valueOf(String str) {
                            return (CreationAction) Enum.valueOf(CreationAction.class, str);
                        }

                        public static CreationAction[] values() {
                            return (CreationAction[]) f416576c.clone();
                        }

                        @Override // java.security.PrivilegedAction
                        public final a run() {
                            try {
                                return new b(ClassLoader.class.getDeclaredField("classes"));
                            } catch (Exception e12) {
                                return new c(e12.getMessage());
                            }
                        }
                    }

                    public interface a {
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class b implements Dispatcher, a, PrivilegedAction<Dispatcher> {

                        /* renamed from: b, reason: collision with root package name */
                        public final Field f416577b;

                        static {
                            try {
                                Class.forName("java.security.AccessController", false, null);
                                Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
                            } catch (ClassNotFoundException | SecurityException unused) {
                            }
                        }

                        public b(Field field) {
                            this.f416577b = field;
                        }

                        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj != null && getClass() == obj.getClass()) {
                                return this.f416577b.equals(((b) obj).f416577b);
                            }
                            return false;
                        }

                        public final int hashCode() {
                            return this.f416577b.hashCode() + (getClass().hashCode() * 31);
                        }

                        @Override // java.security.PrivilegedAction
                        public final Dispatcher run() throws SecurityException {
                            this.f416577b.setAccessible(true);
                            return this;
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class c implements a {

                        /* renamed from: b, reason: collision with root package name */
                        public final String f416578b;

                        public c(String str) {
                            this.f416578b = str;
                        }

                        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj != null && getClass() == obj.getClass()) {
                                return this.f416578b.equals(((c) obj).f416578b);
                            }
                            return false;
                        }

                        public final int hashCode() {
                            return this.f416578b.hashCode() + (getClass().hashCode() * 31);
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
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
                        net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.f416574b = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                        goto L19
                    L16:
                        r0 = 1
                    L17:
                        net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.f416574b = r0
                    L19:
                        net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$ForDelegatingClassLoader$Dispatcher$CreationAction r0 = net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.CreationAction.f416575b
                        boolean r1 = net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.f416574b
                        if (r1 == 0) goto L24
                        java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
                        goto L28
                    L24:
                        java.lang.Object r0 = r0.run()
                    L28:
                        net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$ForDelegatingClassLoader$Dispatcher$a r0 = (net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.a) r0
                        net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.f416573a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.<clinit>():void");
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements ClassLoadingDelegate {
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    throw null;
                }

                public final int hashCode() {
                    getClass().hashCode();
                    throw null;
                }
            }
        }

        @JavaDispatcher.i("java.lang.instrument.Instrumentation")
        public interface a {
        }

        public static class b implements ClassFileTransformer {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
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
                net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.f416570c = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.f416570c = r0
            L19:
                java.lang.Class<net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$a> r0 = net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.a.class
                net.bytebuddy.utility.dispatcher.JavaDispatcher r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.a(r0)
                boolean r1 = net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.f416570c
                if (r1 == 0) goto L28
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
                goto L2c
            L28:
                java.lang.Object r0 = r0.run()
            L2c:
                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$a r0 = (net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.a) r0
                net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.f416569b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.<clinit>():void");
        }

        @Override // net.bytebuddy.dynamic.ClassFileLocator
        public final h K(String str) {
            try {
                throw null;
            } catch (RuntimeException e12) {
                throw e12;
            } catch (Exception unused) {
                return new h.b(str);
            }
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            getClass().hashCode();
            throw null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NoOp implements ClassFileLocator {

        /* renamed from: b, reason: collision with root package name */
        public static final NoOp f416579b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ NoOp[] f416580c;

        static {
            NoOp noOp = new NoOp("INSTANCE", 0);
            f416579b = noOp;
            f416580c = new NoOp[]{noOp};
        }

        public NoOp() {
            throw null;
        }

        public static NoOp valueOf(String str) {
            return (NoOp) Enum.valueOf(NoOp.class, str);
        }

        public static NoOp[] values() {
            return (NoOp[]) f416580c.clone();
        }

        @Override // net.bytebuddy.dynamic.ClassFileLocator
        public final h K(String str) {
            return new h.b(str);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class b implements ClassFileLocator {
        @Override // net.bytebuddy.dynamic.ClassFileLocator
        public final h K(String str) throws IOException {
            File file = new File((File) null, str.replace('.', File.separatorChar) + ".class");
            if (!file.exists()) {
                return new h.b(str);
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                return new h.a(net.bytebuddy.utility.h.f418990a.a(fileInputStream));
            } finally {
                fileInputStream.close();
            }
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            getClass().hashCode();
            throw null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class f implements ClassFileLocator {

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements PrivilegedAction<ClassLoader> {
            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                return Arrays.equals((Object[]) null, (Object[]) null);
            }

            public final int hashCode() {
                return Arrays.hashCode((Object[]) null) + (getClass().hashCode() * 31);
            }

            @Override // java.security.PrivilegedAction
            public final ClassLoader run() {
                return new URLClassLoader(null, null);
            }
        }

        static {
            try {
                Class.forName("java.security.AccessController", false, null);
                Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
            } catch (ClassNotFoundException | SecurityException unused) {
            }
        }

        @Override // net.bytebuddy.dynamic.ClassFileLocator
        public final h K(String str) {
            return ForClassLoader.a(null, str);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            getClass().hashCode();
            throw null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class i implements ClassFileLocator {
        @Override // net.bytebuddy.dynamic.ClassFileLocator
        public final h K(String str) {
            throw null;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            getClass().hashCode();
            throw null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}
