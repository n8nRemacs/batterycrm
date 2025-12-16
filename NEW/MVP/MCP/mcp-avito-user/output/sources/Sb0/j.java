package sb0;

import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SetPhoneForAllInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f437741a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f437742b;

    public j(Provider<InterfaceC34401z0> provider, Provider<InterfaceC35745a5> provider2) {
        this.f437741a = provider;
        this.f437742b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f437741a.get(), this.f437742b.get());
    }
}
