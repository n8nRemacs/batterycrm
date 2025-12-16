package KN;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FiltersCalendarPickerInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f9440a;

    public h(Provider<com.avito.android.server_time.f> provider) {
        this.f9440a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f9440a.get());
    }
}
