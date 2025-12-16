package org.objenesis.instantiator.sun;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import o81.InterfaceC44601a;
import org.objenesis.ObjenesisException;
import q81.InterfaceC47260a;

/* compiled from: SunReflectionFactorySerializationInstantiator.java */
@InterfaceC47260a
/* loaded from: classes7.dex */
public class d<T> implements InterfaceC44601a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Constructor<T> f421808a;

    public d(Class<T> cls) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<T> superclass = cls;
        while (Serializable.class.isAssignableFrom(superclass)) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new Error("Bad class hierarchy: No non-serializable parents");
            }
        }
        try {
            Constructor<T> constructorA = b.a(cls, superclass.getDeclaredConstructor(null));
            this.f421808a = constructorA;
            constructorA.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            throw new ObjenesisException(new NotSerializableException(cls + " has no suitable superclass constructor"));
        }
    }

    @Override // o81.InterfaceC44601a
    public final T newInstance() {
        try {
            return this.f421808a.newInstance(null);
        } catch (Exception e12) {
            throw new ObjenesisException(e12);
        }
    }
}
