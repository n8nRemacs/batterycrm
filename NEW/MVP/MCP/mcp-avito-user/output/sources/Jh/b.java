package Jh;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinAttributedTextPairComponentFactory_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<C14197a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f9100a;

    public b(Provider<com.avito.android.util.text.a> provider) {
        this.f9100a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C14197a(this.f9100a.get());
    }
}
