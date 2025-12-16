package com.avito.android.paid_services_impl.di;

import dagger.internal.A;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;

/* compiled from: PaidServicesModule_ProvideCompositeFragmentFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<B50.a> {

    /* renamed from: a, reason: collision with root package name */
    public final A f210643a;

    public d(A a12) {
        this.f210643a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Set set = (Set) this.f210643a.get();
        c.f210642a.getClass();
        Set set2 = set;
        int iF2 = P0.f(C42745f0.q(set2, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Object obj : set2) {
            linkedHashMap.put(((A50.a) obj).f98a, obj);
        }
        return new B50.a(linkedHashMap);
    }
}
