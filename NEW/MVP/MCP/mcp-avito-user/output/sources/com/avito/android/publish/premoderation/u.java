package com.avito.android.publish.premoderation;

import androidx.view.InterfaceC23487e;
import com.avito.android.remote.model.adverts.AdvertProactiveModerationResult;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WrongCategoryViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC23487e> f238343a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f238344b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f238345c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f238346d;

    public u(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, Provider provider) {
        this.f238343a = provider;
        this.f238344b = lVar;
        this.f238345c = lVar2;
        this.f238346d = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new t(this.f238343a.get(), (AdvertProactiveModerationResult.WrongCategorySuggest) this.f238344b.f393949a, (String) this.f238345c.f393949a, (r) this.f238346d.f393949a);
    }
}
