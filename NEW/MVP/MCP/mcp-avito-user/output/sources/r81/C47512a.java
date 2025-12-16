package r81;

import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import o81.InterfaceC44601a;
import org.objenesis.ObjenesisException;
import q81.InterfaceC47260a;

/* compiled from: PercInstantiator.java */
@InterfaceC47260a
/* renamed from: r81.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C47512a<T> implements InterfaceC44601a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Method f429639a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f429640b;

    public C47512a(Class<T> cls) throws NoSuchMethodException, SecurityException {
        Object[] objArr = {null, Boolean.FALSE};
        this.f429640b = objArr;
        objArr[0] = cls;
        try {
            Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Boolean.TYPE);
            this.f429639a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException | RuntimeException e12) {
            throw new ObjenesisException(e12);
        }
    }

    @Override // o81.InterfaceC44601a
    public final T newInstance() {
        try {
            return (T) this.f429639a.invoke(null, this.f429640b);
        } catch (Exception e12) {
            throw new ObjenesisException(e12);
        }
    }
}
