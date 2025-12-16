package EL;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacCallRequestInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.iac_incoming_call_ability.impl_module.api.a> f3935a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f3936b;

    public c(Provider<com.avito.android.iac_incoming_call_ability.impl_module.api.a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f3935a = provider;
        this.f3936b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f3935a.get(), this.f3936b.get());
    }
}
