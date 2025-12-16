package com.avito.android.screens.bbip_private.ui.items.header;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BbipPrivateHeaderItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f260870a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f260871b;

    public c(u uVar, Provider provider) {
        this.f260870a = uVar;
        this.f260871b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f260870a.get(), this.f260871b.get());
    }
}
