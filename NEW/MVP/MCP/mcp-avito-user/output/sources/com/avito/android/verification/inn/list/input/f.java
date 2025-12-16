package com.avito.android.verification.inn.list.input;

import com.avito.android.deep_linking.links.w;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InputItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<w> f324052a;

    /* renamed from: b, reason: collision with root package name */
    public final u f324053b;

    public f(u uVar, Provider provider) {
        this.f324052a = provider;
        this.f324053b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f324052a.get(), (com.avito.android.util.text.a) this.f324053b.get());
    }
}
