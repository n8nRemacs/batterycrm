package com.avito.android.extended_profile_widgets.adapter.about_v2;

import android.app.Activity;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AboutV2ItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f154177a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Boolean> f154178b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f154179c;

    public b(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f154177a = uVar;
        this.f154178b = provider;
        this.f154179c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f154177a.get(), this.f154178b.get().booleanValue(), (Activity) this.f154179c.f393949a);
    }
}
