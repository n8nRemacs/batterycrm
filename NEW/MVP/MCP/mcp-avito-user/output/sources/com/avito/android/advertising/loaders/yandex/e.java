package com.avito.android.advertising.loaders.yandex;

import Db.InterfaceC13381a;
import android.content.Context;
import com.avito.android.C30828i;
import com.avito.android.permissions.u;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import rb.InterfaceC47628b;

/* compiled from: YandexBannerLoaderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f88511a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f88512b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C30828i> f88513c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC13381a> f88514d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<u> f88515e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f88516f;

    public e(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f88511a = provider;
        this.f88512b = provider2;
        this.f88513c = provider3;
        this.f88514d = provider4;
        this.f88515e = provider5;
        this.f88516f = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f88511a.get(), this.f88512b.get(), this.f88513c.get(), this.f88514d.get(), this.f88515e.get(), (InterfaceC47628b) this.f88516f.get());
    }
}
