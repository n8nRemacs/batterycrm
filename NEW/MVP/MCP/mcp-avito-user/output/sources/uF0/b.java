package Uf0;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gg0.InterfaceC40678b;
import javax.inject.Provider;

/* compiled from: OnNewTokenPushServiceDelegateImpl_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class b implements h<C15515a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.push.impl_module.token.sending.short_task.c> f16543a;

    /* renamed from: b, reason: collision with root package name */
    public final u f16544b;

    public b(u uVar, Provider provider) {
        this.f16543a = provider;
        this.f16544b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C15515a(this.f16543a.get(), (InterfaceC40678b) this.f16544b.get());
    }
}
