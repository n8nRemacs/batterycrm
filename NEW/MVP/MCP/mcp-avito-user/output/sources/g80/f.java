package g80;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: PhotoItemGroupsImagesGroupsTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f396344a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C50213a> f396345b;

    public f(Provider<InterfaceC28373a> provider, Provider<C50213a> provider2) {
        this.f396344a = provider;
        this.f396345b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f396344a.get(), this.f396345b.get());
    }
}
