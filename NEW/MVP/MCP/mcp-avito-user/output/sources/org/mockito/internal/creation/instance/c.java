package org.mockito.internal.creation.instance;

import java.util.concurrent.ConcurrentHashMap;
import n81.C44217e;
import o81.InterfaceC44601a;
import t81.AbstractC48517a;
import t81.f;

/* compiled from: ObjenesisInstantiator.java */
/* loaded from: classes7.dex */
class c implements D71.a {

    /* renamed from: a, reason: collision with root package name */
    public final C44217e f421617a = new C44217e(new f(), new org.mockito.internal.configuration.f().a());

    @Override // D71.a
    public final <T> T b(Class<T> cls) {
        InterfaceC44601a<?> interfaceC44601aPutIfAbsent;
        C44217e c44217e = this.f421617a;
        c44217e.getClass();
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Primitive types can't be instantiated in Java");
        }
        ConcurrentHashMap<String, InterfaceC44601a<?>> concurrentHashMap = c44217e.f414909b;
        AbstractC48517a abstractC48517a = c44217e.f414908a;
        if (concurrentHashMap == null) {
            interfaceC44601aPutIfAbsent = abstractC48517a.a(cls);
        } else {
            InterfaceC44601a<?> interfaceC44601a = concurrentHashMap.get(cls.getName());
            if (interfaceC44601a == null) {
                InterfaceC44601a<?> interfaceC44601aA = abstractC48517a.a(cls);
                interfaceC44601aPutIfAbsent = concurrentHashMap.putIfAbsent(cls.getName(), interfaceC44601aA);
                if (interfaceC44601aPutIfAbsent == null) {
                    interfaceC44601aPutIfAbsent = interfaceC44601aA;
                }
            } else {
                interfaceC44601aPutIfAbsent = interfaceC44601a;
            }
        }
        return (T) interfaceC44601aPutIfAbsent.newInstance();
    }
}
