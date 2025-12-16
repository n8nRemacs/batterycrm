package org.mockito.internal.util.reflection;

import com.yandex.div2.D8;
import i81.InterfaceC41245e;
import java.lang.instrument.Instrumentation;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.agent.ByteBuddyAgent;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;
import net.bytebuddy.implementation.MethodCall;
import net.bytebuddy.matcher.C44411u;
import org.mockito.exceptions.base.MockitoInitializationException;

/* compiled from: InstrumentationMemberAccessor.java */
@K71.e
/* loaded from: classes7.dex */
class j implements InterfaceC41245e {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f421769c;

    /* renamed from: d, reason: collision with root package name */
    public static final Instrumentation f421770d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f421771e;

    /* renamed from: f, reason: collision with root package name */
    public static final Throwable f421772f;

    /* renamed from: a, reason: collision with root package name */
    public final MethodHandle f421773a;

    /* renamed from: b, reason: collision with root package name */
    public final MethodHandle f421774b;

    /* compiled from: InstrumentationMemberAccessor.java */
    public interface a {
        MethodHandles.Lookup a();

        Object b();

        void c();

        Object h();
    }

    static {
        Throwable th2;
        a aVar;
        HashMap map = new HashMap();
        f421769c = map;
        Class cls = Boolean.TYPE;
        map.put(cls, Boolean.class);
        map.put(Byte.TYPE, Byte.class);
        map.put(Short.TYPE, Short.class);
        map.put(Character.TYPE, Character.class);
        map.put(Integer.TYPE, Integer.class);
        map.put(Long.TYPE, Long.class);
        map.put(Float.TYPE, Float.class);
        map.put(Double.TYPE, Double.class);
        Instrumentation instrumentation = null;
        try {
            Instrumentation instrumentationC = ByteBuddyAgent.c();
            aVar = (a) new ByteBuddy().c(TypeDescription.d.A0(a.class), ConstructorStrategy.Default.f417164c).u(C44411u.x("getLookup")).z(MethodCall.a(MethodHandles.class.getMethod("lookup", new Class[0]))).u(C44411u.x("getModule")).z(MethodCall.a(Class.class.getMethod("getModule", new Class[0])).l(MethodCall.a(Object.class.getMethod("getClass", new Class[0])))).u(C44411u.x("setAccessible")).z(MethodCall.a(AccessibleObject.class.getMethod("setAccessible", cls)).k().j(1)).u(C44411u.x("invokeWithArguments")).z(MethodCall.a(MethodHandle.class.getMethod("invokeWithArguments", Object[].class)).k().j(1)).p().l6(j.class.getClassLoader(), ClassLoadingStrategy.Default.f416767c).a().getConstructor(new Class[0]).newInstance(new Object[0]);
            th2 = null;
            instrumentation = instrumentationC;
        } catch (Throwable th3) {
            th2 = th3;
            aVar = null;
        }
        f421770d = instrumentation;
        f421771e = aVar;
        f421772f = th2;
    }

    public j() {
        Throwable th2 = f421772f;
        if (th2 != null) {
            throw new MockitoInitializationException(Y71.l.b("Could not initialize the Mockito instrumentation member accessor", "", "This is unexpected on JVMs from Java 9 or later - possibly, the instrumentation API could not be resolved"), th2);
        }
        try {
            Class<?> cls = Class.forName("java.lang.Module");
            this.f421773a = MethodHandles.publicLookup().findVirtual(Class.class, "getModule", MethodType.methodType(cls));
            MethodHandles.publicLookup().findVirtual(cls, "isOpen", MethodType.methodType((Class<?>) Boolean.TYPE, (Class<?>) String.class));
            this.f421774b = MethodHandles.publicLookup().findVirtual(Instrumentation.class, "redefineModule", MethodType.methodType(Void.TYPE, cls, Set.class, Map.class, Map.class, Set.class, Map.class));
            MethodHandles.publicLookup().findStatic(MethodHandles.class, "privateLookupIn", MethodType.methodType(MethodHandles.Lookup.class, Class.class, MethodHandles.Lookup.class));
        } catch (Throwable th3) {
            throw new MockitoInitializationException("Could not resolve instrumentation invoker", th3);
        }
    }

    public static void f(AccessibleObject accessibleObject, Object obj, Class<?> cls, Object[] objArr, Class<?>[] clsArr) {
        if (obj != null && !cls.isAssignableFrom(obj.getClass())) {
            throw new IllegalArgumentException("Cannot access " + accessibleObject + " on " + obj);
        }
        if (clsArr.length != objArr.length) {
            throw new IllegalArgumentException("Incorrect number of arguments for " + accessibleObject + ": expected " + clsArr.length + " but recevied " + objArr.length);
        }
        for (int i12 = 0; i12 < objArr.length; i12++) {
            if (objArr[i12] != null) {
                HashMap map = f421769c;
                Class<?> cls2 = clsArr[i12];
                Class cls3 = (Class) map.getOrDefault(cls2, cls2);
                if (!cls3.isAssignableFrom(objArr[i12].getClass())) {
                    throw new IllegalArgumentException("Cannot assign value of type " + objArr[i12].getClass() + " to " + cls3 + " for " + i12 + " parameter of " + accessibleObject);
                }
            } else if (clsArr[i12].isPrimitive()) {
                throw new IllegalArgumentException("Cannot assign null to primitive type " + clsArr[i12].getTypeName() + " for " + i12 + " parameter of " + accessibleObject);
            }
        }
    }

    @Override // i81.InterfaceC41245e
    /* renamed from: a */
    public final Object d(Constructor<?> constructor, Object... objArr) {
        return c(constructor, new D8(28), objArr);
    }

    @Override // i81.InterfaceC41245e
    public final void b(Field field, Object obj, Object obj2) throws IllegalAccessException {
        boolean z12;
        IllegalAccessException th2;
        a aVar = f421771e;
        f(field, Modifier.isStatic(field.getModifiers()) ? null : obj, field.getDeclaringClass(), new Object[]{obj2}, new Class[]{field.getType()});
        try {
            this.f421773a.bindTo(field.getDeclaringClass());
            g(aVar.b(), field.getDeclaringClass().getPackage().getName());
            if (Modifier.isFinal(field.getModifiers())) {
                z12 = true;
                try {
                    aVar.c();
                } catch (Throwable th3) {
                    th2 = th3;
                    if (z12) {
                        throw th2;
                    }
                    throw new IllegalStateException("Could not read " + field + " on " + obj, th2);
                }
            } else {
                z12 = false;
            }
            try {
                field.getDeclaringClass();
                aVar.a();
                MethodHandle methodHandleUnreflectSetter = ((MethodHandles.Lookup) aVar.b()).unreflectSetter(field);
                if (!Modifier.isStatic(field.getModifiers())) {
                    methodHandleUnreflectSetter.bindTo(obj);
                }
                aVar.b();
                if (z12) {
                    aVar.c();
                }
            } catch (Throwable th4) {
                if (z12) {
                    aVar.c();
                }
                throw th4;
            }
        } catch (Throwable th5) {
            z12 = false;
            th2 = th5;
        }
    }

    @Override // i81.InterfaceC41245e
    public final Object c(Constructor<?> constructor, InterfaceC41245e.b bVar, Object... objArr) throws InstantiationException, InvocationTargetException {
        if (Modifier.isAbstract(constructor.getDeclaringClass().getModifiers())) {
            throw new InstantiationException("Cannot instantiate abstract " + constructor.getDeclaringClass().getTypeName());
        }
        f(constructor, null, null, objArr, constructor.getParameterTypes());
        try {
            a aVar = f421771e;
            this.f421773a.bindTo(constructor.getDeclaringClass());
            g(aVar.b(), constructor.getDeclaringClass().getPackage().getName());
            constructor.getDeclaringClass();
            aVar.a();
            MethodHandle methodHandleUnreflectConstructor = ((MethodHandles.Lookup) aVar.b()).unreflectConstructor(constructor);
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            Object objD = bVar.d(new i(methodHandleUnreflectConstructor, objArr, atomicBoolean));
            if (atomicBoolean.get()) {
                throw new InvocationTargetException((Throwable) objD);
            }
            return objD;
        } catch (InvocationTargetException e12) {
            throw e12;
        } catch (Throwable th2) {
            throw new IllegalStateException("Could not construct " + constructor + " with arguments " + Arrays.toString(objArr), th2);
        }
    }

    @Override // i81.InterfaceC41245e
    public final Object e(Field field, Object obj) {
        f(field, Modifier.isStatic(field.getModifiers()) ? null : obj, field.getDeclaringClass(), new Object[0], new Class[0]);
        try {
            a aVar = f421771e;
            this.f421773a.bindTo(field.getDeclaringClass());
            g(aVar.b(), field.getDeclaringClass().getPackage().getName());
            field.getDeclaringClass();
            aVar.a();
            MethodHandle methodHandleUnreflectGetter = ((MethodHandles.Lookup) aVar.b()).unreflectGetter(field);
            if (!Modifier.isStatic(field.getModifiers())) {
                methodHandleUnreflectGetter.bindTo(obj);
            }
            return aVar.b();
        } catch (Throwable th2) {
            throw new IllegalStateException("Could not read " + field + " on " + obj, th2);
        }
    }

    public final void g(Object obj, String str) {
        a aVar = f421771e;
        if (((Boolean) aVar.b()).booleanValue()) {
            return;
        }
        this.f421774b.bindTo(f421770d);
        Collections.emptySet();
        Collections.emptyMap();
        Collections.singletonMap(str, Collections.singleton(aVar.h()));
        Collections.emptySet();
        Collections.emptyMap();
        aVar.b();
    }

    @Override // i81.InterfaceC41245e
    public final Object invoke(Object obj, Method method, Object... objArr) throws InvocationTargetException {
        InvocationTargetException invocationTargetException;
        f(method, Modifier.isStatic(method.getModifiers()) ? null : obj, method.getDeclaringClass(), objArr, method.getParameterTypes());
        try {
            a aVar = f421771e;
            this.f421773a.bindTo(method.getDeclaringClass());
            g(aVar.b(), method.getDeclaringClass().getPackage().getName());
            method.getDeclaringClass();
            aVar.a();
            MethodHandle methodHandleUnreflect = ((MethodHandles.Lookup) aVar.b()).unreflect(method);
            if (!Modifier.isStatic(method.getModifiers())) {
                methodHandleUnreflect.bindTo(obj);
            }
            try {
                return aVar.b();
            } finally {
            }
        } catch (InvocationTargetException e12) {
            throw e12;
        } catch (Throwable th2) {
            throw new IllegalStateException("Could not invoke " + method + " on " + obj + " with arguments " + Arrays.toString(objArr), th2);
        }
    }
}
