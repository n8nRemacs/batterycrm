package p81;

import java.io.ObjectStreamClass;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o81.InterfaceC44601a;
import org.objenesis.ObjenesisException;
import q81.InterfaceC47260a;

/* compiled from: Android18Instantiator.java */
@InterfaceC47260a
/* renamed from: p81.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C46921c<T> implements InterfaceC44601a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<T> f428211a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f428212b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f428213c;

    public C46921c(Class<T> cls) throws NoSuchMethodException, SecurityException {
        this.f428211a = cls;
        try {
            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Long.TYPE);
            declaredMethod.setAccessible(true);
            this.f428212b = declaredMethod;
            try {
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod2.setAccessible(true);
                this.f428213c = (Long) declaredMethod2.invoke(null, Object.class);
            } catch (IllegalAccessException | NoSuchMethodException | RuntimeException | InvocationTargetException e12) {
                throw new ObjenesisException(e12);
            }
        } catch (NoSuchMethodException | RuntimeException e13) {
            throw new ObjenesisException(e13);
        }
    }

    @Override // o81.InterfaceC44601a
    public final T newInstance() {
        try {
            Class<T> cls = this.f428211a;
            return cls.cast(this.f428212b.invoke(null, cls, this.f428213c));
        } catch (Exception e12) {
            throw new ObjenesisException(e12);
        }
    }
}
