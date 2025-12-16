package com.avito.android.bxcontent.beduin_v2.wrapper;

import com.avito.android.util.C35975x3;
import com.google.gson.Gson;
import com.google.gson.ToNumberPolicy;
import com.google.gson.r;
import dagger.internal.A;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;

/* compiled from: BxWrapperComponentModule_ProvideBxWrapperGsonFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<Gson> {

    /* renamed from: a, reason: collision with root package name */
    public final d f109605a;

    /* renamed from: b, reason: collision with root package name */
    public final A f109606b;

    /* renamed from: c, reason: collision with root package name */
    public final A f109607c;

    public g(d dVar, A a12, A a13) {
        this.f109605a = dVar;
        this.f109606b = a12;
        this.f109607c = a13;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Set<C35975x3> set = (Set) this.f109606b.get();
        Set set2 = (Set) this.f109607c.get();
        this.f109605a.getClass();
        com.google.gson.d dVar = new com.google.gson.d();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            dVar.c((r) it.next());
        }
        for (C35975x3 c35975x3 : set) {
            dVar.b(c35975x3.f319125a, c35975x3.f319126b);
        }
        dVar.f361997l = ToNumberPolicy.f361982d;
        return dVar.a();
    }
}
