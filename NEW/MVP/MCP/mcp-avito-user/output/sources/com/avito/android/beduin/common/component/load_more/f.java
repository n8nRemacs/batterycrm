package com.avito.android.beduin.common.component.load_more;

import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.g;
import com.avito.android.beduin.common.i;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import di.C39730b;
import javax.inject.Provider;

/* compiled from: BeduinLoadMoreViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final i f101736a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.form.store.b> f101737b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f101738c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f101739d;

    /* renamed from: e, reason: collision with root package name */
    public final C39730b f101740e;

    public f(i iVar, Provider provider, dagger.internal.f fVar, Provider provider2, C39730b c39730b) {
        this.f101736a = iVar;
        this.f101737b = provider;
        this.f101738c = fVar;
        this.f101739d = provider2;
        this.f101740e = c39730b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((g) this.f101736a.get(), this.f101737b.get(), (InterfaceC15523b) this.f101738c.get(), this.f101739d.get(), (lj.c) this.f101740e.get());
    }
}
