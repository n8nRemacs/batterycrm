package com.avito.android.profile.user_profile.uxf;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PrivateProfileFeedbackHelper_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SK0.b> f226595a;

    public c(Provider<SK0.b> provider) {
        this.f226595a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f226595a.get());
    }
}
