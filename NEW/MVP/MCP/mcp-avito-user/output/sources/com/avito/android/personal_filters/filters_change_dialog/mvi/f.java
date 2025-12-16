package com.avito.android.personal_filters.filters_change_dialog.mvi;

import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import e70.InterfaceC39961a;
import javax.inject.Provider;

/* compiled from: PersonalFiltersChangeDialogActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e70.g> f215750a;

    /* renamed from: b, reason: collision with root package name */
    public final u f215751b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f215752c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f215753d;

    public f(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f215750a = provider;
        this.f215751b = uVar;
        this.f215752c = provider2;
        this.f215753d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f215750a.get(), (InterfaceC39961a) this.f215751b.get(), this.f215752c.get(), this.f215753d.get());
    }
}
