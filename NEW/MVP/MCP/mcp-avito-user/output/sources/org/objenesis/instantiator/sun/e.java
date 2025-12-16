package org.objenesis.instantiator.sun;

import o81.InterfaceC44601a;
import org.objenesis.ObjenesisException;
import q81.InterfaceC47260a;
import sun.misc.Unsafe;

/* compiled from: UnsafeFactoryInstantiator.java */
@InterfaceC47260a
/* loaded from: classes7.dex */
public class e<T> implements InterfaceC44601a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f421809a = s81.b.f437496a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<T> f421810b;

    public e(Class<T> cls) {
        this.f421810b = cls;
    }

    @Override // o81.InterfaceC44601a
    public final T newInstance() {
        try {
            Class<T> cls = this.f421810b;
            return cls.cast(this.f421809a.allocateInstance(cls));
        } catch (InstantiationException e12) {
            throw new ObjenesisException(e12);
        }
    }
}
