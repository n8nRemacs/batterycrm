package com.avito.android.advertising.adapter.items.mytarget;

import Db.InterfaceC13381a;
import com.avito.android.C30828i;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MyTargetPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f87636a;

    /* renamed from: b, reason: collision with root package name */
    public final u f87637b;

    /* renamed from: c, reason: collision with root package name */
    public final u f87638c;

    /* renamed from: d, reason: collision with root package name */
    public final u f87639d;

    public m(dagger.internal.f fVar, u uVar, u uVar2, u uVar3) {
        this.f87636a = fVar;
        this.f87637b = uVar;
        this.f87638c = uVar2;
        this.f87639d = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l(dagger.internal.g.b(this.f87636a), (com.avito.android.advertising.loaders.f) this.f87637b.get(), (C30828i) this.f87638c.get(), (InterfaceC13381a) this.f87639d.get());
    }
}
