package com.avito.android.profile_settings_extended.phones;

import com.avito.android.C30277e1;
import com.avito.android.profile_settings_extended.P;
import com.avito.android.util.O3;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSettingsPhonesInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f230798a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<P> f230799b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C30277e1> f230800c;

    /* renamed from: d, reason: collision with root package name */
    public final O3 f230801d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f230802e;

    public c(u uVar, Provider provider, Provider provider2, O3 o32, Provider provider3) {
        this.f230798a = uVar;
        this.f230799b = provider;
        this.f230800c = provider2;
        this.f230801d = o32;
        this.f230802e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f230798a.get();
        P p12 = this.f230799b.get();
        C30277e1 c30277e1 = this.f230800c.get();
        this.f230801d.getClass();
        return new b(dVar, p12, c30277e1, O3.a(), this.f230802e.get());
    }
}
