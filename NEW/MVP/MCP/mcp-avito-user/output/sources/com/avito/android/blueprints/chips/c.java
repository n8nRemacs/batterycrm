package com.avito.android.blueprints.chips;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: ChipsSelectItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f105845a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f105846b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<l<SimpleTestGroupWithNone>> f105847c;

    public c(u uVar, Provider provider, Provider provider2) {
        this.f105845a = uVar;
        this.f105846b = provider;
        this.f105847c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f105845a.get(), this.f105846b.get(), this.f105847c.get());
    }
}
