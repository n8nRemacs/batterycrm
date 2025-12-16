package com.avito.android.authorization.select_profile;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.y;
import ie.InterfaceC41389a;
import javax.inject.Provider;

/* compiled from: SelectProfileInteractorImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f94330a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC41389a> f94331b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f94332c;

    public h(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f94330a = lVar;
        this.f94331b = provider;
        this.f94332c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((String) this.f94330a.f393949a, dagger.internal.g.a(dagger.internal.w.a(this.f94331b)), this.f94332c.get());
    }
}
