package sb0;

import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RemovePhoneInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: sb0.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C48149d implements dagger.internal.h<C48148c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f437733a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f437734b;

    public C48149d(Provider<InterfaceC34401z0> provider, Provider<InterfaceC35745a5> provider2) {
        this.f437733a = provider;
        this.f437734b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C48148c(this.f437733a.get(), this.f437734b.get());
    }
}
