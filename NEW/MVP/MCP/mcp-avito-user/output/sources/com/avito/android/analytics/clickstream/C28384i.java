package com.avito.android.analytics.clickstream;

import java.util.Collections;
import java.util.Set;
import kotlin.collections.B0;

/* compiled from: ClickStreamCommonModule_ProvideEventValidatorsFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.analytics.clickstream.i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28384i implements dagger.internal.h<Set<X>> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f89804a;

    public C28384i(dagger.internal.u uVar) {
        this.f89804a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.I i12 = (com.avito.android.I) this.f89804a.get();
        C28379d c28379d = C28379d.f89781a;
        Set setSingleton = i12.i().invoke().booleanValue() ? Collections.singleton(new S()) : B0.f406639b;
        dagger.internal.t.d(setSingleton);
        return setSingleton;
    }
}
