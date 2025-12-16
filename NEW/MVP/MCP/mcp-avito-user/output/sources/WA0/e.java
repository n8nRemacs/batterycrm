package Wa0;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: WalletBalanceFormatter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Locale> f17958a;

    public e(Provider<Locale> provider) {
        this.f17958a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f17958a.get());
    }
}
