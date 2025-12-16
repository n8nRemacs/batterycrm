package org.objenesis.instantiator.gcj;

import java.io.Serializable;
import org.objenesis.ObjenesisException;
import q81.InterfaceC47260a;

/* compiled from: GCJSerializationInstantiator.java */
@InterfaceC47260a
/* loaded from: classes7.dex */
public class c<T> extends b<T> {

    /* renamed from: d, reason: collision with root package name */
    public final Class<? super T> f421806d;

    public c(Class<T> cls) {
        super(cls);
        while (Serializable.class.isAssignableFrom(cls)) {
            cls = (Class<? super T>) cls.getSuperclass();
            if (cls == null) {
                throw new Error("Bad class hierarchy: No non-serializable parents");
            }
        }
        this.f421806d = (Class<? super T>) cls;
    }

    @Override // o81.InterfaceC44601a
    public final T newInstance() {
        try {
            Class<T> cls = this.f421805a;
            return cls.cast(b.f421803b.invoke(b.f421804c, cls, this.f421806d));
        } catch (Exception e12) {
            throw new ObjenesisException(e12);
        }
    }
}
