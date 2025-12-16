package com.avito.android.recall_me.splitter.features;

import com.avito.android.C34161r;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RecallMeFeaturesModule_ProvideRecallMeFeaturesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C34161r> f252040a;

    public d(Provider<C34161r> provider) {
        this.f252040a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f252040a.get();
        c.f252039a.getClass();
        return (a) c34161r.f246393a.b(a.class);
    }
}
