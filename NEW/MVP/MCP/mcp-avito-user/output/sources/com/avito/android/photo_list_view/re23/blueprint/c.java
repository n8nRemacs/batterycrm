package com.avito.android.photo_list_view.re23.blueprint;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: PublishPhotoItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f218186a;

    /* renamed from: b, reason: collision with root package name */
    public final u f218187b;

    /* renamed from: c, reason: collision with root package name */
    public final u f218188c;

    /* renamed from: d, reason: collision with root package name */
    public final u f218189d;

    public c(u uVar, u uVar2, u uVar3, Provider provider) {
        this.f218186a = provider;
        this.f218187b = uVar;
        this.f218188c = uVar2;
        this.f218189d = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f218186a.get(), (com.avito.android.util.text.a) this.f218187b.get(), (g80.d) this.f218188c.get(), (l) this.f218189d.get());
    }
}
