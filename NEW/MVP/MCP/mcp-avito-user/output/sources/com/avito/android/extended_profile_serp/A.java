package com.avito.android.extended_profile_serp;

import androidx.fragment.app.Fragment;
import com.avito.android.search.filter.InterfaceC34598u;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSerpRouterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class A implements dagger.internal.h<C30562z> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f152436a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f152437b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC34598u> f152438c;

    public A(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider) {
        this.f152436a = lVar;
        this.f152437b = lVar2;
        this.f152438c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C30562z((Fragment) this.f152436a.f393949a, (Y41.l) this.f152437b.f393949a, this.f152438c.get());
    }
}
