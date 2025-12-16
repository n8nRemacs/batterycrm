package mH;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigSlotAnalyticsSender_Factory.java */
@e
@y
@x
/* renamed from: mH.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C43965d implements h<C43964c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f414444a;

    public C43965d(Provider<InterfaceC28373a> provider) {
        this.f414444a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C43964c(this.f414444a.get());
    }
}
