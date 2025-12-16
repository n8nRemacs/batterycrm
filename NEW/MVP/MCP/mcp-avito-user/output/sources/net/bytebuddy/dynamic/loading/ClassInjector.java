package net.bytebuddy.dynamic.loading;

import androidx.media3.common.C23088b;
import com.sun.jna.FunctionMapper;
import com.sun.jna.JNIEnv;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ReflectPermission;
import java.net.URL;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.dynamic.a;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.dynamic.loading.PackageDefinitionStrategy;
import net.bytebuddy.matcher.C44396e;
import net.bytebuddy.utility.GraalImageCode;
import net.bytebuddy.utility.dispatcher.JavaDispatcher;
import net.bytebuddy.utility.g;

/* loaded from: classes8.dex */
public interface ClassInjector {

    /* renamed from: a, reason: collision with root package name */
    public static final ReflectPermission f416701a = new ReflectPermission("suppressAccessChecks");

    @HashCodeAndEqualsPlugin.Enhance
    public static class UsingInstrumentation extends b {

        /* renamed from: d, reason: collision with root package name */
        public static final a f416702d;

        /* renamed from: e, reason: collision with root package name */
        public static final boolean f416703e;

        /* renamed from: b, reason: collision with root package name */
        public final Target f416704b;

        /* renamed from: c, reason: collision with root package name */
        public final g f416705c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static abstract class Target {

            /* renamed from: c, reason: collision with root package name */
            public static final Target f416706c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ Target[] f416707d;

            /* renamed from: b, reason: collision with root package name */
            @net.bytebuddy.utility.nullability.b
            public final ClassLoader f416708b;

            public enum a extends Target {
            }

            public enum b extends Target {
            }

            static {
                a aVar = new a("BOOTSTRAP", 0, null, null);
                f416706c = aVar;
                f416707d = new Target[]{aVar, new b("SYSTEM", 1, ClassLoader.getSystemClassLoader(), null)};
            }

            public Target() {
                throw null;
            }

            public Target(String str, int i12, ClassLoader classLoader, a aVar) {
                this.f416708b = classLoader;
            }

            public static Target valueOf(String str) {
                return (Target) Enum.valueOf(Target.class, str);
            }

            public static Target[] values() {
                return (Target[]) f416707d.clone();
            }
        }

        @JavaDispatcher.i("java.lang.instrument.Instrumentation")
        public interface a {
            @JavaDispatcher.i("appendToBootstrapClassLoaderSearch")
            void a();
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
                net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.f416703e = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.f416703e = r0
            L19:
                java.lang.Class<net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation$a> r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.a.class
                net.bytebuddy.utility.dispatcher.JavaDispatcher r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.a(r0)
                boolean r1 = net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.f416703e
                if (r1 == 0) goto L28
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
                goto L2c
            L28:
                java.lang.Object r0 = r0.run()
            L2c:
                net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation$a r0 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.a) r0
                net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.f416702d = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.<clinit>():void");
        }

        public UsingInstrumentation(Target target, g gVar) {
            this.f416704b = target;
            this.f416705c = gVar;
        }

        @Override // net.bytebuddy.dynamic.loading.ClassInjector
        public final HashMap b(LinkedHashMap linkedHashMap) {
            Target target = this.f416704b;
            File file = new File((File) null, "jar" + this.f416705c.c() + ".jar");
            try {
                if (!file.createNewFile()) {
                    throw new IllegalStateException("Cannot create file " + file);
                }
                try {
                    JarOutputStream jarOutputStream = new JarOutputStream(new FileOutputStream(file));
                    try {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            jarOutputStream.putNextEntry(new JarEntry(((String) entry.getKey()).replace('.', '/') + ".class"));
                            jarOutputStream.write((byte[]) entry.getValue());
                        }
                        jarOutputStream.close();
                        JarFile jarFile = new JarFile(file, false);
                        try {
                            ((Target.a) target).getClass();
                            f416702d.a();
                            jarFile.close();
                            HashMap map = new HashMap();
                            for (String str : linkedHashMap.keySet()) {
                                map.put(str, Class.forName(str, false, target.f416708b));
                            }
                            return map;
                        } catch (Throwable th2) {
                            jarFile.close();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        jarOutputStream.close();
                        throw th3;
                    }
                } finally {
                    if (!file.delete()) {
                        file.deleteOnExit();
                    }
                }
            } catch (IOException e12) {
                throw new IllegalStateException("Cannot write jar file to disk", e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException("Cannot load injected class", e13);
            }
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            if (this.f416704b.equals(((UsingInstrumentation) obj).f416704b)) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            getClass().hashCode();
            throw null;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class UsingJna extends b {

        /* renamed from: b, reason: collision with root package name */
        public static final Dispatcher f416709b;

        /* renamed from: c, reason: collision with root package name */
        public static final Object f416710c;

        /* renamed from: d, reason: collision with root package name */
        public static final boolean f416711d;

        public interface Dispatcher {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class CreationAction implements PrivilegedAction<Dispatcher> {

                /* renamed from: b, reason: collision with root package name */
                public static final CreationAction f416712b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ CreationAction[] f416713c;

                static {
                    CreationAction creationAction = new CreationAction("INSTANCE", 0);
                    f416712b = creationAction;
                    f416713c = new CreationAction[]{creationAction};
                }

                public CreationAction() {
                    throw null;
                }

                public static Dispatcher a() {
                    if (System.getProperty("java.vm.name", "").toUpperCase(Locale.US).contains("J9")) {
                        return new c("J9 does not support JNA-based class definition");
                    }
                    try {
                        HashMap map = new HashMap();
                        map.put("allow-objects", Boolean.TRUE);
                        if (Platform.isWindows() && !Platform.is64Bit()) {
                            map.put("function-mapper", Windows32BitFunctionMapper.f416714b);
                        }
                        return new a((b) Native.loadLibrary("jvm", b.class, map));
                    } catch (Throwable th2) {
                        return new c(th2.getMessage());
                    }
                }

                public static CreationAction valueOf(String str) {
                    return (CreationAction) Enum.valueOf(CreationAction.class, str);
                }

                public static CreationAction[] values() {
                    return (CreationAction[]) f416713c.clone();
                }

                @Override // java.security.PrivilegedAction
                public final /* bridge */ /* synthetic */ Dispatcher run() {
                    return a();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Windows32BitFunctionMapper implements FunctionMapper {

                /* renamed from: b, reason: collision with root package name */
                public static final Windows32BitFunctionMapper f416714b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ Windows32BitFunctionMapper[] f416715c;

                static {
                    Windows32BitFunctionMapper windows32BitFunctionMapper = new Windows32BitFunctionMapper("INSTANCE", 0);
                    f416714b = windows32BitFunctionMapper;
                    f416715c = new Windows32BitFunctionMapper[]{windows32BitFunctionMapper};
                }

                public Windows32BitFunctionMapper() {
                    throw null;
                }

                public static Windows32BitFunctionMapper valueOf(String str) {
                    return (Windows32BitFunctionMapper) Enum.valueOf(Windows32BitFunctionMapper.class, str);
                }

                public static Windows32BitFunctionMapper[] values() {
                    return (Windows32BitFunctionMapper[]) f416715c.clone();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements Dispatcher {

                /* renamed from: a, reason: collision with root package name */
                public final b f416716a;

                public a(b bVar) {
                    this.f416716a = bVar;
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher
                public final Class a(String str, byte[] bArr) {
                    b bVar = this.f416716a;
                    JNIEnv jNIEnv = JNIEnv.CURRENT;
                    str.replace('.', '/');
                    int length = bArr.length;
                    return bVar.a();
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f416716a.equals(((a) obj).f416716a);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f416716a.hashCode() + (getClass().hashCode() * 31);
                }
            }

            public interface b extends Library {
                Class a();
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class c implements Dispatcher {

                /* renamed from: a, reason: collision with root package name */
                public final String f416717a;

                public c(String str) {
                    this.f416717a = str;
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher
                public final Class a(String str, byte[] bArr) {
                    throw new UnsupportedOperationException("JNA is not available and JNA-based injection cannot be used: " + this.f416717a);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f416717a.equals(((c) obj).f416717a);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f416717a.hashCode() + (getClass().hashCode() * 31);
                }
            }

            Class a(String str, byte[] bArr);
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
                net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.f416711d = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.f416711d = r0
            L19:
                net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$CreationAction r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.CreationAction.f416712b
                boolean r1 = net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.f416711d
                if (r1 == 0) goto L24
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
                goto L28
            L24:
                net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.CreationAction.a()
            L28:
                net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher r0 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher) r0
                net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.f416709b = r0
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.f416710c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.<clinit>():void");
        }

        @Override // net.bytebuddy.dynamic.loading.ClassInjector
        public final HashMap b(LinkedHashMap linkedHashMap) {
            HashMap map = new HashMap();
            synchronized (f416710c) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    try {
                        map.put(entry.getKey(), Class.forName((String) entry.getKey(), false, null));
                    } catch (ClassNotFoundException unused) {
                        map.put(entry.getKey(), f416709b.a((String) entry.getKey(), (byte[]) entry.getValue()));
                    }
                }
            }
            return map;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return getClass().hashCode() * 961;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class UsingReflection extends b {

        /* renamed from: f, reason: collision with root package name */
        public static final Dispatcher.b f416718f;

        /* renamed from: g, reason: collision with root package name */
        public static final a f416719g;

        /* renamed from: h, reason: collision with root package name */
        public static final Method f416720h;

        /* renamed from: i, reason: collision with root package name */
        public static final boolean f416721i;

        /* renamed from: b, reason: collision with root package name */
        public final ClassLoader f416722b;

        /* renamed from: c, reason: collision with root package name */
        @HashCodeAndEqualsPlugin.ValueHandling
        @net.bytebuddy.utility.nullability.b
        public final ProtectionDomain f416723c;

        /* renamed from: d, reason: collision with root package name */
        public final Enum f416724d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f416725e;

        @JavaDispatcher.i("java.lang.System")
        public interface a {
            @JavaDispatcher.h
            @net.bytebuddy.utility.nullability.b
            @JavaDispatcher.i("getSecurityManager")
            @JavaDispatcher.c
            Object a();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
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
                net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.f416721i = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.f416721i = r0
            L19:
                net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$CreationAction r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.CreationAction.f416726b
                boolean r1 = net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.f416721i
                if (r1 == 0) goto L24
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
                goto L28
            L24:
                java.lang.Object r0 = r0.run()
            L28:
                net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$b r0 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.b) r0
                net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.f416718f = r0
                java.lang.Class<net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$a> r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.a.class
                net.bytebuddy.utility.dispatcher.JavaDispatcher r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.a(r0)
                if (r1 == 0) goto L39
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
                goto L3d
            L39:
                java.lang.Object r0 = r0.run()
            L3d:
                net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$a r0 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.a) r0
                net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.f416719g = r0
                net.bytebuddy.utility.privilege.a r0 = new net.bytebuddy.utility.privilege.a
                java.lang.Class<java.security.Permission> r2 = java.security.Permission.class
                java.lang.Class[] r2 = new java.lang.Class[]{r2}
                r0.<init>(r2)
                if (r1 == 0) goto L53
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
                goto L57
            L53:
                java.lang.Object r0 = r0.run()
            L57:
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.f416720h = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.<clinit>():void");
        }

        public UsingReflection(ClassLoader classLoader) {
            this(classLoader, null, PackageDefinitionStrategy.Trivial.f416806b, false);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
        /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Enum, net.bytebuddy.dynamic.loading.PackageDefinitionStrategy] */
        @Override // net.bytebuddy.dynamic.loading.ClassInjector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.HashMap b(java.util.LinkedHashMap r20) {
            /*
                Method dump skipped, instructions count: 327
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.b(java.util.LinkedHashMap):java.util.HashMap");
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
        
            if (r2 != null) goto L24;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(@net.bytebuddy.utility.nullability.b java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L13
                return r1
            L13:
                net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection r5 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection) r5
                boolean r2 = r5.f416725e
                boolean r3 = r4.f416725e
                if (r3 == r2) goto L1c
                return r1
            L1c:
                java.lang.ClassLoader r2 = r4.f416722b
                java.lang.ClassLoader r3 = r5.f416722b
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L27
                return r1
            L27:
                java.security.ProtectionDomain r2 = r4.f416723c
                java.security.ProtectionDomain r3 = r5.f416723c
                if (r3 == 0) goto L36
                if (r2 == 0) goto L38
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L39
                return r1
            L36:
                if (r2 == 0) goto L39
            L38:
                return r1
            L39:
                java.lang.Enum r2 = r4.f416724d
                java.lang.Enum r5 = r5.f416724d
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L44
                return r1
            L44:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            int iHashCode = (this.f416722b.hashCode() + (getClass().hashCode() * 31)) * 31;
            ProtectionDomain protectionDomain = this.f416723c;
            if (protectionDomain != null) {
                iHashCode += protectionDomain.hashCode();
            }
            return ((this.f416724d.hashCode() + (iHashCode * 31)) * 31) + (this.f416725e ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UsingReflection(ClassLoader classLoader, @net.bytebuddy.utility.nullability.b ProtectionDomain protectionDomain, PackageDefinitionStrategy packageDefinitionStrategy, boolean z12) {
            if (classLoader == null) {
                throw new IllegalArgumentException("Cannot inject classes into the bootstrap class loader");
            }
            this.f416722b = classLoader;
            this.f416723c = protectionDomain;
            this.f416724d = (Enum) packageDefinitionStrategy;
            this.f416725e = z12;
        }

        public interface Dispatcher {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class CreationAction implements PrivilegedAction<b> {

                /* renamed from: b, reason: collision with root package name */
                public static final CreationAction f416726b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ CreationAction[] f416727c;

                static {
                    CreationAction creationAction = new CreationAction("INSTANCE", 0);
                    f416726b = creationAction;
                    f416727c = new CreationAction[]{creationAction};
                }

                public CreationAction() {
                    throw null;
                }

                public static CreationAction valueOf(String str) {
                    return (CreationAction) Enum.valueOf(CreationAction.class, str);
                }

                public static CreationAction[] values() {
                    return (CreationAction[]) f416727c.clone();
                }

                @Override // java.security.PrivilegedAction
                @SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
                public final b run() {
                    b.a aVar;
                    try {
                        return net.bytebuddy.utility.d.b() ? UsingUnsafe.f416749d.b() ? d.i() : e.i() : a.i();
                    } catch (InvocationTargetException e12) {
                        aVar = new b.a(e12.getTargetException().getMessage());
                        return aVar;
                    } catch (Exception e13) {
                        aVar = new b.a(e13.getMessage());
                        return aVar;
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class d implements Dispatcher, b {

                /* renamed from: a, reason: collision with root package name */
                public final Object f416736a;

                /* renamed from: b, reason: collision with root package name */
                public final Method f416737b;

                /* renamed from: c, reason: collision with root package name */
                public final Method f416738c;

                /* renamed from: d, reason: collision with root package name */
                @net.bytebuddy.utility.nullability.d
                public final Method f416739d;

                /* renamed from: e, reason: collision with root package name */
                public final Method f416740e;

                /* renamed from: f, reason: collision with root package name */
                public final Method f416741f;

                /* renamed from: g, reason: collision with root package name */
                public final Method f416742g;

                public d(Object obj, Method method, Method method2, @net.bytebuddy.utility.nullability.b Method method3, Method method4, Method method5, Method method6) {
                    this.f416736a = obj;
                    this.f416737b = method;
                    this.f416738c = method2;
                    this.f416739d = method3;
                    this.f416740e = method4;
                    this.f416741f = method5;
                    this.f416742g = method6;
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x0256  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0261  */
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuring privilege is explicit user responsibility.", value = {"DP_DO_INSIDE_DO_PRIVILEGED"})
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public static net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.b i() throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
                    /*
                        Method dump skipped, instructions count: 678
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.d.i():net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$b");
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.b
                public final Dispatcher a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    Object objA = UsingReflection.f416719g.a();
                    if (objA != null) {
                        try {
                            UsingReflection.f416720h.invoke(objA, ClassInjector.f416701a);
                        } catch (InvocationTargetException e12) {
                            return new c(e12.getTargetException().getMessage());
                        } catch (Exception e13) {
                            return new c(e13.getMessage());
                        }
                    }
                    return this;
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.b
                public final boolean b() {
                    return true;
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public final Package c(ClassLoader classLoader, String str, @net.bytebuddy.utility.nullability.b String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String str4, @net.bytebuddy.utility.nullability.b String str5, @net.bytebuddy.utility.nullability.b String str6, @net.bytebuddy.utility.nullability.b String str7, @net.bytebuddy.utility.nullability.b URL url) {
                    try {
                        return (Package) this.f416741f.invoke(this.f416736a, classLoader, str, str2, str3, str4, str5, str6, str7, url);
                    } catch (IllegalAccessException e12) {
                        throw new IllegalStateException(e12);
                    } catch (InvocationTargetException e13) {
                        throw new IllegalStateException(e13.getTargetException());
                    }
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                @net.bytebuddy.utility.nullability.b
                public final Package d(ClassLoader classLoader, String str) {
                    Method method = this.f416739d;
                    if (method == null) {
                        return h(classLoader, str);
                    }
                    try {
                        return (Package) method.invoke(this.f416736a, classLoader, str);
                    } catch (IllegalAccessException e12) {
                        throw new IllegalStateException(e12);
                    } catch (InvocationTargetException e13) {
                        throw new IllegalStateException(e13.getTargetException());
                    }
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public final Class<?> e(ClassLoader classLoader, String str, byte[] bArr, @net.bytebuddy.utility.nullability.b ProtectionDomain protectionDomain) {
                    try {
                        return (Class) this.f416738c.invoke(this.f416736a, classLoader, str, bArr, 0, Integer.valueOf(bArr.length), protectionDomain);
                    } catch (IllegalAccessException e12) {
                        throw new IllegalStateException(e12);
                    } catch (InvocationTargetException e13) {
                        throw new IllegalStateException(e13.getTargetException());
                    }
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return this.f416736a.equals(dVar.f416736a) && this.f416737b.equals(dVar.f416737b) && this.f416738c.equals(dVar.f416738c) && this.f416739d.equals(dVar.f416739d) && this.f416740e.equals(dVar.f416740e) && this.f416741f.equals(dVar.f416741f) && this.f416742g.equals(dVar.f416742g);
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public final Object f(ClassLoader classLoader, String str) {
                    try {
                        return this.f416742g.invoke(this.f416736a, classLoader, str);
                    } catch (IllegalAccessException e12) {
                        throw new IllegalStateException(e12);
                    } catch (InvocationTargetException e13) {
                        throw new IllegalStateException(e13.getTargetException());
                    }
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public final Class<?> g(ClassLoader classLoader, String str) {
                    try {
                        return (Class) this.f416737b.invoke(this.f416736a, classLoader, str);
                    } catch (IllegalAccessException e12) {
                        throw new IllegalStateException(e12);
                    } catch (InvocationTargetException e13) {
                        throw new IllegalStateException(e13.getTargetException());
                    }
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public final Package h(ClassLoader classLoader, String str) {
                    try {
                        return (Package) this.f416740e.invoke(this.f416736a, classLoader, str);
                    } catch (IllegalAccessException e12) {
                        throw new IllegalStateException(e12);
                    } catch (InvocationTargetException e13) {
                        throw new IllegalStateException(e13.getTargetException());
                    }
                }

                public final int hashCode() {
                    return this.f416742g.hashCode() + ((this.f416741f.hashCode() + ((this.f416740e.hashCode() + ((this.f416739d.hashCode() + ((this.f416738c.hashCode() + ((this.f416737b.hashCode() + C23088b.a(getClass().hashCode() * 31, 31, this.f416736a)) * 31)) * 31)) * 31)) * 31)) * 31);
                }
            }

            Package c(ClassLoader classLoader, String str, @net.bytebuddy.utility.nullability.b String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String str4, @net.bytebuddy.utility.nullability.b String str5, @net.bytebuddy.utility.nullability.b String str6, @net.bytebuddy.utility.nullability.b String str7, @net.bytebuddy.utility.nullability.b URL url);

            @net.bytebuddy.utility.nullability.b
            Package d(ClassLoader classLoader, String str);

            Class<?> e(ClassLoader classLoader, String str, byte[] bArr, @net.bytebuddy.utility.nullability.b ProtectionDomain protectionDomain);

            Object f(ClassLoader classLoader, String str);

            @net.bytebuddy.utility.nullability.b
            Class<?> g(ClassLoader classLoader, String str);

            @net.bytebuddy.utility.nullability.b
            Package h(ClassLoader classLoader, String str);

            public interface b {
                Dispatcher a();

                boolean b();

                @HashCodeAndEqualsPlugin.Enhance
                public static class a implements Dispatcher, b {

                    /* renamed from: a, reason: collision with root package name */
                    public final String f416734a;

                    public a(String str) {
                        this.f416734a = str;
                    }

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.b
                    public final boolean b() {
                        return false;
                    }

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public final Package c(ClassLoader classLoader, String str, @net.bytebuddy.utility.nullability.b String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String str4, @net.bytebuddy.utility.nullability.b String str5, @net.bytebuddy.utility.nullability.b String str6, @net.bytebuddy.utility.nullability.b String str7, @net.bytebuddy.utility.nullability.b URL url) {
                        throw new UnsupportedOperationException("Cannot define package using injection: " + this.f416734a);
                    }

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public final Package d(ClassLoader classLoader, String str) {
                        throw new UnsupportedOperationException("Cannot get defined package using reflection: " + this.f416734a);
                    }

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public final Class<?> e(ClassLoader classLoader, String str, byte[] bArr, @net.bytebuddy.utility.nullability.b ProtectionDomain protectionDomain) {
                        throw new UnsupportedOperationException("Cannot define class using reflection: " + this.f416734a);
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f416734a.equals(((a) obj).f416734a);
                        }
                        return false;
                    }

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public final Class<?> g(ClassLoader classLoader, String str) {
                        try {
                            return classLoader.loadClass(str);
                        } catch (ClassNotFoundException unused) {
                            return null;
                        }
                    }

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public final Package h(ClassLoader classLoader, String str) {
                        throw new UnsupportedOperationException("Cannot get package using reflection: " + this.f416734a);
                    }

                    public final int hashCode() {
                        return this.f416734a.hashCode() + (getClass().hashCode() * 31);
                    }

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.b
                    public final Dispatcher a() {
                        return this;
                    }

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public final Object f(ClassLoader classLoader, String str) {
                        return classLoader;
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static abstract class a implements Dispatcher, b {

                /* renamed from: a, reason: collision with root package name */
                public final Method f416728a;

                /* renamed from: b, reason: collision with root package name */
                public final Method f416729b;

                /* renamed from: c, reason: collision with root package name */
                @net.bytebuddy.utility.nullability.d
                public final Method f416730c;

                /* renamed from: d, reason: collision with root package name */
                public final Method f416731d;

                /* renamed from: e, reason: collision with root package name */
                public final Method f416732e;

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$a$a, reason: collision with other inner class name */
                public static class C12046a extends a {

                    /* renamed from: f, reason: collision with root package name */
                    public final Method f416733f;

                    public C12046a(Method method, Method method2, @net.bytebuddy.utility.nullability.b Method method3, Method method4, Method method5, Method method6) {
                        super(method, method2, method3, method4, method5);
                        this.f416733f = method6;
                    }

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.a
                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (!super.equals(obj)) {
                            return false;
                        }
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f416733f.equals(((C12046a) obj).f416733f);
                        }
                        return false;
                    }

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public final Object f(ClassLoader classLoader, String str) {
                        try {
                            return this.f416733f.invoke(classLoader, str);
                        } catch (IllegalAccessException e12) {
                            throw new IllegalStateException(e12);
                        } catch (InvocationTargetException e13) {
                            throw new IllegalStateException(e13.getTargetException());
                        }
                    }

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.a
                    public final int hashCode() {
                        return this.f416733f.hashCode() + (super.hashCode() * 31);
                    }
                }

                public a(Method method, Method method2, @net.bytebuddy.utility.nullability.b Method method3, Method method4, Method method5) {
                    this.f416728a = method;
                    this.f416729b = method2;
                    this.f416730c = method3;
                    this.f416731d = method4;
                    this.f416732e = method5;
                }

                @SuppressFBWarnings(justification = "Assuring privilege is explicit user responsibility.", value = {"DP_DO_INSIDE_DO_PRIVILEGED"})
                public static a i() throws NoSuchMethodException, SecurityException {
                    Method method = null;
                    if (net.bytebuddy.utility.d.b()) {
                        try {
                            method = ClassLoader.class.getMethod("getDefinedPackage", String.class);
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    Method declaredMethod = ClassLoader.class.getDeclaredMethod("getPackage", String.class);
                    declaredMethod.setAccessible(true);
                    Method declaredMethod2 = ClassLoader.class.getDeclaredMethod("findLoadedClass", String.class);
                    declaredMethod2.setAccessible(true);
                    Class cls = Integer.TYPE;
                    Method declaredMethod3 = ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, cls, cls, ProtectionDomain.class);
                    declaredMethod3.setAccessible(true);
                    Method declaredMethod4 = ClassLoader.class.getDeclaredMethod("definePackage", String.class, String.class, String.class, String.class, String.class, String.class, String.class, URL.class);
                    declaredMethod4.setAccessible(true);
                    try {
                        Method declaredMethod5 = ClassLoader.class.getDeclaredMethod("getClassLoadingLock", String.class);
                        declaredMethod5.setAccessible(true);
                        return new C12046a(declaredMethod2, declaredMethod3, method, declaredMethod, declaredMethod4, declaredMethod5);
                    } catch (NoSuchMethodException unused2) {
                        return new b(declaredMethod2, declaredMethod3, method, declaredMethod, declaredMethod4);
                    }
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.b
                public final Dispatcher a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    Object objA = UsingReflection.f416719g.a();
                    if (objA != null) {
                        try {
                            UsingReflection.f416720h.invoke(objA, ClassInjector.f416701a);
                        } catch (InvocationTargetException e12) {
                            return new c(e12.getTargetException().getMessage());
                        } catch (Exception e13) {
                            return new c(e13.getMessage());
                        }
                    }
                    return this;
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.b
                public final boolean b() {
                    return true;
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public final Package c(ClassLoader classLoader, String str, @net.bytebuddy.utility.nullability.b String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String str4, @net.bytebuddy.utility.nullability.b String str5, @net.bytebuddy.utility.nullability.b String str6, @net.bytebuddy.utility.nullability.b String str7, @net.bytebuddy.utility.nullability.b URL url) {
                    try {
                        return (Package) this.f416732e.invoke(classLoader, str, str2, str3, str4, str5, str6, str7, url);
                    } catch (IllegalAccessException e12) {
                        throw new IllegalStateException(e12);
                    } catch (InvocationTargetException e13) {
                        throw new IllegalStateException(e13.getTargetException());
                    }
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                @net.bytebuddy.utility.nullability.b
                public final Package d(ClassLoader classLoader, String str) {
                    Method method = this.f416730c;
                    if (method == null) {
                        return h(classLoader, str);
                    }
                    try {
                        return (Package) method.invoke(classLoader, str);
                    } catch (IllegalAccessException e12) {
                        throw new IllegalStateException(e12);
                    } catch (InvocationTargetException e13) {
                        throw new IllegalStateException(e13.getTargetException());
                    }
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public final Class<?> e(ClassLoader classLoader, String str, byte[] bArr, @net.bytebuddy.utility.nullability.b ProtectionDomain protectionDomain) {
                    try {
                        return (Class) this.f416729b.invoke(classLoader, str, bArr, 0, Integer.valueOf(bArr.length), protectionDomain);
                    } catch (IllegalAccessException e12) {
                        throw new IllegalStateException(e12);
                    } catch (InvocationTargetException e13) {
                        throw new IllegalStateException(e13.getTargetException());
                    }
                }

                public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.f416728a.equals(aVar.f416728a) && this.f416729b.equals(aVar.f416729b) && this.f416730c.equals(aVar.f416730c) && this.f416731d.equals(aVar.f416731d) && this.f416732e.equals(aVar.f416732e);
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public final Class<?> g(ClassLoader classLoader, String str) {
                    try {
                        return (Class) this.f416728a.invoke(classLoader, str);
                    } catch (IllegalAccessException e12) {
                        throw new IllegalStateException(e12);
                    } catch (InvocationTargetException e13) {
                        throw new IllegalStateException(e13.getTargetException());
                    }
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public final Package h(ClassLoader classLoader, String str) {
                    try {
                        return (Package) this.f416731d.invoke(classLoader, str);
                    } catch (IllegalAccessException e12) {
                        throw new IllegalStateException(e12);
                    } catch (InvocationTargetException e13) {
                        throw new IllegalStateException(e13.getTargetException());
                    }
                }

                public int hashCode() {
                    return this.f416732e.hashCode() + ((this.f416731d.hashCode() + ((this.f416730c.hashCode() + ((this.f416729b.hashCode() + ((this.f416728a.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
                }

                public static class b extends a {
                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public final Object f(ClassLoader classLoader, String str) {
                        return classLoader;
                    }
                }
            }

            public static abstract class e implements Dispatcher, b {

                /* renamed from: a, reason: collision with root package name */
                public final Method f416743a;

                /* renamed from: b, reason: collision with root package name */
                public final Method f416744b;

                /* renamed from: c, reason: collision with root package name */
                @net.bytebuddy.utility.nullability.b
                public final Method f416745c;

                /* renamed from: d, reason: collision with root package name */
                public final Method f416746d;

                /* renamed from: e, reason: collision with root package name */
                public final Method f416747e;

                @HashCodeAndEqualsPlugin.Enhance
                public static class a extends e {

                    /* renamed from: f, reason: collision with root package name */
                    public final Method f416748f;

                    public a(Method method, Method method2, @net.bytebuddy.utility.nullability.b Method method3, Method method4, Method method5, Method method6) {
                        super(method, method2, method3, method4, method5);
                        this.f416748f = method6;
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f416748f.equals(((a) obj).f416748f);
                        }
                        return false;
                    }

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public final Object f(ClassLoader classLoader, String str) {
                        try {
                            return this.f416748f.invoke(classLoader, str);
                        } catch (IllegalAccessException e12) {
                            throw new IllegalStateException(e12);
                        } catch (InvocationTargetException e13) {
                            throw new IllegalStateException(e13.getTargetException());
                        }
                    }

                    public final int hashCode() {
                        return this.f416748f.hashCode() + (getClass().hashCode() * 31);
                    }
                }

                public e(Method method, Method method2, @net.bytebuddy.utility.nullability.b Method method3, Method method4, Method method5) {
                    this.f416743a = method;
                    this.f416744b = method2;
                    this.f416745c = method3;
                    this.f416746d = method4;
                    this.f416747e = method5;
                }

                @SuppressFBWarnings(justification = "Assuring privilege is explicit user responsibility.", value = {"DP_DO_INSIDE_DO_PRIVILEGED"})
                public static b i() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
                    Field declaredField;
                    Method method;
                    Method declaredMethod;
                    if (Boolean.parseBoolean(System.getProperty("net.bytebuddy.safe", Boolean.toString(GraalImageCode.a().f418861b)))) {
                        return new b.a("Use of Unsafe was disabled by system property");
                    }
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField2 = cls.getDeclaredField("theUnsafe");
                    declaredField2.setAccessible(true);
                    Method method2 = null;
                    Object obj = declaredField2.get(null);
                    try {
                        declaredField = AccessibleObject.class.getDeclaredField("override");
                    } catch (NoSuchFieldException unused) {
                        a.InterfaceC12009a<S> interfaceC12009aX = ((a.InterfaceC12009a.AbstractC12010a) new ByteBuddy().a(TypeDescription.d.A0(AccessibleObject.class), ClassFileLocator.ForClassLoader.b(AccessibleObject.class.getClassLoader())).L("net.bytebuddy.mirror.AccessibleObject")).x(net.bytebuddy.dynamic.c.f416659a);
                        net.bytebuddy.asm.b bVar = new net.bytebuddy.asm.b();
                        declaredField = interfaceC12009aX.r(new net.bytebuddy.asm.b(bVar.f415921b, bVar.f415922c.d(C44396e.f418422c))).p().l6(AccessibleObject.class.getClassLoader(), ClassLoadingStrategy.Default.f416767c).a().getDeclaredField("override");
                    }
                    Long l12 = (Long) cls.getMethod("objectFieldOffset", Field.class).invoke(obj, declaredField);
                    l12.getClass();
                    Method method3 = cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
                    if (net.bytebuddy.utility.d.b()) {
                        try {
                            method2 = ClassLoader.class.getMethod("getDefinedPackage", String.class);
                        } catch (NoSuchMethodException unused2) {
                        }
                    }
                    Method declaredMethod2 = ClassLoader.class.getDeclaredMethod("getPackage", String.class);
                    Boolean bool = Boolean.TRUE;
                    method3.invoke(obj, declaredMethod2, l12, bool);
                    Method declaredMethod3 = ClassLoader.class.getDeclaredMethod("findLoadedClass", String.class);
                    Class cls2 = Integer.TYPE;
                    Method declaredMethod4 = ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, cls2, cls2, ProtectionDomain.class);
                    Method declaredMethod5 = ClassLoader.class.getDeclaredMethod("definePackage", String.class, String.class, String.class, String.class, String.class, String.class, String.class, URL.class);
                    method3.invoke(obj, declaredMethod4, l12, bool);
                    method3.invoke(obj, declaredMethod3, l12, bool);
                    method3.invoke(obj, declaredMethod5, l12, bool);
                    try {
                        declaredMethod = ClassLoader.class.getDeclaredMethod("getClassLoadingLock", String.class);
                        method3.invoke(obj, declaredMethod, l12, bool);
                        method = declaredMethod5;
                    } catch (NoSuchMethodException unused3) {
                        method = declaredMethod5;
                    }
                    try {
                        return new a(declaredMethod3, declaredMethod4, method2, declaredMethod2, declaredMethod5, declaredMethod);
                    } catch (NoSuchMethodException unused4) {
                        return new b(declaredMethod3, declaredMethod4, method2, declaredMethod2, method);
                    }
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.b
                public final Dispatcher a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    Object objA = UsingReflection.f416719g.a();
                    if (objA != null) {
                        try {
                            UsingReflection.f416720h.invoke(objA, ClassInjector.f416701a);
                        } catch (InvocationTargetException e12) {
                            return new c(e12.getTargetException().getMessage());
                        } catch (Exception e13) {
                            return new c(e13.getMessage());
                        }
                    }
                    return this;
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.b
                public final boolean b() {
                    return true;
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public final Package c(ClassLoader classLoader, String str, @net.bytebuddy.utility.nullability.b String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String str4, @net.bytebuddy.utility.nullability.b String str5, @net.bytebuddy.utility.nullability.b String str6, @net.bytebuddy.utility.nullability.b String str7, @net.bytebuddy.utility.nullability.b URL url) {
                    try {
                        return (Package) this.f416747e.invoke(classLoader, str, str2, str3, str4, str5, str6, str7, url);
                    } catch (IllegalAccessException e12) {
                        throw new IllegalStateException(e12);
                    } catch (InvocationTargetException e13) {
                        throw new IllegalStateException(e13.getTargetException());
                    }
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                @net.bytebuddy.utility.nullability.b
                public final Package d(ClassLoader classLoader, String str) {
                    Method method = this.f416745c;
                    if (method == null) {
                        return h(classLoader, str);
                    }
                    try {
                        return (Package) method.invoke(classLoader, str);
                    } catch (IllegalAccessException e12) {
                        throw new IllegalStateException(e12);
                    } catch (InvocationTargetException e13) {
                        throw new IllegalStateException(e13.getTargetException());
                    }
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public final Class<?> e(ClassLoader classLoader, String str, byte[] bArr, @net.bytebuddy.utility.nullability.b ProtectionDomain protectionDomain) {
                    try {
                        return (Class) this.f416744b.invoke(classLoader, str, bArr, 0, Integer.valueOf(bArr.length), protectionDomain);
                    } catch (IllegalAccessException e12) {
                        throw new IllegalStateException(e12);
                    } catch (InvocationTargetException e13) {
                        throw new IllegalStateException(e13.getTargetException());
                    }
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public final Class<?> g(ClassLoader classLoader, String str) {
                    try {
                        return (Class) this.f416743a.invoke(classLoader, str);
                    } catch (IllegalAccessException e12) {
                        throw new IllegalStateException(e12);
                    } catch (InvocationTargetException e13) {
                        throw new IllegalStateException(e13.getTargetException());
                    }
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public final Package h(ClassLoader classLoader, String str) {
                    try {
                        return (Package) this.f416746d.invoke(classLoader, str);
                    } catch (IllegalAccessException e12) {
                        throw new IllegalStateException(e12);
                    } catch (InvocationTargetException e13) {
                        throw new IllegalStateException(e13.getTargetException());
                    }
                }

                public static class b extends e {
                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public final Object f(ClassLoader classLoader, String str) {
                        return classLoader;
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class c implements Dispatcher {

                /* renamed from: a, reason: collision with root package name */
                public final String f416735a;

                public c(String str) {
                    this.f416735a = str;
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public final Package c(ClassLoader classLoader, String str, @net.bytebuddy.utility.nullability.b String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String str4, @net.bytebuddy.utility.nullability.b String str5, @net.bytebuddy.utility.nullability.b String str6, @net.bytebuddy.utility.nullability.b String str7, @net.bytebuddy.utility.nullability.b URL url) {
                    throw new UnsupportedOperationException("Cannot define package using injection: " + this.f416735a);
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public final Package d(ClassLoader classLoader, String str) {
                    throw new UnsupportedOperationException("Cannot get defined package using reflection: " + this.f416735a);
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public final Class<?> e(ClassLoader classLoader, String str, byte[] bArr, @net.bytebuddy.utility.nullability.b ProtectionDomain protectionDomain) {
                    throw new UnsupportedOperationException("Cannot define class using reflection: " + this.f416735a);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f416735a.equals(((c) obj).f416735a);
                    }
                    return false;
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public final Class<?> g(ClassLoader classLoader, String str) {
                    try {
                        return classLoader.loadClass(str);
                    } catch (ClassNotFoundException unused) {
                        return null;
                    }
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public final Package h(ClassLoader classLoader, String str) {
                    throw new UnsupportedOperationException("Cannot get package using reflection: " + this.f416735a);
                }

                public final int hashCode() {
                    return this.f416735a.hashCode() + (getClass().hashCode() * 31);
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public final Object f(ClassLoader classLoader, String str) {
                    return classLoader;
                }
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class UsingUnsafe extends b {

        /* renamed from: d, reason: collision with root package name */
        public static final Dispatcher.b f416749d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f416750e;

        /* renamed from: f, reason: collision with root package name */
        public static final Method f416751f;

        /* renamed from: g, reason: collision with root package name */
        public static final Object f416752g;

        /* renamed from: h, reason: collision with root package name */
        public static final boolean f416753h;

        /* renamed from: b, reason: collision with root package name */
        @HashCodeAndEqualsPlugin.ValueHandling
        @net.bytebuddy.utility.nullability.b
        public final ClassLoader f416754b;

        /* renamed from: c, reason: collision with root package name */
        public final Dispatcher.b f416755c = f416749d;

        public interface Dispatcher {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class CreationAction implements PrivilegedAction<b> {

                /* renamed from: b, reason: collision with root package name */
                public static final CreationAction f416756b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ CreationAction[] f416757c;

                static {
                    CreationAction creationAction = new CreationAction("INSTANCE", 0);
                    f416756b = creationAction;
                    f416757c = new CreationAction[]{creationAction};
                }

                public CreationAction() {
                    throw null;
                }

                public static CreationAction valueOf(String str) {
                    return (CreationAction) Enum.valueOf(CreationAction.class, str);
                }

                public static CreationAction[] values() {
                    return (CreationAction[]) f416757c.clone();
                }

                @Override // java.security.PrivilegedAction
                @SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
                public final b run() throws Exception {
                    b cVar;
                    Field declaredField;
                    if (Boolean.parseBoolean(System.getProperty("net.bytebuddy.safe", Boolean.toString(GraalImageCode.a().f418861b)))) {
                        return new c("Use of Unsafe was disabled by system property");
                    }
                    try {
                        Class<?> cls = Class.forName("sun.misc.Unsafe");
                        Field declaredField2 = cls.getDeclaredField("theUnsafe");
                        declaredField2.setAccessible(true);
                        Object obj = declaredField2.get(null);
                        try {
                            Class cls2 = Integer.TYPE;
                            Method method = cls.getMethod("defineClass", String.class, byte[].class, cls2, cls2, ClassLoader.class, ProtectionDomain.class);
                            method.setAccessible(true);
                            return new a(obj, method);
                        } catch (Exception e12) {
                            try {
                                try {
                                    declaredField = AccessibleObject.class.getDeclaredField("override");
                                } catch (NoSuchFieldException unused) {
                                    a.InterfaceC12009a<S> interfaceC12009aX = ((a.InterfaceC12009a.AbstractC12010a) new ByteBuddy().a(TypeDescription.d.A0(AccessibleObject.class), ClassFileLocator.ForClassLoader.b(AccessibleObject.class.getClassLoader())).L("net.bytebuddy.mirror.AccessibleObject")).x(net.bytebuddy.dynamic.c.f416659a);
                                    net.bytebuddy.asm.b bVar = new net.bytebuddy.asm.b();
                                    declaredField = interfaceC12009aX.r(new net.bytebuddy.asm.b(bVar.f415921b, bVar.f415922c.d(C44396e.f418422c))).p().l6(AccessibleObject.class.getClassLoader(), ClassLoadingStrategy.Default.f416767c).a().getDeclaredField("override");
                                }
                                Long l12 = (Long) cls.getMethod("objectFieldOffset", Field.class).invoke(obj, declaredField);
                                l12.getClass();
                                Method method2 = cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
                                Class<?> cls3 = Class.forName("jdk.internal.misc.Unsafe");
                                Field declaredField3 = cls3.getDeclaredField("theUnsafe");
                                Boolean bool = Boolean.TRUE;
                                method2.invoke(obj, declaredField3, l12, bool);
                                Class cls4 = Integer.TYPE;
                                Method method3 = cls3.getMethod("defineClass", String.class, byte[].class, cls4, cls4, ClassLoader.class, ProtectionDomain.class);
                                method2.invoke(obj, method3, l12, bool);
                                cVar = new a(declaredField3.get(null), method3);
                                return cVar;
                            } catch (Exception unused2) {
                                throw e12;
                            }
                        }
                    } catch (Exception e13) {
                        cVar = new c(e13.getMessage());
                        return cVar;
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements Dispatcher, b {

                /* renamed from: a, reason: collision with root package name */
                public final Object f416758a;

                /* renamed from: b, reason: collision with root package name */
                public final Method f416759b;

                public a(Object obj, Method method) {
                    this.f416758a = obj;
                    this.f416759b = method;
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.b
                public final Dispatcher a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    Object objA = UsingUnsafe.f416750e.a();
                    if (objA != null) {
                        try {
                            UsingUnsafe.f416751f.invoke(objA, ClassInjector.f416701a);
                        } catch (InvocationTargetException e12) {
                            return new c(e12.getTargetException().getMessage());
                        } catch (Exception e13) {
                            return new c(e13.getMessage());
                        }
                    }
                    return this;
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.b
                public final boolean b() {
                    return true;
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher
                public final Class c(@net.bytebuddy.utility.nullability.b ClassLoader classLoader, String str, byte[] bArr) {
                    try {
                        return (Class) this.f416759b.invoke(this.f416758a, str, bArr, 0, Integer.valueOf(bArr.length), classLoader, null);
                    } catch (IllegalAccessException e12) {
                        throw new IllegalStateException(e12);
                    } catch (InvocationTargetException e13) {
                        throw new IllegalStateException(e13.getTargetException());
                    }
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.f416758a.equals(aVar.f416758a) && this.f416759b.equals(aVar.f416759b);
                }

                public final int hashCode() {
                    return this.f416759b.hashCode() + C23088b.a(getClass().hashCode() * 31, 31, this.f416758a);
                }
            }

            public interface b {
                Dispatcher a();

                boolean b();
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class c implements Dispatcher, b {

                /* renamed from: a, reason: collision with root package name */
                public final String f416760a;

                public c(String str) {
                    this.f416760a = str;
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.b
                public final Dispatcher a() {
                    throw new UnsupportedOperationException("Could not access Unsafe class: " + this.f416760a);
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.b
                public final boolean b() {
                    return false;
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher
                public final Class c(@net.bytebuddy.utility.nullability.b ClassLoader classLoader, String str, byte[] bArr) {
                    throw new UnsupportedOperationException("Could not access Unsafe class: " + this.f416760a);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f416760a.equals(((c) obj).f416760a);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f416760a.hashCode() + (getClass().hashCode() * 31);
                }
            }

            Class c(@net.bytebuddy.utility.nullability.b ClassLoader classLoader, String str, byte[] bArr);
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Factory {

            /* renamed from: a, reason: collision with root package name */
            public final Dispatcher.b f416761a;

            public interface AccessResolver {

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class Default implements AccessResolver {

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ Default[] f416762b = {new Default("INSTANCE", 0)};

                    /* JADX INFO: Fake field, exist only in values array */
                    Default EF5;

                    public Default() {
                        throw null;
                    }

                    public static Default valueOf(String str) {
                        return (Default) Enum.valueOf(Default.class, str);
                    }

                    public static Default[] values() {
                        return (Default[]) f416762b.clone();
                    }
                }
            }

            public Factory() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException {
                Dispatcher.b cVar = UsingUnsafe.f416749d;
                if (!cVar.b()) {
                    try {
                        Class<?> cls = Class.forName("jdk.internal.misc.Unsafe");
                        Field declaredField = cls.getDeclaredField("theUnsafe");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(null);
                        Class cls2 = Integer.TYPE;
                        Method method = cls.getMethod("defineClass", String.class, byte[].class, cls2, cls2, ClassLoader.class, ProtectionDomain.class);
                        method.setAccessible(true);
                        cVar = new Dispatcher.a(obj, method);
                    } catch (Exception e12) {
                        cVar = new Dispatcher.c(e12.getMessage());
                    }
                }
                this.f416761a = cVar;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f416761a.equals(((Factory) obj).f416761a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f416761a.hashCode() + (getClass().hashCode() * 31);
            }
        }

        @JavaDispatcher.i("java.lang.System")
        public interface a {
            @JavaDispatcher.h
            @net.bytebuddy.utility.nullability.b
            @JavaDispatcher.i("getSecurityManager")
            @JavaDispatcher.c
            Object a();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
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
                net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.f416753h = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.f416753h = r0
            L19:
                net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$CreationAction r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.CreationAction.f416756b
                boolean r1 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.f416753h
                if (r1 == 0) goto L24
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
                goto L28
            L24:
                java.lang.Object r0 = r0.run()
            L28:
                net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$b r0 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.b) r0
                net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.f416749d = r0
                java.lang.Class<net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$a> r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.a.class
                net.bytebuddy.utility.dispatcher.JavaDispatcher r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.a(r0)
                if (r1 == 0) goto L39
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
                goto L3d
            L39:
                java.lang.Object r0 = r0.run()
            L3d:
                net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$a r0 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.a) r0
                net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.f416750e = r0
                net.bytebuddy.utility.privilege.a r0 = new net.bytebuddy.utility.privilege.a
                java.lang.Class<java.security.Permission> r2 = java.security.Permission.class
                java.lang.Class[] r2 = new java.lang.Class[]{r2}
                r0.<init>(r2)
                if (r1 == 0) goto L53
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
                goto L57
            L53:
                java.lang.Object r0 = r0.run()
            L57:
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.f416751f = r0
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.f416752g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.<clinit>():void");
        }

        public UsingUnsafe(@net.bytebuddy.utility.nullability.b ClassLoader classLoader) {
            this.f416754b = classLoader;
        }

        @Override // net.bytebuddy.dynamic.loading.ClassInjector
        public final HashMap b(LinkedHashMap linkedHashMap) {
            Dispatcher dispatcherA = this.f416755c.a();
            HashMap map = new HashMap();
            Object obj = this.f416754b;
            if (obj == null) {
                obj = f416752g;
            }
            synchronized (obj) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    try {
                        map.put(entry.getKey(), Class.forName((String) entry.getKey(), false, this.f416754b));
                    } catch (ClassNotFoundException unused) {
                        map.put(entry.getKey(), dispatcherA.c(this.f416754b, (String) entry.getKey(), (byte[]) entry.getValue()));
                    }
                }
            }
            return map;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
        
            if (r2 != null) goto L18;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(@net.bytebuddy.utility.nullability.b java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L13
                return r1
            L13:
                net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe r5 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe) r5
                java.lang.ClassLoader r2 = r4.f416754b
                java.lang.ClassLoader r3 = r5.f416754b
                if (r3 == 0) goto L24
                if (r2 == 0) goto L26
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L27
                return r1
            L24:
                if (r2 == 0) goto L27
            L26:
                return r1
            L27:
                net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$b r2 = r4.f416755c
                net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$b r5 = r5.f416755c
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L32
                return r1
            L32:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            int iHashCode = getClass().hashCode() * 31;
            ClassLoader classLoader = this.f416754b;
            if (classLoader != null) {
                iHashCode += classLoader.hashCode();
            }
            return this.f416755c.hashCode() + (iHashCode * 961);
        }
    }

    public static abstract class b implements ClassInjector {
        @Override // net.bytebuddy.dynamic.loading.ClassInjector
        public final LinkedHashMap a(Map map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(((TypeDescription) entry.getKey()).getName(), entry.getValue());
            }
            HashMap mapB = b(linkedHashMap);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (TypeDescription typeDescription : map.keySet()) {
                linkedHashMap2.put(typeDescription, mapB.get(typeDescription.getName()));
            }
            return linkedHashMap2;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class c extends b {

        /* renamed from: c, reason: collision with root package name */
        public static final a f416763c;

        /* renamed from: d, reason: collision with root package name */
        public static final a.InterfaceC12047a f416764d;

        /* renamed from: e, reason: collision with root package name */
        public static final boolean f416765e;

        /* renamed from: b, reason: collision with root package name */
        public final Object f416766b;

        @JavaDispatcher.i("java.lang.invoke.MethodHandles")
        public interface a {

            @JavaDispatcher.i("java.lang.invoke.MethodHandles$Lookup")
            /* renamed from: net.bytebuddy.dynamic.loading.ClassInjector$c$a$a, reason: collision with other inner class name */
            public interface InterfaceC12047a {
                @JavaDispatcher.i("lookupClass")
                Class a();

                @JavaDispatcher.i("defineClass")
                Class b();

                @JavaDispatcher.i("lookupModes")
                int c();
            }
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
                net.bytebuddy.dynamic.loading.ClassInjector.c.f416765e = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.dynamic.loading.ClassInjector.c.f416765e = r0
            L19:
                java.lang.Class<net.bytebuddy.dynamic.loading.ClassInjector$c$a> r0 = net.bytebuddy.dynamic.loading.ClassInjector.c.a.class
                net.bytebuddy.utility.dispatcher.JavaDispatcher r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.a(r0)
                boolean r1 = net.bytebuddy.dynamic.loading.ClassInjector.c.f416765e
                if (r1 == 0) goto L28
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
                goto L2c
            L28:
                java.lang.Object r0 = r0.run()
            L2c:
                net.bytebuddy.dynamic.loading.ClassInjector$c$a r0 = (net.bytebuddy.dynamic.loading.ClassInjector.c.a) r0
                net.bytebuddy.dynamic.loading.ClassInjector.c.f416763c = r0
                java.lang.Class<net.bytebuddy.dynamic.loading.ClassInjector$c$a$a> r0 = net.bytebuddy.dynamic.loading.ClassInjector.c.a.InterfaceC12047a.class
                net.bytebuddy.utility.dispatcher.JavaDispatcher r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.a(r0)
                if (r1 == 0) goto L3d
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
                goto L41
            L3d:
                java.lang.Object r0 = r0.run()
            L41:
                net.bytebuddy.dynamic.loading.ClassInjector$c$a$a r0 = (net.bytebuddy.dynamic.loading.ClassInjector.c.a.InterfaceC12047a) r0
                net.bytebuddy.dynamic.loading.ClassInjector.c.f416764d = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.dynamic.loading.ClassInjector.c.<clinit>():void");
        }

        public c(Object obj) {
            this.f416766b = obj;
        }

        @Override // net.bytebuddy.dynamic.loading.ClassInjector
        public final HashMap b(LinkedHashMap linkedHashMap) {
            a.InterfaceC12047a interfaceC12047a = f416764d;
            net.bytebuddy.description.type.a aVarY5 = TypeDescription.d.A0(interfaceC12047a.a()).y5();
            if (aVarY5 == null) {
                throw new IllegalStateException("Cannot inject into default package");
            }
            HashMap map = new HashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                int iLastIndexOf = ((String) entry.getKey()).lastIndexOf(46);
                if (!aVarY5.getName().equals(iLastIndexOf == -1 ? "" : ((String) entry.getKey()).substring(0, iLastIndexOf))) {
                    throw new IllegalArgumentException(((String) entry.getKey()) + " must be defined in the same package as " + this.f416766b);
                }
                try {
                    Object key = entry.getKey();
                    map.put(key, interfaceC12047a.b());
                } catch (Exception e12) {
                    throw new IllegalStateException(e12);
                }
            }
            return map;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f416766b.equals(((c) obj).f416766b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f416766b.hashCode() + (getClass().hashCode() * 31);
        }
    }

    LinkedHashMap a(Map map);

    HashMap b(LinkedHashMap linkedHashMap);
}
