package com.avito.android.language_selector.domain;

import aR.InterfaceC19809a;
import com.avito.android.account.E;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import jJ.InterfaceC42261a;
import jJ.InterfaceC42262b;
import javax.inject.Provider;
import ur.InterfaceC49101b;

/* compiled from: LanguageSyncUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f174927a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC42262b> f174928b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC42261a> f174929c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<E> f174930d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f174931e;

    /* renamed from: f, reason: collision with root package name */
    public final ur.e f174932f;

    public i(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, ur.e eVar) {
        this.f174927a = uVar;
        this.f174928b = provider;
        this.f174929c = provider2;
        this.f174930d = provider3;
        this.f174931e = provider4;
        this.f174932f = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((InterfaceC19809a) this.f174927a.get(), this.f174928b.get(), this.f174929c.get(), this.f174930d.get(), this.f174931e.get(), (InterfaceC49101b) this.f174932f.get());
    }
}
