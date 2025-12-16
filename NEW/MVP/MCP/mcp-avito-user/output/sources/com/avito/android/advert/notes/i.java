package com.avito.android.advert.notes;

import com.avito.android.util.InterfaceC35745a5;
import fa.InterfaceC40383a;
import javax.inject.Provider;

/* compiled from: EditAdvertNoteInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40383a> f80912a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f80913b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f80914c;

    public i(Provider<InterfaceC40383a> provider, Provider<InterfaceC35745a5> provider2, Provider<com.avito.android.remote.error.f> provider3) {
        this.f80912a = provider;
        this.f80913b = provider2;
        this.f80914c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f80912a.get(), this.f80913b.get(), this.f80914c.get());
    }
}
