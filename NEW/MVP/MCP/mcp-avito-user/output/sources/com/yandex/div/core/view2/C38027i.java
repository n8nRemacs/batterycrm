package com.yandex.div.core.view2;

/* compiled from: Div2Builder_Factory.java */
@dagger.internal.e
/* renamed from: com.yandex.div.core.view2.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38027i implements dagger.internal.h<C38026h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f369116a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f369117b;

    public C38027i(dagger.internal.f fVar, dagger.internal.u uVar) {
        this.f369116a = uVar;
        this.f369117b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C38026h((P) this.f369116a.get(), (C38040w) this.f369117b.get());
    }
}
