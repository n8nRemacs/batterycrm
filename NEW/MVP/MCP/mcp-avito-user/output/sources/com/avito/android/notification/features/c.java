package com.avito.android.notification.features;

import com.avito.android.C34161r;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NotificationFeaturesModule_ProvideNotificationFeaturesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C34161r> f207434a;

    public c(Provider<C34161r> provider) {
        this.f207434a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f207434a.get();
        b.f207433a.getClass();
        return (a) c34161r.f246393a.b(a.class);
    }
}
