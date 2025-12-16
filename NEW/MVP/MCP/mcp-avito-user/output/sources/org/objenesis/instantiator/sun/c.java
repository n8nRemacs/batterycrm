package org.objenesis.instantiator.sun;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import o81.InterfaceC44601a;
import org.objenesis.ObjenesisException;
import q81.InterfaceC47260a;

/* compiled from: SunReflectionFactoryInstantiator.java */
@InterfaceC47260a
/* loaded from: classes7.dex */
public class c<T> implements InterfaceC44601a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Constructor<T> f421807a;

    public c(Class<T> cls) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Constructor<T> constructorA = b.a(cls, Object.class.getConstructor(null));
            this.f421807a = constructorA;
            constructorA.setAccessible(true);
        } catch (NoSuchMethodException e12) {
            throw new ObjenesisException((Throwable) e12);
        }
    }

    @Override // o81.InterfaceC44601a
    public final T newInstance() {
        try {
            return this.f421807a.newInstance(null);
        } catch (Exception e12) {
            throw new ObjenesisException(e12);
        }
    }
}
