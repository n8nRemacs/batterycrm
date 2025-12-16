package org.mockito.internal.util.reflection;

import com.yandex.div2.D8;
import i81.InterfaceC41245e;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* compiled from: ReflectionMemberAccessor.java */
/* loaded from: classes7.dex */
public class m implements InterfaceC41245e {
    public static void f(AccessibleObject accessibleObject, boolean z12) throws SecurityException {
        try {
            accessibleObject.setAccessible(z12);
        } catch (RuntimeException unused) {
        }
    }

    @Override // i81.InterfaceC41245e
    /* renamed from: a */
    public final Object d(Constructor<?> constructor, Object... objArr) {
        return c(constructor, new D8(28), objArr);
    }

    @Override // i81.InterfaceC41245e
    public final void b(Field field, Object obj, Object obj2) throws SecurityException {
        f(field, true);
        try {
            try {
                field.set(obj, obj2);
            } catch (IllegalAccessException e12) {
                throw e12;
            } catch (IllegalArgumentException e13) {
            } catch (RuntimeException e14) {
                throw new IllegalStateException("Could not write " + field + " to " + obj, e14);
            }
        } finally {
            f(field, false);
        }
    }

    @Override // i81.InterfaceC41245e
    public final Object c(Constructor<?> constructor, InterfaceC41245e.b bVar, Object... objArr) throws IllegalAccessException, InstantiationException, SecurityException, InvocationTargetException {
        f(constructor, true);
        try {
            try {
                return bVar.d(new i(constructor, objArr));
            } catch (IllegalAccessException e12) {
                throw e12;
            } catch (IllegalArgumentException e13) {
                throw e13;
            } catch (InstantiationException e14) {
                throw e14;
            } catch (RuntimeException e15) {
                throw new IllegalStateException("Failed to invoke " + constructor + " with " + Arrays.toString(objArr), e15);
            } catch (InvocationTargetException e16) {
                throw e16;
            }
        } finally {
            f(constructor, false);
        }
    }

    @Override // i81.InterfaceC41245e
    public final Object e(Field field, Object obj) throws SecurityException {
        f(field, true);
        try {
            try {
                return field.get(obj);
            } catch (IllegalAccessException e12) {
                throw e12;
            } catch (IllegalArgumentException e13) {
                throw e13;
            } catch (RuntimeException e14) {
                throw new IllegalStateException("Could not read " + field + " from " + obj, e14);
            }
        } finally {
            f(field, false);
        }
    }

    @Override // i81.InterfaceC41245e
    public final Object invoke(Object obj, Method method, Object... objArr) throws IllegalAccessException, SecurityException {
        f(method, true);
        try {
            try {
                return method.invoke(obj, objArr);
            } catch (IllegalAccessException e12) {
                throw e12;
            } catch (IllegalArgumentException e13) {
                throw e13;
            } catch (RuntimeException e14) {
                throw new IllegalStateException("Could not invoke " + method + " on " + obj, e14);
            } catch (InvocationTargetException e15) {
                throw e15;
            }
        } finally {
            f(method, false);
        }
    }
}
