package sb0;

import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReplacePhoneInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f437737a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f437738b;

    public g(Provider<InterfaceC34401z0> provider, Provider<InterfaceC35745a5> provider2) {
        this.f437737a = provider;
        this.f437738b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f437737a.get(), this.f437738b.get());
    }
}
