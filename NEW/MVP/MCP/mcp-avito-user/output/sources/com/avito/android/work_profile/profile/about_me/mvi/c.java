package com.avito.android.work_profile.profile.about_me.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: AboutMeActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.work_profile.domain.j> f330789a;

    /* renamed from: b, reason: collision with root package name */
    public final u f330790b;

    public c(u uVar, Provider provider) {
        this.f330789a = provider;
        this.f330790b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f330789a.get(), (Set) this.f330790b.get());
    }
}
