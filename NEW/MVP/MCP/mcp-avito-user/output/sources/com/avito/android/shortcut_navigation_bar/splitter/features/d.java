package com.avito.android.shortcut_navigation_bar.splitter.features;

import com.avito.android.C34161r;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ShortcutBarInternalFeaturesModule_ProvideShortcutBarInternalFeaturesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C34161r> f283561a;

    public d(Provider<C34161r> provider) {
        this.f283561a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f283561a.get();
        c.f283560a.getClass();
        return (a) c34161r.f246393a.b(a.class);
    }
}
