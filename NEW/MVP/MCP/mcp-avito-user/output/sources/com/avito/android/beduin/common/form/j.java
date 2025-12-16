package com.avito.android.beduin.common.form;

import Gh.C13880a;
import Ui.InterfaceC15523b;
import ci.InterfaceC27197a;
import cj.InterfaceC27205c;
import cj.InterfaceC27207e;
import com.avito.android.beduin.di.K;
import dagger.internal.x;
import dagger.internal.y;
import ej.InterfaceC40113b;
import gj.C40692c;
import javax.inject.Provider;
import mj.InterfaceC44087a;
import oj.InterfaceC44784a;
import qj.InterfaceC47406a;

/* compiled from: ComponentsFormImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f103360a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.form.store.b> f103361b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f103362c;

    /* renamed from: d, reason: collision with root package name */
    public final K f103363d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f103364e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC27207e> f103365f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC27205c> f103366g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.f f103367h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC44087a> f103368i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.l f103369j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.l f103370k;

    public j(dagger.internal.f fVar, Provider provider, dagger.internal.f fVar2, K k12, dagger.internal.f fVar3, Provider provider2, Provider provider3, dagger.internal.f fVar4, Provider provider4, dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f103360a = fVar;
        this.f103361b = provider;
        this.f103362c = fVar2;
        this.f103363d = k12;
        this.f103364e = fVar3;
        this.f103365f = provider2;
        this.f103366g = provider3;
        this.f103367h = fVar4;
        this.f103368i = provider4;
        this.f103369j = lVar;
        this.f103370k = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((InterfaceC40113b) this.f103360a.get(), this.f103361b.get(), (InterfaceC15523b) this.f103362c.get(), (InterfaceC47406a) this.f103363d.get(), (InterfaceC27197a) this.f103364e.get(), this.f103365f.get(), this.f103366g.get(), (InterfaceC44784a) this.f103367h.get(), this.f103368i.get(), (C13880a) this.f103369j.f393949a, (C40692c) this.f103370k.f393949a);
    }
}
