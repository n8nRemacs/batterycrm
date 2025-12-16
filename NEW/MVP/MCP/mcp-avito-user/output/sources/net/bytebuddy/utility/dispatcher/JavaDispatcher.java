package net.bytebuddy.utility.dispatcher;

import androidx.compose.foundation.H;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.jar.asm.B;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.utility.GraalImageCode;
import net.bytebuddy.utility.MethodComparator;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class JavaDispatcher<T> implements PrivilegedAction<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f418925d;

    /* renamed from: e, reason: collision with root package name */
    public static final DynamicClassLoader.Resolver f418926e;

    /* renamed from: f, reason: collision with root package name */
    public static final net.bytebuddy.utility.c f418927f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f418928g;

    /* renamed from: b, reason: collision with root package name */
    public final Class<T> f418929b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f418930c;

    public interface Dispatcher {

        public enum ForDefaultValue implements Dispatcher {
            VOID(null, 0, 177, 0),
            BOOLEAN(Boolean.FALSE, 3, 172, 1),
            /* JADX INFO: Fake field, exist only in values array */
            BOOLEAN_REVERSE(Boolean.TRUE, 4, 172, 1),
            BYTE((byte) 0, 3, 172, 1),
            SHORT((short) 0, 3, 172, 1),
            CHARACTER((char) 0, 3, 172, 1),
            INTEGER(0, 3, 172, 1),
            LONG(0L, 9, 173, 2),
            FLOAT(Float.valueOf(0.0f), 11, 174, 1),
            DOUBLE(Double.valueOf(0.0d), 14, 175, 2),
            REFERENCE(null, 1, 176, 1);


            /* renamed from: b, reason: collision with root package name */
            @net.bytebuddy.utility.nullability.b
            public final Object f418942b;

            /* renamed from: c, reason: collision with root package name */
            public final int f418943c;

            /* renamed from: d, reason: collision with root package name */
            public final int f418944d;

            /* renamed from: e, reason: collision with root package name */
            public final int f418945e;

            public enum OfPrimitiveArray implements Dispatcher {
                BOOLEAN(4, new boolean[0]),
                BYTE(8, new byte[0]),
                SHORT(9, new short[0]),
                CHARACTER(5, new char[0]),
                INTEGER(10, new int[0]),
                LONG(11, new long[0]),
                FLOAT(6, new float[0]),
                DOUBLE(7, new double[0]);


                /* renamed from: b, reason: collision with root package name */
                public final Object f418955b;

                /* renamed from: c, reason: collision with root package name */
                public final int f418956c;

                OfPrimitiveArray(int i12, Object obj) {
                    this.f418955b = obj;
                    this.f418956c = i12;
                }

                @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
                public final int a(s sVar, Method method) {
                    sVar.m(3);
                    sVar.o(188, this.f418956c);
                    sVar.m(176);
                    return 1;
                }

                @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
                public final Object b(Object[] objArr) {
                    return this.f418955b;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements Dispatcher {

                /* renamed from: b, reason: collision with root package name */
                @HashCodeAndEqualsPlugin.ValueHandling
                public final Object f418957b;

                /* renamed from: c, reason: collision with root package name */
                public final Class<?> f418958c;

                public a(Class cls, Object obj) {
                    this.f418957b = obj;
                    this.f418958c = cls;
                }

                @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
                public final int a(s sVar, Method method) {
                    sVar.m(3);
                    sVar.I(189, B.l(this.f418958c));
                    sVar.m(176);
                    return 1;
                }

                @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
                public final Object b(Object[] objArr) {
                    return this.f418957b;
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f418958c.equals(((a) obj).f418958c);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f418958c.hashCode() + (getClass().hashCode() * 31);
                }
            }

            ForDefaultValue(@net.bytebuddy.utility.nullability.b Object obj, int i12, int i13, int i14) {
                this.f418942b = obj;
                this.f418943c = i12;
                this.f418944d = i13;
                this.f418945e = i14;
            }

            public static Dispatcher c(Class<?> cls) {
                if (cls == Void.TYPE) {
                    return VOID;
                }
                Class<?> cls2 = Boolean.TYPE;
                if (cls == cls2) {
                    return BOOLEAN;
                }
                Class<?> cls3 = Byte.TYPE;
                if (cls == cls3) {
                    return BYTE;
                }
                Class<?> cls4 = Short.TYPE;
                if (cls == cls4) {
                    return SHORT;
                }
                Class<?> cls5 = Character.TYPE;
                if (cls == cls5) {
                    return CHARACTER;
                }
                Class<?> cls6 = Integer.TYPE;
                if (cls == cls6) {
                    return INTEGER;
                }
                Class<?> cls7 = Long.TYPE;
                if (cls == cls7) {
                    return LONG;
                }
                Class<?> cls8 = Float.TYPE;
                if (cls == cls8) {
                    return FLOAT;
                }
                Class<?> cls9 = Double.TYPE;
                if (cls == cls9) {
                    return DOUBLE;
                }
                if (!cls.isArray()) {
                    return REFERENCE;
                }
                if (cls.getComponentType() == cls2) {
                    return OfPrimitiveArray.BOOLEAN;
                }
                if (cls.getComponentType() == cls3) {
                    return OfPrimitiveArray.BYTE;
                }
                if (cls.getComponentType() == cls4) {
                    return OfPrimitiveArray.SHORT;
                }
                if (cls.getComponentType() == cls5) {
                    return OfPrimitiveArray.CHARACTER;
                }
                if (cls.getComponentType() == cls6) {
                    return OfPrimitiveArray.INTEGER;
                }
                if (cls.getComponentType() == cls7) {
                    return OfPrimitiveArray.LONG;
                }
                if (cls.getComponentType() == cls8) {
                    return OfPrimitiveArray.FLOAT;
                }
                if (cls.getComponentType() == cls9) {
                    return OfPrimitiveArray.DOUBLE;
                }
                Class<?> componentType = cls.getComponentType();
                return new a(componentType, Array.newInstance(componentType, 0));
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public final int a(s sVar, Method method) {
                int i12 = this.f418943c;
                if (i12 != 0) {
                    sVar.m(i12);
                }
                sVar.m(this.f418944d);
                return this.f418945e;
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            @net.bytebuddy.utility.nullability.b
            public final Object b(Object[] objArr) {
                return this.f418942b;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements Dispatcher {

            /* renamed from: b, reason: collision with root package name */
            public final Constructor<?> f418959b;

            public a(Constructor<?> constructor) {
                this.f418959b = constructor;
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public final int a(s sVar, Method method) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Constructor<?> constructor = this.f418959b;
                Class<?>[] parameterTypes2 = constructor.getParameterTypes();
                sVar.I(187, B.l(constructor.getDeclaringClass()));
                sVar.m(89);
                int iS2 = 1;
                for (int i12 = 0; i12 < parameterTypes.length; i12++) {
                    B bU2 = B.u(parameterTypes[i12]);
                    sVar.J(bU2.q(21), iS2);
                    Class<?> cls = parameterTypes[i12];
                    Class<?> cls2 = parameterTypes2[i12];
                    if (cls != cls2) {
                        sVar.I(192, B.l(cls2));
                    }
                    iS2 += bU2.s();
                }
                sVar.A(B.l(constructor.getDeclaringClass()), "<init>", B.g(constructor), 183, false);
                sVar.m(176);
                return iS2 + 1;
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public final Object b(Object[] objArr) {
                return JavaDispatcher.f418927f.a(this.f418959b, objArr);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f418959b.equals(((a) obj).f418959b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f418959b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements Dispatcher {

            /* renamed from: b, reason: collision with root package name */
            public final Class<?> f418960b;

            public b(Class<?> cls) {
                this.f418960b = cls;
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public final int a(s sVar, Method method) {
                sVar.J(21, 1);
                sVar.I(189, B.l(this.f418960b));
                sVar.m(176);
                return 1;
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public final Object b(Object[] objArr) {
                return Array.newInstance(this.f418960b, ((Integer) objArr[0]).intValue());
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f418960b.equals(((b) obj).f418960b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f418960b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class c implements Dispatcher {

            /* renamed from: b, reason: collision with root package name */
            public final Class<?> f418961b;

            public c(Class<?> cls) {
                this.f418961b = cls;
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public final int a(s sVar, Method method) {
                sVar.J(25, 1);
                sVar.I(193, B.l(this.f418961b));
                sVar.m(172);
                return 1;
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public final Object b(Object[] objArr) {
                return Boolean.valueOf(this.f418961b.isInstance(objArr[0]));
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f418961b.equals(((c) obj).f418961b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f418961b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class d implements Dispatcher {

            /* renamed from: c, reason: collision with root package name */
            public static final Object[] f418962c = new Object[0];

            /* renamed from: b, reason: collision with root package name */
            public final Method f418963b;

            public d(Method method) {
                this.f418963b = method;
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public final int a(s sVar, Method method) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Method method2 = this.f418963b;
                Class<?>[] parameterTypes2 = method2.getParameterTypes();
                int i12 = 0;
                int iS2 = 1;
                while (i12 < parameterTypes.length) {
                    B bU2 = B.u(parameterTypes[i12]);
                    sVar.J(bU2.q(21), iS2);
                    if (parameterTypes[i12] != (i12 == 0 ? method2.getDeclaringClass() : parameterTypes2[i12 - 1])) {
                        sVar.I(192, B.l(i12 == 0 ? method2.getDeclaringClass() : parameterTypes2[i12 - 1]));
                    }
                    iS2 += bU2.s();
                    i12++;
                }
                sVar.A(B.l(method2.getDeclaringClass()), method2.getName(), B.m(method2), method2.getDeclaringClass().isInterface() ? 185 : 182, method2.getDeclaringClass().isInterface());
                sVar.m(B.u(method2.getReturnType()).q(172));
                return Math.max(iS2 - 1, B.u(method2.getReturnType()).s());
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public final Object b(Object[] objArr) {
                Object[] objArr2;
                if (objArr.length == 1) {
                    objArr2 = f418962c;
                } else {
                    int length = objArr.length - 1;
                    Object[] objArr3 = new Object[length];
                    System.arraycopy(objArr, 1, objArr3, 0, length);
                    objArr2 = objArr3;
                }
                return JavaDispatcher.f418927f.invoke(objArr[0], this.f418963b, objArr2);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f418963b.equals(((d) obj).f418963b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f418963b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class e implements Dispatcher {

            /* renamed from: b, reason: collision with root package name */
            public final Method f418964b;

            public e(Method method) {
                this.f418964b = method;
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public final int a(s sVar, Method method) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Method method2 = this.f418964b;
                Class<?>[] parameterTypes2 = method2.getParameterTypes();
                int iS2 = 1;
                for (int i12 = 0; i12 < parameterTypes.length; i12++) {
                    B bU2 = B.u(parameterTypes[i12]);
                    sVar.J(bU2.q(21), iS2);
                    Class<?> cls = parameterTypes[i12];
                    Class<?> cls2 = parameterTypes2[i12];
                    if (cls != cls2) {
                        sVar.I(192, B.l(cls2));
                    }
                    iS2 += bU2.s();
                }
                sVar.A(B.l(method2.getDeclaringClass()), method2.getName(), B.m(method2), 184, method2.getDeclaringClass().isInterface());
                sVar.m(B.u(method2.getReturnType()).q(172));
                return Math.max(iS2 - 1, B.u(method2.getReturnType()).s());
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            @net.bytebuddy.utility.nullability.b
            public final Object b(Object[] objArr) {
                return JavaDispatcher.f418927f.invoke(null, this.f418964b, objArr);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f418964b.equals(((e) obj).f418964b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f418964b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class f implements Dispatcher {

            /* renamed from: b, reason: collision with root package name */
            public final String f418965b;

            public f(String str) {
                this.f418965b = str;
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public final int a(s sVar, Method method) {
                sVar.I(187, B.l(IllegalStateException.class));
                sVar.m(89);
                sVar.t(this.f418965b);
                sVar.A(B.l(IllegalStateException.class), "<init>", B.n(B.f418135e, B.u(String.class)), 183, false);
                sVar.m(191);
                return 3;
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public final Object b(Object[] objArr) {
                throw new IllegalStateException("Could not invoke proxy: " + this.f418965b);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f418965b.equals(((f) obj).f418965b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f418965b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        int a(s sVar, Method method);

        @net.bytebuddy.utility.nullability.b
        Object b(Object[] objArr);
    }

    @Target({ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
    }

    @Target({ElementType.TYPE, ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface c {
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class d implements net.bytebuddy.utility.c {
        public d() {
        }

        @Override // net.bytebuddy.utility.c
        public final Object a(Constructor<?> constructor, Object[] objArr) {
            return constructor.newInstance(objArr);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass();
        }

        public final int hashCode() {
            return getClass().hashCode();
        }

        @Override // net.bytebuddy.utility.c
        public final Object invoke(@net.bytebuddy.utility.nullability.b Object obj, Method method, @net.bytebuddy.utility.nullability.b Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @Target({ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class f implements PrivilegedAction<net.bytebuddy.utility.c> {
        public f() {
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass();
        }

        public final int hashCode() {
            return getClass().hashCode();
        }

        @Override // java.security.PrivilegedAction
        public final net.bytebuddy.utility.c run() {
            return DynamicClassLoader.a();
        }
    }

    @Target({ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface g {
    }

    @Target({ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface h {
    }

    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface i {
        String value();
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class j implements InvocationHandler {

        /* renamed from: c, reason: collision with root package name */
        public static final Object[] f418977c = new Object[0];

        /* renamed from: a, reason: collision with root package name */
        public final String f418978a;

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f418979b;

        public j(String str, HashMap map) {
            this.f418978a = str;
            this.f418979b = map;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            j jVar = (j) obj;
            return this.f418978a.equals(jVar.f418978a) && this.f418979b.equals(jVar.f418979b);
        }

        public final int hashCode() {
            return this.f418979b.hashCode() + H.d(getClass().hashCode() * 31, 31, this.f418978a);
        }

        @Override // java.lang.reflect.InvocationHandler
        @net.bytebuddy.utility.nullability.b
        public final Object invoke(Object obj, Method method, @net.bytebuddy.utility.nullability.b Object[] objArr) {
            z = false;
            z = false;
            boolean z12 = false;
            if (method.getDeclaringClass() == Object.class) {
                if (method.getName().equals("hashCode")) {
                    return Integer.valueOf(hashCode());
                }
                if (method.getName().equals("equals")) {
                    Object obj2 = objArr[0];
                    if (obj2 != null && Proxy.isProxyClass(obj2.getClass()) && Proxy.getInvocationHandler(objArr[0]).equals(this)) {
                        z12 = true;
                    }
                    return Boolean.valueOf(z12);
                }
                if (method.getName().equals("toString")) {
                    return "Call proxy for " + this.f418978a;
                }
                throw new IllegalStateException("Unexpected object method: " + method);
            }
            Dispatcher dispatcher = (Dispatcher) this.f418979b.get(method);
            try {
                try {
                    if (dispatcher != null) {
                        if (objArr == null) {
                            objArr = f418977c;
                        }
                        return dispatcher.b(objArr);
                    }
                    throw new IllegalStateException("No proxy target found for " + method);
                } catch (InvocationTargetException e12) {
                    throw e12.getTargetException();
                }
            } catch (Error e13) {
                throw e13;
            } catch (RuntimeException e14) {
                throw e14;
            } catch (Throwable th2) {
                for (Class<?> cls : method.getExceptionTypes()) {
                    if (cls.isInstance(th2)) {
                        throw th2;
                    }
                }
                throw new IllegalStateException("Failed to invoke proxy for " + method, th2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    static {
        /*
            r0 = 0
            r1 = 0
            java.lang.String r2 = "java.security.AccessController"
            java.lang.Class.forName(r2, r1, r0)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            java.lang.String r2 = "net.bytebuddy.securitymanager"
            java.lang.String r3 = "true"
            java.lang.String r2 = java.lang.System.getProperty(r2, r3)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            boolean r2 = java.lang.Boolean.parseBoolean(r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            net.bytebuddy.utility.dispatcher.JavaDispatcher.f418928g = r2     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            goto L19
        L16:
            r1 = 1
        L17:
            net.bytebuddy.utility.dispatcher.JavaDispatcher.f418928g = r1
        L19:
            net.bytebuddy.utility.privilege.b r1 = new net.bytebuddy.utility.privilege.b
            java.lang.String r2 = "net.bytebuddy.generate"
            r1.<init>(r2)
            boolean r2 = net.bytebuddy.utility.dispatcher.JavaDispatcher.f418928g
            if (r2 == 0) goto L29
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
            goto L2d
        L29:
            java.lang.Object r1 = r1.run()
        L2d:
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            net.bytebuddy.utility.dispatcher.JavaDispatcher.f418925d = r1
            net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader$Resolver$CreationAction r1 = net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.CreationAction.f418969b
            if (r2 == 0) goto L3e
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
            goto L42
        L3e:
            java.lang.Object r1 = r1.run()
        L42:
            net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader$Resolver r1 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver) r1
            net.bytebuddy.utility.dispatcher.JavaDispatcher.f418926e = r1
            net.bytebuddy.utility.dispatcher.JavaDispatcher$f r1 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$f
            r1.<init>()
            if (r2 == 0) goto L52
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r1)
            goto L56
        L52:
            java.lang.Object r0 = r1.run()
        L56:
            net.bytebuddy.utility.c r0 = (net.bytebuddy.utility.c) r0
            net.bytebuddy.utility.dispatcher.JavaDispatcher.f418927f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.utility.dispatcher.JavaDispatcher.<clinit>():void");
    }

    public JavaDispatcher(boolean z12, Class cls) {
        this.f418929b = cls;
        this.f418930c = z12;
    }

    public static JavaDispatcher a(Class cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.k(cls, "Expected an interface instead of "));
        }
        if (cls.isAnnotationPresent(i.class)) {
            if (((i) cls.getAnnotation(i.class)).value().startsWith("java.security.")) {
                throw new IllegalArgumentException("Classes related to Java security cannot be proxied: ".concat(cls.getName()));
            }
            return new JavaDispatcher(f418925d, cls);
        }
        throw new IllegalArgumentException("Expected " + cls.getName() + " to be annotated with " + i.class.getName());
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JavaDispatcher javaDispatcher = (JavaDispatcher) obj;
        return this.f418930c == javaDispatcher.f418930c && this.f418929b.equals(javaDispatcher.f418929b);
    }

    public final int hashCode() {
        return ((this.f418929b.hashCode() + (getClass().hashCode() * 31)) * 961) + (this.f418930c ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0274, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x027b, code lost:
    
        if (r5[r10].isArray() == false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x027d, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x027f, code lost:
    
        r5[r10] = r5[r10].getComponentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0288, code lost:
    
        r28 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x028e, code lost:
    
        if (r6 <= 0) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0296, code lost:
    
        if (r5[r10].isPrimitive() != false) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0298, code lost:
    
        r26 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02a0, code lost:
    
        r29 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02a6, code lost:
    
        r30 = r14;
        r31 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02b4, code lost:
    
        if (r5[r10].isAssignableFrom(java.lang.Class.forName(((net.bytebuddy.utility.dispatcher.JavaDispatcher.i) r4).value(), false, null)) == false) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02b6, code lost:
    
        r6 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02bb, code lost:
    
        r9 = r26 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02bd, code lost:
    
        if (r26 <= 0) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02bf, code lost:
    
        r6.append('[');
        r26 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02c7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02c8, code lost:
    
        r3 = r0;
        r11 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02cd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02ce, code lost:
    
        r3 = r0;
        r11 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02d3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02d4, code lost:
    
        r3 = r0;
        r11 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02db, code lost:
    
        r6.append('L');
        r6.append(((net.bytebuddy.utility.dispatcher.JavaDispatcher.i) r4).value());
        r6.append(';');
        r5[r10] = java.lang.Class.forName(r6.toString(), false, null);
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0326, code lost:
    
        throw new java.lang.IllegalStateException("Cannot resolve to component type: " + ((net.bytebuddy.utility.dispatcher.JavaDispatcher.i) r4).value() + " at " + r10 + " of " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0327, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0328, code lost:
    
        r30 = r14;
        r31 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x032d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x032e, code lost:
    
        r30 = r14;
        r31 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0333, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0334, code lost:
    
        r30 = r14;
        r31 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0339, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x033a, code lost:
    
        r29 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x033d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x033e, code lost:
    
        r29 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0341, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0342, code lost:
    
        r29 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0367, code lost:
    
        throw new java.lang.IllegalStateException("Primitive values are not supposed to be proxied: " + r10 + " of " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0368, code lost:
    
        r29 = r9;
        r30 = r14;
        r31 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0376, code lost:
    
        r4 = java.lang.Class.forName(((net.bytebuddy.utility.dispatcher.JavaDispatcher.i) r4).value(), false, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0380, code lost:
    
        if (r5[r10].isAssignableFrom(r4) == false) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0382, code lost:
    
        r5[r10] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0384, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03ad, code lost:
    
        throw new java.lang.IllegalStateException("Cannot resolve to type: " + r4.getName() + " at " + r10 + " of " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03ae, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03b2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03b6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:253:0x051b A[Catch: all -> 0x044f, NoSuchMethodException -> 0x0452, ClassNotFoundException -> 0x0455, TryCatch #26 {ClassNotFoundException -> 0x0455, NoSuchMethodException -> 0x0452, all -> 0x044f, blocks: (B:208:0x0445, B:251:0x0511, B:253:0x051b, B:255:0x0521, B:256:0x052a, B:257:0x0546, B:258:0x0547, B:260:0x054d, B:262:0x0559, B:263:0x0575), top: B:358:0x0445 }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0547 A[Catch: all -> 0x044f, NoSuchMethodException -> 0x0452, ClassNotFoundException -> 0x0455, TryCatch #26 {ClassNotFoundException -> 0x0455, NoSuchMethodException -> 0x0452, all -> 0x044f, blocks: (B:208:0x0445, B:251:0x0511, B:253:0x051b, B:255:0x0521, B:256:0x052a, B:257:0x0546, B:258:0x0547, B:260:0x054d, B:262:0x0559, B:263:0x0575), top: B:358:0x0445 }] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ad  */
    @Override // java.security.PrivilegedAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T run() throws java.lang.IllegalAccessException, java.lang.ClassNotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.utility.dispatcher.JavaDispatcher.run():java.lang.Object");
    }

    public static class DynamicClassLoader extends ClassLoader {

        /* renamed from: a, reason: collision with root package name */
        @net.bytebuddy.utility.nullability.b
        public static final String f418966a;

        /* renamed from: b, reason: collision with root package name */
        public static final Class<?>[] f418967b = new Class[0];

        /* renamed from: c, reason: collision with root package name */
        public static final Object[] f418968c = new Object[0];

        static {
            String str;
            try {
                net.bytebuddy.utility.privilege.b bVar = new net.bytebuddy.utility.privilege.b("net.bytebuddy.dump");
                str = (String) (JavaDispatcher.f418928g ? AccessController.doPrivileged(bVar) : bVar.run());
            } catch (Throwable unused) {
                str = null;
            }
            f418966a = str;
        }

        public DynamicClassLoader(Class<?> cls) {
            super(cls.getClassLoader());
            JavaDispatcher.f418926e.a(this, cls);
        }

        @SuppressFBWarnings(justification = "Expected internal invocation.", value = {"REC_CATCH_EXCEPTION", "DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED"})
        public static net.bytebuddy.utility.c a() throws SecurityException {
            net.bytebuddy.jar.asm.g gVar = new net.bytebuddy.jar.asm.g(null, 0);
            gVar.c(ClassFileVersion.h(ClassFileVersion.f415295g).f415312b, 1, B.l(net.bytebuddy.utility.c.class) + "$Dispatcher", null, B.l(Object.class), new String[]{B.l(net.bytebuddy.utility.c.class)});
            GraalImageCode graalImageCodeA = GraalImageCode.a();
            Method[] methods = net.bytebuddy.utility.c.class.getMethods();
            graalImageCodeA.b(methods, MethodComparator.f418915b);
            int length = methods.length;
            int i12 = 0;
            while (true) {
                int iS2 = 1;
                if (i12 >= length) {
                    break;
                }
                Method method = methods[i12];
                Class<?>[] exceptionTypes = method.getExceptionTypes();
                String[] strArr = new String[exceptionTypes.length];
                for (int i13 = 0; i13 < exceptionTypes.length; i13++) {
                    strArr[i13] = B.l(exceptionTypes[i13]);
                }
                s sVarI = gVar.i(1, method.getName(), B.m(method), null, strArr);
                B[] bArr = new B[method.getParameterTypes().length - 1];
                for (int i14 = 0; i14 < method.getParameterTypes().length; i14++) {
                    B bU2 = B.u(method.getParameterTypes()[i14]);
                    if (i14 > 0) {
                        bArr[i14 - 1] = bU2;
                    }
                    sVarI.J(bU2.q(21), iS2);
                    iS2 += bU2.s();
                }
                sVarI.A(B.l(method.getParameterTypes()[0]), method.getName(), B.n(B.u(method.getReturnType()), bArr), 182, false);
                sVarI.m(B.u(method.getReturnType()).q(172));
                sVarI.y(Math.max(iS2 - 1, B.u(method.getReturnType()).s()), iS2);
                i12++;
            }
            B b12 = B.f418135e;
            s sVarI2 = gVar.i(1, "<init>", B.n(b12, new B[0]), null, null);
            sVarI2.J(25, 0);
            sVarI2.A(B.l(Object.class), "<init>", B.n(b12, new B[0]), 183, false);
            sVarI2.m(177);
            sVarI2.y(1, 1);
            byte[] bArrV = gVar.v();
            try {
                String property = System.getProperty("net.bytebuddy.dump");
                if (property != null) {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(property, net.bytebuddy.utility.c.class.getName() + "$Dispatcher.class"));
                    try {
                        fileOutputStream.write(bArrV);
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        fileOutputStream.close();
                        throw th2;
                    }
                }
            } catch (Throwable unused) {
            }
            try {
                return (net.bytebuddy.utility.c) new DynamicClassLoader(net.bytebuddy.utility.c.class).defineClass(net.bytebuddy.utility.c.class.getName() + "$Dispatcher", bArrV, 0, bArrV.length, JavaDispatcher.class.getProtectionDomain()).getConstructor(f418967b).newInstance(f418968c);
            } catch (UnsupportedOperationException unused2) {
                return new d();
            } catch (Exception e12) {
                throw new IllegalStateException("Failed to create invoker for ".concat(net.bytebuddy.utility.c.class.getName()), e12);
            }
        }

        @SuppressFBWarnings(justification = "Expected internal invocation.", value = {"REC_CATCH_EXCEPTION", "DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED"})
        public static Object b(Class cls, HashMap map) {
            net.bytebuddy.jar.asm.g gVar = new net.bytebuddy.jar.asm.g(null, 0);
            gVar.c(ClassFileVersion.h(ClassFileVersion.f415295g).f415312b, 1, B.l(cls) + "$Proxy", null, B.l(Object.class), new String[]{B.l(cls)});
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                Class<?>[] exceptionTypes = ((Method) entry.getKey()).getExceptionTypes();
                String[] strArr = new String[exceptionTypes.length];
                for (int i12 = 0; i12 < exceptionTypes.length; i12++) {
                    strArr[i12] = B.l(exceptionTypes[i12]);
                }
                s sVarI = gVar.i(1, ((Method) entry.getKey()).getName(), B.m((Method) entry.getKey()), null, strArr);
                int iS2 = (((Method) entry.getKey()).getModifiers() & 8) != 0 ? 0 : 1;
                for (Class<?> cls2 : ((Method) entry.getKey()).getParameterTypes()) {
                    iS2 += B.u(cls2).s();
                }
                sVarI.y(((Dispatcher) entry.getValue()).a(sVarI, (Method) entry.getKey()), iS2);
            }
            B b12 = B.f418135e;
            s sVarI2 = gVar.i(1, "<init>", B.n(b12, new B[0]), null, null);
            sVarI2.J(25, 0);
            sVarI2.A(B.l(Object.class), "<init>", B.n(b12, new B[0]), 183, false);
            sVarI2.m(177);
            sVarI2.y(1, 1);
            byte[] bArrV = gVar.v();
            String str = f418966a;
            if (str != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(str, cls.getName() + "$Proxy.class"));
                    try {
                        fileOutputStream.write(bArrV);
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        fileOutputStream.close();
                        throw th2;
                    }
                } catch (Throwable unused) {
                }
            }
            try {
                try {
                    return new DynamicClassLoader(cls).defineClass(cls.getName() + "$Proxy", bArrV, 0, bArrV.length, JavaDispatcher.class.getProtectionDomain()).getConstructor(f418967b).newInstance(f418968c);
                } catch (Exception e12) {
                    e = e12;
                    throw new IllegalStateException("Failed to create proxy for ".concat(cls.getName()), e);
                }
            } catch (Exception e13) {
                e = e13;
            }
        }

        public interface Resolver {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class CreationAction implements PrivilegedAction<Resolver> {

                /* renamed from: b, reason: collision with root package name */
                public static final CreationAction f418969b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ CreationAction[] f418970c;

                static {
                    CreationAction creationAction = new CreationAction("INSTANCE", 0);
                    f418969b = creationAction;
                    f418970c = new CreationAction[]{creationAction};
                }

                public CreationAction() {
                    throw null;
                }

                public static CreationAction valueOf(String str) {
                    return (CreationAction) Enum.valueOf(CreationAction.class, str);
                }

                public static CreationAction[] values() {
                    return (CreationAction[]) f418970c.clone();
                }

                @Override // java.security.PrivilegedAction
                @SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
                public final Resolver run() throws ClassNotFoundException {
                    try {
                        Class<?> cls = Class.forName("java.lang.Module", false, null);
                        return new a(Class.class.getMethod("getModule", new Class[0]), cls.getMethod("isExported", String.class), cls.getMethod("addExports", String.class, cls), ClassLoader.class.getMethod("getUnnamedModule", new Class[0]));
                    } catch (Exception unused) {
                        return NoOp.f418971b;
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements Resolver {

                /* renamed from: b, reason: collision with root package name */
                public final Method f418973b;

                /* renamed from: c, reason: collision with root package name */
                public final Method f418974c;

                /* renamed from: d, reason: collision with root package name */
                public final Method f418975d;

                /* renamed from: e, reason: collision with root package name */
                public final Method f418976e;

                public a(Method method, Method method2, Method method3, Method method4) {
                    this.f418973b = method;
                    this.f418974c = method2;
                    this.f418975d = method3;
                    this.f418976e = method4;
                }

                @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver
                @SuppressFBWarnings(justification = "Exception should always be wrapped for clarity.", value = {"REC_CATCH_EXCEPTION"})
                public final void a(@net.bytebuddy.utility.nullability.b DynamicClassLoader dynamicClassLoader, Class cls) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    Package r02 = cls.getPackage();
                    if (r02 != null) {
                        try {
                            Object objInvoke = this.f418973b.invoke(cls, new Object[0]);
                            if (((Boolean) this.f418974c.invoke(objInvoke, r02.getName())).booleanValue()) {
                                return;
                            }
                            this.f418975d.invoke(objInvoke, r02.getName(), this.f418976e.invoke(dynamicClassLoader, new Object[0]));
                        } catch (Exception e12) {
                            throw new IllegalStateException("Failed to adjust module graph for dispatcher", e12);
                        }
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
                    return this.f418973b.equals(aVar.f418973b) && this.f418974c.equals(aVar.f418974c) && this.f418975d.equals(aVar.f418975d) && this.f418976e.equals(aVar.f418976e);
                }

                public final int hashCode() {
                    return this.f418976e.hashCode() + ((this.f418975d.hashCode() + ((this.f418974c.hashCode() + ((this.f418973b.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31)) * 31);
                }
            }

            void a(@net.bytebuddy.utility.nullability.b DynamicClassLoader dynamicClassLoader, Class cls);

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class NoOp implements Resolver {

                /* renamed from: b, reason: collision with root package name */
                public static final NoOp f418971b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ NoOp[] f418972c;

                static {
                    NoOp noOp = new NoOp("INSTANCE", 0);
                    f418971b = noOp;
                    f418972c = new NoOp[]{noOp};
                }

                public NoOp() {
                    throw null;
                }

                public static NoOp valueOf(String str) {
                    return (NoOp) Enum.valueOf(NoOp.class, str);
                }

                public static NoOp[] values() {
                    return (NoOp[]) f418972c.clone();
                }

                @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver
                public final void a(@net.bytebuddy.utility.nullability.b DynamicClassLoader dynamicClassLoader, Class cls) {
                }
            }
        }
    }
}
