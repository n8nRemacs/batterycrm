package com.avito.android.messenger.conversation.mvi.voice;

import android.app.Application;
import com.avito.android.C30277e1;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: VoicePlayerPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class q0 implements dagger.internal.h<a0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Application> f195185a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f195186b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<P> f195187c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.channels.mvi.data.f0> f195188d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<LY.b> f195189e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f195190f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<C30277e1> f195191g;

    public q0(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f195185a = provider;
        this.f195186b = provider2;
        this.f195187c = provider3;
        this.f195188d = provider4;
        this.f195189e = provider5;
        this.f195190f = lVar;
        this.f195191g = provider6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a0(this.f195185a.get(), this.f195186b.get(), this.f195187c.get(), this.f195188d.get(), this.f195189e.get(), (String) this.f195190f.f393949a, this.f195191g.get());
    }
}
