package mZ;

import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UpdateUnreadCounterLauncherImpl_Factory.java */
@e
@y
@x
/* renamed from: mZ.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C44032b implements h<C44031a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.messenger_unread_counter.impl_module.b> f414574a;

    public C44032b(Provider<com.avito.android.messenger_unread_counter.impl_module.b> provider) {
        this.f414574a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C44031a(g.b(this.f414574a));
    }
}
