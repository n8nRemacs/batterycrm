package com.google.firebase.components;

import java.util.Set;
import wZ0.InterfaceC49583a;

/* compiled from: ComponentContainer.java */
/* loaded from: classes13.dex */
public interface c {
    default <T> T a(Class<T> cls) {
        return (T) f(u.a(cls));
    }

    default <T> wZ0.b<T> b(Class<T> cls) {
        return i(u.a(cls));
    }

    <T> InterfaceC49583a<T> c(u<T> uVar);

    default <T> Set<T> d(u<T> uVar) {
        return e(uVar).get();
    }

    <T> wZ0.b<Set<T>> e(u<T> uVar);

    default <T> T f(u<T> uVar) {
        wZ0.b<T> bVarI = i(uVar);
        if (bVarI == null) {
            return null;
        }
        return bVarI.get();
    }

    default <T> InterfaceC49583a<T> g(Class<T> cls) {
        return c(u.a(cls));
    }

    default <T> Set<T> h(Class<T> cls) {
        return d(u.a(cls));
    }

    <T> wZ0.b<T> i(u<T> uVar);
}
