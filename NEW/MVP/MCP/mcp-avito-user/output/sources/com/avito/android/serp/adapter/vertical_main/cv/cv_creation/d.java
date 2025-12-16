package com.avito.android.serp.adapter.vertical_main.cv.cv_creation;

import com.avito.android.J0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CvCreationItemConverter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<J0> f272755a;

    public d(Provider<J0> provider) {
        this.f272755a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f272755a.get());
    }
}
