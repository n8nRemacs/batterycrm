package p81;

import java.io.ObjectStreamClass;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o81.InterfaceC44601a;
import org.objenesis.ObjenesisException;
import q81.InterfaceC47260a;

/* compiled from: AndroidSerializationInstantiator.java */
@InterfaceC47260a
/* loaded from: classes7.dex */
public class d<T> implements InterfaceC44601a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<T> f428214a;

    /* renamed from: b, reason: collision with root package name */
    public final ObjectStreamClass f428215b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f428216c;

    public d(Class<T> cls) throws NoSuchMethodException, SecurityException {
        this.f428214a = cls;
        try {
            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class);
            declaredMethod.setAccessible(true);
            this.f428216c = declaredMethod;
            try {
                try {
                    this.f428215b = (ObjectStreamClass) ObjectStreamClass.class.getMethod("lookupAny", Class.class).invoke(null, cls);
                } catch (IllegalAccessException | InvocationTargetException e12) {
                    throw new ObjenesisException(e12);
                }
            } catch (NoSuchMethodException e13) {
                throw new ObjenesisException((Throwable) e13);
            }
        } catch (NoSuchMethodException | RuntimeException e14) {
            throw new ObjenesisException(e14);
        }
    }

    @Override // o81.InterfaceC44601a
    public final T newInstance() {
        try {
            Class<T> cls = this.f428214a;
            return cls.cast(this.f428216c.invoke(this.f428215b, cls));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e12) {
            throw new ObjenesisException(e12);
        }
    }
}
