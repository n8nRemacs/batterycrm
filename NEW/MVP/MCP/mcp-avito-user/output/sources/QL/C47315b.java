package qL;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacDialerNewGsmCallBlockerImpl_Factory.java */
@e
@y
@x
/* renamed from: qL.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47315b implements h<C47314a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<RK.a> f429193a;

    public C47315b(Provider<RK.a> provider) {
        this.f429193a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C47314a(this.f429193a.get());
    }
}
