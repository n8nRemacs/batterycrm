package com.avito.android.blueprints.radiogroup;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: RadioGroupSelectItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f106560a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f106561b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<l<SimpleTestGroupWithNone>> f106562c;

    public b(u uVar, Provider provider, Provider provider2) {
        this.f106560a = uVar;
        this.f106561b = provider;
        this.f106562c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f106560a.get(), this.f106561b.get(), this.f106562c.get());
    }
}
