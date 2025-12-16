package com.avito.android.advert.icebreakerseditor;

import Zf.InterfaceC19551a;
import javax.inject.Provider;

/* compiled from: IcebreakersEditorInteractor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC19551a> f71230a;

    public h(Provider<InterfaceC19551a> provider) {
        this.f71230a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f71230a.get());
    }
}
