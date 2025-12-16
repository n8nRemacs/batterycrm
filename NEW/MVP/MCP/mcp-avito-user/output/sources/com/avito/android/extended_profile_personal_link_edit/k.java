package com.avito.android.extended_profile_personal_link_edit;

import com.avito.android.remote.D0;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PersonalLinkEditInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<D0> f151506a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f151507b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Gson> f151508c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f151509d;

    public k(Provider<D0> provider, Provider<R0> provider2, Provider<Gson> provider3, Provider<InterfaceC35863o4> provider4) {
        this.f151506a = provider;
        this.f151507b = provider2;
        this.f151508c = provider3;
        this.f151509d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(dagger.internal.g.a(w.a(this.f151506a)), this.f151507b.get(), dagger.internal.g.a(w.a(this.f151508c)), this.f151509d.get());
    }
}
