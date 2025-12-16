package net.bytebuddy.dynamic.loading;

import androidx.compose.foundation.H;
import androidx.media3.common.C23088b;
import com.adjust.sdk.Constants;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.net.URLStreamHandler;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.dynamic.loading.ClassFilePostProcessor;
import net.bytebuddy.dynamic.loading.PackageDefinitionStrategy;

/* loaded from: classes8.dex */
public class ByteArrayClassLoader extends InjectionClassLoader {

    /* renamed from: h, reason: collision with root package name */
    public static final PackageLookupStrategy f416660h;

    /* renamed from: i, reason: collision with root package name */
    public static final SynchronizationStrategy.c f416661i;

    /* renamed from: j, reason: collision with root package name */
    public static final boolean f416662j;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f416663b;

    /* renamed from: c, reason: collision with root package name */
    public final PersistenceHandler f416664c;

    /* renamed from: d, reason: collision with root package name */
    @net.bytebuddy.utility.nullability.b
    public final ProtectionDomain f416665d;

    /* renamed from: e, reason: collision with root package name */
    public final PackageDefinitionStrategy.Trivial f416666e;

    /* renamed from: f, reason: collision with root package name */
    public final ClassFilePostProcessor.NoOp f416667f;

    /* renamed from: g, reason: collision with root package name */
    @net.bytebuddy.utility.nullability.b
    public final AccessControlContext f416668g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EmptyEnumeration implements Enumeration<URL> {

        /* renamed from: b, reason: collision with root package name */
        public static final EmptyEnumeration f416669b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ EmptyEnumeration[] f416670c;

        static {
            EmptyEnumeration emptyEnumeration = new EmptyEnumeration("INSTANCE", 0);
            f416669b = emptyEnumeration;
            f416670c = new EmptyEnumeration[]{emptyEnumeration};
        }

        public EmptyEnumeration() {
            throw null;
        }

        public static EmptyEnumeration valueOf(String str) {
            return (EmptyEnumeration) Enum.valueOf(EmptyEnumeration.class, str);
        }

        public static EmptyEnumeration[] values() {
            return (EmptyEnumeration[]) f416670c.clone();
        }

        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            return false;
        }

        @Override // java.util.Enumeration
        public final URL nextElement() {
            throw new NoSuchElementException();
        }
    }

    public interface PackageLookupStrategy {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class CreationAction implements PrivilegedAction<PackageLookupStrategy> {

            /* renamed from: b, reason: collision with root package name */
            public static final CreationAction f416671b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ CreationAction[] f416672c;

            static {
                CreationAction creationAction = new CreationAction("INSTANCE", 0);
                f416671b = creationAction;
                f416672c = new CreationAction[]{creationAction};
            }

            public CreationAction() {
                throw null;
            }

            public static CreationAction valueOf(String str) {
                return (CreationAction) Enum.valueOf(CreationAction.class, str);
            }

            public static CreationAction[] values() {
                return (CreationAction[]) f416672c.clone();
            }

            @Override // java.security.PrivilegedAction
            @SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
            public final PackageLookupStrategy run() {
                boolean zB2 = net.bytebuddy.utility.d.b();
                ForLegacyVm forLegacyVm = ForLegacyVm.f416673b;
                if (!zB2) {
                    return forLegacyVm;
                }
                try {
                    return new a(ClassLoader.class.getMethod("getDefinedPackage", String.class));
                } catch (Exception unused) {
                    return forLegacyVm;
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ForLegacyVm implements PackageLookupStrategy {

            /* renamed from: b, reason: collision with root package name */
            public static final ForLegacyVm f416673b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ ForLegacyVm[] f416674c;

            static {
                ForLegacyVm forLegacyVm = new ForLegacyVm("INSTANCE", 0);
                f416673b = forLegacyVm;
                f416674c = new ForLegacyVm[]{forLegacyVm};
            }

            public ForLegacyVm() {
                throw null;
            }

            public static ForLegacyVm valueOf(String str) {
                return (ForLegacyVm) Enum.valueOf(ForLegacyVm.class, str);
            }

            public static ForLegacyVm[] values() {
                return (ForLegacyVm[]) f416674c.clone();
            }

            @Override // net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy
            @net.bytebuddy.utility.nullability.b
            public final Package a(ByteArrayClassLoader byteArrayClassLoader, String str) {
                return ByteArrayClassLoader.d(byteArrayClassLoader, str);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements PackageLookupStrategy {

            /* renamed from: b, reason: collision with root package name */
            public final Method f416675b;

            public a(Method method) {
                this.f416675b = method;
            }

            @Override // net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy
            @net.bytebuddy.utility.nullability.b
            public final Package a(ByteArrayClassLoader byteArrayClassLoader, String str) {
                try {
                    return (Package) this.f416675b.invoke(byteArrayClassLoader, str);
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
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f416675b.equals(((a) obj).f416675b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f416675b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        @net.bytebuddy.utility.nullability.b
        Package a(ByteArrayClassLoader byteArrayClassLoader, String str);
    }

    public static class b extends ByteArrayClassLoader {

        /* renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ int f416692k = 0;

        public static class a implements Enumeration<URL> {

            /* renamed from: b, reason: collision with root package name */
            @net.bytebuddy.utility.nullability.b
            public URL f416693b;

            /* renamed from: c, reason: collision with root package name */
            public final Enumeration<URL> f416694c;

            public a(URL url, Enumeration<URL> enumeration) {
                this.f416693b = url;
                this.f416694c = enumeration;
            }

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                return this.f416693b != null && this.f416694c.hasMoreElements();
            }

            @Override // java.util.Enumeration
            public final URL nextElement() {
                if (this.f416693b != null) {
                    Enumeration<URL> enumeration = this.f416694c;
                    if (enumeration.hasMoreElements()) {
                        try {
                            return this.f416693b;
                        } finally {
                            this.f416693b = enumeration.nextElement();
                        }
                    }
                }
                throw new NoSuchElementException();
            }
        }

        static {
            try {
                Method declaredMethod = ClassLoader.class.getDeclaredMethod("registerAsParallelCapable", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, new Object[0]);
            } catch (Throwable unused) {
            }
        }

        public b() {
            throw null;
        }

        @Override // java.lang.ClassLoader
        public final URL getResource(String str) {
            URL urlC = this.f416664c.c(str, this.f416663b);
            if (urlC != null) {
                return urlC;
            }
            boolean z12 = false;
            if (!this.f416664c.f416679b && str.endsWith(".class")) {
                synchronized (this) {
                    try {
                        String strSubstring = str.replace('/', '.').substring(0, str.length() - 6);
                        if (this.f416663b.containsKey(strSubstring)) {
                            z12 = true;
                        } else {
                            Class<?> clsFindLoadedClass = findLoadedClass(strSubstring);
                            if (clsFindLoadedClass != null && clsFindLoadedClass.getClassLoader() == this) {
                                z12 = true;
                            }
                        }
                    } finally {
                    }
                }
            }
            return z12 ? urlC : super.getResource(str);
        }

        @Override // java.lang.ClassLoader
        public final Enumeration<URL> getResources(String str) {
            URL urlC = this.f416664c.c(str, this.f416663b);
            return urlC == null ? super.getResources(str) : new a(urlC, super.getResources(str));
        }

        @Override // java.lang.ClassLoader
        public final Class<?> loadClass(String str, boolean z12) {
            synchronized (ByteArrayClassLoader.f416661i.a().b(this, str)) {
                Class<?> clsFindLoadedClass = findLoadedClass(str);
                if (clsFindLoadedClass != null) {
                    return clsFindLoadedClass;
                }
                try {
                    Class<?> clsFindClass = findClass(str);
                    if (z12) {
                        resolveClass(clsFindClass);
                    }
                    return clsFindClass;
                } catch (ClassNotFoundException unused) {
                    return super.loadClass(str, z12);
                }
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public class c implements PrivilegedAction<Class<?>> {

        /* renamed from: b, reason: collision with root package name */
        public final String f416695b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f416696c;

        public c(String str, byte[] bArr) {
            this.f416695b = str;
            this.f416696c = bArr;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f416695b.equals(cVar.f416695b) && Arrays.equals(this.f416696c, cVar.f416696c) && ByteArrayClassLoader.this.equals(ByteArrayClassLoader.this);
        }

        public final int hashCode() {
            return ByteArrayClassLoader.this.hashCode() + ((Arrays.hashCode(this.f416696c) + H.d(getClass().hashCode() * 31, 31, this.f416695b)) * 31);
        }

        @Override // java.security.PrivilegedAction
        public final Class<?> run() throws IllegalArgumentException {
            String str = this.f416695b;
            int iLastIndexOf = str.lastIndexOf(46);
            ByteArrayClassLoader byteArrayClassLoader = ByteArrayClassLoader.this;
            if (iLastIndexOf != -1) {
                String strSubstring = str.substring(0, iLastIndexOf);
                byteArrayClassLoader.f416666e.getClass();
                if (ByteArrayClassLoader.f416660h.a(byteArrayClassLoader, strSubstring) == null) {
                    byteArrayClassLoader.definePackage(strSubstring, null, null, null, null, null, null, null);
                }
            }
            byte[] bArr = this.f416696c;
            return ByteArrayClassLoader.c(byteArrayClassLoader, str, bArr, bArr.length, byteArrayClassLoader.f416665d);
        }
    }

    public static class d implements Enumeration<URL> {

        /* renamed from: b, reason: collision with root package name */
        @net.bytebuddy.utility.nullability.b
        public URL f416698b;

        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            return this.f416698b != null;
        }

        @Override // java.util.Enumeration
        public final URL nextElement() {
            URL url = this.f416698b;
            if (url == null) {
                throw new NoSuchElementException();
            }
            this.f416698b = null;
            return url;
        }
    }

    static {
        try {
            Class.forName("java.security.AccessController", false, null);
            f416662j = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f416662j = false;
        } catch (SecurityException unused2) {
            f416662j = true;
        }
        PackageLookupStrategy.CreationAction creationAction = PackageLookupStrategy.CreationAction.f416671b;
        boolean z12 = f416662j;
        f416660h = (PackageLookupStrategy) (z12 ? AccessController.doPrivileged(creationAction) : creationAction.run());
        SynchronizationStrategy.CreationAction creationAction2 = SynchronizationStrategy.CreationAction.f416684b;
        f416661i = (SynchronizationStrategy.c) (z12 ? AccessController.doPrivileged(creationAction2) : creationAction2.run());
        try {
            Method declaredMethod = ClassLoader.class.getDeclaredMethod("registerAsParallelCapable", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, new Object[0]);
        } catch (Throwable unused3) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteArrayClassLoader(@net.bytebuddy.utility.nullability.b ClassLoader classLoader, boolean z12, HashMap map, @net.bytebuddy.utility.nullability.b ProtectionDomain protectionDomain, PersistenceHandler persistenceHandler, PackageDefinitionStrategy.Trivial trivial) {
        super(classLoader, z12);
        ClassFilePostProcessor.NoOp noOp = ClassFilePostProcessor.NoOp.f416699b;
        this.f416663b = new ConcurrentHashMap(map);
        this.f416665d = protectionDomain;
        this.f416664c = persistenceHandler;
        this.f416666e = trivial;
        this.f416667f = noOp;
        this.f416668g = f416662j ? AccessController.getContext() : null;
    }

    public static /* synthetic */ Class c(ByteArrayClassLoader byteArrayClassLoader, String str, byte[] bArr, int i12, ProtectionDomain protectionDomain) {
        return byteArrayClassLoader.defineClass(str, bArr, 0, i12, protectionDomain);
    }

    public static Package d(ByteArrayClassLoader byteArrayClassLoader, String str) {
        return byteArrayClassLoader.getPackage(str);
    }

    @Override // net.bytebuddy.dynamic.loading.InjectionClassLoader
    public final Map a(LinkedHashMap linkedHashMap) {
        HashMap map = new HashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            map.put(entry.getKey(), this.f416663b.putIfAbsent(entry.getKey(), entry.getValue()));
        }
        try {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (String str : linkedHashMap.keySet()) {
                synchronized (f416661i.a().b(this, str)) {
                    linkedHashMap2.put(str, loadClass(str));
                }
            }
            return linkedHashMap2;
        } finally {
            for (Map.Entry entry2 : map.entrySet()) {
                if (entry2.getValue() == null) {
                    this.f416664c.b((String) entry2.getKey(), this.f416663b);
                } else {
                    this.f416663b.put(entry2.getKey(), entry2.getValue());
                }
            }
        }
    }

    @Override // java.lang.ClassLoader
    public final Class<?> findClass(String str) throws ClassNotFoundException {
        byte[] bArrA = this.f416664c.a(str, this.f416663b);
        if (bArrA == null) {
            throw new ClassNotFoundException(str);
        }
        this.f416667f.getClass();
        c cVar = new c(str, bArrA);
        return (Class) (f416662j ? AccessController.doPrivileged(cVar, this.f416668g) : cVar.run());
    }

    @Override // java.lang.ClassLoader
    @net.bytebuddy.utility.nullability.b
    public final URL findResource(String str) {
        return this.f416664c.c(str, this.f416663b);
    }

    @Override // java.lang.ClassLoader
    public final Enumeration<URL> findResources(String str) {
        URL urlC = this.f416664c.c(str, this.f416663b);
        if (urlC == null) {
            return EmptyEnumeration.f416669b;
        }
        d dVar = new d();
        dVar.f416698b = urlC;
        return dVar;
    }

    public interface SynchronizationStrategy {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class CreationAction implements PrivilegedAction<c> {

            /* renamed from: b, reason: collision with root package name */
            public static final CreationAction f416684b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ CreationAction[] f416685c;

            static {
                CreationAction creationAction = new CreationAction("INSTANCE", 0);
                f416684b = creationAction;
                f416685c = new CreationAction[]{creationAction};
            }

            public CreationAction() {
                throw null;
            }

            public static CreationAction valueOf(String str) {
                return (CreationAction) Enum.valueOf(CreationAction.class, str);
            }

            public static CreationAction[] values() {
                return (CreationAction[]) f416685c.clone();
            }

            @Override // java.security.PrivilegedAction
            @SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
            public final c run() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
                ForLegacyVm forLegacyVm = ForLegacyVm.f416686b;
                try {
                    try {
                        Class<?> cls = Class.forName("java.lang.invoke.MethodType");
                        Class<?> cls2 = Class.forName("java.lang.invoke.MethodHandle");
                        Method method = Class.forName("java.lang.invoke.MethodHandles$Lookup").getMethod("findVirtual", Class.class, String.class, cls);
                        PackageLookupStrategy packageLookupStrategy = ByteArrayClassLoader.f416660h;
                        return new b(method.invoke(Class.forName("java.lang.invoke.MethodHandles").getMethod("lookup", new Class[0]).invoke(null, new Object[0]), ClassLoader.class, "getClassLoadingLock", cls.getMethod("methodType", Class.class, Class[].class).invoke(null, Object.class, new Class[]{String.class})), cls2.getMethod("bindTo", Object.class), cls2.getMethod("invokeWithArguments", Object[].class));
                    } catch (Exception unused) {
                        return (ClassFileVersion.h(ClassFileVersion.f415295g).c(ClassFileVersion.f415299k) && ByteArrayClassLoader.class.getClassLoader() == null) ? forLegacyVm : new a(ClassLoader.class.getDeclaredMethod("getClassLoadingLock", String.class));
                    }
                } catch (Exception unused2) {
                    return forLegacyVm;
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements SynchronizationStrategy, c {

            /* renamed from: b, reason: collision with root package name */
            public final Method f416688b;

            public a(Method method) {
                this.f416688b = method;
            }

            @Override // net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.c
            @SuppressFBWarnings(justification = "Assuring privilege is explicit user responsibility.", value = {"DP_DO_INSIDE_DO_PRIVILEGED"})
            public final SynchronizationStrategy a() throws SecurityException {
                try {
                    this.f416688b.setAccessible(true);
                    return this;
                } catch (Exception unused) {
                    return ForLegacyVm.f416686b;
                }
            }

            @Override // net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy
            public final Object b(ByteArrayClassLoader byteArrayClassLoader, String str) {
                try {
                    return this.f416688b.invoke(byteArrayClassLoader, str);
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
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f416688b.equals(((a) obj).f416688b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f416688b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        public interface c {
            SynchronizationStrategy a();
        }

        Object b(ByteArrayClassLoader byteArrayClassLoader, String str);

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ForLegacyVm implements SynchronizationStrategy, c {

            /* renamed from: b, reason: collision with root package name */
            public static final ForLegacyVm f416686b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ ForLegacyVm[] f416687c;

            static {
                ForLegacyVm forLegacyVm = new ForLegacyVm("INSTANCE", 0);
                f416686b = forLegacyVm;
                f416687c = new ForLegacyVm[]{forLegacyVm};
            }

            public ForLegacyVm() {
                throw null;
            }

            public static ForLegacyVm valueOf(String str) {
                return (ForLegacyVm) Enum.valueOf(ForLegacyVm.class, str);
            }

            public static ForLegacyVm[] values() {
                return (ForLegacyVm[]) f416687c.clone();
            }

            @Override // net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.c
            public final SynchronizationStrategy a() {
                return this;
            }

            @Override // net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy
            public final Object b(ByteArrayClassLoader byteArrayClassLoader, String str) {
                return byteArrayClassLoader;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements SynchronizationStrategy, c {

            /* renamed from: b, reason: collision with root package name */
            public final Object f416689b;

            /* renamed from: c, reason: collision with root package name */
            public final Method f416690c;

            /* renamed from: d, reason: collision with root package name */
            public final Method f416691d;

            public b(Object obj, Method method, Method method2) {
                this.f416689b = obj;
                this.f416690c = method;
                this.f416691d = method2;
            }

            @Override // net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy
            public final Object b(ByteArrayClassLoader byteArrayClassLoader, String str) {
                try {
                    return this.f416691d.invoke(this.f416690c.invoke(this.f416689b, byteArrayClassLoader), new Object[]{str});
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
                b bVar = (b) obj;
                return this.f416689b.equals(bVar.f416689b) && this.f416690c.equals(bVar.f416690c) && this.f416691d.equals(bVar.f416691d);
            }

            public final int hashCode() {
                return this.f416691d.hashCode() + ((this.f416690c.hashCode() + C23088b.a(getClass().hashCode() * 31, 31, this.f416689b)) * 31);
            }

            @Override // net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.c
            public final SynchronizationStrategy a() {
                return this;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class PersistenceHandler {

        /* renamed from: c, reason: collision with root package name */
        public static final PersistenceHandler f416676c;

        /* renamed from: d, reason: collision with root package name */
        public static final PersistenceHandler f416677d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ PersistenceHandler[] f416678e;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f416679b;

        public enum b extends PersistenceHandler {
            @Override // net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler
            public final byte[] a(String str, ConcurrentHashMap concurrentHashMap) {
                return (byte[]) concurrentHashMap.remove(str);
            }

            @Override // net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler
            public final void b(String str, ConcurrentHashMap concurrentHashMap) {
                concurrentHashMap.remove(str);
            }

            @Override // net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler
            public final URL c(String str, ConcurrentHashMap concurrentHashMap) {
                PackageLookupStrategy packageLookupStrategy = ByteArrayClassLoader.f416660h;
                return null;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class c implements PrivilegedAction<URL> {

            /* renamed from: b, reason: collision with root package name */
            public final String f416680b;

            /* renamed from: c, reason: collision with root package name */
            public final byte[] f416681c;

            @HashCodeAndEqualsPlugin.Enhance
            public static class a extends URLStreamHandler {

                /* renamed from: a, reason: collision with root package name */
                public final byte[] f416682a;

                /* renamed from: net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler$c$a$a, reason: collision with other inner class name */
                public static class C12044a extends URLConnection {

                    /* renamed from: a, reason: collision with root package name */
                    public final ByteArrayInputStream f416683a;

                    public C12044a(URL url, ByteArrayInputStream byteArrayInputStream) {
                        super(url);
                        this.f416683a = byteArrayInputStream;
                    }

                    @Override // java.net.URLConnection
                    public final void connect() {
                        ((URLConnection) this).connected = true;
                    }

                    @Override // java.net.URLConnection
                    public final InputStream getInputStream() {
                        ((URLConnection) this).connected = true;
                        return this.f416683a;
                    }
                }

                public a(byte[] bArr) {
                    this.f416682a = bArr;
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return Arrays.equals(this.f416682a, ((a) obj).f416682a);
                    }
                    return false;
                }

                public final int hashCode() {
                    return Arrays.hashCode(this.f416682a) + (getClass().hashCode() * 31);
                }

                @Override // java.net.URLStreamHandler
                public final URLConnection openConnection(URL url) {
                    return new C12044a(url, new ByteArrayInputStream(this.f416682a));
                }
            }

            public c(String str, byte[] bArr) {
                this.f416680b = str;
                this.f416681c = bArr;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f416680b.equals(cVar.f416680b) && Arrays.equals(this.f416681c, cVar.f416681c);
            }

            public final int hashCode() {
                return Arrays.hashCode(this.f416681c) + H.d(getClass().hashCode() * 31, 31, this.f416680b);
            }

            @Override // java.security.PrivilegedAction
            public final URL run() {
                String str = this.f416680b;
                try {
                    return new URL("bytebuddy", URLEncoder.encode(str.replace('.', '/'), Constants.ENCODING), -1, "", new a(this.f416681c));
                } catch (UnsupportedEncodingException e12) {
                    throw new IllegalStateException("Could not find encoding: UTF-8", e12);
                } catch (MalformedURLException e13) {
                    throw new IllegalStateException("Cannot create URL for ".concat(str), e13);
                }
            }
        }

        static {
            a aVar = new a("MANIFEST", 0, true, null);
            f416676c = aVar;
            b bVar = new b("LATENT", 1, false, null);
            f416677d = bVar;
            f416678e = new PersistenceHandler[]{aVar, bVar};
        }

        public PersistenceHandler() {
            throw null;
        }

        public PersistenceHandler(String str, int i12, boolean z12, a aVar) {
            this.f416679b = z12;
        }

        public static PersistenceHandler valueOf(String str) {
            return (PersistenceHandler) Enum.valueOf(PersistenceHandler.class, str);
        }

        public static PersistenceHandler[] values() {
            return (PersistenceHandler[]) f416678e.clone();
        }

        @net.bytebuddy.utility.nullability.b
        public abstract byte[] a(String str, ConcurrentHashMap concurrentHashMap);

        public abstract void b(String str, ConcurrentHashMap concurrentHashMap);

        @net.bytebuddy.utility.nullability.b
        public abstract URL c(String str, ConcurrentHashMap concurrentHashMap);

        public enum a extends PersistenceHandler {
            @Override // net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler
            public final byte[] a(String str, ConcurrentHashMap concurrentHashMap) {
                return (byte[]) concurrentHashMap.get(str);
            }

            @Override // net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler
            public final URL c(String str, ConcurrentHashMap concurrentHashMap) {
                if (!str.endsWith(".class")) {
                    PackageLookupStrategy packageLookupStrategy = ByteArrayClassLoader.f416660h;
                    return null;
                }
                if (str.startsWith("/")) {
                    str = str.substring(1);
                }
                byte[] bArr = (byte[]) concurrentHashMap.get(str.replace('/', '.').substring(0, str.length() - 6));
                if (bArr == null) {
                    PackageLookupStrategy packageLookupStrategy2 = ByteArrayClassLoader.f416660h;
                    return null;
                }
                c cVar = new c(str, bArr);
                return (URL) (ByteArrayClassLoader.f416662j ? AccessController.doPrivileged(cVar) : cVar.run());
            }

            @Override // net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler
            public final void b(String str, ConcurrentHashMap concurrentHashMap) {
            }
        }
    }
}
