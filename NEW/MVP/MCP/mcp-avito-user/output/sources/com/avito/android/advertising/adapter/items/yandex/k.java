package com.avito.android.advertising.adapter.items.yandex;

import Db.InterfaceC13381a;
import com.avito.android.C30828i;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: YandexPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f87751a;

    /* renamed from: b, reason: collision with root package name */
    public final u f87752b;

    /* renamed from: c, reason: collision with root package name */
    public final u f87753c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.h f87754d;

    public k(dagger.internal.f fVar, u uVar, u uVar2, dagger.internal.h hVar) {
        this.f87751a = fVar;
        this.f87752b = uVar;
        this.f87753c = uVar2;
        this.f87754d = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j(dagger.internal.g.b(this.f87751a), (C30828i) this.f87752b.get(), (InterfaceC13381a) this.f87753c.get(), (com.avito.android.advertising.a) this.f87754d.get());
    }
}
