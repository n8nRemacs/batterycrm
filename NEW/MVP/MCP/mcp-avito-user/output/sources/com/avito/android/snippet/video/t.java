package com.avito.android.snippet.video;

import com.avito.android.J0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SnippetVideoStateFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<J0> f284038a;

    public t(Provider<J0> provider) {
        this.f284038a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s(this.f284038a.get());
    }
}
