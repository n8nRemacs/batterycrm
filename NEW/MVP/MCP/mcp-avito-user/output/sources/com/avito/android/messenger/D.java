package com.avito.android.messenger;

import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.messenger.di.C32502t1;

/* compiled from: MessengerEntityConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class D implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f186143a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f186144b;

    /* renamed from: c, reason: collision with root package name */
    public final C32502t1 f186145c;

    /* renamed from: d, reason: collision with root package name */
    public final C30713g1 f186146d;

    public D(dagger.internal.u uVar, dagger.internal.f fVar, C32502t1 c32502t1, C30713g1 c30713g1) {
        this.f186143a = uVar;
        this.f186144b = fVar;
        this.f186145c = c32502t1;
        this.f186146d = c30713g1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C((q0) this.f186143a.get(), (com.avito.android.deep_linking.x) this.f186144b.get(), (C31667x) this.f186145c.get(), (C30277e1) this.f186146d.get());
    }
}
