package com.avito.android.beduin.context.di;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;

/* compiled from: BeduinCustomActionHandlerWithContextModule_ProvideCustomActionHandlerStoreFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final l f103584a;

    public g(l lVar) {
        this.f103584a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Set set = (Set) this.f103584a.f393949a;
        f.f103583a.getClass();
        Set<gj.f> set2 = set;
        int iF2 = P0.f(C42745f0.q(set2, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (gj.f fVar : set2) {
            linkedHashMap.put(fVar.f396755a, fVar.f396756b);
        }
        return new h(linkedHashMap);
    }
}
