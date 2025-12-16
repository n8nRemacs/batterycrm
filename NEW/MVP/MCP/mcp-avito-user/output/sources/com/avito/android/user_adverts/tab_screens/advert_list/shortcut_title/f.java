package com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title;

import android.content.res.Resources;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ShortcutTitleItemDecorator_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f314782a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f314783b;

    public f(dagger.internal.l lVar, Provider provider) {
        this.f314782a = lVar;
        this.f314783b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Resources) this.f314782a.f393949a, this.f314783b.get());
    }
}
