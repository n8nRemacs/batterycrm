package com.avito.android.validation;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvideSelectItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.validation.h0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36011h0 implements dagger.internal.h<com.avito.android.blueprints.select.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.select.c> f319379a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f319380b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f319381c;

    public C36011h0(Provider<com.avito.android.blueprints.select.c> provider, Provider<com.avito.android.util.text.a> provider2, Provider<u3.l<SimpleTestGroupWithNone>> provider3) {
        this.f319379a = provider;
        this.f319380b = provider2;
        this.f319381c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.select.c cVar = this.f319379a.get();
        com.avito.android.util.text.a aVar = this.f319380b.get();
        u3.l<SimpleTestGroupWithNone> lVar = this.f319381c.get();
        A.f319242a.getClass();
        return new com.avito.android.blueprints.select.a(cVar, aVar, lVar);
    }
}
