package com.avito.android.bxcontent.mvi;

import javax.inject.Provider;
import ur.InterfaceC49101b;

/* compiled from: BxContentViewStateBuilderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class d1 implements dagger.internal.h<c1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49101b> f111781a;

    public d1(Provider<InterfaceC49101b> provider) {
        this.f111781a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c1(this.f111781a.get());
    }
}
