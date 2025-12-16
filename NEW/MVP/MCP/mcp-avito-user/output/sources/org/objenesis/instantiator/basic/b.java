package org.objenesis.instantiator.basic;

import java.lang.reflect.Constructor;
import o81.InterfaceC44601a;
import org.objenesis.ObjenesisException;
import q81.InterfaceC47260a;

/* compiled from: ConstructorInstantiator.java */
@InterfaceC47260a
/* loaded from: classes7.dex */
public class b<T> implements InterfaceC44601a<T> {

    /* renamed from: a, reason: collision with root package name */
    public Constructor<T> f421792a;

    public b() {
        throw null;
    }

    @Override // o81.InterfaceC44601a
    public final T newInstance() {
        try {
            return this.f421792a.newInstance(null);
        } catch (Exception e12) {
            throw new ObjenesisException(e12);
        }
    }
}
