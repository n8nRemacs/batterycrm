package com.yandex.div.core.dagger;

import com.yandex.div.core.K;

/* compiled from: Div2ViewModule_ProvideStateSwitcherFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class l implements dagger.internal.h<B21.e> {

    /* renamed from: a, reason: collision with root package name */
    public final K f367414a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f367415b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f367416c;

    public l(K k12, dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f367414a = k12;
        this.f367415b = uVar;
        this.f367416c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        boolean zBooleanValue = ((Boolean) this.f367414a.get()).booleanValue();
        int i12 = k.f367413a;
        return (B21.e) (zBooleanValue ? this.f367416c : this.f367415b).get();
    }
}
