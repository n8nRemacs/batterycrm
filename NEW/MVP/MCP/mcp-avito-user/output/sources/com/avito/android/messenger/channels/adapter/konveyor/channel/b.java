package com.avito.android.messenger.channels.adapter.konveyor.channel;

import com.avito.android.C30277e1;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ChannelItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final j f186837a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C30277e1> f186838b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<JY.a> f186839c;

    public b(j jVar, Provider provider, Provider provider2) {
        this.f186837a = jVar;
        this.f186838b = provider;
        this.f186839c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f186837a.get(), this.f186838b.get(), this.f186839c.get());
    }
}
