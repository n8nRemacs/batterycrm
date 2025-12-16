package com.avito.android.phones_actualization.deep_linking;

import com.avito.android.account.E;
import com.avito.android.remote.InterfaceC34258d;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Calendar;
import javax.inject.Provider;

/* compiled from: ActualizePhonesStatusInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final q f216209a;

    /* renamed from: b, reason: collision with root package name */
    public final b f216210b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC34258d> f216211c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<E> f216212d;

    public m(q qVar, b bVar, Provider provider, Provider provider2) {
        this.f216209a = qVar;
        this.f216210b = bVar;
        this.f216211c = provider;
        this.f216212d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((o) this.f216209a.get(), (Calendar) this.f216210b.get(), dagger.internal.g.b(this.f216211c), dagger.internal.g.b(this.f216212d));
    }
}
