package o7;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsTravelItemShownTracker_Factory.java */
@e
@y
@x
/* renamed from: o7.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C44596b implements h<C44595a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f419396a;

    public C44596b(Provider<InterfaceC28373a> provider) {
        this.f419396a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C44595a(this.f419396a.get());
    }
}
