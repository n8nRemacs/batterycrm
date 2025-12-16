package com.avito.android.profile_settings_basic.adapter.basic_info;

import Hb0.InterfaceC13947a;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BasicInfoItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f228629a;

    /* renamed from: b, reason: collision with root package name */
    public final u f228630b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f228631c;

    public j(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f228629a = lVar;
        this.f228630b = uVar;
        this.f228631c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((Y41.l) this.f228629a.f393949a, (InterfaceC13947a) this.f228630b.get(), this.f228631c.get());
    }
}
