package com.avito.android.beduin.di.module;

import com.avito.android.beduin.ui.screen.home_tab.HomeTabBeduinScreenLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;
import xi.C49949b;
import xi.C49950c;

/* compiled from: BeduinDeeplinkHandlerModule_ProvideHomeTabBeduinScreenLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C49949b f103945a;

    public d(C49949b c49949b) {
        this.f103945a = c49949b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C49949b c49949b = this.f103945a;
        a.f103942a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(HomeTabBeduinScreenLink.class, new C49950c(), new C43834a.b.C11809b(c49949b));
    }
}
