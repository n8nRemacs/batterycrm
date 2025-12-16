package org.mockito.internal.creation.bytebuddy;

import h81.InterfaceC40782a;
import i81.InterfaceC41243c;
import i81.InterfaceC41246f;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.instrument.Instrumentation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import net.bytebuddy.agent.ByteBuddyAgent;
import org.mockito.creation.instance.InstantiationException;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.exceptions.base.MockitoInitializationException;
import org.mockito.internal.util.concurrent.DetachedThreadLocal;
import org.mockito.internal.util.concurrent.c;
import org.mockito.n;

/* compiled from: InlineDelegateByteBuddyMockMaker.java */
@K71.e
/* loaded from: classes7.dex */
class l implements InterfaceC44925d, InterfaceC41243c, D71.a {

    /* renamed from: e, reason: collision with root package name */
    public static final Instrumentation f421541e;

    /* renamed from: f, reason: collision with root package name */
    public static final Throwable f421542f;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC44924c f421543a;

    /* renamed from: b, reason: collision with root package name */
    public final c.f f421544b = new c.f();

    /* renamed from: c, reason: collision with root package name */
    public final DetachedThreadLocal<Map<Class<?>, r>> f421545c = new DetachedThreadLocal<>();

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal<Boolean> f421546d;

    /* compiled from: InlineDelegateByteBuddyMockMaker.java */
    public class a implements InterfaceC41246f.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f421547a;

        public a(Class cls) {
            this.f421547a = cls;
        }

        @Override // i81.InterfaceC41246f.c
        public final boolean a() {
            Instrumentation instrumentation = l.f421541e;
            Class cls = this.f421547a;
            return instrumentation.isModifiableClass(cls) && !h.f421530i.contains(cls);
        }

        @Override // i81.InterfaceC41246f.c
        public final String b() {
            if (a()) {
                return "";
            }
            Class cls = this.f421547a;
            return cls.isPrimitive() ? "primitive type" : h.f421530i.contains(cls) ? "Cannot mock wrapper types, String.class or Class.class" : "VM does not support modification of given type";
        }
    }

    /* compiled from: InlineDelegateByteBuddyMockMaker.java */
    public static class b implements n.a {

        /* renamed from: a, reason: collision with root package name */
        public final Object[] f421548a;

        static {
            HashMap map = new HashMap();
            Class cls = Boolean.TYPE;
            map.put(cls.getName(), cls);
            Class cls2 = Byte.TYPE;
            map.put(cls2.getName(), cls2);
            Class cls3 = Short.TYPE;
            map.put(cls3.getName(), cls3);
            Class cls4 = Character.TYPE;
            map.put(cls4.getName(), cls4);
            Class cls5 = Integer.TYPE;
            map.put(cls5.getName(), cls5);
            Class cls6 = Long.TYPE;
            map.put(cls6.getName(), cls6);
            Class cls7 = Float.TYPE;
            map.put(cls7.getName(), cls7);
            Class cls8 = Double.TYPE;
            map.put(cls8.getName(), cls8);
        }

        public b() {
            throw null;
        }

        public b(Object[] objArr, Class cls, String[] strArr, a aVar) {
            this.f421548a = objArr;
        }
    }

    /* compiled from: InlineDelegateByteBuddyMockMaker.java */
    public class c<T> implements InterfaceC41246f.a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final n.b<T> f421549a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<Class<?>, BiConsumer<Object, n.a>> f421550b;

        public c() {
            throw null;
        }

        public c(l lVar, Class cls, Function function, Function function2, n.b bVar, Map map, a aVar) {
            new ArrayList();
            this.f421549a = bVar;
            this.f421550b = map;
        }
    }

    /* compiled from: InlineDelegateByteBuddyMockMaker.java */
    public static class d<T> implements InterfaceC41246f.b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Map<Class<?>, r> f421551a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC40782a<T> f421552b;

        /* renamed from: c, reason: collision with root package name */
        public final e81.h f421553c;

        public d() {
            throw null;
        }

        public d(Class cls, Map map, InterfaceC40782a interfaceC40782a, e81.h hVar, a aVar) {
            this.f421551a = map;
            this.f421552b = interfaceC40782a;
            this.f421553c = hVar;
        }
    }

    static {
        Instrumentation instrumentationC;
        Instrumentation instrumentation = null;
        try {
            try {
                instrumentationC = ByteBuddyAgent.c();
            } catch (Throwable th2) {
                th = th2;
            }
            if (!instrumentationC.isRetransformClassesSupported()) {
                throw new IllegalStateException(Y71.l.b("Byte Buddy requires retransformation for creating inline mocks. This feature is unavailable on the current VM.", "", "You cannot use this mock maker on this VM"));
            }
            File fileCreateTempFile = File.createTempFile("mockitoboot", ".jar");
            fileCreateTempFile.deleteOnExit();
            JarOutputStream jarOutputStream = new JarOutputStream(new FileOutputStream(fileCreateTempFile));
            try {
                InputStream resourceAsStream = l.class.getClassLoader().getResourceAsStream("org/mockito/internal/creation/bytebuddy/inject/MockMethodDispatcher.raw");
                if (resourceAsStream == null) {
                    throw new IllegalStateException(Y71.l.b("The MockMethodDispatcher class file is not locatable: org/mockito/internal/creation/bytebuddy/inject/MockMethodDispatcher.raw", "", "The class loader responsible for looking up the resource: " + l.class.getClassLoader()));
                }
                jarOutputStream.putNextEntry(new JarEntry("org/mockito/internal/creation/bytebuddy/inject/MockMethodDispatcher.class"));
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i12 = resourceAsStream.read(bArr);
                        if (i12 == -1) {
                            break;
                        } else {
                            jarOutputStream.write(bArr, 0, i12);
                        }
                    }
                    resourceAsStream.close();
                    jarOutputStream.closeEntry();
                    jarOutputStream.close();
                    JarFile jarFile = new JarFile(fileCreateTempFile);
                    try {
                        instrumentationC.appendToBootstrapClassLoaderSearch(jarFile);
                        jarFile.close();
                        try {
                            Class.forName("org.mockito.internal.creation.bytebuddy.inject.MockMethodDispatcher", false, null);
                            th = null;
                            instrumentation = instrumentationC;
                            f421541e = instrumentation;
                            f421542f = th;
                        } catch (ClassNotFoundException e12) {
                            throw new IllegalStateException(Y71.l.b("Mockito failed to inject the MockMethodDispatcher class into the bootstrap class loader", "", "It seems like your current VM does not support the instrumentation API correctly."), e12);
                        }
                    } catch (Throwable th3) {
                        try {
                            jarFile.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    resourceAsStream.close();
                    throw th5;
                }
            } catch (Throwable th6) {
                jarOutputStream.close();
                throw th6;
            }
        } catch (IOException e13) {
            throw new IllegalStateException(Y71.l.b("Mockito could not self-attach a Java agent to the current VM. This feature is required for inline mocking.", "This error occured due to an I/O error during the creation of this agent: " + e13, "", "Potentially, the current VM does not support the instrumentation API correctly"), e13);
        }
    }

    public l() {
        String strB;
        new DetachedThreadLocal();
        this.f421546d = ThreadLocal.withInitial(new i());
        new ThreadLocal();
        Throwable th2 = f421542f;
        if (th2 != null) {
            if (System.getProperty("java.specification.vendor", "").toLowerCase().contains("android")) {
                strB = "It appears as if you are trying to run this mock maker on Android which does not support the instrumentation API.";
            } else {
                try {
                    strB = ((th2 instanceof NoClassDefFoundError) && th2.getMessage() != null && th2.getMessage().startsWith("net/bytebuddy/agent/")) ? Y71.l.b("It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy Agent could not be loaded.", "", "Byte Buddy Agent is available on Maven Central as 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent'.", "Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but ") : Class.forName("javax.tools.ToolProvider").getMethod("getSystemJavaCompiler", new Class[0]).invoke(null, new Object[0]) == null ? "It appears as if you are running on a JRE. Either install a JDK or add JNA to the class path." : "It appears as if your JDK does not supply a working agent attachment mechanism.";
                } catch (Throwable unused) {
                    strB = "It appears as if you are running an incomplete JVM installation that might not support all tooling APIs";
                }
            }
            throw new MockitoInitializationException(Y71.l.b("Could not initialize inline Byte Buddy mock maker.", "", strB, Y71.j.a()), th2);
        }
        new ThreadLocal();
        ThreadLocal.withInitial(new i());
        try {
            new v();
        } catch (Exception unused2) {
            new t();
        }
        this.f421543a = new C(new h(f421541e, new j()), true);
    }

    @Override // i81.InterfaceC41246f
    public final InterfaceC41246f.c a(Class<?> cls) {
        return new a(cls);
    }

    @Override // D71.a
    public final <T> T b(Class<T> cls) throws SecurityException {
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        if (declaredConstructors.length == 0) {
            throw new InstantiationException(cls.getName().concat(" does not define a constructor"));
        }
        Constructor<?> constructor = declaredConstructors[0];
        int length = declaredConstructors.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            Constructor<?> constructor2 = declaredConstructors[i12];
            if (Modifier.isPublic(constructor2.getModifiers())) {
                constructor = constructor2;
                break;
            }
            i12++;
        }
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        int length2 = parameterTypes.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length2) {
            Class<?> cls2 = parameterTypes[i13];
            int i15 = i14 + 1;
            objArr[i14] = cls2 == Boolean.TYPE ? Boolean.FALSE : cls2 == Byte.TYPE ? (byte) 0 : cls2 == Short.TYPE ? (short) 0 : cls2 == Character.TYPE ? (char) 0 : cls2 == Integer.TYPE ? 0 : cls2 == Long.TYPE ? 0L : cls2 == Float.TYPE ? Float.valueOf(0.0f) : cls2 == Double.TYPE ? Double.valueOf(0.0d) : null;
            i13++;
            i14 = i15;
        }
        try {
            return (T) org.mockito.internal.configuration.plugins.j.c().c(constructor, new k(this), objArr);
        } catch (Exception e12) {
            throw new InstantiationException("Could not instantiate ".concat(cls.getName()), e12);
        }
    }

    @Override // org.mockito.internal.creation.bytebuddy.InterfaceC44925d
    public final Class c(N71.a aVar) {
        String str;
        try {
            return ((C) this.f421543a).a(new n(aVar.f11211b, aVar.f11212c, aVar.f11215f, false, aVar.f11213d));
        } catch (Exception e12) {
            String str2 = "";
            if (aVar.f11211b.isArray()) {
                throw new MockitoException(Y71.l.b("Arrays cannot be mocked: " + aVar.f11211b + ".", ""), e12);
            }
            if (Modifier.isFinal(aVar.f11211b.getModifiers())) {
                throw new MockitoException(Y71.l.b("Mockito cannot mock this class: " + aVar.f11211b + ".", "Can not mock final classes with the following settings :", " - explicit serialization (e.g. withSettings().serializable())", " - extra interfaces (e.g. withSettings().extraInterfaces(...))", "", "You are seeing this disclaimer because Mockito is configured to create inlined mocks.", "You can learn about inline mocks and their limitations under item #39 of the Mockito class javadoc.", "", "Underlying exception : " + e12), e12);
            }
            if (Modifier.isPrivate(aVar.f11211b.getModifiers())) {
                throw new MockitoException(Y71.l.b("Mockito cannot mock this class: " + aVar.f11211b + ".", "Most likely it is a private class that is not visible by Mockito", "", "You are seeing this disclaimer because Mockito is configured to create inlined mocks.", "You can learn about inline mocks and their limitations under item #39 of the Mockito class javadoc.", ""), e12);
            }
            String str3 = "Mockito cannot mock this class: " + aVar.f11211b + ".";
            String str4 = Y71.j.b() ? "Java 8 early builds have bugs that were addressed in Java 1.8.0_45, please update your JDK!\n" : "";
            String str5 = Y71.j.f19332g;
            if (!str5.contains("IBM J9 VM")) {
                if (str5.contains("Hotspot")) {
                    str = str4;
                }
                throw new MockitoException(Y71.l.b(str3, "", "If you're not sure why you're getting this error, please open an issue on GitHub.", "", str, Y71.j.a(), "", "You are seeing this disclaimer because Mockito is configured to create inlined mocks.", "You can learn about inline mocks and their limitations under item #39 of the Mockito class javadoc.", "", "Underlying exception : " + e12), e12);
            }
            str2 = "Early IBM virtual machine are known to have issues with Mockito, please upgrade to an up-to-date version.\n";
            str = str2;
            throw new MockitoException(Y71.l.b(str3, "", "If you're not sure why you're getting this error, please open an issue on GitHub.", "", str, Y71.j.a(), "", "You are seeing this disclaimer because Mockito is configured to create inlined mocks.", "You can learn about inline mocks and their limitations under item #39 of the Mockito class javadoc.", "", "Underlying exception : " + e12), e12);
        }
    }

    @Override // i81.InterfaceC41246f
    public final Object d(N71.a aVar, e81.h hVar) {
        return g(aVar, hVar, false);
    }

    @Override // i81.InterfaceC41246f
    public final e81.h e(Object obj) {
        r rVar;
        if (obj instanceof Class) {
            Map<Class<?>, r> mapD = this.f421545c.f421736b.d(Thread.currentThread());
            rVar = mapD != null ? mapD.get(obj) : null;
        } else {
            rVar = (r) this.f421544b.d(obj);
        }
        if (rVar == null) {
            return null;
        }
        return rVar.f421580b;
    }

    public final Object g(N71.a aVar, e81.h hVar, boolean z12) throws SecurityException {
        Object objB;
        Class clsC = c(aVar);
        try {
            if (aVar.f11219j) {
                objB = new org.mockito.internal.creation.instance.a(aVar.f11220k != null, aVar.f11221l).b(clsC);
            } else {
                try {
                    objB = b(clsC);
                } catch (InstantiationException unused) {
                    if (z12) {
                        return null;
                    }
                    objB = org.mockito.internal.configuration.plugins.j.b().a(aVar).b(clsC);
                }
            }
            this.f421544b.e(new r(aVar, hVar), objB);
            if (objB instanceof m) {
                ((m) objB).b();
            }
            return objB;
        } catch (InstantiationException e12) {
            throw new MockitoException("Unable to create mock instance of type '" + clsC.getSimpleName() + "'", e12);
        }
    }
}
