package com.fasterxml.jackson.databind.util;

import androidx.camera.core.Q;
import androidx.media3.common.C23088b;
import com.akita.compose.theme.re23.style.C0;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import oX0.AbstractC44703c;
import okhttp3.HttpUrl;
import rX0.InterfaceC47610a;

/* compiled from: ClassUtil.java */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Annotation[] f342596a = new Annotation[0];

    /* renamed from: b, reason: collision with root package name */
    public static final a[] f342597b = new a[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Iterator<?> f342598c = Collections.emptyIterator();

    /* compiled from: ClassUtil.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Constructor<?> f342599a;

        /* renamed from: b, reason: collision with root package name */
        public transient Annotation[] f342600b;

        /* renamed from: c, reason: collision with root package name */
        public transient Annotation[][] f342601c;

        /* renamed from: d, reason: collision with root package name */
        public int f342602d = -1;

        public a(Constructor<?> constructor) {
            this.f342599a = constructor;
        }
    }

    /* compiled from: ClassUtil.java */
    public static class b {

        /* renamed from: e, reason: collision with root package name */
        public static final b f342603e = new b();

        /* renamed from: a, reason: collision with root package name */
        public final Field f342604a;

        /* renamed from: b, reason: collision with root package name */
        public final Field f342605b;

        /* renamed from: c, reason: collision with root package name */
        public final String f342606c;

        /* renamed from: d, reason: collision with root package name */
        public final String f342607d;

        public b() throws SecurityException {
            String string;
            Field fieldA;
            String string2;
            Field fieldA2 = null;
            try {
                fieldA = a(EnumSet.class, "elementType");
                string = null;
            } catch (Exception e12) {
                string = e12.toString();
                fieldA = null;
            }
            this.f342604a = fieldA;
            this.f342606c = string;
            try {
                string2 = null;
                fieldA2 = a(EnumMap.class, "keyType");
            } catch (Exception e13) {
                string2 = e13.toString();
            }
            this.f342605b = fieldA2;
            this.f342607d = string2;
        }

        public static Field a(Class cls, String str) throws SecurityException {
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName()) && field.getType() == Class.class) {
                    field.setAccessible(true);
                    return field;
                }
            }
            throw new IllegalStateException(Q.a("No field named '", str, "' in class '", cls.getTypeName(), "'"));
        }
    }

    public static String A(Class<?> cls) {
        if (cls == null) {
            return "[null]";
        }
        int i12 = 0;
        while (cls.isArray()) {
            i12++;
            cls = cls.getComponentType();
        }
        String simpleName = cls.isPrimitive() ? cls.getSimpleName() : cls.getName();
        if (i12 > 0) {
            StringBuilder sb2 = new StringBuilder(simpleName);
            do {
                sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                i12--;
            } while (i12 > 0);
            simpleName = sb2.toString();
        }
        if (simpleName == null) {
            return "[null]";
        }
        StringBuilder sb3 = new StringBuilder(simpleName.length() + 2);
        sb3.append('`');
        sb3.append(simpleName);
        sb3.append('`');
        return sb3.toString();
    }

    public static Class<?> B(Class<?> cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return null;
    }

    public static void C(com.fasterxml.jackson.databind.f fVar, IOException iOException) throws JsonMappingException {
        if (iOException instanceof JsonMappingException) {
            throw ((JsonMappingException) iOException);
        }
        JsonMappingException jsonMappingException = new JsonMappingException(fVar.f341924g, iOException.getMessage());
        jsonMappingException.initCause(iOException);
        throw jsonMappingException;
    }

    public static void D(Throwable th2) {
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
    }

    public static void E(Throwable th2) {
        if (th2 instanceof IOException) {
            throw ((IOException) th2);
        }
    }

    public static void F(Throwable th2) {
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
    }

    public static void G(Object obj, Class cls, String str) {
        if (obj.getClass() != cls) {
            throw new IllegalStateException(AK.c.s(C23088b.b("Sub-class ", obj.getClass().getName(), " (of class ", cls.getName(), ") must override method '"), str, "'"));
        }
    }

    public static Class<?> H(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        throw new IllegalArgumentException(C0.f(cls, new StringBuilder("Class "), " is not a primitive type"));
    }

    public static void a(Class cls, Class cls2, ArrayList arrayList) {
        if (cls == cls2 || cls == null || cls == Object.class || arrayList.contains(cls)) {
            return;
        }
        arrayList.add(cls);
        for (Class<?> cls3 : cls.getInterfaces()) {
            a(cls3, cls2, arrayList);
        }
        a(cls.getSuperclass(), cls2, arrayList);
    }

    public static void b(Class cls, Throwable th2) {
        String name = cls.getName();
        String name2 = th2.getClass().getName();
        String message = th2.getMessage();
        StringBuilder sbB = C23088b.b("Failed on call to `getDeclaredMethods()` on class `", name, "`, problem: (", name2, ") ");
        sbB.append(message);
        throw new IllegalArgumentException(sbB.toString(), th2);
    }

    public static String c(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append('\'');
        sb2.append(str);
        sb2.append('\'');
        return sb2.toString();
    }

    public static String d(Class<?> cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return "primitive";
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(Member member, boolean z12) throws SecurityException {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        try {
            Class<?> declaringClass = member.getDeclaringClass();
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(declaringClass.getModifiers()) && (!z12 || w(declaringClass))) {
                return;
            }
            accessibleObject.setAccessible(true);
        } catch (SecurityException e12) {
            if (accessibleObject.isAccessible()) {
                return;
            }
            throw new IllegalArgumentException("Cannot access " + member + " (from class " + member.getDeclaringClass().getName() + "; failed to set access: " + e12.getMessage());
        } catch (RuntimeException e13) {
            if (!"InaccessibleObjectException".equals(e13.getClass().getSimpleName())) {
                throw e13;
            }
            String simpleName = member.getClass().getSimpleName();
            String name = member.getName();
            String strA = A(member.getDeclaringClass());
            String name2 = e13.getClass().getName();
            String message = e13.getMessage();
            StringBuilder sbB = C23088b.b("Failed to call `setAccess()` on ", simpleName, " '", name, "' (of class ");
            androidx.media3.exoplayer.analytics.m.p(sbB, strA, ") due to `", name2, "`, problem: ");
            sbB.append(message);
            throw new IllegalArgumentException(sbB.toString(), e13);
        }
    }

    public static String f(Object obj) {
        if (obj == null) {
            return "[null]";
        }
        return A(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static void g(AbstractC44703c abstractC44703c, Closeable closeable, Exception exc) throws IOException {
        if (abstractC44703c != null) {
            abstractC44703c.p0(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
            try {
                abstractC44703c.close();
            } catch (Exception e12) {
                exc.addSuppressed(e12);
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e13) {
                exc.addSuppressed(e13);
            }
        }
        E(exc);
        F(exc);
        throw new RuntimeException(exc);
    }

    public static Object h(boolean z12, Class cls) throws NoSuchMethodException, SecurityException {
        Constructor constructorK = k(z12, cls);
        if (constructorK == null) {
            throw new IllegalArgumentException(C0.f(cls, new StringBuilder("Class "), " has no default (no arg) constructor"));
        }
        try {
            return constructorK.newInstance(new Object[0]);
        } catch (Exception e12) {
            String str = "Failed to instantiate class " + cls.getName() + ", problem: " + e12.getMessage();
            Throwable thS = s(e12);
            F(thS);
            D(thS);
            throw new IllegalArgumentException(str, thS);
        }
    }

    public static String i(Throwable th2) {
        return th2 instanceof JacksonException ? ((JacksonException) th2).b() : (!(th2 instanceof InvocationTargetException) || th2.getCause() == null) ? th2.getMessage() : th2.getCause().getMessage();
    }

    public static Annotation[] j(Class<?> cls) {
        return y(cls) ? f342596a : cls.getDeclaredAnnotations();
    }

    public static Constructor k(boolean z12, Class cls) throws NoSuchMethodException, SecurityException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (z12) {
                e(declaredConstructor, z12);
            } else if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new IllegalArgumentException("Default constructor for " + cls.getName() + " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
            }
            return declaredConstructor;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e12) {
            String str = "Failed to find default constructor of class " + cls.getName() + ", problem: " + e12.getMessage();
            Throwable thS = s(e12);
            F(thS);
            D(thS);
            throw new IllegalArgumentException(str, thS);
        }
    }

    public static Class<? extends Enum<?>> l(EnumMap<?, ?> enumMap) {
        if (!enumMap.isEmpty()) {
            return ((Enum) enumMap.keySet().iterator().next()).getDeclaringClass();
        }
        b bVar = b.f342603e;
        Field field = bVar.f342605b;
        if (field != null) {
            try {
                return (Class) field.get(enumMap);
            } catch (Exception e12) {
                throw new IllegalArgumentException(e12);
            }
        }
        throw new IllegalStateException("Cannot figure out type parameter for `EnumMap` (odd JDK platform?), problem: " + bVar.f342607d);
    }

    public static Class<? extends Enum<?>> m(EnumSet<?> enumSet) {
        if (!enumSet.isEmpty()) {
            return ((Enum) enumSet.iterator().next()).getDeclaringClass();
        }
        b bVar = b.f342603e;
        Field field = bVar.f342604a;
        if (field != null) {
            try {
                return (Class) field.get(enumSet);
            } catch (Exception e12) {
                throw new IllegalArgumentException(e12);
            }
        }
        throw new IllegalStateException("Cannot figure out type parameter for `EnumSet` (odd JDK platform?), problem: " + bVar.f342606c);
    }

    public static ArrayList n(Class cls, Class cls2, boolean z12) {
        ArrayList arrayList = new ArrayList(8);
        if (cls != null && cls != cls2) {
            if (z12) {
                arrayList.add(cls);
            }
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls == cls2) {
                    break;
                }
                arrayList.add(cls);
            }
        }
        return arrayList;
    }

    public static String o(Object obj) {
        return A(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static Method[] p(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e12) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader == null) {
                throw null;
            }
            try {
                try {
                    return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
                } finally {
                }
            } catch (ClassNotFoundException e13) {
                e12.addSuppressed(e13);
                throw null;
            }
        } finally {
        }
    }

    public static a[] q(Class<?> cls) throws SecurityException {
        if (cls.isInterface() || y(cls)) {
            return f342597b;
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        a[] aVarArr = new a[length];
        for (int i12 = 0; i12 < length; i12++) {
            aVarArr[i12] = new a(declaredConstructors[i12]);
        }
        return aVarArr;
    }

    public static Class<?> r(Class<?> cls) {
        if (Modifier.isStatic(cls.getModifiers())) {
            return null;
        }
        try {
            if (!((y(cls) || cls.getEnclosingMethod() == null) ? false : true) && !y(cls)) {
                return cls.getEnclosingClass();
            }
            return null;
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static Throwable s(Exception exc) {
        Exception cause = exc;
        while (cause.getCause() != null) {
            cause = cause.getCause();
        }
        return cause;
    }

    public static String t(com.fasterxml.jackson.databind.h hVar) {
        if (hVar == null) {
            return "[null]";
        }
        StringBuilder sb2 = new StringBuilder(80);
        sb2.append('`');
        sb2.append(hVar.g());
        sb2.append('`');
        return sb2.toString();
    }

    public static boolean u(Class cls, Object obj) {
        return obj != null && obj.getClass() == cls;
    }

    public static boolean v(Class<?> cls) {
        return cls == Void.class || cls == Void.TYPE || cls == rX0.i.class;
    }

    public static boolean w(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("java.") || name.startsWith("javax.");
    }

    public static boolean x(Object obj) {
        return obj == null || obj.getClass().getAnnotation(InterfaceC47610a.class) != null;
    }

    public static boolean y(Class<?> cls) {
        return cls == Object.class || cls.isPrimitive();
    }

    public static String z(String str) {
        return str == null ? "[null]" : c(str);
    }
}
