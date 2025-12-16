package com.avito.android.safety.safety_settings.domain;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import io0.InterfaceC42082a;
import javax.inject.Provider;

/* compiled from: SafetySettingsInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC42082a> f257633a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f257634b;

    /* renamed from: c, reason: collision with root package name */
    public final l f257635c;

    public c(l lVar, Provider provider, Provider provider2) {
        this.f257633a = provider;
        this.f257634b = provider2;
        this.f257635c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f257633a.get(), this.f257634b.get(), (String) this.f257635c.f393949a);
    }
}
