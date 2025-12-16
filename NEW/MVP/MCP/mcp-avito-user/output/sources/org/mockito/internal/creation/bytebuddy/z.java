package org.mockito.internal.creation.bytebuddy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.bytebuddy.dynamic.loading.ClassInjector;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.utility.GraalImageCode;
import net.bytebuddy.utility.JavaType;
import org.mockito.exceptions.base.MockitoException;

/* compiled from: SubclassInjectionLoader.java */
/* loaded from: classes7.dex */
class z implements A {

    /* renamed from: b, reason: collision with root package name */
    public static final String f421609b = Y71.l.b("The current JVM does not support any class injection mechanism.", "", "Currently, Mockito supports injection via either by method handle lookups or using sun.misc.Unsafe", "Neither seems to be available on your current JVM.");

    /* renamed from: a, reason: collision with root package name */
    public final A f421610a;

    /* compiled from: SubclassInjectionLoader.java */
    public static class b implements A {
        public b() {
        }

        @Override // org.mockito.internal.creation.bytebuddy.A
        public final ClassLoadingStrategy<ClassLoader> a(Class<?> cls, ClassLoader classLoader, boolean z12) {
            return ClassLoadingStrategy.Default.f416767c;
        }

        @Override // org.mockito.internal.creation.bytebuddy.A
        public final boolean b() {
            return false;
        }
    }

    /* compiled from: SubclassInjectionLoader.java */
    public static class c implements A {

        /* renamed from: a, reason: collision with root package name */
        public final Object f421611a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f421612b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f421613c;

        public c(Object obj, Object obj2, Method method) {
            this.f421611a = obj;
            this.f421612b = obj2;
            this.f421613c = method;
        }

        @Override // org.mockito.internal.creation.bytebuddy.A
        public final ClassLoadingStrategy<ClassLoader> a(Class<?> cls, ClassLoader classLoader, boolean z12) {
            if (!z12) {
                if (classLoader == B71.a.class.getClassLoader()) {
                    return ClassLoadingStrategy.e.c(this.f421612b);
                }
                ClassLoadingStrategy.Default r52 = ClassLoadingStrategy.Default.f416767c;
                return r52.f416771b.a(cls.getProtectionDomain());
            }
            try {
                try {
                    return ClassLoadingStrategy.e.c(this.f421613c.invoke(null, cls, this.f421611a));
                } catch (InvocationTargetException e12) {
                    if (!(e12.getCause() instanceof IllegalAccessException)) {
                        throw e12.getCause();
                    }
                    ClassLoadingStrategy.Default r53 = ClassLoadingStrategy.Default.f416767c;
                    return r53.f416771b.a(cls.getProtectionDomain());
                }
            } catch (Throwable th2) {
                throw new MockitoException(Y71.l.b(androidx.compose.ui.graphics.colorspace.e.k(cls, "The Java module system prevents Mockito from defining a mock class in the same package as "), "", "To overcome this, you must open and export the mocked type to Mockito.", "Remember that you can also do so programmatically if the mocked class is defined by the same module as your test code", th2));
            }
        }

        @Override // org.mockito.internal.creation.bytebuddy.A
        public final boolean b() {
            return false;
        }
    }

    /* compiled from: SubclassInjectionLoader.java */
    public static class d implements A {
        public d() {
        }

        @Override // org.mockito.internal.creation.bytebuddy.A
        public final ClassLoadingStrategy<ClassLoader> a(Class<?> cls, ClassLoader classLoader, boolean z12) {
            return ClassLoadingStrategy.Default.f416769e.f416771b.a(z12 ? cls.getProtectionDomain() : B71.a.class.getProtectionDomain());
        }

        @Override // org.mockito.internal.creation.bytebuddy.A
        public final boolean b() {
            return true;
        }
    }

    public z() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!Boolean.parseBoolean(System.getProperty("org.mockito.internal.noUnsafeInjection", Boolean.toString(GraalImageCode.a().f418861b))) && ClassInjector.UsingReflection.f416718f.b()) {
            this.f421610a = new d();
            return;
        }
        if (GraalImageCode.a().f418861b) {
            this.f421610a = new b();
            return;
        }
        ClassInjector.c.a aVar = ClassInjector.c.f416763c;
        boolean zA2 = JavaType.f418907k.a();
        String str = f421609b;
        if (!zA2) {
            throw new MockitoException(Y71.l.b(str, "", Y71.j.a()));
        }
        try {
            Class<?> cls = Class.forName("java.lang.invoke.MethodHandles");
            Object objInvoke = cls.getMethod("lookup", new Class[0]).invoke(null, new Object[0]);
            Method method = cls.getMethod("privateLookupIn", Class.class, Class.forName("java.lang.invoke.MethodHandles$Lookup"));
            this.f421610a = new c(objInvoke, method.invoke(null, B71.a.class, objInvoke), method);
        } catch (Exception e12) {
            throw new MockitoException(Y71.l.b(str, "", Y71.j.a()), e12);
        }
    }

    @Override // org.mockito.internal.creation.bytebuddy.A
    public final ClassLoadingStrategy<ClassLoader> a(Class<?> cls, ClassLoader classLoader, boolean z12) {
        return this.f421610a.a(cls, classLoader, z12);
    }

    @Override // org.mockito.internal.creation.bytebuddy.A
    public final boolean b() {
        return this.f421610a.b();
    }
}
