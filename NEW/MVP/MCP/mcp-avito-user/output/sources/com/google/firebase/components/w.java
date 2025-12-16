package com.google.firebase.components;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import tZ0.InterfaceC48623c;
import wZ0.InterfaceC49583a;

/* compiled from: RestrictedComponentContainer.java */
/* loaded from: classes13.dex */
final class w implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Set<u<?>> f360788a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<u<?>> f360789b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<u<?>> f360790c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<u<?>> f360791d;

    /* renamed from: e, reason: collision with root package name */
    public final Set<u<?>> f360792e;

    /* renamed from: f, reason: collision with root package name */
    public final Set<Class<?>> f360793f;

    /* renamed from: g, reason: collision with root package name */
    public final c f360794g;

    /* compiled from: RestrictedComponentContainer.java */
    public static class a implements InterfaceC48623c {

        /* renamed from: a, reason: collision with root package name */
        public final Set<Class<?>> f360795a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC48623c f360796b;

        public a(Set<Class<?>> set, InterfaceC48623c interfaceC48623c) {
            this.f360795a = set;
            this.f360796b = interfaceC48623c;
        }
    }

    public w(b<?> bVar, c cVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (n nVar : bVar.f360727c) {
            int i12 = nVar.f360771c;
            boolean z12 = i12 == 0;
            int i13 = nVar.f360770b;
            u<?> uVar = nVar.f360769a;
            if (z12) {
                if (i13 == 2) {
                    hashSet4.add(uVar);
                } else {
                    hashSet.add(uVar);
                }
            } else if (i12 == 2) {
                hashSet3.add(uVar);
            } else if (i13 == 2) {
                hashSet5.add(uVar);
            } else {
                hashSet2.add(uVar);
            }
        }
        Set<Class<?>> set = bVar.f360731g;
        if (!set.isEmpty()) {
            hashSet.add(u.a(InterfaceC48623c.class));
        }
        this.f360788a = Collections.unmodifiableSet(hashSet);
        this.f360789b = Collections.unmodifiableSet(hashSet2);
        this.f360790c = Collections.unmodifiableSet(hashSet3);
        this.f360791d = Collections.unmodifiableSet(hashSet4);
        this.f360792e = Collections.unmodifiableSet(hashSet5);
        this.f360793f = set;
        this.f360794g = cVar;
    }

    @Override // com.google.firebase.components.c
    public final <T> T a(Class<T> cls) {
        if (this.f360788a.contains(u.a(cls))) {
            T t12 = (T) this.f360794g.a(cls);
            return !cls.equals(InterfaceC48623c.class) ? t12 : (T) new a(this.f360793f, (InterfaceC48623c) t12);
        }
        throw new DependencyException("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override // com.google.firebase.components.c
    public final <T> wZ0.b<T> b(Class<T> cls) {
        return i(u.a(cls));
    }

    @Override // com.google.firebase.components.c
    public final <T> InterfaceC49583a<T> c(u<T> uVar) {
        if (this.f360790c.contains(uVar)) {
            return this.f360794g.c(uVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Deferred<" + uVar + ">.");
    }

    @Override // com.google.firebase.components.c
    public final <T> Set<T> d(u<T> uVar) {
        if (this.f360791d.contains(uVar)) {
            return this.f360794g.d(uVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Set<" + uVar + ">.");
    }

    @Override // com.google.firebase.components.c
    public final <T> wZ0.b<Set<T>> e(u<T> uVar) {
        if (this.f360792e.contains(uVar)) {
            return this.f360794g.e(uVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<Set<" + uVar + ">>.");
    }

    @Override // com.google.firebase.components.c
    public final <T> T f(u<T> uVar) {
        if (this.f360788a.contains(uVar)) {
            return (T) this.f360794g.f(uVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency " + uVar + ".");
    }

    @Override // com.google.firebase.components.c
    public final <T> InterfaceC49583a<T> g(Class<T> cls) {
        return c(u.a(cls));
    }

    @Override // com.google.firebase.components.c
    public final <T> wZ0.b<T> i(u<T> uVar) {
        if (this.f360789b.contains(uVar)) {
            return this.f360794g.i(uVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<" + uVar + ">.");
    }
}
