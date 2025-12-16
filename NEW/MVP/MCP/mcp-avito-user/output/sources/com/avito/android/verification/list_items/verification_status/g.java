package com.avito.android.verification.list_items.verification_status;

import com.avito.android.deep_linking.links.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationStatusItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<w> f324878a;

    public g(Provider<w> provider) {
        this.f324878a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f324878a.get());
    }
}
