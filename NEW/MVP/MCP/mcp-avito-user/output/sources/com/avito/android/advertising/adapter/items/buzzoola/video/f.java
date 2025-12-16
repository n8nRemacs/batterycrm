package com.avito.android.advertising.adapter.items.buzzoola.video;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CommercialVideoBigBorderlessBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f87557a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.player_holder.a> f87558b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f87559c;

    public f(u uVar, Provider provider, Provider provider2) {
        this.f87557a = uVar;
        this.f87558b = provider;
        this.f87559c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((j) this.f87557a.get(), this.f87558b.get(), this.f87559c.get());
    }
}
