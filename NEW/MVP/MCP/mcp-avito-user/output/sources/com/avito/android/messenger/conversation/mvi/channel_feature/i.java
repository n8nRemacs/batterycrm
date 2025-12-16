package com.avito.android.messenger.conversation.mvi.channel_feature;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ChannelFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f189725a;

    /* renamed from: b, reason: collision with root package name */
    public final k f189726b;

    /* renamed from: c, reason: collision with root package name */
    public final m f189727c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f189728d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<String> f189729e;

    public i(f fVar, k kVar, m mVar, Provider provider, Provider provider2) {
        this.f189725a = fVar;
        this.f189726b = kVar;
        this.f189727c = mVar;
        this.f189728d = provider;
        this.f189729e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f189725a.get();
        this.f189726b.getClass();
        j jVar = new j();
        this.f189727c.getClass();
        l lVar = new l();
        R0 r02 = this.f189728d.get();
        String str = this.f189729e.get();
        MY.g.f10751h.getClass();
        return new h("Chat" + str.hashCode(), MY.g.f10752i, new g(aVar, lVar, jVar, r02));
    }
}
