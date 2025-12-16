package r81;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o81.InterfaceC44601a;
import org.objenesis.ObjenesisException;
import q81.InterfaceC47260a;

/* compiled from: PercSerializationInstantiator.java */
@InterfaceC47260a
/* loaded from: classes7.dex */
public class b<T> implements InterfaceC44601a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f429641a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f429642b;

    public b(Class<T> cls) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<T> superclass = cls;
        while (Serializable.class.isAssignableFrom(superclass)) {
            superclass = superclass.getSuperclass();
        }
        try {
            Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("noArgConstruct", Class.class, Object.class, Class.forName("COM.newmonics.PercClassLoader.Method"));
            this.f429642b = declaredMethod;
            declaredMethod.setAccessible(true);
            Object objInvoke = Class.forName("COM.newmonics.PercClassLoader.PercClass").getDeclaredMethod("getPercClass", Class.class).invoke(null, superclass);
            this.f429641a = new Object[]{superclass, cls, objInvoke.getClass().getDeclaredMethod("findMethod", String.class).invoke(objInvoke, "<init>()V")};
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e12) {
            throw new ObjenesisException(e12);
        }
    }

    @Override // o81.InterfaceC44601a
    public final T newInstance() {
        try {
            return (T) this.f429642b.invoke(null, this.f429641a);
        } catch (IllegalAccessException | InvocationTargetException e12) {
            throw new ObjenesisException(e12);
        }
    }
}
