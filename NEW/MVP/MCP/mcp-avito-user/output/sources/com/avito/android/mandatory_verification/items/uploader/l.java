package com.avito.android.mandatory_verification.items.uploader;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MandatoryVerificationUploaderItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f184706a;

    public l(Provider<R0> provider) {
        this.f184706a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f184706a.get());
    }
}
