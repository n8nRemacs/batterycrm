package com.avito.android.di.module;

import com.avito.android.deep_linking.links.MainScreenLink;
import lv.C43834a;

/* compiled from: MainScreenLinkHandlerModule_ProvideMainScreenLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class H5 implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final G5 f143984a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.home.v f143985b;

    public H5(G5 g52, com.avito.android.home.v vVar) {
        this.f143984a = g52;
        this.f143985b = vVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.home.v vVar = this.f143985b;
        this.f143984a.getClass();
        return new C43834a(MainScreenLink.class, null, new C43834a.b.C11809b(vVar));
    }
}
