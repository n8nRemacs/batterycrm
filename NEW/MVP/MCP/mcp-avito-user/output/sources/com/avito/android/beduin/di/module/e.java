package com.avito.android.beduin.di.module;

import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: BeduinDeeplinkHandlerModule_ProvideUniversalPageDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.beduin.ui.b f103946a;

    public e(com.avito.android.beduin.ui.b bVar) {
        this.f103946a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.beduin.ui.b bVar = this.f103946a;
        a.f103942a.getClass();
        return new C43834a(BeduinUniversalPageLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(BeduinUniversalPageLink.class), bVar));
    }
}
