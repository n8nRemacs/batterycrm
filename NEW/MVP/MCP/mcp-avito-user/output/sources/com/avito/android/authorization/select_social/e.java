package com.avito.android.authorization.select_social;

import Sm0.C15204c;
import Sm0.InterfaceC15202a;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.social.M;
import dagger.internal.x;
import dagger.internal.y;
import java.util.List;
import javax.inject.Provider;

/* compiled from: SelectSocialInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f94531a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC27663a> f94532b;

    /* renamed from: c, reason: collision with root package name */
    public final C15204c f94533c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<M> f94534d;

    public e(dagger.internal.l lVar, Provider provider, C15204c c15204c, Provider provider2) {
        this.f94531a = lVar;
        this.f94532b = provider;
        this.f94533c = c15204c;
        this.f94534d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((List) this.f94531a.f393949a, this.f94532b.get(), (InterfaceC15202a) this.f94533c.get(), this.f94534d.get());
    }
}
