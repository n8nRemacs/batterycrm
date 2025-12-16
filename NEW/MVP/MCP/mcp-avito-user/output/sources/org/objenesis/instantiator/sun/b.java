package org.objenesis.instantiator.sun;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.objenesis.ObjenesisException;

/* compiled from: SunReflectionFactoryHelper.java */
/* loaded from: classes7.dex */
class b {
    public static <T> Constructor<T> a(Class<T> cls, Constructor<?> constructor) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls2 = Class.forName("sun.reflect.ReflectionFactory");
            try {
                try {
                    try {
                        return (Constructor) cls2.getDeclaredMethod("newConstructorForSerialization", Class.class, Constructor.class).invoke(cls2.getDeclaredMethod("getReflectionFactory", new Class[0]).invoke(null, new Object[0]), cls, constructor);
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e12) {
                        throw new ObjenesisException(e12);
                    }
                } catch (NoSuchMethodException e13) {
                    throw new ObjenesisException((Throwable) e13);
                }
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e14) {
                throw new ObjenesisException(e14);
            }
        } catch (ClassNotFoundException e15) {
            throw new ObjenesisException((Throwable) e15);
        }
    }
}
