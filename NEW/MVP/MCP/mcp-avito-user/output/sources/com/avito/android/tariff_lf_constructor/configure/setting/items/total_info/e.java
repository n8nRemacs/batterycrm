package com.avito.android.tariff_lf_constructor.configure.setting.items.total_info;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConstructorSettingTotalInfoItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f300156a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f300157b;

    public e(u uVar, Provider provider) {
        this.f300156a = uVar;
        this.f300157b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((f) this.f300156a.get(), this.f300157b.get());
    }
}
