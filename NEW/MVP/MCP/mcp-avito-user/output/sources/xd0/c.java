package Xd0;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StartVerificationDelegateImpl_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<C16993b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f18991a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.details.a> f18992b;

    /* renamed from: c, reason: collision with root package name */
    public final u f18993c;

    public c(u uVar, u uVar2, Provider provider) {
        this.f18991a = uVar;
        this.f18992b = provider;
        this.f18993c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C16993b((com.avito.android.deeplink_handler.handler.composite.a) this.f18991a.get(), this.f18992b.get(), (d) this.f18993c.get());
    }
}
