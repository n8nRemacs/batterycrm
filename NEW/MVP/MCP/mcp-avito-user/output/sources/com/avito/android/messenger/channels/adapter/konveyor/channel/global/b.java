package com.avito.android.messenger.channels.adapter.konveyor.channel.global;

import com.avito.android.C30277e1;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ChannelItemBlueprintGlobal_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f186856a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C30277e1> f186857b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<JY.a> f186858c;

    public b(f fVar, Provider provider, Provider provider2) {
        this.f186856a = fVar;
        this.f186857b = provider;
        this.f186858c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f186856a.get(), this.f186857b.get(), this.f186858c.get());
    }
}
