package com.avito.android.blueprints.publish.multiselect;

import com.avito.android.Q1;
import com.avito.android.util.InterfaceC35807h4;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RdsMultiselectItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f106361a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f106362b;

    /* renamed from: c, reason: collision with root package name */
    public final u f106363c;

    public h(u uVar, u uVar2, Provider provider) {
        this.f106361a = uVar;
        this.f106362b = provider;
        this.f106363c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.util.text.a) this.f106361a.get(), this.f106362b.get(), (Q1) this.f106363c.get());
    }
}
