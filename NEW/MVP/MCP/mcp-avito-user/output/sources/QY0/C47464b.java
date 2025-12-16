package qy0;

import AK0.l;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TooltipStorage_Factory.java */
@e
@y
@x
/* renamed from: qy0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47464b implements h<C47463a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f429537a;

    public C47464b(Provider<l> provider) {
        this.f429537a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C47463a(this.f429537a.get());
    }
}
