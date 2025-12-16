package com.avito.android.multi_message_send.di;

import com.avito.android.C34161r;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import z20.C50359a;

/* compiled from: MultiMessageSendFeaturesModule_ProvideMultiMessageSendFeaturesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<C50359a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C34161r> f206681a;

    public l(Provider<C34161r> provider) {
        this.f206681a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f206681a.get();
        j.f206679a.getClass();
        return (C50359a) c34161r.f246393a.b(C50359a.class);
    }
}
