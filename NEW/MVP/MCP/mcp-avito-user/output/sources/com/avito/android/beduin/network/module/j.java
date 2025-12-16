package com.avito.android.beduin.network.module;

import dagger.internal.A;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import ri.C47658a;
import ri.C47659b;
import ri.C47660c;

/* compiled from: BeduinRegistryModule_ProvideBeduinScreenRegistryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<C47658a> {

    /* renamed from: a, reason: collision with root package name */
    public final A f104033a;

    public j(A a12) {
        this.f104033a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Set<C47659b> set = (Set) this.f104033a.get();
        i.f104032a.getClass();
        C47658a c47658a = new C47658a();
        C47660c.f430149a.getClass();
        Iterator<T> it = C47660c.f430150b.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            LinkedHashSet linkedHashSet = c47658a.f430146b;
            if (!zHasNext) {
                for (C47659b c47659b : set) {
                    if (c47658a.f430145a) {
                        throw new IllegalStateException("Registry already invalidated and can no longer be used");
                    }
                    linkedHashSet.add(c47659b);
                }
                return c47658a;
            }
            C47659b c47659b2 = (C47659b) it.next();
            if (c47658a.f430145a) {
                throw new IllegalStateException("Registry already invalidated and can no longer be used");
            }
            linkedHashSet.add(c47659b2);
        }
    }
}
