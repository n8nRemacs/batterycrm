package org.objenesis.instantiator.basic;

import o81.InterfaceC44601a;
import org.objenesis.ObjenesisException;
import q81.InterfaceC47260a;

/* compiled from: FailingInstantiator.java */
@InterfaceC47260a
/* loaded from: classes7.dex */
public class d<T> implements InterfaceC44601a<T> {
    @Override // o81.InterfaceC44601a
    public final T newInstance() {
        throw new ObjenesisException("Always failing");
    }
}
