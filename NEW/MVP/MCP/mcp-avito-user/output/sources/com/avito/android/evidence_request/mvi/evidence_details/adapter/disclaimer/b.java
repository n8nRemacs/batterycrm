package com.avito.android.evidence_request.mvi.evidence_details.adapter.disclaimer;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DisclaimerBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f148765a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f148766b;

    public b(Provider<c> provider, Provider<com.avito.android.util.text.a> provider2) {
        this.f148765a = provider;
        this.f148766b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f148765a.get(), this.f148766b.get());
    }
}
