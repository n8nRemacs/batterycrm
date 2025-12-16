package org.objenesis.instantiator.basic;

import java.io.ObjectStreamClass;
import java.lang.reflect.Method;
import o81.InterfaceC44601a;
import org.objenesis.ObjenesisException;
import q81.InterfaceC47260a;

/* compiled from: ObjectStreamClassInstantiator.java */
@InterfaceC47260a
/* loaded from: classes7.dex */
public class h<T> implements InterfaceC44601a<T> {

    /* renamed from: b, reason: collision with root package name */
    public static Method f421801b;

    /* renamed from: a, reason: collision with root package name */
    public final ObjectStreamClass f421802a;

    public h(Class<T> cls) throws NoSuchMethodException, SecurityException {
        if (f421801b == null) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[0]);
                f421801b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException | RuntimeException e12) {
                throw new ObjenesisException(e12);
            }
        }
        this.f421802a = ObjectStreamClass.lookup(cls);
    }

    @Override // o81.InterfaceC44601a
    public final T newInstance() {
        try {
            return (T) f421801b.invoke(this.f421802a, new Object[0]);
        } catch (Exception e12) {
            throw new ObjenesisException(e12);
        }
    }
}
