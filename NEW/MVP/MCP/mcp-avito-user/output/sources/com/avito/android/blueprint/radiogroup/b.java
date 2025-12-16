package com.avito.android.blueprint.radiogroup;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: PublishRadioGroupSelectItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f105634a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f105635b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<l<SimpleTestGroupWithNone>> f105636c;

    public b(u uVar, Provider provider, Provider provider2) {
        this.f105634a = uVar;
        this.f105635b = provider;
        this.f105636c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f105634a.get(), this.f105635b.get(), this.f105636c.get());
    }
}
