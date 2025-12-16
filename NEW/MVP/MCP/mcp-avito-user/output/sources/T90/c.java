package t90;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileProAnalyticsTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f439177a;

    public c(Provider<InterfaceC28373a> provider) {
        this.f439177a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f439177a.get());
    }
}
