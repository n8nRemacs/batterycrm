package com.avito.android.bxcontent.di.module;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: BxContentKonveyorItemModule_ProvideKonveyorItemHolderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.bxcontent.di.module.p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29068p implements dagger.internal.h<WQ.c> {

    /* renamed from: a, reason: collision with root package name */
    public final C29067o f111010a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Set<WQ.d<?, ?>>> f111011b;

    /* renamed from: c, reason: collision with root package name */
    public final C29069q f111012c;

    public C29068p(C29067o c29067o, Provider provider, C29069q c29069q) {
        this.f111010a = c29067o;
        this.f111011b = provider;
        this.f111012c = c29069q;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Set<WQ.d<?, ?>> set = this.f111011b.get();
        WQ.h hVar = (WQ.h) this.f111012c.get();
        this.f111010a.getClass();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            kotlin.Q qA2 = ((WQ.d) it.next()).a(hVar);
            XQ.a aVar = (XQ.a) qA2.f406619b;
            TV0.b bVar = (TV0.b) qA2.f406620c;
            hashSet.add(aVar);
            hashSet2.add(bVar);
        }
        return new C29065m(hashSet, hashSet2);
    }
}
