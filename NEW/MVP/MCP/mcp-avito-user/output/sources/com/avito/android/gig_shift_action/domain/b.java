package com.avito.android.gig_shift_action.domain;

import android.content.res.Resources;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import rG.InterfaceC47539a;

/* compiled from: GigShiftActionInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC47539a> f160458a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.gig_snippet.a> f160459b;

    /* renamed from: c, reason: collision with root package name */
    public final u f160460c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f160461d;

    public b(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f160458a = provider;
        this.f160459b = provider2;
        this.f160460c = uVar;
        this.f160461d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f160458a.get(), this.f160459b.get(), (Resources) this.f160460c.get(), this.f160461d.get());
    }
}
