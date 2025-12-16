package com.avito.android.messenger.conversation.mvi.voice;

import android.app.Application;
import com.avito.android.C30277e1;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: LegacyVoicePlayerPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.conversation.mvi.voice.z, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32330z implements dagger.internal.h<C32306a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Application> f195215a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f195216b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<P> f195217c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.w0> f195218d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC32024m> f195219e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f195220f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<C30277e1> f195221g;

    public C32330z(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f195215a = provider;
        this.f195216b = provider2;
        this.f195217c = provider3;
        this.f195218d = provider4;
        this.f195219e = provider5;
        this.f195220f = lVar;
        this.f195221g = provider6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C32306a(this.f195215a.get(), this.f195216b.get(), this.f195217c.get(), this.f195218d.get(), this.f195219e.get(), (String) this.f195220f.f393949a, this.f195221g.get());
    }
}
