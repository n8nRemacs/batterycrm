package t81;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import o81.InterfaceC44601a;
import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.basic.g;
import p81.C46919a;
import p81.C46920b;
import p81.C46921c;
import r81.C47512a;

/* compiled from: StdInstantiatorStrategy.java */
/* loaded from: classes7.dex */
public class f extends AbstractC48517a {
    @Override // t81.InterfaceC48518b
    public final <T> InterfaceC44601a<T> a(Class<T> cls) throws NoSuchMethodException, SecurityException {
        String str = C48519c.f439161b;
        if (!str.startsWith("Java HotSpot") && !str.startsWith("OpenJDK")) {
            if (!str.startsWith("Dalvik")) {
                return str.startsWith("GNU libgcj") ? new org.objenesis.instantiator.gcj.a(cls) : str.startsWith("PERC") ? new C47512a(cls) : new org.objenesis.instantiator.sun.e(cls);
            }
            if (C48519c.f439163d) {
                return new org.objenesis.instantiator.sun.e(cls);
            }
            int i12 = C48519c.f439162c;
            return i12 <= 10 ? new C46919a(cls) : i12 <= 17 ? new C46920b(cls) : new C46921c(cls);
        }
        if (C48519c.f439164e == null || !C48519c.f439160a.equals("1.7")) {
            return new org.objenesis.instantiator.sun.c(cls);
        }
        if (Serializable.class.isAssignableFrom(cls)) {
            return new g(cls);
        }
        org.objenesis.instantiator.basic.a aVar = new org.objenesis.instantiator.basic.a();
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(null);
            aVar.f421792a = declaredConstructor;
            if (declaredConstructor != null) {
                declaredConstructor.setAccessible(true);
            }
            return aVar;
        } catch (Exception e12) {
            throw new ObjenesisException(e12);
        }
    }
}
