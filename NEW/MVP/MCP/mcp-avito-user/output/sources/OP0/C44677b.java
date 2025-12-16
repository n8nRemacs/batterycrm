package oP0;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WalletPinVerificationAnalytics_Factory.java */
@e
@y
@x
/* renamed from: oP0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44677b implements h<C44676a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f419759a;

    public C44677b(Provider<InterfaceC28373a> provider) {
        this.f419759a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C44676a(this.f419759a.get());
    }
}
