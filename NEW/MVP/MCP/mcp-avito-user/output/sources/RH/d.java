package Rh;

import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinListItemComponentFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f14562a;

    /* renamed from: b, reason: collision with root package name */
    public final l f14563b;

    public d(l lVar, Provider provider) {
        this.f14562a = provider;
        this.f14563b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.deeplink_handler.handler.composite.a) this.f14563b.f393949a, this.f14562a.get());
    }
}
