package p81;

import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import o81.InterfaceC44601a;
import org.objenesis.ObjenesisException;
import q81.InterfaceC47260a;

/* compiled from: Android10Instantiator.java */
@InterfaceC47260a
/* renamed from: p81.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C46919a<T> implements InterfaceC44601a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<T> f428206a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f428207b;

    public C46919a(Class<T> cls) throws NoSuchMethodException, SecurityException {
        this.f428206a = cls;
        try {
            Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod.setAccessible(true);
            this.f428207b = declaredMethod;
        } catch (NoSuchMethodException | RuntimeException e12) {
            throw new ObjenesisException(e12);
        }
    }

    @Override // o81.InterfaceC44601a
    public final T newInstance() {
        try {
            Class<T> cls = this.f428206a;
            return cls.cast(this.f428207b.invoke(null, cls, Object.class));
        } catch (Exception e12) {
            throw new ObjenesisException(e12);
        }
    }
}
