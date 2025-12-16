package com.avito.android.delayed_ux_feedback;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lD.C43617a;

/* compiled from: RemoteFeedbackHelperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SK0.b> f134744a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C43617a> f134745b;

    public g(Provider<SK0.b> provider, Provider<C43617a> provider2) {
        this.f134744a = provider;
        this.f134745b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f134744a.get(), this.f134745b.get());
    }
}
