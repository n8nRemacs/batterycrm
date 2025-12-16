package com.avito.android.extended_profile_adverts;

import com.avito.android.analytics.screens.Screen;
import com.avito.android.remote.model.SearchParams;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileAdvertsTabBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f150884a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Screen> f150885b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f150886c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f150887d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f150888e;

    public m(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4, Provider provider) {
        this.f150884a = lVar;
        this.f150885b = provider;
        this.f150886c = lVar2;
        this.f150887d = lVar3;
        this.f150888e = lVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((String) this.f150884a.f393949a, this.f150885b.get(), ((Boolean) this.f150886c.f393949a).booleanValue(), (String) this.f150887d.f393949a, (SearchParams) this.f150888e.f393949a);
    }
}
