package com.avito.android.messenger.channels.adapter.konveyor.iac_problem_banner;

import com.avito.android.C30277e1;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ur.InterfaceC49101b;

/* compiled from: ChannelsIacProblemBannerBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f186932a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C30277e1> f186933b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC49101b> f186934c;

    public b(f fVar, Provider provider, Provider provider2) {
        this.f186932a = fVar;
        this.f186933b = provider;
        this.f186934c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f186932a.get(), this.f186933b.get(), this.f186934c.get());
    }
}
