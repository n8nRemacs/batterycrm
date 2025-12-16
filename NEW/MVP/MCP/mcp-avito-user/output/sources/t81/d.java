package t81;

import java.io.NotSerializableException;
import java.io.Serializable;
import o81.InterfaceC44601a;
import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.basic.g;
import org.objenesis.instantiator.basic.h;

/* compiled from: SerializingInstantiatorStrategy.java */
/* loaded from: classes7.dex */
public class d extends AbstractC48517a {
    @Override // t81.InterfaceC48518b
    public final <T> InterfaceC44601a<T> a(Class<T> cls) {
        if (Serializable.class.isAssignableFrom(cls)) {
            String str = C48519c.f439161b;
            return (str.startsWith("Java HotSpot") || str.startsWith("OpenJDK")) ? (C48519c.f439164e == null || !C48519c.f439160a.equals("1.7")) ? new org.objenesis.instantiator.sun.d(cls) : new g(cls) : str.startsWith("Dalvik") ? C48519c.f439163d ? new h(cls) : new p81.d(cls) : str.startsWith("GNU libgcj") ? new org.objenesis.instantiator.gcj.c(cls) : str.startsWith("PERC") ? new r81.b(cls) : new org.objenesis.instantiator.sun.d(cls);
        }
        throw new ObjenesisException(new NotSerializableException(cls + " not serializable"));
    }
}
