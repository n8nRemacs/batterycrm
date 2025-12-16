package org.objenesis.instantiator.gcj;

import java.lang.reflect.InvocationTargetException;
import org.objenesis.ObjenesisException;
import q81.InterfaceC47260a;

/* compiled from: GCJInstantiator.java */
@InterfaceC47260a
/* loaded from: classes7.dex */
public class a<T> extends b<T> {
    public a() {
        throw null;
    }

    @Override // o81.InterfaceC44601a
    public final T newInstance() {
        try {
            Class<T> cls = this.f421805a;
            return cls.cast(b.f421803b.invoke(b.f421804c, cls, Object.class));
        } catch (IllegalAccessException | RuntimeException | InvocationTargetException e12) {
            throw new ObjenesisException(e12);
        }
    }
}
