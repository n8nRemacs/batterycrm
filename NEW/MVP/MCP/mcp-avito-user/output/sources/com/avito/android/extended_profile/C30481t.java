package com.avito.android.extended_profile;

import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: ExtendedProfileInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.extended_profile.t, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30481t implements dagger.internal.h<C30480s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.remote.N> f150529a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile.converter.g> f150530b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f150531c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile.location.a> f150532d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f150533e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile_ux_feedback.b> f150534f;

    public C30481t(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f150529a = provider;
        this.f150530b = provider2;
        this.f150531c = provider3;
        this.f150532d = provider4;
        this.f150533e = uVar;
        this.f150534f = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30480s(dagger.internal.g.b(this.f150529a), this.f150530b.get(), this.f150531c.get(), this.f150532d.get(), (SearchParamsConverter) this.f150533e.get(), this.f150534f.get());
    }
}
