package com.avito.android.verification.inn.list.text;

import com.avito.android.deep_linking.links.w;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TextItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<w> f324112a;

    public f(Provider<w> provider) {
        this.f324112a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f324112a.get());
    }
}
