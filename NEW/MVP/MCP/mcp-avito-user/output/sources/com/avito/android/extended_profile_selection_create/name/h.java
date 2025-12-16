package com.avito.android.extended_profile_selection_create.name;

import com.avito.android.remote.D0;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSetSelectionNameInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<D0> f151881a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Gson> f151882b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f151883c;

    /* renamed from: d, reason: collision with root package name */
    public final l f151884d;

    public h(l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f151881a = provider;
        this.f151882b = provider2;
        this.f151883c = provider3;
        this.f151884d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(dagger.internal.g.b(this.f151881a), dagger.internal.g.b(this.f151882b), this.f151883c.get(), (ExtendedProfileSetSelectionNameConfig) this.f151884d.f393949a);
    }
}
