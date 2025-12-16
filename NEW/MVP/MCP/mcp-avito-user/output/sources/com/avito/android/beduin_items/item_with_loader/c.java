package com.avito.android.beduin_items.item_with_loader;

import bj.InterfaceC25659b;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinItemWithLoaderBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f105264a;

    /* renamed from: b, reason: collision with root package name */
    public final u f105265b;

    /* renamed from: c, reason: collision with root package name */
    public final u f105266c;

    public c(u uVar, u uVar2, Provider provider) {
        this.f105264a = provider;
        this.f105265b = uVar;
        this.f105266c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f105264a.get(), (InterfaceC25659b) this.f105265b.get(), (InterfaceC35745a5) this.f105266c.get());
    }
}
